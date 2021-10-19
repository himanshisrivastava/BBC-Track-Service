package bbc.rms.service.tracks;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import bbc.rms.dao.DataSource;
import bbc.rms.dao.DataSourceFactory;
import bbc.rms.model.Track;

@Service
public class BBCSoundsTracksService {
	@Autowired
	DataSourceFactory dsf;
	
	@Value("${datasource:static}")
	private String dataSource;
	
	private DataSource ds;
	
	@PostConstruct
	public void setDataSource() {
		ds = dsf.getDataSource(dataSource);
	}
	public List<Track> getAllTracks() {
		return ds.getAllTracks();
	}
	
	public Track createTrack(Track track) {
		Track newTrack = ds.createTrack(track);
		return newTrack;
	}
}
