package io.flutter.plugin.common;

/** Minimal local stand-in for Flutter's EventChannel. */
public class EventChannel {
    public interface EventSink {
        void success(Object event);

        void error(String errorCode, String errorMessage, Object errorDetails);

        void endOfStream();
    }

    public interface StreamHandler {
        void onListen(Object arguments, EventSink events);

        void onCancel(Object arguments);
    }

    private StreamHandler streamHandler;

    public EventChannel(BinaryMessenger messenger, String name) {
        // No-op stand-in.
    }

    public void setStreamHandler(StreamHandler streamHandler) {
        this.streamHandler = streamHandler;
    }

    public StreamHandler getStreamHandler() {
        return streamHandler;
    }
}

