package com.oops;

import java.security.cert.CollectionCertStoreParameters;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Dog<T> {

	T t;

	public Dog(T t) {
		this.t = t;
	}

	public String toString() {
		return t.toString();
	}

	public static void main(String[] args) {
//		List<Integer> l = IntStream.range(1, 6)
//
//				.mapToObj(i -> i).collect(Collectors.toList());
//
//		l.forEach(System.out::println);


		IntStream.range(1,6)
				.forEach(System.out::println);
	}
}

interface Secret {

	String magic(double d);

}