package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class JailCell.
 */
public class JailCell extends Cell {
	
	/** The bail. */
	public static int BAIL = 50;
	
	/**
	 * Instantiates a new jail cell.
	 */
	public JailCell() {
		setName("Jail");
	}
	
	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playAction()
	 */
	public void playAction() {
		
	}

	public void playerMoved(Player player, int playerIndex,
			GameMaster gameMaster) {
		if (this.isAvailable()) {
			int price = this.getPrice();
			if (price <= player.getMoney() && price > 0) {
				gameMaster.getGUI().enablePurchaseBtn(playerIndex);
			}
		}
		gameMaster.getGUI().enableEndTurnBtn(playerIndex);
	}
}
