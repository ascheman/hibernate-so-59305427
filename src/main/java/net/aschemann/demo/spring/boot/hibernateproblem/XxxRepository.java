package net.aschemann.demo.spring.boot.hibernateproblem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface XxxRepository extends JpaRepository<XxxEntity, Long> {
}
