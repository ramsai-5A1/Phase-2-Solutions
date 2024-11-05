

//User function Template for Java


class TrieNode {
    TrieNode[] arr;
    int passing;

    public TrieNode() {
        this.arr = new TrieNode[26];
        for (int index = 0; index < 26; index++) {
            this.arr[index] = null;
        }
        this.passing = 0;
    }
}
 
class Trie {
 
    TrieNode root;
 
    public Trie() {
        this.root = new TrieNode();
    }
 
    // a b c d 
    // 97 98 99 100 
 
    public void insertWord(String word) {
        int n = word.length();
        TrieNode currNode = this.root;
 
        for (int index = 0; index < n; index++) {
            int position = word.charAt(index) - 'a';
            if (currNode.arr[position] == null) {
                currNode.arr[position] = new TrieNode();
            }
            currNode = currNode.arr[position];
            currNode.passing++;
        }
    }
 
    public String findShortestPrefix(String word) {
        int n = word.length();
        TrieNode currNode = this.root;
        StringBuffer result = new StringBuffer();
 
        for (int index = 0; index < n; index++) {
            int position = word.charAt(index) - 'a';
            result.append(word.charAt(index));
            if (currNode.arr[position].passing == 1) {
                break;
            }
            currNode = currNode.arr[position];
        }
        return result.toString();
    }
}
 


class Solution {
    static String[] findPrefixes(String[] arr, int N) {
        Trie trie = new Trie();
        for (String word: arr) {
            trie.insertWord(word);
        }
        String[] result = new String[N];
        for (int index = 0; index < N; index++) {
            result[index] = trie.findShortestPrefix(arr[index]);
        }
        return result;
        
    }
};