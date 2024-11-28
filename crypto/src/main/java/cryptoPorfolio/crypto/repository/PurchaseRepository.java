package cryptoPorfolio.crypto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cryptoPorfolio.crypto.model.Purchase;
@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long>{
    
    List<Purchase> findByToken(String token);
    
}
