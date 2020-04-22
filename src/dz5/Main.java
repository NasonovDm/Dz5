package dz5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

    private static Person[] persArray;

    public static void main(String[] args) {
        fill();
        printPerson(persArray);
    }

    private static void fill() {
        persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван", "Директор", "ii@mail.ru", "+71112221122", 100000, 56);
        persArray[1] = new Person("Иванова Мария", "Секретарь", "im@mail.ru", "+71112221123", 35000, 25);
        persArray[2] = new Person("Петров Николай", "Техник", "pn@mail.ru", "+72221112233", 45000, 60);
        persArray[3] = new Person("Сидоров Владимир", "Водитель", "sv@mail.ru", "+75551231122", 40000, 21);
        persArray[4] = new Person("Николаева Анна", "Бухгалтер", "fin@mail.ru", "+71111230000", 60000, 44);

    }


    private static void printPerson(Person[] array) {
        for (int i = 0; i < 5; i++) {
            array[i].Info();
        }
    }
}