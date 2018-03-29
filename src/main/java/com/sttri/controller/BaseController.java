package com.sttri.controller;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;


/**
 * @description：基础 controller
 * @author：thj
 */
public abstract class BaseController {
    // 控制器本来就是单例，这样似乎更加合理
    protected Logger logger =  LoggerFactory.getLogger(getClass());

 // 覆盖spring的Date,String解析
 	@InitBinder
 	public void initBinder(WebDataBinder dataBinder) {
 		dataBinder.registerCustomEditor(String.class, new PropertyEditorSupport() {
 			public void setAsText(String value) {
 				try {
 					if (value != null) {
 						setValue(value.trim());
 					} else {
 						setValue(null);
 					}
 				} catch (Exception e) {
 					setValue(null);
 				}
 			}
 		});
 		dataBinder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
 			public void setAsText(String value) {
 				try {
 					if (StringUtils.isNotBlank(value)) {
 						setValue(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(value));
 					} else {
 						setValue(null);
 					}
 				} catch (ParseException e) {
 					setValue(null);
 				}
 			}
 		});
 	}


}
