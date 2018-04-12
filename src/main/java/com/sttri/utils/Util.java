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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(createShopNo("3101", "31010001"));
	}

}
