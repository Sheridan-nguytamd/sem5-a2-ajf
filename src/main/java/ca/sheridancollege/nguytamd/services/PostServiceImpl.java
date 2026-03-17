package ca.sheridancollege.nguytamd.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ca.sheridancollege.nguytamd.domain.Post;
import ca.sheridancollege.nguytamd.repositories.PostRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

	private final PostRepository postRepository;
	
	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return postRepository.findAll();
	}

	@Override
	public Post save(Post post) {
		// TODO Auto-generated method stub
		return postRepository.save(post);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		postRepository.deleteById(id);
	}

	@Override
	public Post update(Long id, Post post) {
		// TODO Auto-generated method stub
		post.setId(id);
		return postRepository.save(post);
	}

}
