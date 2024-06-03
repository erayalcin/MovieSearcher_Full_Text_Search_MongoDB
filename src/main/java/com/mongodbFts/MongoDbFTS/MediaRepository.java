package com.mongodbFts.MongoDbFTS;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.core.query.TextCriteria;
import java.util.List;

public interface MediaRepository extends MongoRepository<Media, String> {

    List<Media> findBy(TextCriteria criteria);

}
