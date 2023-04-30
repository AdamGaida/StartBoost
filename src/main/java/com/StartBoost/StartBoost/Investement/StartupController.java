package com.StartBoost.StartBoost.Investement;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/startup")
@AllArgsConstructor
@CrossOrigin("http://localhost:4200")
public class StartupController {
    private  final StartupService startupService ;
    @PostMapping("/create")
    public ResponseEntity<StartupResponse> createStartup(@RequestBody StartupRequest request){
        return  ResponseEntity.ok(startupService.createStartup(request));



    }
    @GetMapping ("/getall")
    public ResponseEntity<List<Startup>> getStartups(){
     return ResponseEntity.ok(startupService.getStartups());
    }

}
