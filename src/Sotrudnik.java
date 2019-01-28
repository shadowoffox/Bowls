
public class Sotrudnik {
String FIO;
String Position;
String Email;
String Phone;
int Salary;
int Age;

	public Sotrudnik(String _FIO, String _Position, String _Email, String _Phone, int _Salary, int _Age) {
		FIO =_FIO;
		Position=_Position;
		Email = _Email;
		Phone = _Phone;
		Salary = _Salary;
		Age = _Age;
	}

	public void SeeHim() {
		System.out.println("ФИО " + FIO + " Должность " + Position + " почта " + Email + " телефон " + Phone + " зп " + Salary + " возраст " + Age);
	}
}
