package controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Purchase;
import repositories.PurchaseRepository;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

	private final PurchaseRepository purchaseRepository;
	
	public PurchaseController(
			PurchaseRepository purchaseRepository) {
		this.purchaseRepository = purchaseRepository;
	}
	
	@PostMapping
	public void storePurchase(@RequestBody Purchase purchase) {
		purchaseRepository.storePurchase(purchase);
	}
}
