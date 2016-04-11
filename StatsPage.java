package model;


/**
 * <!-- begin-user-doc -->
 * Will hold statistics about the software.
 * <!--  end-user-doc  -->
 * @generated
 */

public class StatsPage
{
	/**
	 * <!-- begin-user-doc -->
	 * Will hold the preparation time (in minutes) per month spent preparing food.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int monthlyPrepTime;

	/**
	 * <!-- begin-user-doc -->
	 * Will store the monthly profit (in US dollars) from orders placed.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int monthlyProfit;

	/**
	 * <!-- begin-user-doc -->
	 * Will store the frequency that the dish most ordered was ordered.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int mostDishesOrdered;

	/**
	 * <!-- begin-user-doc -->
	 * Will store the frequency that the dish least ordered was ordered.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int leastDishesOrdered;

	/**
	 * <!-- begin-user-doc -->
	 * Will store the name of the dish ordered least frequently.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String leastDishesName;

	/**
	 * <!-- begin-user-doc -->
	 * Will store the name of the dish ordered most frequently.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String mostDishesName;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor to instantiate an object of the StatsPage class.
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StatsPage(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Assign the monthly prep time based on the integer argument.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void setMonthlyPrepTime(int monthlyPrepTime) {
		this.monthlyPrepTime = monthlyPrepTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the monthly prep time.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int getMonthlyPrepTime() {
		return this.monthlyPrepTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Assign the monthly profti based on the integer argument.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void setMonthlyProfit(int monthlyProfit) {
		this.monthlyProfit = monthlyProfit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the monthly profit.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int getMonthlyProfit() {
		return this.monthlyProfit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets most dishes ordered frequency based on the integer argument.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void setMostDishes(int mostDishesOrdered) {
		this.mostDishesOrdered = mostDishesOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the most dishes ordered count
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int getMostDishes() {
		return this.mostDishesOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Assigns the name of the dish ordered most frequently based on the String argument.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void setMostDishesName(String mostDishesName) {
		this.mostDishesName = mostDishesName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the name of the dish ordered most frequently.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String getMostDishesName() {
		return this.mostDishesName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Assigns the frequency of the dish ordered least frequently based on the integer argument.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void setLeastDishes(int leastDishesOrdered) {
		this.leastDishesOrdered = leastDishesOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the dish ordered least frequently.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int getLeastDishes() {
		return this.leastDishesOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Assigns the name of the dish ordered least frequently based on the String argument.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void setLeastDishesName(int leastDishesName) {
		this.leastDishesName = leastDishesName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the name of the dish ordered least frequently.
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String getLeastDishesName() {
		return this.leastDishesName;
	}

}

