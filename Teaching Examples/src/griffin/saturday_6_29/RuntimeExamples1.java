package griffin.saturday_6_29;

/**
 * Created by bcarlson on 6/29/18.
 */
public class RuntimeExamples1 {

    public static void main(String[] args) {
        System.out.println(question1());
        System.out.println(question2(1000));
        System.out.println(question3(1000));
        System.out.println(question3_5(1000));
        System.out.println(question4(1000));
        System.out.println(question4_5(1000));
        System.out.println(question5(1000));
        System.out.println(question5_25(1000));
        System.out.println(question5_5(1000));
        System.out.println(question5_75(1000));
        System.out.println(question6(1000));
        System.out.println(question6_25(1000));
        System.out.println(question6_5(1000));
        System.out.println(question6_75(1000));
    }

    public static int question1() {
        int i = 0;
        i += 1;
        return i;
    }

    public static int question2(int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            count += 1;
        }
        return count;
    }

    public static int question3(int N) {
        int count = 0;
        while (N > 0) {
            N /= 2;
            count += 1;
        }
        return count;
    }

    public static int question3_5(int N) {
        int count = 0;
        while (N > 0) {
            N /= 7;
            count += 1;
        }
        return count;
    }

    public static int question4(int N) {
        if (N == 0) {
            return 1;
        }
        return question4(N / 2) + question4(N / 2) + 1;
    }

    public static int question4_5(int N) {
        if (N == 0) {
            return 1;
        }
        return question4_5(N / 2) + question4_5(N / 2)
                + question4_5(N / 2) + question4_5(N / 2) + 1;
    }

    public static int question5(int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            count += 1;
        }
        if (N == 0) {
            return count;
        }
        return question5(N / 2) + question5(N / 2) + count;
    }

    public static int question5_25(int N) {
        int count = 0;
        for (int i = 0; i < N * N; i++) {
            count += 1;
        }
        if (N == 0) {
            return count;
        }
        return question5_25(N / 2) + question5_25(N / 2) + count;
    }

    public static int question5_5(int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            count += 1;
        }
        if (N == 0) {
            return count;
        }
        return question5_5(N / 4) + question5_5(N / 4)
                + question5_5(N / 4) + question5_5(N / 4) + count;
    }

    public static int question5_75(int N) {
        int count = 0;
        for (int i = 0; i < N * N; i++) {
            count += 1;
        }
        if (N == 0) {
            return count;
        }
        return question5_75(N / 4) + question5_75(N / 4)
                + question5_75(N / 4) + question5_75(N / 4) + count;
    }

    //More challenging questions?
    public static int question6(int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                count += 1;
            }
        }
        return count;
    }

    public static int question6_25(int N) {
        int count = 0;
        for (int i = 0; i < N; i *= 2) {
            for (int j = 0; j < i; j++) {
                count += 1;
            }
        }
        return count;
    }

    public static int question6_5(int N) {
        int count = 0;
        for (int i = 0; i < N; i *= i) {
            for (int j = 0; j < i; j++) {
                count += 1;
            }
        }
        return count;
    }

    public static int question6_75(int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j *= 2) {
                for (int k = 0; k < j; k *= 2) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
