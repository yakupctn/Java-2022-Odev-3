package KodlamaIOWork.business;


import KodlamaIOWork.core.logging.Logger;
import KodlamaIOWork.dataAccess.CategoryDao;
import KodlamaIOWork.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger [] loggers; 


	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}


	public void add(Category category) throws Exception {
		int size = category.categories.size();
		
		for(int i = 0; i<size-1;i++) {
			if((category.categories.get(size-1).toUpperCase()).equals(category.categories.get(i).toUpperCase())) {
				throw new Exception("Bu kategori zaten mevcut!!!");
			}
		}
		
		categoryDao.add(category);
		
		System.out.println("Mevcut kategoriler :");
		for(int i =0 ; i<category.categories.size();i++) {
			System.out.println(category.categories.get(i));
		}
		
		for(Logger logger:loggers) {
			logger.log(category.categories.get(size-1));
		}
		
	}

}
