public class Main {
    public static void main(String[] args) {
                int ClientOS = 0;
                int clientDeviceYear = 2016;

                    if (ClientOS == 1 && clientDeviceYear > 2015)
                        System.out.println("Установите версию приложения для iOS по ссылке");
                    if (ClientOS == 1 && clientDeviceYear < 2015)
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                 else {
            if (ClientOS == 0 && clientDeviceYear > 2015)
                System.out.println("Установите версию приложения для Android по ссылке");
        if (ClientOS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
    }
}
