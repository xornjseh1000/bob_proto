package history;

import java.util.List;

import car.CarBean;

public interface HistoryService {
	public void addReserve(CarBean car, int rentTime);
	public List<HistoryBean> list();
}
