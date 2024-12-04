package modelclass;

public class TestQuestions {
	
	private int question_id;
	private int subtopic_id;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String answer;
	private int mark;
	public TestQuestions() {
	}
	public TestQuestions(int question_id, int subtopic_id, String question, String option1, String option2,
			String option3, String option4, String answer, int mark) {
		super();
		this.question_id = question_id;
		this.subtopic_id = subtopic_id;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
		this.mark = mark;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public int getSubtopic_id() {
		return subtopic_id;
	}
	public void setSubtopic_id(int subtopic_id) {
		this.subtopic_id = subtopic_id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	
	public String[] getArray()
	{
		String arr[]= {question_id+"",subtopic_id+"",question,option1,option2,option3,option4,answer,mark+""};
		return arr;
		
	}
	

}
