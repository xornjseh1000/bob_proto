package car;

import java.util.List;

public interface CarService {
	public void addCar(CarBean car);
	public List<CarBean> list();
}