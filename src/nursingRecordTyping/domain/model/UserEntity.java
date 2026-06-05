package nursingRecordTyping.domain.model;

import java.time.LocalDate;

public class UserEntity {
	private int id;
	private String username;
	private LocalDate registerdAt;

	public UserEntity(int id, String username, LocalDate registerdAt) {
		validateName(username);
		validateRegisterdAt(registerdAt);
		this.id = id;
		this.username = username;
		this.registerdAt = registerdAt;
	}

	String validateName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("ユーザー名が不正です");
		}
		return name;
	}

	LocalDate validateRegisterdAt(LocalDate date) {
		if (date == null) {
			throw new IllegalArgumentException("登録日時がnullです");
		}
		return date;
	}
}
