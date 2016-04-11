package model;


/**
 * <!-- begin-user-doc -->
 * Receives orders and displays them, removes the orders once they are finished.
 * <!--  end-user-doc  -->
 * @generated
 */

public class KitchenView
{
	/**
	 * <!-- begin-user-doc -->
	 * A list of orders, when an order is placed, it is added to the list.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private NewOrder orderList[];

	/**
	 * <!-- begin-user-doc -->
	 * Constructor to initialise KitchenView's order list.
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private KitchenView(){
		super();
		orderList = new NewOrder[5];
	}

	/**
	 * <!-- begin-user-doc -->
	 * Add an order to a list. if the list capacity has been reached, dynamically create a new array.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addOrder(NewOrder newOrder) {
		if(this.orderList[orderList.length-1] == null)
		{
			for(int i = 0; i < this.orderList.length; i++)
			{
				if(orderList[i] == null)
				{
					this.orderList[i] = newOrder;
					break;
				}
			}
		}
		else
		{
			NewOrder newList = new NewOrder[this.orderList.length * 2];
			for(int i = 0; i < this.orderList.length; i++)
			{
				newList[i] = this.orderList[i];
			}
			newList[i] = newOrder;
			this.orderList = newList;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Removes an order from the order list.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void removeOrder(NewOrder order) {
		for(int i = 0; i < orderList.length; i++)
		{
			if(orderList[i] == order)
			{
				for(int j = i + 1; j < orderList.length; j++)
				{
					orderList[i] = orderList[j];
				}
				
			}
		}
	}

}

