package GameModel;

import Commons.ErrorCodes.Code;

public class Model implements IModel{
//	over properties!!!
	
	
	private IElement ElementEssences;
	private IBoard Board;
	private IPocket StonePouch;
	
	
//	@Override
//	public IPocket getStonePouch() {
//		return StonePouch;
//	}
//	@Override
//	public void setStonePouch(IPocket pouch) {
//		this.StonePouch = pouch;
//	}
//	
//	@Override
//	public IElement getElementEssences() {
//		return ElementEssences;
//	}
//	@Override
//	public void setElementsEssence(IElement elementsEssence) {
//		ElementEssences = elementsEssence;
//	}
//
//	@Override
//	public IBoard getBoard() {
//		return Board;
//	}
//	@Override
//	public void setBoard(IBoard board) {
//		Board = board;
//	}
	
	@Override
	public void init() {
		
		
	}

	@Override
	public int currentPlayer() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Code makeMove(int stoneNum, ICoordinate point) {
		// TODO Auto-generated method stub
		return Code.MoveDone;
	}

	@Override
	public Code moveStone(ICoordinate from, ICoordinate to) {
		// TODO Auto-generated method stub
		return Code.MoveDone;
		
	}

	@Override
	public Code flipStone(ICoordinate point) {
		// TODO Auto-generated method stub
		return Code.MoveDone;
	}




}
