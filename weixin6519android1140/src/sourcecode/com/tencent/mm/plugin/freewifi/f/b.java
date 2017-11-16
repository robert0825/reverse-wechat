package com.tencent.mm.plugin.freewifi.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.g.f;
import com.tencent.mm.plugin.freewifi.i.a;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.protocal.c.un;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
{
  public static volatile boolean lsa;
  static Pattern lsb;
  static Pattern lsc;
  
  static
  {
    GMTrace.i(7260507996160L, 54095);
    lsa = true;
    lsb = Pattern.compile("\"result\":(-?[0-9]+)");
    lsc = Pattern.compile("\"stageName\":\"(.+?)\"");
    GMTrace.o(7260507996160L, 54095);
  }
  
  static String M(LinkedList<un> paramLinkedList)
  {
    GMTrace.i(7260105342976L, 54092);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      GMTrace.o(7260105342976L, 54092);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      paramLinkedList = (un)localIterator.next();
      localStringBuilder.append("|id=").append(m.yr(paramLinkedList.id)).append("|");
      String[] arrayOfString = m.yr(paramLinkedList.umP).split("\\},");
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        String str = arrayOfString[i];
        Matcher localMatcher = lsc.matcher(str);
        paramLinkedList = "";
        if (localMatcher.find()) {
          paramLinkedList = localMatcher.group(1);
        }
        localMatcher = lsb.matcher(str);
        str = "0";
        if (localMatcher.find()) {
          str = localMatcher.group(1);
        }
        localStringBuilder.append(k.yo(paramLinkedList) + "=" + str).append("|");
        i += 1;
      }
    }
    paramLinkedList = localStringBuilder.toString();
    GMTrace.o(7260105342976L, 54092);
    return paramLinkedList;
  }
  
  public static void nU(int paramInt)
  {
    GMTrace.i(7259971125248L, 54091);
    j.aBi().aAR().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7259836907520L, 54090);
        if (!b.lsa)
        {
          GMTrace.o(7259836907520L, 54090);
          return;
        }
        if (this.lsd == 0)
        {
          long l = System.currentTimeMillis() - i.a.loq.nn("LOCAL_CONFIG_LAST_MOBILE_NETWORK_REPORT_TIMEMILLIS");
          w.v("MicroMsg.FreeWifi.FreeWifiServerReporter", "mobile netowrk report interval between last time is : " + l);
          if ((l >= 0L) && (l <= 86400000L))
          {
            w.v("MicroMsg.FreeWifi.FreeWifiServerReporter", "interval less than 24 hours. return.");
            GMTrace.o(7259836907520L, 54090);
            return;
          }
          i.a.loq.w("LOCAL_CONFIG_LAST_MOBILE_NETWORK_REPORT_TIMEMILLIS", System.currentTimeMillis());
        }
        b.lsa = false;
        Object localObject = j.aBg();
        m.a("FreeWifiLog", f.lsh, (com.tencent.mm.sdk.e.i)localObject, "MicroMsg.FreeWifi.FreeWifiLogStorage");
        localObject = ((f)localObject).aBH();
        String str = "ServerReportSimpleLog:" + b.M((LinkedList)localObject);
        m.yv(str);
        w.i("MicroMsg.FreeWifi.FreeWifiServerReporter", str);
        if (((LinkedList)localObject).size() > 0)
        {
          new com.tencent.mm.plugin.freewifi.d.e((LinkedList)localObject).b(new com.tencent.mm.ad.e()
          {
            /* Error */
            public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
            {
              // Byte code:
              //   0: ldc2_w 37
              //   3: ldc 39
              //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
              //   8: ldc 41
              //   10: ldc 43
              //   12: iconst_3
              //   13: anewarray 4	java/lang/Object
              //   16: dup
              //   17: iconst_0
              //   18: iload_1
              //   19: invokestatic 49	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
              //   22: aastore
              //   23: dup
              //   24: iconst_1
              //   25: iload_2
              //   26: invokestatic 49	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
              //   29: aastore
              //   30: dup
              //   31: iconst_2
              //   32: aload_3
              //   33: aastore
              //   34: invokestatic 54	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
              //   37: iload_1
              //   38: iload_2
              //   39: invokestatic 60	com/tencent/mm/plugin/freewifi/m:cf	(II)Z
              //   42: ifeq +199 -> 241
              //   45: aload 4
              //   47: checkcast 62	com/tencent/mm/plugin/freewifi/d/e
              //   50: invokevirtual 66	com/tencent/mm/plugin/freewifi/d/e:aBu	()Ljava/util/LinkedList;
              //   53: astore 4
              //   55: aload 4
              //   57: ifnull +184 -> 241
              //   60: aload 4
              //   62: invokevirtual 72	java/util/LinkedList:size	()I
              //   65: ifle +176 -> 241
              //   68: invokestatic 78	com/tencent/mm/plugin/freewifi/model/j:aBg	()Lcom/tencent/mm/plugin/freewifi/g/f;
              //   71: astore_3
              //   72: aload 4
              //   74: invokevirtual 82	java/util/LinkedList:iterator	()Ljava/util/Iterator;
              //   77: astore 4
              //   79: aload 4
              //   81: invokeinterface 88 1 0
              //   86: ifeq +155 -> 241
              //   89: aload 4
              //   91: invokeinterface 92 1 0
              //   96: checkcast 94	com/tencent/mm/protocal/c/un
              //   99: astore 7
              //   101: aload 7
              //   103: getfield 98	com/tencent/mm/protocal/c/un:id	Ljava/lang/String;
              //   106: astore 6
              //   108: aload 7
              //   110: getfield 102	com/tencent/mm/protocal/c/un:eGy	I
              //   113: istore_1
              //   114: ldc 41
              //   116: ldc 104
              //   118: iconst_2
              //   119: anewarray 4	java/lang/Object
              //   122: dup
              //   123: iconst_0
              //   124: aload 6
              //   126: aastore
              //   127: dup
              //   128: iconst_1
              //   129: iload_1
              //   130: invokestatic 49	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
              //   133: aastore
              //   134: invokestatic 54	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
              //   137: aload 6
              //   139: invokestatic 108	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
              //   142: ifne -63 -> 79
              //   145: iload_1
              //   146: ifne -67 -> 79
              //   149: ldc 110
              //   151: ldc 112
              //   153: iconst_1
              //   154: anewarray 4	java/lang/Object
              //   157: dup
              //   158: iconst_0
              //   159: aload 6
              //   161: aastore
              //   162: invokestatic 54	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
              //   165: new 114	com/tencent/mm/plugin/freewifi/g/e
              //   168: dup
              //   169: invokespecial 115	com/tencent/mm/plugin/freewifi/g/e:<init>	()V
              //   172: astore 7
              //   174: aload 7
              //   176: aload 6
              //   178: putfield 118	com/tencent/mm/plugin/freewifi/g/e:field_id	Ljava/lang/String;
              //   181: aload_3
              //   182: aload 7
              //   184: iconst_0
              //   185: anewarray 120	java/lang/String
              //   188: invokevirtual 125	com/tencent/mm/plugin/freewifi/g/f:a	(Lcom/tencent/mm/sdk/e/c;[Ljava/lang/String;)Z
              //   191: istore 5
              //   193: ldc 110
              //   195: new 127	java/lang/StringBuilder
              //   198: dup
              //   199: ldc -127
              //   201: invokespecial 132	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
              //   204: iload 5
              //   206: invokevirtual 136	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
              //   209: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
              //   212: invokestatic 143	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
              //   215: goto -136 -> 79
              //   218: astore_3
              //   219: ldc 41
              //   221: aload_3
              //   222: invokestatic 147	com/tencent/mm/plugin/freewifi/m:e	(Ljava/lang/Exception;)Ljava/lang/String;
              //   225: invokestatic 149	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
              //   228: iconst_1
              //   229: putstatic 155	com/tencent/mm/plugin/freewifi/f/b:lsa	Z
              //   232: ldc2_w 37
              //   235: ldc 39
              //   237: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
              //   240: return
              //   241: iconst_1
              //   242: putstatic 155	com/tencent/mm/plugin/freewifi/f/b:lsa	Z
              //   245: ldc2_w 37
              //   248: ldc 39
              //   250: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
              //   253: return
              //   254: astore_3
              //   255: iconst_1
              //   256: putstatic 155	com/tencent/mm/plugin/freewifi/f/b:lsa	Z
              //   259: aload_3
              //   260: athrow
              // Local variable table:
              //   start	length	slot	name	signature
              //   0	261	0	this	1
              //   0	261	1	paramAnonymous2Int1	int
              //   0	261	2	paramAnonymous2Int2	int
              //   0	261	3	paramAnonymous2String	String
              //   0	261	4	paramAnonymous2k	com.tencent.mm.ad.k
              //   191	14	5	bool	boolean
              //   106	71	6	str	String
              //   99	84	7	localObject	Object
              // Exception table:
              //   from	to	target	type
              //   8	55	218	java/lang/Exception
              //   60	79	218	java/lang/Exception
              //   79	145	218	java/lang/Exception
              //   149	215	218	java/lang/Exception
              //   8	55	254	finally
              //   60	79	254	finally
              //   79	145	254	finally
              //   149	215	254	finally
              //   219	228	254	finally
            }
          });
          GMTrace.o(7259836907520L, 54090);
          return;
        }
        b.lsa = true;
        GMTrace.o(7259836907520L, 54090);
      }
    });
    GMTrace.o(7259971125248L, 54091);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */