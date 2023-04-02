package animals;

import java.util.Arrays;

public class Zoo {

	private Flyer[] flyers = new Flyer[10];
	private Mammals[] mammals = new Mammals[20];
	private Insect[] insects = new Insect[10];
	private Bird[] birds = new Bird[10];

	public Flyer[] getFlyers() {
		return flyers;
	}

	public void setFlyers(Flyer[] flyers) {
		this.flyers = flyers;
	}

	public Insect[] getInsects() {
		return insects;
	}

	public void setInsects(Insect[] insects) {
		this.insects = insects;
	}

	public Bird[] getBirds() {
		return birds;
	}

	public void setBirds(Bird[] birds) {
		this.birds = birds;
	}

	public void setMammals(Mammals[] mammals) {
		this.mammals = mammals;
	}
	public Mammals[] getMammals() {
		return mammals;
	}
	
	
	int a = 0, b = 0, c = 0, d = 0;

	public void addAnimal(Animal animal) {
		if (animal instanceof Flyer) {
			Flyer flyer = (Flyer) animal;
			flyers[a++] =flyer;	
		} else if  (animal instanceof Mammals) {
				mammals[b++] = (Mammals) animal;
			} else if (animal instanceof Insect) {
				insects[c++] = (Insect) animal;
			}else if (animal instanceof Bird) {
				birds[d++] = (Bird) animal;
			}
		

	}

	public  Mammals[] getMammal() {
		 Mammals[] mammals = new Mammals[20];
System.arraycopy(this.mammals, 0, mammals, 0, b);
int ind=b;
for(Flyer flyer: flyers) {
		if (flyer instanceof Mammals ) {
				mammals[ind++] = (Mammals) flyer;
					}
		}
		Mammals[]mammalsShort = new Mammals[ind]	;
		System.arraycopy(mammals, 0, mammalsShort, 0, ind);

		return mammalsShort;
	}

	
	public  Insect[] getInsect() {
		Insect[] insects = new Insect[20];
System.arraycopy(this.insects, 0, insects, 0, c);
int ind=c;
for(Flyer flyer: flyers) {
		if (flyer instanceof Insect ) {
			insects[ind++] = (Insect) flyer;
					}
		}
Insect[]insectsShort = new Insect[ind]	;
		System.arraycopy(insects, 0, insectsShort, 0, ind);

		return insectsShort;
	}
	
	public  Bird[] getBird() {
		Bird[] birds = new Bird[20];
System.arraycopy(this.birds, 0, birds, 0, d);
int ind=d;
for(Flyer flyer: flyers) {
		if (flyer instanceof Bird ) {
			birds[ind++] = (Bird) flyer;
					}
		}
Bird[]birdsShort = new Bird[ind]	;
		System.arraycopy(birds, 0, birdsShort, 0, ind);

		return birdsShort;
	}

	
	
	
}
