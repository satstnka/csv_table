package jp.trans_it.csv_table;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Member {
	private String name;
	private String color;
	private String birthday;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public static List<Member> getMembers() throws IOException {
		List<Member> list = new ArrayList<Member>();
		InputStream stream = Member.class.getResourceAsStream("/jp/trans_it/csv_table/members.txt");

		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		String line;

		Member currentMember = null;

		while((line = reader.readLine()) != null) {
			String[] tokens = line.split("\t");
			if(tokens.length >= 3) {
				for(int i = 0; i < tokens.length; i++) {
					String token = tokens[i];

					if(i == 0) {
						currentMember = new Member();
						currentMember.setName(token);
					}
					else if(i == 1) {
						currentMember.setColor(token);
					}
					else if(i == 2) {
						currentMember.setBirthday(token);
					}
				}
				list.add(currentMember);
			}
		}

		return list;
	}
}
