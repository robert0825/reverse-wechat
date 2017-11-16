package org.xwalk.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import junit.framework.Assert;

public class XWalkCoreWrapper
{
  private static final String BRIDGE_PACKAGE = "org.xwalk.core.internal";
  private static final String TAG = "XWalkLib";
  private static final String WRAPPER_PACKAGE = "org.xwalk.core";
  private static XWalkCoreWrapper sInstance;
  private static XWalkCoreWrapper sProvisionalInstance;
  private static HashMap<String, LinkedList<ReservedAction>> sReservedActions = new HashMap();
  private static LinkedList<String> sReservedActivities = new LinkedList();
  private int mApiVersion = 8;
  private int mApkVersion;
  private Context mBridgeContext;
  private ClassLoader mBridgeLoader;
  private int mCoreStatus;
  private int mMinApiVersion;
  private Context mWrapperContext;
  DexClassLoader sBridgeLoader;
  
  private XWalkCoreWrapper(Context paramContext, int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt1 <= this.mApiVersion)) {}
    for (;;)
    {
      this.mMinApiVersion = paramInt1;
      this.mCoreStatus = 0;
      this.mWrapperContext = paramContext;
      this.mApkVersion = paramInt2;
      return;
      paramInt1 = this.mApiVersion;
    }
  }
  
  public static int attachXWalkCore(int paramInt)
  {
    Assert.assertFalse(sReservedActivities.isEmpty());
    Assert.assertNull(sInstance);
    Log.d("XWalkLib", "Attach xwalk core");
    if (paramInt == -1)
    {
      Log.i("XWalkLib", "version = -1, no xwalk");
      return 10;
    }
    sProvisionalInstance = new XWalkCoreWrapper(XWalkEnvironment.getApplicationContext(), 1, paramInt);
    if (XWalkEnvironment.isDownloadMode())
    {
      sProvisionalInstance.findDownloadedCore();
      return sProvisionalInstance.mCoreStatus;
    }
    return sProvisionalInstance.mCoreStatus;
  }
  
  private boolean checkCoreApk()
  {
    if (!new File(XWalkEnvironment.getDownloadApkPath(this.mApkVersion)).exists())
    {
      Log.e("XWalkLib", "checkCoreApk apk not exists");
      this.mCoreStatus = 9;
      return false;
    }
    Log.i("XWalkLib", "XWalk checkCoreApk matched");
    return true;
  }
  
  private boolean checkCoreArchitecture()
  {
    for (;;)
    {
      try
      {
        ReflectMethod localReflectMethod = new ReflectMethod(getBridgeClass("XWalkViewDelegate"), "loadXWalkLibrary", new Class[] { Context.class, String.class });
        String str = null;
        if (this.mBridgeContext != null)
        {
          if (Build.VERSION.SDK_INT < 17) {
            str = "/data/data/" + this.mBridgeContext.getPackageName() + "/lib";
          }
          bool = ((Boolean)localReflectMethod.invoke(new Object[] { this.mBridgeContext, str })).booleanValue();
          if (!bool)
          {
            Log.d("XWalkLib", "Mismatch of CPU architecture");
            this.mCoreStatus = 6;
            return false;
          }
        }
        else
        {
          if (this.mWrapperContext == null) {
            break label208;
          }
          str = XWalkEnvironment.getExtractedCoreDir(this.mApkVersion);
          bool = ((Boolean)localReflectMethod.invoke(new Object[] { this.mBridgeContext, str })).booleanValue();
          continue;
        }
        Log.d("XWalkLib", "XWalk core architecture matched");
      }
      catch (RuntimeException localRuntimeException)
      {
        Log.d("XWalkLib", localRuntimeException.getLocalizedMessage());
        if ((localRuntimeException.getCause() instanceof UnsatisfiedLinkError))
        {
          this.mCoreStatus = 6;
          return false;
        }
        this.mCoreStatus = 5;
        return false;
      }
      return true;
      label208:
      boolean bool = false;
    }
  }
  
  private boolean checkCorePackage(String paramString)
  {
    try
    {
      this.mBridgeContext = this.mWrapperContext.createPackageContext(paramString, 3);
      Log.d("XWalkLib", "Created package context for " + paramString);
      return true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.d("XWalkLib", paramString + " not found");
    }
    return false;
  }
  
  public static void dockXWalkCore()
  {
    Assert.assertNotNull(sProvisionalInstance);
    Assert.assertNull(sInstance);
    Log.d("XWalkLib", "Dock xwalk core");
    sInstance = sProvisionalInstance;
    sProvisionalInstance = null;
    sInstance.initCoreBridge();
  }
  
  private boolean findDownloadedCore()
  {
    this.mBridgeLoader = getBridgeLoader();
    if ((this.mBridgeLoader == null) || (!checkCoreVersion()) || (!checkCoreArchitecture()) || (!checkCoreApk()))
    {
      this.mBridgeLoader = null;
      return false;
    }
    Log.d("XWalkLib", "Running in downloaded mode");
    this.mCoreStatus = 1;
    return true;
  }
  
  public static int getCoreStatus()
  {
    if (sInstance != null) {
      return sInstance.mCoreStatus;
    }
    if (sProvisionalInstance == null) {
      return 0;
    }
    return sProvisionalInstance.mCoreStatus;
  }
  
  public static XWalkCoreWrapper getInstance()
  {
    return sInstance;
  }
  
  public static void handlePostInit(String paramString)
  {
    Log.d("XWalkLib", "Post init xwalk core in " + paramString);
    if (!sReservedActions.containsKey(paramString)) {
      return;
    }
    LinkedList localLinkedList = (LinkedList)sReservedActions.get(paramString);
    while (localLinkedList.size() != 0)
    {
      ReservedAction localReservedAction = (ReservedAction)localLinkedList.pop();
      if (localReservedAction.mObject != null)
      {
        Log.d("XWalkLib", "Init reserved object: " + localReservedAction.mObject.getClass());
        new ReflectMethod(localReservedAction.mObject, "reflectionInit", new Class[0]).invoke(new Object[0]);
      }
      else if (localReservedAction.mClass != null)
      {
        Log.d("XWalkLib", "Init reserved class: " + localReservedAction.mClass.toString());
        new ReflectMethod(localReservedAction.mClass, "reflectionInit", new Class[0]).invoke(new Object[0]);
      }
      else
      {
        Log.d("XWalkLib", "Call reserved method: " + localReservedAction.mMethod.toString());
        Object[] arrayOfObject = localReservedAction.mArguments;
        if (arrayOfObject != null)
        {
          int i = 0;
          while (i < arrayOfObject.length)
          {
            if ((arrayOfObject[i] instanceof ReflectMethod)) {
              arrayOfObject[i] = ((ReflectMethod)arrayOfObject[i]).invokeWithArguments();
            }
            i += 1;
          }
        }
        localReservedAction.mMethod.invoke(arrayOfObject);
      }
    }
    sReservedActions.remove(paramString);
    sReservedActivities.remove(paramString);
  }
  
  public static void handlePreInit(String paramString)
  {
    if (sInstance != null) {
      return;
    }
    Log.d("XWalkLib", "Pre init xwalk core in " + paramString);
    if (sReservedActions.containsKey(paramString)) {
      sReservedActions.remove(paramString);
    }
    for (;;)
    {
      sReservedActions.put(paramString, new LinkedList());
      return;
      sReservedActivities.add(paramString);
    }
  }
  
  public static void handleRuntimeError(RuntimeException paramRuntimeException)
  {
    Log.e("XWalkLib", "This API is incompatible with the Crosswalk runtime library");
  }
  
  private byte[] hexStringToByteArray(String paramString)
  {
    if ((paramString == null) || (paramString.isEmpty()) || (paramString.length() % 2 != 0)) {
      return null;
    }
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    int i = 0;
    while (i < paramString.length())
    {
      int j = Character.digit(paramString.charAt(i), 16);
      int k = Character.digit(paramString.charAt(i + 1), 16);
      arrayOfByte[(i / 2)] = ((byte)((j << 4) + k));
      i += 2;
    }
    return arrayOfByte;
  }
  
  private void initCoreBridge()
  {
    Log.d("XWalkLib", "Init core bridge");
    new ReflectMethod(getBridgeClass("XWalkCoreBridge"), "init", new Class[] { Context.class, Object.class }).invoke(new Object[] { this.mBridgeContext, this });
  }
  
  public static void initEmbeddedMode()
  {
    if ((sInstance != null) || (!sReservedActivities.isEmpty())) {
      return;
    }
    throw new RuntimeException("royle:downloadmode should not goto this");
  }
  
  private void initXWalkView()
  {
    Log.d("XWalkLib", "Init xwalk view");
    new ReflectMethod(getBridgeClass("XWalkViewDelegate"), "init", new Class[] { Context.class, Context.class }).invoke(new Object[] { this.mBridgeContext, this.mWrapperContext });
  }
  
  public static void reserveReflectClass(Class<?> paramClass)
  {
    String str = (String)sReservedActivities.getLast();
    Log.d("XWalkLib", "Reserve class " + paramClass.toString() + " to " + str);
    ((LinkedList)sReservedActions.get(str)).add(new ReservedAction(paramClass));
  }
  
  public static void reserveReflectMethod(ReflectMethod paramReflectMethod)
  {
    String str = (String)sReservedActivities.getLast();
    Log.d("XWalkLib", "Reserve method " + paramReflectMethod.toString() + " to " + str);
    ((LinkedList)sReservedActions.get(str)).add(new ReservedAction(paramReflectMethod));
  }
  
  public static void reserveReflectObject(Object paramObject)
  {
    String str = (String)sReservedActivities.getLast();
    Log.d("XWalkLib", "Reserve object " + paramObject.getClass() + " to " + str);
    ((LinkedList)sReservedActions.get(str)).add(new ReservedAction(paramObject));
  }
  
  private boolean verifyPackageInfo(PackageInfo paramPackageInfo, String paramString1, String paramString2)
  {
    if (paramPackageInfo.signatures == null) {
      Log.e("XWalkLib", "No signature in package info");
    }
    for (;;)
    {
      return false;
      try
      {
        paramString1 = MessageDigest.getInstance(paramString1);
        paramString2 = hexStringToByteArray(paramString2);
        if (paramString2 == null) {
          throw new IllegalArgumentException("Invalid hash code");
        }
      }
      catch (NoSuchAlgorithmException paramPackageInfo)
      {
        throw new IllegalArgumentException("Invalid hash algorithm");
        int i = 0;
        while (i < paramPackageInfo.signatures.length)
        {
          Log.d("XWalkLib", "Checking signature " + i);
          if (MessageDigest.isEqual(paramString1.digest(paramPackageInfo.signatures[i].toByteArray()), paramString2)) {
            break label129;
          }
          Log.e("XWalkLib", "Hash code does not match");
          i += 1;
        }
        Log.d("XWalkLib", "Signature passed verification");
        return true;
      }
      catch (NullPointerException paramPackageInfo)
      {
        label129:
        for (;;) {}
      }
    }
  }
  
  public boolean checkCoreVersion()
  {
    Log.d("XWalkLib", "[Environment] SDK:" + Build.VERSION.SDK_INT);
    Log.d("XWalkLib", "[App Version] build:24.53.595.0, api:" + this.mApiVersion + ", min_api:" + this.mMinApiVersion);
    try
    {
      localClass = getBridgeClass("XWalkCoreVersion");
      localObject = "";
    }
    catch (RuntimeException localRuntimeException1)
    {
      Class localClass;
      Object localObject;
      String str;
      label98:
      int i;
      int j;
      Log.d("XWalkLib", "XWalk core not found");
      this.mCoreStatus = 2;
      return false;
    }
    try
    {
      str = (String)new ReflectField(localClass, "XWALK_BUILD_VERSION").get();
      localObject = str;
    }
    catch (RuntimeException localRuntimeException2)
    {
      break label98;
    }
    i = ((Integer)new ReflectField(localClass, "API_VERSION").get()).intValue();
    j = ((Integer)new ReflectField(localClass, "MIN_API_VERSION").get()).intValue();
    Log.d("XWalkLib", "[Lib Version] build:" + (String)localObject + ", api:" + i + ", min_api:" + j);
    if ((XWalkEnvironment.isDownloadMode()) && (XWalkEnvironment.isDownloadModeUpdate()) && (!((String)localObject).isEmpty()) && (!((String)localObject).equals("24.53.595.0")))
    {
      this.mCoreStatus = 8;
      return false;
    }
    if (this.mMinApiVersion > i)
    {
      this.mCoreStatus = 3;
      return false;
    }
    if (this.mApiVersion < j)
    {
      this.mCoreStatus = 4;
      return false;
    }
    Log.d("XWalkLib", "XWalk core version matched");
    return true;
  }
  
  public int getApkVersion()
  {
    Object localObject = getBridgeLoader();
    if (localObject == null) {}
    for (;;)
    {
      return 0;
      try
      {
        localObject = ((DexClassLoader)localObject).loadClass("org.xwalk.core.internal.XWalkCoreVersion");
        if (localObject == null) {
          continue;
        }
        try
        {
          i = ((Integer)new ReflectField((Class)localObject, "XWALK_APK_VERSION").get()).intValue();
          return i;
        }
        catch (RuntimeException localRuntimeException)
        {
          for (;;)
          {
            int i = 0;
          }
        }
        return 0;
      }
      catch (ClassNotFoundException localClassNotFoundException) {}
    }
  }
  
  public Class<?> getBridgeClass(String paramString)
  {
    try
    {
      paramString = this.mBridgeLoader.loadClass("org.xwalk.core.internal." + paramString);
      return paramString;
    }
    catch (ClassNotFoundException paramString) {}
    return null;
  }
  
  public DexClassLoader getBridgeLoader()
  {
    if (this.sBridgeLoader != null) {
      return this.sBridgeLoader;
    }
    String str1 = XWalkEnvironment.getExtractedCoreDir(this.mApkVersion);
    String str2 = XWalkEnvironment.getClassDexFilePath(this.mApkVersion);
    if (!new File(str2).exists()) {
      return null;
    }
    this.sBridgeLoader = new DexClassLoader(str2, XWalkEnvironment.getOptimizedDexDir(this.mApkVersion), str1, ClassLoader.getSystemClassLoader());
    return this.sBridgeLoader;
  }
  
  public Object getBridgeObject(Object paramObject)
  {
    try
    {
      paramObject = new ReflectMethod(paramObject, "getBridge", new Class[0]).invoke(new Object[0]);
      return paramObject;
    }
    catch (RuntimeException paramObject) {}
    return null;
  }
  
  public Object getWrapperObject(Object paramObject)
  {
    try
    {
      paramObject = new ReflectMethod(paramObject, "getWrapper", new Class[0]).invoke(new Object[0]);
      return paramObject;
    }
    catch (RuntimeException paramObject) {}
    return null;
  }
  
  public boolean isDownLoadCoreAvailable()
  {
    Object localObject = getBridgeLoader();
    if (localObject == null) {}
    for (;;)
    {
      return false;
      try
      {
        localObject = ((DexClassLoader)localObject).loadClass("org.xwalk.core.internal.XWalkCoreVersion");
        if (localObject != null) {
          return true;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException) {}
    }
    return false;
  }
  
  public boolean isSharedMode()
  {
    return this.mBridgeContext != null;
  }
  
  private static class ReservedAction
  {
    Object[] mArguments;
    Class<?> mClass;
    ReflectMethod mMethod;
    Object mObject;
    
    ReservedAction(Class<?> paramClass)
    {
      this.mClass = paramClass;
    }
    
    ReservedAction(Object paramObject)
    {
      this.mObject = paramObject;
    }
    
    ReservedAction(ReflectMethod paramReflectMethod)
    {
      this.mMethod = paramReflectMethod;
      if (paramReflectMethod.getArguments() != null) {
        this.mArguments = Arrays.copyOf(paramReflectMethod.getArguments(), paramReflectMethod.getArguments().length);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\org\xwalk\core\XWalkCoreWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */