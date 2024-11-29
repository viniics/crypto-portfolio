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

    private double ammount;

    public Token(String token) {
        this.token = token;
        this.ammount = 0;
    }

}
