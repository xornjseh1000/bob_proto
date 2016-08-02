package history;

public class HistoryController {
	public static void main(String[] args) {
		HistoryService history = HistoryServiceImpl.getInstance();
		System.out.println(history.list());
	}
}
