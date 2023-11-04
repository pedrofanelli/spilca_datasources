package repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import models.Purchase;

@Repository
public class PurchaseRepository {

	private final JdbcTemplate jdbc;
	
	public PurchaseRepository(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	public void storePurchase(Purchase purchase) {
		
		String sql = "INSERT INTO purchase (product, price) VALUES (?, ?)";
		
		jdbc.update(sql, purchase.getProduct(), purchase.getPrice());
		
		
	}
	
}
