package io.flutter.plugin.common;

/** Minimal local stand-in for Flutter's MethodChannel. */
public class MethodChannel {
	public interface MethodCallHandler {
		void onMethodCall(MethodCall call, Result result);
	}

	public interface Result {
		void success(Object result);

		void error(String errorCode, String errorMessage, Object errorDetails);

		void notImplemented();
	}

	private MethodCallHandler handler;

	public MethodChannel(BinaryMessenger messenger, String name) {
		// No-op stand-in.
	}

	public void setMethodCallHandler(MethodCallHandler handler) {
		this.handler = handler;
	}

	public MethodCallHandler getHandler() {
		return handler;
	}
}

