package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.w;
import java.util.HashSet;
import java.util.Set;

public final class ac
{
  private final q aeb;
  private volatile Boolean aec;
  private String aed;
  private Set<Integer> aee;
  
  protected ac(q paramq)
  {
    w.aa(paramq);
    this.aeb = paramq;
  }
  
  public static boolean ji()
  {
    return ((Boolean)aj.aep.get()).booleanValue();
  }
  
  public static int jj()
  {
    return ((Integer)aj.aeM.get()).intValue();
  }
  
  public static long jk()
  {
    return ((Long)aj.aex.get()).longValue();
  }
  
  public static long jl()
  {
    return ((Long)aj.aeA.get()).longValue();
  }
  
  public static int jm()
  {
    return ((Integer)aj.aeC.get()).intValue();
  }
  
  public static int jn()
  {
    return ((Integer)aj.aeD.get()).intValue();
  }
  
  public static String jo()
  {
    return (String)aj.aeF.get();
  }
  
  public static String jp()
  {
    return (String)aj.aeE.get();
  }
  
  public static String jq()
  {
    return (String)aj.aeG.get();
  }
  
  public static long js()
  {
    return ((Long)aj.aeU.get()).longValue();
  }
  
  /* Error */
  public final boolean jh()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 100	com/google/android/gms/analytics/internal/ac:aec	Ljava/lang/Boolean;
    //   4: ifnonnull +129 -> 133
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 100	com/google/android/gms/analytics/internal/ac:aec	Ljava/lang/Boolean;
    //   13: ifnonnull +118 -> 131
    //   16: aload_0
    //   17: getfield 26	com/google/android/gms/analytics/internal/ac:aeb	Lcom/google/android/gms/analytics/internal/q;
    //   20: getfield 106	com/google/android/gms/analytics/internal/q:mContext	Landroid/content/Context;
    //   23: invokevirtual 112	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   26: astore_3
    //   27: aload_0
    //   28: getfield 26	com/google/android/gms/analytics/internal/ac:aeb	Lcom/google/android/gms/analytics/internal/q;
    //   31: getfield 106	com/google/android/gms/analytics/internal/q:mContext	Landroid/content/Context;
    //   34: invokestatic 117	android/os/Process:myPid	()I
    //   37: invokestatic 123	com/google/android/gms/c/aa:n	(Landroid/content/Context;I)Ljava/lang/String;
    //   40: astore_2
    //   41: aload_3
    //   42: ifnull +30 -> 72
    //   45: aload_3
    //   46: getfield 128	android/content/pm/ApplicationInfo:processName	Ljava/lang/String;
    //   49: astore_3
    //   50: aload_3
    //   51: ifnull +90 -> 141
    //   54: aload_3
    //   55: aload_2
    //   56: invokevirtual 132	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   59: ifeq +82 -> 141
    //   62: iconst_1
    //   63: istore_1
    //   64: aload_0
    //   65: iload_1
    //   66: invokestatic 136	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   69: putfield 100	com/google/android/gms/analytics/internal/ac:aec	Ljava/lang/Boolean;
    //   72: aload_0
    //   73: getfield 100	com/google/android/gms/analytics/internal/ac:aec	Ljava/lang/Boolean;
    //   76: ifnull +13 -> 89
    //   79: aload_0
    //   80: getfield 100	com/google/android/gms/analytics/internal/ac:aec	Ljava/lang/Boolean;
    //   83: invokevirtual 46	java/lang/Boolean:booleanValue	()Z
    //   86: ifne +19 -> 105
    //   89: ldc -118
    //   91: aload_2
    //   92: invokevirtual 132	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   95: ifeq +10 -> 105
    //   98: aload_0
    //   99: getstatic 141	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   102: putfield 100	com/google/android/gms/analytics/internal/ac:aec	Ljava/lang/Boolean;
    //   105: aload_0
    //   106: getfield 100	com/google/android/gms/analytics/internal/ac:aec	Ljava/lang/Boolean;
    //   109: ifnonnull +22 -> 131
    //   112: aload_0
    //   113: getstatic 141	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   116: putfield 100	com/google/android/gms/analytics/internal/ac:aec	Ljava/lang/Boolean;
    //   119: aload_0
    //   120: getfield 26	com/google/android/gms/analytics/internal/ac:aeb	Lcom/google/android/gms/analytics/internal/q;
    //   123: invokevirtual 145	com/google/android/gms/analytics/internal/q:iE	()Lcom/google/android/gms/analytics/internal/f;
    //   126: ldc -109
    //   128: invokevirtual 153	com/google/android/gms/analytics/internal/f:R	(Ljava/lang/String;)V
    //   131: aload_0
    //   132: monitorexit
    //   133: aload_0
    //   134: getfield 100	com/google/android/gms/analytics/internal/ac:aec	Ljava/lang/Boolean;
    //   137: invokevirtual 46	java/lang/Boolean:booleanValue	()Z
    //   140: ireturn
    //   141: iconst_0
    //   142: istore_1
    //   143: goto -79 -> 64
    //   146: astore_2
    //   147: aload_0
    //   148: monitorexit
    //   149: aload_2
    //   150: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	151	0	this	ac
    //   63	80	1	bool	boolean
    //   40	52	2	str	String
    //   146	4	2	localObject1	Object
    //   26	29	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   9	41	146	finally
    //   45	50	146	finally
    //   54	62	146	finally
    //   64	72	146	finally
    //   72	89	146	finally
    //   89	105	146	finally
    //   105	131	146	finally
    //   131	133	146	finally
    //   147	149	146	finally
  }
  
  public final Set<Integer> jr()
  {
    String str1 = (String)aj.aeP.get();
    String[] arrayOfString;
    HashSet localHashSet;
    int j;
    int i;
    if ((this.aee == null) || (this.aed == null) || (!this.aed.equals(str1)))
    {
      arrayOfString = TextUtils.split(str1, ",");
      localHashSet = new HashSet();
      j = arrayOfString.length;
      i = 0;
    }
    for (;;)
    {
      String str2;
      if (i < j) {
        str2 = arrayOfString[i];
      }
      try
      {
        localHashSet.add(Integer.valueOf(Integer.parseInt(str2)));
        i += 1;
        continue;
        this.aed = str1;
        this.aee = localHashSet;
        return this.aee;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */