package jp.co.rakus.ecommerce_b.form;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import jp.co.rakus.ecommerce_b.domain.OrderItem;
import jp.co.rakus.ecommerce_b.domain.User;

/**
 * orderを詰めるためのform.
 * 
 * @author yuya.nishikiori
 *
 */
public class OrderForm {

	/**
	 * 注文ID
	 */
	private Integer id;

	/**
	 * ユーザーID
	 */
	private Integer userId;

	/**
	 * 状態
	 */
	private Integer status;

	/**
	 * 合計金額
	 */
	private Integer totalPrice;

	/**
	 * 注文
	 */
	private Date orderDate;

	/**
	 * 宛先氏名
	 */
	private String destinationEmail;

	/**
	 * 宛先Email
	 */
	private String destinationName;
	
	/**
	 * 宛先郵便番号
	 */
	private String destinationZipcode;

	/**
	 * 宛先住所
	 */
	private String destinationAddress;

	/**
	 * 宛先TEL
	 */
	private String destinationTel;

	/**
	 * 配達時間
	 */
	private Timestamp deliverlyTime;

	/**
	 * 支払方法
	 */
	private Integer paymentMethod;

	/**
	 * ユーザー
	 */
	private User user;

	/**
	 * 注文商品のリスト
	 */
	private List<OrderItem> orderItemList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	
	public String getDestinationEmail() {
		return destinationEmail;
	}

	public void setDestinationEmail(String destinationEmail) {
		this.destinationEmail = destinationEmail;
	}

	public String getDestinationZipcode() {
		return destinationZipcode;
	}

	public void setDestinationZipcode(String destinationZipcode) {
		this.destinationZipcode = destinationZipcode;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public String getDestinationTel() {
		return destinationTel;
	}

	public void setDestinationTel(String destinationTel) {
		this.destinationTel = destinationTel;
	}

	public Timestamp getDeliverlyTime() {
		return deliverlyTime;
	}

	public void setDeliverlyTime(Timestamp deliverlyTime) {
		this.deliverlyTime = deliverlyTime;
	}

	public Integer getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(Integer paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}
	
	
}
