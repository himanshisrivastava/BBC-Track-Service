package bbc.rms.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import bbc.rms.model.Track;
import bbc.rms.service.tracks.BBCSoundsTracksService;

public class BBCSoundsTracks {

	// All tests for track service to be added
	// datasource can be mocked
	
	@Test
	public void testGetAllTracks() {
		BBCSoundsTracksService serv = new BBCSoundsTracksService();
		List<Track> allTracks = serv.getAllTracks();
		Assert.assertEquals(allTracks.size(), 6);
	}


}
