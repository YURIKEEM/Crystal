package exam04;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void tailQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String frontQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
          
}
