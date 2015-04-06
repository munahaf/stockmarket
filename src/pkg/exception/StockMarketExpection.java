package pkg.exception;
public class StockMarketExpection extends Exception {
	/**
	 * Added a dummy comment
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public StockMarketExpection() {
		super();
	}

	public StockMarketExpection(String message) {
		super();
		this.message = message;
	}

	@Override
	public void printStackTrace() {
		System.out.println("Stock Market Violation Exception");
		System.out.println(message);
	}
}
