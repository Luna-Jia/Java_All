package twoDArray;
public class GradeExam {
    public static void main(String[] args) {
        char[][] answers = { // The statement in lines 4–13 declares, creates, and initializes a two-dimensional array of characters and assigns the reference to answers of the char[][] type.
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        }; // Each row in the array answers stores a student’s answer
// The statement in line 16 declares, creates, and initializes an array of char values and assigns the reference to keys of the char[] type.
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'}; // 1 D array to store correct answers.

        // Key to the questions
        for (int i = 0; i < answers.length; i++) { // Outer loop iterates over students
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) { // Inner loop compares a student's answer with correct answer.
                if (answers[i][j] == keys[j]) // compare with key
                    correctCount++;
            }
            System.out.println("Student " + i + "'s correct count is " + correctCount);
        }
    }
}

// https://mediaplayer.pearsoncmg.com/assets/secs-liang-Grade_Multiplechoice_Test

// The problem is to write a program that will grade multiple-choice tests.

// Suppose you need to write a program that grades multiple-choice tests. Assume there are eight students and ten
// questions, and the answers are stored in a two-dimensional array. Each row records a student’s answers to the
// questions,

// Your program grades the test and displays the result. It compares each student’s answers with the key, counts the
// number of correct answers, and displays it. Listing 8.2 gives the program.
