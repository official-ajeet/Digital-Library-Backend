package com.example.digitallibrary.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BannerService {

    public static  Map<String, Map<String, String>> getImages() {
        Map<String, Map<String, String>> mapOfImages = new HashMap<>();

        Map<String, String>image1 = new HashMap<>();
        image1.put("id","1");
        image1.put("title","title1");
        image1.put("description","description1");
        image1.put("link","https://cdn.pixabay.com/photo/2018/07/11/16/53/book-3531412_1280.jpg");

        Map<String, String>image2 = new HashMap<>();
        image2.put("id","2");
        image2.put("title","title2");
        image2.put("description","description2");
        image2.put("link","https://cdn.pixabay.com/photo/2016/08/31/09/05/tablet-1632909_1280.jpg");

        Map<String, String>image3 = new HashMap<>();
        image3.put("id","3");
        image3.put("title","title3");
        image3.put("description","description3");
        image3.put("link","https://cdn.pixabay.com/photo/2022/12/27/23/17/books-7681925_1280.jpg");

        Map<String, String>image4 = new HashMap<>();
        image4.put("id","4");
        image4.put("title","title4");
        image4.put("description","description4");
        image4.put("link","https://cdn.pixabay.com/photo/2016/08/31/09/06/silhouette-1632912_1280.jpg");

        mapOfImages.put("img1",image1);
        mapOfImages.put("img2",image2);
        mapOfImages.put("img3",image3);
        mapOfImages.put("img4",image4);

        return mapOfImages;
    }
}
