package com.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class ProductDetails implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private String id;

    @Column(name = "Code", columnDefinition = "Varchar(20)", unique = true)
    private String code;

    @ManyToOne
    @JoinColumn(name = "IdProduct")
    private Product product;

    @Column(name = "Size", columnDefinition = "Nvarchar(30)")
    private String size;

    @Column(name = "Color", columnDefinition = "Nvarchar(30)")
    private String color;

    @Column(name = "Describe", columnDefinition = "Nvarchar(MAX)")
    private String describe;

    @Column(name = "Amount")
    private int amount;

    @Column(name = "ImportPrice", columnDefinition = "Decimal(20,0)")
    private Float importPrice;

    @Column(name = "ExportPrice", columnDefinition = "Decimal(20,0)")
    private Float exportPrice;

    @Column(name = "Status")
    private int status;

    @OneToMany(mappedBy = "productDetails", fetch = FetchType.LAZY)
    private List<BillDetails> listBillDetails;
}
