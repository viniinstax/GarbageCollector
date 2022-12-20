package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcessoBanco {

	public static void main(String[] args) throws Exception {
		
		String sql = "select id, name, sexo, email from pessoa";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try ( Connection con = DriverManager.getConnection(url, "system", "stockbr");
		PreparedStatement stm = con.prepareStatement(sql);
		ResultSet rs = stm.executeQuery();) {
			
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
		}
		
		
	}

}
