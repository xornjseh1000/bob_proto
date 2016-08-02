package booking;

import java.util.List;

import car.CarBean;

public interface BookingService {
	public List<CarBean> socarSearch();
	public CarBean findByModel(String model);
	public List<CarBean> findBySearch(String model);
	public void reserve(String model);
}
