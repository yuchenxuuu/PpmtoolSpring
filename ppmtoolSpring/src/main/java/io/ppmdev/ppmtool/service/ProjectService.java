package io.ppmdev.ppmtool.service;

import io.ppmdev.ppmtool.domain.Project;
import io.ppmdev.ppmtool.exceptions.ProjectIdExceptions;
import io.ppmdev.ppmtool.exceptions.ProjectNameExceptions;
import io.ppmdev.ppmtool.repositories.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private Repo repo;

    public Project saveOrUpdateProject(Project project) {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return repo.save(project);
    }



    public Project findProjectByProjectId(String projectId){
        Project project = repo.findByProjectIdentifier(projectId.toUpperCase());
        if(project == null){
            throw new ProjectIdExceptions("Cannot find project that doesn't exist.");
        }
        return project;
    }


    public Iterable<Project> findAllProjects() {
        return repo.findAll();
    }


    public void deleteProjectByIdentifier(String projectId){
        Project project = repo.findByProjectIdentifier(projectId);
        if(project == null){
            throw new ProjectNameExceptions("Cannot delete project that doesn't exist.");
        }
        repo.delete(project);
    }




}
