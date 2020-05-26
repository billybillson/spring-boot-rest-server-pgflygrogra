package cc.springframework.boot.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import cc.springframework.boot.model.Task
import cc.springframework.boot.service.TaskService
import cc.springframework.boot.repository.TaskRepository

@Service
class TaskServiceImpl implements TaskService {

	@Autowired
	private final TaskRepository taskRepository

	@Override
	List<Task> findAll() {
		taskRepository.findAll()
	}

	@Override
	Task findById(int id) {
		taskRepository.findById(id)
	}

	@Override
	Task saveTask(Task task) {
		taskRepository.save(task)
	}
}