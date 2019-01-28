
public class New_Sotrudnik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sotrudnik New_man = new Sotrudnik("qweqwe qwqwe qwe","IT", "��", "+79996216369", 100000,29);
		New_man.SeeHim();
		
		System.out.println();
		

			
		Sotrudnik[] persArray = new Sotrudnik[5];
		persArray[0] = new Sotrudnik("Ivanov Ivan", "Engineer", " ivivan@mailbox.com ", "892312312", 30000,	30);
		persArray[1] = new Sotrudnik("Ivanov Ivan1", "Engineer", " ivivan@mailbox.com ", "892312313", 30001, 60);
		persArray[2] = new Sotrudnik("Ivanov Ivan2", "Engineer", " ivivan@mailbox.com ", "892312314", 30002, 20);
		persArray[3] = new Sotrudnik("Ivanov Ivan3", "Engineer", " ivivan@mailbox.com ", "892312315", 30003, 80);
		persArray[4] = new Sotrudnik("Ivanov Ivan4", "Engineer", " ivivan@mailbox.com ", "892312316", 30004, 55);

		for (Sotrudnik sub:persArray) {
			if (sub.Age>40) sub.SeeHim();
		}
	}
	

	
}
