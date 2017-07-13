package com.bellinfo.interfacetask2;

abstract class vis {
	public int i() {
		return 0;
	}

	/*
	 * private void method1(){ System.out.println("private"); }
	 */
	protected void method2() {
		System.out.println("protected");
	}

	void method3() {
		System.out.println("default void ");
	}

	// abstract private void method4();
	abstract public void method5();

	abstract protected void method6();

	abstract void method7();
}

interface vis1 {

	public void a();

	static void b() {
		System.out.println("Static method: interface 1");
	}

	void c();
}

interface vis2 {
	public void d();

	static void e() {
		System.out.println("Static method: interface 2");
	}

	void f();
}

class visclass extends vis implements vis1, vis2 {

	@Override
	public void d() {
		// TODO Auto-generated method stub

	}

	@Override
	public void f() {
		// TODO Auto-generated method stub

	}

	@Override
	public void a() {
		// TODO Auto-generated method stub

	}

	@Override
	public void c() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void method6() {
		// TODO Auto-generated method stub

	}

	@Override
	void method7() {
		// TODO Auto-generated method stub

	}
}

public class visibilityverify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		visclass s = new visclass();
		s.i();
		// s.method1();
		s.method2();
		s.method3();
		// s.method4();
		s.method5();
		s.method6();
		s.method7();
		s.a();
		// s.b();
		s.c();
		s.d();
		// s.e();
		s.f();
	}

}
//6:
// public, protected and default methods of abstract class(both dummy and
// concrete) are accessible
// we cannot use private with abstract- not accessible
// private and protected methods are not accessible in interfaces
// private methods of abstract class are not accessible
// public and default methods of interfaces are accessible
// static methods of interfaces are not accessible
