package com.ete.ecom;

import javax.persistence.Embeddable;

@Embeddable
public class Certification {
	
	    private String courseName;
	    
	    private String courseDuration;

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public String getCourseDuration() {
			return courseDuration;
		}

		public void setCourseDuration(String courseDuration) {
			this.courseDuration = courseDuration;
		}

		public Certification(String courseName, String courseDuration) {
			super();
			this.courseName = courseName;
			this.courseDuration = courseDuration;
		}

		public Certification() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Certification [courseName=" + courseName + ", courseDuration=" + courseDuration + "]";
		}
		
		
	    
	    

}
