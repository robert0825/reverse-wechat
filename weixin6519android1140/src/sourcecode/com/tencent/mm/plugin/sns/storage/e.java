package com.tencent.mm.plugin.sns.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class e
  extends com.tencent.mm.g.b.e
{
  protected static c.a fTp;
  protected static Map<String, b> pMf;
  protected static Map<String, a> pMg;
  public String pMd;
  protected int pMe;
  
  static
  {
    GMTrace.i(8181912698880L, 60960);
    c.a locala = new c.a();
    locala.gZM = new Field[22];
    locala.columns = new String[23];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "snsId";
    locala.vmt.put("snsId", "LONG");
    localStringBuilder.append(" snsId LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "userName";
    locala.vmt.put("userName", "TEXT");
    localStringBuilder.append(" userName TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "localFlag";
    locala.vmt.put("localFlag", "INTEGER");
    localStringBuilder.append(" localFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "createTime";
    locala.vmt.put("createTime", "INTEGER");
    localStringBuilder.append(" createTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "head";
    locala.vmt.put("head", "INTEGER");
    localStringBuilder.append(" head INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "localPrivate";
    locala.vmt.put("localPrivate", "INTEGER");
    localStringBuilder.append(" localPrivate INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "type";
    locala.vmt.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "sourceType";
    locala.vmt.put("sourceType", "INTEGER");
    localStringBuilder.append(" sourceType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "likeFlag";
    locala.vmt.put("likeFlag", "INTEGER");
    localStringBuilder.append(" likeFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "pravited";
    locala.vmt.put("pravited", "INTEGER");
    localStringBuilder.append(" pravited INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "stringSeq";
    locala.vmt.put("stringSeq", "TEXT");
    localStringBuilder.append(" stringSeq TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "content";
    locala.vmt.put("content", "BLOB");
    localStringBuilder.append(" content BLOB");
    localStringBuilder.append(", ");
    locala.columns[12] = "attrBuf";
    locala.vmt.put("attrBuf", "BLOB");
    localStringBuilder.append(" attrBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "postBuf";
    locala.vmt.put("postBuf", "BLOB");
    localStringBuilder.append(" postBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "adinfo";
    locala.vmt.put("adinfo", "TEXT");
    localStringBuilder.append(" adinfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "adxml";
    locala.vmt.put("adxml", "TEXT");
    localStringBuilder.append(" adxml TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "createAdTime";
    locala.vmt.put("createAdTime", "INTEGER");
    localStringBuilder.append(" createAdTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "exposureTime";
    locala.vmt.put("exposureTime", "INTEGER");
    localStringBuilder.append(" exposureTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[18] = "firstControlTime";
    locala.vmt.put("firstControlTime", "INTEGER");
    localStringBuilder.append(" firstControlTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[19] = "recxml";
    locala.vmt.put("recxml", "TEXT");
    localStringBuilder.append(" recxml TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "subType";
    locala.vmt.put("subType", "INTEGER");
    localStringBuilder.append(" subType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[21] = "exposureCount";
    locala.vmt.put("exposureCount", "INTEGER");
    localStringBuilder.append(" exposureCount INTEGER");
    locala.columns[22] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    pMf = new ConcurrentHashMap();
    pMg = new ConcurrentHashMap();
    GMTrace.o(8181912698880L, 60960);
  }
  
  public e()
  {
    GMTrace.i(8180033650688L, 60946);
    this.pMd = null;
    GMTrace.o(8180033650688L, 60946);
  }
  
  public final void F(Bundle paramBundle)
  {
    GMTrace.i(15248073424896L, 113607);
    if (paramBundle == null)
    {
      GMTrace.o(15248073424896L, 113607);
      return;
    }
    ContentValues localContentValues = (ContentValues)paramBundle.getParcelable("values");
    this.field_snsId = localContentValues.getAsLong("snsId").longValue();
    this.field_userName = localContentValues.getAsString("userName");
    this.field_localFlag = localContentValues.getAsInteger("localFlag").intValue();
    this.field_createTime = localContentValues.getAsInteger("createTime").intValue();
    this.field_head = localContentValues.getAsInteger("head").intValue();
    this.field_localPrivate = localContentValues.getAsInteger("localPrivate").intValue();
    this.field_type = localContentValues.getAsInteger("type").intValue();
    this.field_sourceType = localContentValues.getAsInteger("sourceType").intValue();
    this.field_likeFlag = localContentValues.getAsInteger("likeFlag").intValue();
    this.field_pravited = localContentValues.getAsInteger("pravited").intValue();
    this.field_stringSeq = localContentValues.getAsString("stringSeq");
    this.field_content = localContentValues.getAsByteArray("content");
    this.field_attrBuf = localContentValues.getAsByteArray("attrBuf");
    this.field_postBuf = localContentValues.getAsByteArray("postBuf");
    this.field_adinfo = localContentValues.getAsString("adinfo");
    this.field_adxml = localContentValues.getAsString("adxml");
    this.field_createAdTime = localContentValues.getAsInteger("createAdTime").intValue();
    this.field_exposureTime = localContentValues.getAsInteger("exposureTime").intValue();
    this.field_firstControlTime = localContentValues.getAsInteger("firstControlTime").intValue();
    this.field_recxml = localContentValues.getAsString("recxml");
    this.field_subType = localContentValues.getAsInteger("subType").intValue();
    this.vmr = localContentValues.getAsLong("rowid").longValue();
    this.pMe = paramBundle.getInt("localid");
    GMTrace.o(15248073424896L, 113607);
  }
  
  public final boolean Iq(String paramString)
  {
    GMTrace.i(8180973174784L, 60953);
    paramString = com.tencent.mm.modelsns.e.lz(paramString);
    try
    {
      this.field_content = paramString.toByteArray();
      this.pMd = (g.n(this.field_content) + g.n(this.field_attrBuf));
      GMTrace.o(8180973174784L, 60953);
      return true;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.AdSnsInfo", paramString, "", new Object[0]);
      GMTrace.o(8180973174784L, 60953);
    }
    return false;
  }
  
  public final void aE(byte[] paramArrayOfByte)
  {
    GMTrace.i(8181241610240L, 60955);
    this.field_attrBuf = paramArrayOfByte;
    this.pMd = (g.n(this.field_content) + g.n(this.field_attrBuf));
    GMTrace.o(8181241610240L, 60955);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(8181778481152L, 60959);
    super.b(paramCursor);
    this.pMe = ((int)this.vmr);
    GMTrace.o(8181778481152L, 60959);
  }
  
  public final boolean bkj()
  {
    GMTrace.i(20066624077824L, 149508);
    b localb = blz();
    if (localb != null)
    {
      boolean bool = localb.bkj();
      GMTrace.o(20066624077824L, 149508);
      return bool;
    }
    GMTrace.o(20066624077824L, 149508);
    return false;
  }
  
  public final b blA()
  {
    GMTrace.i(8180436303872L, 60949);
    b localb;
    if (this.field_recxml != null)
    {
      if (pMf.containsKey(this.field_recxml))
      {
        localb = (b)pMf.get(this.field_recxml);
        GMTrace.o(8180436303872L, 60949);
        return localb;
      }
      localb = new b(this.field_recxml);
      pMf.put(this.field_recxml, localb);
    }
    for (;;)
    {
      if (localb == null)
      {
        localb = new b(null);
        GMTrace.o(8180436303872L, 60949);
        return localb;
      }
      GMTrace.o(8180436303872L, 60949);
      return localb;
      localb = null;
    }
  }
  
  public final a blB()
  {
    GMTrace.i(8180570521600L, 60950);
    a locala;
    if (this.field_adinfo != null)
    {
      if (pMg.containsKey(this.field_adinfo))
      {
        locala = (a)pMg.get(this.field_adinfo);
        GMTrace.o(8180570521600L, 60950);
        return locala;
      }
      locala = new a(this.field_adinfo);
      pMg.put(this.field_adinfo, locala);
    }
    for (;;)
    {
      if (locala == null)
      {
        locala = new a(null);
        GMTrace.o(8180570521600L, 60950);
        return locala;
      }
      GMTrace.o(8180570521600L, 60950);
      return locala;
      locala = null;
    }
  }
  
  public final int blC()
  {
    GMTrace.i(20066758295552L, 149509);
    b localb = blA();
    if (localb == null)
    {
      GMTrace.o(20066758295552L, 149509);
      return 0;
    }
    int i = localb.pDb;
    GMTrace.o(20066758295552L, 149509);
    return i;
  }
  
  public final biz blD()
  {
    GMTrace.i(8181107392512L, 60954);
    biz localbiz1;
    if (this.field_content == null)
    {
      localbiz1 = com.tencent.mm.modelsns.e.LU();
      GMTrace.o(8181107392512L, 60954);
      return localbiz1;
    }
    if (this.pMd == null) {
      this.pMd = (g.n(this.field_content) + g.n(this.field_attrBuf));
    }
    if (m.pMl.containsKey(this.pMd))
    {
      localbiz1 = (biz)m.pMl.get(this.pMd);
      if (localbiz1 != null)
      {
        GMTrace.o(8181107392512L, 60954);
        return localbiz1;
      }
    }
    try
    {
      localbiz1 = (biz)new biz().aD(this.field_content);
      m.pMl.put(this.pMd, localbiz1);
      GMTrace.o(8181107392512L, 60954);
      return localbiz1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AdSnsInfo", "error get snsinfo timeline!");
      biz localbiz2 = com.tencent.mm.modelsns.e.LU();
      GMTrace.o(8181107392512L, 60954);
      return localbiz2;
    }
  }
  
  public final String blE()
  {
    GMTrace.i(8181510045696L, 60957);
    String str = u.W("ad_table_", this.field_snsId);
    GMTrace.o(8181510045696L, 60957);
    return str;
  }
  
  public final m blF()
  {
    GMTrace.i(8181644263424L, 60958);
    m localm = new m();
    localm.c(blD());
    w.d("MicroMsg.AdSnsInfo", "from server xml ok %d", new Object[] { Long.valueOf(this.field_snsId) });
    localm.pMe = this.pMe;
    localm.field_userName = this.field_userName;
    localm.gl(this.field_createTime);
    localm.field_likeFlag = this.field_likeFlag;
    localm.dQ(this.field_snsId);
    localm.field_sourceType = this.field_sourceType;
    localm.field_content = this.field_content;
    localm.uV(2);
    localm.uV(32);
    localm.field_attrBuf = this.field_attrBuf;
    biz localbiz = localm.blD();
    localbiz.jhi = this.field_userName;
    localm.field_pravited = localbiz.uCQ;
    localm.blV();
    localm.c(localbiz);
    if (localbiz.uUc != null)
    {
      localm.field_type = localbiz.uUc.ueV;
      localm.field_subType = localbiz.uUc.ueX;
    }
    localm.pMo = this;
    GMTrace.o(8181644263424L, 60958);
    return localm;
  }
  
  public final Bundle blG()
  {
    GMTrace.i(15247939207168L, 113606);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("values", super.qL());
    localBundle.putInt("localid", this.pMe);
    GMTrace.o(15247939207168L, 113606);
    return localBundle;
  }
  
  public final b blz()
  {
    GMTrace.i(8180302086144L, 60948);
    b localb;
    if (this.field_adxml != null)
    {
      if (pMf.containsKey(this.field_adxml))
      {
        localb = (b)pMf.get(this.field_adxml);
        GMTrace.o(8180302086144L, 60948);
        return localb;
      }
      localb = new b(this.field_adxml);
      pMf.put(this.field_adxml, localb);
    }
    for (;;)
    {
      if (localb == null)
      {
        localb = new b(null);
        GMTrace.o(8180302086144L, 60948);
        return localb;
      }
      GMTrace.o(8180302086144L, 60948);
      return localb;
      localb = null;
    }
  }
  
  public final void c(biz parambiz)
  {
    GMTrace.i(8180838957056L, 60952);
    try
    {
      this.field_content = parambiz.toByteArray();
      GMTrace.o(8180838957056L, 60952);
      return;
    }
    catch (Exception parambiz)
    {
      w.printErrStackTrace("MicroMsg.AdSnsInfo", parambiz, "", new Object[0]);
      GMTrace.o(8180838957056L, 60952);
    }
  }
  
  public final int getSource()
  {
    GMTrace.i(8180704739328L, 60951);
    b localb = blA();
    if (localb == null)
    {
      GMTrace.o(8180704739328L, 60951);
      return 0;
    }
    int i = localb.pDb;
    GMTrace.o(8180704739328L, 60951);
    return i;
  }
  
  public final void uV(int paramInt)
  {
    GMTrace.i(8181375827968L, 60956);
    this.field_sourceType |= paramInt;
    GMTrace.o(8181375827968L, 60956);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(8180167868416L, 60947);
    c.a locala = fTp;
    GMTrace.o(8180167868416L, 60947);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */