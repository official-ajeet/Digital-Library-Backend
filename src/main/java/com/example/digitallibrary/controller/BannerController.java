package com.example.digitallibrary.controller;

import com.example.digitallibrary.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/banner-images")
public class BannerController {
    @Autowired
    BannerService bannerService;

    @GetMapping("")
    public  Map<String, Map<String, String>>getImage(){
        return BannerService.getImages();
    }
}