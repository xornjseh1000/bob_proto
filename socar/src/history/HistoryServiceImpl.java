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
	public void addReserve(CarBean car) {
		dao.insert(car);
	}

	@Override
	public List<HistoryBean> list() {
		return dao.list();
	}
}
