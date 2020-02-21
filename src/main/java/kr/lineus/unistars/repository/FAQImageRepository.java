package kr.lineus.unistars.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.lineus.unistars.entity.FAQImageEntity;

@Repository
public interface FAQImageRepository extends JpaRepository<FAQImageEntity, UUID> {	
}