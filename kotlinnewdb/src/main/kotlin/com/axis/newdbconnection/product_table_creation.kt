fun main(args:Array<String>){
    var dbcon=DbConnection()
    var connection=dbcon.connect()
    println("connection established successfully")
    val stmt= connection.createStatement()
    stmt.execute("create table product(id int,name varchar(45),model varchar(30),price int) ;")
    print("table created")
}
