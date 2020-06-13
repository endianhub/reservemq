package com.xh.delievery.dto;

/**
 * Created by ningcs on 2017/11/6.
 */
public class OrderInfo {
    private Long orderId;
    private Integer userId;
    private String productName;
    private Long productId;
    //购买数量
    private Integer buyCount;

    //消费金额
    private String monetary;
    //配送
    private String delivery;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public String getMonetary() {
        return monetary;
    }

    public void setMonetary(String monetary) {
        this.monetary = monetary;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", productName='" + productName + '\'' +
                ", productId=" + productId +
                ", buyCount=" + buyCount +
                ", monetary='" + monetary + '\'' +
                ", delivery='" + delivery + '\'' +
                '}';
    }
}
