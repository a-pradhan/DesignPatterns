import behaviours.FlyBehaviour;
import behaviours.QuackBehaviour;

public abstract class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	public Duck() {

	}

	public abstract void display();

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void swim() {
		System.out.println("All ducks float");
	}

	// used to set fly and quack behaviour dynamically at runtime
	public void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb;
	}

	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}

	
}
