package com.emmm.entity;

import javax.persistence.*;

@Entity
@Table(name = "ordergoods", schema = "shop", catalog = "")
public class OrdergoodsEntity {
    private int goodsId;
    private String name;
    private Integer goodsNumber;
    private String subtotal;
    private String formatedShopPrice;
    private String img;
    private String orderid;

    @Basic
    @Column(name = "goods_id", nullable = false)
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "formated_shop_price", nullable = true, length = 10)
    public String getFormatedShopPrice() {
        return formatedShopPrice;
    }

    public void setFormatedShopPrice(String formatedShopPrice) {
        this.formatedShopPrice = formatedShopPrice;
    }

    @Basic
    @Column(name = "img", nullable = true, length = 255)
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Id
    @Column(name = "orderid", nullable = false, length = 255)
    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdergoodsEntity that = (OrdergoodsEntity) o;

        if (goodsId != that.goodsId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (goodsNumber != null ? !goodsNumber.equals(that.goodsNumber) : that.goodsNumber != null) return false;
        if (subtotal != null ? !subtotal.equals(that.subtotal) : that.subtotal != null) return false;
        if (formatedShopPrice != null ? !formatedShopPrice.equals(that.formatedShopPrice) : that.formatedShopPrice != null)
            return false;
        if (img != null ? !img.equals(that.img) : that.img != null) return false;
        if (orderid != null ? !orderid.equals(that.orderid) : that.orderid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = goodsId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (goodsNumber != null ? goodsNumber.hashCode() : 0);
        result = 31 * result + (subtotal != null ? subtotal.hashCode() : 0);
        result = 31 * result + (formatedShopPrice != null ? formatedShopPrice.hashCode() : 0);
        result = 31 * result + (img != null ? img.hashCode() : 0);
        result = 31 * result + (orderid != null ? orderid.hashCode() : 0);
        return result;
    }
}
