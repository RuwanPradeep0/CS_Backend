package CS.Backend.cs.backend.service;

import CS.Backend.cs.backend.RequestResponse.PostRequest;
import CS.Backend.cs.backend.RequestResponse.PostResponse;
import CS.Backend.cs.backend.entity.Post;

public class PostMapper {

    public Post toPost(PostRequest postRequest) {
        return Post.builder()
                .title(postRequest.getTitle())
                .Description(postRequest.getDescription())
                .image(postRequest.getImage())
                .build();
    }

    public PostResponse toPostResponse(Post post){
        return PostResponse.builder()
                .title(post.getTitle())
                .Description(post.getDescription())
                .image(post.getImage())
                .build();
    }
}
