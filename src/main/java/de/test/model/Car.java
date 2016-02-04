package de.test.model;

/*
 * Copyright 2009-2014 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.Serializable;

public class Car implements Serializable {

	public String id;
	public String brand;
	public int year;
	public String color;
	public int price;
	public boolean sold;

	public Car() {
	}

	public Car(final String id, final String brand, final int year, final String color) {
		this.id = id;
		this.brand = brand;
		this.year = year;
		this.color = color;
	}

	public Car(
		final String id,
		final String brand,
		final int year,
		final String color,
		final int price,
		final boolean sold) {
		this.id = id;
		this.brand = brand;
		this.year = year;
		this.color = color;
		this.price = price;
		this.sold = sold;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(final String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(final int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(final String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(final int price) {
		this.price = price;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(final boolean sold) {
		this.sold = sold;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = (59 * hash) + (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Car other = (Car) obj;
		if ((id == null) ? (other.id != null) : !id.equals(other.id)) {
			return false;
		}
		return true;
	}
}