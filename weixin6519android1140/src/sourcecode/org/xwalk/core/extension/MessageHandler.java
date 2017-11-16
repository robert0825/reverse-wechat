package org.xwalk.core.extension;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.xwalk.core.Log;

public class MessageHandler
{
  private String TAG = "MessageHandler";
  private Map<String, Handler> mHandlers = new HashMap();
  
  public MessageHandler() {}
  
  public MessageHandler(MessageHandler paramMessageHandler)
  {
    this.mHandlers.putAll(paramMessageHandler.mHandlers);
  }
  
  public Object handleMessage(MessageInfo paramMessageInfo)
  {
    Object localObject = paramMessageInfo.getJsName();
    Handler localHandler = (Handler)this.mHandlers.get(localObject);
    if ((localHandler == null) || (localHandler.targetObject == null))
    {
      Log.w(this.TAG, "Cannot find handler for method " + (String)localObject);
      return null;
    }
    localObject = localHandler.targetObject;
    if ((paramMessageInfo.getExtension().isAutoJS()) && (localHandler.reflection != null)) {
      try
      {
        paramMessageInfo = localHandler.reflection.handleMessage(paramMessageInfo, localObject);
        return paramMessageInfo;
      }
      catch (Exception paramMessageInfo)
      {
        Log.e(this.TAG, paramMessageInfo.toString());
        return null;
      }
    }
    try
    {
      paramMessageInfo = localObject.getClass().getMethod(localHandler.javaName, new Class[] { MessageInfo.class }).invoke(localObject, new Object[] { paramMessageInfo });
      return paramMessageInfo;
    }
    catch (IllegalAccessException paramMessageInfo)
    {
      Log.e(this.TAG, paramMessageInfo.toString());
      return null;
    }
    catch (IllegalArgumentException paramMessageInfo)
    {
      for (;;) {}
    }
    catch (NoSuchMethodException paramMessageInfo)
    {
      for (;;) {}
    }
    catch (InvocationTargetException paramMessageInfo)
    {
      for (;;) {}
    }
    catch (SecurityException paramMessageInfo)
    {
      for (;;) {}
    }
  }
  
  public void register(String paramString, Object paramObject)
  {
    register(paramString, paramString, ReflectionHelper.MemberType.JS_METHOD, paramObject, null);
  }
  
  public void register(String paramString1, String paramString2, Object paramObject)
  {
    register(paramString1, paramString2, ReflectionHelper.MemberType.JS_METHOD, paramObject, null);
  }
  
  public void register(String paramString1, String paramString2, ReflectionHelper.MemberType paramMemberType, Object paramObject)
  {
    register(paramString1, paramString2, paramMemberType, paramObject, null);
  }
  
  public void register(String paramString1, String paramString2, ReflectionHelper.MemberType paramMemberType, Object paramObject, ReflectionHelper paramReflectionHelper)
  {
    if (this.mHandlers.containsKey(paramString1))
    {
      Log.w(this.TAG, "Existing handler for " + paramString1);
      return;
    }
    paramString2 = new Handler(paramString2, paramMemberType, paramObject, paramReflectionHelper);
    this.mHandlers.put(paramString1, paramString2);
  }
  
  public class Handler
  {
    String javaName;
    ReflectionHelper reflection;
    Object targetObject;
    ReflectionHelper.MemberType type;
    
    public Handler(String paramString, ReflectionHelper.MemberType paramMemberType, Object paramObject)
    {
      this(paramString, paramMemberType, paramObject, null);
    }
    
    public Handler(String paramString, ReflectionHelper.MemberType paramMemberType, Object paramObject, ReflectionHelper paramReflectionHelper)
    {
      this.type = paramMemberType;
      this.javaName = paramString;
      this.targetObject = paramObject;
      this.reflection = paramReflectionHelper;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\org\xwalk\core\extension\MessageHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */