package com.dong.service;

import java.util.List;

import com.dong.entity.Product;

public interface ProductService {
	 //1.分页展示所有商品信息
		List<Product> queryAllPro(int index);
     //2.查询商品总页数
		int queryCount();
	 //3.通过ID查询商品信息
		Product queryById(int id);
}
