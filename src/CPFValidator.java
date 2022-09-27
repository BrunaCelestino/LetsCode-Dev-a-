import java.util.Arrays;
import java.util.Scanner;

public class CPFValidator {
    public static void main(String[] args) {
        int sum = 0;
        int rest;
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao Validador de CPF");
        System.out.println("Insira seu CPF:");
        String CPF = input.next();

        if (!CPF.matches("^[0-9]{3}(.)[0-9]{3}(.)[0-9]{3}(-)[0-9]{2}$")) {
            System.out.println("message: Invalid CPF format. Please, check it and try again.");
            System.out.println("details: Use the format -> xxx.xxx.xxx-xx");
        } else {

            String strCPF = CPF.replace(".", "");
            strCPF = strCPF.replace("-", "");


            String cpfChanged = strCPF;

            if (cpfChanged.length() != 11) {
                System.out.println("message: Invalid CPF number. Please, check it and try again.");
                System.out.println("details: A CPF number must be 11 digits long.");

            } else {

                String[] numbers =
                        {" 00000000000",
                                "11111111111",
                                "22222222222",
                                "33333333333",
                                "44444444444",
                                " 55555555555",
                                "66666666666",
                                "77777777777",
                                "88888888888",
                                "99999999999"};

                if (Arrays.asList(numbers).contains(cpfChanged)) {
                    System.out.println("message: Invalid CPF number. Please, check it and try again.");
                    System.out.println("details: The CPF numbers cannot be the same.");
                } else {

                    for (int i = 1; i <= 9; i += 1)
                        sum += Integer.parseInt(cpfChanged.substring(i - 1, i), 10) * (11 - i);

                    rest = (sum * 10) % 11;

                    if (rest == 10 ) rest = 0;
                    if (rest != Integer.parseInt(strCPF.substring(9, 10), 10)) {
                        System.out.println("message: Invalid CPF number. Please, check it and try again.");
                        System.out.println("details: This is not an acceptable CPF format.");

                    } else {

                        sum = 0;

                        for (int i = 1; i <= 10; i += 1)
                            sum += Integer.parseInt(strCPF.substring(i - 1, i), 10) * (12 - i);
                        rest = (sum * 10) % 11;
                        if (rest == 10 ) rest = 0;
                        if (rest != Integer.parseInt(strCPF.substring(10, 11), 10)) {
                            System.out.println("message: Invalid CPF number. Please, check it and try again.");
                            System.out.println("details: This is not an acceptable CPF format.");
                        } else {

                            System.out.printf("The CPF: %s is valid", CPF);
                            input.close();
                        }
                    }
                }
            }
        }
    }
}



