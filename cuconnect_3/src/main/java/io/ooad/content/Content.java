package io.ooad.content;

public class Content {


	private String status;
	private String feeling;
	
	public Content() {
		
	}
	
	public Content(String status, String feeling) {
		//super();
		this.status = status;
		this.feeling = feeling;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFeeling() {
		return feeling;
	}
	public void setFeeling(String feeling) {
		this.feeling = feeling;
	}
	
	
}
