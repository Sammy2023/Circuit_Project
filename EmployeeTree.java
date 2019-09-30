import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeTree {
    TreeNode overallRoot;
    ArrayList employeesArray;

    public EmployeeTree (){
        overallRoot = new TreeNode();
        employeesArray = new ArrayList();

    }

    public void add( String single){
        employeesArray.add(single);
    }

    //1. Both trees can be sorted in the same way
    //2. The Build methods can access the Array and add accordingly base by ID or by Name


    //add last names into a tree

     /*
    // Separating the String
    public void Build_Tree_SortbyName(){
        Iterator<String> iterator = employeesArray.iterator();
        while( iterator.hasNext() )
        {
            String single = iterator.next();
            if (  (int) single.charAt(0) >=65 && (int) single.charAt(0) <=90)
            {
                if( overallRoot.lastname != null){
                    overallRoot.add(overallRoot, single);
                }
                else // checks that overallRoot is empty
                    overallRoot = new TreeNode(single);
            }
        }


    }

      */

    //add ID into a tree
    public void Build_Tree_SortedbyID()
        throws FileNotFoundException{

            File file = new File("CircusEmployees.js");
            System.out.println("exists " + file.exists());
            System.out.println("canRead " + file.canRead());
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String[] info = input.nextLine().split("                  ");
                for(int i =0; i<info.length; i++)
                        info[i] = info[i].trim();

                if( overallRoot.ssn != null){
                    overallRoot.addByID(overallRoot, new TreeNode(info[0],info[1],info[2],info[3]));
                }
                else // checks that overallRoot is empty
                    overallRoot = new TreeNode(info[0],info[1],info[2],info[3]);

            }

        /*
        Iterator<String> iterator = employeesArray.iterator();
        while( iterator.hasNext() )
        {
            String single = iterator.next();
            if (  (int) single.charAt(0) >=48 && (int) single.charAt(0) <=57)
            {
                if( overallRoot.lastname != null){
                    overallRoot.add(overallRoot, single);
                }
                else // checks that overallRoot is empty
                    overallRoot = new TreeNode(single);
            }
        }

         */


    }


    public void printAlphaTree(TreeNode root){
        /*
        if(root!=null) {
            printAlphaTree(root.right);
            System.out.println(root.lastname);
            printAlphaTree(root.left);
        }

         */

    }
}
