package nursingRecordTyping.domain.model.entitys;

public class UserEntity {
	private int id;
	private String username;
	private String pass;

	public UserEntity(int id, String username, String pass) {
		validateName(username);
		validatePass(pass);
		this.id = id;
		this.username = username;
		this.pass = pass;
	}

	String validateName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("ユーザー名が不正です");
		}
		return name;
	}

	String validatePass(String pass) {

		if (pass == null) {
			throw new IllegalArgumentException("登録日時がnullです");
		}
		return pass;
	}
}
