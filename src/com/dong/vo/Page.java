package com.dong.vo;

public class Page {
	//总条数
	private int Count;
   public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	//总页数
	private int pageCount;
	//每页展示的条数
	private int pageSize = 2;
	//页号
	private int pageIndex = 1;
	
	//求begin页号
	public int pageBegin(){
		return (pageIndex-1)*pageSize+1;
	}
	//求end页号
	public int pageEnd(){
		return pageIndex*pageSize;
	}
	//总页数
	public int pageCount(){
		if(Count%pageSize==0){
			return Count/pageSize;
		}else{
			return Count/pageSize+1;
		}
	}
	public Page(int pageCount, int pageSize, int pageIndex) {
		super();
		this.pageCount = pageCount;
		this.pageSize = pageSize;
		this.pageIndex = pageIndex;
	}
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Page [pageCount=" + pageCount + ", pageSize=" + pageSize + ", pageIndex=" + pageIndex + "]";
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	
	}