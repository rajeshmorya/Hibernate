package com.arteck;

import java.util.Set;

public class Blogpost {

		private Integer blogpostid;
		private String blogpostname;
		private Set childern;
		public Integer getBlogpostid() {
			return blogpostid;
		}
		public void setBlogpostid(Integer blogpostid) {
			this.blogpostid = blogpostid;
		}
		public String getBlogpostname() {
			return blogpostname;
		}
		public void setBlogpostname(String blogpostname) {
			this.blogpostname = blogpostname;
		}
		public Set getchildern() 
		{
			return childern;
		}
		public void setchildern(Set childern) 
		{
			this.childern = childern;
		}
}
