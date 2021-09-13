public class Book2 extends TangibleAsset {
	private String isbn;
	public Book2 (String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}
}
