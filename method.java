class vehicle{
    public int wheelsCount(int num){
        return num;

    }

    public String areAirbags(int wheels){
        if(wheels>3){
            return "yes";
    
        }
        else{
            return "no";
        }

    }
}


public class method {

    public static void main(String[] args) {
        vehicle car = new vehicle();
        System.out.println(car.wheelsCount(5));
        
    }
    
}
