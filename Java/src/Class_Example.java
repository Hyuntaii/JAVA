import java.util.Scanner;

public class Class_Example {
	
	static class Player{
		
		String name;
		int hp;
		int atk;
		
		public Player(String name, int hp, int atk) {
			this.name = name;
			this.hp = hp;
			this.atk=atk;
		}
		
		public void attack(Enemy enemy) {
			System.out.println(name+"attack!");
			enemy.hp2-=this.atk;
			System.out.println(enemy.name2 +"hp : "+ enemy.hp2);
		}
		public boolean islive() {
			if(hp<=0) {
				return false;
			}
			else {
				return true;
			}
		}
		
	}
	
	static class Enemy{
		String name2;
		int hp2;
		int atk2;
		public Enemy(String name2, int hp2, int atk2) {
			this.name2 =name2;
			this.hp2 = hp2;
			this.atk2 = atk2;
		}
		
		public void attack(Player player) {
			System.out.println(name2+"attack!");
			player.hp-= this.atk2;
			System.out.println(player.name +"hp : "+ player.hp);
		}
		
		public boolean islive() {
			if(hp2<=0) {
				return false;
			}
			else {
				return true;
			}
		}
		
	}
	

	public static void main(String[] args) {
		System.out.println("플레이어1을 입력하세요(이름,hp,공격력)");
		Scanner sc =new Scanner(System.in);
		String name = sc.next();
		int hp = sc.nextInt();
		int atk = sc.nextInt();
		System.out.println("플레이어2를 입력 하세요(이름,hp,공격력)");
		Scanner sc2 = new Scanner(System.in);
		String name2 = sc2.next();
		int hp2=sc2.nextInt();
		int atk2= sc2.nextInt();
		sc.close();
		sc2.close();
		
		
		Player player = new Player(name,hp,atk);
		Enemy enemy = new Enemy(name2,hp2,atk2);

		while(player.islive() && enemy.islive()) {
			player.attack(enemy);
			if(!enemy.islive())break;
			enemy.attack(player);
			if(!player.islive())break;
		}
		if(player.islive()) {
			System.out.println(player.name+" win");
		}
		else {
			System.out.println(enemy.name2+" win");
		}

	}

}
