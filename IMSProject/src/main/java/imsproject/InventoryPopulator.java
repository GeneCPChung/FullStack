
package imsproject;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class InventoryPopulator implements CommandLineRunner {

	@Resource
    InventoryCategoryRepository categoryRepo;

	@Resource
    InventoryItemRepository reviewRepo;

	@Resource
	TagRepository tagRepo;

	@Override
	public void run(String... args) throws Exception {

		Tag tagG = new Tag("G", null);
		tagRepo.save(tagG);
		Tag tagPg = new Tag("PG", null);
		tagRepo.save(tagPg);
		Tag tagPg13 = new Tag("PG-13", null);
		tagRepo.save(tagPg13);
		Tag tagR = new Tag("R", null);
		tagRepo.save(tagR);

		InventoryCategory category1 = new InventoryCategory("Sci-Fi", "/images/the-matrix.jpg", null);
		categoryRepo.save(category1);
		InventoryCategory category2 = new InventoryCategory("Chick-Flicks", "/images/beaches.jpg", null);
		categoryRepo.save(category2);
		InventoryCategory category3 = new InventoryCategory("Comedy", "/images/dumb-and-dumber.jpg", null);
		categoryRepo.save(category3);
		InventoryCategory category4 = new InventoryCategory("Drama", "/images/fmj.jpg", null);
		categoryRepo.save(category4);
		InventoryCategory category5 = new InventoryCategory("Family", "/images/puff.jpg", null);
		categoryRepo.save(category5);

		InventoryItem review1 = new InventoryItem("The Matrix", "/images/the-matrix.jpg","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tinciduntexlaoreet quis. Sed et rutrum tellus, a cursus sem.",	category1, tagPg13);
		reviewRepo.save(review1);
		InventoryItem review2 = new InventoryItem("Beaches", "/images/beaches.jpg",	"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt exlaoreet quis. Sed et rutrum tellus, a cursus sem.", category2, tagPg);
		reviewRepo.save(review2);
		InventoryItem review3 = new InventoryItem("Dumb & Dumber", "/images/dumb-and-dumber.jpg","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt exlaoreet quis. Sed et rutrum tellus, a cursus sem.", category3, tagPg);
		reviewRepo.save(review3);
		InventoryItem review4 = new InventoryItem("Full Metal Jacket", "/images/fmj.jpg","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tinciduntexlaoreet quis. Sed et rutrum tellus, a cursus sem.", category4, tagR);
		reviewRepo.save(review4);
		InventoryItem review5 = new InventoryItem("The Matrix: Reloaded", "/images/the-matrix.jpg","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risusrutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.", category1, tagR);
		reviewRepo.save(review5);
		InventoryItem review6 = new InventoryItem("Titanic", "/images/titanic.jpg","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risusutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt exlaoreet quis. Sed et rutrum tellus, a cursus sem.",	category2, tagPg);
		reviewRepo.save(review6);
		InventoryItem review7 = new InventoryItem("Big Trouble in Little China", "/images/big-trouble.jpg","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt exlaoreet quis. Sed et rutrum tellus, a cursus sem.",	category3, tagPg13);
		reviewRepo.save(review7);
		InventoryItem review8 = new InventoryItem("The Godfather", "/images/godfather.jpg","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risusrutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.", category4, tagR);
		reviewRepo.save(review8);
		InventoryItem review9 = new InventoryItem("Aladin", "/images/aladin.jpg","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt exlaoreet quis. Sed et rutrum tellus, a cursus sem.",	category5, tagG);
		reviewRepo.save(review9);
		InventoryItem review10 = new InventoryItem("Puff The Magic Dragon", "/images/puff.jpg","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risusrutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.", category5, tagG);
		reviewRepo.save(review10);

	}

}
