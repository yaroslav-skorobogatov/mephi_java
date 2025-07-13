package com.example.finalWork.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "first_name is required")
    @JsonProperty("first_name") //чтобы при сериализации отображалось поле как "first_name"
    private String firstName;

    @NotNull(message = "age is required")
    private Integer age;

    @NotNull(message = "country is required")
    @Enumerated(EnumType.STRING) //вроде нужно для того чтобы указать что это будет в бд само название, а не порядковый номер
    private Country country;
}