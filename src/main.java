public class main {
	public static void main(String[] args){
		String[][] table = {{"Date", "Humidity", "Pressure", "Rain"},
                            {"January 1", "93%", "999.7", "Rain"},
                            {"January 2", "49%", "1015.5", "No Rain"},
                            {"January 3", "79%", "1031.1", "No Rain"},
                            {"January 4", "65%", "984.9", "Rain"},
                            {"January 5", "90%", "975.2", "Rain"}};

		tableGen a = new tableGen(table);
		a.createTable();
	}
}
