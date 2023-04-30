package com.StartBoost.StartBoost.Investement;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StartupResponse {
  @JsonProperty("uuid")
    private  String uuid;


}
