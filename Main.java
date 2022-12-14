import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int associateId, days;
        String associateName;

        System.out.println("Enter the associate id:");
        associateId = sc.nextInt();

        System.out.println("Enter the associate name:");
        associateName = sc.next();

        System.out.println("Enter the number of days:");
        days = sc.nextInt();

        if (days < 0) {
            System.out.println("Invalid Input");
        } else {
            DreamTek associate = new DreamTek();
            associate.setAssociateId(associateId);
            associate.setAssociateName(associateName);
            associate.trackAssociateStatus(days);

            System.out.println("The associate " + associate.getAssociateName() + " work status:" + associate.getWorkStatus());
        }
    }
}