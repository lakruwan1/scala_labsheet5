object solution extends App {
    def prime(num : Int, index : Int) : Boolean = {

        if (num <= 2){
            if(num == 2){
                return true
            }else{
                return false
            }
        }
        if (num % index == 0){
            return false
        }
            
        if (index * index > num){
            return true;
        }
            
        
        return prime(num, index + 1);


    }

    print("Enter number: ")
    val num = scala.io.StdIn.readInt()

    val index = 2;

    print("Entered number is prime: ")
    print(prime(num, 2))

    
}