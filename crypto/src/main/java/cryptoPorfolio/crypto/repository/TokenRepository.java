package cryptoPorfolio.crypto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cryptoPorfolio.crypto.model.Token;
@Repository
public interface TokenRepository extends JpaRepository<Token,String> {
    
}
