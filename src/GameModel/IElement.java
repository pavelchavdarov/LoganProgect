package GameModel;

public interface IElement {
	int getElemetsAmont();
	boolean exceed(int elm1, int elm2);
	Object getValue();
	int[] getWeakers(int elm);
}