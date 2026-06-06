package nursingRecordTyping.appilcation.usecase;

import nursingRecordTyping.domain.model.entitys.WordEntity;

public interface CreateUseCase {
	String inputQuestionCheck(String text);

	String inputRomanCheck(String roman);

	String inputCategoryCheck(String category);

	public int executeSaveText(WordEntity we);

	boolean existsText(String text);
}
