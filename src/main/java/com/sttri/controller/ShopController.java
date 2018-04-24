package com.sttri.controller;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.sttri.entity.OrderComment;
import com.sttri.entity.OrderCommentCriteria;
import com.sttri.entity.OrderCommentCriteria.Criteria;
import com.sttri.entity.SysArea;
import com.sttri.entity.SysAreaCriteria;
import com.sttri.entity.SysBusiness;
import com.sttri.entity.SysBusinessCriteria;
import com.sttri.entity.SysShop;
import com.sttri.service.IOrderCommentService;
import com.sttri.service.IShopBusinessService;
import com.sttri.service.ISysAreaService;
import com.sttri.service.ISysBusinessService;
import com.sttri.service.ISysShopService;
import com.sttri.utils.R;
import com.sttri.utils.Util;

/**
 * 店铺
 * @author thj
 *
 */
@RestController
@RequestMapping("/sys/shop")
public class ShopController extends BaseController {

	@Autowired
	private ISysShopService sysShopService;
	@Autowired
	private ISysBusinessService sysBusinessService;
	@Autowired
	private IOrderCommentService orderCommentService;
	@Autowired
	private IShopBusinessService shopBusinessService;
	@Autowired
	private ISysAreaService sysAreaService;
	
	
	@RequestMapping("/save")
	public R addShop(@RequestBody SysShop shop){
		if (StringUtils.isEmpty(shop.getShopNo())) {
			return R.error("2001", "店铺名称不能为空");
		}
		String lastShopNo = this.sysShopService.findMaxShopNo();
		SysAreaCriteria example = new SysAreaCriteria();
		example.createCriteria().andCityNameLike(shop.getAddress());
		List<SysArea> areas = this.sysAreaService.selectByExample(example);
		String area_code = "3101";
		if (areas != null && areas.size() > 0) {
			area_code = areas.get(0).getAreaCode();
		}
		String shopNo = Util.createShopNo(area_code, lastShopNo);
		shop.setShopNo(shopNo);
		shop.setRegisterDate(new Date());
		this.sysShopService.insert(shop);
		return R.ok("添加成功");
	}
	
	/**
	 * 根据业务类型，获取支持该业务的所有店铺
	 * @param businessType
	 * @return
	 * http://localhost:8080/friends-car/sys/shop/queryByBusinessType/0  0-businessType
	 */
	@RequestMapping("/queryByBusinessType/{businessType}")
	public R queryByBusinessType(@PathVariable("businessType") int businessType){
		SysBusinessCriteria businessCriteria = new SysBusinessCriteria();
		com.sttri.entity.SysBusinessCriteria.Criteria criteria = businessCriteria.createCriteria();
		criteria.andTypeEqualTo(businessType);
		List<SysBusiness> bList = this.sysBusinessService.selectByExample(businessCriteria);
		if (bList == null || bList.size() ==0) {
			return R.error("3000", "业务不存在");
		}
		List<SysShop> shops = this.sysShopService.queryShopByBusinessType(businessType);
		return R.ok("查询成功").put("shop", shops);
	}
	
	/**
	 * 根据业务类型，获取支持该业务的所有店铺
	 * @param businessType
	 * @return
	 * http://localhost:8080/friends-car/sys/shop/queryByBusinessType?businessType=0 
	 */
	@RequestMapping("/queryByBusinessType")
	public R queryshopsByBusinessType(@RequestParam int businessType){
		SysBusinessCriteria businessCriteria = new SysBusinessCriteria();
		com.sttri.entity.SysBusinessCriteria.Criteria criteria = businessCriteria.createCriteria();
		criteria.andTypeEqualTo(businessType);
		List<SysBusiness> bList = this.sysBusinessService.selectByExample(businessCriteria);
		if (bList == null || bList.size() ==0) {
			return R.error("3000", "业务不存在");
		}
		List<SysShop> shops = this.sysShopService.queryShopByBusinessType(businessType);
		return R.ok("查询成功").put("shop", shops);
	}
	
	/**
	 * 根据shopID获取该店铺的详情，包括有关订单里的评论
	 * @param shopId
	 * @return
	 * http://localhost:8080/friends-car/sys/shop/info/0
	 */
	@RequestMapping("/info/{shopId}")
	public R getShopInfo(@PathVariable("shopId") int shopId){
		logger.info("***getShopInfo_shopId***:"+shopId);
		SysShop shop = this.sysShopService.selectByPrimaryKey(shopId);
		if (shop == null) {
			return R.error("2000", "店铺不存在");
		}
		OrderCommentCriteria example = new OrderCommentCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andShopIdEqualTo(shopId);
		List<OrderComment> ocList = this.orderCommentService.selectByExample(example);
		System.out.println("shop_comments:"+ocList.toString());
		return R.ok("查询成功").put("shop", shop).put("shop_comments", ocList);
	}
	
	@RequestMapping("/upload")  
    public R upload(@RequestParam Integer shopId,HttpServletRequest request,HttpServletResponse response) throws IllegalStateException, IOException { 
        //创建一个通用的多部分解析器  
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());  
        //判断 request 是否有文件上传,即多部分请求  
        if(multipartResolver.isMultipart(request)){  
            //转换成多部分request    
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;  
            //取得request中的所有文件名  
            Iterator<String> iter = multiRequest.getFileNames();  
            while(iter.hasNext()){
                //取得上传文件  
                MultipartFile file = multiRequest.getFile(iter.next());  
                if(file != null){  
                    //取得当前上传文件的文件名称  
                    String myFileName = file.getOriginalFilename();  
                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在  
                    if(myFileName.trim() !=""){  
                        System.out.println(myFileName);  
                        //重命名上传后的文件名  
                        //String fileName = "demoUpload" + file.getOriginalFilename();  
                    	// 得到文件的扩展名(无扩展名时将得到全名)
            			String t_ext = myFileName.substring(myFileName.lastIndexOf(".") + 1);
            			 // 允许上传的文件格式的列表
                		final String allowedExt = "jpg,gif,png,swf,flv,iso,img,ua,mp4,rmvb,txt";
            			// 拒绝接受规定文件格式之外的文件类型
            			if(allowedExt.indexOf(t_ext.toLowerCase())==-1){
            				return R.error();
            			}
            			//保存的具体路径
                		String sFilePath = request.getSession().getServletContext().getContextPath();
                		// 实例化一个硬盘文件工厂,用来配置上传组件ServletFileUpload
                		DiskFileItemFactory dfif = new DiskFileItemFactory();
                		dfif.setSizeThreshold(4096);// 设置上传文件时用于临时存放文件的内存大小,这里是4K.多于的部分将临时存在硬盘
                		String uploadpath ="/uploadfiles/"+Calendar.getInstance().get(Calendar.YEAR)+"-"+(Calendar.getInstance().get(Calendar.MONTH)+1)+"-"+Calendar.getInstance().get(Calendar.DATE);
                		//String uploadpath = "D:/" + fileName;  
                		File localFile = new File(sFilePath+uploadpath+"/"+myFileName);
                		if(!localFile.exists()){
                			localFile.mkdirs();
                		}
                		// 设置存放临时文件的目录,web根目录下的uploadfiles目录
                		dfif.setRepository(localFile);
                        file.transferTo(localFile);  
                        
                        SysShop shop = this.sysShopService.selectByPrimaryKey(shopId);
                        shop.setPicture1(uploadpath);
                        shop.setEdittime(new Date());
                        this.sysShopService.updateByPrimaryKey(shop);
                    }  
                }  
            }  
              
        }  
        return R.ok();
    }
}
