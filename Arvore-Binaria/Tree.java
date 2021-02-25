import java.util.ArrayList;

public class Tree {
	Node root;
	public ArrayList<Node> nodes = new ArrayList<>();

	public Node getRoot() {
		return root;
	}

	public void insert(int key) {
		Node n = new Node(key);
		if (root == null) {
			root = n;
		} else {
			Node node = root;
			Node parent;
			while (true) {
				parent = node;
				if (key < node.getKey()) {
					node = node.getLeft();
					if (node == null) {
						parent.setLeft(n);
						n.setParent(parent);
						return;
					}
				} else {
					node = node.getRight();
					if (node == null) {
						parent.setRight(n);
						n.setParent(parent);
						return;
					}
				}
			}
		}
	}

	public boolean remove(int key) {
		Node node = root;
		Node parent = root;
		boolean ItsLeft = true;

		while (node.getKey() != key) {
			parent = node;
			if (key < node.getKey()) {
				ItsLeft = true;
				node = node.getLeft();
				node.setParent(parent);
			} else {
				ItsLeft = false;
				node = node.getRight();
				node.setParent(parent);
			}
			if (node == null) {
				return false;
			}
		}
		if (node.getLeft() == null && node.getRight() == null) {
			if (node == root) {
				root = null;
			} else if (ItsLeft) {
				parent.setLeft(null);
			} else {
				parent.setRight(null);
			}
		} else if (node.getRight() == null) {
			if (node == root) {
				root = node.getLeft();
				root.setParent(null);
			} else if (ItsLeft) {
				parent.setLeft(node.getLeft());
				node.getLeft().setParent(parent);
			} else {
				parent.setRight(node.getLeft());
				node.getLeft().setParent(parent);
			}
		} else if (node.getLeft() == null) {
			if (node == root) {
				root = node.getRight();
				root.setParent(null);
			} else if (ItsLeft) {
				parent.setLeft(node.getRight());
				node.getRight().setParent(parent);
			} else {
				parent.setRight(node.getRight());
				node.getRight().setParent(parent);
			}
		} else {
			Node replace = replace(node);
			if (node == root) {
				root = replace;
			} else if (ItsLeft) {
				parent.setLeft(replace);
				replace.setParent(parent);
			} else {
				parent.setRight(replace);
				replace.setParent(parent);
			}
			replace.setLeft(node.getLeft());

		}
		return true;
	}

	public Node replace(Node rNode) {
		Node rParent = rNode;
		Node r = rNode;

		Node node = rNode.getRight();

		while (node != null) {
			rParent = r;
			r = node;
			node = node.getLeft();
		}
		if (r != rNode.getRight()) {
			rParent.setLeft(r.getRight());
			r.setRight(rNode.getRight());
		}
		return r;
	}

	public Node search(int key) {
		Node node = root;
		while (node.getKey() != key) {
			if (key < node.getKey()) {
				node = node.getLeft();
			} else {
				node = node.getRight();
			}
			if (node == null) {
				return null;
			}
		}
		return node;
	}

	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.getLeft());
			nodes.add(node);
			inOrder(node.getRight());
		}
	}

	public int height(Node node) {
		int lh = 0, rh = 0;
		if (node.getLeft() != null) {
			lh = height(node.getLeft());
		}
		if (node.getRight() != null) {
			rh = height(node.getRight());
		}
		return 1 + Math.max(lh, rh);
	}

	public int depth(Node node) {
		if (node == root) {
			return 0;
		} else {
			return 1 + depth(node.getParent());
		}
	}

}
