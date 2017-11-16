package org.xwalk.core;

public class XWalkViewDatabase
{
  private static ReflectMethod clearFormDataMethod = new ReflectMethod(null, "clearFormData", new Class[0]);
  private static XWalkCoreWrapper coreWrapper;
  private static ReflectMethod hasFormDataMethod = new ReflectMethod(null, "hasFormData", new Class[0]);
  
  public static void clearFormData()
  {
    
    try
    {
      clearFormDataMethod.invoke(new Object[0]);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (coreWrapper == null)
      {
        clearFormDataMethod.setArguments(new Object[0]);
        XWalkCoreWrapper.reserveReflectMethod(clearFormDataMethod);
        return;
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
  }
  
  public static boolean hasFormData()
  {
    
    try
    {
      boolean bool = ((Boolean)hasFormDataMethod.invoke(new Object[0])).booleanValue();
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
    return false;
  }
  
  static void reflectionInit()
  {
    if (coreWrapper != null) {
      return;
    }
    XWalkCoreWrapper.initEmbeddedMode();
    Object localObject = XWalkCoreWrapper.getInstance();
    coreWrapper = (XWalkCoreWrapper)localObject;
    if (localObject == null)
    {
      XWalkCoreWrapper.reserveReflectClass(XWalkViewDatabase.class);
      return;
    }
    localObject = coreWrapper.getBridgeClass("XWalkViewDatabaseBridge");
    hasFormDataMethod.init(null, (Class)localObject, "hasFormData", new Class[0]);
    clearFormDataMethod.init(null, (Class)localObject, "clearFormData", new Class[0]);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\org\xwalk\core\XWalkViewDatabase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */