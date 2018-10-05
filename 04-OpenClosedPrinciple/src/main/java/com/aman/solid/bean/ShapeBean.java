package com.aman.solid.bean;

/**
 * @author aman.verma
 *
 */

public class ShapeBean {

	private String shape;
	private RectangleBean rectangleBean;
	private CircleBean circleBean;
	
	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public RectangleBean getRectangleBean() {
		return rectangleBean;
	}

	public void setRectangleBean(RectangleBean rectangleBean) {
		this.rectangleBean = rectangleBean;
	}

	public CircleBean getCircleBean() {
		return circleBean;
	}

	public void setCircleBean(CircleBean circleBean) {
		this.circleBean = circleBean;
	}
}