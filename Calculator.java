/**
	Класс реализует калькулятор
*/
public class Calculator {
	/**
		Результат вычисления
	*/
	private int result;
	
	/**
		Суммируем аргументыю
		@param params - аргументы суммирования.
	*/
	public void add(int ... params) {
		for (Integer param : params)
			this.result += param;
	}
	
	/**
		Получить результат
		@return - результат вычисленияю
	*/
	public int getResult() {
		return this.result;
	}
	
	/**
		Очистить результат вычисления.
	*/
	public void cleanResult() {
		this.result = 0;
	}
}
