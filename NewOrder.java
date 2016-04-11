package model;

/**
 * <!-- begin-user-doc -->
 * Whenever wait staff place an order, a NewOrder object is instantiated.
 * <!--  end-user-doc  -->
 * @generated
 */

public class NewOrder
{
	/**
	 * <!-- begin-user-doc -->
	 * List of items to add to the order.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private MenuItem itemList[];

	/**
	 * <!-- begin-user-doc -->
	 * Total price of the order.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private int totalPrice;

	/**
	 * <!-- begin-user-doc -->
	 * A comment for an order, an example would be no onions on a burger.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private String commentList[];

	/**
	 * <!-- begin-user-doc -->
	 * Constructor for a NewOrder object. Initializes data fields.
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public NewOrder(){
		super();
		this.itemList = new MenuItem[5];
		this.commentList = new String[5];
		this.totalPrice = 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Add a comment for an order. If the array is full then copy the data to a new array and double
	 * the size of the array.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addComment(String comment) {
		if(this.commentList[commentList.length-1] == null)
		{
			for(int i = 0; i < this.commentList.length; i++)
			{
				if(commentList[i] == null)
				{
					this.commentList[i] = comment;
					break;
				}
			}
		}
		else
		{
			String newList = new String[this.commentList.length * 2];
			for(int i = 0; i < this.commentList.length; i++)
			{
				newList[i] = this.commentList[i];
			}
			newList[i] = comment;
			this.commentList = newList;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Remove a comment from an item, all this will do is set the comment for that index equal to
	 * an empty string to indicate that there is an item that corresponds to that index.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void removeComment(String comment) {
		for(int i = 0; i < commentList.length; i++)
		{
			if(commentList[i].equals(comment))
			{
				commentList[i] = "";
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Will follow a similar logic to the add comment method, only this function will add 
	 * a MenuItem object to the order.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addToOrder(MenuItem item) {
		if(this.itemList[itemList.length-1] == null)
		{
			for(int i = 0; i < this.itemList.length; i++)
			{
				if(itemList[i] == null)
				{
					this.itemList[i] = item;
					break;
				}
			}
		}
		else
		{
			String newList = new String[this.itemList.length * 2];
			for(int i = 0; i < this.itemList.length; i++)
			{
				newList[i] = this.itemList[i];
			}
			newList[i] = item;
			this.itemList = newList;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void removeFromOrder(MenuItem item) {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * Adds to the total the cost of an item added to the order.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addToTotal(int cost) {
		this.totalPrice += cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Removes from the total price of the order the dollar amount 
	 * that is equal to the integer argument.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void removeFromTotal(int cost) {
		this.totalPrice -= cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the total cost of the order.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int getTotalCost() {
		return totalPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void confirmSelection() {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void cancelSelection(MenuItem parameter) {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void sendToKitchen() {
		// TODO implement me
	}

}

