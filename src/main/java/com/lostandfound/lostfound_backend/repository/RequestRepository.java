package com.lostandfound.lostfound_backend.repository;

import com.lostandfound.lostfound_backend.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
}
