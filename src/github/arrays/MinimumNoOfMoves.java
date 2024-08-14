package github.arrays;

import java.util.Arrays;

public class MinimumNoOfMoves {

    public static void main(String[] args) {
        int[] seats = {3,1,5}; int[] students = {2,7,4};
        int moves = minMovesToSeat(seats,students);
        System.out.println(moves);
    }

    public static int minMovesToSeat(int[] seats, int[] students) {

//        Normal method

//        int[] sortedSeat = Arrays.stream(seats).sorted().toArray();
//        int[] sortedStudents = Arrays.stream(students).sorted().toArray();
//        System.out.println(Arrays.toString(sortedStudents));
//
//        int minimumMoves = 0 ;
//        for (int i = 0 ; i < sortedSeat.length ; i++){
//            if (sortedStudents[i] > sortedSeat[i]){
//                minimumMoves = minimumMoves + (sortedStudents[i] - sortedSeat[i]);
//            }
//            else {
//                minimumMoves = minimumMoves + (sortedSeat[i] - sortedStudents[i]);
//            }
//
//        }
//        return minimumMoves;

        Arrays.sort(seats);
        Arrays.sort(students);

        int minimumMoves = 0;
        for (int i = 0 ; i< seats.length ; i++){
            minimumMoves += Math.abs(students[i] - seats[i]);
        }
        return minimumMoves;
    }
}
