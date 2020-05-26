package cc.springframework.boot.service

import cc.springframework.boot.model.Task

interface TaskService {

	List<Task> findAll()

	Task findById(int id)

	Task saveTask(Task task)
}