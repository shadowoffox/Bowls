import java.util.Scanner;

public class command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Cat cat = new Cat(100, 2, 3 ,10);
		cat.ToRun();
		cat.ToSwim();
		cat.ToJump();
		new Bowls(100);
		cat.ToEat();
		
		Cat cat1 = new Cat(100,2,3, 10);
		Cat_Restriction();
		cat1.ToRun();
		cat1.ToSwim();
		cat1.ToJump();
		
		Dog dog = new Dog(1000, 2, 0.1);
		dog.ToRun();
		dog.ToSwim();
		dog.ToJump();
		
		Dog dog1 = new Dog(1000, 2, 0.1);
		Dog_Restriction();
		dog1.ToRun();
		dog1.ToSwim();
		dog1.ToJump();
*/
		Cat[] cats = new Cat[]{
		new Cat(100,2,3, 19),
		new Cat(100,2,3, 14)
		};
		Bowls bowl = new Bowls(20);
		for (Cat cat2: cats){

			cat2.ToEat(bowl);
		}
	}

	public static void Cat_Restriction () {
		
		System.out.println("Решите сами как ограничить кису: бег, плаванье, прыжок");
		Scanner newscan = new Scanner(System.in);
		
		Cat.R=newscan.nextInt();
		Cat.S=newscan.nextInt();
		Cat.J=newscan.nextDouble();
	}

public static void Dog_Restriction () {
		
		System.out.println("Решите сами как ограничить собаку: бег, плаванье, прыжок");
		Scanner newscan = new Scanner(System.in);
		
		Dog.R=newscan.nextInt();
		Dog.S=newscan.nextInt();
		Dog.J=newscan.nextDouble();
	}


}
