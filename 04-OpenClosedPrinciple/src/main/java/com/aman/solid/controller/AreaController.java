package com.aman.solid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aman.solid.bean.ShapeBean;
import com.aman.solid.service.CircleAreaCalculatorService;
import com.aman.solid.service.RectangleAreaCalculatorService;

/**
 * @author aman.verma
 *
 */

@RestController
@EnableAutoConfiguration
@RequestMapping("/shape")
public class AreaController {

	@Autowired
	private RectangleAreaCalculatorService rectangleAreaCalculatorService;

	@Autowired
	private CircleAreaCalculatorService circleAreaCalculatorService;

	@PostMapping(value = "/calculateArea")
	public String calculateShapeArea(@RequestBody ShapeBean shapeBean) {
		
		String shape = shapeBean.getShape();
		double shapeArea = 0;
		
		switch (shape) {
		case "rectangle":
			shapeArea = rectangleAreaCalculatorService.calculateArea(shapeBean);
			break;
		case "circle":
			shapeArea = circleAreaCalculatorService.calculateArea(shapeBean);
			break;
		default:
			return "Please select a shape to calculate area !!!";
		}

		return "The area of " + shapeBean.getShape() + " : " + shapeArea;
	}
}
