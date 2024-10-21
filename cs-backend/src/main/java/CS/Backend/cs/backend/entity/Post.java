package CS.Backend.cs.backend.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Document(collection = "posts")


public class Post {
    String id;
    String title;

    String Description;

    String image; //Base 64 encoded image , have to encode before save the image
}
