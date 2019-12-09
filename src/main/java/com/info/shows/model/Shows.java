package com.info.shows.model;

import java.util.List;

import com.info.shows.model.Cast;

public class Shows {
	private int showId;
	private String name;
	private String type;
	private String language;
	private String status;
	private int runtime;
	private String premiered;
	private String network;
	private String officialWebSite;
	private String summary;
	private List<Cast> cast;
	
	public Shows() {
		super();
	}
	
	public Shows(int showId, String name, String type, String language, String status, int runtime, String premiered,
			String network, String officialWebSite, String summary, List<Cast> cast) {
		this.showId = showId;
		this.name = name;
		this.type = type;
		this.language = language;
		this.status = status;
		this.runtime = runtime;
		this.premiered = premiered;
		this.network = network;
		this.officialWebSite = officialWebSite;
		this.summary = summary;
		this.cast = cast;
	}
	
	@Override
	public String toString() {
		return "Shows [showId=" + showId + ", name=" + name + ", type=" + type + ", language=" + language + ", status="
				+ status + ", runtime=" + runtime + ", premiered=" + premiered + ", network=" + network
				+ ", officialWebSite=" + officialWebSite + ", summary=" + summary + ", cast=" + cast + "]";
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public String getPremiered() {
		return premiered;
	}

	public void setPremiered(String premiered) {
		this.premiered = premiered;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getOfficialWebSite() {
		return officialWebSite;
	}

	public void setOfficialWebSite(String officialWebSite) {
		this.officialWebSite = officialWebSite;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public List<Cast> getCast() {
		return cast;
	}

	public void setCast(List<Cast> cast) {
		this.cast = cast;
	}
	
	
	

}
