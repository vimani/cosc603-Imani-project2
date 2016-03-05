package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class TradeDeal.
 */
public class TradeDeal {
    
    /** The amount. */
    private int amount;
    
    /** The player index. */
    private int playerIndex;
    
    /** The property name. */
    private String propertyName;

    /**
     * Gets the amount.
     *
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }
    
    /**
     * Gets the player index.
     *
     * @return the player index
     */
    public int getPlayerIndex() {
        return playerIndex;
    }
    
    /**
     * Gets the property name.
     *
     * @return the property name
     */
    public String getPropertyName() {
        return propertyName;
    }
    
    /**
     * Make message.
     *
     * @return the string
     */
    public String makeMessage() {
        String message = GameMaster.instance().getCurrentPlayer() + 
        	" wishes to purchase " +
        	propertyName + " from " + 
        	GameMaster.instance().getPlayer(playerIndex) +
        	" for " + amount + ".  " + 
        	GameMaster.instance().getPlayer(playerIndex) +
        	", do you wish to trade your property?";
        return message;
    }
    
    /**
     * Sets the amount.
     *
     * @param amount the new amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    /**
     * Sets the property name.
     *
     * @param propertyName the new property name
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
    
    /**
     * Sets the seller index.
     *
     * @param playerIndex the new seller index
     */
    public void setSellerIndex(int playerIndex) {
        this.playerIndex = playerIndex;
    }

	/**
	 * Complete trade.
	 * @param gameBoard
	 * @param gameMaster
	 */
	public void completeTrade(GameBoard gameBoard, GameMaster gameMaster) {
		Player seller = gameMaster.getPlayer(getPlayerIndex());
		Cell property = gameBoard.queryCell(getPropertyName());
		seller.sellProperty(property, getAmount());
		gameMaster.getCurrentPlayer().buyProperty(property, getAmount());
	}
}
