package ua.maventraing.compareoop.robot;

import ua.maventraing.compareoop.interfaces.Hand;
import ua.maventraing.compareoop.interfaces.Head;
import ua.maventraing.compareoop.interfaces.Leg;

public class ModelT1000 extends BaseModel {

	// private Hand hand;
	// private Head head;
	// private Leg leg;

	private String color;
	private int year;
	private boolean soundEnabled;

	public ModelT1000() {
		// TODO Auto-generated constructor stub
	}

	// public ModelT1000(Head head, Hand hand, Leg leg) {
	// super();
	// this.head = head;
	// this.hand = hand;
	// this.leg = leg;
	// }

	public ModelT1000(String color, int year, boolean soundEnabled) {
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	public ModelT1000(Head head, Hand hand, Leg leg) {
		super(head, hand, leg);
		// TODO Auto-generated constructor stub
	}

	public ModelT1000(Head head, Hand hand, Leg leg, String color, int year, boolean soundEnabled) {
		super(head, hand, leg);
		// this.hand = hand;
		// this.head = head;
		// this.leg = leg;
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	// public Hand getHand() {
	// return hand;
	// }
	//
	// public void setHand(Hand hand) {
	// this.hand = hand;
	// }
	//
	// public Head getHead() {
	// return head;
	// }
	//
	// public void setHead(Head head) {
	// this.head = head;
	// }
	//
	// public Leg getLeg() {
	// return leg;
	// }
	//
	// public void setLeg(Leg leg) {
	// this.leg = leg;
	// }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		this.soundEnabled = soundEnabled;
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		getHead().thinking();
		getHand().inintHands();
		getHand().catchSomething();
		getLeg().initLegs();
		getLeg().go();
		System.out.println("T1000: Fire in the hool!!!");
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
		System.out.println("can play Sound: " + soundEnabled);
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("T1000 is dancing!");
	}

	public void initObject() {
		System.out.println("Init object T1000");
	}

	public void destroyObject() {
		System.out.println("Destroy object T1000");
	}

}
