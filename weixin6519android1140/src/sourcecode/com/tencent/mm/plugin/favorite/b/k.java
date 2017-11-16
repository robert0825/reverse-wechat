package com.tencent.mm.plugin.favorite.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

public final class k
  extends i<j>
{
  public static final String[] fTX;
  public static final String lbe;
  public e fTZ;
  
  static
  {
    GMTrace.i(6269175857152L, 46709);
    fTX = new String[] { i.a(j.fTp, "FavItemInfo") };
    lbe = "xml,edittime" + ",ext,favProto" + ",flag,fromUser" + ",id,itemStatus" + ",localId,localSeq" + ",realChatName,sourceCreateTime" + ",sourceId,sourceType" + ",toUser,type" + ",updateSeq,updateTime" + ",tagProto,sessionId" + ",datatotalsize,rowid";
    GMTrace.o(6269175857152L, 46709);
  }
  
  public k(e parame)
  {
    super(parame, j.fTp, "FavItemInfo", null);
    GMTrace.i(6266759938048L, 46691);
    this.fTZ = parame;
    GMTrace.o(6266759938048L, 46691);
  }
  
  public static long e(j paramj)
  {
    GMTrace.i(6268638986240L, 46705);
    Object localObject = x.lca;
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      if (localObject[i] == paramj.field_type)
      {
        if (paramj.field_favProto != null)
        {
          localObject = paramj.field_favProto.ulB.iterator();
          for (long l1 = 0L;; l1 = ((th)((Iterator)localObject).next()).ujO + l1)
          {
            l2 = l1;
            if (!((Iterator)localObject).hasNext()) {
              break;
            }
          }
        }
        long l2 = 0L;
        paramj.field_datatotalsize = l2;
        w.d("MicroMsg.FavItemInfoStorage", "calFavItemInfoTotalLength id:%d,length:%d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(l2) });
        GMTrace.o(6268638986240L, 46705);
        return l2;
      }
      i += 1;
    }
    GMTrace.o(6268638986240L, 46705);
    return 0L;
  }
  
  public final ArrayList<j> a(List<Long> paramList, List<j> paramList1, Set<Integer> paramSet, x.a parama)
  {
    GMTrace.i(6268370550784L, 46703);
    if ((paramList == null) || (paramList.size() == 0) || (paramList.size() > 20))
    {
      GMTrace.o(6268370550784L, 46703);
      return null;
    }
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("select ").append(lbe).append(" from FavItemInfo where ");
    if ((paramSet != null) && (paramSet.size() > 0))
    {
      ((StringBuffer)localObject).append("( 1=1");
      paramSet = paramSet.iterator();
      while (paramSet.hasNext())
      {
        Integer localInteger = (Integer)paramSet.next();
        ((StringBuffer)localObject).append(" and type != ").append(localInteger);
      }
      ((StringBuffer)localObject).append(") and ");
    }
    int j = paramList.size();
    int i = 0;
    if (i < j)
    {
      if (i == 0) {
        ((StringBuffer)localObject).append("( ");
      }
      if (i == j - 1) {
        ((StringBuffer)localObject).append("localId = ").append(paramList.get(i)).append(" )");
      }
      for (;;)
      {
        i += 1;
        break;
        ((StringBuffer)localObject).append("localId = ").append(paramList.get(i)).append(" or ");
      }
    }
    ((StringBuffer)localObject).append(" order by updateTime desc");
    paramList = ((StringBuffer)localObject).toString();
    w.d("MicroMsg.FavItemInfoStorage", "get list by id list sql %s", new Object[] { paramList });
    localObject = this.fTZ.a(paramList, null, 2);
    if (localObject == null)
    {
      GMTrace.o(6268370550784L, 46703);
      return null;
    }
    paramList = null;
    if (((Cursor)localObject).moveToFirst()) {
      paramSet = new ArrayList();
    }
    label437:
    label444:
    for (;;)
    {
      if ((paramList1 == null) || (paramList1.isEmpty()))
      {
        paramList = new j();
        paramList.b((Cursor)localObject);
        if ((parama == null) || (!parama.g(paramList))) {
          break label437;
        }
        w.w("MicroMsg.FavItemInfoStorage", "id[%d] type[%d] match filter", new Object[] { Integer.valueOf(paramList.field_id), Integer.valueOf(paramList.field_type) });
      }
      for (;;)
      {
        if (((Cursor)localObject).moveToNext()) {
          break label444;
        }
        paramList = paramSet;
        ((Cursor)localObject).close();
        GMTrace.o(6268370550784L, 46703);
        return paramList;
        paramList = (j)paramList1.remove(0);
        break;
        paramSet.add(paramList);
      }
    }
  }
  
  /* Error */
  public final List<j> a(long paramLong, int paramInt, Set<Integer> paramSet, x.a parama)
  {
    // Byte code:
    //   0: ldc2_w 267
    //   3: ldc_w 269
    //   6: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload 4
    //   11: ifnull +36 -> 47
    //   14: aload 4
    //   16: iload_3
    //   17: invokestatic 154	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   20: invokeinterface 272 2 0
    //   25: ifeq +22 -> 47
    //   28: ldc -115
    //   30: ldc_w 274
    //   33: invokestatic 277	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   36: ldc2_w 267
    //   39: ldc_w 269
    //   42: invokestatic 79	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   45: aconst_null
    //   46: areturn
    //   47: new 228	java/util/ArrayList
    //   50: dup
    //   51: invokespecial 229	java/util/ArrayList:<init>	()V
    //   54: astore 7
    //   56: new 40	java/lang/StringBuilder
    //   59: dup
    //   60: ldc -75
    //   62: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   65: getstatic 76	com/tencent/mm/plugin/favorite/b/k:lbe	Ljava/lang/String;
    //   68: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: ldc_w 279
    //   74: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: ldc_w 281
    //   80: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: lload_1
    //   84: invokevirtual 284	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   87: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: astore 6
    //   92: iload_3
    //   93: iconst_m1
    //   94: if_icmpeq +107 -> 201
    //   97: new 40	java/lang/StringBuilder
    //   100: dup
    //   101: invokespecial 285	java/lang/StringBuilder:<init>	()V
    //   104: aload 6
    //   106: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: ldc_w 287
    //   112: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: iload_3
    //   116: invokevirtual 290	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   119: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: astore 4
    //   124: new 40	java/lang/StringBuilder
    //   127: dup
    //   128: invokespecial 285	java/lang/StringBuilder:<init>	()V
    //   131: aload 4
    //   133: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: ldc_w 292
    //   139: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: astore 4
    //   147: new 40	java/lang/StringBuilder
    //   150: dup
    //   151: invokespecial 285	java/lang/StringBuilder:<init>	()V
    //   154: aload 4
    //   156: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: ldc -43
    //   161: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: astore 4
    //   169: aload_0
    //   170: getfield 89	com/tencent/mm/plugin/favorite/b/k:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   173: aload 4
    //   175: aconst_null
    //   176: iconst_2
    //   177: invokeinterface 221 4 0
    //   182: astore 4
    //   184: aload 4
    //   186: ifnonnull +96 -> 282
    //   189: ldc2_w 267
    //   192: ldc_w 269
    //   195: invokestatic 79	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   198: aload 7
    //   200: areturn
    //   201: aload 4
    //   203: ifnull +154 -> 357
    //   206: aload 4
    //   208: invokeinterface 192 1 0
    //   213: astore 8
    //   215: aload 6
    //   217: astore 4
    //   219: aload 8
    //   221: invokeinterface 126 1 0
    //   226: ifeq -102 -> 124
    //   229: aload 8
    //   231: invokeinterface 130 1 0
    //   236: checkcast 150	java/lang/Integer
    //   239: invokevirtual 295	java/lang/Integer:intValue	()I
    //   242: istore_3
    //   243: new 40	java/lang/StringBuilder
    //   246: dup
    //   247: invokespecial 285	java/lang/StringBuilder:<init>	()V
    //   250: aload 6
    //   252: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: ldc -62
    //   257: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: iload_3
    //   261: invokevirtual 290	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   264: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   267: astore 6
    //   269: goto -54 -> 215
    //   272: astore 6
    //   274: ldc -115
    //   276: ldc_w 297
    //   279: invokestatic 299	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   282: aload 4
    //   284: invokeinterface 251 1 0
    //   289: ifeq +49 -> 338
    //   292: new 26	com/tencent/mm/plugin/favorite/b/j
    //   295: dup
    //   296: invokespecial 233	com/tencent/mm/plugin/favorite/b/j:<init>	()V
    //   299: astore 6
    //   301: aload 6
    //   303: aload 4
    //   305: invokevirtual 237	com/tencent/mm/plugin/favorite/b/j:b	(Landroid/database/Cursor;)V
    //   308: aload 5
    //   310: ifnull +15 -> 325
    //   313: aload 5
    //   315: aload 6
    //   317: invokeinterface 243 2 0
    //   322: ifne -40 -> 282
    //   325: aload 7
    //   327: aload 6
    //   329: invokeinterface 300 2 0
    //   334: pop
    //   335: goto -53 -> 282
    //   338: aload 4
    //   340: invokeinterface 254 1 0
    //   345: ldc2_w 267
    //   348: ldc_w 269
    //   351: invokestatic 79	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   354: aload 7
    //   356: areturn
    //   357: aload 6
    //   359: astore 4
    //   361: goto -237 -> 124
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	364	0	this	k
    //   0	364	1	paramLong	long
    //   0	364	3	paramInt	int
    //   0	364	4	paramSet	Set<Integer>
    //   0	364	5	parama	x.a
    //   90	178	6	str	String
    //   272	1	6	localException	Exception
    //   299	59	6	localj	j
    //   54	301	7	localArrayList	ArrayList
    //   213	17	8	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   301	308	272	java/lang/Exception
  }
  
  public final boolean a(j paramj, String... paramVarArgs)
  {
    GMTrace.i(6267431026688L, 46696);
    tw localtw;
    if (paramj.field_favProto.ulz != null)
    {
      localtw = paramj.field_favProto.ulz;
      if (localtw.eDi > 0) {
        break label172;
      }
      w.w("MicroMsg.FavItemInfoStorage", "update::favid %d favlocalid %d type %d, sourceTypeError %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), Integer.valueOf(paramj.field_type), Integer.valueOf(localtw.eDi) });
      localtw.zZ(1);
    }
    for (;;)
    {
      e(paramj);
      boolean bool = super.a(paramj, false, paramVarArgs);
      if (bool) {
        a(paramj.field_localId, 3, Long.valueOf(paramj.field_localId));
      }
      w.d("MicroMsg.FavItemInfoStorage", "update result[%B]", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(6267431026688L, 46696);
      return bool;
      label172:
      localtw.zZ(localtw.eDi);
    }
  }
  
  public final List<j> axP()
  {
    ArrayList localArrayList = null;
    GMTrace.i(6268236333056L, 46702);
    Object localObject = "select " + lbe + " from FavItemInfo where itemStatus" + "=3 or itemStatus" + "=6 or itemStatus" + "=11 or itemStatus" + "=14 or itemStatus" + "=16 or itemStatus" + "=18";
    localObject = this.fTZ.a((String)localObject, null, 2);
    if (localObject == null)
    {
      GMTrace.o(6268236333056L, 46702);
      return null;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      localArrayList = new ArrayList();
      do
      {
        j localj = new j();
        localj.b((Cursor)localObject);
        localArrayList.add(localj);
      } while (((Cursor)localObject).moveToNext());
    }
    ((Cursor)localObject).close();
    GMTrace.o(6268236333056L, 46702);
    return localArrayList;
  }
  
  public final List<Long> axQ()
  {
    GMTrace.i(6268773203968L, 46706);
    ArrayList localArrayList = new ArrayList();
    Object localObject = "select localId from FavItemInfo" + " order by updateTime desc";
    localObject = this.fTZ.a((String)localObject, null, 2);
    if (localObject == null)
    {
      GMTrace.o(6268773203968L, 46706);
      return localArrayList;
    }
    if (((Cursor)localObject).getCount() == 0)
    {
      ((Cursor)localObject).close();
      GMTrace.o(6268773203968L, 46706);
      return localArrayList;
    }
    while (((Cursor)localObject).moveToNext()) {
      localArrayList.add(Long.valueOf(((Cursor)localObject).getLong(0)));
    }
    ((Cursor)localObject).close();
    GMTrace.o(6268773203968L, 46706);
    return localArrayList;
  }
  
  public final boolean b(j paramj, String... paramVarArgs)
  {
    GMTrace.i(6268504768512L, 46704);
    tw localtw;
    if (paramj.field_favProto.ulz != null)
    {
      localtw = paramj.field_favProto.ulz;
      if (localtw.eDi > 0) {
        break label115;
      }
      w.w("MicroMsg.FavItemInfoStorage", "update::favid %d favlocalid %d type %d, sourceTypeError %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), Integer.valueOf(paramj.field_type), Integer.valueOf(localtw.eDi) });
      localtw.zZ(1);
    }
    for (;;)
    {
      boolean bool = super.a(paramj, false, paramVarArgs);
      GMTrace.o(6268504768512L, 46704);
      return bool;
      label115:
      localtw.zZ(localtw.eDi);
    }
  }
  
  public final boolean c(j paramj)
  {
    GMTrace.i(6267296808960L, 46695);
    boolean bool;
    tw localtw;
    if (paramj.field_localId > 0L)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramj.field_favProto.ulz != null)
      {
        localtw = paramj.field_favProto.ulz;
        if (localtw.eDi > 0) {
          break label168;
        }
        w.w("MicroMsg.FavItemInfoStorage", "insert::favid %d favlocalid %d type %d, sourceTypeError %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), Integer.valueOf(paramj.field_type), Integer.valueOf(localtw.eDi) });
        localtw.zZ(1);
      }
    }
    for (;;)
    {
      e(paramj);
      bool = a(paramj, false);
      if (bool) {
        a(paramj.field_localId, 2, Long.valueOf(paramj.field_localId));
      }
      GMTrace.o(6267296808960L, 46695);
      return bool;
      bool = false;
      break;
      label168:
      localtw.zZ(localtw.eDi);
    }
  }
  
  public final j cf(long paramLong)
  {
    GMTrace.i(6266894155776L, 46692);
    if (this.fTZ == null)
    {
      w.e("MicroMsg.FavItemInfoStorage", "getBtLocalId, but db is null, return");
      GMTrace.o(6266894155776L, 46692);
      return null;
    }
    Cursor localCursor = this.fTZ.a("FavItemInfo", null, "localId=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    if (localCursor.moveToFirst())
    {
      j localj = new j();
      try
      {
        localj.b(localCursor);
        localCursor.close();
        GMTrace.o(6266894155776L, 46692);
        return localj;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.FavItemInfoStorage", "getByLocalId convertFrom(cu) cause IlleagalStateException, return null");
        localCursor.close();
        GMTrace.o(6266894155776L, 46692);
        return null;
      }
    }
    w.w("MicroMsg.FavItemInfoStorage", "klem getByLocalId:%d, no data", new Object[] { Long.valueOf(paramLong) });
    localCursor.close();
    GMTrace.o(6266894155776L, 46692);
    return null;
  }
  
  public final j cg(long paramLong)
  {
    GMTrace.i(6267028373504L, 46693);
    Object localObject = "Select * from FavItemInfo where id = " + paramLong;
    localObject = this.fTZ.rawQuery((String)localObject, null);
    if (((Cursor)localObject).getCount() != 0)
    {
      j localj = new j();
      ((Cursor)localObject).moveToFirst();
      try
      {
        localj.b((Cursor)localObject);
        ((Cursor)localObject).close();
        GMTrace.o(6267028373504L, 46693);
        return localj;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.FavItemInfoStorage", localException, "", new Object[0]);
        w.e("MicroMsg.FavItemInfoStorage", "getByFavId(%d),info.convertFrom error", new Object[] { Long.valueOf(paramLong) });
        ((Cursor)localObject).close();
        GMTrace.o(6267028373504L, 46693);
        return null;
      }
    }
    w.w("MicroMsg.FavItemInfoStorage", "klem getByFavId:%d, no data", new Object[] { Long.valueOf(paramLong) });
    ((Cursor)localObject).close();
    GMTrace.o(6267028373504L, 46693);
    return null;
  }
  
  public final void d(j paramj)
  {
    GMTrace.i(6268102115328L, 46701);
    String str = "delete from FavItemInfo where localId = " + paramj.field_localId;
    w.i("MicroMsg.FavItemInfoStorage", "delete sql: " + str);
    this.fTZ.eZ("FavItemInfo", str);
    a(paramj.field_localId, 5, Long.valueOf(paramj.field_localId));
    GMTrace.o(6268102115328L, 46701);
  }
  
  public final boolean n(long paramLong, int paramInt)
  {
    GMTrace.i(6267565244416L, 46697);
    String str = "select count(updateTime) from FavItemInfo where updateTime < " + paramLong;
    Object localObject = str;
    if (paramInt != -1) {
      localObject = str + " and type = " + paramInt;
    }
    localObject = this.fTZ.a((String)localObject, null, 2);
    if (localObject == null)
    {
      GMTrace.o(6267565244416L, 46697);
      return true;
    }
    ((Cursor)localObject).moveToFirst();
    if (((Cursor)localObject).getInt(0) == 0)
    {
      ((Cursor)localObject).close();
      GMTrace.o(6267565244416L, 46697);
      return true;
    }
    ((Cursor)localObject).close();
    GMTrace.o(6267565244416L, 46697);
    return false;
  }
  
  public final LinkedList<Integer> p(long paramLong, int paramInt)
  {
    GMTrace.i(6267699462144L, 46698);
    LinkedList localLinkedList = new LinkedList();
    String str = "select id from FavItemInfo where updateTime >= " + paramLong;
    Object localObject = str;
    if (paramInt != -1) {
      localObject = str + " and type = " + paramInt;
    }
    localObject = (String)localObject + " and updateSeq > localSeq";
    localObject = (String)localObject + " order by updateTime desc";
    localObject = this.fTZ.a((String)localObject, null, 2);
    if (localObject == null)
    {
      GMTrace.o(6267699462144L, 46698);
      return localLinkedList;
    }
    while (((Cursor)localObject).moveToNext()) {
      localLinkedList.add(Integer.valueOf(((Cursor)localObject).getInt(0)));
    }
    ((Cursor)localObject).close();
    GMTrace.o(6267699462144L, 46698);
    return localLinkedList;
  }
  
  public final void s(int paramInt, long paramLong)
  {
    GMTrace.i(6267967897600L, 46700);
    w.d("MicroMsg.FavItemInfoStorage", "setStatus status:%d,localId:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    String str = "update FavItemInfo set itemStatus = " + paramInt + " where localId = " + paramLong;
    this.fTZ.eZ("FavItemInfo", str);
    SS(String.valueOf(paramLong));
    GMTrace.o(6267967897600L, 46700);
  }
  
  public final j xJ(String paramString)
  {
    GMTrace.i(6267162591232L, 46694);
    Cursor localCursor = this.fTZ.a("FavItemInfo", null, "sourceId=?", new String[] { paramString }, null, null, null, 2);
    if (localCursor.moveToFirst())
    {
      paramString = new j();
      paramString.b(localCursor);
      localCursor.close();
      GMTrace.o(6267162591232L, 46694);
      return paramString;
    }
    w.w("MicroMsg.FavItemInfoStorage", "klem getBySourceId:%s, no data", new Object[] { paramString });
    localCursor.close();
    GMTrace.o(6267162591232L, 46694);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */