package KodlamaIOWork.dataAccess;

import KodlamaIOWork.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile yeni kategori veritabanına eklendi.");
	}

}
