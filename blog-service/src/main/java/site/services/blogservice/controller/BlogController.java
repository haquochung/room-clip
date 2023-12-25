package site.services.blogservice.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import site.services.blogservice.dto.BlogRequest;
import site.services.blogservice.dto.BlogResponse;
import site.services.blogservice.service.BlogService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/blog")
@RequiredArgsConstructor
public class BlogController {

    private final BlogService blogService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<BlogResponse> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createBlog(@RequestBody BlogRequest blogRequest) {

    }
}
