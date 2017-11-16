package org.xwalk.core.extension;

public class ExtensionInstanceHelper
{
  XWalkExternalExtension mExtension;
  MessageHandler mHandler;
  int mId;
  private BindingObjectStore mStore;
  
  public ExtensionInstanceHelper(XWalkExternalExtension paramXWalkExternalExtension, int paramInt)
  {
    this.mId = paramInt;
    this.mExtension = paramXWalkExternalExtension;
    this.mHandler = new MessageHandler(this.mExtension.getMessageHandler());
    if (this.mExtension.isAutoJS()) {
      ReflectionHelper.registerHandlers(this.mExtension.getReflection(), this.mHandler, this.mExtension);
    }
    this.mStore = new BindingObjectStore(this.mHandler, this);
  }
  
  public boolean addBindingObject(String paramString, BindingObject paramBindingObject)
  {
    return this.mStore.addBindingObject(paramString, paramBindingObject);
  }
  
  public BindingObject getBindingObject(String paramString)
  {
    return this.mStore.getBindingObject(paramString);
  }
  
  public XWalkExternalExtension getExtension()
  {
    return this.mExtension;
  }
  
  public int getId()
  {
    return this.mId;
  }
  
  public Object handleMessage(String paramString)
  {
    paramString = new MessageInfo(this.mExtension, this.mId, paramString);
    return this.mHandler.handleMessage(paramString);
  }
  
  public Object handleMessage(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new MessageInfo(this.mExtension, this.mId, paramArrayOfByte);
    return this.mHandler.handleMessage(paramArrayOfByte);
  }
  
  public BindingObject removeBindingObject(String paramString)
  {
    return this.mStore.removeBindingObject(paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\org\xwalk\core\extension\ExtensionInstanceHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */