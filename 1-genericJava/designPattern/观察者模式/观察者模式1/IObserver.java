package 观察者模式.观察者模式1;

interface IObserver {
    //既然要观察,我发生改变了他也应该有所动作,通知观察者
    void notifyObservers(String context);
}
