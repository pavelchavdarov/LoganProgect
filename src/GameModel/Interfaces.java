/**
 * 
 */
package GameModel;

import java.util.List;
import java.util.Set;

/**
 * @author Павел
 * Интерфейс для элемента.
 * Проверка первосходства, получение значения и список превосходимых элементов
 */
interface IElement {
	boolean exceed(IElement elm);
	Object getValue();
	Object[] getWeakers();
}

interface IStone{
	void forceFlip();
	void Flip(IElement forcing);
	IElement getFace();
}

interface IPocket{
	// сдесь будет генерация нужного кол-ва камней в мешке
	void initialize();
	// вытаскивание камня из мешка
	IStone PutOutStone();
	// перемешать камни в мешке
	void shuffle();
}

interface ICoordinate{
	int getX();
	int getY();
	Set<ICoordinate> getNaighbourse();
	boolean checkPlaceRule();
	boolean checkIslandRule();
	boolean checkMoveStone();
}

interface IPlayer{
	List<IStone> getStones();
	IStone chooseStone(int index);
}

interface IBoard{
	int putStone(ICoordinate point, IStone stone);
	boolean checkWin();
}

