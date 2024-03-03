class DisplayThread extends Thread {
    private String message;
    private int interval;

    public DisplayThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println(message);
                Thread.sleep(interval * 1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {

        System.out.println("NAME: HARSHITH B");
        System.out.println("USN:  2023BMS02519\n");

        DisplayThread thread1 = new DisplayThread("BMS College of Engineering", 10);
        thread1.start();

        DisplayThread thread2 = new DisplayThread("CSE", 2);
        thread2.start();
    }
}