package com.xh.product.entity;

import javax.persistence.*;

/**
 * Created by ningcs on 2017/11/6.
 */
@Entity
@Table(name = "reserve")
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "r_id")
    private Long rId;
    @Column(name = "product_id")
    private Long productId;
    //库存总数
    @Column(name = "total_count")
    private Integer totalCount;
    //当前已购买数量
    @Column(name = "current_count")
    private Integer currentCount;

    public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    @Override
    public String toString() {
        return "Reserve{" +
                "rId=" + rId +
                ", productId=" + productId +
                ", totalCount=" + totalCount +
                ", currentCount=" + currentCount +
                '}';
    }
}
