package com.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Bill implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private String id;

    @ManyToOne
    @JoinColumn(name = "IdCustomer")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "IdStaff")
    private Staff staff;

    @Column(name = "Code", columnDefinition = "Varchar(20)", unique = true)
    private String code;

    @Column(name = "DateCreated")
    private Date dateCreated;

    @Column(name = "DateOfPayment")
    private Date dateOfPayment;

    @ManyToOne
    @JoinColumn(name = "IdPromotion")
    private Promotion promotion;

    @Column(name = "Status")
    private int status;

    @Column(name = "PhoneNumber", columnDefinition = "Varchar(30)")
    private String phoneNumber;

    @OneToMany(mappedBy = "bill", fetch = FetchType.LAZY)
    private List<BillDetails> listHoaDonChiTiet;
}
