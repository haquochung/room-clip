package site.services.blogservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import site.services.blogservice.model.Blog;

public interface BlogRepository extends MongoRepository<Blog, String> {
}
