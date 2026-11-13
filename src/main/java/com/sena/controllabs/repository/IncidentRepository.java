package com.sena.controllabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.controllabs.entity.IncidentEntity;

@Repository
public interface IncidentRepository  extends JpaRepository<IncidentEntity, Long> {

}
