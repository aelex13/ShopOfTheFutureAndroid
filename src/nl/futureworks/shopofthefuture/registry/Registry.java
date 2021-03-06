package nl.futureworks.shopofthefuture.registry;

import android.app.Activity;
import nl.futureworks.shopofthefuture.activity.ItemBrowserActivity;
import nl.futureworks.shopofthefuture.activity.LoginActivity;
import nl.futureworks.shopofthefuture.activity.ShoppingListBrowserActivity;

public class Registry {

	public static final Class<?> SHOPPING_LIST_BROWSER_ACTIVITY = ShoppingListBrowserActivity.class;
	public static final Class<?> LOGIN_ACTIVITY = LoginActivity.class;
	public static final Class<?> ITEM_BROWSER_ACTIVITY = ItemBrowserActivity.class;
	
	// API Info
	public static final String API_URL = "";
	public static final String CHARSET = "UTF-8";
	
	// API Requests
	public static final String API_LOGIN_REQUEST = "/login";
	public static final String API_RETRIEVE_SHOPPING_LISTS = "/retrieve_shopping_lists";
	public static final String API_DELETE_SHOPPING_LIST = "/delete_shopping_list";
	
	// General App keys
	public static final String APP_LOGIN = "nl.futureworks.shopofthefuture.APP_LOGIN";
	public static final boolean APP_LOGIN_DEFAULT = false;
	public static final String SHARED_PREFERENCES_FILE_NAME = "nl.futureworks.shopofthefuture.sharedPreferences";
    public static final String LOGIN_TOKEN = "nl.futureworks.shopofthefuture.LOGIN_TOKEN";
	
	// General App Request & Result codes
	public static final int RESULT_CANCELLED = Activity.RESULT_CANCELED;
	public static final int RESULT_OK = Activity.RESULT_OK;
	public static final int RESULT_SHUTDOWN_APP = 666;
	
	// Login Activity Request & Result codes
	public static final int LOGIN_ACTIVITY_REQUEST_CODE = 1001;
	public static final int LOGIN_ACTIVITY_FAILED = 1002;
	public static final int LOGIN_ACTIVITY_SUCCESS = 1003;
	
	private Registry(){}
}
