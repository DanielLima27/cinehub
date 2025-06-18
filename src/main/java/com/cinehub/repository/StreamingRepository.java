package com.cinehub.repository;

import com.cinehub.entity.Streaming;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface StreamingRepository extends JpaRepository<Streaming, Long> {
}
