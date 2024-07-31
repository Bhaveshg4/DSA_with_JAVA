
class rough {
    public static void main(String[] args) {
        int[] arrname = new int[5];
        arrname[0]= 2;arrname[1]=3;arrname[2]=4;arrname[3]=5;
        arrname[4]=6;
        
        for(int i=0; i<arrname.length; i++) {
            if (arrname[i] == 4) {
                System.out.println("Got it!"+ "at"+ i);
            }
        }
    }
}
