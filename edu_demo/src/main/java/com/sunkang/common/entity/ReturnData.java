package com.sunkang.common.entity;
/**
 * json返回参数实体
 * @ClassName: ReturnData 
 * @Description: TODO
 * @author: sunkang
 * @date: 2017-3-30 下午5:12:30
 */
public class ReturnData {
	/**
	 * 类型  （成功，失败
	 */
	protected String type;
	
	/**
	 * 返回数据
	 */
	protected Object data;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
	public ReturnData(String type, Object data) {
		super();
		this.type = type;
		this.data = data;
	}
	public ReturnData() {
		super();
	}
	
	
}
