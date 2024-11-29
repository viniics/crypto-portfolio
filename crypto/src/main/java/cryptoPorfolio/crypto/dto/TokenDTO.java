package cryptoPorfolio.crypto.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenDTO {
    private String token;

    private double amount;

    public TokenDTO(String token) {
        this.token = token;
        this.amount = 0;
    }
}
