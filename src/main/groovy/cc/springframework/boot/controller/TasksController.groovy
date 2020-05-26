package cc.springframework.boot.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.beans.factory.annotation.Autowired

import cc.springframework.boot.model.Task
import cc.springframework.boot.service.TaskService

@RestController
@RequestMapping('/tasks')
class TasksController {

	@Autowired
	private final TaskService taskService

	@ResponseBody
	@GetMapping
	List<Task> findAll() {
		taskService.findAll()
	}

	@ResponseBody
	@RequestMapping(value = '/{id}', method = RequestMethod.GET)
	Task findById(@PathVariable('id') int id) {
		taskService.findById id
	}

	@ResponseBody
	@RequestMapping(value = '/add', method = RequestMethod.POST)
	Task saveTask(@RequestBody Task task) {
		taskService.saveTask task
	}
}