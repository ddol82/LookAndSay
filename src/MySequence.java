import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    public String calculate(int index) {
        if(index <= 3 || index >= 100) return "-1";
        return "21";
    }
}
