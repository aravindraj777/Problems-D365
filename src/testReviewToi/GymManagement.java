package testReviewToi;

public class GymManagement {

    User root;
    GymManagement(){
        root = null;
    }

    class User {

        User left;
        User right;

        int id;
        String name;

        User(int id,String name){
            this.id = id;
            this.name = name;
            left = right = null;
        }
    }

    public void insert(int id, String name){
        root = insertUserDetails(root,id,name);
    }

    public User insertUserDetails(User root ,int id, String name){

        User newUser = new User(id,name);
        if (root == null){
            root = newUser;
            return root;
        } else if (root.id < id) {
            root.right = insertUserDetails(root.right,id,name);
        } else if (root.id > id) {
            root.left = insertUserDetails(root.left,id,name);
        }
        return root;
    }

    public User getUserDetails(int id){
        return getUserDetailsHelper(root, id);
    }

    private User getUserDetailsHelper(User root, int id){
        if (root == null || root.id == id) {
            return root;
        } else if (root.id > id) {
            return getUserDetailsHelper(root.left, id);
        } else {
            return getUserDetailsHelper(root.right, id);
        }
    }

    public void listingUser(User root){

        if (root == null){
            return;
        }
        listingUser(root.left);
        System.out.println(root.id+ " "+root.name);
        listingUser(root.right);
    }


}

class GymMain{

    public static void main(String[] args) {
        GymManagement gym = new GymManagement();
        gym.insert(101,"Aravind");
        gym.insert(102,"Nasma");
        gym.insert(103,"Rahul");
        gym.insert(104,"Ranjan");

        gym.getUserDetails(103);
//        gym.listingUser(gym.root);

        int searchId = 102;
        GymManagement.User user = gym.getUserDetails(searchId);
        if (user != null) {
            System.out.println("Found user: " + user.id + " " + user.name);
        } else {
            System.out.println("User not found with ID: " + searchId);
        }

    }
}
