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
    def children(parent1: String, parent2: String): Option[List[String]] = {

        val l1: List[String] = List()

        val y = for (
            x <- royalParent.keys.toList

        ) yield x

        def go(childs: List[String], lst: List[String]): List[String] = childs match {
            case Nil => (lst)
            case (x:: xs) => {
                if (royalParent.get(x).getOrElse(("","",""))._2.equals(parent1) && royalParent.get(x).getOrElse("", "", "")._3.equals(parent2) ||
                 royalParent.get(x).getOrElse(("","",""))._2.equals(parent2) && royalParent.get(x).getOrElse("", "", "")._3.equals(parent1)) {
                    go(xs, lst ::: (x :: Nil))
                }
                else go(xs, lst)
            } 
        }

        if (go(y, l1).isEmpty) return None
        else return Some(go(y, l1))
    }

    /* Part B */
    def grandparents(p: String): Option[List[String]] = {

        println(royalParent.get(p))

        println(royalParent.get(p).getOrElse("", "", ""))

        println(royalParent.get(p).orElse(None))

        println(royalParent.get(p).getOrElse("", "", "")._2)



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

        val digMap = Map(0 -> "zero", 1 -> "one", 2 -> "two", 3 -> "three", 4 -> "four", 5 -> "five", 6 -> "six", 7 -> "seven", 8 -> "eight", 9 -> "nine")

        val result = royalParent.values

        // println(result)

        // println(royalParent.get("Charlotte"))

        /* Test Part A */
        // println(children("Harry", "Meghan"))

        grandparents("Archie")

    }
}



