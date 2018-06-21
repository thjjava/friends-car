package com.sttri.wxpay;

import java.io.InputStream;

import com.github.wxpay.sdk.WXPayConfig;

public class MyPayConfig implements WXPayConfig {
	private String appID;
	private String mchID;
	private String key;
	private InputStream certStream;
	private int httpConnectTimeoutMs;
	private int httpReadTimeoutMs;
	
	public MyPayConfig(){}
	
	public MyPayConfig(String appID,String mchID,String key,InputStream certStream,int httpConnectTimeoutMs,int httpReadTimeoutMs){
		this.appID = appID;
		this.mchID = mchID;
		this.key = key;
		this.certStream = certStream;
		this.httpConnectTimeoutMs = httpConnectTimeoutMs;
		this.httpReadTimeoutMs = httpReadTimeoutMs;
	}
	
	public String getAppID() {
		return appID;
	}
	public void setAppID(String appID) {
		this.appID = appID;
	}
	public String getMchID() {
		return mchID;
	}
	public void setMchID(String mchID) {
		this.mchID = mchID;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public InputStream getCertStream() {
		return certStream;
	}
	public void setCertStream(InputStream certStream) {
		this.certStream = certStream;
	}
	public int getHttpConnectTimeoutMs() {
		return httpConnectTimeoutMs;
	}
	public void setHttpConnectTimeoutMs(Integer httpConnectTimeoutMs) {
		this.httpConnectTimeoutMs = httpConnectTimeoutMs;
	}
	public int getHttpReadTimeoutMs() {
		return httpReadTimeoutMs;
	}
	public void setHttpReadTimeoutMs(Integer httpReadTimeoutMs) {
		this.httpReadTimeoutMs = httpReadTimeoutMs;
	}
	

}
