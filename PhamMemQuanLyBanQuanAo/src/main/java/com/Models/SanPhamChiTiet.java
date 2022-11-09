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
public class SanPhamChiTiet implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "id", columnDefinition = "uniqueidentifier")
    private String id;

    @ManyToOne
    @JoinColumn(name = "idSP")
    private SanPham sanPham;

    @ManyToOne
    @JoinColumn(name = "idSize")
    private Size size;

    @ManyToOne
    @JoinColumn(name = "idMauSac")
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "idDongSP")
    private DongSP dongSP;

    @Column(name = "MoTa", columnDefinition = "Nvarchar(MAX)")
    private String moTa;

    @Column(name = "SoLuongTon")
    private int soLuongTon;

    @Column(name = "GiaNhap", columnDefinition = "Decimal(20,0)")
    private Float giaNhap;

    @Column(name = "GiaBan", columnDefinition = "Decimal(20,0)")
    private Float giaBan;

    @OneToMany(mappedBy = "sanPhamChiTiet", fetch = FetchType.EAGER)
    private List<HoaDonChiTiet> listHoaDonChiTiet;
}
