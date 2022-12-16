package ru.sping.lab.db;

import javax.persistence.*;

@Entity
@Table(name = "fraza", schema = "dop_laba", catalog = "")
public class FrazaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "fraza")
    private String fraza;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFraza() {
        return fraza;
    }

    public void setFraza(String fraza) {
        this.fraza = fraza;
    }
}
