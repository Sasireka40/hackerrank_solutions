static boolean isAnagram(String a, String b) {
        // Complete the function
        
        String newstra=a.toLowerCase();
        String newstrb=b.toLowerCase();
        int[] stra=new int[200];
        int[] strb=new int[200];
        for(int i=0;i<newstrb.length();i++ ){
     strb[(int)newstrb.charAt(i)]=strb[(int)newstrb.charAt(i)]+1;

     }
