package com.bitnationcode.topflies.repository;

import com.bitnationcode.topflies.model.Fly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFlyRepository extends JpaRepository<Fly, Long>, QuerydslPredicateExecutor<Fly> {

    /**
     * Uses Spring's built-in projections, returning an interface consisting of id and name columsn
     * @return list of row Id and name columns from the Fly repository
     */
    List<FlyIdAndName> findAllProjectedBy();
}
