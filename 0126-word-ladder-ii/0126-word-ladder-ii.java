import java.util.*;

class Solution {
    private Map<String, Integer> wordToDistance = new HashMap<>();
    private List<List<String>> results = new ArrayList<>();
    private String startWord;

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) {
            return results;
        }
        
        startWord = beginWord;
        dict.add(beginWord);
        
        bfs(beginWord, endWord, dict);
        
        if (wordToDistance.containsKey(endWord)) {
            List<String> path = new ArrayList<>();
            path.add(endWord);
            dfs(endWord, path);
        }
        
        return results;
    }

    private void bfs(String beginWord, String endWord, Set<String> dict) {
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        wordToDistance.put(beginWord, 0);
        
        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (current.equals(endWord)) {
                break;
            }
            int currentStep = wordToDistance.get(current);
            char[] chars = current.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char original = chars[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    if (c == original) {
                        continue;
                    }
                    chars[i] = c;
                    String nextWord = new String(chars);
                    if (dict.contains(nextWord)) {
                        if (!wordToDistance.containsKey(nextWord)) {
                            wordToDistance.put(nextWord, currentStep + 1);
                            queue.add(nextWord);
                        }
                    }
                }
                chars[i] = original;
            }
        }
    }

    private void dfs(String current, List<String> path) {
        if (current.equals(startWord)) {
            List<String> reversePath = new ArrayList<>(path);
            Collections.reverse(reversePath);
            results.add(reversePath);
            return;
        }
        
        int currentStep = wordToDistance.get(current);
        char[] chars = current.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char original = chars[i];
            for (char c = 'a'; c <= 'z'; c++) {
                if (c == original) {
                    continue;
                }
                chars[i] = c;
                String prevWord = new String(chars);
                if (wordToDistance.containsKey(prevWord) && wordToDistance.get(prevWord) == currentStep - 1) {
                    path.add(prevWord);
                    dfs(prevWord, path);
                    path.remove(path.size() - 1);
                }
            }
            chars[i] = original;
        }
    }
}
