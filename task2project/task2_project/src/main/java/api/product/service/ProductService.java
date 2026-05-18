package api.product.service;

import org.springframework.stereotype.Service;
import api.product.api.request.ProductRequest;
import api.product.api.response.ProductResponse;
import api.product.domain.Product;
import api.product.repository.ProductRepository;
import api.product.support.ProductMapper;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductService(ProductRepository repository, ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ProductResponse create(ProductRequest request) {
        Product product = mapper.toProduct(request);
        return mapper.toResponse(repository.save(product));
    }

    public ProductResponse find(Long id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public List<ProductResponse> findAll() {
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    public ProductResponse update(Long id, ProductRequest request) {
        Product existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        existing.setName(request.getName());
        return mapper.toResponse(repository.save(existing));
    }

    public void delete(Long id) {
        repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        repository.deleteById(id);
    }
}