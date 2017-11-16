package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ai.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bd
{
  public static final Queue<Integer> gog;
  public static final long[] goh;
  private static final int[] goi;
  public static final int[] goj;
  public static final int[] gok;
  private static long gol;
  public static volatile boolean gom;
  public static int[] gon;
  private static long goo;
  public static volatile boolean goq;
  public static final int[] gor;
  public static final int[] gos;
  
  static
  {
    GMTrace.i(16289871429632L, 121369);
    gog = new ConcurrentLinkedQueue();
    goh = new long[] { 5000L, 10000L, 30000L, 60000L, 180000L, 300000L, 600000L, 900000L, 1800000L, 3600000L, 10800000L, 21600000L, 43200000L, 86400000L };
    goi = new int[] { 0, 1, 2, 3, 11, 12, 13, 4, 5, 6, 7, 8, 9, 10 };
    goj = new int[] { 0, 1, 2, 3, 7, 8, 9, 10, 11, 12, 13 };
    gok = new int[] { 4, 5, 6 };
    gol = 0L;
    gom = false;
    gon = new int[goh.length];
    goo = 0L;
    goq = false;
    gor = new int[] { 3, 5, 7, 9 };
    gos = new int[] { 20, 21, 22, 23 };
    Bm();
    GMTrace.o(16289871429632L, 121369);
  }
  
  public static void Bm()
  {
    GMTrace.i(16429592084480L, 122410);
    int i = 0;
    while (i < gon.length)
    {
      gon[i] = 0;
      i += 1;
    }
    GMTrace.o(16429592084480L, 122410);
  }
  
  public static void d(String paramString, long paramLong1, long paramLong2)
  {
    GMTrace.i(20306202722304L, 151293);
    if (paramString == null)
    {
      GMTrace.o(20306202722304L, 151293);
      return;
    }
    long l1;
    try
    {
      Object localObject = q.zE();
      boolean bool;
      if (localObject != null)
      {
        bool = ((String)localObject).equals(paramString);
        if (bool)
        {
          GMTrace.o(20306202722304L, 151293);
          return;
        }
      }
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(paramString);
      if (paramString.endsWith("@chatroom"))
      {
        i = ((af)localObject).fji;
        if (i == 0)
        {
          GMTrace.o(20306202722304L, 151293);
          return;
        }
        w.i("MicroMsg.MsgReporter", "[oneliang]it is a normal chatroom? username:%s", new Object[] { paramString });
      }
      do
      {
        l1 = bv.BT();
        if (l1 > 0L) {
          break label231;
        }
        w.i("MicroMsg.MsgReporter", "[oneliang]current server time is 0l,then return");
        GMTrace.o(20306202722304L, 151293);
        return;
        if ((s.gj(paramString)) || (x.To(paramString)) || (x.Tq(paramString)) || (s.gf(paramString)) || (x.fw(paramString))) {
          break;
        }
        bool = ((x)localObject).bSA();
      } while (!bool);
      GMTrace.o(20306202722304L, 151293);
      return;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.MsgReporter", "[oneliang]something about contact has exception:%s", new Object[] { paramString.getMessage() });
      GMTrace.o(20306202722304L, 151293);
      return;
    }
    label231:
    long l2 = System.currentTimeMillis();
    long l3 = l1 - paramLong2;
    w.i("MicroMsg.MsgReporter", "[oneliang]current server time:%s, msg server time:%s, intervalTime:%s, username:%s, msg server id:%s", new Object[] { Long.valueOf(l1), Long.valueOf(paramLong2), Long.valueOf(l3), paramString, Long.valueOf(paramLong1) });
    int i = goh.length - 1;
    for (;;)
    {
      if (i >= 0)
      {
        if (l3 >= goh[i])
        {
          gog.add(Integer.valueOf(goi[i]));
          gon[i] += 1;
          a.a(l1, l2, paramLong2, l3, paramLong1);
        }
      }
      else
      {
        paramLong1 = l1 - gol;
        if ((!gom) && ((gog.size() >= 10) || (paramLong1 >= 900000L)))
        {
          w.i("MicroMsg.MsgReporter", "[oneliang]need to report,size:%s,last time:%s,report interval time:%s", new Object[] { Integer.valueOf(gog.size()), Long.valueOf(gol), Long.valueOf(paramLong1) });
          gom = true;
          e.b(new b(), "msg_delay_idkey_report", 1);
          gol = l1;
        }
        paramLong1 = l1 - goo;
        if ((!goq) && (paramLong1 >= 900000L))
        {
          w.i("MicroMsg.MsgReporter", "[oneliang]need to kv stat and report,last time:%s,report interval time:%s", new Object[] { Long.valueOf(goo), Long.valueOf(paramLong1) });
          goq = true;
          e.b(new c(l1), "msg_delay_kv_stat_and_report", 1);
          goo = l1;
        }
        GMTrace.o(20306202722304L, 151293);
        return;
      }
      i -= 1;
    }
  }
  
  private static final class a
  {
    long got;
    int[] gou;
    
    a(long paramLong, int[] paramArrayOfInt)
    {
      GMTrace.i(16430665826304L, 122418);
      this.got = 0L;
      this.gou = new int[bd.goh.length];
      int i = 0;
      while (i < this.gou.length)
      {
        this.gou[i] = 0;
        i += 1;
      }
      this.got = paramLong;
      if (paramArrayOfInt != null) {
        System.arraycopy(paramArrayOfInt, 0, this.gou, 0, paramArrayOfInt.length);
      }
      GMTrace.o(16430665826304L, 122418);
    }
    
    static a gV(String paramString)
    {
      GMTrace.i(16431202697216L, 122422);
      try
      {
        paramString = new JSONObject(paramString);
        boolean bool = paramString.has("firstTime");
        if (!bool)
        {
          GMTrace.o(16431202697216L, 122422);
          return null;
        }
        l = paramString.getLong("firstTime");
        if ((!paramString.has("counter")) || (!(paramString.get("counter") instanceof JSONArray))) {
          break label179;
        }
        JSONArray localJSONArray = paramString.getJSONArray("counter");
        int j = localJSONArray.length();
        int i = bd.goh.length;
        if (j != i)
        {
          GMTrace.o(16431202697216L, 122422);
          return null;
        }
        paramString = new int[j];
        i = 0;
        while (i < j)
        {
          paramString[i] = localJSONArray.getInt(i);
          i += 1;
        }
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          long l;
          w.e("MicroMsg.MsgReporter", "error:" + paramString.getMessage());
          paramString = null;
          continue;
          paramString = null;
        }
      }
      paramString = new a(l, paramString);
      GMTrace.o(16431202697216L, 122422);
      return paramString;
    }
    
    final String Bn()
    {
      GMTrace.i(16430934261760L, 122420);
      Object localObject1 = null;
      try
      {
        Object localObject2 = new JSONObject();
        ((JSONObject)localObject2).put("firstTime", this.got);
        JSONArray localJSONArray = new JSONArray();
        if (this.gou != null)
        {
          int i = 0;
          while (i < this.gou.length)
          {
            localJSONArray.put(this.gou[i]);
            i += 1;
          }
        }
        ((JSONObject)localObject2).put("counter", localJSONArray);
        localObject2 = ((JSONObject)localObject2).toString();
        localObject1 = localObject2;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.MsgReporter", "error:" + localException.getMessage());
        }
      }
      GMTrace.o(16430934261760L, 122420);
      return (String)localObject1;
    }
    
    public final boolean Bo()
    {
      GMTrace.i(16431068479488L, 122421);
      int i = 0;
      while (i < this.gou.length)
      {
        if (this.gou[i] > 0)
        {
          GMTrace.o(16431068479488L, 122421);
          return true;
        }
        i += 1;
      }
      GMTrace.o(16431068479488L, 122421);
      return false;
    }
    
    final String Bp()
    {
      GMTrace.i(16431336914944L, 122423);
      Object localObject = new StringBuilder();
      try
      {
        ((StringBuilder)localObject).append(0);
        ((StringBuilder)localObject).append(",");
        int i = 0;
        while (i < bd.goj.length)
        {
          ((StringBuilder)localObject).append(this.gou[bd.goj[i]]);
          ((StringBuilder)localObject).append(",");
          i += 1;
        }
        ((StringBuilder)localObject).append(this.got / 1000L);
        ((StringBuilder)localObject).append(",");
        i = 0;
        while (i < bd.gok.length)
        {
          ((StringBuilder)localObject).append(this.gou[bd.gok[i]]);
          ((StringBuilder)localObject).append(",");
          i += 1;
        }
        ((StringBuilder)localObject).delete(((StringBuilder)localObject).length() - 1, ((StringBuilder)localObject).length());
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.MsgReporter", localException, null, new Object[0]);
        }
      }
      localObject = ((StringBuilder)localObject).toString();
      GMTrace.o(16431336914944L, 122423);
      return (String)localObject;
    }
    
    final void d(int[] paramArrayOfInt)
    {
      GMTrace.i(16766075928576L, 124917);
      if ((paramArrayOfInt == null) || (this.gou.length != paramArrayOfInt.length))
      {
        GMTrace.o(16766075928576L, 124917);
        return;
      }
      int i = 0;
      while (i < this.gou.length)
      {
        int[] arrayOfInt = this.gou;
        arrayOfInt[i] += paramArrayOfInt[i];
        i += 1;
      }
      GMTrace.o(16766075928576L, 124917);
    }
  }
  
  private static final class b
    implements Runnable
  {
    public b()
    {
      GMTrace.i(16430397390848L, 122416);
      GMTrace.o(16430397390848L, 122416);
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: ldc2_w 30
      //   3: ldc 32
      //   5: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: getstatic 36	com/tencent/mm/y/bd:gog	Ljava/util/Queue;
      //   11: invokeinterface 42 1 0
      //   16: ifne +64 -> 80
      //   19: getstatic 36	com/tencent/mm/y/bd:gog	Ljava/util/Queue;
      //   22: invokeinterface 46 1 0
      //   27: checkcast 48	java/lang/Integer
      //   30: astore_1
      //   31: aload_1
      //   32: ifnull -24 -> 8
      //   35: getstatic 54	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
      //   38: ldc2_w 55
      //   41: aload_1
      //   42: invokevirtual 60	java/lang/Integer:intValue	()I
      //   45: i2l
      //   46: lconst_1
      //   47: iconst_0
      //   48: invokevirtual 64	com/tencent/mm/plugin/report/d:a	(JJJZ)V
      //   51: goto -43 -> 8
      //   54: astore_1
      //   55: ldc 66
      //   57: aload_1
      //   58: ldc 68
      //   60: iconst_0
      //   61: anewarray 4	java/lang/Object
      //   64: invokestatic 74	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   67: iconst_0
      //   68: putstatic 78	com/tencent/mm/y/bd:gom	Z
      //   71: ldc2_w 30
      //   74: ldc 32
      //   76: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   79: return
      //   80: iconst_0
      //   81: putstatic 78	com/tencent/mm/y/bd:gom	Z
      //   84: iconst_0
      //   85: putstatic 78	com/tencent/mm/y/bd:gom	Z
      //   88: ldc2_w 30
      //   91: ldc 32
      //   93: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   96: return
      //   97: astore_1
      //   98: iconst_0
      //   99: putstatic 78	com/tencent/mm/y/bd:gom	Z
      //   102: aload_1
      //   103: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	104	0	this	b
      //   30	12	1	localInteger	Integer
      //   54	4	1	localThrowable	Throwable
      //   97	6	1	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   8	31	54	java/lang/Throwable
      //   35	51	54	java/lang/Throwable
      //   80	84	54	java/lang/Throwable
      //   8	31	97	finally
      //   35	51	97	finally
      //   55	67	97	finally
      //   80	84	97	finally
    }
  }
  
  private static final class c
    implements Runnable
  {
    final long gov;
    
    c(long paramLong)
    {
      GMTrace.i(16429323649024L, 122408);
      this.gov = paramLong;
      GMTrace.o(16429323649024L, 122408);
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: ldc2_w 37
      //   3: ldc 39
      //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: invokestatic 45	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
      //   11: pop
      //   12: invokestatic 49	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
      //   15: invokevirtual 55	com/tencent/mm/kernel/e:xh	()Lcom/tencent/mm/storage/t;
      //   18: getstatic 61	com/tencent/mm/storage/w$a:vxK	Lcom/tencent/mm/storage/w$a;
      //   21: aconst_null
      //   22: invokevirtual 67	com/tencent/mm/storage/t:get	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)Ljava/lang/Object;
      //   25: astore 4
      //   27: aload 4
      //   29: ifnonnull +407 -> 436
      //   32: new 69	com/tencent/mm/y/bd$a
      //   35: dup
      //   36: aload_0
      //   37: getfield 27	com/tencent/mm/y/bd$c:gov	J
      //   40: getstatic 73	com/tencent/mm/y/bd:gon	[I
      //   43: invokespecial 76	com/tencent/mm/y/bd$a:<init>	(J[I)V
      //   46: astore 4
      //   48: aload 4
      //   50: invokevirtual 80	com/tencent/mm/y/bd$a:Bn	()Ljava/lang/String;
      //   53: astore 5
      //   55: aload 5
      //   57: ifnonnull +20 -> 77
      //   60: iconst_0
      //   61: putstatic 84	com/tencent/mm/y/bd:goq	Z
      //   64: iconst_0
      //   65: putstatic 84	com/tencent/mm/y/bd:goq	Z
      //   68: ldc2_w 37
      //   71: ldc 39
      //   73: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   76: return
      //   77: ldc 86
      //   79: new 88	java/lang/StringBuilder
      //   82: dup
      //   83: ldc 90
      //   85: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   88: aload 5
      //   90: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   93: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   96: invokestatic 105	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   99: invokestatic 45	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
      //   102: pop
      //   103: invokestatic 49	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
      //   106: invokevirtual 55	com/tencent/mm/kernel/e:xh	()Lcom/tencent/mm/storage/t;
      //   109: getstatic 61	com/tencent/mm/storage/w$a:vxK	Lcom/tencent/mm/storage/w$a;
      //   112: aload 5
      //   114: invokevirtual 109	com/tencent/mm/storage/t:a	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)V
      //   117: invokestatic 112	com/tencent/mm/y/bd:Bm	()V
      //   120: aload 4
      //   122: ifnull +297 -> 419
      //   125: aload 4
      //   127: invokevirtual 116	com/tencent/mm/y/bd$a:Bo	()Z
      //   130: ifeq +289 -> 419
      //   133: aload_0
      //   134: getfield 27	com/tencent/mm/y/bd$c:gov	J
      //   137: aload 4
      //   139: getfield 119	com/tencent/mm/y/bd$a:got	J
      //   142: lsub
      //   143: ldc2_w 120
      //   146: lcmp
      //   147: iflt +272 -> 419
      //   150: aload 4
      //   152: invokevirtual 124	com/tencent/mm/y/bd$a:Bp	()Ljava/lang/String;
      //   155: astore 5
      //   157: ldc 86
      //   159: new 88	java/lang/StringBuilder
      //   162: dup
      //   163: ldc 126
      //   165: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   168: aload 5
      //   170: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   173: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   176: invokestatic 105	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   179: new 69	com/tencent/mm/y/bd$a
      //   182: dup
      //   183: aload_0
      //   184: getfield 27	com/tencent/mm/y/bd$c:gov	J
      //   187: aconst_null
      //   188: invokespecial 76	com/tencent/mm/y/bd$a:<init>	(J[I)V
      //   191: invokevirtual 80	com/tencent/mm/y/bd$a:Bn	()Ljava/lang/String;
      //   194: astore 6
      //   196: ldc 86
      //   198: new 88	java/lang/StringBuilder
      //   201: dup
      //   202: ldc -128
      //   204: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   207: aload 6
      //   209: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   212: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   215: invokestatic 105	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   218: invokestatic 45	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
      //   221: pop
      //   222: invokestatic 49	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
      //   225: invokevirtual 55	com/tencent/mm/kernel/e:xh	()Lcom/tencent/mm/storage/t;
      //   228: getstatic 61	com/tencent/mm/storage/w$a:vxK	Lcom/tencent/mm/storage/w$a;
      //   231: aload 6
      //   233: invokevirtual 109	com/tencent/mm/storage/t:a	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)V
      //   236: invokestatic 45	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
      //   239: pop
      //   240: invokestatic 49	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
      //   243: invokevirtual 55	com/tencent/mm/kernel/e:xh	()Lcom/tencent/mm/storage/t;
      //   246: iconst_1
      //   247: invokevirtual 132	com/tencent/mm/storage/t:kL	(Z)V
      //   250: getstatic 138	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
      //   253: sipush 14331
      //   256: aload 5
      //   258: invokevirtual 142	com/tencent/mm/plugin/report/d:A	(ILjava/lang/String;)V
      //   261: aload 4
      //   263: getfield 145	com/tencent/mm/y/bd$a:gou	[I
      //   266: ifnull +242 -> 508
      //   269: aload 4
      //   271: getfield 145	com/tencent/mm/y/bd$a:gou	[I
      //   274: arraylength
      //   275: getstatic 149	com/tencent/mm/y/bd:goh	[J
      //   278: arraylength
      //   279: if_icmpne +229 -> 508
      //   282: getstatic 152	com/tencent/mm/y/bd:gor	[I
      //   285: arraylength
      //   286: iconst_1
      //   287: isub
      //   288: istore_1
      //   289: iload_1
      //   290: iflt +69 -> 359
      //   293: aload 4
      //   295: getfield 145	com/tencent/mm/y/bd$a:gou	[I
      //   298: getstatic 152	com/tencent/mm/y/bd:gor	[I
      //   301: iload_1
      //   302: iaload
      //   303: iaload
      //   304: istore_2
      //   305: iload_2
      //   306: ifle +331 -> 637
      //   309: getstatic 138	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
      //   312: ldc2_w 153
      //   315: getstatic 157	com/tencent/mm/y/bd:gos	[I
      //   318: iload_1
      //   319: iaload
      //   320: i2l
      //   321: lconst_1
      //   322: iconst_1
      //   323: invokevirtual 160	com/tencent/mm/plugin/report/d:a	(JJJZ)V
      //   326: ldc 86
      //   328: ldc -94
      //   330: iconst_2
      //   331: anewarray 4	java/lang/Object
      //   334: dup
      //   335: iconst_0
      //   336: getstatic 149	com/tencent/mm/y/bd:goh	[J
      //   339: getstatic 152	com/tencent/mm/y/bd:gor	[I
      //   342: iload_1
      //   343: iaload
      //   344: laload
      //   345: invokestatic 168	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   348: aastore
      //   349: dup
      //   350: iconst_1
      //   351: iload_2
      //   352: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   355: aastore
      //   356: invokestatic 176	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   359: invokestatic 182	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
      //   362: ldc -72
      //   364: invokevirtual 190	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
      //   367: checkcast 192	android/os/PowerManager
      //   370: invokestatic 182	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
      //   373: invokevirtual 195	android/content/Context:getPackageName	()Ljava/lang/String;
      //   376: invokevirtual 199	android/os/PowerManager:isIgnoringBatteryOptimizations	(Ljava/lang/String;)Z
      //   379: istore_3
      //   380: ldc 86
      //   382: new 88	java/lang/StringBuilder
      //   385: dup
      //   386: ldc -55
      //   388: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   391: iload_3
      //   392: invokevirtual 204	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
      //   395: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   398: invokestatic 105	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   401: iload_3
      //   402: ifne +197 -> 599
      //   405: getstatic 138	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
      //   408: ldc2_w 153
      //   411: ldc2_w 205
      //   414: lconst_1
      //   415: iconst_1
      //   416: invokevirtual 160	com/tencent/mm/plugin/report/d:a	(JJJZ)V
      //   419: iconst_0
      //   420: putstatic 84	com/tencent/mm/y/bd:goq	Z
      //   423: iconst_0
      //   424: putstatic 84	com/tencent/mm/y/bd:goq	Z
      //   427: ldc2_w 37
      //   430: ldc 39
      //   432: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   435: return
      //   436: aload 4
      //   438: invokevirtual 207	java/lang/Object:toString	()Ljava/lang/String;
      //   441: invokestatic 211	com/tencent/mm/y/bd$a:gV	(Ljava/lang/String;)Lcom/tencent/mm/y/bd$a;
      //   444: astore 4
      //   446: aload 4
      //   448: ifnonnull +20 -> 468
      //   451: iconst_0
      //   452: putstatic 84	com/tencent/mm/y/bd:goq	Z
      //   455: iconst_0
      //   456: putstatic 84	com/tencent/mm/y/bd:goq	Z
      //   459: ldc2_w 37
      //   462: ldc 39
      //   464: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   467: return
      //   468: aload 4
      //   470: getstatic 73	com/tencent/mm/y/bd:gon	[I
      //   473: invokevirtual 215	com/tencent/mm/y/bd$a:d	([I)V
      //   476: aload 4
      //   478: invokevirtual 80	com/tencent/mm/y/bd$a:Bn	()Ljava/lang/String;
      //   481: astore 5
      //   483: ldc 86
      //   485: new 88	java/lang/StringBuilder
      //   488: dup
      //   489: ldc -39
      //   491: invokespecial 93	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   494: aload 5
      //   496: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   499: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   502: invokestatic 105	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   505: goto -406 -> 99
      //   508: aload 4
      //   510: getfield 145	com/tencent/mm/y/bd$a:gou	[I
      //   513: astore 5
      //   515: aload 4
      //   517: getfield 145	com/tencent/mm/y/bd$a:gou	[I
      //   520: ifnonnull +69 -> 589
      //   523: iconst_0
      //   524: istore_1
      //   525: ldc 86
      //   527: ldc -37
      //   529: iconst_3
      //   530: anewarray 4	java/lang/Object
      //   533: dup
      //   534: iconst_0
      //   535: aload 5
      //   537: aastore
      //   538: dup
      //   539: iconst_1
      //   540: iload_1
      //   541: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   544: aastore
      //   545: dup
      //   546: iconst_2
      //   547: getstatic 149	com/tencent/mm/y/bd:goh	[J
      //   550: arraylength
      //   551: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   554: aastore
      //   555: invokestatic 222	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   558: goto -199 -> 359
      //   561: astore 4
      //   563: ldc 86
      //   565: aload 4
      //   567: ldc -32
      //   569: iconst_0
      //   570: anewarray 4	java/lang/Object
      //   573: invokestatic 228	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   576: iconst_0
      //   577: putstatic 84	com/tencent/mm/y/bd:goq	Z
      //   580: ldc2_w 37
      //   583: ldc 39
      //   585: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   588: return
      //   589: aload 4
      //   591: getfield 145	com/tencent/mm/y/bd$a:gou	[I
      //   594: arraylength
      //   595: istore_1
      //   596: goto -71 -> 525
      //   599: getstatic 138	com/tencent/mm/plugin/report/d:oqe	Lcom/tencent/mm/plugin/report/d;
      //   602: ldc2_w 153
      //   605: ldc2_w 229
      //   608: lconst_1
      //   609: iconst_1
      //   610: invokevirtual 160	com/tencent/mm/plugin/report/d:a	(JJJZ)V
      //   613: goto -194 -> 419
      //   616: astore 4
      //   618: ldc 86
      //   620: ldc -24
      //   622: invokestatic 234	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   625: goto -206 -> 419
      //   628: astore 4
      //   630: iconst_0
      //   631: putstatic 84	com/tencent/mm/y/bd:goq	Z
      //   634: aload 4
      //   636: athrow
      //   637: iload_1
      //   638: iconst_1
      //   639: isub
      //   640: istore_1
      //   641: goto -352 -> 289
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	644	0	this	c
      //   288	353	1	i	int
      //   304	48	2	j	int
      //   379	23	3	bool	boolean
      //   25	491	4	localObject1	Object
      //   561	29	4	localThrowable	Throwable
      //   616	1	4	localException	Exception
      //   628	7	4	localObject2	Object
      //   53	483	5	localObject3	Object
      //   194	38	6	str	String
      // Exception table:
      //   from	to	target	type
      //   8	27	561	java/lang/Throwable
      //   32	55	561	java/lang/Throwable
      //   60	64	561	java/lang/Throwable
      //   77	99	561	java/lang/Throwable
      //   99	120	561	java/lang/Throwable
      //   125	289	561	java/lang/Throwable
      //   293	305	561	java/lang/Throwable
      //   309	359	561	java/lang/Throwable
      //   359	401	561	java/lang/Throwable
      //   405	419	561	java/lang/Throwable
      //   419	423	561	java/lang/Throwable
      //   436	446	561	java/lang/Throwable
      //   451	455	561	java/lang/Throwable
      //   468	505	561	java/lang/Throwable
      //   508	523	561	java/lang/Throwable
      //   525	558	561	java/lang/Throwable
      //   589	596	561	java/lang/Throwable
      //   599	613	561	java/lang/Throwable
      //   618	625	561	java/lang/Throwable
      //   359	401	616	java/lang/Exception
      //   405	419	616	java/lang/Exception
      //   599	613	616	java/lang/Exception
      //   8	27	628	finally
      //   32	55	628	finally
      //   60	64	628	finally
      //   77	99	628	finally
      //   99	120	628	finally
      //   125	289	628	finally
      //   293	305	628	finally
      //   309	359	628	finally
      //   359	401	628	finally
      //   405	419	628	finally
      //   419	423	628	finally
      //   436	446	628	finally
      //   451	455	628	finally
      //   468	505	628	finally
      //   508	523	628	finally
      //   525	558	628	finally
      //   563	576	628	finally
      //   589	596	628	finally
      //   599	613	628	finally
      //   618	625	628	finally
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */