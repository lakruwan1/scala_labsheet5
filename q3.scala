object solution extends App {
    def sum(num : Int) : Int = {
        var res = 0;
        if (num == 1){
            return 1;
        }else{
            res = num + sum(num - 1)
        }
        
        return res;
    }

    print("Enter number: ")
    val num = scala.io.StdIn.readInt()

    print("Sum is = ")
    print(sum(num))
}