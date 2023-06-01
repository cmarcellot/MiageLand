package com.miage.miageland.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Visiteur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
    private String prenom;
    private String adresseMail;

    @OneToMany(mappedBy = "visiteur", cascade = CascadeType.ALL)
    private List<Billet> billets;

    public void reserverBillet() {
        // Logique pour réserver un billet
    }

    public void payerBillet() {
        // Logique pour payer un billet
    }

    public void annulerBillet() {
        // Logique pour annuler un billet
    }

    public void consulterBillet() {
        // Logique pour consulter un billet
    }

    public void consulterAttractions() {
        // Logique pour consulter les attractions
    }
}
