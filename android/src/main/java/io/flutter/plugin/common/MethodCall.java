package io.flutter.plugin.common;

import java.util.Map;

/** Minimal local stand-in for Flutter's MethodCall. */
public class MethodCall {
    public final String method;
    private final Map<String, Object> arguments;

    public MethodCall(String method, Map<String, Object> arguments) {
        this.method = method;
        this.arguments = arguments;
    }

    @SuppressWarnings("unchecked")
    public <T> T argument(String key) {
        return arguments == null ? null : (T) arguments.get(key);
    }
}

