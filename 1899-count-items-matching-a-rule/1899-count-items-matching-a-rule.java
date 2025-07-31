class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count =0; 
        int col = ((ruleKey.equals("type"))?0:(ruleKey.equals("color")?1:2));

        for( List<String> x: items ){
            if(x.get(col).equals(ruleValue)) count+=1;
        }
        return count;
    }
}