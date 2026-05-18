package api.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import api.product.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}