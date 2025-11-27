package boj.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ25206_1 {

    //재사용 가능하게
    public static final Map<String, Double> GRADE_MAP = Map.of(
            "A+", 4.5, "A0", 4.0,
            "B+", 3.5, "B0", 3.0,
            "C+", 2.5, "C0", 2.0,
            "D+", 1.5, "D0", 1.0,
            "F", 0.0
    );

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalGradePoints = 0;
        double totalCredits = 0;

        //20줄 수강한 전공과목명, 학점, 등급
        for(int i = 0 ; i < 20; i++) {
            String str = br.readLine();

            StringTokenizer st = new StringTokenizer(str);

            st.nextToken(); //과목명
            double credit = Double.parseDouble(st.nextToken()); //학점
            String grade = st.nextToken(); //등급

            //P 과목 제외
            if (grade.equals("P")) {
                continue;
            }

            totalCredits += credit; //학점 합
            totalGradePoints += credit * getGradePoint(grade); //( 학점 * 평점 ) 합
        }

        br.close();
        double result = totalGradePoints/totalCredits;

        System.out.printf("%.6f\n", result);
    }

    public static double getGradePoint(String grade){
        return GRADE_MAP.getOrDefault(grade, 0.0);
    }

}
