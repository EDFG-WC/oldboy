package com.boynextdoor.oldfaggot.entity;

public class Page {

	private int pageNum;
	private int pageSize;

	public Page() {
		super();
	}

	public Page(int pageNum, int pageSize) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "Page{" +
				"pageNum=" + pageNum +
				", pageSize=" + pageSize +
				'}';
	}
}
