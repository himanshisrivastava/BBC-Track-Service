package bbc.rms.model;

import java.io.Serializable;
import java.util.List;

public class APIResponse implements Serializable {
	
	private static final long serialVersionUID = 7734938543698649626L;
	List<? extends Data> data;
	String error;
	public APIResponse(List<? extends Data> data, String error) {
		super();
		this.data = data;
		this.error = error;
	}
}
