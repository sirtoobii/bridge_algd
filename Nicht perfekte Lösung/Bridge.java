package ch.fhnw.algd.ex3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tobias Bossert
 */
public class Bridge {

    public static void main(String[] args) {
        //int[][] tests = readInput();
        int[][] tests = {{95,95, 88,89,62,70,51,53,45,47,32,38,28,31,27,28,24,23,5,15}};
        //int[][] tests = {{28, 31, 27, 28, 24, 23, 5, 15}};
        //int[][] tests = {{1,2,9,10}};
        //int[][] tests = {{1, 10, 34, 34, 21, 23, 12, 78, 45, 10}};
        for (int[] test : tests) {
            crossBridge2(test);
        }
    }

    /**
     * Reads input in specified format --> Todo: Proper input validation
     *
     * @return
     */
    private static int[][] readInput() {
        Scanner in = new Scanner(System.in);
        int numberOfTests = 0;
        //tests[numberOfTests][testCasesPerTest]
        int[][] tests = null;

        //get number of tests
        System.out.println("Please enter the number of Testfälle:");
        numberOfTests = in.nextInt();

        //setup testCases array
        tests = new int[numberOfTests][];
        //get detailed test information
        for (int i = 0;
                i < numberOfTests;
                i++) {
            System.out.println("Please specify how many lines test number (N): " + (i + 1) + " will take");
            tests[i] = new int[in.nextInt()];
            for (int j = 0; j < tests[i].length; j++) {
                System.out.println("Pleas specify the speed of person " + (j + 1));
                tests[i][j] = in.nextInt();
            }
        }

        return tests;
    }

    private static void crossBridge2(int[] persons) {
        Arrays.sort(persons);
        int N = persons.length;
        System.out.println(N % 2);
        int[][] crossings = new int[(2 * (persons.length)) -3 ][];
        int pointer = 0;
        int first = persons[0];
        int second = persons[1];
        int third = persons[2];
        int forth = persons[3];
        int internalSwitch = 1;
        int totalTime = 0;
        while (N >= 4) {
            if (internalSwitch == 1) {
                crossings[pointer] = new int[2];
                //store forward
                crossings[pointer][0] = first;
                crossings[pointer][1] = second;
                //store backwards
                crossings[pointer + 1] = new int[2];
                crossings[pointer + 1][0] = first;
                internalSwitch = 0;
            } else {
                //store forward
                crossings[pointer] = new int[2];
                crossings[pointer][0] = persons[N];
                crossings[pointer][1] = persons[N - 1];
                //store backwards
                crossings[pointer + 1] = new int[2];
                crossings[pointer + 1][0] = second;
                internalSwitch++;
            }
            N -= 1;
            pointer += 2;
        }
        if (persons.length % 2 == 1) {
            //{1,3}-1
            crossings[pointer] = new int[2];
            crossings[pointer][0] = first;
            crossings[pointer][1] = third;
            crossings[pointer + 1] = new int[2];
            crossings[pointer + 1][0] = first;
            pointer += 2;
            //{1,2}
            crossings[pointer] = new int[2];
            crossings[pointer][0] = first;
            crossings[pointer][1] = second;
        } else {
            if (first * 2 <= second) {
                //{1,4}-1
                crossings[pointer-2] = new int[2];
                crossings[pointer-2][0] = first;
                crossings[pointer-2][1] = forth;
                crossings[pointer-1] = new int[2];
                crossings[pointer-1][0] = first;
                pointer += 2;
                //{1,3} -1
                crossings[pointer-2] = new int[2];
                crossings[pointer-2][0] = first;
                crossings[pointer-2][1] = third;
                crossings[pointer-1] = new int[2];
                crossings[pointer-1][0] = first;
                pointer += 2;
                //{1,2}
                crossings[pointer-2] = new int[2];
                crossings[pointer-2][0] = first;
                crossings[pointer-2][1] = second;

            } else {
                //{3,4}-2
                crossings[pointer] = new int[2];
                crossings[pointer][0] = third;
                crossings[pointer][1] = forth;
                crossings[pointer + 1] = new int[2];
                crossings[pointer + 1][0] = second;
                pointer += 2;
                //{1,2}
                crossings[pointer] = new int[2];
                crossings[pointer][0] = first;
                crossings[pointer][1] = second;
            }
        }
        //calculate Time
        for (int[] is : crossings) {
            if (is[0] >= is[1]) {
                totalTime += is[0];
            } else {
                totalTime += is[1];
            }
        }
        //print result
        System.out.println(totalTime);
        for (int[] is : crossings) {
            for (int i = 0; i < 2; i++) {
                if (is[i] != 0) {
                    System.out.print(is[i] + " ");
                }
            }
            System.out.println();
        }

    }
}
