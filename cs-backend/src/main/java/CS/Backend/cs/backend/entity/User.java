package CS.Backend.cs.backend.entity;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Document(collection = "user")

public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
