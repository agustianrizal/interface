public class SuryaPower implements Power, Socket, Mahasiswa{
	public String suryaPower(){
		return "Ini Surya Power";
	}
	
	public void praktek(){
		System.out.println("Pelaksanaan Praktek");
	}

	public void teori(){
		System.out.println("Pelaksanaan Teori");
	}

	public String getPower(){
		return "Ini adalah tenaga Udara";
	}

	public void countPower(){
		System.out.println("Perhitungan tenaga Udara");
	}
}