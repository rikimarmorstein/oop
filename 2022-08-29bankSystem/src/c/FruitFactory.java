package c;


public class FruitFactory {

	private Orange [][]oranges = new Orange[3][25];
	private Apple [][]apples = new Apple[3][25];
	private Peach [][]peachies = new Peach[3][25];
	int os = 0;
	int om = 0;
	int ob = 0;
	int as = 0;
	int am = 0;
	int ab = 0;
	int ps = 0;
	int pm = 0;
	int pb = 0;
	
	public void add(Fruit fruit) {
		if (fruit instanceof Orange) {
			if (fruit.getSize()==3) {
				oranges[0][os++]=(Orange) fruit;
	}else if (fruit.getSize()==4) {
		oranges[1][om++]=(Orange) fruit;
	}else {
		oranges[2][ob++]=(Orange) fruit;
	}
	
		}
		if (fruit instanceof Apple) {
			if (fruit.getSize()==3) {
				apples[0][as++]=(Apple) fruit;
	}else if (fruit.getSize()==4) {
		apples[1][am++]=(Apple) fruit;
	}else {
		apples[2][ab++]=(Apple) fruit;
	}
	
		}
		if (fruit instanceof Peach) {
			if (fruit.getSize()==3) {
				peachies[0][ps++]=(Peach) fruit;
	}else if (fruit.getSize()==4) {
		peachies[1][pm++]=(Peach) fruit;
	}else {
		peachies[2][pb++]=(Peach) fruit;
	}
		}
	
	}


	
	public Orange[] getSmallOranges() {
		return oranges[0];
	}
	public Orange[] getMediumOranges() {
		return oranges[1];
	}
	public Orange[] getBigOranges() {
		return oranges[2];
	}
	public Apple[] getSmallApples() {
		return apples[0];
	}
	public Apple[] getMediumApples() {
		return apples[1];
	}
	public Apple[] getBigApples() {
		return apples[2];
	}
	public Peach[] getSmallPeachies() {
		return peachies[0];
	}
	public Peach[] getMediumPeachies() {
		return peachies[1];
	}
	public Peach[] getBigPeachies() {
		return peachies[2];
	}
}
