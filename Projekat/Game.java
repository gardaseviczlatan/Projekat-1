package Projekat;

class Player {
	
	private String Name;
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	
	public Player(String Name,int x, int y,int width, int height,int health) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.health=health;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = 100;
	}
	
	public void Collision(int collision) {
		setHealth(health - collision);
	}
	
	public void ispisi() {
		System.out.println("Player: " + Name + ", na poziciji: " + x + y + ", sa sirinom i duzinom: " + width + height + " i healthom: " + health);
	}
	
	
	
}



class Enemy {
	
	private String Type;
	private int x;
	private int y;
	private int width;
	private int height;
	private int damage;
	
	public Enemy(String Type,int x, int y,int width, int height,int damage) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.damage=damage;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void ispisi() {
		System.out.println("Enemy: " + Type + ", na poziciji: " + x + y + ", sa sirinom x duzinom: " + width + height + " i damage: " + damage);
	}
	
	
	
	
}

public class Game {
	
	public void checkCollision() {
		
	}
	
	
	
	
	
	
	
	
	Player p1 = new Player("Igrac",2,3,4,5,100);
	Player p2 = new Player("Igrac 2",4,6,1,2,100);
	Enemy e1 = new Enemy("Goblin",1,3,5,1,20);

	
	
	
	

	public static void main(String[] args) {
		
	}

}
