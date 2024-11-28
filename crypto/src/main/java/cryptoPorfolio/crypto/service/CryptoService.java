package cryptoPorfolio.crypto.service;

import org.springframework.stereotype.Service;

import cryptoPorfolio.crypto.dto.PurchaseDTO;
import cryptoPorfolio.crypto.model.Purchase;
import cryptoPorfolio.crypto.repository.PurchaseRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CryptoService {

    private final PurchaseRepository purchaseRepository;

    public Purchase insertNewPurchase(PurchaseDTO purchaseDTO){
        Purchase purchase = convertPurchaseDTOToPurchase(purchaseDTO);
        return purchaseRepository.save(purchase);
    }

    private Purchase convertPurchaseDTOToPurchase(PurchaseDTO purchaseDTO){
    Purchase purchase = new Purchase(purchaseDTO.getToken(), purchaseDTO.getFiatValue(), purchaseDTO.getCoinPrice(), purchaseDTO.getPurchaseDate());
    return purchase;
    }
}
