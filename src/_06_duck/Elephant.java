package _06_duck;

public class Elephant{
	String f;
	int hunger=0;
	String happinessLevel;
	Elephant(String favFood, String h) {
      	this.f= favFood;
      	this.happinessLevel = h;
	}


	void eat(String f) {
		if(f.equalsIgnoreCase("banana")) {
			this.hunger+=3;
			System.out.println("His hunger is: "+hunger);
		}
		
	}
	void makeFriends(Duck d) {
		if(d.numberOfFriends==0) {
			System.out.println("Hi duck! How are you");
			d.numberOfFriends+=1;
		}
		else {
			System.out.println("Duck's already your friend");
		}
	}
}
class Duck{
	String favFood;
	int numberOfFriends;
	Duck(String favoriteFood, int numberOfFriends) {
      	this.favFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
}
void quack(){
	
}
void waddle() {
	
}

}

