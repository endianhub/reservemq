package com.xh.product.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ningcs on 2017/11/6.
 */
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Long pId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "img_md5")
    private String imgMd5;
    @Column(name = "publishers")
    private String publishers;
    @Column(name = "status")
    private Integer status;
    @Column(name = "price")
    private Double price;
    @Column(name = "create_time")
    private Date createTime;

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImgMd5() {
        return imgMd5;
    }

    public void setImgMd5(String imgMd5) {
        this.imgMd5 = imgMd5;
    }

    public String getPublishers() {
        return publishers;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId +
                ", productName='" + productName + '\'' +
                ", imgMd5='" + imgMd5 + '\'' +
                ", publishers='" + publishers + '\'' +
                ", status=" + status +
                ", price=" + price +
                ", createTime=" + createTime +
                '}';
    }
}
