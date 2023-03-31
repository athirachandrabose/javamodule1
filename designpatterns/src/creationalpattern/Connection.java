package creationalpattern;

public class Connection {
	static Connection con;
public Connection() {
	// TODO Auto-generated constructor stub
}
public static Connection getConnection() {
//	if(con!=null)
//		return con;
//	else {
//		con=new Connection();
//		return con;
//	}
	
	return new Connection();
}
}
