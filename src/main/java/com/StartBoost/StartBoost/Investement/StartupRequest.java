package com.StartBoost.StartBoost.Investement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StartupRequest {
    private String name;
    private String description;
    private String industry;
    private String imageUrl;

}
