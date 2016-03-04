package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class Cell.
 */
public abstract class Cell implements IOwnable {
	
	/** The available. */
	private boolean available = true;
	
	/** The name. */
	private String name;
	
	/** The owner. */
	protected Player owner;

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.IOwnable#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.IOwnable#getOwner()
	 */
	@Override
	public Player getOwner() {
		return owner;
	}
	
	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.IOwnable#getPrice()
	 */
	@Override
	public int getPrice() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.IOwnable#isAvailable()
	 */
	@Override
	public boolean isAvailable() {
		return available;
	}
	
	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.IOwnable#playAction()
	 */
	@Override
	public abstract void playAction();

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.IOwnable#setAvailable(boolean)
	 */
	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.IOwnable#setOwner(edu.towson.cis.cosc603.project2.monopoly.Player)
	 */
	@Override
	public void setOwner(Player owner) {
		this.owner = owner;
	}
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return name;
    }
}
