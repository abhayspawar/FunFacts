package com.abhayapps.funfacts;

import android.graphics.Color;
import android.widget.RelativeLayout;

import java.util.Random;

/**
 * Created by abhay on 05-04-2015.
 */
public class FactBook {
    //Member variable (prop of the object
    //Method : What it can do

    public String[] mfacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built." };

    public String getFact(){
        String fact="";
        //facts in array

        //Random number generator
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mfacts.length);

        //setting the fact variable
        fact=mfacts[randomNumber];
        return fact;
    }
}
