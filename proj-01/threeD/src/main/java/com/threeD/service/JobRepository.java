package com.threeD.service;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.threeD.entity.TestOne;


@Repository(value="JobRepository")
public interface JobRepository extends JpaRepository<TestOne, Integer> {
	

	

}
