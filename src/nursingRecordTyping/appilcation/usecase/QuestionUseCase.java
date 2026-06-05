package nursingRecordTyping.appilcation.usecase;

import java.awt.TextComponent;
import java.util.List;

import nursingRecordTyping.appilcation.command.TextCommand;

public interface QuestionUseCase {
	List<TextComponent> pickRandomDistinct(List<TextCommand> list, int n);
}
