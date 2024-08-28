package PhanQuocHuy_21078701;

public class HinhTron {
	private double banKinh;
		private Tam t;
		public Tam getT() {
			return t;
		}
		public void setT(Tam t) throws Exception {
			if (t != null) {
				this.t = t;
			}else {
				throw new Exception();
			}
		}
		public static final double pi=3.1416;
		public double getBanKinh() {
			return banKinh;
		}
		public void setBanKinh(double bk, Tam t) throws Exception {
			if(bk > 0) {
				this.banKinh = bk;
			}else {
				throw new Exception("Loi");
			}
			}
	public HinhTron() {	}
	public HinhTron(double banKinh, Tam t) throws Exception {
		this.banKinh = banKinh;
		this.t = t;
	}
	
	public double getDienTich() {
		return getBanKinh()*getBanKinh()*pi;
	}
	public double getChuVi() {
		return getBanKinh()*2*pi;
	}
	@Override
	public String toString() {
		String m = "";
		m = m+ String.format(",%3s,%10s,%10s", getBanKinh(),getDienTich(),getChuVi());
		return m;
	}
/*	public static void main(String[] args) throws Exception {
		HinhTron h1 = new HinhTron(10,new Tam("A",15,16));
		System.out.println(h1);
	}*/
	}	