package ma.alten.test.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import ma.alten.test.dto.ProductDTO;
import ma.alten.test.model.Product;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-30T23:47:50+0100",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.2.jar, environment: Java 21.0.4 (Ubuntu)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO toDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO.ProductDTOBuilder productDTO = ProductDTO.builder();

        productDTO.id( product.getId() );
        productDTO.code( product.getCode() );
        productDTO.name( product.getName() );
        productDTO.description( product.getDescription() );
        productDTO.image( product.getImage() );
        productDTO.category( product.getCategory() );
        productDTO.price( product.getPrice() );
        productDTO.quantity( product.getQuantity() );
        productDTO.internalReference( product.getInternalReference() );
        productDTO.shellId( product.getShellId() );
        productDTO.inventoryStatus( product.getInventoryStatus() );
        productDTO.rating( product.getRating() );
        productDTO.createdAt( product.getCreatedAt() );
        productDTO.updatedAt( product.getUpdatedAt() );

        return productDTO.build();
    }

    @Override
    public List<ProductDTO> toDtos(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductDTO> list = new ArrayList<ProductDTO>( products.size() );
        for ( Product product : products ) {
            list.add( toDto( product ) );
        }

        return list;
    }

    @Override
    public Product toModel(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product.ProductBuilder product = Product.builder();

        product.id( productDTO.getId() );
        product.code( productDTO.getCode() );
        product.name( productDTO.getName() );
        product.description( productDTO.getDescription() );
        product.image( productDTO.getImage() );
        product.category( productDTO.getCategory() );
        product.price( productDTO.getPrice() );
        product.quantity( productDTO.getQuantity() );
        product.internalReference( productDTO.getInternalReference() );
        product.shellId( productDTO.getShellId() );
        product.inventoryStatus( productDTO.getInventoryStatus() );
        product.rating( productDTO.getRating() );
        product.createdAt( productDTO.getCreatedAt() );
        product.updatedAt( productDTO.getUpdatedAt() );

        return product.build();
    }

    @Override
    public List<Product> toModels(List<ProductDTO> productDTOs) {
        if ( productDTOs == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( productDTOs.size() );
        for ( ProductDTO productDTO : productDTOs ) {
            list.add( toModel( productDTO ) );
        }

        return list;
    }
}
