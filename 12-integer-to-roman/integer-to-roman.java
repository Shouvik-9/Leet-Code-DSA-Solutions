class Solution {
    public String intToRoman(int num) {
        String[] AS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] AI = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < 13; i++){
            int count = num / AI[i];
            for(int j = 0; j < count; j++){
                res.append(AS[i]);
            }
            num = num % AI[i];
        }
        return res.toString();
    }
}