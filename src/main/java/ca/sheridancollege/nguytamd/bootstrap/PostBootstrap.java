package ca.sheridancollege.nguytamd.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.nguytamd.domain.Post;
import ca.sheridancollege.nguytamd.services.PostService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PostBootstrap implements CommandLineRunner {

	private final PostService postService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Post p1 = new Post(null, "Tam", "2026-03-16 10:00 AM",
				"Configured a new Docker container for the backend service. Utilizing Alpine Linux base image to reduce total footprint to under 50MB. Integrated health checks and bound to port 8080.");

		Post p2 = new Post(null, "System Admin", "2026-03-16 11:30 AM",
				"Updated the central routing switch firmware to v2.4.1. This patches the recent vulnerability in the TLS handshake protocol. Expect slightly lower latency on the internal network.");

		postService.save(p1);
		postService.save(p2);
	}

}
