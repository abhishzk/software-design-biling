
public class BillData {
	int item_count,net_qty;
	double net_total,net_rate,net_tax,net_taxper;
	String Invoice_no,date,P_name,d_name;
	
	public BillData(double net_taxper, int item_count, int net_qty, String invoice_no, double net_total, double net_rate,
			double net_tax,String date, String p_name, String d_name) {
		super();
		this.net_taxper = net_taxper;
		this.item_count = item_count;
		this.net_qty = net_qty;
		Invoice_no = invoice_no;
		this.net_total = net_total;
		this.net_rate = net_rate;
		this.net_tax = net_tax;
		this.date = date;
		P_name = p_name;
		this.d_name = d_name;
	}

	public int getItem_count() {
		return item_count;
	}

	public void setItem_count(int item_count) {
		this.item_count = item_count;
	}

	public int getNet_qty() {
		return net_qty;
	}

	public void setNet_qty(int net_qty) {
		this.net_qty = net_qty;
	}

	public String getInvoice_no() {
		return Invoice_no;
	}

	public void setInvoice_no(String invoice_no) {
		Invoice_no = invoice_no;
	}

	public double getNet_total() {
		return net_total;
	}

	public void setNet_total(double net_total) {
		this.net_total = net_total;
	}

	public double getNet_rate() {
		return net_rate;
	}

	public void setNet_rate(double net_rate) {
		this.net_rate = net_rate;
	}

	public double getNet_tax() {
		return net_tax;
	}

	public void setNet_tax(double net_tax) {
		this.net_tax = net_tax;
	}

	public double getNet_taxper() {
		return net_taxper;
	}

	public void setNet_taxper(double net_taxper) {
		this.net_taxper = net_taxper;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getP_name() {
		return P_name;
	}

	public void setP_name(String p_name) {
		P_name = p_name;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	}
