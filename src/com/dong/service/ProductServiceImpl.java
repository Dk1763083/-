package com.dong.service;

import java.util.List;

import com.dong.dao.ProductDao;
import com.dong.entity.Product;
import com.dong.service.ProductService;
import com.dong.util.MyBatisUtil;
import com.dong.vo.Page;

public class ProductServiceImpl implements ProductService{
	    
//1.��ҳչʾ������Ʒ��Ϣ
	public List<Product> queryAllPro(int index) {
		ProductDao pd = MyBatisUtil.getMapper(ProductDao.class);
		try{	
			   Page page = new Page();
			page.setPageIndex(index);			
			List<Product> pro = pd.SelectAllByIndex(page.pageBegin(), page.pageEnd());
			return pro;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			MyBatisUtil.close();
		}
	}
//2.��ѯ��Ʒ��ҳ��
	public int queryCount() {
		ProductDao pd = MyBatisUtil.getMapper(ProductDao.class);
		try{
			Page page = new Page();
			int count = pd.SelectCount();
			page.setCount(count);
			int pages = page.pageCount();
			return pages;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			MyBatisUtil.close();
		}
	}
//3.ͨ��ID��ѯ��Ʒ��Ϣ
	public Product queryById(int id) {
		ProductDao pd = MyBatisUtil.getMapper(ProductDao.class);
		try{			
			Product p = pd.SelectById(id);
			return p;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			MyBatisUtil.close();
		}
	}
}

