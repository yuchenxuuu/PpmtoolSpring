package io.ppmdev.ppmtool.repositories;

import io.ppmdev.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends CrudRepository<Project, Long> {


    @Override
    Iterable<Project> findAll();
    Project findByProjectIdentifier(String projectId);
}