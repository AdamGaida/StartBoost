package com.StartBoost.StartBoost.Investement;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Investement {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    private Startup startup;
    @Transient
    private List<Share> shareList;



}
