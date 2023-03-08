package com.example.demo2.bean;

import javax.persistence.*;
import java.util.Date;
@Entity
public class DemandeDeclaration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dateDeclaration;
    @ManyToOne
    private CategorieDeclaration categorieDeclaration;
    @ManyToOne
    private Comptable comptableDeclarant;
    @ManyToOne
    private Comptable comptableVerifiant;
    @ManyToOne
    private Societe Societe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public CategorieDeclaration getCategorieDeclaration() {
        return categorieDeclaration;
    }

    public void setCategorieDeclaration(CategorieDeclaration categorieDeclaration) {
        this.categorieDeclaration = categorieDeclaration;
    }

    public Comptable getComptableDeclarant() {
        return comptableDeclarant;
    }

    public void setComptableDeclarant(Comptable comptableDeclarant) {
        this.comptableDeclarant = comptableDeclarant;
    }

    public Comptable getComptableVerifiant() {
        return comptableVerifiant;
    }

    public void setComptableVerifiant(Comptable comptableVerifiant) {
        this.comptableVerifiant = comptableVerifiant;
    }

    public com.example.demo2.bean.Societe getSociete() {
        return Societe;
    }

    public void setSociete(com.example.demo2.bean.Societe societe) {
        Societe = societe;
    }
}
