import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 가로
        int b = sc.nextInt(); // 세로
        
        // String + 반복문으로 추가하는 방식
//         String answer ="";

//         for (int i=0; i<b; i++) {
//             for (int j=0; j<a; j++) {
//                 answer += "*";
//             }
//             answer += "\n";
//         }
        
        // StringBuilder 사용 방식
        StringBuilder answer = new StringBuilder();
        
        String star = "*".repeat(a); // 정수 a 만큼 "*"을 반복 생성
        
        for (int i=0; i<b; i++) {
            answer.append(star).append("\n"); // append: 문자열 합치기 > answer에 star 문자열 + "\n" 합치기
        }

        System.out.println(answer);
    }
}