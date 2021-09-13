package chapter_6.exercise62;



public class QDemo2 {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        System.out.println("Использование очереди bigQ для сохранения алфавита");
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }
        System.out.print("Содержимое очереди bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Использование очереди SmallQ для генерации ошибок");
        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " +
                    (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

            //Дополнительные ошибки при обращени к очереди smallQ
            System.out.println("Содержимое SmallQ: ");
            for (i = 0; i < 5; i++) {
                ch = smallQ.get();
                if (ch != (char) 0) System.out.print(ch);
            }
        }
    }

