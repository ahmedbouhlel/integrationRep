import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class class1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
	Person p = (Person)context.getBean("person");
	p.MyMesssage();
	
	}

}
