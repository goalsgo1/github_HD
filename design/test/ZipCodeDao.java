package design.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import com.uitl.DBConnectionMgr;

public class ZipCodeDao {
	DBConnectionMgr dbMgr = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Connection con = null;// 재사용, 유지하고싶으니까 전변으로

	public ZipCodeVO[] getZipCodeList(String dong) {
		ZipCodeVO zVOS[] = null;// 결정안함
		dbMgr = DBConnectionMgr.getInstance();
		StringBuilder sql = new StringBuilder();

		sql.append(" SELECT zipcode, address");
		sql.append(" FROM zipcode_t ");
		sql.append(" WHERE dong LIKE ?");
		try {
			con = dbMgr.getConnetcion();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setNString(1, dong + "%");
			rs = pstmt.executeQuery();
			ZipCodeVO zVO = null;
			Vector v = new Vector();
			while (rs.next()) {
				zVO = new ZipCodeVO();
				zVO.setZipcode(rs.getInt("zipcode"));
				zVO.setAddress(rs.getString("address"));
				v.add(zVO);
			}
			zVOS = new ZipCodeVO[v.size()];
			v.copyInto(zVOS);
		} catch (Exception e) {

		}
		return zVOS;
	}
}
