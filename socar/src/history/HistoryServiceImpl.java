package history;

import java.util.List;

import car.CarBean;

public class HistoryServiceImpl implements HistoryService {
	private static HistoryService instance = new HistoryServiceImpl();
	HistoryDAO dao = HistoryDAO.getInstance();

	public static HistoryService getInstance() {
		return instance;
	}

	private HistoryServiceImpl() {
	}

	@Override
	public void addReserve(CarBean car, int rentTime) {
		int price = Integer.parseInt(car.getPayKm()) * rentTime;
		dao.insert(car, price);
	}

	@Override
	public List<HistoryBean> list() {	//member의 session이 필요
		return dao.list();
	}
}
