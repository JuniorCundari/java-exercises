import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][][] schedule = new String[12][31][8];
        String[] months = {
            "Janeiro", "Fevereiro", "Março", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"
        };

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

                boolean validMonth = false;
                boolean validDay = false;
                boolean validTime = false;
                boolean validActivity = false;

                int month = 0;
                int day = 0;
                int hour = 0;
                String activity;

                if (options == 1) {
                    while (!validMonth) {
                        System.out.print("Digite o mês (1 a 12): ");
                        month = scan.nextInt();
                        month--; // Ajusta o índice do mês para começar em 0

                        if (month > 0 && month < 12) {
                            validMonth = true;
                        } else {
                            System.out.println("---------------");
                            System.out.println("Mês inválido!");
                            System.out.println("---------------");
                        }
                    }

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
                        System.out.print("Digite o hora do compromisso (00h a 08h): ");
                        hour = scan.nextInt();

                        if (hour >= 0 && hour <= 8) {
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
                            schedule[month][day][hour] = activity;
                            validActivity = true;
                            System.out.println("---------------------------------------------------------------------------");
                            System.out.println("Compromisso agendado com sucesso para a data de " + (day + 1) + "/" + months[month] + " às " + hour + " horas.");
                        } else {
                            System.out.println("------------------------------");
                            System.out.println("Digite um compromisso válido!");
                            System.out.println("------------------------------");
                        }
                    }

                } else if (options == 2) {
                    for (int i = 0; i < schedule.length; i++) {
                        System.out.println("-----------------");
                        System.out.println("Mês: " + months[i]);

                        for (int j = 0; j < schedule[i].length; j++) {
                            System.out.println("-----------------");

                            for (int k = 0; k < schedule[i][j].length; k++) {
                                if (schedule[i][j][k] == null || schedule[i][j][k].isEmpty()) {
                                    schedule[i][j][k] = " ";
                                }

                                System.out.println("Dia: " + (j + 1) + " - Hora: " + k + " -> " + schedule[i][j][k]);
                            }
                        }
                    }
                } else if (options == 3) {
                    while (!validMonth) {
                        System.out.print("Digite o mês (1 a 12): ");
                        month = scan.nextInt();
                        month--;

                        if (month > 0 && month < 12) {
                            validMonth = true;
                        } else {
                            System.out.println("---------------");
                            System.out.println("Mês inválido!");
                            System.out.println("---------------");
                        }
                    }

                    while (!validDay) {
                        System.out.print("Digite o dia mês (1 a 31): ");
                        day = scan.nextInt();
                        day--;

                        if (day > 1 && day < 32) {
                            validDay = true;
                        } else {
                            System.out.println("---------------");
                            System.out.println("Dia inválido!");
                            System.out.println("---------------");
                        }
                    }

                    while (!validTime) {
                        System.out.print("Digite o hora do compromisso (00h a 08h): ");
                        hour = scan.nextInt();

                        if (hour >= 0 && hour <= 8) {
                            validTime = true;
                        } else {
                            System.out.println("---------------");
                            System.out.println("Hora inválida!");
                            System.out.println("---------------");
                        }
                    }

                    System.out.println("-----------------------------------------");

                    if (schedule[month][day][hour] != null) {
                        System.out.print("Compromisso agendado para: " + day + "/" + months[month] + " - Horário: " + hour + "h -> " + schedule[month][day][hour]);
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