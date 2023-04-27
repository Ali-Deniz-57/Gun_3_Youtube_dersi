package Youtube;

public class MilitaryCreditManager implements  ICreditManager{

	
	public @Override void Calculate() {
		System.out.println("Asker Kredisi Hesaplandı");
	}

	@Override
	public void Save() {
		System.out.println("Kaydedildi");
	}


}
