import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MySequence {
    public String solution() {
        int input = -1;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            input = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return calculate(input);
    }

    /*
    private static class NumObj {
        private byte target;
        private byte count;
        public NumObj(int target, int count) {
            this.target = (byte) target;
            this.count = (byte) count;
        }
    }
    */
    public String calculate(int index) {
        if(index <= 3 || index >= 100) return "-1";

        List<Byte> currArr = new ArrayList<>();
        currArr.add((byte) 1);

        while(--index > 0) {
            List<Byte> nextArr = new ArrayList<>();
            byte currTarget = -1;
            byte currCount = 0;
            for(byte element : currArr) {
                if(currCount == 0) {        //init
                    currTarget = element;
                    currCount = 1;
                    continue;
                }
                if(element == currTarget) { //same
                    currCount++;
                    continue;
                }
                //element != currTarget
                nextArr.add(currCount);
                nextArr.add(currTarget);
                currTarget = element;
                currCount = 1;
            }
            nextArr.add(currCount);
            nextArr.add(currTarget);

            /*
            for (byte tmp : nextArr) {
                System.out.print(tmp);
            }
            System.out.println();
            System.out.println(nextArr.size());
            */

            currArr = new ArrayList<>(nextArr);
        }
        int mid = (currArr.size()>>1);
        return "" + currArr.get(mid-1) + currArr.get(mid);
    }
}
