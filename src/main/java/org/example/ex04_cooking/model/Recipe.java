package org.example.ex04_cooking.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

    private UUID id;

    @NotBlank
    @NotNull
    private String name;

    @NotEmpty
    private List<String> ingredients;

    @NotEmpty
    private List<String> steps;

    @NotNull
    private UUID categoryId;
}
