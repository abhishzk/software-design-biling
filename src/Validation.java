import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

public interface Validation {
	boolean isNULL(List<JTextField> j,JLabel err);
	boolean isDouble(List<JTextField> j,JLabel err);
	boolean isInt(List<JTextField> j,JLabel err);
	void cleardata(List<JTextField> asList);
	boolean isNULL1(List<JTextField> asList, JLabel lblerrormessage);
}
