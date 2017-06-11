import behaviours.FlyNoWay;
import behaviours.Squeak;

public class App {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		System.out.println();
		
		// re-configure Duck behaviour during run time
		mallard.setFlyBehaviour(new FlyNoWay());
		mallard.setQuackBehaviour(new Squeak());
		
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		
	}
}
