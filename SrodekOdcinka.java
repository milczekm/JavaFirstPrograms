 package matematyka;


 class SrodekOdcinka {
     
     public static Punkt srodek(Punkt p1, Punkt p2){
         
         
        double x =(p1.getX()+p2.getX())/2.0;
        double y =(p1.getY()+p2.getY())/2.0;
        
        Punkt p = new Punkt(x,y);
        return p;
}
     
     public static void main(String[] args) {
         
         Punkt p3 = new Punkt(3,4);
         Punkt p4 = new Punkt(7,9);
         
         Punkt sr = srodek(new Punkt(3,4), new Punkt(8,9));
         
         System.out.println("Środek odcinka o początku i końcu w zadanych punktach wynosi: " + sr);
     }
 
    
}
