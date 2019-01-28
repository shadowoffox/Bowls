
public class Dog extends Animals {

	 public static int R=500;
	 public static int S=10;
	 public static double J=0.5;
	 
	 public Dog (int Run, int Swim, double Jump) {
		 this._run(Run);
		 this._swim(Swim);
		 this._jump(Jump);
	 }
	 

	 public void ToRun() {
		 System.out.println((this.run>=R) ? "УСПЕХ! Ктооо тут хороший мальчик?" : "ПРОВАЛ! Ваша собака не смогла оправдать ваших надежд и расстроено смотрит на вас!");
		 
	 }
	 
	 public void ToSwim() {
		 System.out.println((this.swim>=S) ? "УСПЕХ! Ктооо тут хороший мальчик?" : "ПРОВАЛ! Ваша собака не смогла оправдать ваших надежд и расстроено смотрит на вас!");
		 
	 }
	 public void ToJump() {
		 System.out.println((this.jump>=J) ? "УСПЕХ! Ктооо тут хороший мальчик?" : "ПРОВАЛ! Ваша собака не смогла оправдать ваших надежд и расстроено смотрит на вас!");
		 
	 }
}
