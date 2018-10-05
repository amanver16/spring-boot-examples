package com.aman.solid.service;

import org.springframework.stereotype.Service;

import com.aman.solid.areainterface.ShapeArea;
import com.aman.solid.bean.ShapeBean;

/**
 * @author aman.verma
 *
 */

@Service
public class RectangleAreaCalculatorService implements ShapeArea {

	@Override
	public double calculateArea(ShapeBean shapeBean) {
		double height = shapeBean.getRectangleBean().getHeight();
		double width = shapeBean.getRectangleBean().getWidth();
		return height * width;
	}
}
