class Solution {
    public String reverseOnlyLetters(String s) {
        char A[]=s.toCharArray();
        int S=0;
        int E=A.length-1;
        while(S<E){
            int A1=A[S];
            int A2=A[E];
            if(isLetter(A1) && isLetter(A2)){
                char temp=A[S];
                A[S]=A[E];
                A[E]=temp;
                S++;
                E--;
            }if(!isLetter(A1)){
                S++;
            }if(!isLetter(A2)){
                E--;
            }
            }
            return new String(A);
        }
        public Boolean isLetter(int a){
            return 65<=a && a<=90 || 97<=a && a<=122;
        }
        
    }