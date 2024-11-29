package cryptoPorfolio.crypto.service;

import org.springframework.stereotype.Service;

import cryptoPorfolio.crypto.dto.TokenDTO;
import cryptoPorfolio.crypto.model.Token;
import cryptoPorfolio.crypto.repository.TokenRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TokenService {
    private final TokenRepository tokenRepository;

    
}
