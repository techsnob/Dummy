package com.techsnob.interviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.event.ListSelectionEvent;

class Player{
	String name;
	int score;
	
	Player(String name, int score){
		this.name=name;
		this.score=score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Player=[" + name + "," + score + "]";
	}
	
	
	
}
public class MagicNumber {

	public static void main(String[] args) {
//		int input = 1748;
//		
//		int total = 0;
//		while(total > 9 || input > 0) {
//			
//			if(input == 0) {
//				input = total;
//				total = 0;
//			}
//			
//			total = total + input%10;
//			input = input/10;
//		}
//		System.out.println(total);
		
//		String s = "InterviewWithNaresh";
//		System.out.println(s.chars().mapToObj(c -> (char)c).collect(Collectors.toList()).stream().collect(Collectors.groupingBy(e->e, Collectors.counting())));

		List<Player> players = new ArrayList<Player>();
		players.add(new Player("Alekya",100));
		players.add(new Player("Adi",100));
		players.add(new Player("Robin",75));
		players.add(new Player("Ram",75));
		players.add(new Player("Sharma",35));
		players.add(new Player("Ajinkya",150));
		
		//Sorts list in Descending order of score
		Collections.sort(players, new Comparator<Player>() {
			@Override
			public int compare(Player p1, Player p2) {
				if(p1.getScore() == p2.getScore()) {
					return p1.getName().compareToIgnoreCase(p2.getName());
				}
				return p2.getScore() - p1.getScore();
			}
		});
		
		//System.out.println(players);
		
		Map<Integer, List<Player>> sameScoredPlayers = players.stream().collect(Collectors.groupingBy(Player::getScore, Collectors.toList()));
		System.out.println(sameScoredPlayers);
	}

}
