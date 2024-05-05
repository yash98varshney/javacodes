package com.springcloud.coupenservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcloud.coupenservice.model.Coupen;

@Repository
public interface CoupenRepo extends JpaRepository<Coupen, Long> {

	Coupen findByCode(String code);

}
