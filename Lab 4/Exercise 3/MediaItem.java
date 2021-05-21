public abstract class MediaItem extends Item{
	private int runtime;
	public MediaItem(int identificationNumber, String title, int numberOfCopies, int runtime) {
		super(identificationNumber, title, numberOfCopies);
		this.runtime = runtime;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Runtime : "+runtime);
	}

}