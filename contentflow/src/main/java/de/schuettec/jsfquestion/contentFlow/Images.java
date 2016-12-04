package de.schuettec.jsfquestion.contentFlow;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Images {

	private List<String> images;

	@PostConstruct
	public void init() {
		images = new ArrayList<String>();
		images.add("img-01.png");
		images.add("img-02.png");
	}

	public List<String> getImages() {
		return images;
	}
}