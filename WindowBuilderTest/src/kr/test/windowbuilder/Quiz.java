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

	public Quiz() {
		qpa = new String[20][5];

		// Part 1 questions and answers
		qpa[0][0] = "Which country used rockets first?";
		qpa[0][1] = "China";
		qpa[0][2] = "USA";
		qpa[0][3] = "Russia";
		qpa[0][4] = "Germany";

		qpa[1][0] = "In which century rockets were first used?";
		qpa[1][1] = "13th century";
		qpa[1][2] = "12th century";
		qpa[1][3] = "11th century";
		qpa[1][4] = "14th century";

		qpa[2][0] = "Who was the first man on the Moon?";
		qpa[2][1] = "Neil Strongarm";
		qpa[2][2] = "Lean Armstrong";
		qpa[2][3] = "Neil Armstrong";
		qpa[2][4] = "Michael Jackson";

		qpa[3][0] = "What does the engine of a rocket need in order to work?";
		qpa[3][1] = "Coal and steam";
		qpa[3][2] = "Electricity and ice";
		qpa[3][3] = "Lava and water";
		qpa[3][4] = "Fuel and oxygen";

		//FillInTheBlanks question
		qpa[4][0] = "Rockets have been used first by (Blank_1) soldiers in 1232 in fights against Mongols.<br>However, these rockets could not fly to space. In 1957 (Blank_2) brought Sputnik 1 to space with a rocket.<br>In July 1969 a Rocket brought Neil Armstrong to the (Blank_3). He became the first person on the moon.<br>The engine of a rocket use fuel and oxygen in order to move the rocket.<br>Due to Newtons three motion laws, the rocket can even move in space.</html>";


		// Part 2 questions and answers
		qpa[5][0] = "Of how many main parts consists a rocket?";
		qpa[5][1] = "2";
		qpa[5][2] = "3";
		qpa[5][3] = "4";
		qpa[5][4] = "5";

		qpa[6][0] = "Which of the options is not a part of a rocket?";
		qpa[6][1] = "Body";
		qpa[6][2] = "Nose";
		qpa[6][3] = "Guidance";
		qpa[6][4] = "Payload";

		qpa[7][0] = "How fast has the rocket at least to become in order to enter outer space?";
		qpa[7][1] = "3000 km/h";
		qpa[7][2] = "4000 km/h";
		qpa[7][3] = "6000 km/h";
		qpa[7][4] = "2000 km/h";

		qpa[8][0] = "Which part takes care of controlling the rocket?";
		qpa[8][1] = "Guidance ";
		qpa[8][2] = "Structure";
		qpa[8][3] = "Payload";
		qpa[8][4] = "Propulsion";

		//Image question
		qpa[9][0] = "Where is the payload in this picture?";
		
		// Part 3 questions and answers

		qpa[10][0] = "Who published the book which began Rocket Science?";
		qpa[9][1] = "Galileo Galilei";
		qpa[9][2] = "Isaac Newton";
		qpa[9][3] = "Nicolaus Copernicus";
		qpa[9][4] = "Leonardo da Vinci";

		qpa[11][0] = "How many Newton’s Laws of Motion? exists";
		qpa[11][1] = "3";
		qpa[11][2] = "4";
		qpa[11][3] = "5";
		qpa[11][4] = "6";
		
		qpa[12][0] = "As Newton’s First Law of Motion,\nWhat is the future state about objects which in motion?\n(Unless objects acted upon by an unbalanced force)";
		qpa[12][1] = "It will slow down and stop.";
		qpa[12][2] = "It will accelerate.";
		qpa[12][3] = "It will repeat slowing down and accelerating.";
		qpa[12][4] = "It will in motion as before. ";
		
		qpa[13][0] = "What is the equation about Newton’s Second Law?\n( Use: acceleration(a), force(f), mass(m) )";
		qpa[13][1] = "f"+"\u00B2"+" a" + "\u00B2" + " + m" +"\u00B2";
		qpa[13][2] = "f = ma" + "\u00B2";
		qpa[13][3] = "f = m/a";
		qpa[13][4] = "f = ma";
		
		//FillInTheBlanks question
		qpa[14][0] = "Fill in the blank.\nFollowing the Newton’s Third Law of Motion, \nfor every _______ there is always an ___________ and equal reaction.";

		// Part 4 questions and answers
		qpa[15][0] = "The Moon is?";
		qpa[15][1] = "a natural satellite";
		qpa[15][2] = "a man made satellite";
		qpa[15][3] = "a big white point in the sky";
		qpa[15][4] = "an UFO";
		
		qpa[16][0] = "The International Space Station is?";
		qpa[16][1] = "a scientific station";
		qpa[16][2] = "a meteorological satellite";
		qpa[16][3] = "an international fuel station in the space";
		qpa[16][4] = "a building with astronaut from every country";
		
		qpa[17][0] = "A telecommunication satellite permit is?";
		qpa[17][1] = "The use of mobile phone";
		qpa[17][2] = "The use of gps";
		qpa[17][3] = "The discussion between two people";
		qpa[17][4] = "a permit to translate people in live";
		
		qpa[18][0] = "A man made satellite is?";
		qpa[18][1] = "a satellite where each piece is made by a single man";
		qpa[18][2] = "an artificial satellite build by men";
		qpa[18][3] = "a satellite created by Man corp";
		qpa[18][4] = "something like the Moon";
		
		//Image question
		qpa[19][0] = "Where is the exosphere?";
		
		
		// qca will store the questions and the correct answers
		qca = new String[20][4];

		qca[0][0] = "Which country used rockets first?";
		qca[0][1] = "China";

		qca[1][0] = "In which century rockets were first used?";
		qca[1][1] = "13th century";

		qca[2][0] = "Who was the first man on the Moon?";
		qca[2][1] = "Neil Armstrong";

		qca[3][0] = "What does the engine of a rocket need to work?";
		qca[3][1] = "Fuel and oxygen";

		qca[4][0] = "<html>Rockets have been used first by (Blank_1) soldiers in 1232 in fights against Mongols.<br>However, these rockets could not fly to space. In 1957 (Blank_2) brought Sputnik 1 to space with a rocket.<br>In July 1969 a Rocket brought Neil Armstrong to the (Blank_3). He became the first person on the moon.<br>The engine of a rocket use fuel and oxygen in order to move the rocket.<br>Due to Newtons three motion laws, the rocket can even move in space. ";
		qca[4][1] = "Chinese";
		qca[4][2] = "USSR";
		qca[4][3] = "Moon";
		

		qca[5][0] = "Of how many main parts consists a rocket?";
		qca[5][1] = "4";

		qca[6][0] = "Which of the options is not a part of a rocket?";
		qca[6][1] = "Nose";

		qca[7][0] = "How fast has the rocket at least to become in order to enter outer space?";
		qca[7][1] = "4000 km/h";

		qca[8][0] = "Which part takes care of controlling the rocket?";
		qca[8][1] = "Guidance";
		
		qca[9][0] = "Where is the payload in this picture?";
		qca[9][1] = "";

		qca[10][0] = "Who published the book which began Rocket Science?";
		qca[10][1] = "Isaac Newton";
		
		qca[11][0] = "How many Newton’s Laws of Motion? exists";
		qca[11][1] = "3";
		
		qca[12][0] = "As Newton’s First Law of Motion,\nWhat is the future state about objects which in motion?\n(Unless objects acted upon by an unbalanced force)";
		qca[12][1] = "It will in motion as before.";
		
		qca[13][0] = "What is the equation about Newton’s Second Law?\n( Use: acceleration(a), force(f), mass(m) )";
		qca[13][1] = "f = ma";
		
		qca[14][0] = "Fill in the blank.\nFollowing the Newton’s Third Law of Motion, \nfor every _______ there is always an ___________ and equal reaction.";
		qca[14][1] = "action";
		qca[14][2] = "opposite";
		
		qca[15][0] = "The Moon is?";
		qca[15][1] = "a natural satellite";
		
		qca[16][0] = "The International Space Station is?";
		qca[16][1] = "a scientific station";
		
		qca[17][0] = "A telecommunication satellite permit is?";
		qca[17][1] = "The use of mobile phone";
		
		qca[18][0] = "A man made satellite is?";
		qca[18][1] = "an artificial satellite build by men";
		
		qca[19][0] = "Where is the exosphere?";
		qca[19][1] = "";
	}

	public static void main(String[] args) {
		Quiz q = new Quiz();

	}

}
