import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.toedter.calendar.JCalendar;

import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextArea;


public class Main_page extends JFrame {

	protected static final DefaultTableModel DefaultTableModel = null;
	private JPanel contentPane;
	private static JDialog  dialog;
	private  JDialog  dialog1;
	private JTextField Invoice;
	private JTextField Date;
	private JTextField PatientN;
	private JTextField DocterN;
	private JTable table;
	private JTextField txtItemId;
	private JTextField txtItemName;
	private JTextField txtBatch;
	private JTextField txtExpDate;
	private JTextField txtQty;
	private JTextField txtRate;
	private JTextField txtTax;
	private JTextField txtNoOfItem;
	private JTextField Num_item;
	private JTextField txtQty_1;
	private JTextField net_qty;
	private JTextField txtTotal;
	private JTextField Net_taxper;
	private JTextField txtTax_1;
	private JTextField Net_rate;
	private JTextField txtCash;
	private JTextField Net_tax;
	private JTextField txtNetTotal;
	private JTextField Grand_total;
	private JButton btnNewButton;
	private JCalendar jj;
	
	Validation v = new ValidationImp();
	
	
	
	private AddData adddata = new AddDataImpl();
	private JPanel panel_5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private static JTextField textField_31;
	private static JPanel panel_6;
	private static JTextField textField_3;
	private static JPasswordField textField_4;
	private static JButton btnNewButton_1;
	private static JButton btnNewButton_2;
	private JPanel panel_7;
	private JPanel panel;
	private JLabel lblNewLabel_4;
	private JLabel lblAddress;
	private JTextField textField_5;
	private static String userType;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_page frame = new Main_page();
					frame.enable(false);
					frame.addWindowListener(new WindowListener(){

						private CheckLoginImpl ch;
						private String iconName;

						@Override
						public void windowActivated(WindowEvent arg0) {
							// TODO Auto-generated method stub
														
						}

						@Override
						public void windowClosed(WindowEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void windowClosing(WindowEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void windowDeactivated(WindowEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void windowDeiconified(WindowEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void windowIconified(WindowEvent arg0) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void windowOpened(WindowEvent arg0) {
							// TODO Auto-generated method stub
							int dialogButton = JOptionPane.YES_NO_OPTION;
							int dialogResult = JOptionPane.showConfirmDialog (null, "If Admin User Click Yes","Warning",dialogButton);
							if(dialogResult == JOptionPane.YES_OPTION){
							  // Saving code here
								ch = new AdminUser();
								userType= "Admin";
								iconName="C:\\eclipse-workspace\\Software_Design_4.1\\admin.png";
							}
							else {
								userType="User";
								ch = new AvgUser();
								iconName="C:\\eclipse-workspace\\Software_Design_4.1\\user.png";
							}
							dialog = new JDialog(frame, userType+" Login");
							dialog.getContentPane().setLayout(null);
							dialog.getContentPane().setBackground( Color.WHITE );
							
							panel_6 = new JPanel();
							panel_6.setBounds(40, 100, 290, 99);
							dialog.getContentPane().add(panel_6);
							panel_6.setLayout(null);
							panel_6.setBackground(Color.WHITE);
							
							JLabel lblNewLabel = new JLabel("");
							lblNewLabel.setIcon(new ImageIcon(iconName));
							lblNewLabel.setBounds(145, 10, 70, 100);
							lblNewLabel.requestFocus(true);
							dialog.getContentPane().add(lblNewLabel);

							textField_31 = new JTextField();
							textField_31.setBounds(0,0,0,0);
							panel_6.add(textField_31);
							textField_31.setColumns(10);
							textField_31.setText("UserName");
							
							textField_3 = new JTextField();
							textField_3.setBounds(102, 5, 86, 20);
							panel_6.add(textField_3);
							textField_3.setColumns(10);
							textField_3.setText("UserName");
							textField_3.addFocusListener(new FocusListener(){

								@Override
								public void focusGained(FocusEvent arg0) {
									// TODO Auto-generated method stub
									 if (textField_3.getText().equals("UserName")) {
										 textField_3.setText("");
										 textField_3.setForeground(Color.BLACK);
								        }
								}

								@Override
								public void focusLost(FocusEvent arg0) {
									// TODO Auto-generated method stub
									 if (textField_3.getText().isEmpty()) {
										 textField_3.setForeground(Color.GRAY);
										 textField_3.setText("UserName");
								        }
								}
							});
							
							textField_4 = new JPasswordField(16);
							textField_4.setBounds(102, 36, 86, 20);
							panel_6.add(textField_4);
							textField_4.setColumns(10);
							textField_4.setText("Password");
							textField_4.setEchoChar(("*").charAt(0));
							textField_4.addFocusListener(new FocusListener(){

								@Override
								public void focusGained(FocusEvent arg0) {
									// TODO Auto-generated method stub
									 if (textField_4.getText().equals("Password")) {
										 textField_4.setText("");
										 textField_4.setForeground(Color.BLACK);
								        }
								}

								@Override
								public void focusLost(FocusEvent arg0) {
									// TODO Auto-generated method stub
									 if (textField_4.getText().isEmpty()) {
										 textField_4.setForeground(Color.GRAY);
										 textField_4.setText("Password");
								        }
								}
							});
							btnNewButton_1 = new JButton("Login");
							btnNewButton_1.setBounds(28, 67, 89, 23);
							btnNewButton_1.requestFocus(true);
							btnNewButton_1.addActionListener(new ActionListener() {
								
								public void actionPerformed(ActionEvent e) {
									System.out.print(ch.checkLogin(textField_3.getText(), textField_4.getText()));
									if(ch.checkLogin(textField_3.getText(), textField_4.getText()))
									{	dialog.setVisible(false);
										frame.enable(true);

										frame.setVisible(true);
									}
									else{
										
									}
								}
							});
							panel_6.add(btnNewButton_1);
							
							btnNewButton_2 = new JButton("Exit");
							btnNewButton_2.setBounds(168, 67, 89, 23);
							btnNewButton_2.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
										dialog.setVisible(false);
										frame.enable(false);
										frame.setVisible(false);
							
									}
							});
							panel_6.add(btnNewButton_2);
							dialog.setDefaultCloseOperation(dialog.DO_NOTHING_ON_CLOSE);
							
							dialog.setBounds(300, 250, 400, 400);
							dialog.setVisible(true);

						}
						
					});
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	/**
	 * Create the frame.
	 */
	public Main_page() {
		setTitle("nullPanel\r\n");
		setForeground(Color.LIGHT_GRAY);
		setBackground(Color.DARK_GRAY);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 998, 758);
		contentPane = new JPanel();
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 6, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192), 3, true), "Items Details", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.activeCaption));
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(10, 326, 865, 341);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		
		
		txtItemId = new JTextField();
		txtItemId.setForeground(Color.GRAY);
		txtItemId.setBounds(10, 31, 61, 20);
		
		txtItemId.setColumns(10);
		txtItemId.setText(1+"");
		panel_3.add(txtItemId);
		txtItemId.setEditable(false);
		
		txtItemName = new JTextField();
		txtItemName.setForeground(SystemColor.desktop);
		txtItemName.setText("Item Name");
		txtItemName.setColumns(10);
		txtItemName.setBounds(91, 31, 68, 20);
		panel_3.add(txtItemName);
		placehlder(txtItemName,txtItemName.getText());
		
		txtBatch = new JTextField();
		txtBatch.setForeground(SystemColor.desktop);
		txtBatch.setText("Batch");
		txtBatch.setColumns(10);
		txtBatch.setBounds(182, 31, 73, 20);
		panel_3.add(txtBatch);
		placehlder(txtBatch,txtBatch.getText());
		

		txtExpDate = new JTextField();
		txtExpDate.setForeground(SystemColor.desktop);
		txtExpDate.setText("Exp Date");
		txtExpDate.setColumns(10);
		txtExpDate.setBounds(273, 31, 61, 20);
		panel_3.add(txtExpDate);
		placehlder(txtExpDate,txtExpDate.getText());

		
		txtQty = new JTextField();
		txtQty.setForeground(SystemColor.desktop);
		txtQty.setText("Qty");
		txtQty.setColumns(10);
		txtQty.setBounds(360, 31, 68, 20);
		panel_3.add(txtQty);
		placehlder(txtQty,txtQty.getText());

		txtRate = new JTextField();
		txtRate.setForeground(SystemColor.desktop);
		txtRate.setText("Rate");
		txtRate.setColumns(10);
		txtRate.setBounds(438, 31, 61, 20);
		panel_3.add(txtRate);
		placehlder(txtRate,txtRate.getText());
		
		JLabel lblerrormessage = new JLabel("");
		lblerrormessage.setForeground(Color.RED);
		lblerrormessage.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblerrormessage.setBounds(20, 62, 314, 14);
		panel_3.add(lblerrormessage);

		txtTax = new JTextField();
		txtTax.setForeground(SystemColor.desktop);
		txtTax.setText("Tax%");
		txtTax.setColumns(10);
		txtTax.setBounds(509, 31, 61, 20);
		panel_3.add(txtTax);
		placehlder(txtTax,txtTax.getText());

		 String[][] data = { 
		            { "Item ID", "Item Name", "Batch" ,"Exp","Qty","MRP","Dec","Rate","Amount","Tax%","Tax" }, 
		            { "Item ID", "Item Name", "Batch" ,"Exp","Qty","MRP","Rate","Amount","Tax%","Tax"} 
		        }; 
		 String[] columnNames = { "Item ID", "Item Name", "Batch" ,"Exp","Qty","Rate","Amount","Tax%","Tax"}; 
		DefaultTableModel model = new DefaultTableModel();
		table = new JTable(model);
		table.setBackground(SystemColor.info);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setSurrendersFocusOnKeystroke(true);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(10, 79, 845, 150);
		
		table.getPreferredScrollableViewportSize();
		panel_3.add(table);
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				updatePage();
			}
			
		});
		for(int i = 0 ;i<columnNames.length;i++)
			model.addColumn(columnNames[i]);
		model.addRow(new Object[] { "Item ID", "Item Name", "Batch" ,"Exp","Qty","Rate","Tax%","Tax","Amount"});
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBackground(Color.DARK_GRAY);
		btnAdd.setForeground(SystemColor.activeCaption);
		
		btnAdd.setBounds(580, 30, 61, 23);
		panel_3.add(btnAdd);
		
		
		txtNoOfItem = new JTextField();
		txtNoOfItem.setBackground(SystemColor.activeCaption);
		txtNoOfItem.setForeground(SystemColor.desktop);
		txtNoOfItem.setEditable(false);
		txtNoOfItem.setText("No of Item");
		txtNoOfItem.setColumns(10);
		txtNoOfItem.setBounds(10, 247, 61, 20);
		panel_3.add(txtNoOfItem);
		
		Num_item = new JTextField();
		Num_item.setBackground(Color.WHITE);
		Num_item.setForeground(SystemColor.desktop);
		Num_item.setEditable(false);
		Num_item.setBounds(81, 247, 68, 20);
		panel_3.add(Num_item);
		Num_item.setColumns(10);
		
		txtQty_1 = new JTextField();
		txtQty_1.setBackground(SystemColor.activeCaption);
		txtQty_1.setForeground(SystemColor.desktop);
		txtQty_1.setEditable(false);
		txtQty_1.setText("Qty");
		txtQty_1.setColumns(10);
		txtQty_1.setBounds(159, 247, 61, 20);
		panel_3.add(txtQty_1);
		
		net_qty = new JTextField();
		net_qty.setBackground(Color.WHITE);
		net_qty.setForeground(SystemColor.desktop);
		net_qty.setEditable(false);
		net_qty.setColumns(10);
		net_qty.setBounds(230, 247, 68, 20);
		panel_3.add(net_qty);
		
		txtTotal = new JTextField();
		txtTotal.setBackground(SystemColor.activeCaption);
		txtTotal.setForeground(SystemColor.desktop);
		txtTotal.setEditable(false);
		txtTotal.setText("Tax%");
		txtTotal.setColumns(10);
		txtTotal.setBounds(503, 247, 61, 20);
		panel_3.add(txtTotal);
		
		Net_taxper = new JTextField();
		Net_taxper.setBackground(Color.WHITE);
		Net_taxper.setForeground(SystemColor.desktop);
		Net_taxper.setEditable(false);
		Net_taxper.setColumns(10);
		Net_taxper.setBounds(574, 247, 68, 20);
		panel_3.add(Net_taxper);
		
		txtTax_1 = new JTextField();
		txtTax_1.setBackground(SystemColor.activeCaption);
		txtTax_1.setForeground(SystemColor.desktop);
		txtTax_1.setEditable(false);
		txtTax_1.setText("Total");
		txtTax_1.setColumns(10);
		txtTax_1.setBounds(680, 247, 61, 20);
		panel_3.add(txtTax_1);
		
		
		Net_rate = new JTextField();
		Net_rate.setBackground(Color.WHITE);
		Net_rate.setForeground(SystemColor.desktop);
		Net_rate.setEditable(false);
		Net_rate.setColumns(10);
		Net_rate.setBounds(751, 247, 68, 20);
		panel_3.add(Net_rate);
		
		txtCash = new JTextField();
		txtCash.setBackground(SystemColor.activeCaption);
		txtCash.setForeground(SystemColor.desktop);
		txtCash.setEditable(false);
		txtCash.setText("net_Tax");
		txtCash.setColumns(10);
		txtCash.setBounds(503, 276, 61, 20);
		panel_3.add(txtCash);
		
		Net_tax = new JTextField();
		Net_tax.setBackground(Color.WHITE);
		Net_tax.setForeground(SystemColor.desktop);
		Net_tax.setEditable(false);
		Net_tax.setColumns(10);
		Net_tax.setBounds(574, 276, 68, 20);
		panel_3.add(Net_tax);
		
		txtNetTotal = new JTextField();
		txtNetTotal.setBackground(SystemColor.activeCaption);
		txtNetTotal.setForeground(SystemColor.desktop);
		txtNetTotal.setEditable(false);
		txtNetTotal.setText("Net Total");
		txtNetTotal.setColumns(10);
		txtNetTotal.setBounds(680, 276, 139, 20);
		panel_3.add(txtNetTotal);
		
		Grand_total = new JTextField();
		Grand_total.setBackground(Color.WHITE);
		Grand_total.setForeground(SystemColor.desktop);
		Grand_total.setEditable(false);
		Grand_total.setColumns(10);
		Grand_total.setBounds(680, 304, 139, 20);
		panel_3.add(Grand_total);
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!v.isNULL(Arrays.asList(txtItemName,txtBatch,txtExpDate,txtQty,txtRate,txtTax),lblerrormessage)){
					if(!v.isDouble(Arrays.asList(txtRate,txtTax),lblerrormessage)){
						if(!v.isInt(Arrays.asList(txtQty),lblerrormessage)){
					adddata.adddata1(Arrays.asList(txtItemId,txtItemName,txtBatch,txtExpDate,txtQty,txtRate,txtTax),table);
					updatePage();
					table.repaint();
					v.cleardata(Arrays.asList(txtItemName,txtBatch,txtExpDate,txtQty,txtRate,txtTax));
				}}
			}
			}

			
		});
		btnNewButton = new JButton("Print Bill");
		btnNewButton.setForeground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setActionCommand("Print Bill");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = {"Yes, please",
	                    "No, thanks"};
	int n = JOptionPane.showOptionDialog(contentPane,
	    "Would you like to save Bill ",
	    "",
	    JOptionPane.YES_NO_CANCEL_OPTION,
	    JOptionPane.QUESTION_MESSAGE,
	    null,
	    options,
	    options[1]);
	System.out.println(n+"ass");
	
	if(v.isNULL1(Arrays.asList(Invoice,Date,PatientN,DocterN,Num_item,net_qty, Net_taxper,Net_tax,Net_rate,Grand_total),lblerrormessage)){
		System.out.println("Printing......");
		if(n==0) 
			savePaint(Invoice.getText());
				
		v.cleardata(Arrays.asList(txtItemName,txtBatch,txtExpDate,txtQty,txtRate,txtTax,Date,PatientN,DocterN,Num_item,net_qty, Net_taxper,Net_tax,Net_rate,Grand_total));

		String[] pathnames;			
		Invoice.setText(Integer.parseInt(Invoice.getText())+1 +"");
		txtItemId.setText(1 +"");
		model.setRowCount(1);
	}
	else {
		savePaint(Invoice.getText());
	}
			}

		private void savePaint(String string) {
			// TODO Auto-generated method stub
			 try
		        {
		            BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		            Graphics2D graphics2D = image.createGraphics();
		            contentPane.paint(graphics2D);
		            String str1 = string+".jpeg";
		            ImageIO.write(image,"jpeg", new File("Bill/"+str1));
		        }
		        catch(Exception exception)
		        {
		            JOptionPane.showMessageDialog(contentPane, "Error in printing bill");
		        }
	            JOptionPane.showMessageDialog(contentPane, "Bill is stored in your billing folder");
		}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(503, 307, 139, 23);
		panel_3.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setForeground(SystemColor.desktop);
		panel_4.setBounds(10, 240, 830, 90);
		panel_3.add(panel_4);
		
		
		
		JButton btnExp = new JButton("Export");
		btnExp.setBackground(Color.DARK_GRAY);
		btnExp.setForeground(SystemColor.activeCaption);
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//txtItemId,txtItemName,txtBatch,txtExpDate,txtQty,txtRate,txtTax
				if(e.getSource() == btnAdd ){
					String id = txtItemId.getText();
					String fn = txtItemName.getText();
					String ln = txtBatch.getText();
					String exp = txtExpDate.getText();
					String qty = txtQty.getText();
					String rate = txtRate.getText();
					String tax = txtTax.getText();
					String amt = txtNetTotal.getText();
					
					
//					txtItemName.setText("");
//					txtItemId.setText("");
//					txtBatch.setText("");
//					txtQty.setText("");
//					txtRate.setText("");
//					txtTax.setText("");
//					txtNetTotal.setText("");
//					txtExpDate.setText("");
//					txtItemName.requestFocus();

					model.insertRow(model.getRowCount(), new Object[]{id,fn,ln,exp,qty,rate,tax,amt});
				}else if(e.getSource() == btnExp){
	                JFileChooser fc = new JFileChooser();
	                int option = fc.showSaveDialog(Main_page.this);
	                if(option == JFileChooser.APPROVE_OPTION){
	                    String filename = fc.getSelectedFile().getName(); 
	                    String path = fc.getSelectedFile().getParentFile().getPath();

						int len = filename.length();
						String ext = "";
						String file = "";

						if(len > 4){
							ext = filename.substring(len-4, len);
						}

						if(ext.equals(".xls")){
							file = path + "\\" + filename; 
						}else{
							file = path + "\\" + filename + ".xls"; 
						}
						toExcel(table, new File(file));
					}
				}
			}

			private void toExcel(JTable table, File file) {
				try{
					TableModel model = table.getModel();
					FileWriter excel = new FileWriter(file);

					for(int i = 0; i < model.getColumnCount(); i++){
						excel.write(model.getColumnName(i) + "\t");
					}

					excel.write("\n");

					for(int i=0; i< model.getRowCount(); i++) {
						for(int j=0; j < model.getColumnCount(); j++) {
							excel.write(model.getValueAt(i,j).toString()+"\t");
						}
						excel.write("\n");
					}

					excel.close();
				}catch(IOException e){ System.out.println(e); }
				
			}
		});
		btnExp.setBounds(651, 30, 90, 23);
		panel_3.add(btnExp);
		
		JButton btnClr2 = new JButton("Clear");
		btnClr2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Num_item.setText("");
				net_qty.setText("");
				Net_taxper.setText("");
				Net_rate.setText("");
				Net_tax.setText("");
				Grand_total.setText("");
			}
		});
		btnClr2.setBackground(Color.DARK_GRAY);
		btnClr2.setForeground(SystemColor.activeCaption);
		btnClr2.setBounds(751, 30, 89, 23);
		panel_3.add(btnClr2);
		
		panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192), 3, true), "Customer Details", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.activeCaption));
		panel_7.setForeground(SystemColor.activeCaption);
		panel_7.setBackground(Color.DARK_GRAY);
		panel_7.setBounds(10, 132, 865, 166);
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblPatientsName = new JLabel("Customer  Name :");
		lblPatientsName.setForeground(SystemColor.activeCaption);
		lblPatientsName.setBounds(10, 30, 130, 17);
		panel_7.add(lblPatientsName);
		lblPatientsName.setFont(new Font("Calibri", Font.PLAIN, 14));
		
		PatientN = new JTextField();
		PatientN.setForeground(SystemColor.desktop);
		PatientN.setBounds(170, 29, 151, 20);
		panel_7.add(PatientN);
		PatientN.setColumns(10);
		PatientN.setBackground(Color.WHITE);
		
		JLabel lblDoctorsName = new JLabel("Email Address:");
		lblDoctorsName.setForeground(SystemColor.activeCaption);
		lblDoctorsName.setBounds(10, 58, 130, 17);
		panel_7.add(lblDoctorsName);
		lblDoctorsName.setFont(new Font("Calibri", Font.PLAIN, 14));
		
		DocterN = new JTextField();
		DocterN.setForeground(SystemColor.desktop);
		DocterN.setBounds(170, 57, 151, 20);
		panel_7.add(DocterN);
		DocterN.setColumns(10);
		DocterN.setBackground(Color.WHITE);
		
		Date = new JTextField();
		Date.setForeground(SystemColor.desktop);
		Date.setBounds(728, 75, 86, 20);
		panel_7.add(Date);
		Date.setBackground(Color.WHITE);
		Date.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Date:");
		lblNewLabel_1.setForeground(SystemColor.activeCaption);
		lblNewLabel_1.setBounds(659, 65, 38, 38);
		panel_7.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		
		Invoice = new JTextField();
		Invoice.setForeground(SystemColor.desktop);
		Invoice.setBounds(728, 29, 86, 20);
		panel_7.add(Invoice);
		Invoice.setColumns(10);
		Invoice.setBackground(Color.WHITE);
		Invoice.setText(getInvoice());
		Invoice.setEditable(false);
		
		JLabel lblInvoiceNo = new JLabel("Invoice No.");
		lblInvoiceNo.setForeground(SystemColor.activeCaption);
		lblInvoiceNo.setBounds(631, 19, 66, 38);
		panel_7.add(lblInvoiceNo);
		
		lblInvoiceNo.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblInvoiceNo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		
		lblAddress = new JLabel("Phone Number:");
		lblAddress.setForeground(SystemColor.activeCaption);
		lblAddress.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblAddress.setBounds(10, 86, 130, 17);
		panel_7.add(lblAddress);
		
		textField_5 = new JTextField();
		textField_5.setForeground(SystemColor.desktop);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(170, 88, 151, 20);
		panel_7.add(textField_5);
		
		JLabel lblAddress_2 = new JLabel("Address :");
		lblAddress_2.setForeground(SystemColor.activeCaption);
		lblAddress_2.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblAddress_2.setBounds(10, 114, 130, 17);
		panel_7.add(lblAddress_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(SystemColor.desktop);
		textArea.setBounds(170, 111, 151, 44);
		panel_7.add(textArea);
		
		JButton btnClr = new JButton("Clear");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientN.setText("");
				DocterN.setText("");
				textArea.setText("");
				textField_5.setText("");
				Date.setText("");
				
			}
		});
		btnClr.setBackground(Color.DARK_GRAY);
		btnClr.setForeground(SystemColor.activeCaption);
		btnClr.setBounds(728, 114, 89, 23);
		panel_7.add(btnClr);
		
		panel = new JPanel();
		panel.setForeground(SystemColor.activeCaption);
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 11, 865, 115);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Costcutter Billing System");
		lblNewLabel_3.setBounds(470, 11, 370, 33);
		lblNewLabel_3.setForeground(SystemColor.activeCaption);
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 26));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\eclipse-workspace\\Software_Design_4.1\\1.png"));
		lblNewLabel.setBounds(22, 11, 206, 93);
		panel.add(lblNewLabel);
		
		lblNewLabel_4 = new JLabel("Dublin Road, Athlone");
		lblNewLabel_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_4.setBounds(711, 44, 126, 24);
		panel.add(lblNewLabel_4);
		
		
	}
	
	private String getInvoice() {
		// TODO Auto-generated method stub
		File f = new File("C://eclipse-workspace/Software_Design_4.1/Bill/");
        System.out.print(f.isDirectory());
        File[] files = f.listFiles();
        String s = "0";
		if(files != null) {
		    for(File file : files) {	
			    s=file.getName().replace(".jpeg", "");
		    }
		}
		return (Integer.parseInt(s)+1)+"";
	}

	public void updatePage() {
		// TODO Auto-generated method stub
		adddata.UpdateData(table,Arrays.asList(Invoice,Date,PatientN,DocterN,Num_item,net_qty,Net_taxper,Net_tax,Net_rate,Grand_total));
	}
				
		
	private void placehlder(JTextField o1,String s2) {
		// TODO Auto-generated method stub
		o1.setToolTipText(s2);
		o1.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    }
		});
		o1.addFocusListener(new FocusListener(){

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				 if (o1.getText().equals(s2)) {
					 o1.setText("");
					 o1.setForeground(Color.BLACK);
			        }
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				 if (o1.getText().isEmpty()) {
					 o1.setForeground(Color.GRAY);
					 o1.setText(s2);
			        }
			}
			
		});
	}
}

