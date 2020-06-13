package com.xh.delievery.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/11
 */
@Entity
@Table(name = "delievery")
public class Delievery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "d_id")
    private Long dId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "order_id")
    private Long orderId;
    @Column(name = "delievery")
    private String delievery;
    @Column(name = "create_time")
    private Date createTime;

    public Long getdId() {
        return dId;
    }

    public void setdId(Long dId) {
        this.dId = dId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getDelievery() {
        return delievery;
    }

    public void setDelievery(String delievery) {
        this.delievery = delievery;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Delievery{" +
                "dId=" + dId +
                ", userId=" + userId +
                ", orderId='" + orderId + '\'' +
                ", delievery='" + delievery + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
