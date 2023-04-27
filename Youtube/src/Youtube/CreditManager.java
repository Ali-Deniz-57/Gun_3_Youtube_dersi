package Youtube;

public class CreditManager {
	public void Calculate(int creditType){
		//sonar qube
		if (creditType == 1) //esanav
		{
			
		}
		if (creditType == 2) //ogretmen
		{
			
		}
		System.out.println("Hesaplandı.");
	}
	public void Save(){
		System.out.println("Kredi verildi");
	}
}
	interface ICreditManager{
		void Calculate();
		void Save();
	}
	
		
		
	