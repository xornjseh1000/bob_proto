package customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;

public class CustomerDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static CustomerDAO instance = new CustomerDAO();
	
	public static CustomerDAO getInstance() {
		return instance;
	}

	private CustomerDAO() {
		con = DatabaseFactory.createDatabase(
				Vendor.ORACLE,
				Constants.USER_ID,
				Constants.USER_PW).getConnection();
	}

	public int insert(CustomerBean customer) {	// 1대1문의하기 전송
		int result = 0;
//		MemberService service = MemberServiceImpl.getSession();
		String sql = "insert into customer (cust_seq, title, content, file_name, reg_date, id) "
				+ "values (cust_seq.nextval, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, customer.getTitle());
			pstmt.setString(2, customer.getContent());
			pstmt.setString(3, customer.getFileName());
			pstmt.setString(4, customer.getRegDate());
//			pstmt.setString(5, service.getSession.getId());	//member의 세션에서 getId()가 필요함
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

//	public List<CustomerBean> list() { // 공지사항 목록
//		String sql = "select * from announce";
//		List<CustomerBean> list = new ArrayList<CustomerBean>();
//		try {
//			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()){
//				CustomerBean temp = new CustomerBean();
//				temp.setTitleNum(rs.getInt("ANNOUNCE_NUM"));
//				temp.setTitle(rs.getString("TITLE"));
//				temp.setRegDate(rs.getString("REG_DATE"));
//				list.add(temp);
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list;
//	}

}
