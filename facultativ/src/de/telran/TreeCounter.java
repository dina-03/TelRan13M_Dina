package de.telran;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeCounter {
    public int treeCount(List<Point2D> trees, double alpha) {
        List<Double> angles = getSortedAngles(trees, alpha);
        return 0;
    }

    private List<Double> getSortedAngles(List<Point2D> trees, double alpha) {
        /*return trees.stream()
                .flatMap(point2D -> {
                    double angle = point2D.getAngleRads();
                    return angle < alpha ? Stream.of(angle, angle + 2 * Math.PI) : Stream.of(angle);
                })
                .sorted()
                .collect(Collectors.toList());*/

        List<Double> res = new ArrayList<>();
        for (Point2D point2D : trees) {
            double angle = point2D.getAngleRads();
            res.add(angle);
            if (angle < alpha)
                res.add(angle + 2 * Math.PI);
        }
        Collections.sort(res);
        return res;
    }
}
