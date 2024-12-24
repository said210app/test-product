package ma.alten.test.service;

import java.util.List;

import ma.alten.test.dto.ProductDTO;

public interface ProductService {

    ProductDTO getProductById(Long productId);
    List<ProductDTO> getAllProducts();
    ProductDTO createProduct(ProductDTO productDTO);
    void updateProduct(Long productId, ProductDTO productDTO);
    void deleteProduct(Long productId);
}
