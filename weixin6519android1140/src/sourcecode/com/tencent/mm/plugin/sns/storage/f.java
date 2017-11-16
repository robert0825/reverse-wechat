package com.tencent.mm.plugin.sns.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends i<e>
{
  public static final String[] eZt;
  public static final String[] fTX;
  private static final String pMh;
  public com.tencent.mm.sdk.e.e fTZ;
  
  static
  {
    GMTrace.i(8308882669568L, 61906);
    fTX = new String[] { i.a(e.fTp, "adsnsinfo") };
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS serverAdSnsNameIndex ON AdSnsInfo ( snsId )", "CREATE INDEX IF NOT EXISTS serverAdSnsTimeHeadIndex ON AdSnsInfo ( head )", "DROP INDEX IF EXISTS serverAdSnsTimeIndex", "DROP INDEX IF EXISTS serverAdSnsTimeSourceTypeIndex", "CREATE INDEX IF NOT EXISTS adsnsMultiIndex1 ON AdSnsInfo ( createTime,snsId,sourceType,type)", "CREATE INDEX IF NOT EXISTS adsnsMultiIndex2 ON AdSnsInfo ( sourceType,type,userName)" };
    pMh = String.format("select  %s %s,rowid from AdSnsInfo ", new Object[] { "snsId", "createTime" });
    GMTrace.o(8308882669568L, 61906);
  }
  
  public f(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, e.fTp, "adsnsinfo", eZt);
    GMTrace.i(8307808927744L, 61898);
    this.fTZ = parame;
    GMTrace.o(8307808927744L, 61898);
  }
  
  public final boolean a(long paramLong, e parame)
  {
    GMTrace.i(8308211580928L, 61901);
    if (dO(paramLong))
    {
      boolean bool = b(paramLong, parame);
      GMTrace.o(8308211580928L, 61901);
      return bool;
    }
    w.d("MicroMsg.AdSnsInfoStorage", "added PcId " + paramLong);
    w.d("MicroMsg.AdSnsInfoStorage", "SnsInfo Insert");
    int i;
    if (parame == null) {
      i = -1;
    }
    while (i != -1)
    {
      GMTrace.o(8308211580928L, 61901);
      return true;
      parame = parame.qL();
      i = (int)this.fTZ.insert("AdSnsInfo", "", parame);
      w.d("MicroMsg.AdSnsInfoStorage", "SnsInfo Insert result" + i);
    }
    GMTrace.o(8308211580928L, 61901);
    return false;
  }
  
  public final boolean b(long paramLong, e parame)
  {
    GMTrace.i(8308345798656L, 61902);
    parame = parame.qL();
    parame.remove("rowid");
    if (this.fTZ.update("AdSnsInfo", parame, "snsId=?", new String[] { String.valueOf(paramLong) }) > 0)
    {
      GMTrace.o(8308345798656L, 61902);
      return true;
    }
    GMTrace.o(8308345798656L, 61902);
    return false;
  }
  
  public final e dN(long paramLong)
  {
    GMTrace.i(8307943145472L, 61899);
    e locale = new e();
    Object localObject = "select *,rowid from AdSnsInfo  where AdSnsInfo.snsId=" + paramLong;
    localObject = this.fTZ.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      locale.b((Cursor)localObject);
      ((Cursor)localObject).close();
      GMTrace.o(8307943145472L, 61899);
      return locale;
    }
    ((Cursor)localObject).close();
    GMTrace.o(8307943145472L, 61899);
    return null;
  }
  
  public final boolean dO(long paramLong)
  {
    GMTrace.i(8308480016384L, 61903);
    Object localObject = "select *,rowid from AdSnsInfo  where AdSnsInfo.snsId=" + paramLong;
    localObject = this.fTZ.a((String)localObject, null, 2);
    boolean bool = ((Cursor)localObject).moveToFirst();
    ((Cursor)localObject).close();
    GMTrace.o(8308480016384L, 61903);
    return bool;
  }
  
  public final boolean delete(long paramLong)
  {
    GMTrace.i(8308614234112L, 61904);
    int i = this.fTZ.delete("AdSnsInfo", "snsId=?", new String[] { String.valueOf(paramLong) });
    w.i("MicroMsg.AdSnsInfoStorage", "del msg " + paramLong + " res " + i);
    if (i > 0)
    {
      GMTrace.o(8308614234112L, 61904);
      return true;
    }
    GMTrace.o(8308614234112L, 61904);
    return false;
  }
  
  public final e uW(int paramInt)
  {
    GMTrace.i(8308077363200L, 61900);
    e locale = new e();
    Object localObject = "select *,rowid from AdSnsInfo  where AdSnsInfo.rowid=" + paramInt;
    localObject = this.fTZ.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      locale.b((Cursor)localObject);
      ((Cursor)localObject).close();
      GMTrace.o(8308077363200L, 61900);
      return locale;
    }
    ((Cursor)localObject).close();
    GMTrace.o(8308077363200L, 61900);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */