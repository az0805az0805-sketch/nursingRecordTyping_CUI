package nursingRecordTyping.domain.model;

import java.time.LocalDate;

public class ScoreEntity {
	private int id;
	private int userId;
	private int totalInputs;
	private int wrongCount;
	private long typingTime;
	private LocalDate playedAt;

	public ScoreEntity(int id, int userId, int totalInputs, int wrongCount, long typingTime, LocalDate playedAt) {
		validateTime(typingTime);
		validatePlayedAt(playedAt);
		this.id = id;
		this.userId = userId;
		this.totalInputs = totalInputs;
		this.wrongCount = wrongCount;
		this.typingTime = typingTime;
		this.playedAt = playedAt;
	}

	public long validateTime(long time) {
		if (time <= 0) {
			throw new IllegalArgumentException("練習時間が不正です");
		}
		return time;
	}

	public LocalDate validatePlayedAt(LocalDate date) {
		if (date == null) {
			throw new IllegalArgumentException("練習日時が不正です");
		}
		return date;
	}
}
