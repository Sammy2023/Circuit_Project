import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws FileNotFoundException
    {

        EmployeeTree employees = new EmployeeTree();

        employees.Build_Tree_SortedbyID();
        employees.printAlphaTree(employees.overallRoot);



    }
}
