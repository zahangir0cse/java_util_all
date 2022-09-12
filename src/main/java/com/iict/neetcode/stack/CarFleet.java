package com.iict.neetcode.stack;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class CarFleet {
    public static void main(String[] args) {
    // target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
        int target = 12;
        int [] position = {10, 8, 0, 5, 3};
        int [] speed = {2, 4, 1, 1, 3};
        System.out.println(carFleet(target, position, speed));
    }
    public static int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> tm = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < position.length; ++i) {
            tm.put(position[i], speed[i]);
        }
        int fleets = 0;
        double slowest = 0;
        for (int pos : tm.keySet()) {
            double time = (double)(target - pos) / tm.get(pos);
            if (time <= slowest) {
                continue;
            }
            ++fleets;
            slowest = time;
        }
        return fleets;
    }
}
