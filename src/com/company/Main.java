package com.company;

public class Main {

    public static void main(String[] args) {
	    int month = 8;
	    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    int[][] squareArray = new int[3][3];

	    if(month >= 1 && month <= 2 || month == 12){
            System.out.println("Зима");
        }
	    else if(month >= 3 && month <= 5){
            System.out.println("Весна");
        }
	    else if(month >= 6 && month <= 8){
            System.out.println("Лето");
        }
	    else if(month >= 9 && month <= 11){
            System.out.println("Осень");
        }
	    else{
            System.out.println("Неизвестное число");
        }

	    switch (month){
        case 1:
            System.out.println("Зима (Январь)");
            break;
	    case 2:
            System.out.println("Зима (Февраль)");
            break;
	    case 3:
            System.out.println("Весна (Март)");
            break;
	    case 4:
            System.out.println("Весна (Апрель)");
            break;
	    case 5:
            System.out.println("Весна (Май)");
            break;
	    case 6:
            System.out.println("Лето (Июнь)");
            break;
	    case 7:
            System.out.println("Лето (Июль)");
            break;
	    case 8:
            System.out.println("Лето (Август)");
            break;
	    case 9:
            System.out.println("Осень (Сентябрь)");
            break;
	    case 10:
            System.out.println("Осень (Октоябрь)");
            break;
	    case 11:
            System.out.println("Осень (Ноябрь)");
            break;
	    case 12:
            System.out.println("Зима (Декабрь)");
            break;
        default:
            System.out.println("Неизвестное число");
            break;
	    }

        System.out.print("Массив в обратном порядке: ");
	    for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        squareArray[0][0] = 21;
        squareArray[0][1] = 22;
        squareArray[0][2] = 23;
        squareArray[1][0] = 24;
        squareArray[1][1] = 25;
        squareArray[1][2] = 26;
        squareArray[2][0] = 27;
        squareArray[2][1] = 28;
        squareArray[2][2] = 29;

        for (int m = 0; m < 3; m++){
            for (int n = 0; n < 3; n++){
                System.out.print(squareArray[m][n] + "[" + m + "][" + n + "] ");
            }
            System.out.println();
        }
    }
}
