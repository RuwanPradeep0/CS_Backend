package CS.Backend.cs.backend.service;

import CS.Backend.cs.backend.RequestResponse.PostRequest;
import CS.Backend.cs.backend.RequestResponse.PostResponse;
import CS.Backend.cs.backend.entity.Post;
import CS.Backend.cs.backend.entity.User;
import CS.Backend.cs.backend.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostsMapper postMapper;
    public final PostRepository postRepository;


    public PostResponse createPost(PostRequest postRequest) {

        Post post = postMapper.toPost(postRequest);
        Post savedPost =  postRepository.save(post);
        return postMapper.toPostResponse(savedPost);
    }

    public List<PostResponse> getAllPosts(){
        return null;
    }

    public PostResponse updatePost(PostRequest postRequest , Authentication connectedAdmin){

        return null;
    };
}
