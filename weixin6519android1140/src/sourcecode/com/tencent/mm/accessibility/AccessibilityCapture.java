package com.tencent.mm.accessibility;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class AccessibilityCapture
{
  public static final long EVENT_MIN_INTERVAL = 1000L;
  private static final String INTERFACE_IACCESSIBILITYMANAGER = "android.view.accessibility.IAccessibilityManager";
  private static final String INTERFACE_IACCESSIBILITYMANAGERCLIENT = "android.view.accessibility.IAccessibilityManagerClient";
  private static final int STATE_FLAG_ACCESSIBILITY_ENABLED = 1;
  private static final String TAG = "MicroMsg.AccessibilityCapture";
  private static Field enableField;
  private static IAccessibilityManagerInvocationHandler iAccessibilityManagerInvocationHandler;
  public static Field idField;
  private static long lastEventTime;
  private static int lastEventType;
  public static APIProvider mAPIProvider;
  private static boolean mEnable;
  public static boolean mForwardEnable;
  private static AccessibilityManager mManager;
  private static Class<AccessibilityManager> managerClass;
  
  static
  {
    GMTrace.i(15222169403392L, 113414);
    mEnable = false;
    lastEventTime = 0L;
    lastEventType = 0;
    managerClass = AccessibilityManager.class;
    iAccessibilityManagerInvocationHandler = null;
    GMTrace.o(15222169403392L, 113414);
  }
  
  private AccessibilityCapture()
  {
    GMTrace.i(15219619266560L, 113395);
    throw new UnsupportedOperationException("You should instantiate this class");
  }
  
  @TargetApi(16)
  public static void disableAccessibilityCapture(Context paramContext)
  {
    GMTrace.i(15220290355200L, 113400);
    try
    {
      mAPIProvider.d("MicroMsg.AccessibilityCapture", "accessibility set up start time: %d", new Object[] { Long.valueOf(SystemClock.elapsedRealtime()) });
      Field localField1 = AccessibilityManager.class.getDeclaredField("mService");
      localField1.setAccessible(true);
      Object localObject1 = AccessibilityManager.class.getDeclaredField("sInstance");
      ((Field)localObject1).setAccessible(true);
      Field localField2 = AccessibilityManager.class.getDeclaredField("mLock");
      localField2.setAccessible(true);
      Object localObject3 = (AccessibilityManager)((Field)localObject1).get(null);
      localObject1 = localObject3;
      if (localObject3 == null) {
        localObject1 = (AccessibilityManager)AccessibilityManager.class.getDeclaredMethod("getInstance", new Class[] { Context.class }).invoke(null, new Object[] { paramContext.getApplicationContext() });
      }
      paramContext = localField2.get(mManager);
      localObject3 = AccessibilityManager.class.getDeclaredField("mIsEnabled");
      ((Field)localObject3).setAccessible(true);
      if (paramContext == null)
      {
        mAPIProvider.i("MicroMsg.AccessibilityCapture", "need to set disable,mLock is null.", new Object[0]);
        ((Field)localObject3).set(localObject1, Boolean.valueOf(false));
        if (iAccessibilityManagerInvocationHandler != null) {
          localField1.set(localObject1, iAccessibilityManagerInvocationHandler.getOriginalInstance());
        }
      }
      for (;;)
      {
        mEnable = false;
        mAPIProvider.d("MicroMsg.AccessibilityCapture", "accessibility set up end time: %d", new Object[] { Long.valueOf(SystemClock.elapsedRealtime()) });
        mAPIProvider.i("MicroMsg.AccessibilityCapture", "accessibility disabled", new Object[0]);
        GMTrace.o(15220290355200L, 113400);
        return;
        mAPIProvider.i("MicroMsg.AccessibilityCapture", "need to set disable,mLock is not null.", new Object[0]);
        try
        {
          ((Field)localObject3).set(localObject1, Boolean.valueOf(false));
          if (iAccessibilityManagerInvocationHandler != null) {
            localField1.set(localObject1, iAccessibilityManagerInvocationHandler.getOriginalInstance());
          }
        }
        finally {}
      }
      return;
    }
    catch (Throwable paramContext)
    {
      mAPIProvider.printErrStackTrace("MicroMsg.AccessibilityCapture", paramContext, "failed to disable accessibility", new Object[0]);
      GMTrace.o(15220290355200L, 113400);
    }
  }
  
  @TargetApi(16)
  public static void enableAccessibilityCapture(Context paramContext, APIProvider paramAPIProvider)
  {
    GMTrace.i(15220021919744L, 113398);
    try
    {
      mAPIProvider = paramAPIProvider;
      paramAPIProvider.d("MicroMsg.AccessibilityCapture", "accessibility set up start time: %d", new Object[] { Long.valueOf(SystemClock.elapsedRealtime()) });
      if (idField == null)
      {
        paramAPIProvider = View.class.getDeclaredField("mAccessibilityViewId");
        idField = paramAPIProvider;
        paramAPIProvider.setAccessible(true);
      }
      Object localObject = AccessibilityManager.class.getDeclaredField("sInstance");
      ((Field)localObject).setAccessible(true);
      paramAPIProvider = AccessibilityManager.class.getDeclaredField("mLock");
      paramAPIProvider.setAccessible(true);
      localObject = (AccessibilityManager)((Field)localObject).get(null);
      mManager = (AccessibilityManager)localObject;
      if (localObject == null) {
        mManager = (AccessibilityManager)AccessibilityManager.class.getDeclaredMethod("getInstance", new Class[] { Context.class }).invoke(null, new Object[] { paramContext.getApplicationContext() });
      }
      paramContext = paramAPIProvider.get(mManager);
      if (paramContext == null)
      {
        mAPIProvider.i("MicroMsg.AccessibilityCapture", "need to set enable,mLock is null.", new Object[0]);
        setAccessibilityEnable();
      }
      for (;;)
      {
        mAPIProvider.d("MicroMsg.AccessibilityCapture", "accessibility set up end time: %d", new Object[] { Long.valueOf(SystemClock.elapsedRealtime()) });
        mAPIProvider.i("MicroMsg.AccessibilityCapture", "accessibility enabled", new Object[0]);
        GMTrace.o(15220021919744L, 113398);
        return;
        mAPIProvider.i("MicroMsg.AccessibilityCapture", "need to set enable,mLock is not null.", new Object[0]);
        try
        {
          setAccessibilityEnable();
        }
        finally {}
      }
      return;
    }
    catch (Throwable paramContext)
    {
      mAPIProvider.printErrStackTrace("MicroMsg.AccessibilityCapture", paramContext, "failed to enable accessibility", new Object[0]);
      GMTrace.o(15220021919744L, 113398);
    }
  }
  
  public static boolean filter(AccessibilityEvent paramAccessibilityEvent)
  {
    int i = 1;
    GMTrace.i(15220558790656L, 113402);
    int j = paramAccessibilityEvent.getEventType();
    boolean bool1;
    boolean bool2;
    if ((j == 1) || (j == 2) || (j == 4096) || (j == 4) || (j == 8192))
    {
      bool1 = true;
      bool2 = bool1;
      if (Build.VERSION.SDK_INT >= 23) {
        if (j != 8388608) {
          break label84;
        }
      }
    }
    for (;;)
    {
      bool2 = bool1 | i;
      GMTrace.o(15220558790656L, 113402);
      return bool2;
      bool1 = false;
      break;
      label84:
      i = 0;
    }
  }
  
  public static boolean filterEventMerged(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(15220693008384L, 113403);
    if ((paramAccessibilityEvent.getEventTime() - lastEventTime < 1000L) && (paramAccessibilityEvent.getEventType() == 4096))
    {
      GMTrace.o(15220693008384L, 113403);
      return false;
    }
    if ((lastEventType == 8192) && (paramAccessibilityEvent.getEventType() == 8192))
    {
      GMTrace.o(15220693008384L, 113403);
      return false;
    }
    lastEventTime = paramAccessibilityEvent.getEventTime();
    lastEventType = paramAccessibilityEvent.getEventType();
    GMTrace.o(15220693008384L, 113403);
    return true;
  }
  
  public static boolean isEnable()
  {
    GMTrace.i(15219753484288L, 113396);
    boolean bool = mEnable;
    GMTrace.o(15219753484288L, 113396);
    return bool;
  }
  
  public static void logTarget(AccessibilityEvent paramAccessibilityEvent, View paramView, long paramLong)
  {
    GMTrace.i(15220827226112L, 113404);
    Activity localActivity = Util.getActivityOfView(paramView);
    APIProvider localAPIProvider = mAPIProvider;
    String str2 = AccessibilityEvent.eventTypeToString(paramAccessibilityEvent.getEventType());
    String str3 = Util.getViewIdName(paramView).trim();
    if (localActivity == null) {}
    for (String str1 = "unknown";; str1 = localActivity.getClass().getName())
    {
      localAPIProvider.i("MicroMsg.AccessibilityCapture", "Event: %s, View's id: %s, Activity: %s, Time: %s", new Object[] { str2, str3, str1, Long.valueOf(paramAccessibilityEvent.getEventTime()) });
      mAPIProvider.onEvent(new Event(paramAccessibilityEvent, paramView, localActivity, paramLong));
      GMTrace.o(15220827226112L, 113404);
      return;
    }
  }
  
  private static void notifyListeners(boolean paramBoolean)
  {
    GMTrace.i(15220156137472L, 113399);
    try
    {
      Object localObject = AccessibilityManager.class.getDeclaredField("mAccessibilityStateChangeListeners");
      ((Field)localObject).setAccessible(true);
      localObject = ((CopyOnWriteArrayList)((Field)localObject).get(mManager)).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((AccessibilityManager.AccessibilityStateChangeListener)((Iterator)localObject).next()).onAccessibilityStateChanged(paramBoolean);
      }
      GMTrace.o(15220156137472L, 113399);
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(15220156137472L, 113399);
      return;
    }
  }
  
  public static void post(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(15220424572928L, 113401);
    long l = SystemClock.elapsedRealtime();
    mAPIProvider.d("MicroMsg.AccessibilityCapture", "[oneliang]before post event:event time" + paramAccessibilityEvent.getEventTime() + ",elspsed time:" + l, new Object[0]);
    mAPIProvider.post(new ViewSearchTask(paramAccessibilityEvent, l), "AccessibilityCapture search event's view");
    GMTrace.o(15220424572928L, 113401);
  }
  
  /* Error */
  private static void setAccessibilityEnable()
  {
    // Byte code:
    //   0: ldc2_w 353
    //   3: ldc_w 355
    //   6: invokestatic 68	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: getstatic 357	com/tencent/mm/accessibility/AccessibilityCapture:enableField	Ljava/lang/reflect/Field;
    //   12: ifnonnull +21 -> 33
    //   15: getstatic 78	com/tencent/mm/accessibility/AccessibilityCapture:managerClass	Ljava/lang/Class;
    //   18: ldc -85
    //   20: invokevirtual 135	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   23: astore_1
    //   24: aload_1
    //   25: putstatic 357	com/tencent/mm/accessibility/AccessibilityCapture:enableField	Ljava/lang/reflect/Field;
    //   28: aload_1
    //   29: iconst_1
    //   30: invokevirtual 141	java/lang/reflect/Field:setAccessible	(Z)V
    //   33: getstatic 357	com/tencent/mm/accessibility/AccessibilityCapture:enableField	Ljava/lang/reflect/Field;
    //   36: getstatic 169	com/tencent/mm/accessibility/AccessibilityCapture:mManager	Landroid/view/accessibility/AccessibilityManager;
    //   39: iconst_1
    //   40: invokestatic 180	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   43: invokevirtual 184	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   46: getstatic 78	com/tencent/mm/accessibility/AccessibilityCapture:managerClass	Ljava/lang/Class;
    //   49: ldc -127
    //   51: invokevirtual 135	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   54: astore_3
    //   55: aload_3
    //   56: iconst_1
    //   57: invokevirtual 141	java/lang/reflect/Field:setAccessible	(Z)V
    //   60: new 17	com/tencent/mm/accessibility/AccessibilityCapture$IAccessibilityManagerInvocationHandler
    //   63: dup
    //   64: aload_3
    //   65: getstatic 169	com/tencent/mm/accessibility/AccessibilityCapture:mManager	Landroid/view/accessibility/AccessibilityManager;
    //   68: invokevirtual 149	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   71: invokespecial 360	com/tencent/mm/accessibility/AccessibilityCapture$IAccessibilityManagerInvocationHandler:<init>	(Ljava/lang/Object;)V
    //   74: putstatic 80	com/tencent/mm/accessibility/AccessibilityCapture:iAccessibilityManagerInvocationHandler	Lcom/tencent/mm/accessibility/AccessibilityCapture$IAccessibilityManagerInvocationHandler;
    //   77: ldc 31
    //   79: invokestatic 364	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   82: astore_1
    //   83: ldc 2
    //   85: invokevirtual 368	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   88: astore_2
    //   89: getstatic 80	com/tencent/mm/accessibility/AccessibilityCapture:iAccessibilityManagerInvocationHandler	Lcom/tencent/mm/accessibility/AccessibilityCapture$IAccessibilityManagerInvocationHandler;
    //   92: astore 4
    //   94: aload_2
    //   95: iconst_1
    //   96: anewarray 131	java/lang/Class
    //   99: dup
    //   100: iconst_0
    //   101: aload_1
    //   102: aastore
    //   103: aload 4
    //   105: invokestatic 374	java/lang/reflect/Proxy:newProxyInstance	(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    //   108: astore_2
    //   109: aload_3
    //   110: getstatic 169	com/tencent/mm/accessibility/AccessibilityCapture:mManager	Landroid/view/accessibility/AccessibilityManager;
    //   113: aload_2
    //   114: invokevirtual 184	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   117: iconst_1
    //   118: putstatic 70	com/tencent/mm/accessibility/AccessibilityCapture:mEnable	Z
    //   121: ldc 34
    //   123: invokestatic 364	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   126: astore_3
    //   127: getstatic 239	android/os/Build$VERSION:SDK_INT	I
    //   130: bipush 17
    //   132: if_icmple +212 -> 344
    //   135: getstatic 78	com/tencent/mm/accessibility/AccessibilityCapture:managerClass	Ljava/lang/Class;
    //   138: ldc_w 376
    //   141: invokevirtual 135	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   144: astore 4
    //   146: aload 4
    //   148: iconst_1
    //   149: invokevirtual 141	java/lang/reflect/Field:setAccessible	(Z)V
    //   152: aload 4
    //   154: getstatic 169	com/tencent/mm/accessibility/AccessibilityCapture:mManager	Landroid/view/accessibility/AccessibilityManager;
    //   157: invokevirtual 149	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   160: checkcast 378	java/lang/Integer
    //   163: invokevirtual 381	java/lang/Integer:intValue	()I
    //   166: istore_0
    //   167: new 14	com/tencent/mm/accessibility/AccessibilityCapture$IAccessibilityManagerClientInvocationHandler
    //   170: dup
    //   171: invokespecial 382	com/tencent/mm/accessibility/AccessibilityCapture$IAccessibilityManagerClientInvocationHandler:<init>	()V
    //   174: astore 4
    //   176: ldc 2
    //   178: invokevirtual 368	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   181: iconst_1
    //   182: anewarray 131	java/lang/Class
    //   185: dup
    //   186: iconst_0
    //   187: aload_3
    //   188: aastore
    //   189: aload 4
    //   191: invokestatic 374	java/lang/reflect/Proxy:newProxyInstance	(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    //   194: astore 4
    //   196: aload_1
    //   197: ldc_w 384
    //   200: iconst_2
    //   201: anewarray 131	java/lang/Class
    //   204: dup
    //   205: iconst_0
    //   206: aload_3
    //   207: aastore
    //   208: dup
    //   209: iconst_1
    //   210: getstatic 387	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   213: aastore
    //   214: invokevirtual 390	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   217: aload_2
    //   218: iconst_2
    //   219: anewarray 4	java/lang/Object
    //   222: dup
    //   223: iconst_0
    //   224: aload 4
    //   226: aastore
    //   227: dup
    //   228: iconst_1
    //   229: iload_0
    //   230: invokestatic 393	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   233: aastore
    //   234: invokevirtual 167	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   237: astore_1
    //   238: aload_1
    //   239: ifnull +46 -> 285
    //   242: aload_1
    //   243: instanceof 378
    //   246: ifeq +39 -> 285
    //   249: aload_1
    //   250: checkcast 378	java/lang/Integer
    //   253: invokevirtual 381	java/lang/Integer:intValue	()I
    //   256: istore_0
    //   257: getstatic 109	com/tencent/mm/accessibility/AccessibilityCapture:mAPIProvider	Lcom/tencent/mm/accessibility/AccessibilityCapture$APIProvider;
    //   260: ldc 40
    //   262: ldc_w 395
    //   265: iconst_1
    //   266: anewarray 4	java/lang/Object
    //   269: dup
    //   270: iconst_0
    //   271: iload_0
    //   272: invokestatic 393	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   275: aastore
    //   276: invokeinterface 175 4 0
    //   281: iload_0
    //   282: invokestatic 399	com/tencent/mm/accessibility/AccessibilityCapture:updateState	(I)V
    //   285: ldc2_w 353
    //   288: ldc_w 355
    //   291: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   294: return
    //   295: astore_1
    //   296: getstatic 109	com/tencent/mm/accessibility/AccessibilityCapture:mAPIProvider	Lcom/tencent/mm/accessibility/AccessibilityCapture$APIProvider;
    //   299: ldc 40
    //   301: ldc_w 401
    //   304: iconst_1
    //   305: anewarray 4	java/lang/Object
    //   308: dup
    //   309: iconst_0
    //   310: aload_1
    //   311: aastore
    //   312: invokeinterface 404 4 0
    //   317: getstatic 406	com/tencent/mm/accessibility/AccessibilityCapture:mForwardEnable	Z
    //   320: ifne +16 -> 336
    //   323: getstatic 357	com/tencent/mm/accessibility/AccessibilityCapture:enableField	Ljava/lang/reflect/Field;
    //   326: getstatic 169	com/tencent/mm/accessibility/AccessibilityCapture:mManager	Landroid/view/accessibility/AccessibilityManager;
    //   329: iconst_0
    //   330: invokestatic 180	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   333: invokevirtual 184	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   336: new 408	com/tencent/mm/accessibility/AccessibilityCaptureNotSupportException
    //   339: dup
    //   340: invokespecial 409	com/tencent/mm/accessibility/AccessibilityCaptureNotSupportException:<init>	()V
    //   343: athrow
    //   344: new 14	com/tencent/mm/accessibility/AccessibilityCapture$IAccessibilityManagerClientInvocationHandler
    //   347: dup
    //   348: invokespecial 382	com/tencent/mm/accessibility/AccessibilityCapture$IAccessibilityManagerClientInvocationHandler:<init>	()V
    //   351: astore 4
    //   353: ldc 2
    //   355: invokevirtual 368	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   358: iconst_1
    //   359: anewarray 131	java/lang/Class
    //   362: dup
    //   363: iconst_0
    //   364: aload_3
    //   365: aastore
    //   366: aload 4
    //   368: invokestatic 374	java/lang/reflect/Proxy:newProxyInstance	(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    //   371: astore 4
    //   373: aload_1
    //   374: ldc_w 384
    //   377: iconst_2
    //   378: anewarray 131	java/lang/Class
    //   381: dup
    //   382: iconst_0
    //   383: aload_3
    //   384: aastore
    //   385: dup
    //   386: iconst_1
    //   387: getstatic 387	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   390: aastore
    //   391: invokevirtual 390	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   394: aload_2
    //   395: iconst_1
    //   396: anewarray 4	java/lang/Object
    //   399: dup
    //   400: iconst_0
    //   401: aload 4
    //   403: aastore
    //   404: invokevirtual 167	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   407: astore_1
    //   408: aload_1
    //   409: ifnull +46 -> 455
    //   412: aload_1
    //   413: instanceof 378
    //   416: ifeq +39 -> 455
    //   419: aload_1
    //   420: checkcast 378	java/lang/Integer
    //   423: invokevirtual 381	java/lang/Integer:intValue	()I
    //   426: istore_0
    //   427: getstatic 109	com/tencent/mm/accessibility/AccessibilityCapture:mAPIProvider	Lcom/tencent/mm/accessibility/AccessibilityCapture$APIProvider;
    //   430: ldc 40
    //   432: ldc_w 411
    //   435: iconst_1
    //   436: anewarray 4	java/lang/Object
    //   439: dup
    //   440: iconst_0
    //   441: iload_0
    //   442: invokestatic 393	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   445: aastore
    //   446: invokeinterface 175 4 0
    //   451: iload_0
    //   452: invokestatic 399	com/tencent/mm/accessibility/AccessibilityCapture:updateState	(I)V
    //   455: ldc2_w 353
    //   458: ldc_w 355
    //   461: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   464: return
    //   465: astore_1
    //   466: getstatic 109	com/tencent/mm/accessibility/AccessibilityCapture:mAPIProvider	Lcom/tencent/mm/accessibility/AccessibilityCapture$APIProvider;
    //   469: ldc 40
    //   471: aload_1
    //   472: new 327	java/lang/StringBuilder
    //   475: dup
    //   476: ldc_w 413
    //   479: invokespecial 330	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   482: aload_1
    //   483: invokevirtual 416	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   486: invokevirtual 339	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   489: invokevirtual 342	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   492: iconst_0
    //   493: anewarray 4	java/lang/Object
    //   496: invokeinterface 200 5 0
    //   501: iconst_1
    //   502: putstatic 406	com/tencent/mm/accessibility/AccessibilityCapture:mForwardEnable	Z
    //   505: ldc2_w 353
    //   508: ldc_w 355
    //   511: invokestatic 83	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   514: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   166	286	0	i	int
    //   23	227	1	localObject1	Object
    //   295	79	1	localException	Exception
    //   407	13	1	localObject2	Object
    //   465	18	1	localThrowable	Throwable
    //   88	307	2	localObject3	Object
    //   54	330	3	localObject4	Object
    //   92	310	4	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   109	117	295	java/lang/Exception
    //   121	238	465	java/lang/Throwable
    //   242	285	465	java/lang/Throwable
    //   285	294	465	java/lang/Throwable
    //   344	408	465	java/lang/Throwable
    //   412	455	465	java/lang/Throwable
  }
  
  public static void updateState(int paramInt)
  {
    GMTrace.i(15220961443840L, 113405);
    if ((paramInt & 0x1) != 0) {}
    for (paramInt = 1; paramInt != 0; paramInt = 0)
    {
      notifyListeners(true);
      mForwardEnable = true;
      GMTrace.o(15220961443840L, 113405);
      return;
    }
    mForwardEnable = false;
    GMTrace.o(15220961443840L, 113405);
  }
  
  public static abstract interface APIProvider
  {
    public abstract void d(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void e(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void i(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void onEvent(AccessibilityCapture.Event paramEvent);
    
    public abstract void post(Runnable paramRunnable, String paramString);
    
    public abstract void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs);
    
    public abstract void v(String paramString1, String paramString2, Object... paramVarArgs);
  }
  
  public static class Event
  {
    public final Activity activity;
    public final long elapsedTime;
    public final AccessibilityEvent event;
    public final View view;
    
    public Event(AccessibilityEvent paramAccessibilityEvent, View paramView, Activity paramActivity, long paramLong)
    {
      GMTrace.i(15228343418880L, 113460);
      this.event = paramAccessibilityEvent;
      this.view = paramView;
      this.activity = paramActivity;
      this.elapsedTime = paramLong;
      GMTrace.o(15228343418880L, 113460);
    }
  }
  
  private static class IAccessibilityManagerClientInvocationHandler
    implements InvocationHandler
  {
    public IAccessibilityManagerClientInvocationHandler()
    {
      GMTrace.i(17477698322432L, 130219);
      GMTrace.o(17477698322432L, 130219);
    }
    
    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      GMTrace.i(17477832540160L, 130220);
      paramObject = paramMethod.getName();
      paramMethod = paramMethod.getParameterTypes();
      if ((((String)paramObject).equals("setState")) && (paramMethod.length == 1) && (paramMethod[0].equals(Integer.TYPE)))
      {
        paramObject = paramArrayOfObject[0];
        if ((paramObject == null) || (!(paramObject instanceof Integer)))
        {
          GMTrace.o(17477832540160L, 130220);
          return null;
        }
        int i = ((Integer)paramObject).intValue();
        AccessibilityCapture.mAPIProvider.i("MicroMsg.AccessibilityCapture", "setState %d", new Object[] { Integer.valueOf(i) });
        AccessibilityCapture.updateState(i);
      }
      GMTrace.o(17477832540160L, 130220);
      return null;
    }
  }
  
  private static class IAccessibilityManagerInvocationHandler
    implements InvocationHandler
  {
    private final Object originalInstance;
    
    public IAccessibilityManagerInvocationHandler(Object paramObject)
    {
      GMTrace.i(17477295669248L, 130216);
      this.originalInstance = paramObject;
      GMTrace.o(17477295669248L, 130216);
    }
    
    public Object getOriginalInstance()
    {
      GMTrace.i(17477564104704L, 130218);
      Object localObject = this.originalInstance;
      GMTrace.o(17477564104704L, 130218);
      return localObject;
    }
    
    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      GMTrace.i(17477429886976L, 130217);
      paramObject = paramMethod.getName();
      Class[] arrayOfClass = paramMethod.getParameterTypes();
      if ((((String)paramObject).equals("sendAccessibilityEvent")) && (arrayOfClass.length == 2) && (arrayOfClass[0].equals(AccessibilityEvent.class)) && (arrayOfClass[1].equals(Integer.TYPE)))
      {
        paramObject = paramArrayOfObject[0];
        if ((paramObject == null) || (!(paramObject instanceof AccessibilityEvent)))
        {
          GMTrace.o(17477429886976L, 130217);
          return null;
        }
        paramObject = (AccessibilityEvent)paramObject;
        if (AccessibilityCapture.mForwardEnable)
        {
          if ((AccessibilityCapture.filter((AccessibilityEvent)paramObject)) && (AccessibilityCapture.filterEventMerged((AccessibilityEvent)paramObject))) {
            AccessibilityCapture.post(AccessibilityEvent.obtain((AccessibilityEvent)paramObject));
          }
          paramObject = paramMethod.invoke(this.originalInstance, paramArrayOfObject);
          GMTrace.o(17477429886976L, 130217);
          return paramObject;
        }
        if ((AccessibilityCapture.filter((AccessibilityEvent)paramObject)) && (AccessibilityCapture.filterEventMerged((AccessibilityEvent)paramObject)))
        {
          AccessibilityCapture.post((AccessibilityEvent)paramObject);
          GMTrace.o(17477429886976L, 130217);
          return Boolean.valueOf(false);
        }
        AccessibilityCapture.mAPIProvider.v("MicroMsg.AccessibilityCapture", "filter a event: %s", new Object[] { AccessibilityEvent.eventTypeToString(((AccessibilityEvent)paramObject).getEventType()) });
        GMTrace.o(17477429886976L, 130217);
        return Boolean.valueOf(true);
      }
      AccessibilityCapture.mAPIProvider.i("MicroMsg.AccessibilityCapture", "[oneliang]original accessibility instance: %s,method name:%s", new Object[] { this.originalInstance, paramObject });
      if (this.originalInstance != null)
      {
        paramObject = paramMethod.invoke(this.originalInstance, paramArrayOfObject);
        GMTrace.o(17477429886976L, 130217);
        return paramObject;
      }
      GMTrace.o(17477429886976L, 130217);
      return null;
    }
  }
  
  public static class ViewSearchTask
    implements Runnable
  {
    private long elapsedTime;
    private final AccessibilityEvent mEvent;
    
    public ViewSearchTask(AccessibilityEvent paramAccessibilityEvent, long paramLong)
    {
      GMTrace.i(15227806547968L, 113456);
      this.elapsedTime = 0L;
      this.mEvent = paramAccessibilityEvent;
      this.elapsedTime = paramLong;
      GMTrace.o(15227806547968L, 113456);
    }
    
    private int findAccessibilityId()
    {
      GMTrace.i(15227940765696L, 113457);
      try
      {
        Field localField1 = AccessibilityRecord.class.getDeclaredField("mSourceNodeId");
        try
        {
          localField1.setAccessible(true);
          l = ((Long)localField1.get(this.mEvent)).longValue();
          i = (int)l;
        }
        catch (NoSuchFieldException localNoSuchFieldException2)
        {
          for (;;)
          {
            Object localObject;
            try
            {
              Field localField2;
              Field localField3 = AccessibilityNodeInfo.class.getDeclaredField("mSourceNodeId");
              localObject = AccessibilityRecord.class.getDeclaredField("mSealed");
              ((Field)localObject).setAccessible(true);
              ((Field)localObject).set(this.mEvent, Boolean.valueOf(true));
              localObject = this.mEvent.getSource();
              if (localObject == null) {
                throw new AccessibilityIdNotFoundException();
              }
            }
            catch (NoSuchFieldException localNoSuchFieldException3)
            {
              throw new AccessibilityIdNotFoundException(localNoSuchFieldException3);
            }
            localNoSuchFieldException3.setAccessible(true);
            long l = ((Long)localNoSuchFieldException3.get(localObject)).longValue();
            int i = (int)l;
          }
        }
        GMTrace.o(15227940765696L, 113457);
        return i;
      }
      catch (NoSuchFieldException localNoSuchFieldException1)
      {
        for (;;)
        {
          localField2 = AccessibilityRecord.class.getDeclaredField("mSourceViewId");
        }
      }
    }
    
    private View searchViewByAccessibilityId(final int paramInt)
    {
      GMTrace.i(15228209201152L, 113459);
      try
      {
        Object localObject = new ViewSearchTool().findView(new ViewSearchTool.Matcher()
        {
          public boolean match(View paramAnonymousView)
          {
            GMTrace.i(15227672330240L, 113455);
            try
            {
              if (((Integer)AccessibilityCapture.idField.get(paramAnonymousView)).intValue() == paramInt)
              {
                GMTrace.o(15227672330240L, 113455);
                return true;
              }
              GMTrace.o(15227672330240L, 113455);
              return false;
            }
            catch (IllegalAccessException paramAnonymousView)
            {
              GMTrace.o(15227672330240L, 113455);
            }
            return false;
          }
        });
        if ((localObject != null) && (((List)localObject).size() == 1))
        {
          localObject = (View)((List)localObject).get(0);
          GMTrace.o(15228209201152L, 113459);
          return (View)localObject;
        }
      }
      catch (Exception localException)
      {
        AccessibilityCapture.mAPIProvider.e("MicroMsg.AccessibilityCapture", "exception when find root", new Object[] { localException });
        GMTrace.o(15228209201152L, 113459);
        return null;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;) {}
      }
    }
    
    public void run()
    {
      GMTrace.i(15228074983424L, 113458);
      if (this.mEvent == null)
      {
        GMTrace.o(15228074983424L, 113458);
        return;
      }
      try
      {
        long l1 = SystemClock.elapsedRealtime();
        View localView = searchViewByAccessibilityId(findAccessibilityId());
        AccessibilityCapture.logTarget(this.mEvent, localView, this.elapsedTime);
        long l2 = SystemClock.elapsedRealtime();
        AccessibilityCapture.mAPIProvider.i("MicroMsg.AccessibilityCapture", "analysis event %s, cost %dms", new Object[] { AccessibilityEvent.eventTypeToString(this.mEvent.getEventType()), Long.valueOf(l2 - l1) });
        try
        {
          this.mEvent.recycle();
          GMTrace.o(15228074983424L, 113458);
          return;
        }
        catch (Throwable localThrowable1)
        {
          AccessibilityCapture.mAPIProvider.e("MicroMsg.AccessibilityCapture", "Throw something when recycle event which shouldn't occurs.", new Object[] { localThrowable1 });
          GMTrace.o(15228074983424L, 113458);
          return;
        }
        try
        {
          this.mEvent.recycle();
          throw ((Throwable)localObject);
        }
        catch (Throwable localThrowable4)
        {
          for (;;)
          {
            AccessibilityCapture.mAPIProvider.e("MicroMsg.AccessibilityCapture", "Throw something when recycle event which shouldn't occurs.", new Object[] { localThrowable4 });
          }
        }
      }
      catch (Throwable localThrowable2)
      {
        localThrowable2 = localThrowable2;
        AccessibilityCapture.mAPIProvider.i("MicroMsg.AccessibilityCapture", "unable get node id", new Object[] { localThrowable2 });
        try
        {
          this.mEvent.recycle();
          GMTrace.o(15228074983424L, 113458);
          return;
        }
        catch (Throwable localThrowable3)
        {
          AccessibilityCapture.mAPIProvider.e("MicroMsg.AccessibilityCapture", "Throw something when recycle event which shouldn't occurs.", new Object[] { localThrowable3 });
          GMTrace.o(15228074983424L, 113458);
          return;
        }
      }
      finally {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\accessibility\AccessibilityCapture.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */