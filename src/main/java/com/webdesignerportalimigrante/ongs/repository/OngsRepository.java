package com.webdesignerportalimigrante.ongs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdesignerportalimigrante.ongs.domain.Ongs;

@Repository
public interface OngsRepository extends JpaRepository<Ongs, Long> {

}
