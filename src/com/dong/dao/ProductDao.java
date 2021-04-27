package com.dong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dong.entity.Product;

public interface ProductDao {
	    //1.查询所有商品信息
		List<Product> SelectAllByIndex(@Param("begin")int begin,@Param("end")int end);
		//2.通过id查询商品信息
		Product SelectById(int id);
		//3.查询商品总数
		int SelectCount();
}
