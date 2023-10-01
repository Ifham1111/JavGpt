public class Encasulation {
    private String contents;
    private boolean locked;

    public void lock() {
        locked = true;
    }

    public void unlock() {
        locked = false;
    }

    public void putItem(String item) {
        if (!locked) {
            contents = item;
        } else {
            System.out.println("The chest is locked! Unlock it first.");
        }
    }

    public String getItem() {
        if (!locked) {
            return contents;
        } else {
            System.out.println("The chest is locked! Unlock it first.");
            return null;
        }
    }


}
