package model;


/**
 * <!-- begin-user-doc -->
 * Class that allows wait staff to edit a menu. This involves adding and removing items and categories.
 * <!--  end-user-doc  -->
 * @generated
 */

public class MenuEditor
{
	/**
	 * <!-- begin-user-doc -->
	 * The actual menu.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Menu menu;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor to create a MenuEditor object.
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MenuEditor(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Remove an item from a category.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void removeItem(String itemName, String categoryName) {
		for(int i = 0; i < menu.categoryArray.length; i++)
		{
			if(menu.categoryArray[i].name.equals(categoryName))
			{
				break;		
			}
		}
		for(int j = 0; j < menu.categoryArray[i].itemList.length; j++)
		{
			if(menu.categoryArray[i].itemList[j].itemName.equals(itemName))
			{
				for(int k = j + 1; j < menu.categoryArray[i].itemList.length; k++)
				{
					menu.categoryArray[i].itemList[j] = menu.categoryArray[i].itemList[k];
					j++;
				}
				break;	
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Add a category to the menu.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addCategory(String categoryName) {
		if(menu.categoryArray == null)
		{
			menu.initializeCategories(10);
		}
		else
		{
			for(int i = 0; i < menu.categoryArray.length; i++)
			{
				if(menu.categoryArray[i] == null)
				{
					menu.categoryArray[i].setCategoryName(categoryName);
					menu.categoryArray[i].initializeItems(10);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addItem(String categoryName, String itemName, int itemPrice, int itemPrepTime) {
		// TODO implement me
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void removeCategory(String categoryName) {
		// TODO implement me
	}

}

