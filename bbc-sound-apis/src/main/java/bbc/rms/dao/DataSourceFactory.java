package bbc.rms.dao;

import org.springframework.stereotype.Service;

@Service
public class DataSourceFactory {

	public DataSource getDataSource(String source) {
		if(source.equals("static")) {
			return new StaticDataSource();
		} else {
			// can return any other data source here
			return new StaticDataSource();
		}
	}
}
