/**
 * @(#)MoodleUsers.java
 * @Joseph Tierney
 * @version 1.00 2017/10/10
 */

class MoodleUsers{

	private static final String userData[] = {	"Li Zhang",
						"Shun Wen Chook",
						"Aleksandra Wos",
						"Wiktor Lesiak",
						"Gabby Farrell",
						"Dean Poynton",
						"Jenny O Connell",
						"Catharine Phoenix",
						"Piotr Poreba",
						"Karl Roche",
						"Florian Boyrie",
						"Daniel Molloy",
						"Danilo Loayon",
						"Owen Norris",
						"Agata Dzierzak",
						"Pawel Poreba",
						"Jack Bolger",
						"Stephen O Brien",
						"Maxence Morand",
						"Azriel Carl Pagayonan",
						"Liam Rooney",
						"Eoghan De Bhal",
						"Derek Mc Carthy",
						"Andrei Tudoran",
						"Emmanuel Apara",
						"Adam Mc Carthy",
						"Daniel Dixon",
						"Paul Lupu",
						"Conor Byrne",
						"Ken Kilmartin",
						"Conor Walsh",
						"Joseph Tierney",
						"Andrew Sherlock",
						"Richard Bukovcsan",
						"Christopher Slattery",
						"Sean Moloney",
						"Artur Wac",
						"Lee Gerety",
						"Nasir Iqbal",
						"Jessica Tati"};

	public int binaryChoice(){
		if (Math.random() > 0.5)
			return 1;
		else
			return 0;
	}//end binaryChoice

	public void sleepRandom(int seconds){
		try{
			Thread.sleep((long)(Math.random() * (seconds*1000) ));
		}//end try
		catch(InterruptedException e){
			e.printStackTrace();
		}//end catch
	}//end sleepRandom

	public static void main(String[] args){
		MoodleUsers login = new MoodleUsers();
		ListReferenceBased lrb = new ListReferenceBased();
		String ch = (login.binaryChoice()==1) ? "YES" : "NO";

		//for loop to add the users
		for(int i = 0; i < userData.length; i++){
			System.out.println("[ Adding User: " + userData[i] + " ] ");
			lrb.add(i,userData[i]);
			login.sleepRandom(1);
		}//end for

		//if the list size is 40
		if(lrb.size() == 40){
			System.out.println("");
			System.out.println("[ *** All " + lrb.size() + " Users Added *** ]");
		}//end if

		//set the round
		int round = 1;
		//while the list is not empty
		while(!lrb.isEmpty()){
			System.out.println("");
			System.out.println("[ *** Processing Round " + (round++) + " *** ]");
			//for loop for users to log in or out based on random choice (ch)
			for(int i = lrb.size()-1; i>=0; i--){
				ch = (login.binaryChoice()==1) ? "YES" : "NO";
				System.out.println("[ " + lrb.get(i)+ " logging off: " + ch + " ] ");
				login.sleepRandom(1);
				if(ch.equals("YES")){
					lrb.remove(i);	//remove user from list if ch is yes
				}//end if

			}//end for
			System.out.println("");
			System.out.println("[ *** Users Left: " + lrb.size() + " *** ]");
			//if the list is empty
				if(lrb.isEmpty()){
					System.out.println("");
					System.out.println("[ *** All Users Logged Off *** ]");
				}//end if
		}//end while
	}//end main
}//end class