package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import models.Purchase;

public class PurchaseRowMapper implements RowMapper<Purchase> {

	public Purchase mapRow(ResultSet rs, int i) throws SQLException {
		Purchase rowObject = new Purchase();
		rowObject.setId(rs.getInt("id"));
		rowObject.setProduct(rs.getString("product"));
		rowObject.setPrice(rs.getBigDecimal("price"));
		return rowObject;
	}
}
