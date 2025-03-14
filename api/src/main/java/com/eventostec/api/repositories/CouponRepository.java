package com.eventostec.api.repositories;

import com.eventostec.api.domain.cupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, UUID>{

    List<Coupon> findByEventIdAndValidAfter(UUID eventId, Date currentDate);
}
