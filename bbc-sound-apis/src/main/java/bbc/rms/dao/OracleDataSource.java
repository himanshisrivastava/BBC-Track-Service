package bbc.rms.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import bbc.rms.model.Track;

@Service
public class OracleDataSource implements DataSource {

	public List<Track> getAllTracks() {
		// get data from oracle database 
		return new ArrayList<Track>();
	}

	public Track createTrack(Track track) {
		// add code to create a track here
		return null;
	}

}
