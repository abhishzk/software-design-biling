public class ItemData {
	int id,qty,tax_per;
	double rate,amount,tax;
	String name,date1,batch;
	
	public ItemData(int id2, String name2, String batch2, String date12, int qty2, double rate2, int tax_per2,
			double tax2, double amount2) {
		// TODO Auto-generated constructor stub
		this.id= id2;
		this.amount=amount2;
		this.batch=batch2;
		this.date1=date12;
		this.name=name2;
		this.tax=tax2;
		this.tax_per=tax_per2;
		this.qty=qty2;
		this.rate=rate2;
	}
	public ItemData() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public int getTax_per() {
		return tax_per;
	}
	public void setTax_per(int tax_per) {
		this.tax_per = tax_per;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	
}
