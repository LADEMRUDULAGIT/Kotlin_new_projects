import java.util.Scanner

fun main(args:Array<String>){
    var dbcon=DbConnection()
    var connection=dbcon.connect()
    println("connection established successfully")
    println("enter values to insert in product table:")
    var sc=Scanner(System.`in`)
    println("id :")
    var id=sc.nextInt()
    println("name :")
    var name=sc.next()
    println("model :")
    var model=sc.next()
    println("price :")
    var price=sc.nextInt()
    var stmt=connection.prepareStatement("insert into product values(?,?,?,?);")
    stmt.setInt(1,id)
    stmt.setString(2,name)
    stmt.setString(3,model)
    stmt.setInt(4,price)
    var res=stmt.executeUpdate()

   // val res = stmt.executeUpdate("insert into product values(1,'mrudu','car',23400);")
    if (res > 0) {
        println("successfully inserted record into product db !!!")
    } else {
        println("Insert Not sucessful")
    }

}