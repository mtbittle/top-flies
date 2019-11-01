package com.bitnationcode.topflies.repository;

import com.bitnationcode.topflies.model.Fly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface IFlyRepository extends JpaRepository<Fly, Long> { //}, QuerydslPredicateExecutor<Fly> {
}
