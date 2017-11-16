package com.tencent.mm.plugin.report.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.BaseEvent;
import com.tencent.mars.smc.IDKey;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public enum g
  implements com.tencent.mm.plugin.report.c
{
  private long orl;
  private int orm;
  private HashMap<String, Long> orn;
  private int oro;
  private int orp;
  private int uin;
  
  static
  {
    GMTrace.i(13126091145216L, 97797);
    ork = new g("INSTANCE");
    orq = new g[] { ork };
    GMTrace.o(13126091145216L, 97797);
  }
  
  private g()
  {
    GMTrace.i(13123541008384L, 97778);
    this.orl = 0L;
    if (ab.bPY())
    {
      h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13122064613376L, 97767);
          g.a(g.this);
          GMTrace.o(13122064613376L, 97767);
        }
      });
      h.wS().a(701, new com.tencent.mm.ad.e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(18921612640256L, 140977);
          if (paramAnonymousInt1 != 0)
          {
            GMTrace.o(18921612640256L, 140977);
            return;
          }
          h.xB().h(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18920404680704L, 140968);
              g.b(g.this);
              GMTrace.o(18920404680704L, 140968);
            }
          }, 5000L);
          GMTrace.o(18921612640256L, 140977);
        }
      });
    }
    GMTrace.o(13123541008384L, 97778);
  }
  
  public static Object a(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3)
  {
    GMTrace.i(13123675226112L, 97779);
    paramArrayOfInt = com.tencent.mm.plugin.report.d.a(paramInt1, paramArrayOfInt, paramInt2, paramInt3);
    GMTrace.o(13123675226112L, 97779);
    return paramArrayOfInt;
  }
  
  private static void b(int paramInt, List<String> paramList, boolean paramBoolean)
  {
    GMTrace.i(16288395034624L, 121358);
    if ((paramList == null) || (paramList.isEmpty())) {
      w.w("MicroMsg.ReportManagerKvCheck", "vals is null, use '' as value");
    }
    StringBuilder localStringBuilder;
    for (paramList = ""; ab.bPY(); paramList = localStringBuilder.toString())
    {
      d.a(paramInt, paramList, paramBoolean, false);
      GMTrace.o(16288395034624L, 121358);
      return;
      localStringBuilder = new StringBuilder();
      int j = paramList.size() - 1;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append((String)paramList.get(i)).append(',');
        i += 1;
      }
      localStringBuilder.append((String)paramList.get(j));
    }
    h(paramInt, paramList, paramBoolean);
    GMTrace.o(16288395034624L, 121358);
  }
  
  public static void bca()
  {
    GMTrace.i(13125554274304L, 97793);
    if (ab.bPY())
    {
      BaseEvent.onSingalCrash(0);
      GMTrace.o(13125554274304L, 97793);
      return;
    }
    KVCommCrossProcessReceiver.bbT();
    GMTrace.o(13125554274304L, 97793);
  }
  
  private static void h(int paramInt, String paramString, boolean paramBoolean)
  {
    GMTrace.i(16288126599168L, 121356);
    KVReportDataInfo localKVReportDataInfo = new KVReportDataInfo();
    localKVReportDataInfo.oqW = paramInt;
    localKVReportDataInfo.value = paramString;
    localKVReportDataInfo.oqE = false;
    localKVReportDataInfo.oqX = paramBoolean;
    KVCommCrossProcessReceiver.a(localKVReportDataInfo);
    GMTrace.o(16288126599168L, 121356);
  }
  
  public static void k(final String paramString, List<String> paramList)
  {
    GMTrace.i(18921075769344L, 140973);
    w.i("MicroMsg.ReportManagerKvCheck", "cLogList %d", new Object[] { Integer.valueOf(paramList.size()) });
    if (paramList.size() <= 0)
    {
      GMTrace.o(18921075769344L, 140973);
      return;
    }
    if ((ab.bPY()) && (h.xw().wL())) {}
    for (String str = com.tencent.mm.y.q.zE();; str = null)
    {
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        SharedPreferences ghC;
        String host;
        final JSONArray orv;
        
        public final void run()
        {
          GMTrace.i(18922417946624L, 140983);
          Object localObject1 = this.inH.iterator();
          for (;;)
          {
            Object localObject3;
            Object localObject2;
            if (((Iterator)localObject1).hasNext())
            {
              localObject3 = (String)((Iterator)localObject1).next();
              localObject2 = new JSONObject();
            }
            try
            {
              ((JSONObject)localObject2).put("tag", paramString).put("info", localObject3);
              this.orv.put(localObject2);
              continue;
              try
              {
                localObject1 = new JSONObject().put("head", new JSONObject().put("protocol_ver", 1).put("phone", com.tencent.mm.protocal.d.tJA).put("os_ver", com.tencent.mm.protocal.d.DEVICE_TYPE).put("report_time", this.oru).put("revision", bg.nl(com.tencent.mm.sdk.platformtools.e.REV))).put("items", this.orv).toString().getBytes();
                int i = localObject1.length;
                localObject2 = com.tencent.mm.a.g.n(String.format("weixin#$()%d%d", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.tJC), Integer.valueOf(i) }).getBytes()).toLowerCase();
                localObject3 = com.tencent.mm.a.q.l((byte[])localObject1);
                localObject1 = new PByteArray();
                com.tencent.mm.a.c.a((PByteArray)localObject1, (byte[])localObject3, ((String)localObject2).getBytes());
                localObject2 = new StringBuilder(256).append("http://").append(this.host).append("/cgi-bin/mmsupport-bin/stackreport?version=0x26051334&devicetype=").append(com.tencent.mm.protocal.d.DEVICE_TYPE).append("&filelength=").append(i).append("&sum=").append((String)localObject2).append("&reporttype=1&NewReportType=110");
                if ((this.gxn != null) && (this.gxn.length() != 0)) {
                  ((StringBuilder)localObject2).append("&username=").append(this.gxn);
                }
                localObject3 = ((StringBuilder)localObject2).toString();
                localObject2 = new DefaultHttpClient();
                localObject3 = new HttpPost((String)localObject3);
                localObject1 = new ByteArrayEntity(((PByteArray)localObject1).value);
                ((ByteArrayEntity)localObject1).setContentType("binary/octet-stream");
                ((HttpPost)localObject3).setEntity((HttpEntity)localObject1);
                localObject1 = ((HttpClient)localObject2).execute((HttpUriRequest)localObject3);
                localObject2 = ((HttpResponse)localObject1).getEntity();
                w.i("MicroMsg.cLog", "POST code %d returned: %s", new Object[] { Integer.valueOf(((HttpResponse)localObject1).getStatusLine().getStatusCode()), bg.convertStreamToString(((HttpEntity)localObject2).getContent()) });
                GMTrace.o(18922417946624L, 140983);
                return;
              }
              catch (Exception localException)
              {
                w.printErrStackTrace("MicroMsg.ReportManagerKvCheck", localException, "Failed to upload cLog.", new Object[0]);
                GMTrace.o(18922417946624L, 140983);
                return;
              }
            }
            catch (JSONException localJSONException)
            {
              for (;;) {}
            }
          }
        }
      }, "ReportManager_cLog");
      GMTrace.o(18921075769344L, 140973);
      return;
    }
  }
  
  public final void A(int paramInt, String paramString)
  {
    GMTrace.i(13123943661568L, 97781);
    if (com.tencent.mm.plugin.report.a.c.oqh)
    {
      a(paramInt, paramString, com.tencent.mm.plugin.report.a.c.oqi, com.tencent.mm.plugin.report.a.c.oqi);
      GMTrace.o(13123943661568L, 97781);
      return;
    }
    a(paramInt, paramString, false, false);
    GMTrace.o(13123943661568L, 97781);
  }
  
  public final void M(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(13125420056576L, 97792);
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(paramInt1);
    localIDKey1.SetKey(paramInt2);
    localIDKey1.SetValue(1L);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(paramInt1);
    localIDKey2.SetKey(paramInt3);
    localIDKey2.SetValue(1L);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localIDKey1);
    localArrayList.add(localIDKey2);
    b(localArrayList, false);
    GMTrace.o(13125420056576L, 97792);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
  {
    GMTrace.i(20305800069120L, 151290);
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(paramInt1);
    localIDKey1.SetKey(paramInt3);
    localIDKey1.SetValue(1L);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(paramInt2);
    localIDKey2.SetKey(paramInt4);
    localIDKey2.SetValue(paramInt6);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localIDKey1);
    localArrayList.add(localIDKey2);
    b(localArrayList, paramBoolean);
    GMTrace.o(20305800069120L, 151290);
  }
  
  public final void a(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13124077879296L, 97782);
    if (ab.bPY())
    {
      if (com.tencent.mm.plugin.report.a.c.oqh)
      {
        d.a(paramInt, paramString, com.tencent.mm.plugin.report.a.c.oqi, com.tencent.mm.plugin.report.a.c.oqi);
        GMTrace.o(13124077879296L, 97782);
        return;
      }
      d.a(paramInt, paramString, paramBoolean1, false);
      GMTrace.o(13124077879296L, 97782);
      return;
    }
    h(paramInt, paramString, paramBoolean1);
    GMTrace.o(13124077879296L, 97782);
  }
  
  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, Object... paramVarArgs)
  {
    GMTrace.i(13124346314752L, 97784);
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0)) {
      w.w("MicroMsg.ReportManagerKvCheck", "vals is null, use '' as value");
    }
    StringBuilder localStringBuilder;
    for (paramVarArgs = "";; paramVarArgs = localStringBuilder.toString())
    {
      if (b.bPq()) {
        w.v("MicroMsg.ReportManagerKvCheck", "kvTypedStat id:%d [%b,%b] val:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean1), Boolean.valueOf(false), paramVarArgs });
      }
      if (!ab.bPY()) {
        break;
      }
      d.a(paramInt, paramVarArgs, paramBoolean1, false);
      GMTrace.o(13124346314752L, 97784);
      return;
      localStringBuilder = new StringBuilder();
      int j = paramVarArgs.length - 1;
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append(String.valueOf(paramVarArgs[i]).replace(',', ' ')).append(',');
        i += 1;
      }
      localStringBuilder.append(String.valueOf(paramVarArgs[j]));
    }
    h(paramInt, paramVarArgs, paramBoolean1);
    GMTrace.o(13124346314752L, 97784);
  }
  
  public final void a(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    GMTrace.i(13124883185664L, 97788);
    if ((paramLong1 < 0L) || (paramLong2 < 0L) || (paramLong3 <= 0L))
    {
      w.e("MicroMsg.ReportManagerKvCheck", "ID %d, key %d, value %d <0", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong3) });
      GMTrace.o(13124883185664L, 97788);
      return;
    }
    if (ab.bPY())
    {
      d.b(paramLong1, paramLong2, paramLong3, false);
      GMTrace.o(13124883185664L, 97788);
      return;
    }
    StIDKeyDataInfo localStIDKeyDataInfo = new StIDKeyDataInfo();
    localStIDKeyDataInfo.ory = paramLong1;
    localStIDKeyDataInfo.key = paramLong2;
    localStIDKeyDataInfo.value = paramLong3;
    localStIDKeyDataInfo.oqE = false;
    KVCommCrossProcessReceiver.a(localStIDKeyDataInfo);
    GMTrace.o(13124883185664L, 97788);
  }
  
  public final void b(ArrayList<IDKey> paramArrayList, boolean paramBoolean)
  {
    GMTrace.i(18782294638592L, 139939);
    if (paramArrayList == null)
    {
      w.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat lstIdKeyDataInfos == null return");
      GMTrace.o(18782294638592L, 139939);
      return;
    }
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      IDKey localIDKey = (IDKey)localIterator.next();
      if (localIDKey == null)
      {
        w.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat info == null return");
        GMTrace.o(18782294638592L, 139939);
        return;
      }
      if ((localIDKey.GetID() < 0L) || (localIDKey.GetKey() < 0L) || (localIDKey.GetValue() <= 0L))
      {
        w.e("MicroMsg.ReportManagerKvCheck", "report idkeyGroupStat ID %d, key %d, value %d <0", new Object[] { Long.valueOf(localIDKey.GetID()), Long.valueOf(localIDKey.GetKey()), Long.valueOf(localIDKey.GetValue()) });
        GMTrace.o(18782294638592L, 139939);
        return;
      }
    }
    if (ab.bPY())
    {
      d.c(paramArrayList, false);
      GMTrace.o(18782294638592L, 139939);
      return;
    }
    KVCommCrossProcessReceiver.O(paramArrayList);
    GMTrace.o(18782294638592L, 139939);
  }
  
  /* Error */
  public final boolean b(int paramInt, com.tencent.mm.bm.a parama)
  {
    // Byte code:
    //   0: ldc2_w 526
    //   3: ldc_w 528
    //   6: invokestatic 48	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_2
    //   10: invokevirtual 532	java/lang/Object:getClass	()Ljava/lang/Class;
    //   13: ldc_w 534
    //   16: invokevirtual 540	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   19: aload_2
    //   20: ldc_w 541
    //   23: invokevirtual 547	java/lang/reflect/Field:setInt	(Ljava/lang/Object;I)V
    //   26: invokestatic 552	com/tencent/mm/sdk/platformtools/bg:Pv	()J
    //   29: lstore_3
    //   30: lload_3
    //   31: ldc2_w 553
    //   34: ldiv
    //   35: aload_0
    //   36: getfield 70	com/tencent/mm/plugin/report/service/g:orl	J
    //   39: lcmp
    //   40: ifeq +35 -> 75
    //   43: new 556	java/text/SimpleDateFormat
    //   46: dup
    //   47: ldc_w 558
    //   50: invokespecial 559	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   53: astore 7
    //   55: aload_0
    //   56: aload 7
    //   58: new 561	java/util/Date
    //   61: dup
    //   62: invokespecial 562	java/util/Date:<init>	()V
    //   65: invokevirtual 566	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   68: iconst_0
    //   69: invokestatic 570	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   72: putfield 572	com/tencent/mm/plugin/report/service/g:orm	I
    //   75: aload_2
    //   76: invokevirtual 532	java/lang/Object:getClass	()Ljava/lang/Class;
    //   79: ldc_w 574
    //   82: invokevirtual 540	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   85: aload_2
    //   86: aload_0
    //   87: getfield 572	com/tencent/mm/plugin/report/service/g:orm	I
    //   90: invokevirtual 547	java/lang/reflect/Field:setInt	(Ljava/lang/Object;I)V
    //   93: aload_0
    //   94: getfield 576	com/tencent/mm/plugin/report/service/g:uin	I
    //   97: i2l
    //   98: lstore 5
    //   100: aload_2
    //   101: invokevirtual 532	java/lang/Object:getClass	()Ljava/lang/Class;
    //   104: ldc_w 578
    //   107: invokevirtual 540	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   110: aload_2
    //   111: lload 5
    //   113: ldc2_w 579
    //   116: land
    //   117: invokevirtual 584	java/lang/reflect/Field:setLong	(Ljava/lang/Object;J)V
    //   120: aload_2
    //   121: invokevirtual 532	java/lang/Object:getClass	()Ljava/lang/Class;
    //   124: ldc_w 586
    //   127: invokevirtual 540	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   130: aload_2
    //   131: iconst_2
    //   132: invokevirtual 547	java/lang/reflect/Field:setInt	(Ljava/lang/Object;I)V
    //   135: aload_2
    //   136: invokevirtual 532	java/lang/Object:getClass	()Ljava/lang/Class;
    //   139: ldc_w 588
    //   142: invokevirtual 540	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   145: aload_2
    //   146: getstatic 593	com/tencent/mm/protocal/d:tJC	I
    //   149: invokevirtual 547	java/lang/reflect/Field:setInt	(Ljava/lang/Object;I)V
    //   152: aload_2
    //   153: invokevirtual 532	java/lang/Object:getClass	()Ljava/lang/Class;
    //   156: ldc_w 595
    //   159: invokevirtual 540	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   162: aload_2
    //   163: lload_3
    //   164: invokevirtual 584	java/lang/reflect/Field:setLong	(Ljava/lang/Object;J)V
    //   167: aload_2
    //   168: invokevirtual 601	com/tencent/mm/bm/a:toByteArray	()[B
    //   171: astore_2
    //   172: invokestatic 76	com/tencent/mm/sdk/platformtools/ab:bPY	()Z
    //   175: ifeq +121 -> 296
    //   178: getstatic 401	com/tencent/mm/plugin/report/a/c:oqh	Z
    //   181: ifeq +64 -> 245
    //   184: iload_1
    //   185: i2l
    //   186: aload_2
    //   187: getstatic 404	com/tencent/mm/plugin/report/a/c:oqi	Z
    //   190: getstatic 404	com/tencent/mm/plugin/report/a/c:oqi	Z
    //   193: invokestatic 604	com/tencent/mm/plugin/report/service/d:a	(J[BZZ)V
    //   196: ldc2_w 526
    //   199: ldc_w 528
    //   202: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   205: iconst_1
    //   206: ireturn
    //   207: astore_2
    //   208: ldc -17
    //   210: ldc_w 606
    //   213: iconst_2
    //   214: anewarray 199	java/lang/Object
    //   217: dup
    //   218: iconst_0
    //   219: iload_1
    //   220: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   223: aastore
    //   224: dup
    //   225: iconst_1
    //   226: aload_2
    //   227: invokevirtual 607	java/lang/Exception:toString	()Ljava/lang/String;
    //   230: aastore
    //   231: invokestatic 477	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: ldc2_w 526
    //   237: ldc_w 528
    //   240: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   243: iconst_0
    //   244: ireturn
    //   245: iload_1
    //   246: i2l
    //   247: lstore_3
    //   248: lload_3
    //   249: aload_2
    //   250: iconst_0
    //   251: iconst_0
    //   252: invokestatic 604	com/tencent/mm/plugin/report/service/d:a	(J[BZZ)V
    //   255: goto -59 -> 196
    //   258: astore_2
    //   259: ldc -17
    //   261: ldc_w 609
    //   264: iconst_2
    //   265: anewarray 199	java/lang/Object
    //   268: dup
    //   269: iconst_0
    //   270: iload_1
    //   271: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   274: aastore
    //   275: dup
    //   276: iconst_1
    //   277: aload_2
    //   278: invokevirtual 610	java/io/IOException:toString	()Ljava/lang/String;
    //   281: aastore
    //   282: invokestatic 477	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   285: ldc2_w 526
    //   288: ldc_w 528
    //   291: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   294: iconst_0
    //   295: ireturn
    //   296: ldc -17
    //   298: ldc_w 612
    //   301: invokestatic 615	com/tencent/mm/sdk/platformtools/w:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   304: goto -108 -> 196
    //   307: astore 7
    //   309: goto -234 -> 75
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	312	0	this	g
    //   0	312	1	paramInt	int
    //   0	312	2	parama	com.tencent.mm.bm.a
    //   29	220	3	l1	long
    //   98	14	5	l2	long
    //   53	4	7	localSimpleDateFormat	java.text.SimpleDateFormat
    //   307	1	7	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   9	55	207	java/lang/Exception
    //   75	167	207	java/lang/Exception
    //   167	196	258	java/io/IOException
    //   248	255	258	java/io/IOException
    //   296	304	258	java/io/IOException
    //   55	75	307	java/lang/Exception
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    GMTrace.i(13125285838848L, 97791);
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(paramInt1);
    localIDKey1.SetKey(paramInt2);
    localIDKey1.SetValue(paramInt4);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(paramInt1);
    localIDKey2.SetKey(paramInt3);
    localIDKey2.SetValue(1L);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localIDKey1);
    localArrayList.add(localIDKey2);
    b(localArrayList, false);
    GMTrace.o(13125285838848L, 97791);
  }
  
  public final void d(int paramInt, List<String> paramList)
  {
    GMTrace.i(13124614750208L, 97786);
    if (com.tencent.mm.plugin.report.a.c.oqh)
    {
      b(paramInt, paramList, com.tencent.mm.plugin.report.a.c.oqi);
      GMTrace.o(13124614750208L, 97786);
      return;
    }
    b(paramInt, paramList, false);
    GMTrace.o(13124614750208L, 97786);
  }
  
  public final void d(final String paramString1, final String paramString2, final Map<String, Object> paramMap)
  {
    GMTrace.i(13125822709760L, 97795);
    final int i;
    String str;
    final long l;
    if ((ab.bPY()) && (h.xw().wL()))
    {
      h.xw();
      i = a.ww();
      if (h.xy().xh() == null)
      {
        str = null;
        l = System.currentTimeMillis();
        if (this.orn == null) {
          break label331;
        }
      }
    }
    label331:
    for (Long localLong = (Long)this.orn.get(paramString1);; localLong = null)
    {
      if (localLong == null) {
        break label337;
      }
      byte[] arrayOfByte = com.tencent.mm.a.g.o((paramString1 + i + SystemClock.uptimeMillis()).getBytes());
      if ((arrayOfByte == null) || (arrayOfByte.length != 16)) {
        break label337;
      }
      int j = arrayOfByte[0];
      int k = arrayOfByte[4];
      int m = arrayOfByte[8];
      int n = arrayOfByte[12];
      int i1 = arrayOfByte[1];
      int i2 = arrayOfByte[5];
      int i3 = arrayOfByte[9];
      int i4 = arrayOfByte[13];
      int i5 = arrayOfByte[2];
      int i6 = arrayOfByte[6];
      int i7 = arrayOfByte[10];
      int i8 = arrayOfByte[14];
      int i9 = arrayOfByte[3];
      int i10 = arrayOfByte[7];
      int i11 = arrayOfByte[11];
      if (((arrayOfByte[15] + (i9 + i10 + i11) & 0xFF) << 12 | j + k + m + n & 0xFF | (i1 + i2 + i3 + i4 & 0xFF) << 4 | (i5 + i6 + i7 + i8 & 0xFF) << 8) <= localLong.longValue()) {
        break label337;
      }
      GMTrace.o(13125822709760L, 97795);
      return;
      str = com.tencent.mm.y.q.zE();
      break;
      i = 0;
      str = null;
      break;
    }
    label337:
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18922686382080L, 140985);
        w.e("MicroMsg.cLog", "[%s] %s", new Object[] { paramString1, paramString2 });
        try
        {
          Object localObject2 = ab.getContext().getSharedPreferences("system_config_prefs", 0).getString("support.weixin.qq.com", "support.weixin.qq.com");
          if (paramMap == null) {}
          for (Object localObject1 = new JSONObject();; localObject1 = new JSONObject(paramMap))
          {
            ((JSONObject)localObject1).put("tag", paramString1).put("info", paramString2);
            if (i != 0) {
              ((JSONObject)localObject1).put("uin", i);
            }
            localObject1 = new JSONObject().put("head", new JSONObject().put("protocol_ver", 1).put("phone", com.tencent.mm.protocal.d.tJA).put("os_ver", com.tencent.mm.protocal.d.DEVICE_TYPE).put("report_time", l).put("revision", bg.nl(com.tencent.mm.sdk.platformtools.e.REV))).put("items", new JSONArray().put(localObject1)).toString().getBytes();
            int i = localObject1.length;
            Object localObject3 = com.tencent.mm.a.g.n(String.format("weixin#$()%d%d", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.tJC), Integer.valueOf(i) }).getBytes()).toLowerCase();
            byte[] arrayOfByte = com.tencent.mm.a.q.l((byte[])localObject1);
            localObject1 = new PByteArray();
            com.tencent.mm.a.c.a((PByteArray)localObject1, arrayOfByte, ((String)localObject3).getBytes());
            localObject2 = new StringBuilder(256).append("http://").append((String)localObject2).append("/cgi-bin/mmsupport-bin/stackreport?version=").append(Integer.toHexString(com.tencent.mm.protocal.d.tJC)).append("&devicetype=").append(com.tencent.mm.protocal.d.DEVICE_TYPE).append("&filelength=").append(i).append("&sum=").append((String)localObject3).append("&reporttype=1&NewReportType=110");
            if ((this.gxn != null) && (this.gxn.length() != 0)) {
              ((StringBuilder)localObject2).append("&username=").append(this.gxn);
            }
            if (i != 0) {
              ((StringBuilder)localObject2).append("&uin=").append(i);
            }
            localObject3 = ((StringBuilder)localObject2).toString();
            localObject2 = new DefaultHttpClient();
            localObject3 = new HttpPost((String)localObject3);
            localObject1 = new ByteArrayEntity(((PByteArray)localObject1).value);
            ((ByteArrayEntity)localObject1).setContentType("binary/octet-stream");
            ((HttpPost)localObject3).setEntity((HttpEntity)localObject1);
            localObject1 = bg.convertStreamToString(((HttpClient)localObject2).execute((HttpUriRequest)localObject3).getEntity().getContent());
            w.i("MicroMsg.cLog", "POST returned: " + (String)localObject1);
            GMTrace.o(18922686382080L, 140985);
            return;
          }
          return;
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.ReportManagerKvCheck", localException, "Failed to upload cLog.", new Object[0]);
          GMTrace.o(18922686382080L, 140985);
        }
      }
    }, "ReportManager_cLog");
    GMTrace.o(13125822709760L, 97795);
  }
  
  public final void dp(int paramInt)
  {
    GMTrace.i(13125956927488L, 97796);
    this.uin = paramInt;
    SmcLogic.setUin(paramInt);
    GMTrace.o(13125956927488L, 97796);
  }
  
  public final void du(String paramString1, String paramString2)
  {
    GMTrace.i(13125688492032L, 97794);
    d(paramString1, paramString2, null);
    GMTrace.o(13125688492032L, 97794);
  }
  
  public final void i(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13124212097024L, 97783);
    if (com.tencent.mm.plugin.report.a.c.oqh)
    {
      a(paramInt, com.tencent.mm.plugin.report.a.c.oqi, com.tencent.mm.plugin.report.a.c.oqi, paramVarArgs);
      GMTrace.o(13124212097024L, 97783);
      return;
    }
    a(paramInt, false, false, paramVarArgs);
    GMTrace.o(13124212097024L, 97783);
  }
  
  public final void r(long paramLong1, long paramLong2)
  {
    GMTrace.i(21010845794304L, 156543);
    a(paramLong1, paramLong2, 1L, false);
    GMTrace.o(21010845794304L, 156543);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\service\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */