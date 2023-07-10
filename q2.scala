object solution extends App {
    def isPrime(num : Int, index : Int) : Boolean = {

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
            
        
        return isPrime(num, index + 1);


    }

    def prime(num : Int) : Unit = {
        print("These are prime number: ")

        var cur = 1;
        while(cur < num){
            if(isPrime(cur,2)){
                print(cur + " ");
            }
            cur += 1
        }
    }

    print("Enter number: ")
    val num = scala.io.StdIn.readInt()

    prime(num);

    
}