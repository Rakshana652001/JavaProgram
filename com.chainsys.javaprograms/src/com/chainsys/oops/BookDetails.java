package com.chainsys.oops;

public class BookDetails
{
		String genreOfTheBook;
		String nameOfTheBook;
		int publishedYear;
		int parts;
		String authorName;
		float bookRating;
		public String getGenreOfTheBook() {
			return genreOfTheBook;
		}
		public void setGenreOfTheBook(String genreOfTheBook) {
			this.genreOfTheBook = genreOfTheBook;
		}
		public String getNameOfTheBook() {
			return nameOfTheBook;
		}
		public void setNameOfTheBook(String nameOfTheBook) {
			this.nameOfTheBook = nameOfTheBook;
		}
		public int getPublishedYear() {
			return publishedYear;
		}
		public void setPublishedYear(int publishedYear) {
			this.publishedYear = publishedYear;
		}
		public int getParts() {
			return parts;
		}
		public void setParts(int parts) {
			this.parts = parts;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public float getBookRating() {
			return bookRating;
		}
		public void setBookRating(float rating) {
			this.bookRating = rating;
		}
		@Override
		public String toString() {
			return "BookDetails [genreOfTheBook=" + genreOfTheBook + ", nameOfTheBook=" + nameOfTheBook
					+ ", publishedYear=" + publishedYear + ", parts=" + parts + ", authorName=" + authorName
					+ ", bookRating=" + bookRating + "]";
		}
		public static void setUserName(String name) {
			// TODO Auto-generated method stub
			
		}
		
	}
		
