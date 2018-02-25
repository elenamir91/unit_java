public class Calculator{
	private int result; //храниит результат

	public void add(int ... params){ // @param params аргументы суммирования
		for (Integer param : params){
			this.result +=param;
		}
	}

	public int getResult(){
		return this.result; //получает результат
	}

	public void cleanResult(){//очищает результат
		this.result=0;
	}


}