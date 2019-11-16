package com.youtube.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.youtube.model.Videos;
import com.youtube.dao.VideoDAOImpl;
import com.youtube.dao.VideoDAO;
import com.youtube.model.Channels;


public class VideoServiceImpl implements VideoDAO{

	  @Autowired
	  public VideoDAO videoDao;
	  
	  public void register(Videos video) {
	    videoDao.register(video);
	  }

	  public Videos validateUser(Channels channel) {
	    return videoDao.validateUser(channel);
	  }
	  
	  public HashMap<String,Integer> dataCategories(List<String> countries) {
		  VideoDAOImpl tdCat = new VideoDAOImpl();
		    return tdCat.Query4(countries);
		  }

}
