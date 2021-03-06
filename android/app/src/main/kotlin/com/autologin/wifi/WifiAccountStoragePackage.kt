package com.autologin.wifi

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.JavaScriptModule
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

class WifiAccountStoragePackage : ReactPackage {
  override fun createJSModules() = emptyList<Class<out JavaScriptModule>>()

  override fun createViewManagers(reactContext: ReactApplicationContext) = emptyList<ViewManager<*, *>>()

  override fun createNativeModules(reactContext: ReactApplicationContext) = listOf<NativeModule>(
    WifiAccountStorageModule(reactContext)
  )
}
