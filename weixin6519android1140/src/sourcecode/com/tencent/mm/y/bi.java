package com.tencent.mm.y;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public final class bi
  extends j
{
  public static final String[] fTX;
  public g goN;
  
  static
  {
    GMTrace.i(627199442944L, 4673);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS readerappnews1 ( tweetid text  PRIMARY KEY , time long  , type int  , name text  , title text  , url text  , shorturl text  , longurl text  , pubtime long  , sourcename text  , sourceicon text  , istop int  , cover text  , digest text  , reserved1 int  , reserved2 long  , reserved3 text  , reserved4 text  ) ", "CREATE TABLE IF NOT EXISTS readerappweibo ( tweetid text  PRIMARY KEY , time long  , type int  , name text  , title text  , url text  , shorturl text  , longurl text  , pubtime long  , sourcename text  , sourceicon text  , istop int  , cover text  , digest text  , reserved1 int  , reserved2 long  , reserved3 text  , reserved4 text  ) ", "CREATE INDEX IF NOT EXISTS  readerapptime ON readerappnews1 ( time )", "CREATE INDEX IF NOT EXISTS  readerapptime ON readerappweibo ( time )" };
    GMTrace.o(627199442944L, 4673);
  }
  
  public bi(g paramg)
  {
    GMTrace.i(625723047936L, 4662);
    this.goN = paramg;
    GMTrace.o(625723047936L, 4662);
  }
  
  public static String fx(int paramInt)
  {
    GMTrace.i(625588830208L, 4661);
    if (paramInt == 20)
    {
      GMTrace.o(625588830208L, 4661);
      return "readerappnews1";
    }
    if (paramInt == 11)
    {
      GMTrace.o(625588830208L, 4661);
      return "readerappweibo";
    }
    Assert.assertTrue("INFO TYPE NEITHER NEWS NOR WEIBO", false);
    GMTrace.o(625588830208L, 4661);
    return null;
  }
  
  private static String gX(String paramString)
  {
    GMTrace.i(625454612480L, 4660);
    paramString = "select tweetid,time,type,name,title,url,shorturl,longurl,pubtime,sourcename,sourceicon,istop,cover,digest,reserved1,reserved2,reserved3,reserved4 from " + paramString + "  ";
    GMTrace.o(625454612480L, 4660);
    return paramString;
  }
  
  public final void U(long paramLong)
  {
    GMTrace.i(626528354304L, 4668);
    String str = "delete from " + fx(20) + " where reserved2 = " + paramLong;
    w.d("MicroMsg.ReaderAppInfoStorage", "deleteGroupByMsgSvrID:%s", new Object[] { str });
    if (this.goN.eZ(fx(20), str))
    {
      fA(20);
      doNotify();
    }
    GMTrace.o(626528354304L, 4668);
  }
  
  public final List<bh> a(long paramLong, int paramInt)
  {
    GMTrace.i(626259918848L, 4666);
    ArrayList localArrayList = new ArrayList();
    Object localObject = gX(fx(20)) + " where reserved2 = " + paramLong;
    w.d("MicroMsg.ReaderAppInfoStorage", "getInfoListByMsgSvrID :" + (String)localObject);
    localObject = this.goN.a((String)localObject, null, 2);
    while (((Cursor)localObject).moveToNext())
    {
      bh localbh = new bh();
      localbh.b((Cursor)localObject);
      localArrayList.add(localbh);
    }
    ((Cursor)localObject).close();
    GMTrace.o(626259918848L, 4666);
    return localArrayList;
  }
  
  public final void a(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(626662572032L, 4669);
    Object localObject2 = x(paramString, paramInt);
    if ((localObject2 == null) || (((List)localObject2).size() == 0))
    {
      GMTrace.o(626662572032L, 4669);
      return;
    }
    Object localObject1 = (bh)((List)localObject2).get(0);
    Object localObject3 = ((List)localObject2).iterator();
    if (((Iterator)localObject3).hasNext())
    {
      localObject2 = (bh)((Iterator)localObject3).next();
      if (((bh)localObject2).goI != 1) {
        break label439;
      }
      localObject1 = localObject2;
    }
    label430:
    label439:
    for (;;)
    {
      break;
      if ((this.goN.delete(fx(paramInt), "reserved3=?", new String[] { paramString }) >= 0) && (paramBoolean1)) {
        doNotify();
      }
      if (paramBoolean2)
      {
        paramString = gX(fx(paramInt)) + " where istop = 1  group by time" + " ORDER BY time DESC  limit 2";
        w.i("MicroMsg.ReaderAppInfoStorage", "processConversationAfterDeleteInfo, sql is %s", new Object[] { paramString });
        localObject3 = this.goN.a(paramString, null, 2);
        if (!((Cursor)localObject3).moveToFirst())
        {
          ((Cursor)localObject3).close();
          paramString = new ae();
          paramString.setUsername(bh.fw(paramInt));
          paramString.setContent("");
          paramString.x(0L);
          paramString.dC(0);
          paramString.dz(0);
          at.AR();
          c.yP().a(paramString, bh.fw(paramInt));
          GMTrace.o(626662572032L, 4669);
          return;
        }
        at.AR();
        paramString = c.yP().TO(bh.fw(paramInt));
        localObject2 = new bh();
        ((bh)localObject2).b((Cursor)localObject3);
        ((Cursor)localObject3).close();
        localObject3 = new ae();
        ((ae)localObject3).setUsername(bh.fw(paramInt));
        ((ae)localObject3).setContent(((bh)localObject2).getTitle());
        ((ae)localObject3).x(((bh)localObject2).time);
        ((ae)localObject3).dC(0);
        if ((paramString.field_unReadCount <= 0) || (localObject1 == null) || (!paramString.field_content.equals(((bh)localObject1).getTitle()))) {
          break label430;
        }
        ((ae)localObject3).dz(paramString.field_unReadCount - 1);
      }
      for (;;)
      {
        at.AR();
        c.yP().a((ae)localObject3, bh.fw(paramInt));
        GMTrace.o(626662572032L, 4669);
        return;
        ((ae)localObject3).dz(0);
      }
    }
  }
  
  public final boolean a(bh parambh)
  {
    GMTrace.i(625857265664L, 4663);
    if (parambh == null)
    {
      GMTrace.o(625857265664L, 4663);
      return false;
    }
    parambh.eQl = -1;
    ContentValues localContentValues = new ContentValues();
    if ((parambh.eQl & 0x1) != 0) {
      localContentValues.put("tweetid", parambh.Bv());
    }
    if ((parambh.eQl & 0x2) != 0) {
      localContentValues.put("time", Long.valueOf(parambh.time));
    }
    if ((parambh.eQl & 0x4) != 0) {
      localContentValues.put("type", Integer.valueOf(parambh.type));
    }
    if ((parambh.eQl & 0x8) != 0) {
      localContentValues.put("name", parambh.getName());
    }
    if ((parambh.eQl & 0x10) != 0) {
      localContentValues.put("title", parambh.getTitle());
    }
    if ((parambh.eQl & 0x20) != 0) {
      localContentValues.put("url", parambh.getUrl());
    }
    if ((parambh.eQl & 0x40) != 0) {
      localContentValues.put("shorturl", parambh.Bw());
    }
    if ((parambh.eQl & 0x80) != 0)
    {
      if (parambh.goE == null)
      {
        str = "";
        localContentValues.put("longurl", str);
      }
    }
    else
    {
      if ((parambh.eQl & 0x100) != 0) {
        localContentValues.put("pubtime", Long.valueOf(parambh.goF));
      }
      if ((parambh.eQl & 0x200) != 0) {
        localContentValues.put("sourcename", parambh.Bx());
      }
      if ((parambh.eQl & 0x400) != 0) {
        localContentValues.put("sourceicon", parambh.By());
      }
      if ((parambh.eQl & 0x800) != 0) {
        localContentValues.put("istop", Integer.valueOf(parambh.goI));
      }
      if ((parambh.eQl & 0x1000) != 0) {
        localContentValues.put("cover", parambh.Bz());
      }
      if ((parambh.eQl & 0x2000) != 0) {
        localContentValues.put("digest", parambh.BA());
      }
      if ((parambh.eQl & 0x4000) != 0) {
        localContentValues.put("reserved1", Integer.valueOf(parambh.goJ));
      }
      if ((parambh.eQl & 0x8000) != 0) {
        localContentValues.put("reserved2", Long.valueOf(parambh.goK));
      }
      if ((parambh.eQl & 0x10000) != 0) {
        localContentValues.put("reserved3", parambh.BB());
      }
      if ((parambh.eQl & 0x20000) != 0) {
        if (parambh.goM != null) {
          break label497;
        }
      }
    }
    label497:
    for (String str = "";; str = parambh.goM)
    {
      localContentValues.put("reserved4", str);
      if ((int)this.goN.insert(fx(parambh.type), "tweetid", localContentValues) == -1) {
        break label505;
      }
      GMTrace.o(625857265664L, 4663);
      return true;
      str = parambh.goE;
      break;
    }
    label505:
    GMTrace.o(625857265664L, 4663);
    return false;
  }
  
  public final Cursor aL(int paramInt1, int paramInt2)
  {
    GMTrace.i(625991483392L, 4664);
    Object localObject = "SELECT time from " + fx(paramInt2) + " GROUP BY time ORDER BY time" + " ASC  LIMIT " + paramInt1 + " offset (SELECT COUNT(*) FROM (SELECT COUNT(*) FROM " + fx(paramInt2) + " GROUP BY time)) -" + paramInt1;
    localObject = this.goN.a((String)localObject, null, 0);
    GMTrace.o(625991483392L, 4664);
    return (Cursor)localObject;
  }
  
  public final List<bh> b(long paramLong, int paramInt)
  {
    GMTrace.i(626394136576L, 4667);
    ArrayList localArrayList = new ArrayList();
    Object localObject = gX(fx(paramInt)) + " where time = " + paramLong + " order by istop desc , tweetid" + " asc ";
    w.d("MicroMsg.ReaderAppInfoStorage", "getInfobyGroup :" + (String)localObject);
    localObject = this.goN.a((String)localObject, null, 2);
    while (((Cursor)localObject).moveToNext())
    {
      bh localbh = new bh();
      localbh.b((Cursor)localObject);
      localArrayList.add(localbh);
    }
    ((Cursor)localObject).close();
    GMTrace.o(626394136576L, 4667);
    return localArrayList;
  }
  
  public final void fA(int paramInt)
  {
    GMTrace.i(627065225216L, 4672);
    Object localObject1 = gX(fx(paramInt)) + " where istop = 1  group by time" + " ORDER BY time DESC  limit 2";
    w.i("MicroMsg.ReaderAppInfoStorage", "reset conversation, sql is %s", new Object[] { localObject1 });
    Object localObject2 = this.goN.a((String)localObject1, null, 2);
    if (!((Cursor)localObject2).moveToFirst())
    {
      ((Cursor)localObject2).close();
      localObject1 = new ae();
      ((ae)localObject1).setUsername(bh.fw(paramInt));
      ((ae)localObject1).setContent("");
      ((ae)localObject1).x(0L);
      ((ae)localObject1).dC(0);
      ((ae)localObject1).dz(0);
      at.AR();
      c.yP().a((ae)localObject1, bh.fw(paramInt));
      GMTrace.o(627065225216L, 4672);
      return;
    }
    localObject1 = new bh();
    ((bh)localObject1).b((Cursor)localObject2);
    ((Cursor)localObject2).close();
    localObject2 = new ae();
    ((ae)localObject2).setUsername(bh.fw(paramInt));
    ((ae)localObject2).setContent(((bh)localObject1).getTitle());
    ((ae)localObject2).x(((bh)localObject1).time);
    ((ae)localObject2).dC(0);
    ((ae)localObject2).dz(0);
    at.AR();
    c.yP().a((ae)localObject2, bh.fw(paramInt));
    GMTrace.o(627065225216L, 4672);
  }
  
  public final int fy(int paramInt)
  {
    int i = 0;
    GMTrace.i(626125701120L, 4665);
    Object localObject = "select count(*) from (SELECT count(*) FROM " + fx(paramInt) + " group by time)";
    localObject = this.goN.a((String)localObject, null, 2);
    paramInt = i;
    if (((Cursor)localObject).moveToFirst()) {
      paramInt = ((Cursor)localObject).getInt(0);
    }
    ((Cursor)localObject).close();
    GMTrace.o(626125701120L, 4665);
    return paramInt;
  }
  
  public final void fz(int paramInt)
  {
    GMTrace.i(626931007488L, 4671);
    at.AR();
    Object localObject = c.yP().TO(bh.fw(paramInt));
    if ((localObject == null) || (!((aj)localObject).field_username.equals(bh.fw(paramInt))))
    {
      GMTrace.o(626931007488L, 4671);
      return;
    }
    ((ae)localObject).setUsername(bh.fw(paramInt));
    ((ae)localObject).setContent("");
    ((ae)localObject).dC(0);
    ((ae)localObject).dz(0);
    at.AR();
    c.yP().a((ae)localObject, bh.fw(paramInt));
    localObject = "delete from " + fx(paramInt);
    if (this.goN.eZ(fx(paramInt), (String)localObject)) {
      doNotify();
    }
    GMTrace.o(626931007488L, 4671);
  }
  
  public final List<bh> x(String paramString, int paramInt)
  {
    GMTrace.i(626796789760L, 4670);
    paramString = this.goN.a(fx(paramInt), new String[] { "*" }, "reserved3=?", new String[] { paramString }, null, null, null, 2);
    if (paramString != null) {}
    try
    {
      if (paramString.moveToFirst())
      {
        ArrayList localArrayList = new ArrayList();
        boolean bool;
        do
        {
          bh localbh = new bh();
          localbh.b(paramString);
          localArrayList.add(localbh);
          bool = paramString.moveToNext();
        } while (bool);
        if (paramString != null) {
          paramString.close();
        }
        GMTrace.o(626796789760L, 4670);
        return localArrayList;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.ReaderAppInfoStorage", "getByFunctionMsgId, error: %s", new Object[] { localException.getMessage() });
        if (paramString != null) {
          paramString.close();
        }
      }
    }
    finally
    {
      if (paramString == null) {
        break label193;
      }
      paramString.close();
    }
    GMTrace.o(626796789760L, 4670);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\y\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */