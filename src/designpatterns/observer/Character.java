package designpatterns.observer;

public interface Character {
	void goOutdoors();
	void goIndoors();
	boolean isOutdoors();
	boolean isIndoors();
	boolean isFeelingWarm();
	boolean isFeelingTired();
	void notifySunSet();
	void notifySunRose();
}
