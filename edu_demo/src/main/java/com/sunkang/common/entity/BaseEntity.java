package com.sunkang.common.entity;
/**
 * 基础实体类
 * @author sunkang
 *
 */
public class BaseEntity {
	
	/**
	 * 当前页数
	 */
	Integer page;
	
	/**
	 * 每页行数
	 */
	Integer rows;
	
	/**
	 * 起始的数据
	 */
	Integer startSize;
	
	

	public Integer getStartSize() {
		return startSize;
	}

	public void setStartSize(Integer startSize) {
		this.startSize = startSize;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	
}
