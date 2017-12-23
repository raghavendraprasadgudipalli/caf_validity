package com.caf.valididty.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Scancaf.
 */
@Entity
@Table(name = "scancaf")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "scancaf")
public class Scancaf implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sourcebox")
    private String sourcebox;
    
    @Transient
    private String category;
    @Transient
    private String churntype;   

    @Column(name = "category_1")
    private String category1;

    @Column(name = "category_2")
    private String category2;

    @Column(name = "category_3")
    private String category3;

    @Column(name = "category_4")
    private String category4;

    @Column(name = "category_5")
    private String category5;

    @Column(name = "count_category_1")
    private Integer countCategory1;

    @Column(name = "count_category_2")
    private Integer countCategory2;

    @Column(name = "count_category_3")
    private Integer countCategory3;

    @Column(name = "count_category_4")
    private Integer countCategory4;

    @Column(name = "count_category_5")
    private Integer countCategory5;

    @Column(name = "cafbarcode")
    private String cafbarcode;

    @Column(name = "colorcode")
    private String colorcode;

	@Column(name = "jhi_user")
    private String user;

    @Column(name = "userdate")
    private LocalDate userdate;

    @Column(name = "boxstatus")
    private String boxstatus;

    @Column(name = "sourceboxstaus")
    private String sourceboxstaus;

    @Column(name = "mobilenumber")
    private Long mobilenumber;

    @Column(name = "centralbarcode")
    private String centralbarcode;

    @Column(name = "caftype")
    private String caftype;
    
    @Column(name = "secaudit")
    private String secaudit;
    
    @Column(name = "secauditdate")
    private LocalDate secauditdate;


    // jhipster-needle-entity-add-field - Jhipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSourcebox() {
        return sourcebox;
    }

    public Scancaf sourcebox(String sourcebox) {
        this.sourcebox = sourcebox;
        return this;
    }

    public void setSourcebox(String sourcebox) {
        this.sourcebox = sourcebox;
    }

    public String getCategory1() {
        return category1;
    }

    public Scancaf category1(String category1) {
        this.category1 = category1;
        return this;
    }

    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    public String getChurntype() {
		return churntype;
	}

	public void setChurntype(String churntype) {
		this.churntype = churntype;
	}
	
	 public Scancaf churntype(String churntype) {
	        this.churntype = churntype;
	        return this;
	    }

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	 public Scancaf category(String category) {
	        this.category = category;
	        return this;
	    }

	public String getCategory2() {
        return category2;
    }

    public Scancaf category2(String category2) {
        this.category2 = category2;
        return this;
    }

    public void setCategory2(String category2) {
        this.category2 = category2;
    }

    public String getCategory3() {
        return category3;
    }

    public Scancaf category3(String category3) {
        this.category3 = category3;
        return this;
    }

    public void setCategory3(String category3) {
        this.category3 = category3;
    }

    public String getCategory4() {
        return category4;
    }

    public Scancaf category4(String category4) {
        this.category4 = category4;
        return this;
    }

    public void setCategory4(String category4) {
        this.category4 = category4;
    }

    public String getCategory5() {
        return category5;
    }

    public Scancaf category5(String category5) {
        this.category5 = category5;
        return this;
    }

    public void setCategory5(String category5) {
        this.category5 = category5;
    }

    public Integer getCountCategory1() {
        return countCategory1;
    }

    public Scancaf countCategory1(Integer countCategory1) {
        this.countCategory1 = countCategory1;
        return this;
    }

    public void setCountCategory1(Integer countCategory1) {
        this.countCategory1 = countCategory1;
    }

    public Integer getCountCategory2() {
        return countCategory2;
    }

    public Scancaf countCategory2(Integer countCategory2) {
        this.countCategory2 = countCategory2;
        return this;
    }

    public void setCountCategory2(Integer countCategory2) {
        this.countCategory2 = countCategory2;
    }

    public Integer getCountCategory3() {
        return countCategory3;
    }

    public Scancaf countCategory3(Integer countCategory3) {
        this.countCategory3 = countCategory3;
        return this;
    }

    public void setCountCategory3(Integer countCategory3) {
        this.countCategory3 = countCategory3;
    }

    public Integer getCountCategory4() {
        return countCategory4;
    }

    public Scancaf countCategory4(Integer countCategory4) {
        this.countCategory4 = countCategory4;
        return this;
    }

    public void setCountCategory4(Integer countCategory4) {
        this.countCategory4 = countCategory4;
    }

    public Integer getCountCategory5() {
        return countCategory5;
    }

    public Scancaf countCategory5(Integer countCategory5) {
        this.countCategory5 = countCategory5;
        return this;
    }

    public void setCountCategory5(Integer countCategory5) {
        this.countCategory5 = countCategory5;
    }

    public String getCafbarcode() {
        return cafbarcode;
    }

    public Scancaf cafbarcode(String cafbarcode) {
        this.cafbarcode = cafbarcode;
        return this;
    }

    public void setCafbarcode(String cafbarcode) {
        this.cafbarcode = cafbarcode;
    }

    public String getColorcode() {
        return colorcode;
    }

    public Scancaf colorcode(String colorcode) {
        this.colorcode = colorcode;
        return this;
    }

    public void setColorcode(String colorcode) {
        this.colorcode = colorcode;
    }

    public String getUser() {
        return user;
    }

    public Scancaf user(String user) {
        this.user = user;
        return this;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LocalDate getUserdate() {
        return userdate;
    }

    public Scancaf userdate(LocalDate userdate) {
        this.userdate = userdate;
        return this;
    }

    public void setUserdate(LocalDate userdate) {
        this.userdate = userdate;
    }

    public String getBoxstatus() {
        return boxstatus;
    }

    public Scancaf boxstatus(String boxstatus) {
        this.boxstatus = boxstatus;
        return this;
    }

    public void setBoxstatus(String boxstatus) {
        this.boxstatus = boxstatus;
    }

    public String getSourceboxstaus() {
        return sourceboxstaus;
    }

    public Scancaf sourceboxstaus(String sourceboxstaus) {
        this.sourceboxstaus = sourceboxstaus;
        return this;
    }

    public void setSourceboxstaus(String sourceboxstaus) {
        this.sourceboxstaus = sourceboxstaus;
    }

    public Long getMobilenumber() {
        return mobilenumber;
    }

    public Scancaf mobilenumber(Long mobilenumber) {
        this.mobilenumber = mobilenumber;
        return this;
    }

    public void setMobilenumber(Long mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getCentralbarcode() {
        return centralbarcode;
    }

    public Scancaf centralbarcode(String centralbarcode) {
        this.centralbarcode = centralbarcode;
        return this;
    }

    public void setCentralbarcode(String centralbarcode) {
        this.centralbarcode = centralbarcode;
    }

    public String getCaftype() {
        return caftype;
    }

    public Scancaf caftype(String caftype) {
        this.caftype = caftype;
        return this;
    }

    public void setCaftype(String caftype) {
        this.caftype = caftype;
    }
    
    public String getSecaudit() {
  		return secaudit;
  	}

  	public void setSecaudit(String secaudit) {
  		this.secaudit = secaudit;
  	}

  	public LocalDate getSecauditdate() {
  		return secauditdate;
  	}

  	public void setSecauditdate(LocalDate secauditdate) {
  		this.secauditdate = secauditdate;
  	}
  	 public Scancaf secauditdate(LocalDate secauditdate) {
         this.secauditdate = secauditdate;
         return this;
     }
    // jhipster-needle-entity-add-getters-setters - Jhipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Scancaf scancaf = (Scancaf) o;
        if (scancaf.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), scancaf.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Scancaf{" +
            "id=" + getId() +
            ", sourcebox='" + getSourcebox() + "'" +
            ", category1='" + getCategory1() + "'" +
            ", category2='" + getCategory2() + "'" +
            ", category3='" + getCategory3() + "'" +
            ", category4='" + getCategory4() + "'" +
            ", category5='" + getCategory5() + "'" +
            ", countCategory1='" + getCountCategory1() + "'" +
            ", countCategory2='" + getCountCategory2() + "'" +
            ", countCategory3='" + getCountCategory3() + "'" +
            ", countCategory4='" + getCountCategory4() + "'" +
            ", countCategory5='" + getCountCategory5() + "'" +
            ", cafbarcode='" + getCafbarcode() + "'" +
            ", colorcode='" + getColorcode() + "'" +
            ", user='" + getUser() + "'" +
            ", userdate='" + getUserdate() + "'" +
            ", boxstatus='" + getBoxstatus() + "'" +
            ", sourceboxstaus='" + getSourceboxstaus() + "'" +
            ", mobilenumber='" + getMobilenumber() + "'" +
            ", centralbarcode='" + getCentralbarcode() + "'" +
            ", caftype='" + getCaftype() + "'" +
            "}";
    }
}