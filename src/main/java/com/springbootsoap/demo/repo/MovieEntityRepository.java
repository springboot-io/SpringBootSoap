package com.springbootsoap.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootsoap.demo.Entity.MovieEntity;

@Repository
public interface MovieEntityRepository extends CrudRepository<MovieEntity, Long> {

	public MovieEntity findByTitle(String title);
}