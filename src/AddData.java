import java.util.List;

import javax.swing.JTable;
import javax.swing.JTextField;

public interface AddData {
	void adddata1(List<JTextField> namesList,JTable table);

	void addrow();

	void UpdateData(JTable table, List<JTextField> asList);
}
