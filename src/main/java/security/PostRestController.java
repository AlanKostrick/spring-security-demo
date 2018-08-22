package security;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostRestController {

	@Resource
	private PostRepository postRepo;

	@RequestMapping("/posts")
	public String list() {
		return "list posts...";
	}

	

	

}