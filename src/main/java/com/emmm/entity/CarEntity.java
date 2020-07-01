package com.emmm.entity;

import javax.persistence.*;

@Entity
@Table(name = "car", schema = "shop", catalog = "")
public class CarEntity {
    private int uid;
    private int recId;
    private Integer goodsId;
    private String goodsName;
    private Integer goodsNumber;
    private String subtotal;
    private String img;

    @Basic
    @Column(name = "uid", nullable = false)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Id
    @Column(name = "rec_id", nullable = false)
    public int getRecId() {
        return recId;
    }

    public void setRecId(int recId) {
        this.recId = recId;
    }

    @Basic
    @Column(name = "goods_id", nullable = true)
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_name", nullable = true, length = 255)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "goods_number", nullable = true)
    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    @Basic
    @Column(name = "subtotal", nullable = true, length = 255)
    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    @Basic
    @Column(name = "img", nullable = true, length = 255)
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarEntity carEntity = (CarEntity) o;

        if (uid != carEntity.uid) return false;
        if (recId != carEntity.recId) return false;
        if (goodsId != null ? !goodsId.equals(carEntity.goodsId) : carEntity.goodsId != null) return false;
        if (goodsName != null ? !goodsName.equals(carEntity.goodsName) : carEntity.goodsName != null) return false;
        if (goodsNumber != null ? !goodsNumber.equals(carEntity.goodsNumber) : carEntity.goodsNumber != null)
            return false;
        if (subtotal != null ? !subtotal.equals(carEntity.subtotal) : carEntity.subtotal != null) return false;
        if (img != null ? !img.equals(carEntity.img) : carEntity.img != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + recId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (goodsNumber != null ? goodsNumber.hashCode() : 0);
        result = 31 * result + (subtotal != null ? subtotal.hashCode() : 0);
        result = 31 * result + (img != null ? img.hashCode() : 0);
        return result;
    }
}
