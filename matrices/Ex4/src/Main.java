import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] schedule = new String[31][24];

        boolean exit = false;
        byte options;

        while (!exit) {
            System.out.println("\n--------- Menu ---------");
            System.out.println("1. Agendar compromisso");
            System.out.println("2. Consultar todos os compromissos");
            System.out.println("3. Consultar um compromisso específio");
            System.out.println("0. Sair");

            boolean validOptions = false;

            while (!validOptions) {
                System.out.print("Escolha uma opção: ");
                options = scan.nextByte();

                if (options >= 0 && options <= 3) {
                    validOptions = true;
                } else {
                    System.out.println("--------------------------");
                    System.out.println("Escolha uma opção válida!");
                    System.out.println("--------------------------");
                }

                boolean validDay = false;
                boolean validTime = false;
                boolean validActivity = false;

                int day = 0;
                int hour = 0;
                String activity;

                if (options == 1) {
                    while (!validDay) {
                        System.out.print("Digite o dia mês (1 a 31): ");
                        day = scan.nextInt();
                        day--; // Ajusta o índice do mês para começar em 0

                        if (day > 1 && day < 32) {
                            validDay = true;
                        } else {
                            System.out.println("---------------");
                            System.out.println("Dia inválido!");
                            System.out.println("---------------");
                        }
                    }

                    while (!validTime) {
                        System.out.print("Digite o hora do compromisso (00h a 24h): ");
                        hour = scan.nextInt();

                        if (hour >= 0 && hour <= 24) {
                            validTime = true;
                        } else {
                            System.out.println("---------------");
                            System.out.println("Hora inválida!");
                            System.out.println("---------------");
                        }
                    }

                    scan.nextLine(); // Limpar o buffer do teclado

                    while (!validActivity) {
                        System.out.print("Digite o compromisso: ");
                        activity = scan.nextLine();

                        if (!activity.isEmpty()) {
                            schedule[day][hour] = activity;
                            validActivity = true;
                            System.out.println("---------------------------------------------------------------------------");
                            System.out.println("Compromisso agendado com sucesso para o dia " + (day + 1) + " às " + hour + " horas.");
                        } else {
                            System.out.println("------------------------------");
                            System.out.println("Digite um compromisso válido!");
                            System.out.println("------------------------------");
                        }
                    }
                } else if (options == 2) {
                    for (int i = 0; i < schedule.length; i++) {
                        System.out.println("-----------------------------------------");

                        for (int j = 0; j < schedule[i].length; j++) {
                            if (schedule[i][j] == null || schedule[i][j].isEmpty()) {
                                schedule[i][j] = " ";
                            }

                            System.out.println("Dia: " + (i + 1) + " - Hora: " + j + " -> " + schedule[i][j]);
                        }
                    }
                } else if (options == 3) {
                    while (!validDay) {
                        System.out.print("Digite o dia mês (1 a 31): ");
                        day = scan.nextInt();
                        day--; // Ajusta o índice do mês para começar em 0

                        if (day > 1 && day < 32) {
                            validDay = true;
                        } else {
                            System.out.println("---------------");
                            System.out.println("Dia inválido!");
                            System.out.println("---------------");
                        }
                    }

                    while (!validTime) {
                        System.out.print("Digite o hora do compromisso (00h a 24h): ");
                        hour = scan.nextInt();

                        if (hour >= 0 && hour <= 24) {
                            validTime = true;
                        } else {
                            System.out.println("---------------");
                            System.out.println("Hora inválida!");
                            System.out.println("---------------");
                        }
                    }

                    System.out.println("-----------------------------------------");

                    if (schedule[day][hour] != null) {
                    	System.out.print("Compromisso agendado para: ");
                    System.out.println("Dia: " + day + " - Horário: " + hour + "h -> " + schedule[day][hour]);
                    } else {
                    	System.out.println("Nenhuma atividade agendada para essa data!");
                    }

                } else {
                    exit = true;
                }
            }
        }
    }
}
