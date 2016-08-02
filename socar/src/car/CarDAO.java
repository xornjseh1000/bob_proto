package car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;

public class CarDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	private static CarDAO instnace = new CarDAO();
	
	public static CarDAO getInstnace() {
		return instnace;
	}

	private CarDAO() {
		con = DatabaseFactory.createDatabase(
			Vendor.ORACLE,
			Constants.USER_ID,
			Constants.USER_PW).getConnection();
	}
	
	public int insert(CarBean car){
		int result = 0;
		String sql = "insert into car(car_seq, car_zone, model, pay_km, oil, car_option)"
				+ "values(car_seq.nextval, ?, ?, ?, ?, ?)"; 
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, car.getZone());
			pstmt.setString(2, car.getModel());
			pstmt.setString(3, car.getPayKm());
			pstmt.setString(4, car.getOil());
			pstmt.setString(5, car.getOption());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public List<CarBean> list() {
		List<CarBean> list = new ArrayList<CarBean>();
		String sql = "select * from car" + "";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				CarBean temp = new CarBean();
				temp.setZone(rs.getString("CAR_ZONE"));
				temp.setModel(rs.getString("MODEL"));
				temp.setPayKm(rs.getString("PAY_KM"));
				temp.setOil(rs.getString("OIL"));
				temp.setOption(rs.getString("CAR_OPTION"));
				list.add(temp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public List<CarBean> findBy(String model) {
		List<CarBean> list = new ArrayList<CarBean>();
		String sql = "select * from car where model = " + model;
		
		return list;
	}
}
