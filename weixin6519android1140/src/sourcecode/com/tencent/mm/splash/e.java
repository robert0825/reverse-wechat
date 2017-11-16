package com.tencent.mm.splash;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class e
{
  static b voA;
  private static Class<? extends SplashActivity> voB;
  private static Class<? extends Activity> voC;
  private static j voD;
  public static boolean voE;
  @SuppressLint({"HandlerLeak"})
  public static Handler voF;
  public static final ArrayList<f> voq;
  public static final ArrayList<Message> vor;
  static Application vos;
  static c vot;
  private static Set<SplashActivity> vou;
  private static boolean vov;
  private static volatile boolean vow;
  private static boolean vox;
  private static k voy;
  private static boolean voz;
  
  static
  {
    GMTrace.i(19021470629888L, 141721);
    voq = new ArrayList();
    vor = new ArrayList();
    vou = new HashSet();
    vov = false;
    vow = false;
    vox = false;
    voz = false;
    voD = new j();
    voE = false;
    voF = new Handler(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(19029926346752L, 141784);
        super.handleMessage(paramAnonymousMessage);
        if (paramAnonymousMessage.what == 0)
        {
          e.bRW();
          GMTrace.o(19029926346752L, 141784);
          return;
        }
        a.eM(e.vos);
        a.a(new a.a()
        {
          public final void bRI()
          {
            GMTrace.i(19017309880320L, 141690);
            e.bRW();
            GMTrace.o(19017309880320L, 141690);
          }
          
          public final void bRJ()
          {
            GMTrace.i(19017578315776L, 141692);
            e.a("WxSplash.Splash", "dexopt service return timeout. kill self.", new Object[0]);
            e.bRS();
            GMTrace.o(19017578315776L, 141692);
          }
          
          public final void bid()
          {
            GMTrace.i(19017444098048L, 141691);
            e.a("WxSplash.Splash", "dexopt service return failed. kill self.", new Object[0]);
            e.bRS();
            GMTrace.o(19017444098048L, 141691);
          }
        });
        GMTrace.o(19029926346752L, 141784);
      }
    };
    GMTrace.o(19021470629888L, 141721);
  }
  
  public e()
  {
    GMTrace.i(19017980968960L, 141695);
    GMTrace.o(19017980968960L, 141695);
  }
  
  private static int a(Handler paramHandler, String paramString)
  {
    GMTrace.i(19020799541248L, 141716);
    paramString = paramHandler.getClass().getDeclaredField(paramString);
    paramString.setAccessible(true);
    int i = ((Integer)paramString.get(paramHandler)).intValue();
    GMTrace.o(19020799541248L, 141716);
    return i;
  }
  
  static void a(SplashActivity paramSplashActivity)
  {
    GMTrace.i(19018115186688L, 141696);
    vou.add(paramSplashActivity);
    GMTrace.o(19018115186688L, 141696);
  }
  
  public static void a(b paramb)
  {
    GMTrace.i(19018786275328L, 141701);
    voA = paramb;
    GMTrace.o(19018786275328L, 141701);
  }
  
  public static void a(c paramc)
  {
    GMTrace.i(19018920493056L, 141702);
    vot = paramc;
    GMTrace.o(19018920493056L, 141702);
  }
  
  public static void a(k paramk)
  {
    GMTrace.i(19018383622144L, 141698);
    voy = paramk;
    GMTrace.o(19018383622144L, 141698);
  }
  
  public static void a(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(19021067976704L, 141718);
    if (voA != null) {
      voA.a(paramString1, paramString2, paramVarArgs);
    }
    GMTrace.o(19021067976704L, 141718);
  }
  
  public static void a(Throwable paramThrowable, String paramString)
  {
    GMTrace.i(19021202194432L, 141719);
    if (voA != null) {
      voA.a(paramThrowable, paramString);
    }
    GMTrace.o(19021202194432L, 141719);
  }
  
  static void b(SplashActivity paramSplashActivity)
  {
    GMTrace.i(19018249404416L, 141697);
    vou.remove(paramSplashActivity);
    GMTrace.o(19018249404416L, 141697);
  }
  
  public static void bRN()
  {
    boolean bool = true;
    GMTrace.i(19019323146240L, 141705);
    if (vox) {
      try
      {
        Handler.Callback localCallback = (Handler.Callback)i.vph.get(i.vpb);
        if (localCallback == i.vpg) {}
        for (;;)
        {
          a("WxSplash.Splash", "double check, callback %s %s", new Object[] { Boolean.valueOf(bool), localCallback });
          localObject = i.vpg;
          if (localCallback != localObject) {
            break;
          }
          GMTrace.o(19019323146240L, 141705);
          return;
          bool = false;
        }
        a("WxSplash.Splash", "double check found problem!", new Object[0]);
        Object localObject = i.vph;
        i.vpg.voW = localCallback;
        ((Field)localObject).setAccessible(true);
        ((Field)localObject).set(i.vpb, i.vpg);
        voD.e(675L, 31L, 1L);
        i.vpb.sendEmptyMessage(987654321);
        GMTrace.o(19019323146240L, 141705);
        return;
      }
      catch (Exception localException)
      {
        a(localException, "double check exception.");
      }
    }
    GMTrace.o(19019323146240L, 141705);
  }
  
  public static void bRO()
  {
    GMTrace.i(19019457363968L, 141706);
    vow = true;
    a("WxSplash.Splash", "pending early replay %s", new Object[] { Boolean.valueOf(vow) });
    bRU();
    GMTrace.o(19019457363968L, 141706);
  }
  
  public static void bRP()
  {
    boolean bool2 = true;
    GMTrace.i(19019591581696L, 141707);
    try
    {
      Object localObject = eQ(vos);
      if (localObject == i.vpa)
      {
        bool1 = true;
        a("WxSplash.Splash", "spy, activityThread %s", new Object[] { Boolean.valueOf(bool1) });
        Field localField = localObject.getClass().getDeclaredField("mH");
        localField.setAccessible(true);
        localObject = (Handler)localField.get(localObject);
        if (localObject != i.vpb) {
          break label169;
        }
        bool1 = true;
        label80:
        a("WxSplash.Splash", "spy, ActivityThread_mH %s", new Object[] { Boolean.valueOf(bool1) });
        localField = Handler.class.getDeclaredField("mCallback");
        localField.setAccessible(true);
        localObject = (Handler.Callback)localField.get(localObject);
        if (localObject != i.vpg) {
          break label174;
        }
      }
      label169:
      label174:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        a("WxSplash.Splash", "spy, callback %s %s", new Object[] { Boolean.valueOf(bool1), localObject });
        GMTrace.o(19019591581696L, 141707);
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label80;
      }
      return;
    }
    catch (Exception localException)
    {
      a(localException, "spy failed.");
      GMTrace.o(19019591581696L, 141707);
    }
  }
  
  public static boolean bRQ()
  {
    GMTrace.i(19019725799424L, 141708);
    if (vov)
    {
      GMTrace.o(19019725799424L, 141708);
      return true;
    }
    GMTrace.o(19019725799424L, 141708);
    return false;
  }
  
  public static boolean bRR()
  {
    GMTrace.i(19019860017152L, 141709);
    boolean bool = vow;
    GMTrace.o(19019860017152L, 141709);
    return bool;
  }
  
  public static void bRS()
  {
    GMTrace.i(19019994234880L, 141710);
    Process.killProcess(Process.myPid());
    GMTrace.o(19019994234880L, 141710);
  }
  
  public static void bRT()
  {
    GMTrace.i(19020128452608L, 141711);
    if (!com.tencent.mm.f.a.mH)
    {
      voF.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19022947024896L, 141732);
          com.tencent.mm.sdk.f.e.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19024826073088L, 141746);
              boolean bool = a.eK(e.vos);
              Handler localHandler = e.voF;
              if (bool) {}
              for (int i = 1;; i = 0)
              {
                localHandler.sendEmptyMessage(i);
                GMTrace.o(19024826073088L, 141746);
                return;
              }
            }
          }, "checking-need-dexopt");
          GMTrace.o(19022947024896L, 141732);
        }
      }, 150L);
      GMTrace.o(19020128452608L, 141711);
      return;
    }
    voF.sendEmptyMessage(0);
    GMTrace.o(19020128452608L, 141711);
  }
  
  private static void bRU()
  {
    GMTrace.i(19020262670336L, 141712);
    a("WxSplash.Splash", "Gonna replay %s pending message(s).", new Object[] { Integer.valueOf(vor.size()) });
    Iterator localIterator = vor.iterator();
    while (localIterator.hasNext())
    {
      Message localMessage = (Message)localIterator.next();
      i.vpb.sendMessage(localMessage);
    }
    vor.clear();
    GMTrace.o(19020262670336L, 141712);
  }
  
  public static void bRV()
  {
    GMTrace.i(19020396888064L, 141713);
    a("WxSplash.Splash", "splash done, do finally things. ", new Object[0]);
    vov = false;
    Object localObject1 = vou.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      SplashActivity localSplashActivity = (SplashActivity)((Iterator)localObject1).next();
      a("WxSplash.Splash", "iterate splash activity %s.", new Object[] { localSplashActivity });
      if (vot != null)
      {
        if (!vot.a(localSplashActivity, new SplashActivity.2(localSplashActivity))) {
          localSplashActivity.bSa();
        }
      }
      else
      {
        a("WxSplash.SplashActivity", "permissions delegate is null, call splash finish directly.", new Object[0]);
        localSplashActivity.bSb();
      }
    }
    a("WxSplash.Splash", "resend all %s pending message. ", new Object[] { Integer.valueOf(vor.size()) });
    if (!vow) {
      bRU();
    }
    voy = null;
    a("WxSplash.Splash", "we need splash no more.", new Object[0]);
    long l;
    try
    {
      voz = false;
      localObject1 = voD;
      if (((j)localObject1).mStartTimestamp <= 0L) {
        break label265;
      }
      l = System.currentTimeMillis() - ((j)localObject1).mStartTimestamp;
      if (com.tencent.mm.f.a.mH)
      {
        ((j)localObject1).e(676L, 1L, 1L);
        ((j)localObject1).e(676L, 3L, l);
        GMTrace.o(19020396888064L, 141713);
        return;
      }
    }
    finally {}
    ((j)localObject2).e(676L, 0L, 1L);
    ((j)localObject2).e(676L, 2L, l);
    label265:
    GMTrace.o(19020396888064L, 141713);
  }
  
  /* Error */
  public static void bRW()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 412
    //   6: ldc_w 414
    //   9: invokestatic 63	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: getstatic 268	com/tencent/mm/splash/e:vos	Landroid/app/Application;
    //   15: invokestatic 420	com/tencent/mm/splash/a:eL	(Landroid/content/Context;)V
    //   18: ldc 2
    //   20: monitorenter
    //   21: getstatic 85	com/tencent/mm/splash/e:voz	Z
    //   24: ifeq +19 -> 43
    //   27: ldc 2
    //   29: monitorexit
    //   30: ldc2_w 412
    //   33: ldc_w 414
    //   36: invokestatic 106	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   39: ldc 2
    //   41: monitorexit
    //   42: return
    //   43: iconst_1
    //   44: putstatic 85	com/tencent/mm/splash/e:voz	Z
    //   47: ldc 2
    //   49: monitorexit
    //   50: getstatic 83	com/tencent/mm/splash/e:vox	Z
    //   53: ifne +48 -> 101
    //   56: ldc -42
    //   58: ldc_w 422
    //   61: iconst_0
    //   62: anewarray 4	java/lang/Object
    //   65: invokestatic 223	com/tencent/mm/splash/e:a	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   68: getstatic 170	com/tencent/mm/splash/e:voy	Lcom/tencent/mm/splash/k;
    //   71: ifnonnull +254 -> 325
    //   74: invokestatic 424	com/tencent/mm/splash/e:bRV	()V
    //   77: ldc2_w 412
    //   80: ldc_w 414
    //   83: invokestatic 106	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   86: goto -47 -> 39
    //   89: astore_0
    //   90: ldc 2
    //   92: monitorexit
    //   93: aload_0
    //   94: athrow
    //   95: astore_0
    //   96: ldc 2
    //   98: monitorexit
    //   99: aload_0
    //   100: athrow
    //   101: getstatic 318	com/tencent/mm/f/a:mH	Z
    //   104: ifeq +42 -> 146
    //   107: ldc -42
    //   109: ldc_w 426
    //   112: iconst_0
    //   113: anewarray 4	java/lang/Object
    //   116: invokestatic 223	com/tencent/mm/splash/e:a	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: goto -51 -> 68
    //   122: astore_0
    //   123: getstatic 90	com/tencent/mm/splash/e:voD	Lcom/tencent/mm/splash/j;
    //   126: ldc2_w 236
    //   129: ldc2_w 427
    //   132: lconst_1
    //   133: invokevirtual 243	com/tencent/mm/splash/j:e	(JJJ)V
    //   136: aload_0
    //   137: ldc_w 430
    //   140: invokestatic 253	com/tencent/mm/splash/e:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   143: goto -75 -> 68
    //   146: getstatic 434	com/tencent/mm/splash/i:vpe	Ljava/util/List;
    //   149: ifnull -81 -> 68
    //   152: getstatic 434	com/tencent/mm/splash/i:vpe	Ljava/util/List;
    //   155: invokeinterface 437 1 0
    //   160: ifeq -92 -> 68
    //   163: getstatic 90	com/tencent/mm/splash/e:voD	Lcom/tencent/mm/splash/j;
    //   166: ldc2_w 236
    //   169: ldc2_w 438
    //   172: lconst_1
    //   173: invokevirtual 243	com/tencent/mm/splash/j:e	(JJJ)V
    //   176: getstatic 276	com/tencent/mm/splash/i:vpa	Ljava/lang/Object;
    //   179: astore_2
    //   180: aload_2
    //   181: invokevirtual 120	java/lang/Object:getClass	()Ljava/lang/Class;
    //   184: ldc_w 441
    //   187: invokevirtual 126	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   190: astore_0
    //   191: aload_0
    //   192: iconst_1
    //   193: invokevirtual 132	java/lang/reflect/Field:setAccessible	(Z)V
    //   196: aload_0
    //   197: aload_2
    //   198: invokevirtual 136	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   201: astore_1
    //   202: aload_1
    //   203: checkcast 443	android/app/Application
    //   206: putstatic 446	com/tencent/mm/splash/i:vpd	Landroid/app/Application;
    //   209: aload_1
    //   210: astore_0
    //   211: aload_1
    //   212: ifnonnull +19 -> 231
    //   215: ldc -42
    //   217: ldc_w 448
    //   220: iconst_0
    //   221: anewarray 4	java/lang/Object
    //   224: invokestatic 223	com/tencent/mm/splash/e:a	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   227: getstatic 268	com/tencent/mm/splash/e:vos	Landroid/app/Application;
    //   230: astore_0
    //   231: ldc_w 450
    //   234: invokestatic 454	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   237: pop
    //   238: ldc_w 456
    //   241: invokestatic 454	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   244: pop
    //   245: ldc -42
    //   247: ldc_w 458
    //   250: iconst_0
    //   251: anewarray 4	java/lang/Object
    //   254: invokestatic 223	com/tencent/mm/splash/e:a	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   257: ldc -42
    //   259: ldc_w 460
    //   262: iconst_0
    //   263: anewarray 4	java/lang/Object
    //   266: invokestatic 223	com/tencent/mm/splash/e:a	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   269: getstatic 464	com/tencent/mm/splash/i:vpf	Ljava/lang/reflect/Method;
    //   272: aload_2
    //   273: iconst_2
    //   274: anewarray 4	java/lang/Object
    //   277: dup
    //   278: iconst_0
    //   279: aload_0
    //   280: aastore
    //   281: dup
    //   282: iconst_1
    //   283: getstatic 434	com/tencent/mm/splash/i:vpe	Ljava/util/List;
    //   286: aastore
    //   287: invokevirtual 470	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   290: pop
    //   291: ldc -42
    //   293: ldc_w 472
    //   296: iconst_0
    //   297: anewarray 4	java/lang/Object
    //   300: invokestatic 223	com/tencent/mm/splash/e:a	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   303: getstatic 434	com/tencent/mm/splash/i:vpe	Ljava/util/List;
    //   306: invokeinterface 473 1 0
    //   311: goto -243 -> 68
    //   314: astore_1
    //   315: aload_1
    //   316: ldc_w 475
    //   319: invokestatic 253	com/tencent/mm/splash/e:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   322: goto -65 -> 257
    //   325: getstatic 170	com/tencent/mm/splash/e:voy	Lcom/tencent/mm/splash/k;
    //   328: new 18	com/tencent/mm/splash/e$5
    //   331: dup
    //   332: invokespecial 476	com/tencent/mm/splash/e$5:<init>	()V
    //   335: invokeinterface 481 2 0
    //   340: ldc2_w 412
    //   343: ldc_w 414
    //   346: invokestatic 106	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   349: goto -310 -> 39
    // Local variable table:
    //   start	length	slot	name	signature
    //   89	5	0	localObject1	Object
    //   95	5	0	localObject2	Object
    //   122	15	0	localException	Exception
    //   190	90	0	localObject3	Object
    //   201	11	1	localObject4	Object
    //   314	2	1	localThrowable	Throwable
    //   179	94	2	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   3	21	89	finally
    //   30	39	89	finally
    //   50	68	89	finally
    //   68	86	89	finally
    //   99	101	89	finally
    //   101	119	89	finally
    //   123	143	89	finally
    //   146	209	89	finally
    //   215	231	89	finally
    //   231	257	89	finally
    //   257	311	89	finally
    //   315	322	89	finally
    //   325	349	89	finally
    //   21	30	95	finally
    //   43	50	95	finally
    //   96	99	95	finally
    //   50	68	122	java/lang/Exception
    //   101	119	122	java/lang/Exception
    //   146	209	122	java/lang/Exception
    //   215	231	122	java/lang/Exception
    //   231	257	122	java/lang/Exception
    //   257	311	122	java/lang/Exception
    //   315	322	122	java/lang/Exception
    //   231	257	314	java/lang/Throwable
  }
  
  public static Class<? extends Activity> bRX()
  {
    GMTrace.i(19020665323520L, 141715);
    Class localClass = voB;
    GMTrace.o(19020665323520L, 141715);
    return localClass;
  }
  
  public static j bRY()
  {
    GMTrace.i(19021336412160L, 141720);
    j localj = voD;
    GMTrace.o(19021336412160L, 141720);
    return localj;
  }
  
  public static boolean cub()
  {
    GMTrace.i(21036212944896L, 156732);
    GMTrace.o(21036212944896L, 156732);
    return true;
  }
  
  public static void eP(Context paramContext)
  {
    int i = 1;
    GMTrace.i(19019054710784L, 141703);
    for (;;)
    {
      try
      {
        localObject = bg.eH(ab.getContext());
        if ((localObject != null) && (((ComponentName)localObject).getPackageName().equals(ab.getPackageName())) && (((ComponentName)localObject).getClassName().equals(ab.bPS())))
        {
          a("WxSplash.Splash", "it is LauncherUI", new Object[0]);
          if (i == 0)
          {
            a("WxSplash.Splash", "do nothing and return.", new Object[0]);
            GMTrace.o(19019054710784L, 141703);
          }
        }
        else
        {
          if ((localObject == null) || (!((ComponentName)localObject).getPackageName().startsWith("com.excelliance"))) {
            break label256;
          }
          a("WxSplash.Splash", "it is dual open", new Object[0]);
          continue;
        }
        voD.e(675L, 36L, 1L);
      }
      catch (IOException paramContext)
      {
        a(paramContext, "request fig leaf failed.");
        GMTrace.o(19019054710784L, 141703);
        return;
      }
      Object localObject = a.bRF();
      File localFile = new File((String)localObject);
      if (!localFile.exists()) {
        localFile.mkdirs();
      }
      localObject = new File((String)localObject + "/main-process-blocking");
      if (((File)localObject).exists()) {
        ((File)localObject).delete();
      }
      if (((File)localObject).createNewFile())
      {
        localObject = new Intent(paramContext, voC);
        ((Intent)localObject).addFlags(268435456);
        paramContext.startActivity((Intent)localObject);
      }
      GMTrace.o(19019054710784L, 141703);
      return;
      label256:
      i = 0;
    }
  }
  
  private static Object eQ(Context paramContext)
  {
    GMTrace.i(19020933758976L, 141717);
    Object localObject = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
    ((Method)localObject).setAccessible(true);
    localObject = ((Method)localObject).invoke(null, new Object[0]);
    if (localObject != null)
    {
      GMTrace.o(19020933758976L, 141717);
      return localObject;
    }
    localObject = paramContext.getClass().getField("mLoadedApk");
    ((Field)localObject).setAccessible(true);
    paramContext = ((Field)localObject).get(paramContext);
    localObject = paramContext.getClass().getDeclaredField("mActivityThread");
    ((Field)localObject).setAccessible(true);
    paramContext = ((Field)localObject).get(paramContext);
    GMTrace.o(19020933758976L, 141717);
    return paramContext;
  }
  
  public static boolean f(Application paramApplication)
  {
    boolean bool;
    long l;
    Object localObject2;
    label213:
    Object localObject3;
    for (;;)
    {
      Object localObject1;
      try
      {
        GMTrace.i(19019188928512L, 141704);
        if (vox)
        {
          a("WxSplash.Splash", "Splash has hacked before.", new Object[0]);
          bool = true;
          GMTrace.o(19019188928512L, 141704);
          return bool;
        }
        l = System.currentTimeMillis();
        vos = paramApplication;
        voD.e(675L, 4L, 1L);
      }
      finally {}
      for (;;)
      {
        try
        {
          localObject1 = Class.forName("android.app.ActivityManagerNative");
          localObject2 = ((Class)localObject1).getDeclaredMethod("getDefault", new Class[0]);
          ((Method)localObject2).setAccessible(true);
          localObject1 = ((Method)localObject2).invoke(localObject1, new Object[0]);
          if (localObject1 != null)
          {
            a("WxSplash.Splash", "getDefault %s", new Object[] { localObject1 });
            if (localObject1.getClass().getCanonicalName().startsWith("com.morgoo.droidplugin"))
            {
              voD.e(675L, 33L, 1L);
              a("WxSplash.Splash", "found using droidplugin", new Object[0]);
            }
            if (Proxy.isProxyClass(localObject1.getClass())) {
              a("WxSplash.Splash", "found ActivityManager is a Proxy class, " + localObject1.getClass(), new Object[0]);
            }
          }
        }
        catch (Exception localException)
        {
          a(localException, "validateEnvironment found some thing.");
          break label213;
          if (Object.class == localObject3.getClass().getSuperclass()) {
            continue;
          }
          voD.e(675L, 7L, 1L);
          a("WxSplash.Splash", "Instrumentation original's super class is not Object, maybe hacked by others. orig: %s, super: %s.", new Object[] { localObject3.getClass(), localObject3.getClass().getSuperclass() });
          localObject4 = localObject3.getClass().getCanonicalName();
          RuntimeException localRuntimeException = new RuntimeException("invalid environment for hack, " + localObject3.getClass());
          if ((!((String)localObject4).startsWith("com.excelliance")) && (!((String)localObject4).startsWith("com.lbe"))) {
            continue;
          }
          voD.e(675L, 30L, 1L);
          a("WxSplash.Splash", "invalid environment for hack, dual open.", new Object[0]);
          if (!((String)localObject4).startsWith("com.excelliance")) {
            continue;
          }
          voD.e(675L, 40L, 1L);
          throw localRuntimeException;
          if (!((String)localObject4).startsWith("com.lbe")) {
            continue;
          }
          voD.e(675L, 40L, 1L);
          continue;
          a(localRuntimeException, "found instrumentation hacked");
          if ((localObject3 instanceof h)) {
            continue;
          }
          ((Field)localObject2).set(localException, new h((Instrumentation)localObject3));
          i.vpa = localException;
          localObject2 = localException.getClass().getDeclaredField("mH");
          ((Field)localObject2).setAccessible(true);
          localObject2 = (Handler)((Field)localObject2).get(localException);
          if (localObject2 != null) {
            continue;
          }
          throw new RuntimeException("mH is null!");
          a("WxSplash.Splash", "instrumentation is splash hacked, why? failed before?", new Object[0]);
          continue;
          i.vpb = (Handler)localObject2;
          localObject3 = Handler.class.getDeclaredField("mCallback");
          ((Field)localObject3).setAccessible(true);
          localObject4 = (Handler.Callback)((Field)localObject3).get(localObject2);
          i.vph = (Field)localObject3;
          if (localObject4 == null) {
            continue;
          }
          a("WxSplash.Splash", "Handler.Callback original is not null, maybe hacked by others. orig: %s", new Object[] { localObject4 });
          voD.e(675L, 8L, 1L);
          if (localObject4 == null) {
            break label690;
          }
        }
        try
        {
          localObject1 = eQ(paramApplication);
          localObject2 = localObject1.getClass().getDeclaredField("mInstrumentation");
          ((Field)localObject2).setAccessible(true);
          localObject3 = (Instrumentation)((Field)localObject2).get(localObject1);
          if (localObject3 != null) {
            continue;
          }
          throw new NullPointerException("Instrumentation original should not be null.");
        }
        catch (Exception paramApplication)
        {
          a(paramApplication, "splash hack error!");
          bool = false;
          GMTrace.o(19019188928512L, 141704);
        }
      }
    }
    Object localObject4;
    if (!(localObject4 instanceof g))
    {
      label690:
      paramApplication = new g(paramApplication, (Handler.Callback)localObject4);
      ((Field)localObject3).setAccessible(true);
      ((Field)localObject3).set(localObject2, paramApplication);
      i.vpg = paramApplication;
    }
    for (;;)
    {
      paramApplication = new Handler();
      g.T(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19030194782208L, 141786);
          e.voE = true;
          this.voG.removeCallbacksAndMessages(null);
          e.a("WxSplash.Splash", "verify mH callback hack, result ok.", new Object[0]);
          GMTrace.o(19030194782208L, 141786);
        }
      });
      i.vpb.sendEmptyMessage(987654321);
      paramApplication.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19017041444864L, 141688);
          if (!e.voE)
          {
            e.a("WxSplash.Splash", "verify mH callback hack, result failed!.", new Object[0]);
            e.bRY().e(675L, 32L, 1L);
            e.bRP();
          }
          GMTrace.o(19017041444864L, 141688);
        }
      }, 2000L);
      if (!com.tencent.mm.f.a.mH)
      {
        paramApplication = localException.getClass().getDeclaredMethod("installContentProviders", new Class[] { Context.class, List.class });
        paramApplication.setAccessible(true);
        i.vpf = paramApplication;
        paramApplication = localException.getClass().getDeclaredField("mBoundApplication");
        paramApplication.setAccessible(true);
        paramApplication = paramApplication.get(localException);
        i.vpc = paramApplication;
        Field localField = paramApplication.getClass().getDeclaredField("restrictedBackupMode");
        localField.setAccessible(true);
        localField.set(paramApplication, Boolean.valueOf(true));
        localField = paramApplication.getClass().getDeclaredField("providers");
        localField.setAccessible(true);
        i.vpe = (List)localField.get(paramApplication);
      }
      g.voL = a((Handler)localObject2, "LAUNCH_ACTIVITY");
      g.voM = a((Handler)localObject2, "RECEIVER");
      g.voN = a((Handler)localObject2, "CREATE_SERVICE");
      g.voO = a((Handler)localObject2, "SERVICE_ARGS");
      g.voP = a((Handler)localObject2, "STOP_SERVICE");
      g.voQ = a((Handler)localObject2, "BIND_SERVICE");
      g.voR = a((Handler)localObject2, "UNBIND_SERVICE");
      if (Build.VERSION.SDK_INT >= 19) {
        g.voT = a((Handler)localObject2, "INSTALL_PROVIDER");
      }
      vox = true;
      vov = true;
      a("WxSplash.Splash", "splash hack success.", new Object[0]);
      a("WxSplash.Splash", "we need splash. time spent %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      bool = true;
      GMTrace.o(19019188928512L, 141704);
      break;
      a("WxSplash.Splash", "callback is splash hacked, why? failed before?", new Object[0]);
    }
  }
  
  public static void x(Class<? extends SplashActivity> paramClass)
  {
    GMTrace.i(19018517839872L, 141699);
    voB = paramClass;
    GMTrace.o(19018517839872L, 141699);
  }
  
  public static void y(Class<? extends Activity> paramClass)
  {
    GMTrace.i(19018652057600L, 141700);
    voC = paramClass;
    GMTrace.o(19018652057600L, 141700);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\splash\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */