package Class_For_JSON;

import java.util.ArrayList;

import SudokuSim.Cell;
// commentaire

// A moi de faire
public class OperationDemand {
	String type;
	int num;
	ArrayList<Cell> tab = new ArrayList<Cell>();

	public OperationDemand(String type,int num, ArrayList<Cell> cells) {
		this.type = type;
		this.num = num;
		this.tab = cells;
	}
	//	There was a custom constructor defined for the class making it the default constructor.
	//	Introducing a dummy constructor has made the error to go away:
	public OperationDemand() {
	}

	public String getType(){
		return this.type;
	}

	public int getNum(){
		return this.num;
	}

	public ArrayList<Cell> getTab(){
		return this.tab;
	}
}
