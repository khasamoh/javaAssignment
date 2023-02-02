class NoticePeriod extends TestDetails {
    void countInBench() {
        int count = 0;
        for (int i = 0; i < numOfStudents; i++) {
            int numTestsTaken = 0;
            int numTestsPassed = 0;
            for (int j = 0; j < 7; j++) {
                if (marks[i][j] != 0) {
                    numTestsTaken++;
                    if (marks[i][j] >= 50) {
                        numTestsPassed++;
                    }
                }
                if (numTestsPassed >= 3 || numTestsTaken >= 3) {
                    break;
                }
            }
            if (numTestsTaken < 3 || numTestsPassed < 3) {
                count++;
                System.out.println("Student " + i + " is in bench");
            }
        }
        System.out.println("Number of students in bench: " + count);
    }
}