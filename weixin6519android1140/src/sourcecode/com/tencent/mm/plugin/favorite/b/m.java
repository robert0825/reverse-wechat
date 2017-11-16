package com.tencent.mm.plugin.favorite.b;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.favorite.c.a;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class m
{
  public static j a(LinkedList<th> paramLinkedList, long paramLong)
  {
    GMTrace.i(6265149325312L, 46679);
    Object localObject1 = null;
    if (paramLong != -1L)
    {
      localObject2 = h.axB().cf(paramLong);
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = x.ct(paramLong);
      }
      ((j)localObject1).field_favProto.ulB.clear();
    }
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new j();
      ((j)localObject2).field_type = 18;
      ((j)localObject2).field_sourceType = 6;
      f((j)localObject2);
      ((j)localObject2).field_favProto.zY(1);
      ((j)localObject2).field_favProto.zX(127);
    }
    ((j)localObject2).field_edittime = bg.Pu();
    ((j)localObject2).field_updateTime = bg.Pv();
    ((j)localObject2).field_favProto.eD(((j)localObject2).field_edittime);
    ((j)localObject2).field_favProto.ulz.eE(bg.Pv());
    ((j)localObject2).field_favProto.av(paramLinkedList);
    GMTrace.o(6265149325312L, 46679);
    return (j)localObject2;
  }
  
  public static boolean a(String paramString, LinkedList<th> paramLinkedList, long paramLong)
  {
    GMTrace.i(16937069314048L, 126191);
    if (paramString.length() == 0)
    {
      w.e("MicroMsg.FavPostLogic", "postNote null");
      GMTrace.o(16937069314048L, 126191);
      return false;
    }
    if (-1L == paramLong) {}
    for (paramString = a(paramLinkedList, paramLong);; paramString = h.axB().cf(paramLong))
    {
      a.z(paramString);
      GMTrace.o(16937069314048L, 126191);
      return true;
    }
  }
  
  /* Error */
  private static List<String> ax(List<String> paramList)
  {
    // Byte code:
    //   0: ldc2_w 146
    //   3: ldc -108
    //   5: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: ifnull +12 -> 21
    //   12: aload_0
    //   13: invokeinterface 153 1 0
    //   18: ifne +13 -> 31
    //   21: ldc2_w 146
    //   24: ldc -108
    //   26: invokestatic 110	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   29: aload_0
    //   30: areturn
    //   31: new 155	java/util/ArrayList
    //   34: dup
    //   35: invokespecial 156	java/util/ArrayList:<init>	()V
    //   38: astore_2
    //   39: new 158	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger
    //   42: dup
    //   43: invokespecial 159	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:<init>	()V
    //   46: astore_3
    //   47: aload_0
    //   48: invokeinterface 163 1 0
    //   53: astore 4
    //   55: aload 4
    //   57: invokeinterface 169 1 0
    //   62: ifeq +115 -> 177
    //   65: aload 4
    //   67: invokeinterface 173 1 0
    //   72: checkcast 119	java/lang/String
    //   75: astore 5
    //   77: aconst_null
    //   78: astore_1
    //   79: aload 5
    //   81: invokestatic 179	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   84: astore_0
    //   85: aload_0
    //   86: ifnonnull +10 -> 96
    //   89: aload_0
    //   90: invokestatic 183	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   93: goto -38 -> 55
    //   96: aload_0
    //   97: astore_1
    //   98: aload_0
    //   99: aload_3
    //   100: invokestatic 189	com/tencent/mm/sdk/platformtools/MMBitmapFactory:checkIsImageLegal	(Ljava/io/InputStream;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Z
    //   103: ifeq +21 -> 124
    //   106: aload_0
    //   107: astore_1
    //   108: aload_2
    //   109: aload 5
    //   111: invokeinterface 193 2 0
    //   116: pop
    //   117: aload_0
    //   118: invokestatic 183	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   121: goto -66 -> 55
    //   124: aload_0
    //   125: astore_1
    //   126: aload_3
    //   127: invokevirtual 196	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:getDecodeResult	()I
    //   130: sipush 2000
    //   133: if_icmplt -16 -> 117
    //   136: aload_0
    //   137: astore_1
    //   138: aload_0
    //   139: iconst_5
    //   140: aload_3
    //   141: invokestatic 202	com/tencent/mm/sdk/platformtools/MMBitmapFactory$KVStatHelper:getKVStatString	(Ljava/lang/Object;ILcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Ljava/lang/String;
    //   144: astore 5
    //   146: aload_0
    //   147: astore_1
    //   148: getstatic 208	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   151: sipush 12712
    //   154: aload 5
    //   156: invokevirtual 212	com/tencent/mm/plugin/report/service/g:A	(ILjava/lang/String;)V
    //   159: goto -42 -> 117
    //   162: astore_1
    //   163: aload_0
    //   164: invokestatic 183	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   167: goto -112 -> 55
    //   170: astore_0
    //   171: aload_1
    //   172: invokestatic 183	com/tencent/mm/sdk/platformtools/bg:g	(Ljava/io/Closeable;)V
    //   175: aload_0
    //   176: athrow
    //   177: ldc2_w 146
    //   180: ldc -108
    //   182: invokestatic 110	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   185: aload_2
    //   186: areturn
    //   187: astore_0
    //   188: aconst_null
    //   189: astore_0
    //   190: goto -27 -> 163
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	193	0	paramList	List<String>
    //   78	70	1	localList	List<String>
    //   162	10	1	localException	Exception
    //   38	148	2	localArrayList	java.util.ArrayList
    //   46	95	3	localDecodeResultLogger	com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger
    //   53	13	4	localIterator	Iterator
    //   75	80	5	str	String
    // Exception table:
    //   from	to	target	type
    //   98	106	162	java/lang/Exception
    //   108	117	162	java/lang/Exception
    //   126	136	162	java/lang/Exception
    //   138	146	162	java/lang/Exception
    //   148	159	162	java/lang/Exception
    //   79	85	170	finally
    //   98	106	170	finally
    //   108	117	170	finally
    //   126	136	170	finally
    //   138	146	170	finally
    //   148	159	170	finally
    //   79	85	187	java/lang/Exception
  }
  
  public static boolean ay(List<String> paramList)
  {
    GMTrace.i(6265417760768L, 46681);
    paramList = ax(paramList);
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.e("MicroMsg.FavPostLogic", "postImgs path null");
      GMTrace.o(6265417760768L, 46681);
      return false;
    }
    j localj = new j();
    localj.field_type = 2;
    localj.field_sourceType = 6;
    f(localj);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      th localth = new th();
      localth.Qu(str);
      localth.Qt(x.aX(localth.toString(), 2));
      d.b(str, 150, 150, Bitmap.CompressFormat.JPEG, 90, x.h(localth));
      localth.Qv(x.h(localth));
      localth.zR(2);
      localj.field_favProto.ulB.add(localth);
    }
    a.z(localj);
    g.ork.i(10648, new Object[] { Integer.valueOf(2), Integer.valueOf(paramList.size()) });
    GMTrace.o(6265417760768L, 46681);
    return true;
  }
  
  public static void f(j paramj)
  {
    GMTrace.i(6265551978496L, 46682);
    String str = q.zE();
    tw localtw = new tw();
    localtw.QY(str);
    localtw.QZ(str);
    localtw.zZ(paramj.field_sourceType);
    localtw.eE(bg.Pv());
    paramj.field_favProto.a(localtw);
    paramj.field_fromUser = localtw.eMI;
    paramj.field_toUser = localtw.toUser;
    GMTrace.o(6265551978496L, 46682);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */