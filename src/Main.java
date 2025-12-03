import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Ajouter une tâche");
            System.out.println("2. Lister tâches");
            System.out.println("3. Terminer tâche");
            System.out.println("4. Supprimer tâche");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consommer le retour à la ligne

            switch (choice) {
                case 1:
                    System.out.print("Titre : ");
                    String title = scanner.nextLine();
                    System.out.print("Description : ");
                    String desc = scanner.nextLine();
                    manager.addTask(new Task(title, desc));
                    break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    System.out.print("Numéro tâche à terminer : ");
                    int doneIndex = scanner.nextInt() - 1;
                    manager.markTaskDone(doneIndex);
                    break;
                case 4:
                    System.out.print("Numéro tâche à supprimer : ");
                    int removeIndex = scanner.nextInt() - 1;
                    manager.removeTask(removeIndex);
                    break;
                case 5:
                    System.out.println("Bye !");
                    System.exit(0);
            }
        }
    }
}

