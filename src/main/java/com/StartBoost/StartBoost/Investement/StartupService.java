package com.StartBoost.StartBoost.Investement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StartupService {
    private final StartupRepository startupRepository;

    public StartupResponse createStartup(StartupRequest request){


        Startup startup = Startup.builder()
                .name(request.getName())
                .description(request.getDescription())
                .imageUrl(request.getImageUrl())
                .industry(request.getIndustry())
                .build();
        startupRepository.save(startup);

        return StartupResponse.builder()
                .uuid(startup.getUuid())
                .build();



    }
    public List<Startup> getStartups(){
        return startupRepository.findAll();}



}
