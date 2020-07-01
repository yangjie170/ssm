package com.emmm.entity;

import javax.persistence.*;

@Entity
@Table(name = "category", schema = "shop", catalog = "")
public class CategoryEntity {
    private String cid;
    private String cname;

    @Id
    @Column(name = "cid", nullable = false, length = 255)
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "cname", nullable = true, length = 255)
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (cid != null ? !cid.equals(that.cid) : that.cid != null) return false;
        if (cname != null ? !cname.equals(that.cname) : that.cname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid != null ? cid.hashCode() : 0;
        result = 31 * result + (cname != null ? cname.hashCode() : 0);
        return result;
    }
}
