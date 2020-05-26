package cc.springframework.boot.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Table
import javax.persistence.GenerationType
import javax.persistence.Column
import javax.validation.constraints.NotNull

@Entity
@Table(name = "tasks")
class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id

	@NotNull
	@Column(nullable = false)
	String title

	@NotNull
	@Column(nullable = false)
	String description
}