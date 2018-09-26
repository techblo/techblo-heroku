package com.example.techblo.techblo;

import org.springframework.stereotype.Component;

@Component
public class BlogDetails {

	private String blogName;
	private String tech;
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
}
