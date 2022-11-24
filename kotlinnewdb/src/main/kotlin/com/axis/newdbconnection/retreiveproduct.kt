data class product(val id:Int, val name:String,val model:String,val price:Int)
fun main(args:Array<String>){
    var dbcon=DbConnection()
    var connection=dbcon.connect()
    println("connection established successfully")

    val query = connection.prepareStatement("select * from product;")
    val result = query.executeQuery()
    val products = mutableListOf<product>()

    while(result.next()){
        val id = result.getInt("id")
        val name = result.getString("name")
        val model = result.getString("model")
        val price = result.getInt("price")
        products.add(product(id, name,model,price))
    }
    println(products)
}
