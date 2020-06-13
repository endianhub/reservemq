package com.xh.order.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ningcs on 2017/11/8.
 */
@Entity
@Table(name = "order_info")
public class OrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;
    //商品名字
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "user_id")
    private Integer userId;
    //购买数量
    @Column(name = "buy_count")
    private Integer buyCount;
    //消费金额
    @Column(name = "monetary")
    private Double monetary;
    @Column(name = "create_time")
    private Date createTime;

    public Long getId() {
        return orderId;
    }

    public void setId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public Double getMonetary() {
        return monetary;
    }

    public void setMonetary(Double monetary) {
        this.monetary = monetary;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", userId=" + userId +
                ", buyCount=" + buyCount +
                ", monetary=" + monetary +
                ", createTime=" + createTime +
                '}';
    }
}
