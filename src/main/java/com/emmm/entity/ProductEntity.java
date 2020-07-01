package com.emmm.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "product", schema = "shop", catalog = "")
public class ProductEntity {
    private int pid;
    private String pname;
    private Double markPrice;
    private Double shopPrice;
    private String pimage;
    private Date pdate;
    private Integer isHot;
    private String pdesc;
    private Integer pflag;
    private String detial;
    private String cid;

    @Id
    @Column(name = "pid", nullable = false)
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "pname", nullable = true, length = 255)
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "mark_price", nullable = true, precision = 0)
    public Double getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(Double markPrice) {
        this.markPrice = markPrice;
    }

    @Basic
    @Column(name = "shop_price", nullable = true, precision = 0)
    public Double getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(Double shopPrice) {
        this.shopPrice = shopPrice;
    }

    @Basic
    @Column(name = "pimage", nullable = true, length = 255)
    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    @Basic
    @Column(name = "pdate", nullable = true)
    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    @Basic
    @Column(name = "is_hot", nullable = true)
    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    @Basic
    @Column(name = "pdesc", nullable = true, length = 255)
    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    @Basic
    @Column(name = "pflag", nullable = true)
    public Integer getPflag() {
        return pflag;
    }

    public void setPflag(Integer pflag) {
        this.pflag = pflag;
    }

    @Basic
    @Column(name = "detial", nullable = true, length = 255)
    public String getDetial() {
        return detial;
    }

    public void setDetial(String detial) {
        this.detial = detial;
    }

    @Basic
    @Column(name = "cid", nullable = false, length = 11)
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (pid != that.pid) return false;
        if (pname != null ? !pname.equals(that.pname) : that.pname != null) return false;
        if (markPrice != null ? !markPrice.equals(that.markPrice) : that.markPrice != null) return false;
        if (shopPrice != null ? !shopPrice.equals(that.shopPrice) : that.shopPrice != null) return false;
        if (pimage != null ? !pimage.equals(that.pimage) : that.pimage != null) return false;
        if (pdate != null ? !pdate.equals(that.pdate) : that.pdate != null) return false;
        if (isHot != null ? !isHot.equals(that.isHot) : that.isHot != null) return false;
        if (pdesc != null ? !pdesc.equals(that.pdesc) : that.pdesc != null) return false;
        if (pflag != null ? !pflag.equals(that.pflag) : that.pflag != null) return false;
        if (detial != null ? !detial.equals(that.detial) : that.detial != null) return false;
        if (cid != null ? !cid.equals(that.cid) : that.cid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid;
        result = 31 * result + (pname != null ? pname.hashCode() : 0);
        result = 31 * result + (markPrice != null ? markPrice.hashCode() : 0);
        result = 31 * result + (shopPrice != null ? shopPrice.hashCode() : 0);
        result = 31 * result + (pimage != null ? pimage.hashCode() : 0);
        result = 31 * result + (pdate != null ? pdate.hashCode() : 0);
        result = 31 * result + (isHot != null ? isHot.hashCode() : 0);
        result = 31 * result + (pdesc != null ? pdesc.hashCode() : 0);
        result = 31 * result + (pflag != null ? pflag.hashCode() : 0);
        result = 31 * result + (detial != null ? detial.hashCode() : 0);
        result = 31 * result + (cid != null ? cid.hashCode() : 0);
        return result;
    }
}
