package galaga;

public class GalagaMop {
	private int mMoveX1,mMoveY1;
	private int hp;
	private int atk;
	private int speed;
	private int item;
	private int sel;
	
	public GalagaMop() {
		mMoveX1 = (int)(Math.random()+1000);
		mMoveY1 = (int)(Math.random()*400+100);
		hp = 3;
		atk = 1;
		speed = 1;
		sel = 0;
	}

	public int getmMoveX1() {
		return mMoveX1;
	}

	public void setmMoveX1(int mMoveX1) {
		this.mMoveX1 = mMoveX1;
	}

	public int getmMoveY1() {
		return mMoveY1;
	}

	public void setmMoveY1(int mMoveY1) {
		this.mMoveY1 = mMoveY1;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public int getSel() {
		return sel;
	}

	public void setSel(int sel) {
		this.sel = sel;
	}

}
