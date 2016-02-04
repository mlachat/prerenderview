package de.test;

import java.io.Serializable;

import javax.inject.Named;

import org.apache.deltaspike.core.api.config.view.controller.PreRenderView;
import org.apache.deltaspike.core.api.scope.ViewAccessScoped;

import de.test.model.Car;

@Named
@ViewAccessScoped
public class Testbean implements Serializable {

	private static final long serialVersionUID = 5906876103083301306L;
	private Car car;

	@PreRenderView
	public void preRenderView() {
		if (car == null) {
			car = new Car();
			car.setBrand("Audi");
		}
	}

	public Car getCar() {
		return car;
	}

	public void setCar(final Car car) {
		this.car = car;
	}
}
