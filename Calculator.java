public class Calculator {
// Данные необходимые для работы Calculator,a полученые из InteractRunner,a
    private int result;
    private char ch;

// Получение символа
    public void setCharacter(char ch) {
        this.ch = ch;
    }

// Вычесление
    public void add(Integer... params) {
		int count = 0;
        switch (ch) {
            case '+':
                for (int param : params){
					if(count == 0) result = param;
					else result += param;
					count++;
				}
				count = 0;
                break;
            case '-':
                for (int param : params) {
					if(count == 0) result = param;
					else result -= param;
					count++;
				}
				count = 0;
                break;
            case '/':
				for (int param : params){ 
					if(count == 0) result = param;
					else result /= param;
					count++;
				}
				count = 0;
				break;
            case '*':
				for (int param : params) {
					if(count == 0) result = param;
					else result *= param;
					count++;
				}
				count = 0;
				break;
        }
    }

// Получение результата из вычеслении
    public int getResult() {
        return this.result;
    }

// Обнуление результата
    public void cleanResult() {
        this.result = 0;
    }
}
	
	