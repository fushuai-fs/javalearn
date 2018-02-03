package fusdemo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.*;

import demo.SQLHelper;

/*java连接sqlserver测试 * 
 */
public class fustest {

	@Test
	public void getset()
	{ 
	    try {
	    	String cmdText="SELECT  * FROM M_HotelOrder WITH ( NOLOCK );";
	    	ResultSet set = SQLHelper.getResultSet(cmdText);
			while(set.next())
			{
				System.out.println("OrderID="+set.getString("OrderID")+";OrderNumber="+set.getString("OrderNumber"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	}
}
