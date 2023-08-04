package com.example.docker.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.docker.Model.Task;
import com.example.docker.Repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.getAllTasks();
    }

    public Task getTaskById(Long id) {
        return taskRepository.getTaskById(id);
    }

    public void saveTask(Task task) {
        taskRepository.saveTask(task);
    }

    public void deleteTaskById(Long id) {
        taskRepository.deleteTaskById(id);
    }
}
