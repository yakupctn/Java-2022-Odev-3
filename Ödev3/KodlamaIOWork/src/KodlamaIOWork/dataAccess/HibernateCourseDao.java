package KodlamaIOWork.dataAccess;

import KodlamaIOWork.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

}
