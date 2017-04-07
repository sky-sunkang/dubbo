package com.sunkang.common.entity;

import java.util.List;

public class PageData {
	/**
	 * 总数
	 */
	private Integer total;
	
	/**
	 * 数据
	 */
	private List<?> rows;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	

}
