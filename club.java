public class club {
	private String username;
	private String password;
	String clubName;
	String lead;
	String faculty;
	String domain;//software,hardware,cultural,sports,finance,etc
	String description;
	int numOfMembers;
	int startYear;
	int subTeams;
	//hierarchy?
	
	club(String u , String p , String n , String l , String f ,String d , String desc,int num , int sy , int st){
		username = u;
		password = p;
		clubName = n;
		lead = l;
		faculty = f;
		domain = d;
		description = desc;
		numOfMembers = num;
		startYear = sy;
		subTeams = st;
		
	}
}
