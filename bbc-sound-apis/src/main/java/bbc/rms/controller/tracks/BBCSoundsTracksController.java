package bbc.rms.controller.tracks;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bbc.rms.model.Track;
import bbc.rms.service.tracks.BBCSoundsTracksService;

@RestController
@RequestMapping("/bbc/rms/tracks")
public class BBCSoundsTracksController {

	@Autowired
	private BBCSoundsTracksService bbcSoundTrackService;
	@RequestMapping("/v1")
	public ResponseEntity<List<Track>> getAllTracks() {
		ResponseEntity<List<Track>> res;
		List<Track> allTracks = null;
		try {
			allTracks = bbcSoundTrackService.getAllTracks();
			
			// Instead of returning the List of tracks we can return APIResponse object which will have generic structure
			
			res= new ResponseEntity<List<Track>>(allTracks, HttpStatus.OK);
	
		} catch(Exception e) {
//			return new ResponseEntity<APIResponse>(new APIResponse(new ArrayList<Data>(),"Tracks could not be fetched"), HttpStatus.INTERNAL_SERVER_ERROR);
			return new ResponseEntity<List<Track>>(new ArrayList<Track>(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return res;
	}
	
	@RequestMapping(value = "/v1", method= RequestMethod.POST)
	public ResponseEntity<Track> createTrack(@RequestBody Track track, @RequestHeader(value="x-api-key") String token) {
		ResponseEntity<Track> res;
		try {
			if(token == null) {
				return new ResponseEntity(HttpStatus.FORBIDDEN);
			}
			res= new ResponseEntity<Track>(bbcSoundTrackService.createTrack(track), HttpStatus.OK);
			
		} catch(Exception e) {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return res;
	}
	
}
