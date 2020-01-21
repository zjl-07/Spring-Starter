package com.emilda.javasprintstarter.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects(Integer corporateId){
        List<Project> projects = new ArrayList<>();
        projectRepository.findByCorporateId(corporateId).forEach(projects::add);

        return projects;
    }

    public Project getProject(Integer id) {
        return projectRepository.findById(id).get();
    }

    public void addProject(Project project) {
        projectRepository.save(project);
    }

    public void updateProject(Project project) {
        projectRepository.save(project);
    }


    public void deleteProject(Integer id) {
        projectRepository.deleteById(id);
    }
}
