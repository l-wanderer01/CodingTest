class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        
        // switch case문을 사용하는게 효율적
        if (n == 1) {
            int b = slicer[1];
            int[] answer = new int[b + 1];
            for (int i = 0; i <= b; i++) {
                answer[i] = num_list[i];
            }
            
            return answer;
        }
        else if (n == 2) {
            int a = slicer[0], idx = 0;
            int[] answer = new int[num_list.length - a];
            
            for (int i = a; i < num_list.length; i++) {
                answer[idx++] = num_list[i];
            }
            
            return answer;
        }
        else if (n == 3) {
            int a = slicer[0], b = slicer[1], idx = 0;
            int[] answer = new int[b - a + 1];
            
            for (int i = a; i <= b; i++) {
                answer[idx++] = num_list[i];
            }
            
            return answer;
        }
        else {
            int a = slicer[0], b = slicer[1], c = slicer[2], idx = 0;
            int[] answer = new int[(b - a) / c + 1];
            
            for (int i = a; i <= b; i += c) {
                answer[idx++] = num_list[i];
            }
            
            return answer;
        }

    }
}