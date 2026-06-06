package nursingRecordTyping.appilcation.usecase;

import java.util.List;

import nursingRecordTyping.domain.model.entitys.WordEntity;

public interface DeleteUseCase {
	List<WordEntity> executeReferencText(String text);

	boolean executeDeleteText(int id, String text);
}
