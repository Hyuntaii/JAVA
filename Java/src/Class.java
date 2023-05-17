
public class Class {

	
	public static void main(String[] args) {
	
		PlayerCharacter player = new PlayerCharacter("gamepari",100,12);
		EnemyCharacter enemy = new EnemyCharacter("orc",80,5);
		
		while(player.isLive() && enemy.isLive()) {
			player.attack(enemy);
			if(!enemy.isLive()) break; 
			enemy.attack(player);
		}
		
		if (player.isLive()) {
			System.out.println("player win");
		}
		else {
			System.out.println("enemy win");
		}
		
	}
}
