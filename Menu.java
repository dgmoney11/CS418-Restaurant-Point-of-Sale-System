package model;


/**
 * <!-- begin-user-doc -->
 * A menu for a restaurant.
 * <!--  end-user-doc  -->
 * @generated
 */

public class Menu
{
	/**
	 * <!-- begin-user-doc -->
	 * A list of categories, Each category holds a list of items.
	 * A category for this software would be like 
	 * breakfast, lunch, dinner, etc..
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Category categoryArray[];

	/**
	 * <!-- begin-user-doc -->
	 * Constructor to create a Category object.
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Menu(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Initialize the categories to the number in the int parameter.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void initializeCategories(int parameter) {
		this.categoryArray = new categoryArray[parameter];
	}

}

