fun main(){
    val addresses = listOf<Address>(
        Address(
            houseNumber = 10,
            streetName = "New Street",
            city = "Peshawar",
            country = "Pakistan"
        ),
        Address(
            houseNumber = 201,
            streetName = "Old Street",
            city = "Delhi",
            country = "India"
        ),
        Address(
            houseNumber = 310,
            streetName = "East Street",
            city = "Kolkata",
            country = "India"
        )
    )

    for(address in addresses){
        if(address.houseNumber % 2 == 0)
            println("${address.city} ${address.country}")
    }

    // Normal Class
    val p1 = Animal("Tiger")
    val p2 = Animal("Tiger")
    println(p1)
    println(p2)
    println(p1 == p2)

    // Data Class
    val a1 = Address( houseNumber = 270, streetName = "Big Street", city = "Lahore", country = "Pakistan")
    val a2 = Address( houseNumber = 270, streetName = "Big Street", city = "Lahore", country = "Pakistan")
    println(a1)
    println(a2)
    println(a1 == a2)

    // Some Utilities Functions....

    val a3 = a1.copy()
    println(a3)
    println(a2 == a3)

    val a4 = a3.copy(houseNumber = 214)
    println(a4)

    val(hn , sn, city, country) = a4
    println(hn)
    println(sn)
    println(city)
    println(country)
    println(a4.component1())
}