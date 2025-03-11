package com.eventostec.api.domain.cupon;

public record CouponRequestDTO(String code, Integer discount, Long valid) {
}
