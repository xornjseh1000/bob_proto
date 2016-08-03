package history;

import javax.swing.JOptionPane;

public class HistoryController {
	public static void main(String[] args) {
		HistoryService service = HistoryServiceImpl.getInstance();
		JOptionPane.showMessageDialog(null, service.list());
	}
}
