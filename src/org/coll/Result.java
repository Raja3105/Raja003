package org.coll;
public class Result extends Year implements Anna ,Bharathiyar,Bharathidasan {
	public void trichy() {
		System.out.println("TRICHY");
	}
	public void chennai() {
		System.out.println("CHENNAI");
	}
	public void madurai() {
		System.out.println("MADURAI");
	}
	public void kovai() {
		System.out.println("COVAI");
		}
	public void veloore() {
		System.out.println("VELLOORE");
	}
	public void salem() {
		System.out.println("SALEM");
	}
	public static void main(String[]args) {
		Result col=new Result();
		col.trichy();
		col.chennai();
		col.salem();
		col.madurai();
		col.veloore();
		col.kovai();
		col.year();
		col.wipro();
		col.samsung();
		col.tata();
		col.accenture();
		col.global();
		col.voltech();
	}
}