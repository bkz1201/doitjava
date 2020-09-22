package chapter12;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
	private int memberId;
	private String memberName;

	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " Èº´ÔÀÇ ¾ÆÀÌµð´Â " + memberId + "ÀÔ´Ï´Ù";
	}

	@Override
	public int compare(Member2 mem1, Member2 mem2) {
		return (mem1.getMemberID() - mem2.getMemberID());
	}
}
