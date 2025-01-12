package org.real.project.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
@Component
@NoArgsConstructor
public class Author {
    private Integer id;
    private String firstName;
    private String lastName;
    private List<Product> products;
}
