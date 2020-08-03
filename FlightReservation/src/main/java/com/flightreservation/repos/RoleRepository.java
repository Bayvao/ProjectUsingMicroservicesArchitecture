package com.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long	> {

}
