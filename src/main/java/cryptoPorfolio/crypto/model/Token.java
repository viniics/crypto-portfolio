package cryptoPorfolio.crypto.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Token {
    @Id
    private String token;

    private double amount;

    public Token(String token) {
        this.token = token;
        this.amount = 0;
    }

    public double changeBalance(Double value){
        if(amount+value<0) throw new RuntimeException("You don't have enough tokens to sell!");
        amount += value;
        return amount;
    }

}
