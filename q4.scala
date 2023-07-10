object solution extends App {
    def isEven(num : Int) : Boolean = {
        if(num==0){
            return true
        }else if(num==1){
            return false
        }else{
            return isEven(num-2)
        }
    }

    print("Enter number: ")
    val num = scala.io.StdIn.readInt()

    if(isEven(num)){
        println("This is even.")
    }else{
        println("This is odd.")
    }
}