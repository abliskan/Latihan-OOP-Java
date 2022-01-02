package polymorphism.ricky;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Polymorphism
		Hero hero1 = new Hero("Bob");
		HeroStrength hero2 = new HeroStrength("Uzuil");
		hero1.display();
		hero2.display();
		

		Hero hero3 = new HeroAgility("Nina");		
		hero3.display();
		
		HeroIntel hero4 = new HeroIntel("Tanls");
		hero4.display();
		
		HeroAgility hero5 = new HeroAgility("Donita");
		hero5.display();
		hero5.showoff();
		
		// Membuat Array list
		Hero[] kumpulanHero = new Hero[5];
		kumpulanHero[0] = hero1;
		kumpulanHero[1] = hero2;
		kumpulanHero[2] = hero3;
		kumpulanHero[3] = hero4;
		kumpulanHero[4] = hero5; // casting
		
		kumpulanHero[0].display();
		kumpulanHero[1].display();
		kumpulanHero[2].display();
		
		hero1.attack(hero2);
		hero1.attack(hero3);
		hero1.attack(hero4);
		hero1.attack(hero5);
	}
}









