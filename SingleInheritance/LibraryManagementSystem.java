class Book {
	String title;
	int publicationYear;

	public Book (String title, int publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	}

	public void showDisplay() {
		System.out.println("Book title: " + title + "\n Publication Year: " + publicationYear);
	}
}

class Author extends Book {
	String name;
	double price;
	public Author(String name, String title, int year, double price) {
		super(title, year);
		this.name = name;
		this.price = price;
	}

	@Override
	public void showDisplay() {
		System.out.print("Author Name: " + name + "\nPrice of the book: " + price + "\n");
		super.showDisplay();
	}
}

public class LibraryManagementSystem {
	public static void main(String[] args) {
		Book [] books = new Book[2];
		books[0] = new Author("William Shakespeare","Merchant of venice",1999,250);

		books [1] = new Author("William ","venice",2001,250);

		for(Book b: books) {
			b.showDisplay();
		}
	}
}
