package cryptoPorfolio.crypto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cryptoPorfolio.crypto.model.Wallet;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {

    
    
}
