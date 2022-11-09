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
    @JoinColumn(name = "idHoaDon")
    private Bill bill;

    @Id
    @ManyToOne
    @JoinColumn(name = "idSanPhamChiTiet")
    private ProductDetails productDetails;

    @Column(name = "Amount")
    private int amount;

    @Column(name = "UnitPrice", columnDefinition = "Decimal(20,0)")
    private Float unitPrice;
}
