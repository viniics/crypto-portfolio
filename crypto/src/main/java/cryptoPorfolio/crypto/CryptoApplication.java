package cryptoPorfolio.crypto;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import cryptoPorfolio.crypto.dto.PurchaseDTO;
import cryptoPorfolio.crypto.model.Purchase;
import cryptoPorfolio.crypto.service.CryptoService;

@SpringBootApplication
public class CryptoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CryptoApplication.class, args);
		CryptoService cryptoService = context.getBean(CryptoService.class);

        PurchaseDTO purchaseDTO = new PurchaseDTO("SOL", 10.1, 500000.0, LocalDate.now()); // Data pode ser null ou definir uma data

        Purchase savedPurchase = cryptoService.insertNewPurchase(purchaseDTO);

        System.out.println("Compra: " + savedPurchase);
	}

}
