package com.demo.test;

public class AddSubDemo {
	
	// 编号
	private String cid;
	
	// 用户名
	private String name;
	
	/**
	 * 默认构造
	 */
	public AddSubDemo(){}
	
	/**
	 * 有参构造
	 * @param cid
	 * @param name
	 */
	public AddSubDemo(String cid,String name){
		this.cid = cid;
		this.name = name;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
