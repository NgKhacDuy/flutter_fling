package io.flutter.embedding.engine.plugins;

import android.content.Context;

import io.flutter.plugin.common.BinaryMessenger;

/** Minimal local stand-in for Flutter's FlutterPlugin API. */
public interface FlutterPlugin {
    void onAttachedToEngine(FlutterPluginBinding binding);

    void onDetachedFromEngine(FlutterPluginBinding binding);

    final class FlutterPluginBinding {
        private final Context applicationContext;
        private final BinaryMessenger binaryMessenger;

        public FlutterPluginBinding(Context applicationContext, BinaryMessenger binaryMessenger) {
            this.applicationContext = applicationContext;
            this.binaryMessenger = binaryMessenger;
        }

        public Context getApplicationContext() {
            return applicationContext;
        }

        public BinaryMessenger getBinaryMessenger() {
            return binaryMessenger;
        }
    }
}

