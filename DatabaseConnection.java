package singlethreaded;

public class DatabaseConnection {
	
	private static DatabaseConnection instance= null;
	private DatabaseConnection()
	{
		
	}
	//If we will create private constructor we need to provide method getInstance method of 
	//type static to create object if we will not create then this class is of no use.
	
	public static DatabaseConnection getInstance() {
		
		if(instance==null)
		{
			instance = new DatabaseConnection();//creating instance else return instance
		}
		return instance;
		
	}

}
