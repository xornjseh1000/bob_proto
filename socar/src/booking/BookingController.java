package booking;

import javax.swing.JOptionPane;

import car.CarBean;

public class BookingController {
	public static void main(String[] args) {
		while(true){
			switch (JOptionPane.showInputDialog("1 : 모든 차량 보기")) {
			case "1":
				BookingService service = BookingServiceImpl.getInstance();
				JOptionPane.showMessageDialog(null, service.socarSearch());
				break;

			default:
				break;
			}
		}
	}
}
