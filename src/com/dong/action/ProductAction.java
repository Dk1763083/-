package com.dong.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dong.entity.Product;
import com.dong.service.ProductService;
import com.dong.service.ProductServiceImpl;

public class ProductAction{
	private ProductService ps=new ProductServiceImpl();
	private HttpSession session = ServletActionContext.getRequest().getSession();
	private List<Product> ListP;
	private Product pro;
	private Integer id;
	private Integer index=1;
	private Integer count;
	private String ProductName;
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public List<Product> getListP() {
		return ListP;
	}
	public void setListP(List<Product> listP) {
		ListP = listP;
	}
	public Product getPro() {
		return pro;
	}
	public void setPro(Product pro) {
		this.pro = pro;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	//1.查询所有商品
	public String QueryAllPro(){		
		ListP = ps.queryAllPro(index);
		count = ps.queryCount();
		return "ProView.jsp";
	}
	//2.添加商品到购物车
	public String AddProduct(){
		Map<Integer,Integer> pis=(Map<Integer, Integer>) session.getAttribute("pis");
		if(pis==null){	
				pis = new HashMap<Integer,Integer>();
				session.setAttribute("pis", pis);
		}
		Product p = ps.queryById(id);
		ProductName = p.getProductName();
		if(pis.containsKey(id)){
			pis.put(id, (pis.get(id)+1));
		}else{
			pis.put(id, 1);
		}
		return "AddCarSuccess.jsp";
	}
	//3.购物车
	public String ShopCar(){
		Map<Integer,Integer> pis = (Map<Integer, Integer>) session.getAttribute("pis");
		if(pis!=null){
			ListP = new ArrayList<Product>();
			Set<Entry<Integer,Integer>> entrys = pis.entrySet();
			for(Entry<Integer,Integer> e: entrys){
				pro = ps.queryById(e.getKey());
				ListP.add(pro);
			}
		}
		return "ShopcarView.jsp";
	}
	//4.从购物车移除商品
	public String DropProduct(){
		Map<Integer,Integer> pis = (Map<Integer, Integer>) session.getAttribute("pis");
		pis.remove(id);	
		return "Shoppcar";
	}
	//5.添加商品个数
	public String Add(){
		Map<Integer,Integer> pis = (Map<Integer, Integer>) session.getAttribute("pis");
		pis.put(id, (pis.get(id)+1));
		return "Shopcar";
	}
	//6.减少商品个数
	public String Reduce(){
		Map<Integer,Integer> pis = (Map<Integer, Integer>) session.getAttribute("pis");
		pis.put(id, (pis.get(id)-1));
		if(pis.get(id)==0){
			pis.remove(id);
		}
		return "Shopcar";
	}
}