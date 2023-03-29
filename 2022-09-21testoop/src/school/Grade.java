package school;

import java.util.Arrays;



public class Grade {

	private Name professions;
	private int score;

	private static int c;
	
	public Grade() {
		super();
			if(c<6) {
		this.professions= Name.values()[c++];
			}else {
				c=0;
				this.professions= Name.values()[c++];
			}
		this.score = (int)(Math.random()*61)+40;
	
	}

	

	@Override
	public String toString() {
		return " [profession - " + professions + ", score - " + score +  "]";
	}


	






	public Name getProfessions() {
		return professions;
	}


	public int getScore() {
		return score;
	}
	
	
	

	
}
