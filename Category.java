package model;


/**
 * <!-- begin-user-doc -->
 * A category in a menu. Each category has a name and a list of items.
 * <!--  end-user-doc  -->
 * @generated
 */

public class Category
{
	/**
	 * <!-- begin-user-doc -->
	 * List of items that belong to a category.
	 * In this case a category could be breakfast,
	 * and itemList could contain eggs, toast, and bacon.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private MenuItem itemList[];

	/**
	 * <!-- begin-user-doc -->
	 * The name of the category, such as breakfast.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private String categoryName;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor to create a Category object.
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Category(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the category name.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String getCategoryName() {
		// TODO implement me
		return this.categoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Assigns the category name based on the String argument.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Initialize the item list to the number of items specified by the integer argument.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void initializeItems(int numItems) {
		this.itemList = new int[numItems];
	}

}

