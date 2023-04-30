package com.StartBoost.StartBoost.Investement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Startup {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private String industry;
    private String imageUrl;
    private Integer sharePrice;
    private String uuid;
    public Startup(String name,
                   String description,
                   String industry,
                   String imageUrl,
                   Integer sharePrice
    ) {
        this.name = name;
        this.description = description;
        this.industry = industry;
        this.imageUrl = imageUrl;
        this.sharePrice = sharePrice;
    }
    @PrePersist
    public void generateNewId(){
        this.uuid= UUID.randomUUID().toString();
    }


}
