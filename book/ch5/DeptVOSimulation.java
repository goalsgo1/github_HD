package book.ch5;

public class DeptVOSimulation {

	public static void main(String[] args) {
		DeptVO dVO = new DeptVO();
		DeptVO[] dVOS = new DeptVO[3];
		dVO.setDeptno(10);
		dVO.setDname("ACCOUNTING");
		dVO.setLoc("NEW YORK");
		System.out.println(dVO.getDeptno());
		System.out.println(dVO.getDname());
		System.out.println(dVO.getLoc());
		dVOS[0] = dVO;
		dVO = new DeptVO();//변수 이름은 같지만 dVO의 주소번지는 달라진다.
		dVO.setDeptno(20);
		dVO.setDname("RESEARCH");
		dVO.setLoc("DALLAS");
		System.out.println("=============================");
		System.out.println(dVO.getDeptno());
		System.out.println(dVO.getDname());
		System.out.println(dVO.getLoc());
		dVOS[1] = dVO;
		dVO = new DeptVO();//마찬가지
		dVO.setDeptno(30);
		dVO.setDname("SALES");
		dVO.setLoc("CHICAGO");
		System.out.println("=============================");
		System.out.println(dVO.getDeptno());
		System.out.println(dVO.getDname());
		System.out.println(dVO.getLoc());
		dVOS[2] = dVO;
		for(int i=0;i<3;i++) {
			DeptVO rVO = dVOS[i];
			System.out.println(rVO.getDeptno()+","+rVO.getDname()+","+rVO.getLoc());
		}
	}

}
