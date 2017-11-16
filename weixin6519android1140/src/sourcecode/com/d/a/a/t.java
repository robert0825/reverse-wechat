package com.d.a.a;

import android.content.Context;
import java.lang.ref.WeakReference;

public final class t
{
  private static boolean aDI = false;
  private static Context aHu;
  public static WeakReference<b> aHv;
  public static WeakReference<d> aHw;
  public static WeakReference<c> aHx;
  private static WeakReference<e> aHy;
  private static final a aHz = new a();
  private static String imei;
  
  public static void a(Context paramContext, q paramq)
  {
    aHu = paramContext.getApplicationContext();
    try
    {
      w.og().a(paramContext, new m[] { aHz });
      r.nN().aGN = paramq;
      r.nN().aGO = imei;
      return;
    }
    catch (Exception paramContext) {}
  }
  
  /* Error */
  public static boolean a(android.os.Handler paramHandler, long paramLong, b paramb, d paramd)
  {
    // Byte code:
    //   0: getstatic 57	com/d/a/a/t:aHu	Landroid/content/Context;
    //   3: ifnonnull +5 -> 8
    //   6: iconst_0
    //   7: ireturn
    //   8: getstatic 40	com/d/a/a/t:aDI	Z
    //   11: ifeq +5 -> 16
    //   14: iconst_1
    //   15: ireturn
    //   16: new 88	java/lang/ref/WeakReference
    //   19: dup
    //   20: aload_3
    //   21: invokespecial 91	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   24: putstatic 93	com/d/a/a/t:aHv	Ljava/lang/ref/WeakReference;
    //   27: new 88	java/lang/ref/WeakReference
    //   30: dup
    //   31: aload 4
    //   33: invokespecial 91	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   36: putstatic 95	com/d/a/a/t:aHw	Ljava/lang/ref/WeakReference;
    //   39: new 88	java/lang/ref/WeakReference
    //   42: dup
    //   43: aconst_null
    //   44: invokespecial 91	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   47: putstatic 97	com/d/a/a/t:aHx	Ljava/lang/ref/WeakReference;
    //   50: invokestatic 63	com/d/a/a/w:og	()Lcom/d/a/a/w;
    //   53: astore_3
    //   54: aload_0
    //   55: ifnull +183 -> 238
    //   58: aload_3
    //   59: aload_0
    //   60: new 99	com/d/a/a/n$c
    //   63: dup
    //   64: lload_1
    //   65: ldc2_w 100
    //   68: invokespecial 104	com/d/a/a/n$c:<init>	(JJ)V
    //   71: invokevirtual 107	com/d/a/a/w:a	(Landroid/os/Handler;Lcom/d/a/a/d$a;)V
    //   74: getstatic 112	com/d/a/a/y:aJN	Z
    //   77: ifeq +105 -> 182
    //   80: invokestatic 118	com/d/a/a/o:nM	()Ljava/lang/String;
    //   83: putstatic 121	com/d/a/a/y:aJU	Ljava/lang/String;
    //   86: new 123	java/lang/StringBuilder
    //   89: dup
    //   90: ldc 125
    //   92: invokespecial 128	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   95: getstatic 121	com/d/a/a/y:aJU	Ljava/lang/String;
    //   98: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: ldc -119
    //   106: invokestatic 141	com/d/a/a/o:l	(Ljava/lang/String;Ljava/lang/String;)Z
    //   109: pop
    //   110: new 123	java/lang/StringBuilder
    //   113: dup
    //   114: ldc -113
    //   116: invokespecial 128	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   119: getstatic 121	com/d/a/a/y:aJU	Ljava/lang/String;
    //   122: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: ldc -111
    //   130: invokestatic 141	com/d/a/a/o:l	(Ljava/lang/String;Ljava/lang/String;)Z
    //   133: pop
    //   134: new 123	java/lang/StringBuilder
    //   137: dup
    //   138: ldc -109
    //   140: invokespecial 128	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   143: getstatic 121	com/d/a/a/y:aJU	Ljava/lang/String;
    //   146: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: ldc -107
    //   154: invokestatic 141	com/d/a/a/o:l	(Ljava/lang/String;Ljava/lang/String;)Z
    //   157: pop
    //   158: new 123	java/lang/StringBuilder
    //   161: dup
    //   162: ldc -105
    //   164: invokespecial 128	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   167: getstatic 121	com/d/a/a/y:aJU	Ljava/lang/String;
    //   170: invokevirtual 132	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: ldc -103
    //   178: invokestatic 141	com/d/a/a/o:l	(Ljava/lang/String;Ljava/lang/String;)Z
    //   181: pop
    //   182: getstatic 155	com/d/a/a/t:aHy	Ljava/lang/ref/WeakReference;
    //   185: ifnull +47 -> 232
    //   188: getstatic 155	com/d/a/a/t:aHy	Ljava/lang/ref/WeakReference;
    //   191: invokevirtual 159	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   194: checkcast 18	com/d/a/a/t$e
    //   197: ifnull +35 -> 232
    //   200: getstatic 57	com/d/a/a/t:aHu	Landroid/content/Context;
    //   203: ldc -95
    //   205: invokevirtual 165	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   208: checkcast 167	android/location/LocationManager
    //   211: astore_0
    //   212: aload_0
    //   213: ldc -87
    //   215: invokevirtual 173	android/location/LocationManager:isProviderEnabled	(Ljava/lang/String;)Z
    //   218: istore 5
    //   220: iload 5
    //   222: ifne +10 -> 232
    //   225: aload_0
    //   226: ldc -81
    //   228: invokevirtual 173	android/location/LocationManager:isProviderEnabled	(Ljava/lang/String;)Z
    //   231: pop
    //   232: iconst_1
    //   233: putstatic 40	com/d/a/a/t:aDI	Z
    //   236: iconst_1
    //   237: ireturn
    //   238: new 177	android/os/Handler
    //   241: dup
    //   242: getstatic 57	com/d/a/a/t:aHu	Landroid/content/Context;
    //   245: invokevirtual 181	android/content/Context:getMainLooper	()Landroid/os/Looper;
    //   248: invokespecial 184	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   251: astore_0
    //   252: goto -194 -> 58
    //   255: astore_0
    //   256: iconst_0
    //   257: putstatic 40	com/d/a/a/t:aDI	Z
    //   260: iconst_0
    //   261: ireturn
    //   262: astore_3
    //   263: iconst_0
    //   264: istore 5
    //   266: goto -46 -> 220
    //   269: astore_0
    //   270: goto -38 -> 232
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	273	0	paramHandler	android.os.Handler
    //   0	273	1	paramLong	long
    //   0	273	3	paramb	b
    //   0	273	4	paramd	d
    //   218	47	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   50	54	255	java/lang/Exception
    //   58	182	255	java/lang/Exception
    //   182	212	255	java/lang/Exception
    //   212	220	255	java/lang/Exception
    //   225	232	255	java/lang/Exception
    //   232	236	255	java/lang/Exception
    //   238	252	255	java/lang/Exception
    //   212	220	262	java/lang/SecurityException
    //   225	232	269	java/lang/SecurityException
  }
  
  public static void finish()
  {
    try
    {
      w.og().nF();
      return;
    }
    catch (Exception localException) {}
  }
  
  public static void oa()
  {
    try
    {
      w.og().stop();
      aDI = false;
      return;
    }
    catch (Exception localException)
    {
      localException = localException;
      aDI = false;
      return;
    }
    finally
    {
      localObject = finally;
      aDI = false;
      throw ((Throwable)localObject);
    }
  }
  
  public static void setImei(String paramString)
  {
    imei = paramString;
  }
  
  private static final class a
    implements m
  {
    public final void a(p paramp)
    {
      switch (paramp.what)
      {
      }
      do
      {
        do
        {
          Object localObject;
          do
          {
            do
            {
              do
              {
                do
                {
                  return;
                } while (t.aHv == null);
                localObject = (t.b)t.aHv.get();
              } while (localObject == null);
              paramp = (n.a)paramp;
              ((t.b)localObject).a(paramp.lat, paramp.lng, paramp.aGk, paramp.aGl, paramp.aGm);
              return;
            } while (t.aHw == null);
            localObject = (t.d)t.aHw.get();
          } while (localObject == null);
          paramp = (n.b)paramp;
          ((t.d)localObject).onMessage(paramp.code, paramp.message);
          return;
        } while ((t.aHx == null) || ((t.c)t.aHx.get() == null));
        return;
      } while (t.aHx == null);
      t.aHx.get();
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, long paramLong);
  }
  
  public static abstract interface c {}
  
  public static abstract interface d
  {
    public abstract void onMessage(int paramInt, String paramString);
  }
  
  public static abstract interface e {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */