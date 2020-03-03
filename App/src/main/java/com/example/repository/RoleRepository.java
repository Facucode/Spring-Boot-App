package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}