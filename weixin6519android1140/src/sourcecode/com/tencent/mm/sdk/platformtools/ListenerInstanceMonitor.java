package com.tencent.mm.sdk.platformtools;

import android.app.Activity;
import android.os.Debug;
import android.os.HandlerThread;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.a.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class ListenerInstanceMonitor
{
  public static final Map<Object, Set<a>> vhG;
  public static final byte[] vhH;
  private static Field vhI;
  private static HandlerThread vhJ;
  public static ae vhK;
  public static volatile boolean vhL;
  public static final String vhM;
  public static Field vhN;
  public static final Runnable vhO;
  
  static
  {
    GMTrace.i(20316805922816L, 151372);
    vhG = new WeakHashMap();
    vhH = new byte[0];
    vhI = null;
    vhJ = null;
    vhK = null;
    vhL = false;
    vhM = Activity.class.getName();
    vhN = null;
    vhO = new Runnable()
    {
      /* Error */
      private static boolean T(Activity paramAnonymousActivity)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 4
        //   3: ldc2_w 30
        //   6: ldc 32
        //   8: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   11: aload_0
        //   12: invokevirtual 38	android/app/Activity:getWindow	()Landroid/view/Window;
        //   15: astore_0
        //   16: getstatic 42	com/tencent/mm/sdk/platformtools/ListenerInstanceMonitor:vhN	Ljava/lang/reflect/Field;
        //   19: ifnonnull +23 -> 42
        //   22: ldc 44
        //   24: ldc 46
        //   26: invokevirtual 52	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   29: astore 5
        //   31: aload 5
        //   33: putstatic 42	com/tencent/mm/sdk/platformtools/ListenerInstanceMonitor:vhN	Ljava/lang/reflect/Field;
        //   36: aload 5
        //   38: iconst_1
        //   39: invokevirtual 58	java/lang/reflect/Field:setAccessible	(Z)V
        //   42: getstatic 42	com/tencent/mm/sdk/platformtools/ListenerInstanceMonitor:vhN	Ljava/lang/reflect/Field;
        //   45: aload_0
        //   46: invokevirtual 62	java/lang/reflect/Field:getBoolean	(Ljava/lang/Object;)Z
        //   49: istore_3
        //   50: iload_3
        //   51: ifne +42 -> 93
        //   54: ldc2_w 30
        //   57: ldc 32
        //   59: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   62: iconst_0
        //   63: ireturn
        //   64: astore_0
        //   65: ldc 64
        //   67: aload_0
        //   68: ldc 66
        //   70: iconst_0
        //   71: anewarray 4	java/lang/Object
        //   74: invokestatic 72	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   77: ldc2_w 30
        //   80: ldc 32
        //   82: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   85: iconst_0
        //   86: ireturn
        //   87: astore_0
        //   88: iconst_0
        //   89: istore_3
        //   90: goto -40 -> 50
        //   93: invokestatic 78	android/os/Looper:getMainLooper	()Landroid/os/Looper;
        //   96: invokevirtual 82	android/os/Looper:getThread	()Ljava/lang/Thread;
        //   99: invokevirtual 88	java/lang/Thread:getStackTrace	()[Ljava/lang/StackTraceElement;
        //   102: astore_0
        //   103: aload_0
        //   104: arraylength
        //   105: istore_2
        //   106: iconst_0
        //   107: istore_1
        //   108: iload_1
        //   109: iload_2
        //   110: if_icmpge +55 -> 165
        //   113: aload_0
        //   114: iload_1
        //   115: aaload
        //   116: astore 5
        //   118: getstatic 92	com/tencent/mm/sdk/platformtools/ListenerInstanceMonitor:vhM	Ljava/lang/String;
        //   121: aload 5
        //   123: invokevirtual 98	java/lang/StackTraceElement:getClassName	()Ljava/lang/String;
        //   126: invokevirtual 103	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   129: ifeq +29 -> 158
        //   132: ldc 105
        //   134: aload 5
        //   136: invokevirtual 108	java/lang/StackTraceElement:getMethodName	()Ljava/lang/String;
        //   139: invokevirtual 103	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   142: ifeq +16 -> 158
        //   145: iload 4
        //   147: istore_3
        //   148: ldc2_w 30
        //   151: ldc 32
        //   153: invokestatic 24	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   156: iload_3
        //   157: ireturn
        //   158: iload_1
        //   159: iconst_1
        //   160: iadd
        //   161: istore_1
        //   162: goto -54 -> 108
        //   165: goto -17 -> 148
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	168	0	paramAnonymousActivity	Activity
        //   107	55	1	i	int
        //   105	6	2	j	int
        //   49	108	3	bool1	boolean
        //   1	145	4	bool2	boolean
        //   29	106	5	localField	Field
        // Exception table:
        //   from	to	target	type
        //   22	42	64	java/lang/Throwable
        //   42	50	87	java/lang/Throwable
      }
      
      public final void run()
      {
        GMTrace.i(20318282317824L, 151383);
        synchronized (ListenerInstanceMonitor.vhO)
        {
          if (!ListenerInstanceMonitor.vhL)
          {
            GMTrace.o(20318282317824L, 151383);
            return;
          }
          synchronized (ListenerInstanceMonitor.vhH)
          {
            if (ListenerInstanceMonitor.vhG.isEmpty()) {
              w.d("MicroMsg.ListenerInstanceMonitor", "[tomys] monitor task: no listener or cb was added, skip rest logic.");
            }
          }
        }
        for (;;)
        {
          synchronized (ListenerInstanceMonitor.vhO)
          {
            if (ListenerInstanceMonitor.vhL) {
              ListenerInstanceMonitor.vhK.postDelayed(this, 10000L);
            }
            GMTrace.o(20318282317824L, 151383);
            return;
            localObject4 = finally;
            throw ((Throwable)localObject4);
            if (Debug.isDebuggerConnected())
            {
              w.w("MicroMsg.ListenerInstanceMonitor", "[tomys] monitor task: found debugger connected, disable monitor works in case of misreport.");
              continue;
              localObject5 = finally;
              throw ((Throwable)localObject5);
            }
            w.d("MicroMsg.ListenerInstanceMonitor", "[tomys] monitor task: triggering gc...");
          }
          try
          {
            Runtime.getRuntime().gc();
            Thread.sleep(100L);
            Runtime.getRuntime().runFinalization();
            Object localObject3;
            for (;;)
            {
              Iterator localIterator2;
              ListenerInstanceMonitor.a locala;
              Activity localActivity;
              synchronized (ListenerInstanceMonitor.vhH)
              {
                Iterator localIterator1 = ListenerInstanceMonitor.vhG.entrySet().iterator();
                if (!localIterator1.hasNext()) {
                  break;
                }
                localIterator2 = ((Set)((Map.Entry)localIterator1.next()).getValue()).iterator();
                if (!localIterator2.hasNext()) {
                  continue;
                }
                locala = (ListenerInstanceMonitor.a)localIterator2.next();
                ??? = locala.vhP.get();
                localActivity = (Activity)locala.vhQ.get();
                if (localActivity == null)
                {
                  w.i("MicroMsg.ListenerInstanceMonitor", "[tomys] monitor task: Ok, ui [%s] was recycled.", new Object[] { locala.vhR.getName() });
                  localIterator2.remove();
                }
              }
              if ((T(localActivity)) && (localObject2 == null)) {
                if (locala.vhU > 3)
                {
                  localIterator2.remove();
                  if ((e.DEBUG) || (b.bPq())) {
                    break label624;
                  }
                  if (!b.bPo()) {
                    break label629;
                  }
                  break label624;
                  if (locala.vhQ.get() == null) {
                    if (locala.vhS != null) {
                      localObject3 = "ui of class [" + locala.vhR.getName() + "] held by\n [" + locala.bPF() + "] is recycled";
                    }
                  }
                  for (;;)
                  {
                    localObject3 = new ListenerInstanceMonitor.ListenerLeakedException((String)localObject3, locala.vhT);
                    if (i == 0) {
                      break;
                    }
                    throw ((Throwable)localObject3);
                    localObject3 = "ui of class [" + locala.vhR.getName() + "] which is subclass of\n listener or callback and held by other 'Manager' class is recycled";
                    continue;
                    if (locala.vhS != null) {
                      localObject3 = "ui of class [" + locala.vhR.getName() + "] held by\n [" + locala.bPF() + "] is leaked.\n Perhaps you should remove the holder from any 'Manager' class when the leaked ui was destroyed.";
                    } else {
                      localObject3 = "ui of class [" + locala.vhR.getName() + "] which is subclass of\n listener or callback and held by other 'Manager' class is leaked.\n Perhaps you should remove any instance of this class from any 'Manager'";
                    }
                  }
                  w.printErrStackTrace("MicroMsg.ListenerInstanceMonitor", (Throwable)localObject3, "", new Object[0]);
                }
                else
                {
                  locala.vhU += 1;
                  w.w("MicroMsg.ListenerInstanceMonitor", "[tomys] monitor task: ui [%s] was recycled, but its instance is still exists in %s time(s) check.", new Object[] { locala.vhR.getName(), Integer.valueOf(locala.vhU) });
                }
              }
            }
            continue;
            localObject6 = finally;
            throw ((Throwable)localObject6);
          }
          catch (Throwable localThrowable)
          {
            for (;;)
            {
              continue;
              label624:
              int i = 1;
              continue;
              label629:
              i = 0;
            }
          }
        }
      }
    };
    if ((e.DEBUG) || (b.bPq()) || (b.bPo()))
    {
      if (ab.bPY()) {
        try
        {
          ??? = View.class.getDeclaredField("mContext");
          vhI = (Field)???;
          ((Field)???).setAccessible(true);
          synchronized (vhO)
          {
            if (!vhL)
            {
              Object localObject2 = com.tencent.mm.sdk.f.e.SV("ListenerInstanceMonitor");
              vhJ = (HandlerThread)localObject2;
              ((HandlerThread)localObject2).start();
              localObject2 = new ae(vhJ.getLooper());
              vhK = (ae)localObject2;
              ((ae)localObject2).postDelayed(vhO, 10000L);
              vhL = true;
            }
            GMTrace.o(20316805922816L, 151372);
            return;
          }
          w.w("MicroMsg.ListenerInstanceMonitor", "Not mm process, keep disabled.");
        }
        catch (Throwable localThrowable)
        {
          w.printErrStackTrace("MicroMsg.ListenerInstanceMonitor", localThrowable, "init failed, keep disabled.", new Object[0]);
          GMTrace.o(20316805922816L, 151372);
          return;
        }
      }
      GMTrace.o(20316805922816L, 151372);
      return;
    }
    w.w("MicroMsg.ListenerInstanceMonitor", "Not debug, assist or monkey env, keep disabled.");
    GMTrace.o(20316805922816L, 151372);
  }
  
  private static void a(Object paramObject, Activity paramActivity, Field paramField, Throwable paramThrowable)
  {
    GMTrace.i(20316537487360L, 151370);
    Object localObject2 = null;
    Object localObject1;
    int j;
    if (paramObject.getClass().isAnnotationPresent(bj.class))
    {
      localObject1 = (bj)paramObject.getClass().getAnnotation(bj.class);
      if (localObject1 == null) {
        break label216;
      }
      localObject2 = paramActivity.getClass();
      localObject1 = ((bj)localObject1).cua();
      if ((localObject1 != null) && (localObject1.length > 0))
      {
        j = localObject1.length;
        i = 0;
        while (i < j)
        {
          if (localObject2.equals(localObject1[i])) {
            break label210;
          }
          i += 1;
        }
      }
    }
    else
    {
      ??? = paramObject.getClass().getDeclaredMethods();
      j = ???.length;
      i = 0;
      for (;;)
      {
        localObject1 = localObject2;
        if (i >= j) {
          break;
        }
        localObject1 = ???[i];
        if (((Method)localObject1).isAnnotationPresent(bj.class))
        {
          localObject1 = (bj)((Method)localObject1).getAnnotation(bj.class);
          break;
        }
        i += 1;
      }
    }
    label210:
    for (int i = 0; i != 0; i = 1)
    {
      w.w("MicroMsg.ListenerInstanceMonitor", "Activity %s held by %s is ignored !!", new Object[] { paramActivity, paramObject });
      GMTrace.o(20316537487360L, 151370);
      return;
    }
    synchronized (vhH)
    {
      label216:
      localObject2 = (Set)vhG.get(paramObject);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new HashSet();
        vhG.put(paramObject, localObject1);
      }
      ((Set)localObject1).add(new a(paramActivity, paramField, paramThrowable));
      GMTrace.o(20316537487360L, 151370);
      return;
    }
  }
  
  private static void a(Object paramObject, Field paramField, Throwable paramThrowable)
  {
    GMTrace.i(20316269051904L, 151368);
    Object localObject;
    if (paramField == null) {
      if ((paramObject instanceof Activity)) {
        localObject = (Activity)paramObject;
      }
    }
    for (;;)
    {
      a(paramObject, (Activity)localObject, paramField, paramThrowable);
      GMTrace.o(20316269051904L, 151368);
      return;
      GMTrace.o(20316269051904L, 151368);
      return;
      if (!paramField.isAccessible()) {
        paramField.setAccessible(true);
      }
      try
      {
        Activity localActivity = (Activity)paramField.get(paramObject);
        localObject = localActivity;
        if (localActivity == null)
        {
          GMTrace.o(20316269051904L, 151368);
          return;
        }
      }
      catch (Throwable paramObject)
      {
        GMTrace.o(20316269051904L, 151368);
      }
    }
  }
  
  private static void b(Object paramObject, Field paramField, Throwable paramThrowable)
  {
    GMTrace.i(20316403269632L, 151369);
    Object localObject;
    if (paramField == null) {
      if ((paramObject instanceof View)) {
        localObject = (View)paramObject;
      }
    }
    for (;;)
    {
      try
      {
        localObject = vhI.get(localObject);
        if ((localObject instanceof Activity)) {
          a(paramObject, (Activity)localObject, paramField, paramThrowable);
        }
        GMTrace.o(20316403269632L, 151369);
        return;
      }
      catch (Throwable paramObject)
      {
        GMTrace.o(20316403269632L, 151369);
      }
      GMTrace.o(20316403269632L, 151369);
      return;
      if (vhI == null)
      {
        GMTrace.o(20316403269632L, 151369);
        return;
      }
      if (!paramField.isAccessible()) {
        paramField.setAccessible(true);
      }
      try
      {
        View localView = (View)paramField.get(paramObject);
        localObject = localView;
        if (localView == null)
        {
          GMTrace.o(20316403269632L, 151369);
          return;
        }
      }
      catch (Throwable paramObject)
      {
        GMTrace.o(20316403269632L, 151369);
        return;
      }
    }
  }
  
  public static void bC(Object paramObject)
  {
    GMTrace.i(20316134834176L, 151367);
    if (paramObject == null)
    {
      GMTrace.o(20316134834176L, 151367);
      return;
    }
    Throwable localThrowable = new Throwable();
    Class localClass1 = paramObject.getClass();
    if (!Object.class.equals(localClass1))
    {
      if (Activity.class.isAssignableFrom(localClass1)) {
        a(paramObject, null, localThrowable);
      }
      for (;;)
      {
        localClass1 = localClass1.getSuperclass();
        break;
        if (!View.class.isAssignableFrom(localClass1)) {
          break label87;
        }
        b(paramObject, null, localThrowable);
      }
      label87:
      Field[] arrayOfField = localClass1.getDeclaredFields();
      int j = arrayOfField.length;
      int i = 0;
      label99:
      Field localField;
      Class localClass2;
      if (i < j)
      {
        localField = arrayOfField[i];
        localClass2 = localField.getType();
        if (!Activity.class.isAssignableFrom(localClass2)) {
          break label142;
        }
        a(paramObject, localField, localThrowable);
      }
      for (;;)
      {
        i += 1;
        break label99;
        break;
        label142:
        if (View.class.isAssignableFrom(localClass2)) {
          b(paramObject, localField, localThrowable);
        }
      }
    }
    GMTrace.o(20316134834176L, 151367);
  }
  
  public static void bD(Object paramObject)
  {
    GMTrace.i(20316671705088L, 151371);
    if (paramObject == null)
    {
      GMTrace.o(20316671705088L, 151371);
      return;
    }
    synchronized (vhH)
    {
      vhG.remove(paramObject);
      GMTrace.o(20316671705088L, 151371);
      return;
    }
  }
  
  private static final class ListenerLeakedException
    extends RuntimeException
  {
    ListenerLeakedException(String paramString, Throwable paramThrowable)
    {
      super();
      GMTrace.i(20319356059648L, 151391);
      setStackTrace(paramThrowable.getStackTrace());
      GMTrace.o(20319356059648L, 151391);
    }
    
    public final Throwable fillInStackTrace()
    {
      GMTrace.i(20319490277376L, 151392);
      GMTrace.o(20319490277376L, 151392);
      return this;
    }
  }
  
  private static final class a
  {
    final WeakReference<Object> vhP;
    WeakReference<Activity> vhQ;
    Class<?> vhR;
    Field vhS;
    Throwable vhT;
    int vhU;
    
    a(Activity paramActivity, Field paramField, Throwable paramThrowable)
    {
      GMTrace.i(20318550753280L, 151385);
      this.vhP = new WeakReference(new Object());
      this.vhQ = new WeakReference(paramActivity);
      this.vhR = paramActivity.getClass();
      this.vhS = paramField;
      this.vhT = paramThrowable;
      this.vhU = 0;
      GMTrace.o(20318550753280L, 151385);
    }
    
    /* Error */
    private String bPE()
    {
      // Byte code:
      //   0: ldc2_w 63
      //   3: ldc 65
      //   5: invokestatic 35	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: new 67	java/io/StringWriter
      //   11: dup
      //   12: invokespecial 68	java/io/StringWriter:<init>	()V
      //   15: astore_1
      //   16: new 70	java/io/PrintWriter
      //   19: dup
      //   20: aload_1
      //   21: invokespecial 73	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
      //   24: astore_2
      //   25: aload_0
      //   26: getfield 54	com/tencent/mm/sdk/platformtools/ListenerInstanceMonitor$a:vhT	Ljava/lang/Throwable;
      //   29: aload_2
      //   30: invokevirtual 79	java/lang/Throwable:printStackTrace	(Ljava/io/PrintWriter;)V
      //   33: aload_2
      //   34: invokestatic 85	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
      //   37: aload_1
      //   38: invokevirtual 88	java/io/StringWriter:toString	()Ljava/lang/String;
      //   41: astore_1
      //   42: ldc2_w 63
      //   45: ldc 65
      //   47: invokestatic 59	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   50: aload_1
      //   51: areturn
      //   52: astore_1
      //   53: aconst_null
      //   54: astore_2
      //   55: aload_2
      //   56: invokestatic 85	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
      //   59: aload_1
      //   60: athrow
      //   61: astore_1
      //   62: goto -7 -> 55
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	65	0	this	a
      //   15	36	1	localObject1	Object
      //   52	8	1	localObject2	Object
      //   61	1	1	localObject3	Object
      //   24	32	2	localPrintWriter	java.io.PrintWriter
      // Exception table:
      //   from	to	target	type
      //   16	25	52	finally
      //   25	33	61	finally
    }
    
    final String bPF()
    {
      GMTrace.i(20318953406464L, 151388);
      if (this.vhS == null)
      {
        GMTrace.o(20318953406464L, 151388);
        return "#null#";
      }
      Object localObject = this.vhS.getDeclaringClass();
      if (!((Class)localObject).isAnonymousClass())
      {
        localObject = "field " + this.vhS.getName() + " defined in " + ((Class)localObject).getName();
        GMTrace.o(20318953406464L, 151388);
        return (String)localObject;
      }
      Type localType = ((Class)localObject).getGenericSuperclass();
      if (Object.class.equals(localType)) {
        localObject = localObject.getGenericInterfaces()[0];
      }
      for (;;)
      {
        localObject = "field " + this.vhS.getName() + " define in anonymous class of " + localObject.toString().replace('<', '#').replace('>', '#');
        GMTrace.o(20318953406464L, 151388);
        return (String)localObject;
        if (localType != null) {
          localObject = localType;
        }
      }
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool2 = true;
      GMTrace.i(20319221841920L, 151390);
      if ((paramObject == null) || (!(paramObject instanceof a)))
      {
        GMTrace.o(20319221841920L, 151390);
        return false;
      }
      paramObject = (a)paramObject;
      Object localObject1 = this.vhQ.get();
      Object localObject2 = ((a)paramObject).vhQ.get();
      boolean bool1;
      if ((localObject1 == null) && (localObject2 == null)) {
        bool1 = true;
      }
      while (!bool1)
      {
        GMTrace.o(20319221841920L, 151390);
        return false;
        if ((localObject1 != null) && (localObject2 != null)) {
          bool1 = localObject1.equals(localObject2);
        } else {
          bool1 = false;
        }
      }
      localObject1 = this.vhS;
      localObject2 = ((a)paramObject).vhS;
      if ((localObject1 == null) && (localObject2 == null)) {
        bool1 = true;
      }
      while (!bool1)
      {
        GMTrace.o(20319221841920L, 151390);
        return false;
        if ((localObject1 != null) && (localObject2 != null)) {
          bool1 = ((Field)localObject1).equals(localObject2);
        } else {
          bool1 = false;
        }
      }
      localObject1 = this.vhT;
      paramObject = ((a)paramObject).vhT;
      if ((localObject1 == null) && (paramObject == null)) {
        bool1 = bool2;
      }
      for (;;)
      {
        GMTrace.o(20319221841920L, 151390);
        return bool1;
        if ((localObject1 != null) && (paramObject != null)) {
          bool1 = localObject1.equals(paramObject);
        } else {
          bool1 = false;
        }
      }
    }
    
    public final int hashCode()
    {
      int k = 0;
      GMTrace.i(20319087624192L, 151389);
      Object localObject = this.vhQ.get();
      int i;
      if (localObject != null)
      {
        i = localObject.hashCode();
        if (this.vhS == null) {
          break label79;
        }
      }
      label79:
      for (int j = this.vhS.hashCode();; j = 0)
      {
        if (this.vhT != null) {
          k = this.vhT.hashCode();
        }
        GMTrace.o(20319087624192L, 151389);
        return i + j + k;
        i = 0;
        break;
      }
    }
    
    public final String toString()
    {
      GMTrace.i(20318684971008L, 151386);
      String str = bPF() + "@" + bPE().replace('\n', '|');
      GMTrace.o(20318684971008L, 151386);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\ListenerInstanceMonitor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */