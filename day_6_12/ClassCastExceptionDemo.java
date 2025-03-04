package day_6_12;

public class ClassCastExceptionDemo 
{
	public static void handleClassCastException ()
	{
		
			Object[] objects = {"Hello",123,"Java"};
			for(Object obj:objects)
			{
				try
				{
					String str=(String) obj;
					System.out.println("Casting Successfull: "+str);
				}
				catch(ClassCastException e)
				{
				System.out.println("ClassCastException:Can not Cast"+obj.getClass().getName()+"to String");
				e.printStackTrace();
				}
			}
	}
	public static void main(String[] args)
	{
		handleClassCastException();

	}

}
