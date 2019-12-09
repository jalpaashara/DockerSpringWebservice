package com.info.shows.model;

public class Cast {
	private int castId;
	private String name;
	private String character;
	private String country;
	private String gender;
	private String birthday;
	
	public Cast() {
		super();
	}

	public Cast(int castId, String name, String character, String country, String gender, String birthday) {
		this.castId = castId;
		this.name = name;
		this.character = character;
		this.country = country;
		this.gender = gender;
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Cast [castId=" + castId + ", name=" + name + ", character=" + character + ", country=" + country
				+ ", gender=" + gender + ", birthday=" + birthday + "]";
	}

	public int getCastId() {
		return castId;
	}

	public void setCastId(int castId) {
		this.castId = castId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	

}
