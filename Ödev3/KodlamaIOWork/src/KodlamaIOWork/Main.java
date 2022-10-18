package KodlamaIOWork;

import KodlamaIOWork.business.CategoryManager;
import KodlamaIOWork.business.CourseManager;
import KodlamaIOWork.business.TeacherManager;
import KodlamaIOWork.core.logging.DatabaseLogger;
import KodlamaIOWork.core.logging.FileLogger;
import KodlamaIOWork.core.logging.Logger;
import KodlamaIOWork.core.logging.MailLogger;
import KodlamaIOWork.dataAccess.HibernateCategoryDao;
import KodlamaIOWork.dataAccess.HibernateTeacherDao;
import KodlamaIOWork.dataAccess.JdbcCategoryDao;
import KodlamaIOWork.dataAccess.JdbcCourseDao;
import KodlamaIOWork.entities.Category;
import KodlamaIOWork.entities.Course;
import KodlamaIOWork.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new FileLogger(), new DatabaseLogger(), new MailLogger()};
		
		// Add Category
		Category category = new Category();
		category.categories.add("Backend");
		category.categories.add("Yazılım");
		category.categories.add("Game");
		//category.categories.add("backEND");    // => Hata
		
		CategoryManager manager = new CategoryManager(new JdbcCategoryDao(), loggers);
		manager.add(category);
		
		System.out.println("-    -      -   ");
		
		// Add Course
		Course course1 = new Course("Java", 30);
		Course course2 = new Course("java", 20);
		Course course3 = new Course("C#", 0);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course1);
		
		System.out.println("-    -      -   ");
		
		// Add Teacher
		Teacher teacher = new Teacher("Engin Demirog");
		
		TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(), loggers);
		teacherManager.add(teacher);
		
		
		

	}

}
