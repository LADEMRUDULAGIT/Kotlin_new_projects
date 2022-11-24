fun main(args:Array<String>){
    var dbcon=DbConnection()
    var connection=dbcon.connect()
    println("connection established successfully")
    val stmt= connection.createStatement()
    val delete_res=stmt.executeUpdate("delete from product where id = 1")
    if( delete_res > 0){
        println("successfully deleted record in product db !!!")
        println("$delete_res rows deleted")
    } else{
        println("Deletion failed")
    }

}