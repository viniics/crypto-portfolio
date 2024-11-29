package cryptoPorfolio.crypto.service;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import cryptoPorfolio.crypto.dto.TokenDTO;
import cryptoPorfolio.crypto.model.Token;
import cryptoPorfolio.crypto.model.Wallet;
import cryptoPorfolio.crypto.repository.WalletRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class WalletService {
    private final WalletRepository walletRepository;

    public Token addTokenPurchase(TokenDTO tokenDTO, Long id){
        Wallet wallet = walletRepository.findById(id).orElseThrow(() -> new RuntimeException("Wallet not found with id: " + id));
        Token token = findTokenInWallet(wallet.getTokens(), tokenDTO.getToken());
        if(token == null && tokenDTO.getAmount()>0){
            //Criar o token
        }
        else if (token == null){
            throw new RuntimeErrorException(null, "You don't own this token!");
        }
        else token.changeBalance(tokenDTO.getAmount());
        walletRepository.save(wallet);
        return token;
    }
    
     public Token findTokenInWallet(List<Token> tokens,String token){
        for (Token t: tokens){
            if(t.getToken().equals(token)) return t;
        }
        return null;
    }
}
