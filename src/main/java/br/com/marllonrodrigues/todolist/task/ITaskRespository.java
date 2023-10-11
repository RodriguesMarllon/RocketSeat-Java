package br.com.marllonrodrigues.todolist.task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRespository extends JpaRepository<TaskModel, UUID> {

}
