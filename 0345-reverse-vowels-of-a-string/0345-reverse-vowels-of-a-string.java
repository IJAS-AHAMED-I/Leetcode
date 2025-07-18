class Solution {
    public String reverseVowels(String s) {
        char A[] =s.toCharArray();
        int S=0;
        int E=A.length-1;
        while(S<E){
        while(S<E && (s.charAt(S)!='a'&& s.charAt(S)!='A'&& s.charAt(S)!='e'&& s.charAt(S)!='E'&& s.charAt(S)!='i'&& s.charAt(S)!='I'&& s.charAt(S)!='o'&& s.charAt(S)!='O'&& s.charAt(S)!='u'&& s.charAt(S)!='U')){
            S++;
        }
        while(S<E && (s.charAt(E)!='a'&& s.charAt(E)!='A'&& s.charAt(E)!='e'&& s.charAt(E)!='E'&& s.charAt(E)!='i'&& s.charAt(E)!='I'&& s.charAt(E)!='o'&& s.charAt(E)!='O'&& s.charAt(E)!='u'&& s.charAt(E)!='U')){
            E--;
        }
        char temp=A[S];
        A[S]=A[E];
        A[E]=temp;
        S++;
        E--;
        }
        return new String(A);


    }
}