package lesson12;

public class MeizuM5 implements Phone,Photoapparat {
    @Override
    public void call() {
        System.out.println("MeizuM5 осуществление звонка ...");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("MeizuM5 отправляет сообщение ..." + message);
    }

    @Override
    public void doPhoto() {
        System.out.println("MeizuM5 фотографирует ...");
    }

    @Override
    public void doVideo() {
        System.out.println("MeizuM5 снимает видео ...");
    }
}
