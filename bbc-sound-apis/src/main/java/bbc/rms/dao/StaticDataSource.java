package bbc.rms.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import bbc.rms.model.Track;
import bbc.rms.model.TrackAvailability;
import bbc.rms.model.TrackTitle;

@Service
public class StaticDataSource implements DataSource {

	static List<Track> tracks = new ArrayList<Track>();

	@PostConstruct
	public void setInitialTracks() {
		tracks.add(new Track("nznx3r", "track", "urn:bbc:sounds:track:nznx3r",
							new TrackTitle("AC/DC", "Highway to Hell", null), new TrackAvailability("2019-02-13T11:03:05Z","2019-03-15T11:00:00Z","Available for 29 days")));
		tracks.add(new Track("nznx3d", "track", "urn:bbc:sounds:track:nznx3d",
				new TrackTitle("AC/DC", "Jigsaw", null), new TrackAvailability("2019-03-15T11:03:05Z","2019-03-25T11:00:00Z","Available for 10 days")));
		tracks.add(new Track("nakse", "track", "urn:bbc:sounds:track:nakse",
				new TrackTitle("AC/DC", "The famous", null), new TrackAvailability("2019-02-10T11:03:05Z","2019-03-15T11:00:00Z","Available  35 days")));

	}

	public List<Track> getAllTracks() {
		return tracks;
	}

	public Track createTrack(Track track) {
		tracks.add(track);
		return track;
	}

}
