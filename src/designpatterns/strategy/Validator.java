package designpatterns.strategy;

public interface Validator<T> {
	void validate(T input);
}
