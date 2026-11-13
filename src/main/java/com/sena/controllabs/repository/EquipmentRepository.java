package com.sena.controllabs.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.controllabs.entity.EquipmentEntity;

@Repository
public interface EquipmentRepository  extends JpaRepository<EquipmentEntity, UUID> {

}