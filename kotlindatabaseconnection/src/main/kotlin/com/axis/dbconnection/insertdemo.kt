import java.sql.DriverManager

data class User(val id:Int, val name:String)
fun main(args:Array<String>){
    val myurl="jdbc:mysql://localhost:3306/kotlindb"
    val connection=DriverManager.getConnection(myurl,"root","mrudula")
    println("connection established successfully")
    val stmt=connection.createStatement()
    val res = stmt.executeUpdate("insert into users values(1,'mrudu')")
    if (res > 0) {
        println("successfully inserted record into users db !!!")
    } else {
        println("Insert Not sucessful")
    }
}
