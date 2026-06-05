package nursingRecordTyping.appilcation.command;

public class TextCommand {
	String jaText;
	String enText;

	public TextCommand() {
	}

	public TextCommand(String jaText, String enText) {
		super();
		this.jaText = jaText;
		this.enText = enText;
	}

	public String getJaText() {
		return jaText;
	}

	public String getEnText() {
		return enText;
	}

}
