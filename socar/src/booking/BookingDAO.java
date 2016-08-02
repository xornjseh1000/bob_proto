package booking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import car.CarBean;
import global.Constants;
import global.DatabaseFactory;
import global.Vendor;

public class BookingDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	private static BookingDAO instance = new BookingDAO();
	
	public static BookingDAO getInstance() {
		return instance;
	}

	private BookingDAO() {
		con = DatabaseFactory.createDatabase(
			Vendor.ORACLE,
			Constants.USER_ID,
			Constants.USER_PW).getConnection();
	}

	public List<CarBean> findBy(BookingBean booking) {
		List<CarBean> list = new ArrayList<CarBean>();
		return list;
	}

	public int insertHistory(CarBean car) {  
		int result = 0;
		String sql = "insert into history (hist_seq, rent_date, rent_zone, car_model, pay_km) "
				+ "values (hist_seq.nextval, ?, ?, ?, ?)"; 	//id 후에 추가...
		return result;
	}
}
