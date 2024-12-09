package com.oops;

public class VarArgsUsage {

	 VarArgsUsage() {

	 System.out.print("1 ");

	 }

	 VarArgsUsage(Integer num) {

	 System.out.print("3 ");

	 }

	 VarArgsUsage(Object num) {

	 System.out.print("4 ");

	 }

	 VarArgsUsage(int... nums) {

	 System.out.print("5 ");

	 }

	VarArgsUsage(int num1, int num2) {

		System.out.print("6 ");

	}

	 public static void main(String[] args) {

	 new VarArgsUsage(100);
		 new VarArgsUsage(100,101);
	 new VarArgsUsage(1000L);

	 }

	}