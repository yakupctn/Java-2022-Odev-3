package KodlamaIOWork.dataAccess;

import KodlamaIOWork.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veritabanına eklendi.");
	}

}
