package domain;

import javax.persistence.Entity;
@Entity
public class Question extends DomainEntity{
	
	//Attributes
	private String text;
//	private List<String> options;
	
	public Question(){
		super();
		text = "";
//		options=new ArrayList<String>();
	}
	
	public Question(String s){
		super();
		text = s;
	}
	//Methods
	public Question(Survey s){
		text = new String("");
//		options=new ArrayList<String>();
	}
	public String getText(){
		return text;
	}
//	public List<String> getOptions(){
//		return options;
//	}
	public void setText(String text){
		this.text = text;
	}
//	public void setOptions(List<String> options){
//		this.options=options;
//	}

	@Override
	public String toString() {
		return "Question [text = " + text + "]";
	}
		
	
}
