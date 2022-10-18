package KodlamaIOWork.business;

import java.util.ArrayList;
import java.util.List;

import KodlamaIOWork.core.logging.Logger;
import KodlamaIOWork.dataAccess.CourseDao;
import KodlamaIOWork.entities.Course;

public class CourseManager {
	List <String> courses = new ArrayList<>();
	private CourseDao courseDao;
	private Logger [] loggers;

	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	

	public void add(Course course) throws Exception {
		int size = courses.size();
		
		if(size == 0 && course.getPrice()>0) {
			courses.add(course.getCourseName());
			courseDao.add(course);	
		}
		
		for(int i = 0; i<size-1;i++) {
			if((course.getCourseName().toUpperCase()).equals(courses.get(i).toUpperCase())) {
				throw new Exception("Bu kategori zaten mevcut!!!");
			}else {
				courseDao.add(course);
			}
		}
		
		for(Logger logger:loggers) {
			logger.log(course.getCourseName());
		}
		

	}
}
