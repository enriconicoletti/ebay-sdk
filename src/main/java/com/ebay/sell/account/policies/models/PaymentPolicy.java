package com.ebay.sell.account.policies.models;

import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentPolicy {

	private String name;
	private String marketplaceId;
	private List<PolicyCategoryType> categoryTypes = new LinkedList<>();
	private String paymentPolicyId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarketplaceId() {
		return marketplaceId;
	}

	public void setMarketplaceId(String marketplaceId) {
		this.marketplaceId = marketplaceId;
	}

	public List<PolicyCategoryType> getCategoryTypes() {
		return categoryTypes;
	}

	public void setCategoryTypes(List<PolicyCategoryType> categoryTypes) {
		this.categoryTypes = categoryTypes;
	}

	public String getPaymentPolicyId() {
		return paymentPolicyId;
	}

	public void setPaymentPolicyId(String paymentPolicyId) {
		this.paymentPolicyId = paymentPolicyId;
	}

}
