package com.miage.miageland.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Visiteur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
    private String prenom;
    private String adresseMail;

    @OneToMany(mappedBy = "visiteur", cascade = CascadeType.ALL)
    private List<Billet> billets;
}
