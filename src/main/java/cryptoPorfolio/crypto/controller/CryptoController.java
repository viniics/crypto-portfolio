package cryptoPorfolio.crypto.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cryptoPorfolio.crypto.dto.PurchaseDTO;
import cryptoPorfolio.crypto.model.Purchase;
import cryptoPorfolio.crypto.service.CryptoService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CryptoController {

    private final CryptoService cryptoService;

    @PostMapping("/addPurchase")
    public ResponseEntity<?> insertPurchase(@RequestBody PurchaseDTO purchaseDTO){
        Purchase purchase = cryptoService.insertNewPurchase(purchaseDTO);
        return ResponseEntity.ok(purchase);
    }

    @GetMapping("/getPurchases/{token}")
    public ResponseEntity<?> getPurchasesByToken(@PathVariable String token){
        List<Purchase> tokenPurchases = cryptoService.findTokenPurchaseHistory(token);
        return ResponseEntity.ok(tokenPurchases);
    }

    @GetMapping("/getTokenBalance/{token}")
    public ResponseEntity<?> getTokenBalance(@PathVariable String token){
        String tokenBalance = "toDo";
        return ResponseEntity.ok(tokenBalance);
    }
}
