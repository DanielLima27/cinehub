package com.cinehub.controller.response;

import lombok.Builder;

@Builder
public record StreamingResponse(Long id, String name) {
}
