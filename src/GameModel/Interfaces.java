/**
 * 
 */
package GameModel;

import java.util.List;
import java.util.Set;

import Commons.ErrorCodes.Code;

/**
 * @author Павел
 * Интерфейс для элемента.
 * Проверка первосходства, получение значения и список превосходимых элементов
 */

interface IStone{
	void forceFlip();
//	решение, переворачиват ли один камень другой, будет приниматся в"Доске"
//	void Flip(IElement forcing);
	int getFace();
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


interface IModel{
//	public IPocket getStonePouch();
//	public void setStonePouch(IPocket pouch);
//	
//	public IElement getElementEssences();
//	public void setElementsEssence(IElement elementsEssence);
//	
//	public IBoard getBoard();
//	public void setBoard(IBoard board);
	
	public void init();
	int currentPlayer();
	Code makeMove(int stoneNum, ICoordinate point);
	Code moveStone(ICoordinate from, ICoordinate to);
	Code flipStone(ICoordinate point);
	
}

