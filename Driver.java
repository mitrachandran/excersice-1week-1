public class Driver {

	public static void main(String [] arg){
		//Fish is a data type
		Fish nemo = new Fish(); //nemo is an object, Fish is a class

		nemo.Swim();
		nemo.SetColor("red");
		nemo.Swim();
		nemo.Eat();

		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();
		//Fish dory = new Fish();
		//dory.Swim();
		//dory.SetColor("yellow");
		//dory.Swim();

		//Aquarium fancyAquarium = new Aquarium();
		//fancyAquarium.fillFish();

	}
}