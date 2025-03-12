package com.eventostec.api.domain.event;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public record EventDetailsDTO(UUID id, String title, String description, Date date, String s, String s1, String imgUrl, String eventUrl, List<CouponDTO> couponDTOs) {

    public record CouponDTO(String code, Integer discount, java.util.Date valid) {
    }
}
