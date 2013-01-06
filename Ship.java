public class Ship{
    private int typeOfShip;
    private int[] points;
    
    boolean init(int[] points){
        if(! isCorrectShip(points)){
            return false;
        }
        typeOfShip = points.length;
        this.points = new int[typeOfShip];
        for(int i = 0; i < typeOfShip; ++i){
            this.points[i] = points[i];
        }
        return true;
    }
    
    private boolean isCorrectShip(int[] points){
        if(!(1 <= points.length && points.length <= 4)){
            return false;
        }
        for(int i: points){
            if(!(0<=i && i<=99)){
                return false;
            }
        }
        boolean vCheck = true;
        boolean hCheck = true;
        for(int i: points){
            if((points[0] % 10) != (i%10)){
                vCheck = false;
            }
            if((points[0] / 10) != (i/10)){
                hCheck = false;
            }
        }
        return vCheck || hCheck;
    }
    
    public int[] getArrayOfPoints(){
        return points;
    }
    
    public boolean isPointOfChip(int p){
        for(int i: points){
            if(i == p){
                return true;
            }
        }
        return false;
    }

    public int getTypeOfChip(){
        return typeOfShip;
    }
}



