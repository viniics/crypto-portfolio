package cryptoPorfolio.crypto.model;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @Column(nullable = false)
    private String token;
    
    @Column(nullable = false)
    private Double fiatValue;
    
    @Column(nullable = false)
    private Double coinPrice;
    
    @Column
    private LocalDate purchaseDate;

    public Purchase(String token, Double fiatValue, Double coinPrice) {
        this.token = token;
        this.fiatValue = fiatValue;
        this.coinPrice = coinPrice;
    }

    public Purchase(String token, Double fiatValue, Double coinPrice, LocalDate purchaseDate) {
        this.token = token;
        this.fiatValue = fiatValue;
        this.coinPrice = coinPrice;
        this.purchaseDate = purchaseDate;
    }
    
}
