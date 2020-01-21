package com.emilda.javasprintstarter.project;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project,Integer> {
    public List<Project> findByCorporateId(Integer corporateId);
}
