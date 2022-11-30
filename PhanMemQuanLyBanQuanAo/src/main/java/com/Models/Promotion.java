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

public class Promotion implements Serializable {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private String id;

    @Column(name = "Code", columnDefinition = "Varchar(20)", unique = true)
    private String code;

    @Column(name = "Name", columnDefinition = "Nvarchar(MAX)")
    private String name;
    
    @Column(name = "decreaseNumber")
    private int DecreaseNumber;

    @Column(name = "StartDay")
    private Date startDay;

    @Column(name = "EndDay")
    private Date endDay;

    @Column(name = "Status")
    private int status;

    @OneToMany(mappedBy = "promotion", fetch = FetchType.LAZY)
    private List<PromotionDetails> listPromotionDetail;

    public Promotion(String code, String name, int DecreaseNumber, Date startDay, Date endDay, int status) {
        this.code = code;
        this.name = name;
        this.DecreaseNumber = DecreaseNumber;
        this.startDay = startDay;
        this.endDay = endDay;
        this.status = status;
    }

    public Promotion(String id) {
        this.id = id;
    }
}
