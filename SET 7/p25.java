class TablePrinter {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            
            try {
                Thread.sleep(400);
            } 
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class MyThread extends Thread {
    TablePrinter obj;
    int number;
    MyThread(TablePrinter obj, int number) {
        this.obj = obj;
        this.number = number;
    }
    public void run() {
        obj.printTable(number);
    }
}

public class p25 {
    public static void main(String[] args) {
        TablePrinter printer = new TablePrinter();
        MyThread t1 = new MyThread(printer, 5);
        MyThread t2 = new MyThread(printer, 10);

        t1.start();
        t2.start();
    }
}