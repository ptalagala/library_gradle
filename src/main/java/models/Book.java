package models;

/**
 * Contains information on book to loan
 */
public class Book extends Material {

	private String author;
	private String isbn;
	private int noOfPages;

	/**
	 * Book to loan
	 *
	 * @param id of the book
	 * @param title of the book
	 * @param author name of the book
	 * @param isbn number of the book
	 * @param branch of the book
	 * @param noOfpages in the book
	 */
	public Book(int id, String title, String author, String isbn, String branch, int noOfpages) 
	{
		super(id,title,branch);
		this.author = author;
		this.isbn = isbn;
		this.noOfPages= noOfpages;
	}
	
	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void sendForRepair() {
		System.out.println("Book has been sent for repair");
	}
	
	public int getLoanPeriod() {
		return 21;
	}
	
}
