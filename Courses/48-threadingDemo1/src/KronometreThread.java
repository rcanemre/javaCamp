public class KronometreThread implements Runnable {

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Oluşturuluyor : " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor : " + threadName);
        //Burada çalıştırılacak kod yazılır veya başka class çağırılabilir. Çağırmak daha nesnel.

        try {

            for (int i = 0; i <= 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("Kesildi : " + threadName);
        }

        System.out.println("Thread tamamlandı : " + threadName);

    }

    public void start() {
        System.out.println("Thead nesnesi oluşuyor");
        if (thread == null) {
            thread = new Thread(this, threadName);
        }
        thread.start();

    }

}
