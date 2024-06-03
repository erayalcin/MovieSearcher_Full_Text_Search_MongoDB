package com.mongodbFts.MongoDbFTS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class MediaController {

    @Autowired
    private MediaService mediaService;
    
    @GetMapping("/")
    public String home() {
        return "search";
    }
    
    @GetMapping("/search")
    public String search(@RequestParam("q") String keyword, Model model) {
        long startTime = System.currentTimeMillis();
        List<Media> searchResults = mediaService.searchFullText(keyword);
        long endTime = System.currentTimeMillis();
        // İşlem süresini hesapla
        long elapsedTime = endTime - startTime;
        
        System.out.println("İşlem süresi: " + elapsedTime + " milisaniye");
        model.addAttribute("q", keyword);
        model.addAttribute("docs", searchResults);
        return "search";
    }
}
