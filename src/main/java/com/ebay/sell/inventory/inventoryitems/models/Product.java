package com.ebay.sell.inventory.inventoryitems.models;

import java.util.LinkedList;
import java.util.List;

public class Product {

	private String brand;
	private String description;
	private List<String> ean = new LinkedList<String>();
	private List<String> imageUrls = new LinkedList<String>();
	private List<String> isbn = new LinkedList<String>();
	private String mpn;
	private String subtitle;
	private String title;
	private List<String> upc = new LinkedList<String>();

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getEan() {
		return ean;
	}

	public void setEan(List<String> ean) {
		this.ean = ean;
	}

	public List<String> getImageUrls() {
		return imageUrls;
	}

	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;
	}

	public List<String> getIsbn() {
		return isbn;
	}

	public void setIsbn(List<String> isbn) {
		this.isbn = isbn;
	}

	public String getMpn() {
		return mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getUpc() {
		return upc;
	}

	public void setUpc(List<String> upc) {
		this.upc = upc;
	}

}