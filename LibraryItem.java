public class LibraryItem {
	private String itemType = "";
	private int id = 0;
	private boolean available;
	
	private LibraryItem(String type, int id, boolean isRentable) {
		itemType = type;
		id = id;
		available = isRentable;
		}
	}
