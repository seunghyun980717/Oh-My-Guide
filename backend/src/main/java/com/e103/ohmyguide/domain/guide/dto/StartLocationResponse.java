package com.e103.ohmyguide.domain.guide.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StartLocationResponse {

    private BigDecimal latitude;
    private BigDecimal longitude;
}
