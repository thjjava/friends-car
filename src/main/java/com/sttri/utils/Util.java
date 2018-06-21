package com.sttri.utils;

import java.text.DecimalFormat;

public class Util {

	/**
	 * 创建店铺编号
	 * @param areaCode
	 * @param lastShopNo
	 * @return 区域编号+4位序列号
	 */
	public static String createShopNo(String areaCode,String lastShopNo){
		String str = lastShopNo.substring(4,8);
		int i = Integer.parseInt(str);
		++i;
		DecimalFormat decimalFormat = new DecimalFormat("0000");
		return areaCode+decimalFormat.format(i);
	}
	
	/**
	 * 创建订单编号
	 * @param lastOrderNo
	 * @return 10000开始的序列号
	 */
	public static String createOrderNo(String lastOrderNo){
		int i = Integer.parseInt(lastOrderNo);
		++i;
		DecimalFormat decimalFormat = new DecimalFormat("00000");
		return decimalFormat.format(i);
	}
	
	/**
     * 元转换成分
     * @param money
     * @return
     */
    public static String getMoney(String amount) {
        if(amount==null){
            return "";
        }
        // 金额转化为分为单位
        String currency =  amount.replaceAll("\\$|\\￥|\\,", "");  //处理包含, ￥ 或者$的金额  
        int index = currency.indexOf(".");  
        int length = currency.length();  
        Long amLong = 0l;  
        if(index == -1){  
            amLong = Long.valueOf(currency+"00");  
        }else if(length - index >= 3){  
            amLong = Long.valueOf((currency.substring(0, index+3)).replace(".", ""));  
        }else if(length - index == 2){  
            amLong = Long.valueOf((currency.substring(0, index+2)).replace(".", "")+0);  
        }else{  
            amLong = Long.valueOf((currency.substring(0, index+1)).replace(".", "")+"00");  
        }  
        return amLong.toString(); 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(createShopNo("3101", "31010001"));
		System.out.println(getMoney("100.5"));
	}

}
