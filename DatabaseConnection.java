package earlyloading;

public class DatabaseConnection {
	
	//private static DatabaseConnection instance= null;
	//this part is called Early loading or early initialization
	private static DatabaseConnection instance= new DatabaseConnection();
	
	private DatabaseConnection()
	{
		
	}
	//If we will create private constructor we need to provide method getInstance method of 
	//type static to create object if we will not create ten this class is of no use.
	
	public static DatabaseConnection getInstance() {
		
//		if(instance==null)
//		{
//			instance = new DatabaseConnection();//creating instance else return instance
//		}
		return instance;
	
//In early loading we will not create the instance here rather we will create instance at the time of initialization itself.

		
		/*Now even multiple instance are trying to call getInstance method there will be no issue because Object will 
		 * be created only once.
		 * 
		 * 
		 * 
		 * 
		 */
		
	}

}
