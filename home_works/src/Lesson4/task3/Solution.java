package Lesson4.task3;

public class Solution {
    public static void main(String[] args) {
        CommercialBuilding Plaza = new CommercialBuilding(300, 6000, 30, "Downtown", "Mall");
        ResidentialBuilding newHome = new ResidentialBuilding(50, 9000, 15, "Downtown", 3);

        System.out.println(Plaza.toString());
        System.out.println();
        System.out.println(newHome.toString());

    }
}
