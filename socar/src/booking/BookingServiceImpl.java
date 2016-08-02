package booking;

import java.util.List;

import car.CarBean;
import car.CarService;
import car.CarServiceImpl;
import history.HistoryService;
import history.HistoryServiceImpl;

public class BookingServiceImpl implements BookingService{
	private static BookingService instance = new BookingServiceImpl();
	CarService carService = CarServiceImpl.getInstance();
	
	public static BookingService getInstance() {
		return instance;
	}

	private BookingServiceImpl() {
	}
	
	BookingDAO dao = BookingDAO.getInstance();
	
	@Override
	public List<CarBean> socarSearch() {	//차종에서 전체 차종이면 car DB에 들어있는 모든 차량을 불러옴
		return carService.list();
	}

	@Override
	public List<CarBean> findBySearch(String model) {	//차종에서 모델명을 입력하면 해당 차량만 불러옴
		return carService.findBy(model);
	}
	
	@Override
	public void reserve(String model) {
		HistoryService hService = HistoryServiceImpl.getInstance();
		hService.addReserve(this.findByModel(model));
	}

	@Override
	public CarBean findByModel(String model) {
		return dao.findByModel(model);
	}
}
