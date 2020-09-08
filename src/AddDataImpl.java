import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddDataImpl implements AddData {

	private static List<ItemData> adddata11 = new ArrayList<>();
	private static List<BillData> WholeData = new ArrayList<>();
	BillData b = new BillData(0, 0, 0, null, 0, 0, 0, null, null, null);
	
	
	@Override
	public void adddata1(List<JTextField> namesList, JTable table) {
		int id=Integer.parseInt(namesList.get(0).getText()),
			qty = Integer.parseInt(namesList.get(4).getText()),
			tax_per =Integer.parseInt(namesList.get(6).getText());
		double rate = Double.parseDouble(namesList.get(5).getText()),
				tax= (rate*qty) * tax_per /100,
				amount = tax+(rate*qty);
		String name= namesList.get(1).getText(),
				date1 = namesList.get(3).getText(),
				batch= namesList.get(2).getText();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			//model.setRowCount(0);
			model.addRow(new Object[]{id,name,batch,date1,qty,rate,tax_per,tax,amount});
			namesList.get(0).setText((id+1) +"");
			//adddata11.add(new ItemData(id,name,batch,date1,qty,rate,tax_per,tax,amount));
			
	}
	@Override
	public void UpdateData(JTable table,List<JTextField> namesList) {
		// TODO Auto-generated method stub	
		double total = 0,total_rate = 0,tax_total = 0;
		int qty_total=0,item_qty=0,net_taxper=0;
		int invoice_no=0;
	    for (int i = 1; i < table.getRowCount(); i++){
	        double amount1 =Double.parseDouble(table.getValueAt(i, 8).toString());
	        total += amount1;
	        total_rate += Double.parseDouble(table.getValueAt(i, 5).toString());
	        tax_total += Double.parseDouble(table.getValueAt(i, 7).toString());
	        qty_total += Integer.parseInt(table.getValueAt(i, 4).toString());
	        net_taxper+= Integer.parseInt(table.getValueAt(i, 6).toString());
	    }
	    item_qty=table.getRowCount()-1;
	    System.out.println("\nTotal: "+total+"\nrate : "+total_rate+"\ntax"+tax_total+"\nqty : "+qty_total+"\nitem_qty : "+item_qty );
	    b.setInvoice_no(namesList.get(0).getText());
	    b.setDate(namesList.get(1).getText());
	    b.setP_name(namesList.get(2).getText());
	    b.setD_name(namesList.get(3).getText());
	    b.setItem_count(item_qty);
	    b.setNet_qty(qty_total);
	    b.setNet_taxper(net_taxper);
	    b.setNet_tax(tax_total);
	    b.setNet_rate(total_rate);
	    b.setNet_total(total);
	    System.out.println(b.net_total+" tax"+b.net_tax);

	    namesList.get(0).setText(b.Invoice_no);
	    namesList.get(1).setText(b.date);
	    namesList.get(2).setText(b.P_name);
	    namesList.get(3).setText(b.d_name);
	    namesList.get(4).setText(b.item_count+"");
	    namesList.get(5).setText(b.net_qty+"");
	    namesList.get(6).setText(b.net_taxper+"");
	    namesList.get(7).setText(b.net_tax+"");
	    namesList.get(8).setText(b.net_rate+"");
	    namesList.get(9).setText(b.net_total+"");
	    //Invoice,Date,PatientN,DocterN,Num_item,net_qty, Net_taxper,Net_tax,Net_rate,Grand_total
	    //WholeData.add(new BillData(net_taxper, item_qty, qty_total, invoice_no, double net_total, double net_rate,
			//	double net_tax, String date, String p_name, String d_name));
	}
	@Override
	public void addrow() {
		// TODO Auto-generated method stub
		
	}

}
