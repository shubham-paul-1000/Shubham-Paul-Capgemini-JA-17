public abstract class WrittenItem extends Item {
	private String author;
	public WrittenItem(int identificationNumber, String title, int numberOfCopies, String author) {
		super(identificationNumber,title,numberOfCopies);
		this.author=author;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Author:"+author);
	}
	
}