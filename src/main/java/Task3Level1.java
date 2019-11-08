public class Task3Level1 {
   public int searchAreaTriangle(int Ax, int Ay, int Bx, int By, int Cx, int Cy){
       int areaTriangle = Math.abs((Ax*(By-Cy) + Bx*(Cy - Ay)+ Cx*(Ay-By))/2);
       if(areaTriangle>0&&Ax!=Bx&&Bx!=Cx&&Ay!=By&&By!=Cy){
           System.out.println(areaTriangle);
           return areaTriangle;
       }else{
           return 0;
       }
   }

    public static void main(String[] args) {

    }
}
