package entities;

import java.util.Objects;

public class Book {
	
	private String name;
	private String genreOne;
	private String genreTwo;
	private String author;
	private int numberOfPages;
	private int stockQuantity;
	private byte[] image;
	private byte enabled;
	
	public Book(String name, String author, String genreOne, String genreTwo,
			int numberOfPages, int stockQuantity) {
		this.name = name;
		this.genreOne = genreOne;
		this.genreTwo = genreTwo;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.stockQuantity = stockQuantity;
	}
	
	
	public Book(String name, String author, String genreOne, String genreTwo,
			int numberOfPages, int stockQuantity, byte[] image) {
		this.name = name;
		this.genreOne = genreOne;
		this.genreTwo = genreTwo;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.stockQuantity = stockQuantity;
		this.image = image;
	}
	
	public byte[] getImage() {
		return image;
	}
	
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	public String toString() {
		return getName();
	}
        
        public void setName(String name){
            this.name = name;
        }

	public String getName() {
		return name;
	}

	public String getGenreOne() {
		return genreOne;
	}

	public String getGenreTwo() {
		return genreTwo;
	}
	
	public String getGenres() {
		String genres = "";
		
		if(genreOne != null) {
			genres += genreOne.concat("    ");
		}
		
		if(genreTwo != null) {
			genres += genreTwo.concat("    ");
		}
		
		genres = genres.trim();
		genres = genres.replaceFirst("    ", ", ");
		
		
		return genres;
	}
        
        /*public void setGenres(String genreOne, String genreTwo){
            this.genreOne = genreOne;
            this.genreTwo = genreTwo;
        }*/
        
        public void setGenreOne(String genreOne){
            this.genreOne = genreOne;
        }
        
        public void setGenreTwo(String genreTwo){
            this.genreTwo = genreTwo;
        }
        
        public void setPages(int pages){
            this.numberOfPages = pages;
        }
        
        public void setAuthor(String author){
            this.author = author;
        }

	public String getAuthor() {
		return author;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}
	
	public void setStockQuantity(int qtd) {
		stockQuantity += qtd;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, genreOne, genreTwo, name, numberOfPages);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(genreOne, other.genreOne)
				&& Objects.equals(genreTwo, other.genreTwo) && Objects.equals(name, other.name)
				&& numberOfPages == other.numberOfPages;
	}


	public byte getEnabled() {
		return enabled;
	}


	public void setEnabled(byte enabled) {
		this.enabled = enabled;
	}

}
