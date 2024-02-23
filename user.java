import java.util.*;
class user {
	private String username;//U no 
	private String password;
	private String firstName;
	private String lastName;
	private String mail;
	private String year;//pass out year
	private String branch;
	private long mobNo;
	private ArrayList<String> clubs;
	
	user(String u , String p ,String fn , String ln , String m , String y, String b , long mno){
		username = u;
		password = p;
		firstName = fn;
		lastName = ln;
		mail = m;
		year = y;
		branch = b;
		mobNo = mno;
		clubs = new ArrayList<>();
	}
	//getter setter methods for each attribute
	
}
