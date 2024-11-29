package cryptoPorfolio.crypto.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseDTO {

    private String token;
    private Double fiatValue;
    private Double coinPrice;
    private LocalDate purchaseDate;

    public PurchaseDTO() {}

    public PurchaseDTO(String token, Double fiatValue, Double coinPrice, LocalDate purchaseDate) {
        this.token = token;
        this.fiatValue = fiatValue;
        this.coinPrice = coinPrice;
        this.purchaseDate = purchaseDate;
    }


}
