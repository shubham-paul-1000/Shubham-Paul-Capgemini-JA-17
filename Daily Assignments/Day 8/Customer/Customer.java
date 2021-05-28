import java.util.Date;

public class Customer {
	private int cid;
	private String custname;
	private int age;
	private Date dob;
	private String email;
	private String mobileNumber;
	public Customer() {
		super();
	}
	public Customer(int cid, String custname, int age, Date dob, String email, String mobileNumber) {
		super();
		this.cid = cid;
		this.custname = custname;
		this.age = age;
		this.dob = dob;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
