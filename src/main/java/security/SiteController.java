package security;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SiteController {

	@Resource
	private PostRepository postRepo;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/posts")
	public String seePosts(Model model) {
		model.addAttribute("postsModel", postRepo.findAll());
		return "layouts/posts";
	}
	
	
	@RequestMapping("/admin/posts")
	public String addPost(Model model) {
		model.addAttribute("postsModel", postRepo.findAll());
		return "layouts/post";
	}
	
	
	@RequestMapping(path = "/admin/posts/{content}", method = RequestMethod.POST)
	public String AddTag(@PathVariable String content, Model model) {
		Post postToAdd = new Post(content);
		postRepo.save(postToAdd);

		model.addAttribute("postsModel", postRepo.findAll());
		return "partials/posts-list-added";
	}

}