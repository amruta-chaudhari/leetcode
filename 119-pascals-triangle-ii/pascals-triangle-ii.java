class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        result.add(1);
        
        for (int row = 1; row <= rowIndex; row++) {
            for (int i = row - 1; i > 0; i--) {
                result.set(i, result.get(i - 1) + result.get(i));
            }
            result.add(1);
        }

        return result;
    }
}