package api.product.support;

import org.springframework.stereotype.Component;
import api.product.api.request.ProductRequest;
import api.product.api.response.ProductResponse;
import api.product.domain.Product;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest request) {
        return new Product(null, request.getName());
    }

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }
}