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

    @ManyToOne
    @JoinColumn(name = "IdProduct")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "IdSize")
    private Size size;

    @ManyToOne
    @JoinColumn(name = "IdColor")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "IdProductType")
    private ProductType productType;

    @Column(name = "Describe", columnDefinition = "Nvarchar(MAX)")
    private String describe;

    @Column(name = "Amount")
    private int amount;

    @Column(name = "ImportPrice", columnDefinition = "Decimal(20,0)")
    private Float importPrice;

    @Column(name = "ExportPrice", columnDefinition = "Decimal(20,0)")
    private Float exportPrice;

    @OneToMany(mappedBy = "productDetails", fetch = FetchType.LAZY)
    private List<BillDetails> listBillDetails;
}
