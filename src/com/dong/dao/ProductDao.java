package com.dong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dong.entity.Product;

public interface ProductDao {
	    //1.��ѯ������Ʒ��Ϣ
		List<Product> SelectAllByIndex(@Param("begin")int begin,@Param("end")int end);
		//2.ͨ��id��ѯ��Ʒ��Ϣ
		Product SelectById(int id);
		//3.��ѯ��Ʒ����
		int SelectCount();
}
