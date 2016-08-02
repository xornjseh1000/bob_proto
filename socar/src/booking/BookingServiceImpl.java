package booking;

import java.util.List;

import car.CarBean;
import car.CarDAO;

public class BookingServiceImpl implements BookingService{
	private static BookingService instance = new BookingServiceImpl();
	CarDAO carDao = CarDAO.getInstnace(); 
	
	public static BookingService getInstance() {
		return instance;
	}

	private BookingServiceImpl() {
	}
	
	BookingDAO dao = BookingDAO.getInstance();
	
	@Override
	public List<CarBean> socarSearch() {
		return carDao.list();
	}

	@Override
	public List<CarBean> findBySearch(String model) {
		return carDao.findBy(model);
	}
	
	@Override
	public void reserve(CarBean car) {
		dao.insertHistory(car);
	}

}
