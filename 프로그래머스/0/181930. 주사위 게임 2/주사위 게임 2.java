class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        int sum = a + b + c;
        int squareSum = a * a + b * b + c * c;
        int cubeSum = a * a * a + b * b * b + c * c * c;

        if (a == b && b == c) {
            answer = sum * squareSum * cubeSum;
        } else if (a != b && b != c && a != c) {
            answer = sum;
        } else {
            answer = sum * squareSum;
        }

        return answer;
    }
}