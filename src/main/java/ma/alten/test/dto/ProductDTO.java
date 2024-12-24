package ma.alten.test.dto;

import java.time.LocalDateTime;

import lombok.*;
import ma.alten.test.model.InventoryStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductDTO {
    private Long id;
    private String code;
    private String name;
    private String description;
    private String image;
    private String category;
    private Double price;
    private Integer quantity;
    private String internalReference;
    private Long shellId;

    private InventoryStatus inventoryStatus;

    private Double rating;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
