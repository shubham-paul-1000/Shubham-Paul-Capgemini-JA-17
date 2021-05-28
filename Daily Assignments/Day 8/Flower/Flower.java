public class Flower {
	private int fid;
	private String fname;
	private double pricePerKg;
	private double qty;
	public Flower() {
		super();
	}
	public Flower(int fid, String fname, double pricePerKg, double qty) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.pricePerKg = pricePerKg;
		this.qty = qty;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public double getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public String toString(int i) {
		return "Flower No."+i+"[Flower id = "+fid+", Flower name = "+fname+", Price per kg = "+pricePerKg+", Quantity = "+qty+"]";
	}
}
