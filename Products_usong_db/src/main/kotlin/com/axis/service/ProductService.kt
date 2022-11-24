
class ProductService{
    var dbcon=DbConnection()
    var productUtil=ProductUtil()
    fun insertproduct(product: Product){
        productUtil.insertdata(product)
    }
    fun deleteproduct(id:Int){
        productUtil.deletedata(id)
    }
    fun updateproduct(product: Product){
        productUtil.updatedata(product)
    }
    fun displayallproducts(){
        productUtil.displaydata()
    }
}