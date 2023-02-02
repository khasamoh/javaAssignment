class Main {
    public static void main(String[] args) {
        TestDetails td = new TestDetails();
        td.storeMarks(0, 4, new float[]{60, 70, 80, 90});
        td.storeMarks(1, 3, new float[]{50, 60, 70});
        td.displayMarks();
        
        NoticePeriod np = new NoticePeriod();
        np.countInBench();
    }
}

