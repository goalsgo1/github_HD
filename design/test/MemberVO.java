package design.test;

public class MemberVO {

	private String nickname = null;
	private String gender = null;

	public MemberVO() {
	}

	public MemberVO(String nickname, String gender) {
		this.nickname = nickname;
		this.gender = gender;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
