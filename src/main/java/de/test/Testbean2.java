package de.test;

import java.io.Serializable;

import javax.inject.Named;

import org.apache.deltaspike.core.api.config.view.controller.PreRenderView;
import org.apache.deltaspike.core.api.scope.ViewAccessScoped;

import de.test.model.Car;

@Named
@ViewAccessScoped
public class Testbean2 implements Serializable {

	private static final long serialVersionUID = -6063123732134674373L;

	private Car car;

	@PreRenderView
	public void preRenderView() {
		if (car == null) {
			car = new Car();
			car.setBrand("BMW");
		}
	}

	public Car getCar() {
		return car;
	}

	public void setCar(final Car car) {
		this.car = car;
	}
}
