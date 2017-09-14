package com.vz.order.model;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lavanyak
 *
 */
public interface OrderRepository extends JpaRepository<Orders, Long> {
	
	List<Orders> findAll(Specification<Orders> order);
}
