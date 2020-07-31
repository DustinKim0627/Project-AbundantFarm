package com.farm.web.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SellerApply {
	private int id; 
	private String title; 
	private String content; 
	private String comName;  
	private int brn;  
	private String repName;   
	private String staffName; 
	private String phone; 
	private String telephone;
	private String email; 
	private String files;  
	private String sellingUrl; 
	private int item; 
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date regDate;  
	private Date appDate;
	private String titleImage;
	
	public SellerApply() {
		// TODO Auto-generated constructor stub
	}

	public SellerApply(int id, String title, String content, String comName, int brn, String repName, String staffName,
			String phone, String telephone, String email, String files, String sellingUrl, int item, Date regDate,
			Date appDate, String titleImage) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.comName = comName;
		this.brn = brn;
		this.repName = repName;
		this.staffName = staffName;
		this.phone = phone;
		this.telephone = telephone;
		this.email = email;
		this.files = files;
		this.sellingUrl = sellingUrl;
		this.item = item;
		this.regDate = regDate;
		this.appDate = appDate;
		this.titleImage = titleImage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public int getBrn() {
		return brn;
	}

	public void setBrn(int brn) {
		this.brn = brn;
	}

	public String getRepName() {
		return repName;
	}

	public void setRepName(String repName) {
		this.repName = repName;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}

	public String getSellingUrl() {
		return sellingUrl;
	}

	public void setSellingUrl(String sellingUrl) {
		this.sellingUrl = sellingUrl;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getAppDate() {
		return appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public String getTitleImage() {
		return titleImage;
	}

	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}

	@Override
	public String toString() {
		return "SellerApply [id=" + id + ", title=" + title + ", content=" + content + ", comName=" + comName + ", brn="
				+ brn + ", repName=" + repName + ", staffName=" + staffName + ", phone=" + phone + ", telephone="
				+ telephone + ", email=" + email + ", files=" + files + ", sellingUrl=" + sellingUrl + ", item=" + item
				+ ", regDate=" + regDate + ", appDate=" + appDate + ", titleImage=" + titleImage + "]";
	}


	
}
