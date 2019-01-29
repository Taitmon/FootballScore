package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Score pointsGained = new Score();
        pointsGained.points = 0;

        System.out.println(pointsGained.points);
        pointsGained.completedFieldGoal();
        pointsGained.completedFieldGoal();
        System.out.println(pointsGained.points);
        pointsGained.completedTouchdown();
        System.out.println(pointsGained.points);
    }


}
