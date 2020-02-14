package com.miaoshaproject.miaosha.service.model;

import org.joda.time.DateTime;

import java.math.BigDecimal;

public class PromoModel {

    private  Integer id;

    //1：表示活动还未开始 2： 表示活动进行时 3：表示活动结束
    private Integer status;

    //活动名称
    private String promoName;
    //秒杀活动开始时间
    private DateTime startDate;
    //秒杀活动结束时间
    private DateTime endDate;
    //秒杀活动的适用商品
    private  Integer itemId;
    //秒杀活动的商品价格
    private BigDecimal promoItemPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getPromoItemPrice() {
        return promoItemPrice;
    }

    public void setPromoItemPrice(BigDecimal promoItemPrice) {
        this.promoItemPrice = promoItemPrice;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PromoModel{" +
                "id=" + id +
                ", status=" + status +
                ", promoName='" + promoName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", itemId=" + itemId +
                ", promoItemPrice=" + promoItemPrice +
                '}';
    }
}
