public class HangmanImage {

	public HangmanImage(){}
	
	public void draw(int livesRemaining){
		switch(livesRemaining){
		default:
			this.drawPole();
			this.drawNuse();
			this.drawHead();
			this.drawLeftArm();
			this.drawRightArm();
			this.drawBody();
			this.drawLegs();
			break;
		case 1:
			this.drawPole();
			this.drawNuse();
			this.drawHead();
			this.drawLeftArm();
			this.drawRightArm();
			this.drawBody();
			break;
		case 2:
			this.drawPole();
			this.drawNuse();
			this.drawHead();
			this.drawLeftArm();
			this.drawRightArm();
			break;
		case 3:
			this.drawPole();
			this.drawNuse();
			this.drawHead();
			this.drawLeftArm();
			break;
		case 4:
			this.drawPole();
			this.drawNuse();
			this.drawHead();
			break;
		case 5:
			this.drawPole();
			this.drawNuse();
			break;
		case 6:
			this.drawPole();
			break;
		}
		
	}
	
	public void drawPole(){
		String pole = " ----------------�";
					/*+" ¦\n"	     
					+" ¦\n"         
					+" ¦\n"         
					+" ¦\n"         
					+" ¦\n"        
					+" ¦\n"         
					+" ¦\n"         
					+" ¦\n"         
					+" ¦\n"           
					+" ¦\n"
					+" ¦\n" 
					+" ¦\n" 
					+" ¦\n" 
					+" ¦\n" 
					+" ¦\n" 
					+" ¦\n" 
					+" ¦\n"
	+" -------------------------------\n";*/ 
		System.out.println(pole);
		String head = "---"
				   +"(" + ")"
				     +"---";
		String body =  "|"+
				       "|"+
				       "|"+
				       "|"+
				       "|";
		String leftArm = "-----";
		String rightArm = "-----";
		String leftLeg = "/"+
						"/"+
				       "/"+
					  "/";
		String rightLeg = "\\"+
					        "\\"+
					         "\\"+
					          "\\";	
		
	}
	
	public void drawHead(){
		String head = "	        ---\n"
				   +"	       (   " + ")\n"
				     +"	        ---\n"
				     +
				     "                 |";
		System.out.println(head);
	}
	
	public void drawLeftArm(){
		String arm =  "            -----";
		System.out.print(arm);
	}
	
	public void drawRightArm(){
		String arm =  " -----";
		System.out.println(arm);
	}
	
	public void drawBody(){
		String body =  "	         |\n"+
			       	   "	         |\n"+
			           "	         |";
		System.out.println(body);
	}
	
	public void drawNuse(){
		String nuse = "	         |\n"+
//				      "	         |\n"+
//				      "	         |\n"+
//				      "	         |\n"+
//				      "	         |\n"+
				      "	         |\n"+
				      "	         |";
		System.out.println(nuse);
	}
	
	public void drawLegs(){
		String legs = "                / \\\n"+
		       "               /   \\\n"+
			  "              /     \\\n"+
		     "             /       \\\n";
		System.out.println(legs);
	}
	
	public static void main(String args[]){
//		HangmanImage this = new HangmanImage();
//		this.drawPole();
//		this.drawNuse();
//		this.drawHead();
//		this.drawLeftArm();
//		this.drawRightArm();
//		this.drawBody();
//		this.drawLegs();
	}

}