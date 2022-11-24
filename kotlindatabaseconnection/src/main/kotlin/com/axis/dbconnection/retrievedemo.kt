import java.sql.DriverManager

fun main(args:Array<String>){
    val myurl="jdbc:mysql://localhost:3306/kotlindb"
    val connection=DriverManager.getConnection(myurl,"root","mrudula")
    println("connection established successfully")

    val query = connection.prepareStatement("select * from users")
    val result = query.executeQuery()
    val users = mutableListOf<User>()

    while(result.next()){
        val id = result.getInt("id")
        val name = result.getString("name")
        users.add(User(id, name))
    }
    println(users)
}
