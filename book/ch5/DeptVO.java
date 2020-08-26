package book.ch5;
//실력에 차이가 들어나는걸 싫어합니다.
//틀을 짜두고 그 틀에 업무에 대한 코딩만 하게 한다. 게임엔진 / 프레임워크
public class DeptVO {
		private int	deptno = 0;
		private String dname = null;//클래스는 선언시 초기값은  null이다.
		private String loc   = null;
		public DeptVO() {}
		public DeptVO(int deptno, String dname, String loc) {
			this.deptno = deptno;
			this.dname = dname;
			this.loc = loc;
		}
		public int getDeptno() {
			return deptno;
		}
		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public String getLoc() {
			return loc;
		}
		public void setLoc(String loc) {
			this.loc = loc;
		}
	}