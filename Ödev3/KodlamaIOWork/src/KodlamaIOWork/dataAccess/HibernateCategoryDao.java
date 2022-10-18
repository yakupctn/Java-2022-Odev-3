package KodlamaIOWork.dataAccess;

import KodlamaIOWork.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile yeni kategori veritabanına eklendi.");
	}

}
