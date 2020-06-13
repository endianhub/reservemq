package com.xh.product.dao.rep;

import com.xh.product.entity.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/11
 */
public interface ReserveRepDao extends JpaRepository<Reserve, Long> {

    @Query(value = "SELECT r FROM Reserve r WHERE r.productId = ?1")
    Reserve getByProductId(Long productId);


    @Modifying
    @Query(value = "UPDATE Reserve SET currentCount=currentCount+?1 WHERE productId=?2 ")
    void updateReserve(Integer count, Long productId);
}
