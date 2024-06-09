package com.example;

import com.example.task3.CountingWordsInFile;

import java.io.*;

public class CountingWordsInFileTest {
    public static void main(String[] args) {
        File filePath = new File("src/main/resources/com/example/task3/input/words.txt");
        CountingWordsInFile obj = new CountingWordsInFile(filePath);
        System.out.println(obj);
        /* Result:
            the: 18
            sun: 2
            rises: 1
            over: 1
            mountains: 1
            casting: 1
            a: 4
            warm: 1
            glow: 1
            on: 1
            village: 2
            below: 1
            gentle: 1
            breeze: 1
            whispers: 1
            through: 2
            trees: 1
            creating: 1
            soothing: 1
            melody: 1
            river: 1
            flows: 1
            gently: 1
            forest: 1
            reflecting: 1
            morning: 2
            light: 1
            birds: 1
            sing: 1
            their: 1
            songs: 1
            welcoming: 1
            new: 1
            day: 1
            with: 1
            joy: 1
            children: 1
            play: 1
            in: 3
            meadow: 1
            chasing: 1
            butterflies: 1
            and: 3
            laughing: 1
            flowers: 1
            bloom: 1
            vibrant: 1
            colors: 1
            painting: 1
            landscape: 1
            beautifully: 1
            old: 1
            oak: 1
            tree: 1
            stands: 1
            tall: 1
            providing: 1
            shade: 1
            shelter: 1
            to: 2
            all: 1
            deer: 1
            drinks: 1
            from: 1
            clear: 1
            stream: 1
            its: 1
            ears: 1
            twitching: 1
            at: 1
            every: 1
            sound: 1
            sky: 2
            turns: 1
            orange: 1
            pink: 1
            as: 2
            sets: 1
            behind: 1
            hills: 1
            stars: 1
            begin: 1
            twinkle: 1
            night: 1
            falls: 1
            asleep: 1
         */
    }
}
