package nursingRecordTyping.appilcation.usecase;

import java.util.List;

import nursingRecordTyping.appilcation.command.TextCommand;

public interface QuestionUseCase {
	List<TextCommand> pickRandomDistinct(List<TextCommand> list, int n);
}
