package cn.designPattern.action.template.observerApi;

public class GoodNotifier extends Notifier {

	@Override
	 public  void notifyx(){
        try {
            getEventHandler().notifyx();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }   

}
