package ma.alten.test.model;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.alten.test.dto.ProductDTO;

@AllArgsConstructor
@Getter
public class PagedProductResult {
    private Integer page;
    private Long total;
    private Set<ProductDTO> productDTOS;
}
