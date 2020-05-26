package cc.springframework.boot.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

import cc.springframework.boot.model.Task

@Repository
interface TaskRepository extends JpaRepository<Task, Integer> {

	List<Task> findAll()

	Task findById(Integer id)

	Task save(Task task)
}