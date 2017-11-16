package com.tencent.mm.plugin.traceroute.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
  public static String qzX;
  public static c qzY;
  private final String TAG;
  private boolean qAa;
  public f qAb;
  public Map<String, Set<Integer>> qAc;
  public e qAd;
  public d qAe;
  public c qAf;
  public b qAg;
  private final int qzZ;
  public String userName;
  
  public a(String paramString)
  {
    GMTrace.i(9989422841856L, 74427);
    this.TAG = "MicroMsg.MMTraceRoute";
    this.qzZ = 64;
    this.qAa = false;
    this.qAb = new f((byte)0);
    this.qAc = new HashMap();
    this.userName = paramString;
    qzX = h.getExternalStorageDirectory().getAbsolutePath() + "/tencent/traceroute_log_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date()).toString() + ".log";
    GMTrace.o(9989422841856L, 74427);
  }
  
  public final void a(String paramString1, String paramString2, Integer paramInteger)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(9989825495040L, 74430);
        if ((paramString1 == null) || (paramString2 == null) || (paramInteger.intValue() < 0))
        {
          GMTrace.o(9989825495040L, 74430);
          return;
        }
        if (!this.qAb.containsKey(paramString1))
        {
          ConcurrentHashMap localConcurrentHashMap = new ConcurrentHashMap();
          localConcurrentHashMap.put(paramInteger, new StringBuilder(paramString2));
          this.qAb.put(paramString1, (ConcurrentHashMap)localConcurrentHashMap);
          GMTrace.o(9989825495040L, 74430);
          continue;
        }
        if (!((ConcurrentHashMap)this.qAb.get(paramString1)).containsKey(paramInteger)) {
          break label155;
        }
      }
      finally {}
      ((StringBuilder)((ConcurrentHashMap)this.qAb.get(paramString1)).get(paramInteger)).append(paramString2);
      GMTrace.o(9989825495040L, 74430);
      continue;
      label155:
      new ConcurrentHashMap().put(paramInteger, new StringBuilder(paramString2));
      ((ConcurrentHashMap)this.qAb.get(paramString1)).put(paramInteger, new StringBuilder(paramString2));
      GMTrace.o(9989825495040L, 74430);
    }
  }
  
  public final void b(String[] paramArrayOfString, boolean paramBoolean)
  {
    GMTrace.i(9989691277312L, 74429);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      w.e("MicroMsg.MMTraceRoute", "no ip contains");
      GMTrace.o(9989691277312L, 74429);
      return;
    }
    String str;
    int i;
    label65:
    Object localObject;
    String[] arrayOfString;
    if (paramBoolean)
    {
      str = "" + "long: ";
      int j = paramArrayOfString.length;
      i = 0;
      if (i >= j) {
        break label279;
      }
      localObject = paramArrayOfString[i];
      arrayOfString = ((String)localObject).split(":");
      if ((arrayOfString != null) && (arrayOfString.length == 3)) {
        break label151;
      }
      w.e("MicroMsg.MMTraceRoute", "err ip " + (String)localObject);
    }
    for (;;)
    {
      i += 1;
      break label65;
      str = "" + "short: ";
      break;
      label151:
      if (!this.qAc.containsKey(arrayOfString[0]))
      {
        localObject = new HashSet();
        ((Set)localObject).add(Integer.valueOf(bg.getInt(arrayOfString[1], 0)));
        this.qAc.put(arrayOfString[0], localObject);
        str = str + arrayOfString[0] + " ";
      }
      else
      {
        ((Set)this.qAc.get(arrayOfString[0])).add(Integer.valueOf(bg.getInt(arrayOfString[1], 0)));
      }
    }
    label279:
    paramArrayOfString = str + "\n";
    e.d(qzX, paramArrayOfString.getBytes());
    GMTrace.o(9989691277312L, 74429);
  }
  
  public final boolean bsP()
  {
    try
    {
      GMTrace.i(9989154406400L, 74425);
      boolean bool = this.qAa;
      GMTrace.o(9989154406400L, 74425);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final void bsQ()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 239
    //   5: ldc -15
    //   7: invokestatic 72	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 85	com/tencent/mm/plugin/traceroute/b/a:qAb	Lcom/tencent/mm/plugin/traceroute/b/a$f;
    //   14: ifnull +590 -> 604
    //   17: aload_0
    //   18: getfield 85	com/tencent/mm/plugin/traceroute/b/a:qAb	Lcom/tencent/mm/plugin/traceroute/b/a$f;
    //   21: astore 6
    //   23: new 103	java/io/File
    //   26: dup
    //   27: getstatic 136	com/tencent/mm/plugin/traceroute/b/a:qzX	Ljava/lang/String;
    //   30: invokespecial 242	java/io/File:<init>	(Ljava/lang/String;)V
    //   33: astore 4
    //   35: aload 4
    //   37: invokevirtual 245	java/io/File:exists	()Z
    //   40: istore_3
    //   41: iload_3
    //   42: ifne +45 -> 87
    //   45: aload 4
    //   47: invokevirtual 248	java/io/File:createNewFile	()Z
    //   50: pop
    //   51: getstatic 136	com/tencent/mm/plugin/traceroute/b/a:qzX	Ljava/lang/String;
    //   54: new 94	java/lang/StringBuilder
    //   57: dup
    //   58: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   61: aload 6
    //   63: getfield 252	com/tencent/mm/plugin/traceroute/b/a$f:qAi	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   66: getfield 92	com/tencent/mm/plugin/traceroute/b/a:userName	Ljava/lang/String;
    //   69: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: ldc -35
    //   74: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: invokevirtual 225	java/lang/String:getBytes	()[B
    //   83: invokestatic 230	com/tencent/mm/a/e:d	(Ljava/lang/String;[B)I
    //   86: pop
    //   87: aload 6
    //   89: getfield 252	com/tencent/mm/plugin/traceroute/b/a$f:qAi	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   92: getfield 85	com/tencent/mm/plugin/traceroute/b/a:qAb	Lcom/tencent/mm/plugin/traceroute/b/a$f;
    //   95: invokevirtual 256	com/tencent/mm/plugin/traceroute/b/a$f:entrySet	()Ljava/util/Set;
    //   98: invokeinterface 260 1 0
    //   103: astore 7
    //   105: aload 7
    //   107: invokeinterface 265 1 0
    //   112: ifeq +357 -> 469
    //   115: aload 7
    //   117: invokeinterface 269 1 0
    //   122: checkcast 271	java/util/Map$Entry
    //   125: invokeinterface 274 1 0
    //   130: checkcast 128	java/lang/String
    //   133: astore 8
    //   135: aload 8
    //   137: invokestatic 278	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   140: ifne -35 -> 105
    //   143: aload 6
    //   145: getfield 252	com/tencent/mm/plugin/traceroute/b/a$f:qAi	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   148: getfield 85	com/tencent/mm/plugin/traceroute/b/a:qAb	Lcom/tencent/mm/plugin/traceroute/b/a$f;
    //   151: aload 8
    //   153: invokevirtual 154	com/tencent/mm/plugin/traceroute/b/a$f:containsKey	(Ljava/lang/Object;)Z
    //   156: ifeq -51 -> 105
    //   159: aload 6
    //   161: getfield 252	com/tencent/mm/plugin/traceroute/b/a$f:qAi	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   164: getfield 85	com/tencent/mm/plugin/traceroute/b/a:qAb	Lcom/tencent/mm/plugin/traceroute/b/a$f;
    //   167: aload 8
    //   169: invokevirtual 169	com/tencent/mm/plugin/traceroute/b/a$f:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   172: checkcast 160	java/util/Map
    //   175: astore 9
    //   177: aload 9
    //   179: ifnull -74 -> 105
    //   182: ldc -71
    //   184: astore 4
    //   186: aload 9
    //   188: invokeinterface 281 1 0
    //   193: iconst_1
    //   194: if_icmpne +169 -> 363
    //   197: aload 9
    //   199: iconst_1
    //   200: invokestatic 211	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   203: invokeinterface 219 2 0
    //   208: ifnull +155 -> 363
    //   211: new 94	java/lang/StringBuilder
    //   214: dup
    //   215: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   218: ldc -71
    //   220: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: aload 9
    //   225: iconst_1
    //   226: invokestatic 211	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   229: invokeinterface 219 2 0
    //   234: checkcast 94	java/lang/StringBuilder
    //   237: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   240: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   246: astore 5
    //   248: aload 5
    //   250: invokevirtual 284	java/lang/String:length	()I
    //   253: ifle -148 -> 105
    //   256: ldc 74
    //   258: new 94	java/lang/StringBuilder
    //   261: dup
    //   262: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   265: aload 8
    //   267: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: aload 5
    //   272: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   278: invokestatic 286	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   281: getstatic 136	com/tencent/mm/plugin/traceroute/b/a:qzX	Ljava/lang/String;
    //   284: aload 5
    //   286: invokevirtual 225	java/lang/String:getBytes	()[B
    //   289: invokestatic 230	com/tencent/mm/a/e:d	(Ljava/lang/String;[B)I
    //   292: pop
    //   293: goto -188 -> 105
    //   296: astore 4
    //   298: aload_0
    //   299: monitorexit
    //   300: aload 4
    //   302: athrow
    //   303: astore 4
    //   305: ldc 74
    //   307: new 94	java/lang/StringBuilder
    //   310: dup
    //   311: ldc_w 288
    //   314: invokespecial 158	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   317: aload 4
    //   319: invokevirtual 291	java/io/IOException:getMessage	()Ljava/lang/String;
    //   322: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   328: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   331: ldc 74
    //   333: aload 4
    //   335: ldc -71
    //   337: iconst_0
    //   338: anewarray 4	java/lang/Object
    //   341: invokestatic 295	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   344: aload 6
    //   346: getfield 252	com/tencent/mm/plugin/traceroute/b/a$f:qAi	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   349: invokevirtual 298	com/tencent/mm/plugin/traceroute/b/a:reportFailed	()V
    //   352: ldc2_w 239
    //   355: ldc -15
    //   357: invokestatic 139	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   360: aload_0
    //   361: monitorexit
    //   362: return
    //   363: iconst_0
    //   364: istore_2
    //   365: iconst_0
    //   366: istore_1
    //   367: aload 4
    //   369: astore 5
    //   371: iload_2
    //   372: aload 9
    //   374: invokeinterface 281 1 0
    //   379: if_icmpge -131 -> 248
    //   382: aload 4
    //   384: astore 5
    //   386: iload_1
    //   387: ifne -139 -> 248
    //   390: aload 9
    //   392: iload_2
    //   393: invokestatic 211	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   396: invokeinterface 219 2 0
    //   401: ifnull +214 -> 615
    //   404: aload 9
    //   406: iload_2
    //   407: invokestatic 211	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   410: invokeinterface 219 2 0
    //   415: checkcast 94	java/lang/StringBuilder
    //   418: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   421: astore 5
    //   423: aload 5
    //   425: invokestatic 278	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   428: ifne +187 -> 615
    //   431: new 94	java/lang/StringBuilder
    //   434: dup
    //   435: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   438: aload 4
    //   440: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   443: aload 5
    //   445: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   448: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   451: astore 4
    //   453: aload 5
    //   455: ldc_w 300
    //   458: invokevirtual 304	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   461: ifeq +157 -> 618
    //   464: iconst_1
    //   465: istore_1
    //   466: goto +152 -> 618
    //   469: getstatic 136	com/tencent/mm/plugin/traceroute/b/a:qzX	Ljava/lang/String;
    //   472: iconst_0
    //   473: iconst_m1
    //   474: invokestatic 307	com/tencent/mm/a/e:c	(Ljava/lang/String;II)[B
    //   477: astore 5
    //   479: aload 5
    //   481: invokestatic 311	com/tencent/mm/sdk/platformtools/bg:bq	([B)Z
    //   484: ifeq +30 -> 514
    //   487: ldc 74
    //   489: ldc_w 313
    //   492: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   495: aload 6
    //   497: getfield 252	com/tencent/mm/plugin/traceroute/b/a$f:qAi	Lcom/tencent/mm/plugin/traceroute/b/a;
    //   500: invokevirtual 298	com/tencent/mm/plugin/traceroute/b/a:reportFailed	()V
    //   503: ldc2_w 239
    //   506: ldc -15
    //   508: invokestatic 139	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   511: goto -151 -> 360
    //   514: aload 5
    //   516: arraylength
    //   517: istore_1
    //   518: ldc_w 315
    //   521: iconst_2
    //   522: anewarray 4	java/lang/Object
    //   525: dup
    //   526: iconst_0
    //   527: getstatic 320	com/tencent/mm/protocal/d:tJC	I
    //   530: invokestatic 211	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   533: aastore
    //   534: dup
    //   535: iconst_1
    //   536: iload_1
    //   537: invokestatic 211	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   540: aastore
    //   541: invokestatic 323	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   544: invokevirtual 225	java/lang/String:getBytes	()[B
    //   547: invokestatic 329	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   550: invokevirtual 332	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   553: astore 4
    //   555: aload 5
    //   557: invokestatic 338	com/tencent/mm/a/q:l	([B)[B
    //   560: astore 5
    //   562: new 340	com/tencent/mm/pointers/PByteArray
    //   565: dup
    //   566: invokespecial 341	com/tencent/mm/pointers/PByteArray:<init>	()V
    //   569: astore 7
    //   571: aload 7
    //   573: aload 5
    //   575: aload 4
    //   577: invokevirtual 225	java/lang/String:getBytes	()[B
    //   580: invokestatic 346	com/tencent/mm/a/c:a	(Lcom/tencent/mm/pointers/PByteArray;[B[B)I
    //   583: pop
    //   584: new 24	com/tencent/mm/plugin/traceroute/b/a$f$1
    //   587: dup
    //   588: aload 6
    //   590: iload_1
    //   591: aload 4
    //   593: aload 7
    //   595: invokespecial 349	com/tencent/mm/plugin/traceroute/b/a$f$1:<init>	(Lcom/tencent/mm/plugin/traceroute/b/a$f;ILjava/lang/String;Lcom/tencent/mm/pointers/PByteArray;)V
    //   598: ldc_w 351
    //   601: invokestatic 357	com/tencent/mm/sdk/f/e:post	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   604: ldc2_w 239
    //   607: ldc -15
    //   609: invokestatic 139	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   612: goto -252 -> 360
    //   615: goto +3 -> 618
    //   618: iload_2
    //   619: iconst_1
    //   620: iadd
    //   621: istore_2
    //   622: goto -255 -> 367
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	625	0	this	a
    //   366	225	1	i	int
    //   364	258	2	j	int
    //   40	2	3	bool	boolean
    //   33	152	4	localObject1	Object
    //   296	5	4	localObject2	Object
    //   303	136	4	localIOException	java.io.IOException
    //   451	141	4	str1	String
    //   246	328	5	localObject3	Object
    //   21	568	6	localf	f
    //   103	491	7	localObject4	Object
    //   133	133	8	str2	String
    //   175	230	9	localMap	Map
    // Exception table:
    //   from	to	target	type
    //   2	41	296	finally
    //   45	87	296	finally
    //   87	105	296	finally
    //   105	177	296	finally
    //   186	248	296	finally
    //   248	293	296	finally
    //   305	360	296	finally
    //   371	382	296	finally
    //   390	464	296	finally
    //   469	511	296	finally
    //   514	604	296	finally
    //   604	612	296	finally
    //   45	87	303	java/io/IOException
  }
  
  public final void ip(boolean paramBoolean)
  {
    try
    {
      GMTrace.i(9989288624128L, 74426);
      this.qAa = paramBoolean;
      GMTrace.o(9989288624128L, 74426);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void reportFailed()
  {
    GMTrace.i(16052440268800L, 119600);
    if (this.qAg != null) {
      this.qAg.bsR();
    }
    GMTrace.o(16052440268800L, 119600);
  }
  
  public final void stop()
  {
    GMTrace.i(9989557059584L, 74428);
    ip(true);
    if (qzY != null) {
      try
      {
        qzY.shutdownNow();
        GMTrace.o(9989557059584L, 74428);
        return;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MMTraceRoute", "failed to shutdown threadpool: " + localException.getMessage());
      }
    }
    GMTrace.o(9989557059584L, 74428);
  }
  
  private final class a
    implements Runnable
  {
    private String ip;
    private Set<Integer> qAh;
    
    public a(Set<Integer> paramSet)
    {
      GMTrace.i(9988483317760L, 74420);
      this.ip = paramSet;
      Set localSet;
      this.qAh = localSet;
      GMTrace.o(9988483317760L, 74420);
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: ldc2_w 50
      //   3: ldc 52
      //   5: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: ldc 54
      //   10: iconst_1
      //   11: anewarray 4	java/lang/Object
      //   14: dup
      //   15: iconst_0
      //   16: aload_0
      //   17: getfield 34	com/tencent/mm/plugin/traceroute/b/a$a:ip	Ljava/lang/String;
      //   20: aastore
      //   21: invokestatic 60	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   24: astore 6
      //   26: aload_0
      //   27: getfield 20	com/tencent/mm/plugin/traceroute/b/a$a:qAi	Lcom/tencent/mm/plugin/traceroute/b/a;
      //   30: aload_0
      //   31: getfield 34	com/tencent/mm/plugin/traceroute/b/a$a:ip	Ljava/lang/String;
      //   34: aload 6
      //   36: iconst_1
      //   37: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   40: invokevirtual 69	com/tencent/mm/plugin/traceroute/b/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
      //   43: aload_0
      //   44: getfield 36	com/tencent/mm/plugin/traceroute/b/a$a:qAh	Ljava/util/Set;
      //   47: invokeinterface 75 1 0
      //   52: astore 9
      //   54: aload 9
      //   56: invokeinterface 81 1 0
      //   61: ifeq +716 -> 777
      //   64: aload 9
      //   66: invokeinterface 85 1 0
      //   71: checkcast 62	java/lang/Integer
      //   74: astore 6
      //   76: aload_0
      //   77: getfield 20	com/tencent/mm/plugin/traceroute/b/a$a:qAi	Lcom/tencent/mm/plugin/traceroute/b/a;
      //   80: astore 10
      //   82: aload_0
      //   83: getfield 34	com/tencent/mm/plugin/traceroute/b/a$a:ip	Ljava/lang/String;
      //   86: astore 11
      //   88: aload 6
      //   90: invokevirtual 89	java/lang/Integer:intValue	()I
      //   93: istore_1
      //   94: new 91	java/net/Socket
      //   97: dup
      //   98: invokespecial 92	java/net/Socket:<init>	()V
      //   101: astore 7
      //   103: aload 7
      //   105: astore 6
      //   107: aload 7
      //   109: sipush 5000
      //   112: invokevirtual 96	java/net/Socket:setSoTimeout	(I)V
      //   115: aload 7
      //   117: astore 6
      //   119: invokestatic 102	com/tencent/mm/sdk/platformtools/bg:Pv	()J
      //   122: lstore_2
      //   123: aload 7
      //   125: astore 6
      //   127: aload 7
      //   129: new 104	java/net/InetSocketAddress
      //   132: dup
      //   133: aload 11
      //   135: iload_1
      //   136: invokespecial 107	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
      //   139: invokevirtual 111	java/net/Socket:connect	(Ljava/net/SocketAddress;)V
      //   142: aload 7
      //   144: astore 6
      //   146: invokestatic 102	com/tencent/mm/sdk/platformtools/bg:Pv	()J
      //   149: lstore 4
      //   151: aload 7
      //   153: astore 6
      //   155: ldc 113
      //   157: new 115	java/lang/StringBuilder
      //   160: dup
      //   161: ldc 117
      //   163: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   166: aload 11
      //   168: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   171: ldc 126
      //   173: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   176: iload_1
      //   177: invokevirtual 129	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   180: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   183: invokestatic 138	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   186: aload 7
      //   188: astore 6
      //   190: aload 10
      //   192: aload 11
      //   194: ldc -116
      //   196: iconst_2
      //   197: anewarray 4	java/lang/Object
      //   200: dup
      //   201: iconst_0
      //   202: iload_1
      //   203: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   206: aastore
      //   207: dup
      //   208: iconst_1
      //   209: lload 4
      //   211: lload_2
      //   212: lsub
      //   213: invokestatic 145	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   216: aastore
      //   217: invokestatic 60	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   220: iconst_1
      //   221: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   224: invokevirtual 69	com/tencent/mm/plugin/traceroute/b/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
      //   227: aload 7
      //   229: invokevirtual 148	java/net/Socket:close	()V
      //   232: goto -178 -> 54
      //   235: astore 6
      //   237: ldc 113
      //   239: new 115	java/lang/StringBuilder
      //   242: dup
      //   243: ldc -106
      //   245: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   248: aload 6
      //   250: invokevirtual 153	java/io/IOException:getMessage	()Ljava/lang/String;
      //   253: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   256: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   259: invokestatic 156	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   262: ldc 113
      //   264: aload 6
      //   266: ldc -98
      //   268: iconst_0
      //   269: anewarray 4	java/lang/Object
      //   272: invokestatic 162	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   275: goto -221 -> 54
      //   278: astore 8
      //   280: aconst_null
      //   281: astore 7
      //   283: aload 7
      //   285: astore 6
      //   287: aload 10
      //   289: aload 11
      //   291: ldc -92
      //   293: iconst_2
      //   294: anewarray 4	java/lang/Object
      //   297: dup
      //   298: iconst_0
      //   299: iload_1
      //   300: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   303: aastore
      //   304: dup
      //   305: iconst_1
      //   306: aload 8
      //   308: invokevirtual 165	java/net/UnknownHostException:toString	()Ljava/lang/String;
      //   311: aastore
      //   312: invokestatic 60	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   315: iconst_1
      //   316: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   319: invokevirtual 69	com/tencent/mm/plugin/traceroute/b/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
      //   322: aload 7
      //   324: astore 6
      //   326: ldc 113
      //   328: new 115	java/lang/StringBuilder
      //   331: dup
      //   332: ldc -89
      //   334: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   337: aload 8
      //   339: invokevirtual 168	java/net/UnknownHostException:getMessage	()Ljava/lang/String;
      //   342: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   345: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   348: invokestatic 156	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   351: aload 7
      //   353: astore 6
      //   355: ldc 113
      //   357: aload 8
      //   359: ldc -98
      //   361: iconst_0
      //   362: anewarray 4	java/lang/Object
      //   365: invokestatic 162	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   368: aload 7
      //   370: ifnull -316 -> 54
      //   373: aload 7
      //   375: invokevirtual 148	java/net/Socket:close	()V
      //   378: goto -324 -> 54
      //   381: astore 6
      //   383: ldc 113
      //   385: new 115	java/lang/StringBuilder
      //   388: dup
      //   389: ldc -106
      //   391: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   394: aload 6
      //   396: invokevirtual 153	java/io/IOException:getMessage	()Ljava/lang/String;
      //   399: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   402: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   405: invokestatic 156	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   408: ldc 113
      //   410: aload 6
      //   412: ldc -98
      //   414: iconst_0
      //   415: anewarray 4	java/lang/Object
      //   418: invokestatic 162	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   421: goto -367 -> 54
      //   424: astore 8
      //   426: aconst_null
      //   427: astore 7
      //   429: aload 7
      //   431: astore 6
      //   433: aload 10
      //   435: aload 11
      //   437: ldc -86
      //   439: iconst_2
      //   440: anewarray 4	java/lang/Object
      //   443: dup
      //   444: iconst_0
      //   445: iload_1
      //   446: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   449: aastore
      //   450: dup
      //   451: iconst_1
      //   452: aload 8
      //   454: invokevirtual 171	java/io/IOException:toString	()Ljava/lang/String;
      //   457: aastore
      //   458: invokestatic 60	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   461: iconst_1
      //   462: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   465: invokevirtual 69	com/tencent/mm/plugin/traceroute/b/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
      //   468: aload 7
      //   470: astore 6
      //   472: ldc 113
      //   474: new 115	java/lang/StringBuilder
      //   477: dup
      //   478: ldc -83
      //   480: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   483: aload 8
      //   485: invokevirtual 153	java/io/IOException:getMessage	()Ljava/lang/String;
      //   488: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   491: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   494: invokestatic 156	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   497: aload 7
      //   499: astore 6
      //   501: ldc 113
      //   503: aload 8
      //   505: ldc -98
      //   507: iconst_0
      //   508: anewarray 4	java/lang/Object
      //   511: invokestatic 162	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   514: aload 7
      //   516: ifnull -462 -> 54
      //   519: aload 7
      //   521: invokevirtual 148	java/net/Socket:close	()V
      //   524: goto -470 -> 54
      //   527: astore 6
      //   529: ldc 113
      //   531: new 115	java/lang/StringBuilder
      //   534: dup
      //   535: ldc -106
      //   537: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   540: aload 6
      //   542: invokevirtual 153	java/io/IOException:getMessage	()Ljava/lang/String;
      //   545: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   548: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   551: invokestatic 156	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   554: ldc 113
      //   556: aload 6
      //   558: ldc -98
      //   560: iconst_0
      //   561: anewarray 4	java/lang/Object
      //   564: invokestatic 162	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   567: goto -513 -> 54
      //   570: astore 8
      //   572: aconst_null
      //   573: astore 7
      //   575: aload 7
      //   577: astore 6
      //   579: aload 10
      //   581: aload 11
      //   583: ldc -81
      //   585: iconst_2
      //   586: anewarray 4	java/lang/Object
      //   589: dup
      //   590: iconst_0
      //   591: iload_1
      //   592: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   595: aastore
      //   596: dup
      //   597: iconst_1
      //   598: aload 8
      //   600: invokevirtual 176	java/lang/Exception:toString	()Ljava/lang/String;
      //   603: aastore
      //   604: invokestatic 60	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   607: iconst_1
      //   608: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   611: invokevirtual 69	com/tencent/mm/plugin/traceroute/b/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
      //   614: aload 7
      //   616: astore 6
      //   618: ldc 113
      //   620: new 115	java/lang/StringBuilder
      //   623: dup
      //   624: ldc -83
      //   626: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   629: aload 8
      //   631: invokevirtual 176	java/lang/Exception:toString	()Ljava/lang/String;
      //   634: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   637: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   640: invokestatic 156	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   643: aload 7
      //   645: astore 6
      //   647: ldc 113
      //   649: aload 8
      //   651: ldc -98
      //   653: iconst_0
      //   654: anewarray 4	java/lang/Object
      //   657: invokestatic 162	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   660: aload 7
      //   662: ifnull -608 -> 54
      //   665: aload 7
      //   667: invokevirtual 148	java/net/Socket:close	()V
      //   670: goto -616 -> 54
      //   673: astore 6
      //   675: ldc 113
      //   677: new 115	java/lang/StringBuilder
      //   680: dup
      //   681: ldc -106
      //   683: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   686: aload 6
      //   688: invokevirtual 153	java/io/IOException:getMessage	()Ljava/lang/String;
      //   691: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   694: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   697: invokestatic 156	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   700: ldc 113
      //   702: aload 6
      //   704: ldc -98
      //   706: iconst_0
      //   707: anewarray 4	java/lang/Object
      //   710: invokestatic 162	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   713: goto -659 -> 54
      //   716: astore 7
      //   718: aconst_null
      //   719: astore 6
      //   721: aload 6
      //   723: ifnull +8 -> 731
      //   726: aload 6
      //   728: invokevirtual 148	java/net/Socket:close	()V
      //   731: aload 7
      //   733: athrow
      //   734: astore 6
      //   736: ldc 113
      //   738: new 115	java/lang/StringBuilder
      //   741: dup
      //   742: ldc -106
      //   744: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   747: aload 6
      //   749: invokevirtual 153	java/io/IOException:getMessage	()Ljava/lang/String;
      //   752: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   755: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   758: invokestatic 156	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   761: ldc 113
      //   763: aload 6
      //   765: ldc -98
      //   767: iconst_0
      //   768: anewarray 4	java/lang/Object
      //   771: invokestatic 162	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   774: goto -43 -> 731
      //   777: aload_0
      //   778: getfield 20	com/tencent/mm/plugin/traceroute/b/a$a:qAi	Lcom/tencent/mm/plugin/traceroute/b/a;
      //   781: aload_0
      //   782: getfield 34	com/tencent/mm/plugin/traceroute/b/a$a:ip	Ljava/lang/String;
      //   785: ldc -78
      //   787: iconst_1
      //   788: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   791: invokevirtual 69	com/tencent/mm/plugin/traceroute/b/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
      //   794: ldc2_w 50
      //   797: ldc 52
      //   799: invokestatic 39	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   802: return
      //   803: astore 7
      //   805: goto -84 -> 721
      //   808: astore 8
      //   810: goto -235 -> 575
      //   813: astore 8
      //   815: goto -386 -> 429
      //   818: astore 8
      //   820: goto -537 -> 283
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	823	0	this	a
      //   93	499	1	i	int
      //   122	90	2	l1	long
      //   149	61	4	l2	long
      //   24	165	6	localObject1	Object
      //   235	30	6	localIOException1	java.io.IOException
      //   285	69	6	localObject2	Object
      //   381	30	6	localIOException2	java.io.IOException
      //   431	69	6	localObject3	Object
      //   527	30	6	localIOException3	java.io.IOException
      //   577	69	6	localObject4	Object
      //   673	30	6	localIOException4	java.io.IOException
      //   719	8	6	localObject5	Object
      //   734	30	6	localIOException5	java.io.IOException
      //   101	565	7	localSocket	java.net.Socket
      //   716	16	7	localObject6	Object
      //   803	1	7	localObject7	Object
      //   278	80	8	localUnknownHostException1	java.net.UnknownHostException
      //   424	80	8	localIOException6	java.io.IOException
      //   570	80	8	localException1	Exception
      //   808	1	8	localException2	Exception
      //   813	1	8	localIOException7	java.io.IOException
      //   818	1	8	localUnknownHostException2	java.net.UnknownHostException
      //   52	13	9	localIterator	Iterator
      //   80	500	10	locala	a
      //   86	496	11	str	String
      // Exception table:
      //   from	to	target	type
      //   227	232	235	java/io/IOException
      //   94	103	278	java/net/UnknownHostException
      //   373	378	381	java/io/IOException
      //   94	103	424	java/io/IOException
      //   519	524	527	java/io/IOException
      //   94	103	570	java/lang/Exception
      //   665	670	673	java/io/IOException
      //   94	103	716	finally
      //   726	731	734	java/io/IOException
      //   107	115	803	finally
      //   119	123	803	finally
      //   127	142	803	finally
      //   146	151	803	finally
      //   155	186	803	finally
      //   190	227	803	finally
      //   287	322	803	finally
      //   326	351	803	finally
      //   355	368	803	finally
      //   433	468	803	finally
      //   472	497	803	finally
      //   501	514	803	finally
      //   579	614	803	finally
      //   618	643	803	finally
      //   647	660	803	finally
      //   107	115	808	java/lang/Exception
      //   119	123	808	java/lang/Exception
      //   127	142	808	java/lang/Exception
      //   146	151	808	java/lang/Exception
      //   155	186	808	java/lang/Exception
      //   190	227	808	java/lang/Exception
      //   107	115	813	java/io/IOException
      //   119	123	813	java/io/IOException
      //   127	142	813	java/io/IOException
      //   146	151	813	java/io/IOException
      //   155	186	813	java/io/IOException
      //   190	227	813	java/io/IOException
      //   107	115	818	java/net/UnknownHostException
      //   119	123	818	java/net/UnknownHostException
      //   127	142	818	java/net/UnknownHostException
      //   146	151	818	java/net/UnknownHostException
      //   155	186	818	java/net/UnknownHostException
      //   190	227	818	java/net/UnknownHostException
    }
  }
  
  public static abstract interface b
  {
    public abstract void bsR();
  }
  
  public static abstract interface c
  {
    public abstract void bsS();
  }
  
  public static abstract interface d
  {
    public abstract void bsT();
  }
  
  public static abstract interface e
  {
    public abstract void bsU();
  }
  
  private final class f
    extends ConcurrentHashMap<String, ConcurrentHashMap<Integer, StringBuilder>>
  {
    private f()
    {
      GMTrace.i(9988080664576L, 74417);
      GMTrace.o(9988080664576L, 74417);
    }
  }
  
  private final class g
    implements Runnable
  {
    private String qAn;
    private boolean qAo;
    private Integer qAp;
    private String serverIP;
    
    public g(String paramString1, String paramString2, boolean paramBoolean, Integer paramInteger)
    {
      GMTrace.i(9987543793664L, 74413);
      this.qAn = paramString1;
      this.serverIP = paramString2;
      this.qAo = paramBoolean;
      this.qAp = paramInteger;
      GMTrace.o(9987543793664L, 74413);
    }
    
    public final void run()
    {
      GMTrace.i(9987678011392L, 74414);
      a locala = a.this;
      String str2 = this.qAn;
      String str3 = this.serverIP;
      Integer localInteger = this.qAp;
      int i = 1;
      if (i <= 3)
      {
        Object localObject = b.A(new String[] { "ping", "-c 1", "-t 64", str2 });
        if (((List)localObject).size() != 2) {
          if (i == 3) {
            locala.a(str3, " router no response\n", localInteger);
          }
        }
        String str1;
        for (;;)
        {
          i += 1;
          break;
          locala.a(str3, " router no response", localInteger);
          continue;
          str1 = (String)((List)localObject).get(0);
          if (!bg.nm(str1)) {
            break label178;
          }
          w.e("MicroMsg.MMTraceRoute", "runcommand err " + str2);
          locala.a(str3, "run command err ", localInteger);
        }
        label178:
        localObject = ((List)localObject).get(1).toString();
        if (b.JI(str1) > 0)
        {
          str1 = b.JH(str1);
          if (!bg.nm(str1)) {
            str1 = String.format(" %sms ", new Object[] { str1 });
          }
        }
        for (;;)
        {
          localObject = str1;
          if (i == 3) {
            localObject = str1 + "\n";
          }
          locala.a(str3, (String)localObject, localInteger);
          break;
          if (!bg.nm((String)localObject))
          {
            str1 = String.format(" %sms ", new Object[] { localObject });
          }
          else
          {
            str1 = String.format("unable to get time", new Object[0]);
            continue;
            str1 = String.format(" router no response ", new Object[0]);
          }
        }
      }
      GMTrace.o(9987678011392L, 74414);
    }
  }
  
  private final class h
    implements Runnable
  {
    private String ip;
    private int qAq;
    
    public h(String paramString, int paramInt)
    {
      GMTrace.i(9987812229120L, 74415);
      this.ip = paramString;
      this.qAq = paramInt;
      GMTrace.o(9987812229120L, 74415);
    }
    
    public final void run()
    {
      int j = 1;
      GMTrace.i(9987946446848L, 74416);
      w.i("MicroMsg.MMTraceRoute", "ttl= " + this.qAq);
      a locala = a.this;
      String str1 = this.ip;
      int m = this.qAq;
      Object localObject = b.A(new String[] { "ping", "-c 1", "-t " + String.valueOf(m), str1 });
      if (((List)localObject).size() != 2) {
        locala.a(str1, String.format("%d : can not get roupter ip\n", new Object[] { Integer.valueOf(m) }), Integer.valueOf(m + 1));
      }
      for (;;)
      {
        int i = 0;
        for (;;)
        {
          label143:
          if (i == 0) {
            break label581;
          }
          GMTrace.o(9987946446848L, 74416);
          return;
          String str2 = (String)((List)localObject).get(0);
          if (str2.length() == 0)
          {
            w.e("MicroMsg.MMTraceRoute", "runcommand err");
            break;
          }
          int k = str2.indexOf("From ");
          i = k;
          if (k < 0)
          {
            k = str2.indexOf("from ");
            i = k;
            if (k < 0) {
              localObject = null;
            }
          }
          for (;;)
          {
            if (!bg.nm((String)localObject)) {
              break label374;
            }
            i = j;
            if (b.JI(str2) > 0) {
              break label143;
            }
            localObject = String.format("%d : can not get roupter ip\n", new Object[] { Integer.valueOf(m) });
            w.e("MicroMsg.MMTraceRoute", "can not get route ip and ttl" + str1);
            locala.a(str1, (String)localObject, Integer.valueOf(m + 1));
            break;
            k = str2.indexOf(" ", i);
            if (k < 0)
            {
              k = str2.indexOf(":", i);
              i = k;
              if (k < 0) {
                localObject = null;
              }
            }
            else
            {
              i = k;
            }
            i += 1;
            k = str2.indexOf(" ", i);
            if (k < 0) {
              localObject = null;
            } else {
              localObject = str2.substring(i, k).replace(":", "");
            }
          }
          label374:
          if (str1.equals(localObject))
          {
            locala.a(str1, String.format("%d : FIN %s\n\n", new Object[] { Integer.valueOf(m), localObject }), Integer.valueOf(m + 1));
            i = j;
          }
          else
          {
            if (b.JI(str2) <= 0) {
              break label509;
            }
            locala.a(str1, String.format("%d : FIN %s\n\n ", new Object[] { Integer.valueOf(m), localObject }), Integer.valueOf(m + 1));
            i = j;
            if (a.qzY != null)
            {
              a.qzY.execute(new a.g(locala, (String)localObject, str1, true, Integer.valueOf(m + 1)));
              i = j;
            }
          }
        }
        label509:
        locala.a(str1, String.format("%d : %s", new Object[] { Integer.valueOf(m), localObject }), Integer.valueOf(m + 1));
        if (a.qzY != null) {
          a.qzY.execute(new a.g(locala, (String)localObject, str1, false, Integer.valueOf(m + 1)));
        }
      }
      label581:
      GMTrace.o(9987946446848L, 74416);
    }
  }
  
  private final class i
    implements Runnable
  {
    private String ip;
    
    public i(String paramString)
    {
      GMTrace.i(9986335834112L, 74404);
      this.ip = paramString;
      GMTrace.o(9986335834112L, 74404);
    }
    
    public final void run()
    {
      int k = 1;
      GMTrace.i(9986470051840L, 74405);
      Object localObject2 = b.A(new String[] { "ping", "-c 1", "-t 64", this.ip });
      if (((List)localObject2).size() != 2)
      {
        a.this.a(this.ip, "failed to ping: \n" + this.ip, Integer.valueOf(0));
        GMTrace.o(9986470051840L, 74405);
        return;
      }
      Object localObject1 = (String)((List)localObject2).get(0);
      if (bg.nm((String)localObject1))
      {
        a.this.a(this.ip, "failed to ping: \n" + this.ip, Integer.valueOf(0));
        w.e("MicroMsg.MMTraceRoute", "runcommand err");
        GMTrace.o(9986470051840L, 74405);
        return;
      }
      int i = b.JI((String)localObject1);
      if (i <= 0)
      {
        w.e("MicroMsg.MMTraceRoute", "failed to touch server:" + this.ip);
        a.this.a(this.ip, "failed to touch server: " + this.ip + "\n", Integer.valueOf(0));
        GMTrace.o(9986470051840L, 74405);
        return;
      }
      localObject2 = ((List)localObject2).get(1).toString();
      localObject1 = b.JH((String)localObject1);
      if (!bg.nm((String)localObject1)) {
        localObject1 = String.format("server: %s, TTL: %d, Time = %sms", new Object[] { this.ip, Integer.valueOf(i), localObject1 });
      }
      for (;;)
      {
        a.this.a(this.ip, (String)localObject1 + "\n", Integer.valueOf(0));
        int m = 64 - i + 5;
        i = m;
        int j = k;
        if (m < 0)
        {
          i = 64;
          j = k;
        }
        while ((j < i) && (!a.this.bsP()))
        {
          localObject1 = new a.h(a.this, this.ip, j);
          if (a.qzY != null) {
            a.qzY.execute((Runnable)localObject1);
          }
          j += 1;
        }
        if (!bg.nm((String)localObject2)) {
          localObject1 = String.format("server: %s, TTL: %d, Time = %sms", new Object[] { this.ip, Integer.valueOf(i), localObject2 });
        } else {
          localObject1 = String.format("server: %s, TTL: %d, Time = %sms", new Object[] { this.ip, Integer.valueOf(i), "unknown" });
        }
      }
      GMTrace.o(9986470051840L, 74405);
    }
  }
  
  private final class j
    implements Runnable
  {
    public j()
    {
      GMTrace.i(9988751753216L, 74422);
      GMTrace.o(9988751753216L, 74422);
    }
    
    public final void run()
    {
      GMTrace.i(9988885970944L, 74423);
      a.this.ip(false);
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      long l1 = bg.Pv();
      Object localObject1 = new java.sql.Date(l1);
      w.i("MicroMsg.MMTraceRoute", "mmtraceroute start time " + localSimpleDateFormat.format((java.util.Date)localObject1));
      localObject1 = a.this.qAc.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
        a.i locali = new a.i(a.this, (String)((Map.Entry)localObject2).getKey());
        if (a.qzY != null) {
          a.qzY.execute(locali);
        }
        localObject2 = new a.a(a.this, (String)((Map.Entry)localObject2).getKey(), (Set)((Map.Entry)localObject2).getValue());
        if (a.qzY != null) {
          a.qzY.execute((Runnable)localObject2);
        }
      }
      try
      {
        do
        {
          Thread.sleep(500L);
          if ((a.this.bsP()) || (a.qzY.getActiveCount() <= 0)) {
            break;
          }
          w.d("MicroMsg.MMTraceRoute", "task count: " + String.valueOf(a.qzY.getActiveCount()));
          l2 = bg.Pv();
        } while (l2 - l1 < 120000L);
        w.i("MicroMsg.MMTraceRoute", "traceroute timeout: " + (l2 - l1) / 1000L);
        a.this.ip(true);
        a.this.stop();
        if (a.this.qAd != null) {
          a.this.qAd.bsU();
        }
        GMTrace.o(9988885970944L, 74423);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.MMTraceRoute", "wait for command end err: " + localException.getMessage());
          w.printErrStackTrace("MicroMsg.MMTraceRoute", localException, "", new Object[0]);
        }
        long l2 = bg.Pv();
        w.i("MicroMsg.MMTraceRoute", "mmtraceroute end time " + localSimpleDateFormat.format(new java.util.Date(l2)));
        w.i("MicroMsg.MMTraceRoute", "mmtraceroute total time " + (l2 - l1) / 1000L);
        if ((a.this.qAe != null) && (!a.this.bsP())) {
          a.this.qAe.bsT();
        }
        GMTrace.o(9988885970944L, 74423);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\traceroute\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */