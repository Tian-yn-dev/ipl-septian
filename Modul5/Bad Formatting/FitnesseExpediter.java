package Formatting;

public class FitNesseExpediter2 implements ResponseSender{
	private Socket socket;
	private InputStream input;
	private OutputStream output;
	private Request request;
	private Response response;
	private FitNesseContext context;
	protected long requestParsingTimeLimit;
	private long requestProgress;
	private long requestParsingDeadline;
	private boolean hasError;
	
...
}
