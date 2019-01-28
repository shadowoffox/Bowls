

public class Animals {
protected int run;
protected int swim;
protected double jump;
public int hunger;//аппетит
public boolean satiety=false; //сытый?


	 public  void _run(int Rlength) {
		 run=Rlength;	 
	 }
	
	 public void _swim(int Slength) {
		 swim=Slength;
	 }
	
	 public void _jump(double height) {
		 jump=height;
	 }

	 public void _hunger(int Hunger){hunger=Hunger;}

	 public void _Satiety(boolean Satiety){satiety=Satiety;}
	
}
