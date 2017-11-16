package org.xwalk.core;

import java.util.ArrayList;

public class XWalkHttpAuthHandler
  implements XWalkHttpAuth
{
  private Object bridge;
  private ReflectMethod cancelMethod = new ReflectMethod(null, "cancel", new Class[0]);
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes;
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod isFirstAttemptMethod = new ReflectMethod(null, "isFirstAttempt", new Class[0]);
  private ReflectMethod postWrapperMethod;
  private ReflectMethod proceedStringStringMethod = new ReflectMethod(null, "proceed", new Class[0]);
  
  public XWalkHttpAuthHandler(Object paramObject)
  {
    this.bridge = paramObject;
    reflectionInit();
  }
  
  public void cancel()
  {
    try
    {
      this.cancelMethod.invoke(new Object[0]);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
  }
  
  protected Object getBridge()
  {
    return this.bridge;
  }
  
  public boolean isFirstAttempt()
  {
    try
    {
      boolean bool = ((Boolean)this.isFirstAttemptMethod.invoke(new Object[0])).booleanValue();
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
    return false;
  }
  
  public void proceed(String paramString1, String paramString2)
  {
    try
    {
      this.proceedStringStringMethod.invoke(new Object[] { paramString1, paramString2 });
      return;
    }
    catch (UnsupportedOperationException paramString1)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(paramString1);
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
    this.proceedStringStringMethod.init(this.bridge, null, "proceedSuper", new Class[] { String.class, String.class });
    this.cancelMethod.init(this.bridge, null, "cancelSuper", new Class[0]);
    this.isFirstAttemptMethod.init(this.bridge, null, "isFirstAttemptSuper", new Class[0]);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\org\xwalk\core\XWalkHttpAuthHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */