package 代理模式.代理模式4;

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;
    private String name;

    //构造函数传递用户名
    public GamePlayerProxy(String name) {
        this.name = name;
        getGamePlayer();
    }

    private IGamePlayer getGamePlayer() {
        if (this.gamePlayer == null) {
            this.gamePlayer = new GamePlayer(this, this.name);
        }
        return this.gamePlayer;
    }

    //代练杀怪
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    //代练登录
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    //代练升级
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}