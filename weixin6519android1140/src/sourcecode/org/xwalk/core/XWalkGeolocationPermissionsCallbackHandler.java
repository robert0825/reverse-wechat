package org.xwalk.core;

import java.util.ArrayList;

public class XWalkGeolocationPermissionsCallbackHandler
  implements XWalkGeolocationPermissionsCallback
{
  private Object bridge;
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes;
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod invokeStringbooleanbooleanMethod = new ReflectMethod(null, "invoke", new Class[0]);
  private ReflectMethod postWrapperMethod;
  
  public XWalkGeolocationPermissionsCallbackHandler(Object paramObject)
  {
    this.bridge = paramObject;
    reflectionInit();
  }
  
  protected Object getBridge()
  {
    return this.bridge;
  }
  
  public void invoke(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    try
    {
      this.invokeStringbooleanbooleanMethod.invoke(new Object[] { paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
      return;
    }
    catch (UnsupportedOperationException paramString)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(paramString);
    }
  }
  
  void reflectionInit()
  {
    XWalkCoreWrapper.initEmbeddedMode();
    this.coreWrapper = XWalkCoreWrapper.getInstance();
    if (this.coreWrapper == null)
    {
      XWalkCoreWrapper.reserveReflectObject(this);
      return;
    }
    this.invokeStringbooleanbooleanMethod.init(this.bridge, null, "invokeSuper", new Class[] { String.class, Boolean.TYPE, Boolean.TYPE });
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\org\xwalk\core\XWalkGeolocationPermissionsCallbackHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */