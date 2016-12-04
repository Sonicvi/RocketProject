package kr.test.windowbuilder;

/**
 * 
 * @author Riku Kärki
 * 
 *         This class holds the question and answer pairs, the score and a
 *         question counter which indicates to the user which question he/she is
 *         answering at the moment
 *
 */
public class Quiz {
	public String[][] getQpa() {
		return qpa;
	}

	public String[][] getQca() {
		return qca;
	}



	String[][] qpa;
    String[][] qca;
    
    public Quiz(){
    	qpa = new String [14][5];
    	
	    	 qpa[0][0]="How to run Java program on the command prompt?";
	         qpa[0][1]="javac JavaProgram";
	         qpa[0][2]="java JavaProgram";
	         qpa[0][3]="javac JavaProgram.java";
	         qpa[0][4]="No one";
	
	         qpa[1][0]="What is the use of the println method?";
	         qpa[1][1]="It is used to print text on the screen.";
	         qpa[1][2]="It is used to print text on the screen with the line break.";
	         qpa[1][3]="It is used to read text from keyboard.";
	         qpa[1][4]="It is used to read text from a file.";
	        
	         qpa[2][0]="How to read a character from the keyboard?";
	         qpa[2][1]="char c=System.read()";
	         qpa[2][2]="char c=System.in.read()";
	         qpa[2][3]="char c=(char)System.read()";
	         qpa[2][4]="char c=(char)System.in.read()";
	
	         qpa[3][0]="Which one is a single-line comment?";
	         qpa[3][1]="/...";
	         qpa[3][2]="//...";
	         qpa[3][3]="/*...";
	         qpa[3][4]="/*...*/";
	
	         qpa[4][0]="How do you declare an integer variable x?";
	         qpa[4][1]="int x";
	         qpa[4][2]="x as Integer";
	         qpa[4][3]="Int[] x";
	         qpa[4][4]="No one is correct.";
	
	         qpa[5][0]="How do you convert a string of number to a number?";
	         qpa[5][1]="int num=Integer.parseInt(str_num)";
	         qpa[5][2]="int num=str_num.toInteger()";
	         qpa[5][3]="int num=(int)str_num";
	         qpa[5][4]="int num=(Integer)str_num";
	
	         qpa[6][0]="What is the value of x? int x=3>>2";
	         qpa[6][1]="1";
	         qpa[6][2]="0";
	         qpa[6][3]="3";
	         qpa[6][4]="-3";
	
	         qpa[7][0]="How to do exit a loop?";
	         qpa[7][1]="Using exit";
	         qpa[7][2]="Using break";
	         qpa[7][3]="Using continue";
	         qpa[7][4]="Using terminate";
	
	         qpa[8][0]="What is the correct way to allocate one-dimensional array?";
	         qpa[8][1]="int[size] arr=new int[]";
	         qpa[8][2]="int arr[size]=new int[]";
	         qpa[8][3]="int[size] arr=new int[size]";
	         qpa[8][4]="int[] arr=new int[size]";
	
	         qpa[9][0]="What is the correct way to allocate two-dimensional array?";
	         qpa[9][1]="int[size][] arr=new int[][]";
	         qpa[9][2]="int arr=new int[rows][cols]";
	         qpa[9][3]="int arr[rows][]=new int[rows][cols]";
	         qpa[9][4]="int[][] arr=new int[rows][cols]";
	         
	         //qca will store the questions and the correct answers
	         qca=new String[14][2];
             
             qca[0][0]="How to run Java program on the command prompt?";
             qca[0][1]="java JavaProgram";

             qca[1][0]="What is the use of the println method?";
             qca[1][1]="It is used to print text on the screen with the line break.";

             qca[2][0]="How to read a character from the keyboard?";
             qca[2][1]="char c=(char)System.in.read()";

             qca[3][0]="Which one is a single-line comment?";
             qca[3][1]="//...";


             qca[4][0]="How do you declare an integer variable x?";
             qca[4][1]="int x";

             qca[5][0]="How do you convert a string of number to a number?";
             qca[5][1]="int num=Integer.parseInt(str_num)";

             qca[6][0]="What is the value of x? int x=3>>2";
             qca[6][1]="0";
            
             qca[7][0]="How to do exit a loop?";
             qca[7][1]="Using break";
            
             qca[8][0]="What is the correct way to allocate one-dimensional array?";
             qca[8][1]="int[] arr=new int[size]";

             qca[9][0]="What is the correct way to allocate two-dimensional array?";
             qca[9][1]="int[][] arr=new int[rows][cols]";
    }

	public static void main(String[] args) {
		Quiz q = new Quiz();

	}

}
