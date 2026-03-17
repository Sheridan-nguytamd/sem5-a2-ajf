package ca.sheridancollege.nguytamd.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.nguytamd.domain.Post;
import ca.sheridancollege.nguytamd.services.PostService;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

	@Autowired
	private PostService postService;
	
	@GetMapping
	public List<Post> getAllPosts() {
		return postService.findAll();
	}
	
	@PostMapping
	public Post save(@RequestBody Post post) {
		return postService.save(post);
	}
	
	@PutMapping("/{id}")
	public Post updatePost(@PathVariable Long id, @RequestBody Post post) {
		return postService.update(id, post);
	}
	
	@DeleteMapping("/{id}")
	public void deletePost(@PathVariable Long id) {
		postService.deleteById(id);
	}
}
