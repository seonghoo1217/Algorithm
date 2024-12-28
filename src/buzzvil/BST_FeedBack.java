package buzzvil;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BST_FeedBack {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println("Is BST: " + isBST(root)); // true

        // 예제 2
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);

        System.out.println("Is BST: " + isBST(root2)); // false
    }

    public static boolean isBST(TreeNode node) {
        return isBSTUtil(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBSTUtil(TreeNode node, int min, int max) {
        // 빈 노드는 BST로 간주
        if (node == null) {
            return true;
        }

        // 현재 노드의 값이 허용된 범위를 벗어나는 경우
        if (node.val <= min || node.val >= max) {
            return false;
        }

        // 왼쪽 서브트리와 오른쪽 서브트리 재귀적으로 확인
        return isBSTUtil(node.left, min, node.val) && isBSTUtil(node.right, node.val, max);
    }

}
