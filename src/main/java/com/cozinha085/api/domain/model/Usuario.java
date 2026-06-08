package com.cozinha085.api.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String nomeCompleto;

    @NotBlank
    @Size(min = 10, max = 15)
    @Column(nullable = false)
    private String telefone;

    @Email
    private String email;

    @Size(min = 6)
    private String senha;

    @NotBlank
    @Column(nullable = false)
    private String role;
}
