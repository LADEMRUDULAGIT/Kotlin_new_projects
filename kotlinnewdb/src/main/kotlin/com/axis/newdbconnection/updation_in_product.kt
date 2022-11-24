fun main(args:Array<String>){
    var dbcon=DbConnection()
    var connection=dbcon.connect()
    println("connection established successfully")
    val stmt= connection.createStatement()
    val update_res=stmt.executeUpdate("update product set name = 'Rohit' where id = 1")
    if( update_res > 0){
        println("successfully updated record in users db !!!")
        println("$update_res updated")
    } else{
        println("Update Not sucessful")
}

}