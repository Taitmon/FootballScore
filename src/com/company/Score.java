package com.company;

public class Score
{
    int points;

    public void completedFieldGoal()
    {
       this.points =  this.points + 3;
    }
    public void completedTouchdown()
    {
        this.points = this.points + 6;
    }
}
