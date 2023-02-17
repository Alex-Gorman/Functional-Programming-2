/* Alex Gorman ajg279 11194069 */

object Problem1 {

    /* Map of royal family */
        val royalParent = Map("George" -> ("m", "William", "Catherine"), "Charlotte" -> ("f", "William", "Catherine"), 
        "Louis" -> ("m", "William", "Catherine"), "Archie" -> ("m", "Harry", "Meghan"),  "Lilibet" -> ("f", "Harry", "Meghan"), 
        "Savannah" -> ("f", "Autumn", "Peter"), "Isla" -> ("f", "Autumn", "Peter"), "Mia" -> ("f", "Zara", "Mike"), 
        "Lena" -> ("f", "Zara", "Mike"), "Lucas" -> ("m", "Zara", "Mike"), "Sienna" -> ("f", "Beatrice", "Edoardo"), "August" -> 
        ("m", "Eugenie", "Jack"), "Beatrice" -> ("f", "Andrew", "Sarah"), "Eugenie" -> ("f", "Andrew", "Sarah"), "Louise" -> 
        ("f", "Edward", "Sophie"), "James" -> ("m", "Edward", "Sophie"), "Peter" -> ("m", "Mark", "Anne"), "Zara" -> ("f", "Mark", "Anne"), 
        "William" -> ("m", "Diana", "Charles"), "Harry" -> ("m", "Diana", "Charles"), "Charles" -> ("m", "Elizabeth", "Philip"), "Anne" -> 
        ("f", "Elizabeth", "Philip"), "Andrew" -> ("m", "Elizabeth", "Philip"), "Edward" -> ("m", "Elizabeth", "Philip"), "Elizabeth" -> 
        ("f", "", ""), "Philip" -> ("m", "", ""), "Diana" -> ("f", "", ""), "Mark" -> ("m", "", ""), "Sophie" -> ("f", "", ""), "Sarah" -> 
        ("f", "", ""), "Mike" -> ("m", "", ""), "Autumn" -> ("f", "", ""), "Meghan" -> ("f", "", ""), "Catherine" -> ("f", "", ""), "Timothy" -> 
        ("m", "", ""), "Jack" -> ("m", "", ""), "Camilla" -> ("f", "", ""), "Edoardo" -> ("m", "", ""))


    /* Part A */
    def childrenHelper(parent1: String, parent2: String, key:String): Boolean = {
        if (royalParent.get(key).getOrElse(("","",""))._1.equals(parent1) && royalParent.get(key).getOrElse("", "", "")._2.equals(parent2)) true
        // else if (royalParent.get(key)._1 == parent2 && royalParent.get(key)._2 == parent1) true
        else false
        // println(royalParent.get(key))
        // true
    }

    def children(parent1: String, parent2: String): Option[List[String]] = {
        
        for (
            x <- royalParent.keys
            
            
        // } if (royalParent.get(x) == (_, parent1, parent2)) Some(x)
        ) yield 

        // None
            {
                if (childrenHelper(parent1, parent2, x))
                // println(x)
            }
        None

        // royalParent.get(x)


    }

    /* Part B */
    def grandparents(p: String): Option[List[String]] = {
        None
    }

    /* Part C */
    def sisters(p: String): Option[List[String]] = {
        None
    }

    /* Part D */
    def firstCousins(p: String): Option[List[String]] = {
        None
    }

    /* Part E*/
    def uncles(p: String): Option[List[String]] = {
        None
    }

    def main(args: Array[String]): Unit = {

        // /* Map of royal family */
        // val royalParent = Map("George" -> ("m", "William", "Catherine"), "Charlotte" -> ("f", "William", "Catherine"), 
        // "Louis" -> ("m", "William", "Catherine"), "Archie" -> ("m", "Harry", "Meghan"),  "Lilibet" -> ("f", "Harry", "Meghan"), 
        // "Savannah" -> ("f", "Autumn", "Peter"), "Isla" -> ("f", "Autumn", "Peter"), "Mia" -> ("f", "Zara", "Mike"), 
        // "Lena" -> ("f", "Zara", "Mike"), "Lucas" -> ("m", "Zara", "Mike"), "Sienna" -> ("f", "Beatrice", "Edoardo"), "August" -> 
        // ("m", "Eugenie", "Jack"), "Beatrice" -> ("f", "Andrew", "Sarah"), "Eugenie" -> ("f", "Andrew", "Sarah"), "Louise" -> 
        // ("f", "Edward", "Sophie"), "James" -> ("m", "Edward", "Sophie"), "Peter" -> ("m", "Mark", "Anne"), "Zara" -> ("f", "Mark", "Anne"), 
        // "William" -> ("m", "Diana", "Charles"), "Harry" -> ("m", "Diana", "Charles"), "Charles" -> ("m", "Elizabeth", "Philip"), "Anne" -> 
        // ("f", "Elizabeth", "Philip"), "Andrew" -> ("m", "Elizabeth", "Philip"), "Edward" -> ("m", "Elizabeth", "Philip"), "Elizabeth" -> 
        // ("f", "", ""), "Philip" -> ("m", "", ""), "Diana" -> ("f", "", ""), "Mark" -> ("m", "", ""), "Sophie" -> ("f", "", ""), "Sarah" -> 
        // ("f", "", ""), "Mike" -> ("m", "", ""), "Autumn" -> ("f", "", ""), "Meghan" -> ("f", "", ""), "Catherine" -> ("f", "", ""), "Timothy" -> 
        // ("m", "", ""), "Jack" -> ("m", "", ""), "Camilla" -> ("f", "", ""), "Edoardo" -> ("m", "", ""))


        val digMap = Map(0 -> "zero", 1 -> "one", 2 -> "two", 3 -> "three", 4 -> "four", 5 -> "five", 6 -> "six", 7 -> "seven", 8 -> "eight", 9 -> "nine")

        val result = royalParent.values

        // println(result)

        // println(royalParent.get("Charlotte"))

        println(children("Harry", "Meghan"))

    }
}



