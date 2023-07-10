object solution extends App {
    def sum(num : Int) : Int = {
        var res = 0;
        if (num == 1){
            return 1;
        }else{
            if(!isEven(num)){
                res = num + sum(num - 1)
            }else{
                sum(num-1)
            }
        }
        
        return res;
    }

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

    print("Sum is = ")
    print(sum(num))
}