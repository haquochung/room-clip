package site.services.blogservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import site.services.blogservice.dto.BlogResponse;

import java.util.Arrays;
import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class BlogService {
    public List<BlogResponse> getAllBlogs() {
        return Arrays.asList();
    }
}
