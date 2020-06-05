public class tableGen {
	String[][] table;
	int[] longestLens;

	public tableGen(String[][] table){
		this.table = table;
		this.longestLens = new int[table[0].length];
		for(int i = 0; i < table[0].length; i++){
			longestLens[i] = longestElement(i);
		}
	}

	public void createTable(){
		System.out.println();
		printFirstRow(this.table);
		printDivider();
		printContent();
		System.out.println();
	}

	private void printFirstRow(String[][] table){
		for(int i = 0; i < table[0].length; i++){
			String currentElement = table[0][i];

			System.out.print("|");
			if(longestLens[i] > currentElement.length()){
				System.out.print(currentElement);
				for(int j = longestLens[i]; j > currentElement.length(); j--){
					System.out.print(" ");
				}
			} else {
				System.out.print(currentElement);
			}
		}
		System.out.print("|");
	}

	private void printDivider(){
		System.out.println();
		for(int i = 0; i < longestLens.length; i++){
			System.out.print("|");
			for(int j = 0; j < longestLens[i]; j++){
				System.out.print("-");
			}
		}
		System.out.print("|");
	}

	private void printContent(){
		for(int i = 1; i < this.table.length; i++){
			System.out.println();
			for(int j = 0; j < this.table[i].length; j++){
				System.out.print("|");
				System.out.print(this.table[i][j]);
				for(int k = longestLens[j]; k > this.table[i][j].length(); k--){
					System.out.print(" ");
				}
			}
			System.out.print("|");
		}
	}

	private int longestElement(int col){
		int maxLen = 0;
		for(int i = 0; i < this.table.length; i++){
			if(table[i][col].length() > maxLen){
				maxLen = table[i][col].length();
			}
		}
		return maxLen;
	}
}
