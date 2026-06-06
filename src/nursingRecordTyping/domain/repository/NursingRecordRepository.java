package nursingRecordTyping.domain.repository;

import java.util.List;

import nursingRecordTyping.appilcation.command.TextCommand;
import nursingRecordTyping.domain.model.entitys.WordEntity;

public interface NursingRecordRepository {
	List<WordEntity> findALL();

	List<TextCommand> findText();

	int saveQuestion(WordEntity we);

	boolean existsText(String text);

	List<WordEntity> findByPartialText(String s);

	boolean deleteText(int id, String text);

}
