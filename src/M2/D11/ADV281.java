package M2.D11;

import java.util.*;

public class ADV281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentNum = scanner.nextInt();
        int lessonNum = scanner.nextInt();
        int awardNum = scanner.nextInt();
        int[][] data = new int[studentNum][lessonNum];
        Map<Integer, Integer> awardMap = new HashMap<>();
        for (int i = 0; i < studentNum; i++) {
            int flag = 1;
            for (int j = 0; j < lessonNum; j++) {
                int buf = scanner.nextInt();
                if (buf < 85) {
                    flag = 0;
                }
                data[i][j] = buf;

            }
            if (flag == 1) {
                awardMap.put(i, data[i][0]);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(awardMap.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                int res = 0;
                if (Objects.equals(o1.getValue(), o2.getValue())) {
                    for (int i = 1; i < lessonNum; i++) {
                        if (data[o1.getKey()][i] < data[o2.getKey()][i]) {
                            res = 1;
                            break;
                        } else if (data[o1.getKey()][i] > data[o2.getKey()][i]) {
                            res = -1;
                            break;
                        }
                    }
                } else {
                    res = o2.getValue().compareTo(o1.getValue());
                }
                return res;
            }
        });
        int num = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.print(entry.getKey() + 1 + " ");
            num++;
            if (num == awardNum) {
                break;
            }
        }
    }
}
