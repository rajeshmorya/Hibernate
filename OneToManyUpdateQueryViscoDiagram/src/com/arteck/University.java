package com.arteck;

import java.util.Set;

public class University {

		private Integer universityid;
		private String universityname;
		private Set childern;
		public Integer getUniversityid() {
			return universityid;
		}
		public void setUniversityid(Integer universityid) {
			this.universityid = universityid;
		}
		public String getUniversityname() {
			return universityname;
		}
		public void setUniversityname(String universityname) {
			this.universityname = universityname;
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
