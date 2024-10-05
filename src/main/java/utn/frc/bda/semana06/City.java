package utn.frc.bda.semana06;

import jakarta.persistence.*;

@Entity
@Table(name = "CITY")
public class City {

    @Id
    @Column(name = "CID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cid;

    @Basic
    @Column(name = "CNAME")
    private String name;

    public City(Integer cid, String name) {
        this.cid = cid;
        this.name = name;
    }

    public City() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer id) {
        this.cid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
