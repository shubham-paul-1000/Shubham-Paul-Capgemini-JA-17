public class CD extends MediaItem{
	private String artist;
	private String genre;
	public CD(int identificationNumber, String title, int numberOfCopies, int runtime, String artist, String genre) {
		super(identificationNumber, title, numberOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Artist : "+artist);
		System.out.println("Genre : "+genre);
	}
}