package com.dong.service;

import java.util.List;

import com.dong.entity.Product;

public interface ProductService {
	 //1.��ҳչʾ������Ʒ��Ϣ
		List<Product> queryAllPro(int index);
     //2.��ѯ��Ʒ��ҳ��
		int queryCount();
	 //3.ͨ��ID��ѯ��Ʒ��Ϣ
		Product queryById(int id);
}
