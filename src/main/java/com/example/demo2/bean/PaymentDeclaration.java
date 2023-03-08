package com.example.demo2.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PaymentDeclaration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double montant;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String type;
    private Double totalPaye;
    @ManyToOne
    private DemandeDeclaration demandeDeclaration;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getTotal() {
        return totalPaye;
    }

    public void setTotal(Double total) {
        this.totalPaye = total;
    }

    public DemandeDeclaration getDemandeDeclaration() {
        return demandeDeclaration;
    }

    public void setDemandeDeclaration(DemandeDeclaration demandeDeclaration) {
        this.demandeDeclaration = demandeDeclaration;
    }
}
