import java.util.HashMap;
import java.util.Map;

public class PrefixTrie {
    public class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
    }

    TrieNode root = new TrieNode();
    char endNode = '*';

    public PrefixTrie(String str) {

        populateSuffixTree(str);
    }

    public void populateSuffixTree(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {
            insertSubStringStraightAt(i, str);
        }

    }

    public void insertSubStringStraightAt(int index, String str) {
        TrieNode node = root;
        for (int i = index; i >= 0; i--) {
            char letter = str.charAt(i);
            if (!node.children.containsKey(letter)) {
                TrieNode newNode = new TrieNode();
                node.children.put(letter, newNode);

            }
            node = node.children.get(letter);
        }
        node.children.put(endNode, null);

    }

    public boolean contains(String str) {
        TrieNode node = root;

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            System.out.println(letter);

            if (!node.children.containsKey(letter)) {
                return false;
            }
            node = node.children.get(letter);

        }
        return node.children.containsKey(endNode);

    }

    public static void main(String[] args) {
        String letter = "annb";
        PrefixTrie trie = new PrefixTrie(letter);
        System.out.println(trie.contains("bnna"));

    }

}
