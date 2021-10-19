package bbc.rms.model;

import java.io.Serializable;

public class TrackAvailability implements Serializable {

	private static final long serialVersionUID = 98148372466031624L;
	
	String from;
	String to;
	String label;
	
	public TrackAvailability() {
	}
	
	public TrackAvailability(String from, String to, String label) {
		super();
		this.from = from;
		this.to = to;
		this.label = label;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	

}
