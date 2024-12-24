package ma.alten.test.mapper;

import ma.alten.test.dto.ProductDTO;
import ma.alten.test.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {


    ProductDTO toDto(Product product);
    List<ProductDTO> toDtos(List<Product> products);

    Product toModel(ProductDTO productDTO);
    List<Product> toModels(List<ProductDTO> productDTOs);


}
