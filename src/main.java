public class main {
	public static void main(String[] args){
        String[][] table = {{"Fruits", "Sodas", "Cars"},
                            {"apples", "Fanta", "Ferrari"},
                            {"oranges", "Coke", "Lamborghini"},
                            {"mangoes", "Mountain Dew", "Porsche"}};

		tableGen a = new tableGen(table);
		a.createTable();
	}
}
