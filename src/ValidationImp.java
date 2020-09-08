import java.awt.Color;
import java.util.List;
import java.util.ListIterator;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ValidationImp implements Validation{

	@Override
	public boolean isNULL(List<JTextField> j,JLabel err) {
		// TODO Auto-generated method stub
		ListIterator<JTextField> listItr = j.listIterator();
		 while(listItr.hasNext()) {
			 JTextField str1=listItr.next();
	         if( str1.equals("") ){
	        	 err.setText("*"+str1.getText()+" is Empty");
	        	 return true;
	         }
		 }
		 return false;
		
	}

	@Override
	public boolean isDouble(List<JTextField> j,JLabel err) {
		// TODO Auto-generated method stub
		ListIterator<JTextField> listItr = j.listIterator();
		 while(listItr.hasNext()) {
			 JTextField str1=listItr.next();
			 try{
	        	 double d = Double.parseDouble(str1.getText().toString());
	         }catch(NumberFormatException | NullPointerException nfe){
	        	 err.setText("*Please Enter Double Value for "+str1.getText());
	        	 return true;
	         }
		 }
		return false;
	}

	@Override
	public boolean isInt(List<JTextField> j,JLabel err) {
		ListIterator<JTextField> listItr = j.listIterator();
		 while(listItr.hasNext()) {
			 JTextField str1=listItr.next();
			 try{
	        	 int d = Integer.parseInt(str1.getText().toString());
	         }catch(NumberFormatException | NullPointerException nfe){
	        	 err.setText("*Please Enter Int Value for "+str1.getText());
	        	 return true;
	         }
		 }
		return false;
	}

	@Override
	public void cleardata(List<JTextField> asList) {
		// TODO Auto-generated method stub
		ListIterator<JTextField> listItr = asList.listIterator();
		 while(listItr.hasNext()) {
			 JTextField str1=listItr.next();
			 str1.setText("");
			 str1.requestFocus();
			 str1.requestFocus(false);
		 }
		 
	}

	@Override
	public boolean isNULL1(List<JTextField> asList, JLabel err) {
		// TODO Auto-generated method stub
		ListIterator<JTextField> listItr = asList.listIterator();
		 while(listItr.hasNext()) {
			 JTextField str1=listItr.next();
	         if( str1.getText().equals("") ){
	        	 err.setText("*"+str1.getText()+" is Empty");
	        	 return true;
	         }
		 }
		return false;
	}
}
