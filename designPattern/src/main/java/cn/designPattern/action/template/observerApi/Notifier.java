package cn.designPattern.action.template.observerApi;

public abstract class Notifier {
	private EventHandler eventHandler = new EventHandler();

	public EventHandler getEventHandler() {
		return eventHandler;
	}

	/**
	 * 增加需要帮忙 放哨 的 学生
	 * 
	 * @param object     要执行方法的对象
	 * @param methodName 执行方法 的方法名
	 * @param args       执行方法的参数
	 */
    public  void addListener(Object object,String methodName,Object...args){
        //讲传递进来的参数交由EventHandler,EventHandler交由event处理。
        eventHandler.addEvent(object, methodName, args);
    }
	/**
	 * 告诉所有要帮忙放哨的学生：老师来了
	 */
    public abstract void notifyx();

}
