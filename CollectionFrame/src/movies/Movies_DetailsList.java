package movies;

import java.util.*;

public class Movies_DetailsList {
	static Set<Movie_Details> mv = new TreeSet<Movie_Details>(new MovieNameComparator());
	static Movie_Details m1 = new Movie_Details("ForestGump","Tom HAnks","Robin Wright","Drama");
	static Movie_Details m2 = new Movie_Details("Catch me if you can","Leonardo DiCarpio","Amy Admas","Crime");
	static Movie_Details m3 = new Movie_Details("The Shakespear Redemption","Tim Robbins","Renee Blaine","Comedy");
	static Movie_Details m4 = new Movie_Details("The Godfather","Marlon Brando","Diane Keaton","Mafia");
	
	public static void add_movie() {
		mv.add(m1);
		mv.add(m2);
		mv.add(m3);
		mv.add(m4);
		System.out.println("Movies added: ");
		for(Movie_Details m:mv) {
			System.out.println("Movie name: "+m.getmov_Name()+"Lead Actor Name:"+m.lead_actor()+"LeadActress Name :"+m.getlead_actress()+"Genere name :"+m.getgenere);
		}
		
	}
	
	public static void remove_movie() {
		
		mv.remove(m2);
		System.out.println(m2.getmov_Name()+"Movies details removed");
	}
	
	public static void remove_moviesAll() {
		
		mv.removeAll(mv);
		System.out.println("All Movies details removed");
	}
	
	public static void find_movie_by_mov_name(String n) {
		
		for(Movie_Details m:mv) {
			if(n.equalsIgnoreCase(m.move_Name)) {
				System.out.println("Movie Name: " +m.getmov_Name()+"Lead Actor Name: "+m.lead_actor()+"Lead Actress: "+m.lead_actor()+
						"Genere: "+m.genere);
						
			}
		}
	}
	public static void find_movie_by_movie_genere(String g) {
		
		for(Movie_Details m:mv) {
			if(g.equalsIgnoreCase(m.genere)) {
				System.out.println("Movie Name: " +m.getmov_Name()+"Lead Actor Name: "+m.lead_actor()+"Lead Actress: "+m.lead_actor()+
						"Genere: "+m.genere);
			}
		}
	}
	
	public static void sortmov(String sort) {
		if(sort.equalsIgnoreCase("Movie Name")) {
			Set<Movie_Details>mvname = new TreeSet<Movie_Details>(new MovieNameComparator());
			Movie_Details mn1 = new Movie_Details("ForestGump","Tom HAnks","Robin Wright","Drama");
			Movie_Details mn2 = new Movie_Details("Catch me if you can","Leonardo DiCarpio","Amy Admas","Crime");
			Movie_Details mn3 = new Movie_Details("The Shakespear Redemption","Tim Robbins","Renee Blaine","Comedy");
			Movie_Details mn4 = new Movie_Details("The Godfather","Marlon Brando","Diane Keaton","Mafia");
			mvname.add(mn1);
			mvname.add(mn2);
			mvname.add(mn3);
			mvname.add(mn4);
			System.out.println("Movies added");
			for(Movies_Details mn:mvname) {
				System.out.println("Movie Name: " +mn.mov_Name+"Lead Actor Name: "+mn.lead_actor+"Lead Actress: "+mn.lead_actress+
						"Genere: "+mn.genere);
				
			}
		}
		
		else if(sort.equalsIgnoreCase("Actor")) {
			Set<Movie_Details>mvactor = new TreeSet<Movie_Details>(new MovieActorComparator());
			Movie_Details ma1 = new Movie_Details("ForestGump","Tom HAnks","Robin Wright","Drama");
			Movie_Details ma2 = new Movie_Details("Catch me if you can","Leonardo DiCarpio","Amy Admas","Crime");
			Movie_Details ma3 = new Movie_Details("The Shakespear Redemption","Tim Robbins","Renee Blaine","Comedy");
			Movie_Details ma4 = new Movie_Details("The Godfather","Marlon Brando","Diane Keaton","Mafia");
			mvactor.add(ma1);
			mvactor.add(ma2);
			mvactor.add(ma3);
			mvactor.add(ma4);
			System.out.println("Movies added");
			for(Movies_Details ma:mvactor) {
				System.out.println("Movie Name: " +ma.mov_Name+"Lead Actor Name: "+ma.lead_actor+"Lead Actress: "+ma.lead_actress+
						"Genere: "+ma.genere);
				
			}
			
		}
		
		else if(sort.equalsIgnoreCase("Actress")) {
			Set<Movie_Details>mvactress = new TreeSet<Movie_Details>(new MovieActressComparator());
			Movie_Details maa1 = new Movie_Details("ForestGump","Tom HAnks","Robin Wright","Drama");
			Movie_Details maa2 = new Movie_Details("Catch me if you can","Leonardo DiCarpio","Amy Admas","Crime");
			Movie_Details maa3 = new Movie_Details("The Shakespear Redemption","Tim Robbins","Renee Blaine","Comedy");
			Movie_Details maa4 = new Movie_Details("The Godfather","Marlon Brando","Diane Keaton","Mafia");
			mvactress.add(maa1);
			mvactress.add(maa2);
			mvactress.add(maa3);
			mvactress.add(maa4);
			System.out.println("Movies added");
			for(Movies_Details maa:mvactress) {
				System.out.println("Movie Name: " +maa.mov_Name+"Lead Actor Name: "+maa.lead_actor+"Lead Actress: "+maa.lead_actress+
						"Genere: "+maa.genere);
			}
				
		}
		
		else if(sort.equalsIgnoreCase("Genere")) {
			Set<Movie_Details>mvg = new TreeSet<Movie_Details>(new MovieGenereComparator());
			Movie_Details g1 = new Movie_Details("ForestGump","Tom HAnks","Robin Wright","Drama");
			Movie_Details g2 = new Movie_Details("Catch me if you can","Leonardo DiCarpio","Amy Admas","Crime");
			Movie_Details g3 = new Movie_Details("The Shakespear Redemption","Tim Robbins","Renee Blaine","Comedy");
			Movie_Details g4 = new Movie_Details("The Godfather","Marlon Brando","Diane Keaton","Mafia");
			mvg.add(g1);
			mvg.add(g2);
			mvg.add(g3);
			mvg.add(g4);
			System.out.println("Movies added");
			for(Movies_Details g:mvg) {
				System.out.println("Movie Name: " +g.mov_Name+"Lead Actor Name: "+g.lead_actor+"Lead Actress: "+g.lead_actress+
						"Genere: "+g.genere);
			}
		}	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add_movie();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the movie name you want to find");
		String name = sc.nextLine();
		find_movie_by_mov_name(name);
		System.out.println("Enter the movie genere you want to find");
		String genere = sc.nextLine();
		find_movie_by_mov_name(genere);
		System.out.println("Enter on the basis on which you want to sort");
		String s = sc.nextLine();
		sortmov(s);
		remove_movie();
		remove_moviesAll();

	}

}
