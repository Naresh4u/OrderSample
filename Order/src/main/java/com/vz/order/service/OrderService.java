package com.vz.order.service;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import com.vz.order.constants.StatusCode;
import com.vz.order.exception.ApplicationException;
import com.vz.order.model.Orders;
import com.vz.order.model.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	private static final Logger LOGGER = Logger.getLogger(OrderService.class);
	
	@Autowired
	OrderRepository orderRepository;
	
	public List<Orders> getOrders(Orders order)
			throws ApplicationException {
		List<Orders> orderList = null;
		try {
			orderList = orderRepository.findAll(new OrderSpec(order));
		} catch (Exception e) {
			LOGGER.error("Get Order : Exception : " + e);
			throw new ApplicationException(StatusCode.APP_ERROR.getCode(),
					"Application Error. Not able to Get Order Details");
		}
		return orderList;
	}
	
/*	public Order createOrder(Order order) throws Exception {
		Order orderReq = order;
		Order ord= null;
		try {
		    orderReq.setCreatedDate(new Date());
		    orderReq.setModifiedDate(new Date());
		    ord = orderRepository.save(orderReq);
		} catch (Exception e) {
			System.out.println("My Error :" + e);
		}
		return ord;
	}*/
	
	public Orders doCarParkingCheckIn(Orders cars) throws Exception {
		Orders car = null;
		try {
			Orders carDao = cars;
			carDao.setCreatedDate(new Date());
			carDao.setModifiedDate(new Date());
			
			car = orderRepository.save(carDao);
		} catch (Exception e) {
			System.out.println("My Error :" + e);
		}
		return car;
	}
}
