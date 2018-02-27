package cn.pengyi.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Order {
	
	private String id;
	private Date ordertime;
	private double price;
	private boolean state;
	
	private User user;
	private Set<OrderItem> orderitem = new HashSet<OrderItem>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<OrderItem> getOrderitem() {
		return orderitem;
	}
	public void setOrderitem(Set<OrderItem> orderitem) {
		this.orderitem = orderitem;
	}
	
	
	
	
}
