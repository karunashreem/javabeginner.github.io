class Solution
{
    public int penaltyScore(String S)
    {
        // Your code goes here
        int score = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == '2' && S.charAt(i + 1) == '1') {
                score++;
            }
        }
        return score;
    }
}