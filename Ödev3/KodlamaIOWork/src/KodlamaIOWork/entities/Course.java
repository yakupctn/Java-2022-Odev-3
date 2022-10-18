package KodlamaIOWork.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName;
	private int price;
	
	
	public Course(String courseName, int price) {
		super();
		this.courseName = courseName;
		this.price = price;
	}
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

