package Array;

public class ArrayEksempler {

//REVERSE
//Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//reverse3([1, 2, 3]) → [3, 2, 1]
//reverse3([5, 11, 9]) → [9, 11, 5]
//reverse3([7, 0, 0]) → [0, 0, 7]

//public int[] reverse3(int[] nums) {
//  int[] numbers = nums;
//  int tal = nums [0];
//  numbers[0] = nums[2];
//  numbers[1] = nums[1];
//  numbers[2] = tal;
//  return (numbers);
//}


//ROTATE
//Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
// rotateLeft3([1, 2, 3]) → [2, 3, 1]
// rotateLeft3([5, 11, 9]) → [11, 9, 5]
// rotateLeft3([7, 0, 0]) → [0, 0, 7]


//    public int[] reverse3(int[] nums) {
//        int[] numbers = new int[3]; //Dette opretter et nyt array numbers med 3 pladser. Dette array vil indeholde de roterede værdier, som vi skal returnere.
//        for(int i = 0; i < numbers.length; i++) { //Dette er en for-løkke, der itererer igennem alle elementerne i arrayet numbers. numbers.length er 3, så løkken kører tre gange.
//            if (i != 2){ //Hvis indekset i ikke er 2 (dvs. hvis vi ikke er ved den sidste position i arrayet):
//                numbers[i] = nums[i + 1]; //Kopier elementet fra nums[i + 1] til numbers[i]. For eksempel, når i = 0, bliver numbers[0] sat til nums[1], og når i = 1, bliver numbers[1] sat til nums[2].
//            } else {
//                numbers[i] = nums[0]; //Når vi når den sidste position (i == 2), skal vi sætte det første element af nums (altså nums[0]) til numbers[2]. Det er her, det første element "roterer" til slutningen.
//            }
//        }
//        return (numbers); // return (numbers);: Efter at løkken har kørt færdig, returneres det roterede array numbers, som indeholder de roterede værdier.
//}

//MAX END
//Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
//maxEnd3([1, 2, 3]) → [3, 3, 3]
//maxEnd3([11, 5, 9]) → [11, 11, 11]
//maxEnd3([2, 11, 3]) → [3, 3, 3]

//public int[] maxEnd3(int[] nums) {
//  int[] numbers = new int[3];
//  int max = Math.max(nums[0], nums[2]);
//
//  for (int i = 0; i < numbers.length; i++) {
//    numbers[i] = max;
//  }
//
//  return numbers;
//}

}
