package com.mongodbFts.MongoDbFTS;


import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.query.TextCriteria;
import java.util.List;

@Service
public class MediaService {

    private final MediaRepository mediaRepository;

    
    public MediaService(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    public List<Media> searchFullText(String keyword) {
        
        TextCriteria criteria = TextCriteria.forDefaultLanguage().matchingAny(keyword);
        
        return mediaRepository.findBy(criteria);
    }
}



