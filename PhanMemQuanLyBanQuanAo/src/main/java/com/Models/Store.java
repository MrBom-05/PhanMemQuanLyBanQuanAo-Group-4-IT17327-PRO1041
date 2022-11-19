package com.Models;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
@Entity
@Table
public class Store implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private String id;

    @Column(name = "Code", columnDefinition = "Varchar(20)", unique = true)
    private String code;

    @Column(name = "Name", columnDefinition = "Nvarchar(MAX)")
    private String name;

    @Column(name = "Address", columnDefinition = "Nvarchar(MAX)")
    private String diaChi;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IdStoreOwner", referencedColumnName = "Id")
    private Staff staffOwner;
    @Column(name = "Status")
    private int status;

    @OneToMany(mappedBy = "store", fetch = FetchType.LAZY)
    private List<Staff> listStaff;

    @OneToMany(mappedBy = "store", fetch = FetchType.LAZY)
    private List<Bill> listBill;

    public Store(String code, String name, String diaChi, int status) {
        this.code = code;
        this.name = name;
        this.diaChi = diaChi;
        this.status = status;
    }

    @Override
    public String toString() {
        return code + name;
    }

}
