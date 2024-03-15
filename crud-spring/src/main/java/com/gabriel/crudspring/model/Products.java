package com.gabriel.crudspring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
//@Table(name = "produtos")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @Column(name = "produto", length = 300, nullable = false)
    private String product;

    @Column(name = "produtosku", length = 300, nullable = false)
    private String productSku;

    @Column(name = "produtonome", length = 300, nullable = false)
    private String productName;

    @Column(name = "produtopreco", length = 100, nullable = false)
    private String productPrice;
    
    @Column(name = "produtoshort", length = 300, nullable = false)
    private String productShortName;

    @Column(name = "produtodescicao", length = 300, nullable = false)
    private String productDescription;

    @Column(name = "produtotime", length = 300, nullable = false)
    private String deliveryTimeSpan;

    @Column(name = "produtoimg", length = 300, nullable = false)
    private String productImageUrl;

    
}
