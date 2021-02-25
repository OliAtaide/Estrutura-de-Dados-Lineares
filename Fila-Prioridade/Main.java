public class Main{
	public static void main(String[] args) {
		Array heap = new Array(99);

		heap.insert(17);
		heap.insert(18);
		heap.insert(25);
		heap.insert(13);
		heap.insert(1);
		heap.insert(5);

		heap.removeMin();
		heap.removeMin();
		heap.removeMin();
		heap.removeMin();

		heap.print();
	}
}