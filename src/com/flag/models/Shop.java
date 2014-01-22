package com.flag.models;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;

public class Shop extends GenericJson {
	public static final String EXTRA_SHOP_ID = "com.flag.models.extra.shop.id";

	@Key
	@JsonString
	private Long id;

	@Key
	private String name;

	@Key
	private String imageUrl;

	@Key
	private int type;

	@Key
	private String description;

	@Key
	private int reward1;

	@Key
	private int reward2;
	
	@Key
	private int sign;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReward1() {
		return reward1;
	}

	public void setReward1(int reward1) {
		this.reward1 = reward1;
	}

	public int getReward2() {
		return reward2;
	}

	public void setReward2(int reward2) {
		this.reward2 = reward2;
	}

	public int getSign() {
		return sign;
	}

	public void setSign(int sign) {
		this.sign = sign;
	}
}
