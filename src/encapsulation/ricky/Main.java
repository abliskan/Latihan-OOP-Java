package encapsulation.ricky;

class Player {
	private String name;
	private int baseHealth;
	private int baseAttack;
	private Armor armor;
	private Weapon weapon;
	private int level;
	private int incrementHealth;
	private int incrementAttack;
	
	public Player(String name) {
		this.name = name;
		this.baseHealth = 100;
		this.baseAttack = 100;
		this.level = 1;
		this.incrementHealth = 20;
		this.incrementAttack = 20;
	}
	
	public void display() {
		System.out.println("Player\t\t: " + this.name);
		System.out.println("Level\t\t: " + this.level);
		System.out.println("Health\t\t: " + this.maxHealth());
		System.out.println("Attack\t\t: " + this.getAttackPower() + "\n");
	}
	
	public void levelUp() {
		this.level++;
	}
	
	public void setArmor(Armor armor) {
		this.armor = armor;
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public int maxHealth() {
		return this.baseHealth + this.level * this.incrementHealth + this.armor.getAddHealth();
	}
	
	public int getAttackPower() {
		return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack(); 
	}
}

class Armor {
	private String name;
	private int strength;
	private int health;
	
	public Armor(String name, int strength, int health) {
		this.name = name;
		this.strength = strength;
		this.health = health;
	}
	
	public int getAddHealth() {
		return this.strength * 10 + this.health;
	}
}

class Weapon {
	private String name;
	private int attack;
	
	public Weapon(String name, int attack) {
		this.name = name;
		this.attack = attack;
	}
	
	public int getAttack() {
		return this.attack;
	}
}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("Bob");
		Armor am1 = new Armor("Steel Armor", 5, 100);
		Weapon eguip1 = new Weapon("Sword", 10);
		p1.setArmor(am1);
		p1.setWeapon(eguip1);
		
		Player p2 = new Player("Nina");
		Armor am2 = new Armor("Bronze Armor", 1, 50);
		Weapon eguip2 = new Weapon("Sword", 10);
		p2.setArmor(am2);
		p2.setWeapon(eguip2);
		
		p1.display();
		p1.levelUp();
		p1.display();
		
		p2.display();
		p2.levelUp();
		p2.display();
	}
}

// Last Log vid = 24:39