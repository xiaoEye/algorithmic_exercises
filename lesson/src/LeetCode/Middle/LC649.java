package LeetCode.Middle;

public class LC649 {

    //我觉得我是对的，但是leetcode没通过所有用例
    public static void main(String[] args) {
        System.out.println(predictPartyVictory("R"));
        System.out.println(predictPartyVictory("D"));
        System.out.println(predictPartyVictory("RD"));
        System.out.println(predictPartyVictory("RDD"));
        System.out.println(predictPartyVictory("DRRD"));
        System.out.println(predictPartyVictory("DDRRR"));
    }

    public static String predictPartyVictory(String senate) {
        if (!senate.contains("D")) {
            return "Radiant";
        }
        if (!senate.contains("R")) {
            return "Dire";
        }

        char[] votes = senate.toCharArray();
        int rNumToRemoveLeft = 0;
        int dNumToRemoveLeft = 0;
        int rNumToRemoveTotal = 0;
        int dNumToRemoveTotal = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < votes.length; i++) {
            if (votes[i] == 'R') {
                if (rNumToRemoveLeft <= 0) {
                    dNumToRemoveLeft++;
                    dNumToRemoveTotal++;
                } else {
                    rNumToRemoveLeft--;
                }
            }
            if (votes[i] == 'D') {
                if (dNumToRemoveLeft <= 0) {
                    rNumToRemoveLeft++;
                    rNumToRemoveTotal++;
                } else {
                    dNumToRemoveLeft--;
                }
            }
        }

        for (int i = 0; i < votes.length; i++) {
            if (votes[i] == 'R') {
                if (rNumToRemoveTotal > 0) {
                    rNumToRemoveTotal--;
                } else {
                    sb.append(votes[i]);
                }
            }

            if (votes[i] == 'D') {
                if (dNumToRemoveTotal > 0) {
                    dNumToRemoveTotal--;
                } else {
                    sb.append(votes[i]);
                }
            }
        }
        System.out.println(sb.toString());

        return predictPartyVictory(sb.toString());
    }

}
