package semi.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Theater {
	private String THEATER_NAME = null;
	private int SEAT_NO = 0;
	private int TIKETING = 0;
	
	public Theater() {
	}

	public Theater(String THEATER_NAME, int SEAT_NO, int TIKETING) {
		this.THEATER_NAME = THEATER_NAME;
		this.SEAT_NO = SEAT_NO;
		this.TIKETING = TIKETING;
	}
}
