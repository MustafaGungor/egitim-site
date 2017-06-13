package com.mebitech.samples.quickstart.repository;

import com.mebitech.samples.quickstart.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 06/03/2017.
 */
public interface TodoRepository extends JpaRepository<Todo, String> {
}
