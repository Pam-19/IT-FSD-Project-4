package com.example.docker.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.docker.Model.Task;

@Repository
public class TaskRepository {
    private List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task getTaskById(Long id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void saveTask(Task task) {
        tasks.add(task);
    }

    public void deleteTaskById(Long id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }
}
