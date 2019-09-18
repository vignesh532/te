package org.greens.tec.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class Const {
	public Const() {
		System.out.println("i am in constructor");
		}
		public Const(int a) {
		System.out.println(80);
		}
		public  Const(int i,String name) {
System.out.println("2 argument int");
System.out.println(i);
System.out.println(name);
		}
		public static void main(String[] args) {
		Const c = new Const();
		Const c1 = new Const();
Const c11 = new Const(10,"nisha");

		}
}


