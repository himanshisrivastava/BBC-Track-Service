package bbc.rms.model;

import java.io.Serializable;

public class TrackTitle implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	String primary; // This can be made as Date field instead of String
	String secondary;
	String tertiary;
	
	public TrackTitle() {
	}
	
	public TrackTitle(String primary, String secondary, String tertiary) {
		this.primary = primary;
		this.secondary = secondary;
		this.tertiary = tertiary;
	}
	
	public String getPrimary() {
		return primary;
	}
	
	public void setPrimary(String primary) {
		this.primary = primary;
	}
	public String getSecondary() {
		return secondary;
	}
	public void setSecondary(String secondary) {
		this.secondary = secondary;
	}
	public String getTertiary() {
		return tertiary;
	}
	public void setTertiary(String tertiary) {
		this.tertiary = tertiary;
	}
}
