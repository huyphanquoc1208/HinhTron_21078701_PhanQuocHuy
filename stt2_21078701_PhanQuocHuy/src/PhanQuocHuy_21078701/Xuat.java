package PhanQuocHuy_21078701;

public class Xuat {
	public static void main(String[] args) throws Exception{
		Tam t = new Tam("A",15,16);
		HinhTron h1 = new HinhTron(10,t);
		System.out.println("Hinh tron tam: " +t.toString()+h1.toString());
	}
}
