package bbc.rms.dao;

import java.util.List;

import bbc.rms.model.Track;

public interface DataSource {
	public List<Track> getAllTracks();
	public Track createTrack(Track track);
}
