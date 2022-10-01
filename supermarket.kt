// System Supermarket

private class Cashier()
{
    private fun scan()
    {
        println("This Cashier just scanned your Products!")
    }

    private fun collectMoney()
    {
        println("This Cashier collected your Money")
    }

    private fun give()
    {
        println("This Cashier just gave you the receipt, change and a bag")
    }


    init{scan()
        collectMoney()
        give()
    }
}

private class Food_preparator()
{
    private fun prepare()
    {
        println("Making food...")
    }

    private fun packing()
    {
        println("Packing the food that was just made")
    }

    init {prepare()
        packing()
         }

}

private class Buyer(var age:Int, var sex: String, var name:String)
{
    private fun walk()
    {
        println("The Buyer, "+ name +" is waling through supermarket ")
    }

    private fun choose()
    {
        println("The Buyer is choosing the products")
    }

    private fun give(product:Int, money:Int)
    {
        println("The Buyer gives " +product+" products " + money+" dollars to Cashier")
    }

    init {
        walk()
        choose()
        give(8,100)
    }

}

private class Cleaner()
{

    private fun clean()
    {
        println("The Cleaner cleans the floor")
    }

    private fun sit()
    {
        println("The cleaner sits down")
    }

    init {
        clean()
        sit()
    }

}

private class Products()
{
    fun drinks()
    {
        println("What things you put in cart? : ")
        val stringInput = readLine()!!
        println("you have bought this: ${stringInput}")


    }

    init {
        drinks()
    }
}

private class TruckDriver(var Truck_Model:String, var Truck_age:Int, var time: Int)
{
    private fun drives()
    {
        println("The Man is driving a "+Truck_Model+" Truck with "+Truck_age+" years of age")
    }

    private fun sleeps()
    {
        if(time >= 8 && time<= 18)
        {
            println("The truck Drivers is working")
        }
        else
        {
            println("The Driver sleeps")

        }

    }

    private fun deliver()
    {
        println("The Driver delivers food at the location")
    }

    init {
        drives()
        sleeps()
        deliver()
    }

}

private class StoreSupplier()
{
    private fun check()
    {
        println("The Supplier check the storage")
    }

    private fun note()
    {
        println("The Supplier noted what he need to restore")
    }

    private fun arranges()
    {
        println("The Supplier arranges the supplies on the shelfs")
    }
    init {
        check()
        note()
        arranges()
    }

}

private class SecurityGuard(var awake:Boolean, var gun:Boolean, var gipsy:Boolean,var pistol: String)
{
    private fun checks()
    {
        if(awake == true)
        {
            println("The guard is watching the cameras")
        }
        else
        {
            println("The guard still sleeps")
        }
    }
    private fun arrests()
    {
        if(awake == true && gun == true && gipsy == true)
        {
            println("The Guard arrested the gipsy using ${pistol} pistol")
        }
        else
        {
            println("The guard still sleeps")
        }

    }

    init {
        checks()
        arrests()
    }

}

private class Building(var number:Int, var parking:Boolean, var floors:Int, var address:String)
{
    private fun numbers()
    {
        println("The number of your buildings are ${number} with ${floors} floors and it is placed on ${address} street")
        if(parking == true)
        {
            println("This building has parking lot")
        }
        else
        {
            println("This building doesnt have parking lot")
        }
    }


    init {
        numbers()
    }
}

private class Truck(var drivers: Boolean)
{
    private fun drive()
    {
        if(drivers == true)
        {
            println("This truck is driving right now")
        }
        else
        {
            println("The truck isn't moving")
        }
    }
    init {
        drive()
    }
}

private class ShoppingCart(var person:String)
{
    private var Action: Boolean = true


    private fun movingOn()
    {
        println("Is the cart moving? : ")
        val stringInput = readLine()!!
        if (stringInput == "1")
        {
            println("This Shopping Cart is pushed by a ${person}")
        }
        else
        {
            println("The Shopping Cart stopped moving")
        }
    }

    init {
        movingOn()
    }

}

fun main(args: Array<String>)
{
    val cashier1 = Cashier()
    //val cashier2 = Cashier()

    println("")

    val cooker = Food_preparator()

    println("")

    val person = Buyer(21, "Male", "George")

    println("")

    val cart = ShoppingCart("Buyer")

    println("")

    val market1 = Building(1,true,2,"Stefan cel Mare 13")

    println("")

    val guard1 = SecurityGuard(true, true,true,"P250")

    println("")

    val driver1 = TruckDriver("Mercesed", 7, 17)

    println("")

    val drink1 = Products()
    println("")
    val truck1 = Truck(true)
    println("")
    val supplier1 = StoreSupplier()
    println("")
    val cleaner1 = Cleaner()
}
