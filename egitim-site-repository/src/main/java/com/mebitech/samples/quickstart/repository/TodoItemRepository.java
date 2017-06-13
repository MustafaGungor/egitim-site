package com.mebitech.samples.quickstart.repository;

import com.mebitech.samples.quickstart.domain.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 06/03/2017.
 */
@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, String> {
    List<TodoItem> findByParent_oid(String parentOid);
}
