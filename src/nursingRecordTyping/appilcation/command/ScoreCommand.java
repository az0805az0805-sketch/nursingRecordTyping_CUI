package nursingRecordTyping.appilcation.command;

public class ScoreCommand {
	private int wrongCount;
	private long timeTaken;
	private int textLength;
	private long totalScore;

	public ScoreCommand(int wrongCount, long timeTaken, int textLength, long totalScore) {
		this.wrongCount = wrongCount;
		this.timeTaken = timeTaken;
		this.textLength = textLength;
		this.totalScore = totalScore;
	}

	public int getWrongCount() {
		return wrongCount;
	}

	public long getTimeTaken() {
		return timeTaken;
	}

	public int getTextLength() {
		return textLength;
	}

	public long getTotalScore() {
		return totalScore;
	}
}
