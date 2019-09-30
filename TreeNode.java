public class TreeNode  {
    public TreeNode right;
    public TreeNode left;


    // Change "String lastname" into a general object
    // Or instead include 'lastname'  'ID'  * 'categories' will be created separately because of the tree inside a tree design
    public String name;
    public String ssn;
    public String category;
    public String jokename;


    public TreeNode(){

    }

    public TreeNode(String name, String ssn, String category, String jokename) {
        this.name = name;
        this.ssn = ssn;
        this.category = category;
        this.jokename = jokename;
        right = null;
        left = null;
    }

    public TreeNode(String name, String ssn, String category, String jokename, TreeNode left, TreeNode right) {
        this.name = name;
        this.ssn = ssn;
        this.category = category;
        this.jokename = jokename;
        this.right = right;
        this.left = left;
    }

    ////////////// main issue??????
    // I was planning to read the Strings from the file and separate them into name, id, ssn, etc.
    // and using it to create a Treenode that would hold all of these information and
    // when I call the print method of the Treenode it will display all of it's information.

    // However, while I was planning to pass in the Treenode's ID to be sorted and added at the same
    // the add method below don't know who to compare the incoming String with cuz there are multiple Strings

    // One way to solve it is establish enum to categorize the it
    // Or we type multiple 'add' method for each String method

    // Final deicision, I will create

    public void addByID(TreeNode root, TreeNode newroot) {

        // compared subject is alphabetically larger & right node is empty -> add to right
        if( compare(root.ssn, newroot.ssn) > 0 && root.right ==null)
            root.right = newroot;
        // compared subject alphabetically is smaller & left node is empty -> add to left
        else if (compare(root.ssn, newroot.ssn) < 0 && root.left == null)
            root.left = newroot;
        // compared subject is alphabetically larger & already a node there -> next right
        else if ( compare(root.ssn, newroot.ssn) > 0)
            addByID(root.right, newroot);
        // compared subject is alphabetically smaller & already a node there -> next left
        else if ( compare(root.ssn, newroot.ssn) < 0 )
            addByID(root.left, newroot);

    }

    public int compare(String main, String other ){
        int status = 0;
        int position = 0;

        while(status ==0) {
            char ca = main.charAt(position);
            char cb = other.charAt(position);
            status = ((int) ca) - ((int) cb);
            position ++;
        }

        return status;
    }



}
