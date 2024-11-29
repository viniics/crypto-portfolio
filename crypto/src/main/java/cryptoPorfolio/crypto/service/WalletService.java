package cryptoPorfolio.crypto.service;

import org.springframework.stereotype.Service;

import cryptoPorfolio.crypto.dto.TokenDTO;
import cryptoPorfolio.crypto.model.Token;
import cryptoPorfolio.crypto.repository.WalletRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class WalletService {
    private final WalletRepository walletRepository;
    private final TokenService tokenService;

    public Token addTokenPurchase(TokenDTO tokenDTO){
        
        return null;
    }

    public Token addTokenSale(TokenDTO tokenDTO){

        return null;
    }
}
