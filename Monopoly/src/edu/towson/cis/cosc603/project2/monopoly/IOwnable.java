package edu.towson.cis.cosc603.project2.monopoly;

public interface IOwnable {

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * Gets the owner.
	 *
	 * @return the owner
	 */
	public abstract Player getOwner();

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public abstract int getPrice();

	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	public abstract boolean isAvailable();

	/**
	 * Play action.
	 */
	public abstract void playAction();

	/**
	 * Sets the available.
	 *
	 * @param available the new available
	 */
	public abstract void setAvailable(boolean available);

	/**
	 * Sets the owner.
	 *
	 * @param owner the new owner
	 */
	public abstract void setOwner(Player owner);

}