package nursingRecordTyping.appilcation.usecase;

import java.util.List;

import nursingRecordTyping.appilcation.command.TextCommand;

public interface TrainingUseCase {
	List<TextCommand> findText(int num);

	long makeScore(int wrongCount, long timeTaken, int textLength);

}
