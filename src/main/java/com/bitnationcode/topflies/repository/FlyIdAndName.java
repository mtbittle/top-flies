package com.bitnationcode.topflies.repository;

/**
 * Spring Data JPA Projection interface used to return only the row ID and name attribute
 * from the Fly table
 *
 * @author Michael Bittle
 */
public interface FlyIdAndName {

    long getFlyId();
    String getName();
}
