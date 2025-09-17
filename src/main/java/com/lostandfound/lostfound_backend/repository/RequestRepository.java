package com.lostandfound.lostfound_backend.repository;

import com.lostandfound.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}
