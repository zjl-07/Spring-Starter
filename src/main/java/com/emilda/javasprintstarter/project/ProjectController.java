package com.emilda.javasprintstarter.project;

import com.emilda.javasprintstarter.corporate.Corporate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @RequestMapping("/corporates/{corporateId}/projects")
    public List<Project> getAllCorporates(@PathVariable Integer corporateId){
        final List<Project> allProjects = projectService.getAllProjects(corporateId);
        return allProjects;
    }

    @RequestMapping("/corporates/{corporateId}/projects/{id}")
    public Project getProject(@PathVariable Integer id){
        return projectService.getProject(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/corporates/{corporateId}/projects")
    public void addProject(@RequestBody Project project, @PathVariable Integer corporateId){
        project.setCorporate(new Corporate(corporateId,"","",""));
        projectService.addProject(project);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/corporates/{corporateId}/projects/{id}")
    public void updateProject(@RequestBody Project project, @PathVariable Integer corporateId){
        //project.setCorporate(new Corporate(corporateId,"","",""));
        projectService.updateProject(project);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/projects/{id}")
    public void deleteProject(@PathVariable Integer id){
        projectService.deleteProject(id);
    };
}
