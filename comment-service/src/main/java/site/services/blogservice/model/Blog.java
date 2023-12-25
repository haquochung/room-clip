package site.services.blogservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value = "blog")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Blog {
    @Id
    String id;
    private String title;
    private String content;
}
