package cc.springframework.boot.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class IndexController {

	@ResponseBody
	@GetMapping('/')
	String index() {
		'This is Groovy land. Keep out of here!'
	}
}