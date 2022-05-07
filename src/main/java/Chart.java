public class Chart {
    public static String s0 = "NORMAL";
    public static String s1 = "TIME";
    public static int h = 0, m = 0, D = 1, M = 1, Y = 2000;

    public static String[] input(char c) {
        if (s0.equals("NORMAL")) {
            if (c == 'c') {
                s0 = "UPDATE";
                s1 = "min";
            }
            if (c == 'b') {
                s0 = "ALARM";
                s1 = "Alarm";
            }
            if (c == 'a') {
                if (s1.equals("TIME")) {
                    s1 = "DATE";
                } else {
                    s1 = "TIME";
                }
            }
        }
        if (s0.equals("UPDATE")) {
            if (c == 'd') {
                s0 = "NORMAL";
                s1 = "TIME";
            }
            if (c == 'a') {
                if (s1.equals("year")) {
                    s0 = "NORMAL";
                    s1 = "TIME";
                }
                if (s1.equals("month")) {
                    s1 = "year";
                }
                if (s1.equals("day")) {
                    s1 = "month";
                }
                if (s1.equals("hour")) {
                    s1 = "day";
                }
                if (s1.equals("min")) {
                    s1 = "hour";
                }
            }
            if (c == 'b') {
                if (s1.equals("min")) {
                    m++;
                    if (m >= 60) {
                        m = 0;
                    }
                }
                if (s1.equals("hour")) {
                    h++;
                    if (h >= 24) {
                        h = 0;
                    }
                }
                if (s1.equals("day")) {
                    D++;
                    if (D > 31) {
                        D = 1;
                    }
                }
            }
        }

        if (s1.equals("month")) {
            M++;
            if (M > 12) {
                M = 1;
            }
        }
        if (s1.equals("year")) {
            Y++;
            if (Y > 2100) {
                Y = 2000;
            }
            if (s0.equals("ALARM")) {
                if (c == 'd') {
                    s0 = "NORMAL";
                    s1 = "TIME";
                }
                if (c == 'a') {
                    s1 = "Chime";
                }
            }
        }
        return new String[]{s0, s1, String.valueOf(Y) + "-" + String.valueOf(M) + "-" + String.valueOf(D), String.valueOf(h) + ":" + String.valueOf(m)};

    }
}
