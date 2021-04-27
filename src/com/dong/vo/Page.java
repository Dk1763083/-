package com.dong.vo;

public class Page {
	//������
	private int Count;
   public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	//��ҳ��
	private int pageCount;
	//ÿҳչʾ������
	private int pageSize = 2;
	//ҳ��
	private int pageIndex = 1;
	
	//��beginҳ��
	public int pageBegin(){
		return (pageIndex-1)*pageSize+1;
	}
	//��endҳ��
	public int pageEnd(){
		return pageIndex*pageSize;
	}
	//��ҳ��
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