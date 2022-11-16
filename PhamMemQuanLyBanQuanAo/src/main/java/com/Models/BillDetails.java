package com.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class BillDetails implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "idBill")
    private Bill bill;

    @Id
    @ManyToOne
    @JoinColumn(name = "idProductDetails")
    private ProductDetails productDetails;

    @Column(name = "Amount")
    private int amount;

    @Column(name = "UnitPrice", columnDefinition = "Decimal(20,0)")
    private Float unitPrice;

    @Column(name = "StatusProduct")
    private int statusProduct;

    @ManyToOne
    @JoinColumn(name = "idReplacementProductDetails")
    private ProductDetails replacementProductDetails;

    @Column(name = "Note", columnDefinition = "Nvarchar(50)")
    private String note;
}
