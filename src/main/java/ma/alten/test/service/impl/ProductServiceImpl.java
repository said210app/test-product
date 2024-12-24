package ma.alten.test.service.impl;

import lombok.RequiredArgsConstructor;
import ma.alten.test.exception.BusinessException;
import ma.alten.test.exception.ErrorCode;
import ma.alten.test.mapper.ProductMapper;
import ma.alten.test.dto.ProductDTO;
import ma.alten.test.repository.ProductJpaRepository;
import ma.alten.test.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductJpaRepository repository;
    private final ProductMapper mapper;


    @Override
    public ProductDTO getProductById(Long productId) {
        var optionalProduct = repository.findById(productId);
        if (optionalProduct.isEmpty()) {
            throw new BusinessException(ErrorCode.NOT_FOUND);
        }
        return mapper.toDto(optionalProduct.get());
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return mapper.toDtos(repository.findAll());
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        return mapper.toDto(repository.save(mapper.toModel(productDTO)));
    }

    @Override
    public void updateProduct(Long productId, ProductDTO productDTO) {
        var optionalProduct = repository.findById(productId);
        if (optionalProduct.isEmpty()) {
            throw new BusinessException(ErrorCode.NOT_FOUND);
        }
        var existingProduct = optionalProduct.get();
        BeanUtils.copyProperties(productDTO, existingProduct, "id", "createdAt", "updatedAt");
        repository.save(existingProduct);
    }

    @Override
    public void deleteProduct(Long productId) {
        boolean productExists = repository.existsById(productId);
        if (!productExists) {
            throw new BusinessException(ErrorCode.NOT_FOUND);
        }
        repository.deleteById(productId);
    }

}
