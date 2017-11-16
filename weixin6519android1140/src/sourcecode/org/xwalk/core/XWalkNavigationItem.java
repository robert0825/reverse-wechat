package org.xwalk.core;

import java.util.ArrayList;

public class XWalkNavigationItem
{
  private Object bridge;
  private ArrayList<Object> constructorParams;
  private ArrayList<Object> constructorTypes;
  private XWalkCoreWrapper coreWrapper;
  private ReflectMethod getOriginalUrlMethod = new ReflectMethod(null, "getOriginalUrl", new Class[0]);
  private ReflectMethod getTitleMethod = new ReflectMethod(null, "getTitle", new Class[0]);
  private ReflectMethod getUrlMethod = new ReflectMethod(null, "getUrl", new Class[0]);
  private ReflectMethod postWrapperMethod;
  
  public XWalkNavigationItem(Object paramObject)
  {
    this.bridge = paramObject;
    reflectionInit();
  }
  
  protected Object getBridge()
  {
    return this.bridge;
  }
  
  public String getOriginalUrl()
  {
    try
    {
      String str = (String)this.getOriginalUrlMethod.invoke(new Object[0]);
      return str;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
    return null;
  }
  
  public String getTitle()
  {
    try
    {
      String str = (String)this.getTitleMethod.invoke(new Object[0]);
      return str;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
    return null;
  }
  
  public String getUrl()
  {
    try
    {
      String str = (String)this.getUrlMethod.invoke(new Object[0]);
      return str;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      if (this.coreWrapper == null) {
        throw new RuntimeException("Crosswalk's APIs are not ready yet");
      }
      XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
    }
    return null;
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
    this.getUrlMethod.init(this.bridge, null, "getUrlSuper", new Class[0]);
    this.getOriginalUrlMethod.init(this.bridge, null, "getOriginalUrlSuper", new Class[0]);
    this.getTitleMethod.init(this.bridge, null, "getTitleSuper", new Class[0]);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\org\xwalk\core\XWalkNavigationItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */