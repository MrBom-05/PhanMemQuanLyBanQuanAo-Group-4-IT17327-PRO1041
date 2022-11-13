package com.Models;

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
@Entity
@Table
public class Staff implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private String id;

    @Column(name = "Code", columnDefinition = "Varchar(20)", unique = true)
    private String code;

    @Column(name = "FirstName", columnDefinition = "Nvarchar(30)")
    private String firstName;

    @Column(name = "LastName", columnDefinition = "Nvarchar(30)")
    private String lastName;

    @Column(name = "Sex", columnDefinition = "Nvarchar(10)")
    private String sex;

    @Column(name = "DateOfBirth")
    private Date dateOfBirth;

    @Column(name = "Address", columnDefinition = "Nvarchar(100)")
    private String address;

    @Column(name = "PhoneNumber", columnDefinition = "Varchar(30)")
    private String phoneNumber;

    @Column(name = "Email", columnDefinition = "Varchar(MAX)")
    private String email;

    @Column(name = "Status")
    private int status;

    @ManyToOne
    @JoinColumn(name = "IdStore")
    private Store store;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdStoreOwner", referencedColumnName = "Id")
    private Store storeOwner;

    @ManyToOne
    @JoinColumn(name = "IdRole")
    private Role role;

    @OneToMany(mappedBy = "staff", fetch = FetchType.LAZY)
    private List<Bill> listBill;

    @OneToOne(mappedBy = "staff")
    private User user;
}
