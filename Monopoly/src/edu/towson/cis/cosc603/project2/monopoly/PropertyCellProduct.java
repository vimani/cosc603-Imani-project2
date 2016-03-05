package edu.towson.cis.cosc603.project2.monopoly;


public class PropertyCellProduct {
	private int rent;

	public void setRent(int rent) {
		this.rent = rent;
	}

	/**
	 * Gets the rent.
	 * @return  the rent
	 */
	public int getRent(int numHouses, Player theOwner, String colorGroup) {
		int rentToCharge = rent;
		rentToCharge = calculateMonopoliesRent(rentToCharge, theOwner,
				colorGroup);
		if (numHouses > 0) {
			rentToCharge = rent * (numHouses + 1);
		}
		return rentToCharge;
	}

	/**
	 * Calculate monopolies rent.
	 * @param rentToCharge  the rent to charge
	 * @return  the int
	 */
	public int calculateMonopoliesRent(int rentToCharge, Player theOwner,
			String colorGroup) {
		String[] monopolies = theOwner.getMonopolies();
		for (int i = 0; i < monopolies.length; i++) {
			if (monopolies[i].equals(colorGroup)) {
				rentToCharge = rent * 2;
			}
		}
		return rentToCharge;
	}
}