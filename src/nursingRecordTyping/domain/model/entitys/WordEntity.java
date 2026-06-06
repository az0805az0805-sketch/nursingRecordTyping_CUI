package nursingRecordTyping.domain.model.entitys;

import nursingRecordTyping.domain.model.type.Category;

public class WordEntity {
	private int id;
	private String jaText;
	private String enText;
	private Category category;

	public WordEntity(int id, String ja_text, String en_text, String category) {
		this.id = id;
		this.jaText = ja_text;
		this.enText = en_text;
		this.category = this.transformCategory(category);

	}

	public Category transformCategory(String c) {

		switch (c) {

		case "ward1":
		case "病棟1":
		case "病棟":
			return Category.Ward1;

		case "ward2":
		case "病棟2":
			return Category.Ward2;

		case "surgery":
		case "手術":
			return Category.Surgery;

		default:
			return Category.General;

		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJaText() {
		return jaText;
	}

	public void setJaText(String jaText) {
		this.jaText = jaText;
	}

	public String getEnText() {
		return enText;
	}

	public void setEnText(String enText) {
		this.enText = enText;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
