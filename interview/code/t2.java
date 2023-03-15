package interview.code;

class TrieNode {
    private TrieNode[] children;
    private boolean isEnd;

    public TrieNode() {
        children = new TrieNode[26];
        isEnd = false;
    }

    public boolean hasChild(char ch) {
        return children[ch - 'a'] != null;
    }

    public TrieNode getChild(char ch) {
        return children[ch - 'a'];
    }

    public void addChild(char ch) {
        children[ch - 'a'] = new TrieNode();
    }

    public void setEnd() {
        isEnd = true;
    }

    public boolean isEnd() {
        return isEnd;
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            if (!node.hasChild(ch)) {
                node.addChild(ch);
            }
            node = node.getChild(ch);
        }
        node.setEnd();
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            if (!node.hasChild(ch)) {
                return false;
            }
            node = node.getChild(ch);
        }
        return node.isEnd();
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            if (!node.hasChild(ch)) {
                return false;
            }
            node = node.getChild(ch);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */