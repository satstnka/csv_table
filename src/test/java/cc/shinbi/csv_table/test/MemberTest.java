package cc.shinbi.csv_table.test;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import jp.trans_it.csv_table.Member;

public class MemberTest {

	@Test
	public void test() throws IOException {
		List<Member> members = Member.getMembers();
		for(Member member : members) {
			System.out.println("名前: " + member.getName());
			System.out.println("色: " + member.getColor());
			System.out.println("誕生日: " + member.getBirthday());
		}
	}
}
