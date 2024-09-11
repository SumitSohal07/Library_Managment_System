package com.cestar.model;

public class Book_Details {

	private int BookID;
	private String BookName;
	private String AuthorName;
	private String Category;
	private String Publisher;
	private Double Price;
	public int getBookID() {
		return BookID;
	}
	public void setBookID(int bookID) {
		BookID = bookID;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public Book_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book_Details(int bookID, String bookName, String authorName, String category, String publisher,
			Double price) {
		super();
		BookID = bookID;
		BookName = bookName;
		AuthorName = authorName;
		Category = category;
		Publisher = publisher;
		Price = price;
	}
	@Override
	public String toString() {
		return "Book_Details [BookID=" + BookID + ", BookName=" + BookName + ", AuthorName=" + AuthorName
				+ ", Category=" + Category + ", Publisher=" + Publisher + ", Price=" + Price + "]\n";
	}
	
	
}
