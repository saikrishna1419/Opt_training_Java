public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 620;    //gryffindor points
        int ravenclaw = 500;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor - ravenclaw;

        if(margin >= 300){
            System.out.println("gryfindor takes the house cup!");
        }else if (margin >= 0) {
            System.out.println("second");
        }else if(margin < 100){
            System.out.println("Third");
        }else{
            System.out.println("fourth");
        }
        
    }
}
