package com.aman.solid.service;

import org.springframework.stereotype.Service;

import com.aman.solid.areainterface.ShapeArea;
import com.aman.solid.bean.ShapeBean;

/**
 * @author aman.verma
 *
 */

@Service
public class CircleAreaCalculatorService implements ShapeArea {

	@Override
	public double calculateArea(ShapeBean shapeBean) {
		double radius = shapeBean.getCircleBean().getRadius();
		double pi = Math.PI;
		return pi * radius * radius;
	}
}