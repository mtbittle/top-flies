package com.bitnationcode.topflies.querydsl;

import com.bitnationcode.topflies.controller.home.SearchForm;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;

/**
 * @author Michael
 * @date 11/9/2019
 **/
public class FlyPredicateBuilder {

    public static Predicate build(SearchForm form) {
        BooleanBuilder builder = new BooleanBuilder();


        return builder.getValue();
    }
}
