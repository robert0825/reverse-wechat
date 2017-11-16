package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class k
{
  private static k xVg;
  private Context sN;
  Map<String, Object> xVh = new HashMap();
  public SharedPreferences xVi;
  
  private k(Context paramContext)
  {
    this.xVi = paramContext.getSharedPreferences("tbs_download_config", 4);
    this.sN = paramContext.getApplicationContext();
  }
  
  public static k coc()
  {
    try
    {
      k localk = xVg;
      return localk;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static k gl(Context paramContext)
  {
    try
    {
      if (xVg == null) {
        xVg = new k(paramContext);
      }
      paramContext = xVg;
      return paramContext;
    }
    finally {}
  }
  
  /* Error */
  public final void Ff(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 33	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   6: invokeinterface 58 1 0
    //   11: astore_2
    //   12: aload_2
    //   13: ldc 60
    //   15: iload_1
    //   16: invokeinterface 66 3 0
    //   21: pop
    //   22: aload_2
    //   23: ldc 68
    //   25: invokestatic 74	java/lang/System:currentTimeMillis	()J
    //   28: invokeinterface 78 4 0
    //   33: pop
    //   34: aload_2
    //   35: invokeinterface 82 1 0
    //   40: pop
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: astore_2
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_2
    //   48: athrow
    //   49: astore_2
    //   50: goto -9 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	k
    //   0	53	1	paramInt	int
    //   11	24	2	localEditor	SharedPreferences.Editor
    //   44	4	2	localObject	Object
    //   49	1	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   2	41	44	finally
    //   2	41	49	java/lang/Exception
  }
  
  public final void Fg(int paramInt)
  {
    try
    {
      SharedPreferences.Editor localEditor = this.xVi.edit();
      localEditor.putInt("tbs_install_interrupt_code", paramInt);
      localEditor.commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final long cod()
  {
    try
    {
      int i = this.xVi.getInt("tbs_download_maxflow", 0);
      int j = i;
      if (i == 0) {
        j = 20;
      }
      long l = j * 1024;
      return l * 1024L;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final long coe()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 100	com/tencent/smtt/sdk/l:coq	()J
    //   5: lconst_0
    //   6: lcmp
    //   7: iflt +11 -> 18
    //   10: invokestatic 100	com/tencent/smtt/sdk/l:coq	()J
    //   13: lstore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: lload_1
    //   17: lreturn
    //   18: aload_0
    //   19: getfield 33	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   22: ldc 102
    //   24: ldc2_w 103
    //   27: invokeinterface 108 4 0
    //   32: lstore_1
    //   33: goto -19 -> 14
    //   36: astore_3
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_3
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	k
    //   13	20	1	l	long
    //   36	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	36	finally
    //   18	33	36	finally
  }
  
  /* Error */
  public final long cof()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 33	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   8: ldc 111
    //   10: iconst_0
    //   11: invokeinterface 92 3 0
    //   16: istore_2
    //   17: iload_2
    //   18: ifne +18 -> 36
    //   21: iload_1
    //   22: sipush 1024
    //   25: imul
    //   26: i2l
    //   27: lstore_3
    //   28: aload_0
    //   29: monitorexit
    //   30: lload_3
    //   31: ldc2_w 93
    //   34: lmul
    //   35: lreturn
    //   36: iload_2
    //   37: istore_1
    //   38: goto -17 -> 21
    //   41: astore 5
    //   43: aload_0
    //   44: monitorexit
    //   45: aload 5
    //   47: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	k
    //   1	37	1	i	int
    //   16	21	2	j	int
    //   27	4	3	l	long
    //   41	5	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	17	41	finally
  }
  
  public final int cog()
  {
    try
    {
      int i = this.xVi.getInt("tbs_download_success_max_retrytimes", 0);
      int j = i;
      if (i == 0) {
        j = 3;
      }
      return j;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final int coh()
  {
    try
    {
      int i = this.xVi.getInt("tbs_download_failed_max_retrytimes", 0);
      int j = i;
      if (i == 0) {
        j = 100;
      }
      return j;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final int coi()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 33	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   6: ldc 60
    //   8: invokeinterface 125 2 0
    //   13: istore_3
    //   14: iload_3
    //   15: ifne +124 -> 139
    //   18: new 127	java/io/File
    //   21: dup
    //   22: new 127	java/io/File
    //   25: dup
    //   26: aload_0
    //   27: getfield 39	com/tencent/smtt/sdk/k:sN	Landroid/content/Context;
    //   30: invokevirtual 131	android/content/Context:getFilesDir	()Ljava/io/File;
    //   33: ldc -123
    //   35: invokespecial 136	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   38: ldc 25
    //   40: invokespecial 136	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   43: invokevirtual 139	java/io/File:exists	()Z
    //   46: istore_3
    //   47: iload_3
    //   48: ifne +55 -> 103
    //   51: bipush -97
    //   53: istore_1
    //   54: aload_0
    //   55: getfield 39	com/tencent/smtt/sdk/k:sN	Landroid/content/Context;
    //   58: ifnull +156 -> 214
    //   61: ldc -115
    //   63: aload_0
    //   64: getfield 39	com/tencent/smtt/sdk/k:sN	Landroid/content/Context;
    //   67: invokevirtual 145	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   70: getfield 151	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   73: invokevirtual 157	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   76: ifeq +138 -> 214
    //   79: ldc -97
    //   81: invokestatic 165	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   84: invokevirtual 169	java/util/Locale:getCountry	()Ljava/lang/String;
    //   87: invokevirtual 157	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   90: istore_3
    //   91: iload_3
    //   92: ifne +122 -> 214
    //   95: sipush 65216
    //   98: istore_1
    //   99: aload_0
    //   100: monitorexit
    //   101: iload_1
    //   102: ireturn
    //   103: aload_0
    //   104: getfield 33	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   107: ldc -85
    //   109: invokeinterface 125 2 0
    //   114: istore_3
    //   115: iload_3
    //   116: ifne +9 -> 125
    //   119: bipush -96
    //   121: istore_1
    //   122: goto -68 -> 54
    //   125: bipush -101
    //   127: istore_1
    //   128: goto -74 -> 54
    //   131: astore 4
    //   133: bipush -95
    //   135: istore_1
    //   136: goto -82 -> 54
    //   139: aload_0
    //   140: getfield 33	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   143: ldc 60
    //   145: bipush -99
    //   147: invokeinterface 92 3 0
    //   152: istore_1
    //   153: iload_1
    //   154: bipush -119
    //   156: if_icmpeq +11 -> 167
    //   159: iload_1
    //   160: istore_2
    //   161: iload_1
    //   162: bipush -121
    //   164: if_icmpne +17 -> 181
    //   167: aload_0
    //   168: getfield 33	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   171: ldc -83
    //   173: bipush -119
    //   175: invokeinterface 92 3 0
    //   180: istore_2
    //   181: iload_2
    //   182: istore_1
    //   183: invokestatic 74	java/lang/System:currentTimeMillis	()J
    //   186: aload_0
    //   187: getfield 33	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   190: ldc 68
    //   192: lconst_0
    //   193: invokeinterface 108 4 0
    //   198: lsub
    //   199: ldc2_w 174
    //   202: lcmp
    //   203: ifle -149 -> 54
    //   206: iload_2
    //   207: ldc -80
    //   209: isub
    //   210: istore_1
    //   211: goto -157 -> 54
    //   214: aload_0
    //   215: getfield 33	com/tencent/smtt/sdk/k:xVi	Landroid/content/SharedPreferences;
    //   218: ldc 85
    //   220: iconst_m1
    //   221: invokeinterface 92 3 0
    //   226: istore_2
    //   227: iload_1
    //   228: sipush 1000
    //   231: imul
    //   232: iload_2
    //   233: iadd
    //   234: istore_1
    //   235: goto -136 -> 99
    //   238: astore 4
    //   240: aload_0
    //   241: monitorexit
    //   242: aload 4
    //   244: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	245	0	this	k
    //   53	182	1	i	int
    //   160	74	2	j	int
    //   13	103	3	bool	boolean
    //   131	1	4	localThrowable	Throwable
    //   238	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   18	47	131	java/lang/Throwable
    //   103	115	131	java/lang/Throwable
    //   2	14	238	finally
    //   18	47	238	finally
    //   54	91	238	finally
    //   103	115	238	finally
    //   139	153	238	finally
    //   167	181	238	finally
    //   183	206	238	finally
    //   214	227	238	finally
  }
  
  public final void commit()
  {
    for (;;)
    {
      String str;
      Object localObject2;
      try
      {
        SharedPreferences.Editor localEditor = this.xVi.edit();
        Iterator localIterator = this.xVh.keySet().iterator();
        if (!localIterator.hasNext()) {
          break label199;
        }
        str = (String)localIterator.next();
        localObject2 = this.xVh.get(str);
        if ((localObject2 instanceof String))
        {
          localEditor.putString(str, (String)localObject2);
          continue;
        }
      }
      catch (Exception localException)
      {
        return;
        if ((localObject2 instanceof Boolean))
        {
          localException.putBoolean(str, ((Boolean)localObject2).booleanValue());
          continue;
        }
      }
      finally {}
      if ((localObject2 instanceof Long))
      {
        ((SharedPreferences.Editor)localObject1).putLong(str, ((Long)localObject2).longValue());
      }
      else if ((localObject2 instanceof Integer))
      {
        ((SharedPreferences.Editor)localObject1).putInt(str, ((Integer)localObject2).intValue());
      }
      else if ((localObject2 instanceof Float))
      {
        ((SharedPreferences.Editor)localObject1).putFloat(str, ((Float)localObject2).floatValue());
        continue;
        label199:
        ((SharedPreferences.Editor)localObject1).commit();
        this.xVh.clear();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */