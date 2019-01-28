
public class Cat extends Animals {

 public static int R=200;
 public static int S=0;
 public static double J=2;
	


   public Cat (int Run, int Swim, int Jump, int Hungry) {
	 this._run(Run);
	 this._swim(Swim);
	 this._jump(Jump);
	
	 this._hunger(Hungry);
 }

 
 public void ToRun() {
	 System.out.println((this.run<=R) ? "УСПЕХ!*Куклачев в вашей голове дьявольски хохочет*" : "ПРОВАЛ! Ваша киска не выдержала издевательских приказов и сбежала от вас!");
 }
 
 public void ToSwim() {
	 System.out.println((this.swim<=S) ? "УСПЕХ!*Куклачев в вашей голове дьявольски хохочет*" : "ПРОВАЛ! Ваша киска не выдержала издевательских приказов и уплыла под водой от вас! Постойте! Но ваша киска не умеет плавать! Упс...");
 }

 public void ToJump() {
	 System.out.println((this.jump<=J) ? "УСПЕХ!*Куклачев в вашей голове дьявольски хохочет*" : "ПРОВАЛ! Ваша киска не выдержала издевательских приказов и упрыгала от вас!");
 }
 public void ToEat(){

 }

}
