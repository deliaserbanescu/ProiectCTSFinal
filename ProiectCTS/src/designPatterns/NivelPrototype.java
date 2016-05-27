package designPatterns;

public abstract class NivelPrototype implements Cloneable {
	protected String tip;
	
	public abstract void alegereNivel();

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
