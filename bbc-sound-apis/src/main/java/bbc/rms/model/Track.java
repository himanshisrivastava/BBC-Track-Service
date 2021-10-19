package bbc.rms.model;

import java.io.Serializable;

public class Track extends Data implements Serializable {
	
	private static final long serialVersionUID = -7021791976487621490L;
	String id;
	String type;
	String urn;
	TrackTitle title;
	TrackAvailability availability;
	
	public Track() {
	}

	public Track(String id, String type, String urn, TrackTitle title, TrackAvailability availability) {
		this.id = id;
		this.type = type;
		this.urn = urn;
		this.title = title;
		this.availability = availability;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrn() {
		return urn;
	}

	public void setUrn(String urn) {
		this.urn = urn;
	}

	public TrackTitle getTitle() {
		return title;
	}

	public void setTitle(TrackTitle title) {
		this.title = title;
	}

	public TrackAvailability getAvailability() {
		return availability;
	}

	public void setAvailability(TrackAvailability availability) {
		this.availability = availability;
	}

	
	
}
