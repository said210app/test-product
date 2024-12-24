package ma.alten.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.alten.test.model.Product;

@Repository
public interface ProductJpaRepository extends JpaRepository<Product, Long> {
}
