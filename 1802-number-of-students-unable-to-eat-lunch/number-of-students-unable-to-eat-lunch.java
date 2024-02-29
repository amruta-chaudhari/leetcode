class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> studentQueue = new LinkedList<>();

        for (int student : students){
            studentQueue.add(student);
        }

        int j = 0;
        while(!studentQueue.isEmpty()){
            int size = studentQueue.size();
            for(int i = 0; i < size; i++){
                int student = studentQueue.poll();
                if(student == sandwiches[j]){
                    j++;
                } else{
                    studentQueue.add(student);
                }
            }
            if(size == studentQueue.size())
                break;
        }
        return studentQueue.size();
    }
}