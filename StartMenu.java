package model;


/**
 * <!-- begin-user-doc -->
 * Starting point in the application. Holds objects for the other classes used in this software.
 * <!--  end-user-doc  -->
 * @generated
 */

public class StartMenu
{
	/**
	 * <!-- begin-user-doc -->
	 * Allows the user to access the menu editor from within the start menu.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private MenuEditor menuEditor;

	/**
	 * <!-- begin-user-doc -->
	 * Allows the user to make a new order from the start menu
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private NewOrder newOrder;

	/**
	 * <!-- begin-user-doc -->
	 * Allows the user to view the statistics page from the start menu
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private StatsPage statsPage;

	/**
	 * <!-- begin-user-doc -->
	 * Allows the user to access the Kitchen view from the start menu.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private KitchenView kitchenView;

	/**
	 * <!-- begin-user-doc -->
	 * Create a StartMenu object.
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StartMenu(){
		super();
		createMenuEditor();
		createNewOrder();
		createStatsPage();
		createKitchenView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Will call the MenuEditor constructor, as long as it hasn't been instantiated yet.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void createMenuEditor() {
		if(this.menuEditor == null)
		{
			menuEditor = new MenuEditor();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Will create a NewOrder object, a new order must be made every time it is accessed from the start menu.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void createNewOrder() {
		newOrder = NewOrder();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Will call the StatsPage constructor, as long as it hasn't been instantiated yet.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void createStatsPage() {
		if(this.newOrder == null)
		{
			mewOrder = NewOrder();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Will call the StatsPage constructor, as long as it hasn't been instantiated yet.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void createKitchenView() {
		if(this.kitchenView == null)
		{
			kitchenView = new KitchenView();
		}
	}

}

