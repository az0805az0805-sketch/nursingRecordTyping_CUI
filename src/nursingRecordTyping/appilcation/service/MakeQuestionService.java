package nursingRecordTyping.appilcation.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nursingRecordTyping.appilcation.command.TextCommand;
import nursingRecordTyping.appilcation.usecase.QuestionUseCase;

public class MakeQuestionService implements QuestionUseCase {

	@Override
	public List<TextCommand> pickRandomDistinct(List<TextCommand> list, int n) {

		if (list == null || list.isEmpty())
			return List.of();
		if (n >= list.size())
			return List.copyOf(list);
		
		List<TextCommand> copy = new ArrayList<>(list);
		Collections.shuffle(copy);
		return copy.subList(0, n);
	}

}
