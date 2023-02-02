class TestDetails {
    float[][] marks;
    int numOfStudents = 25;

    void storeMarks(int studentId, int numTests, float[] testScores) {
        if (marks == null) {
            marks = new float[numOfStudents][7];
        }
        for (int i = 0; i < numTests; i++) {
            marks[studentId][i] = testScores[i];
        }
    }

    void displayMarks() {
        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Student " + i + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}