class Example{

    public  static void main(String[] args){
        String name ="john";
        int age =70;
        String email;
        System.out.println(name);
        Example example=new Example();
        System.out.println(example.calculateVelocity(78,30));
        System.out.println(areaOfCircle(87));


    }
    public float calculateVelocity(float distance, int time ){
        float velocity=distance/time;
        return velocity;
    }
     public  static float areaOfCircle(float r){
        return 22/7 *r*r;
     }
}