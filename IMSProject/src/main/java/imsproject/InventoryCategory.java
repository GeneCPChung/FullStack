package imsproject;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class InventoryCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String categoryName;
	private String images;

	@OneToMany(mappedBy = "movieCategory")
	private Set<InventoryItem> movieReviews;

	protected InventoryCategory() {
	}

	public InventoryCategory(String categoryName, String images, Set<InventoryItem> movieReviews) {
		this.categoryName = categoryName;
		this.images = images;
		this.movieReviews = movieReviews;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public String getImages() {
		return images;
	}

	public Set<InventoryItem> getMovieReviews() {
		return movieReviews;
	}

}
