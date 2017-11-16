package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.g.b.dd;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class m
  extends dd
{
  protected static c.a fTp;
  protected static Map<String, biz> pMl;
  protected static Map<String, anv> pMm;
  public String pMd;
  public int pMe;
  public String pMn;
  public e pMo;
  private anv pMp;
  private boolean poX;
  
  static
  {
    GMTrace.i(8299218993152L, 61834);
    c.a locala = new c.a();
    locala.gZM = new Field[15];
    locala.columns = new String[16];
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
    locala.columns[14] = "subType";
    locala.vmt.put("subType", "INTEGER");
    localStringBuilder.append(" subType INTEGER");
    locala.columns[15] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    pMl = new ConcurrentHashMap();
    pMm = new ConcurrentHashMap();
    GMTrace.o(8299218993152L, 61834);
  }
  
  public m()
  {
    GMTrace.i(8293044977664L, 61788);
    this.pMd = null;
    this.pMn = null;
    this.poX = false;
    this.pMp = null;
    GMTrace.o(8293044977664L, 61788);
  }
  
  public m(byte paramByte)
  {
    GMTrace.i(8293313413120L, 61790);
    this.pMd = null;
    this.pMn = null;
    this.poX = false;
    this.pMp = null;
    dQ(0L);
    GMTrace.o(8293313413120L, 61790);
  }
  
  private static int dR(long paramLong)
  {
    GMTrace.i(8293984501760L, 61795);
    String str = new SimpleDateFormat("yyyyMMdd").format(new Date(1000L * paramLong));
    try
    {
      i = Integer.valueOf(str).intValue();
      GMTrace.o(8293984501760L, 61795);
      return i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.SnsInfo", "error valueOf  " + str);
        int i = (int)(paramLong / 86400L);
      }
    }
  }
  
  public static boolean dT(long paramLong)
  {
    GMTrace.i(8296803074048L, 61816);
    if (bg.aG(paramLong / 1000L) > 1200L)
    {
      GMTrace.o(8296803074048L, 61816);
      return true;
    }
    GMTrace.o(8296803074048L, 61816);
    return false;
  }
  
  public static void release()
  {
    try
    {
      GMTrace.i(8295729332224L, 61808);
      pMl.clear();
      pMm.clear();
      GMTrace.o(8295729332224L, 61808);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static m x(m paramm)
  {
    GMTrace.i(8293447630848L, 61791);
    m localm = new m();
    localm.pMe = paramm.pMe;
    localm.field_snsId = paramm.field_snsId;
    localm.field_userName = paramm.field_userName;
    localm.field_localFlag = paramm.field_localFlag;
    localm.field_createTime = paramm.field_createTime;
    localm.field_head = paramm.field_head;
    localm.field_localPrivate = paramm.field_localPrivate;
    localm.field_type = paramm.field_type;
    localm.field_sourceType = paramm.field_sourceType;
    localm.field_likeFlag = paramm.field_likeFlag;
    localm.field_pravited = paramm.field_pravited;
    localm.field_stringSeq = paramm.field_stringSeq;
    localm.field_content = paramm.field_content;
    localm.field_attrBuf = paramm.field_attrBuf;
    GMTrace.o(8293447630848L, 61791);
    return localm;
  }
  
  public final boolean Iq(String paramString)
  {
    GMTrace.i(8296131985408L, 61811);
    paramString = com.tencent.mm.modelsns.e.lz(paramString);
    try
    {
      this.field_content = paramString.toByteArray();
      this.pMd = (g.n(this.field_content) + g.n(this.field_attrBuf));
      GMTrace.o(8296131985408L, 61811);
      return true;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.SnsInfo", paramString, "", new Object[0]);
      GMTrace.o(8296131985408L, 61811);
    }
    return false;
  }
  
  public final void aE(byte[] paramArrayOfByte)
  {
    GMTrace.i(8295326679040L, 61805);
    this.field_attrBuf = paramArrayOfByte;
    this.pMd = (g.n(this.field_content) + g.n(this.field_attrBuf));
    GMTrace.o(8295326679040L, 61805);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(8295595114496L, 61807);
    super.b(paramCursor);
    this.pMe = ((int)this.vmr);
    GMTrace.o(8295595114496L, 61807);
  }
  
  public final boolean biM()
  {
    GMTrace.i(8298816339968L, 61831);
    if (this.field_snsId == 0L)
    {
      GMTrace.o(8298816339968L, 61831);
      return true;
    }
    GMTrace.o(8298816339968L, 61831);
    return false;
  }
  
  public final boolean bke()
  {
    GMTrace.i(8299084775424L, 61833);
    int i = bmm();
    if ((i == 5) || (i == 4))
    {
      GMTrace.o(8299084775424L, 61833);
      return true;
    }
    GMTrace.o(8299084775424L, 61833);
    return false;
  }
  
  public final boolean bkj()
  {
    GMTrace.i(20065013465088L, 149496);
    b localb = blz();
    if (localb != null)
    {
      boolean bool = localb.bkj();
      GMTrace.o(20065013465088L, 149496);
      return bool;
    }
    GMTrace.o(20065013465088L, 149496);
    return false;
  }
  
  public final a blB()
  {
    GMTrace.i(8297474162688L, 61821);
    if (this.pMo == null) {
      this.pMo = ae.bjg().dN(this.field_snsId);
    }
    if (this.pMo == null)
    {
      locala = new a(null);
      GMTrace.o(8297474162688L, 61821);
      return locala;
    }
    a locala = this.pMo.blB();
    GMTrace.o(8297474162688L, 61821);
    return locala;
  }
  
  public final biz blD()
  {
    GMTrace.i(8295863549952L, 61809);
    biz localbiz1;
    if (this.field_content == null)
    {
      localbiz1 = com.tencent.mm.modelsns.e.LU();
      GMTrace.o(8295863549952L, 61809);
      return localbiz1;
    }
    if (this.pMd == null) {
      this.pMd = (g.n(this.field_content) + g.n(this.field_attrBuf));
    }
    if (pMl.containsKey(this.pMd))
    {
      localbiz1 = (biz)pMl.get(this.pMd);
      if (localbiz1 != null)
      {
        GMTrace.o(8295863549952L, 61809);
        return localbiz1;
      }
    }
    try
    {
      localbiz1 = (biz)new biz().aD(this.field_content);
      pMl.put(this.pMd, localbiz1);
      GMTrace.o(8295863549952L, 61809);
      return localbiz1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.SnsInfo", "error get snsinfo timeline!");
      biz localbiz2 = com.tencent.mm.modelsns.e.LU();
      GMTrace.o(8295863549952L, 61809);
      return localbiz2;
    }
  }
  
  public final String blE()
  {
    GMTrace.i(8293716066304L, 61793);
    if (uX(32))
    {
      str = u.W("ad_table_", this.field_snsId);
      GMTrace.o(8293716066304L, 61793);
      return str;
    }
    String str = u.W("sns_table_", this.field_snsId);
    GMTrace.o(8293716066304L, 61793);
    return str;
  }
  
  public final Bundle blG()
  {
    GMTrace.i(15278675066880L, 113835);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("values", super.qL());
    localBundle.putInt("localid", this.pMe);
    if (bmj() != null) {
      localBundle.putBundle("adValues", bmj().blG());
    }
    GMTrace.o(15278675066880L, 113835);
    return localBundle;
  }
  
  public final anv blQ()
  {
    GMTrace.i(8293179195392L, 61789);
    anv localanv1;
    if (this.field_postBuf == null)
    {
      localanv1 = new anv();
      GMTrace.o(8293179195392L, 61789);
      return localanv1;
    }
    if (this.pMn == null) {
      this.pMn = g.n(this.field_postBuf);
    }
    if (pMm.containsKey(this.pMn))
    {
      this.pMp = ((anv)pMm.get(this.pMn));
      if (this.pMp != null)
      {
        localanv1 = this.pMp;
        GMTrace.o(8293179195392L, 61789);
        return localanv1;
      }
    }
    try
    {
      this.pMp = ((anv)new anv().aD(this.field_postBuf));
      pMm.put(this.pMn, this.pMp);
      localanv1 = this.pMp;
      GMTrace.o(8293179195392L, 61789);
      return localanv1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.SnsInfo", "error get snsinfo timeline!");
      anv localanv2 = new anv();
      GMTrace.o(8293179195392L, 61789);
      return localanv2;
    }
  }
  
  public final int blR()
  {
    GMTrace.i(8294252937216L, 61797);
    int i = this.field_createTime;
    GMTrace.o(8294252937216L, 61797);
    return i;
  }
  
  public final void blS()
  {
    GMTrace.i(8294387154944L, 61798);
    this.field_localPrivate |= 0x1;
    GMTrace.o(8294387154944L, 61798);
  }
  
  public final int blT()
  {
    GMTrace.i(8294521372672L, 61799);
    int i = this.field_localPrivate;
    GMTrace.o(8294521372672L, 61799);
    return i;
  }
  
  public final boolean blU()
  {
    GMTrace.i(8294655590400L, 61800);
    if ((this.field_localFlag & 0x80) > 0)
    {
      GMTrace.o(8294655590400L, 61800);
      return true;
    }
    GMTrace.o(8294655590400L, 61800);
    return false;
  }
  
  public final void blV()
  {
    GMTrace.i(8294789808128L, 61801);
    this.field_localFlag |= 0x2;
    GMTrace.o(8294789808128L, 61801);
  }
  
  public final void blW()
  {
    GMTrace.i(8294924025856L, 61802);
    this.field_localFlag &= 0xFFFFFFFD;
    GMTrace.o(8294924025856L, 61802);
  }
  
  public final boolean blX()
  {
    GMTrace.i(8295058243584L, 61803);
    if ((this.field_localFlag & 0x2) > 0)
    {
      GMTrace.o(8295058243584L, 61803);
      return true;
    }
    GMTrace.o(8295058243584L, 61803);
    return false;
  }
  
  public final String blY()
  {
    GMTrace.i(8295192461312L, 61804);
    if (uX(32))
    {
      str = u.W("ad_table_", this.pMe);
      GMTrace.o(8295192461312L, 61804);
      return str;
    }
    String str = u.W("sns_table_", this.pMe);
    GMTrace.o(8295192461312L, 61804);
    return str;
  }
  
  public final boolean blZ()
  {
    GMTrace.i(8296266203136L, 61812);
    if ((this.field_localFlag & 0x10) > 0)
    {
      GMTrace.o(8296266203136L, 61812);
      return true;
    }
    GMTrace.o(8296266203136L, 61812);
    return false;
  }
  
  public final b blz()
  {
    GMTrace.i(8297339944960L, 61820);
    if (this.pMo == null) {
      this.pMo = ae.bjg().dN(this.field_snsId);
    }
    if (this.pMo == null)
    {
      localb = new b(null);
      GMTrace.o(8297339944960L, 61820);
      return localb;
    }
    b localb = this.pMo.blz();
    GMTrace.o(8297339944960L, 61820);
    return localb;
  }
  
  public final boolean bma()
  {
    GMTrace.i(8296400420864L, 61813);
    if (((this.field_localFlag & 0x20) > 0) && (this.field_snsId == 0L))
    {
      GMTrace.o(8296400420864L, 61813);
      return true;
    }
    GMTrace.o(8296400420864L, 61813);
    return false;
  }
  
  public final void bmb()
  {
    GMTrace.i(8296534638592L, 61814);
    this.field_localFlag &= 0xFFFFFFDF;
    GMTrace.o(8296534638592L, 61814);
  }
  
  public final void bmc()
  {
    GMTrace.i(8296668856320L, 61815);
    this.field_localFlag |= 0x20;
    GMTrace.o(8296668856320L, 61815);
  }
  
  public final String bmd()
  {
    GMTrace.i(8297608380416L, 61822);
    Object localObject = blB();
    if (localObject == null)
    {
      GMTrace.o(8297608380416L, 61822);
      return "";
    }
    localObject = ((a)localObject).pCr;
    GMTrace.o(8297608380416L, 61822);
    return (String)localObject;
  }
  
  public final String bme()
  {
    GMTrace.i(8297742598144L, 61823);
    Object localObject = blB();
    if (localObject == null)
    {
      GMTrace.o(8297742598144L, 61823);
      return "";
    }
    localObject = ((a)localObject).pCq;
    GMTrace.o(8297742598144L, 61823);
    return (String)localObject;
  }
  
  public final String bmf()
  {
    GMTrace.i(8297876815872L, 61824);
    Object localObject = blz();
    if (localObject != null)
    {
      localObject = ((b)localObject).pCg;
      GMTrace.o(8297876815872L, 61824);
      return (String)localObject;
    }
    GMTrace.o(8297876815872L, 61824);
    return "";
  }
  
  public final String bmg()
  {
    GMTrace.i(8298011033600L, 61825);
    Object localObject = blB();
    if (localObject != null)
    {
      localObject = ((a)localObject).pCg;
      GMTrace.o(8298011033600L, 61825);
      return (String)localObject;
    }
    GMTrace.o(8298011033600L, 61825);
    return "";
  }
  
  public final String bmh()
  {
    GMTrace.i(8298145251328L, 61826);
    Object localObject = blB();
    if (localObject != null)
    {
      localObject = ((a)localObject).hTy;
      GMTrace.o(8298145251328L, 61826);
      return (String)localObject;
    }
    GMTrace.o(8298145251328L, 61826);
    return "";
  }
  
  public final String bmi()
  {
    GMTrace.i(8298279469056L, 61827);
    Object localObject = blB();
    if (localObject != null)
    {
      localObject = ((a)localObject).pyc;
      GMTrace.o(8298279469056L, 61827);
      return (String)localObject;
    }
    GMTrace.o(8298279469056L, 61827);
    return "";
  }
  
  public final e bmj()
  {
    GMTrace.i(8298413686784L, 61828);
    if (this.pMo == null) {
      this.pMo = ae.bjg().dN(this.field_snsId);
    }
    if (this.pMo != null)
    {
      this.pMo.field_createTime = this.field_createTime;
      this.pMo.field_userName = this.field_userName;
      this.pMo.field_likeFlag = this.field_likeFlag;
      this.pMo.field_attrBuf = this.field_attrBuf;
    }
    e locale = this.pMo;
    GMTrace.o(8298413686784L, 61828);
    return locale;
  }
  
  public final boolean bmk()
  {
    GMTrace.i(15402155376640L, 114755);
    boolean bool = uX(32);
    GMTrace.o(15402155376640L, 114755);
    return bool;
  }
  
  public final int bml()
  {
    GMTrace.i(20064879247360L, 149495);
    b localb = blz();
    if (localb != null)
    {
      int i = localb.pDb;
      GMTrace.o(20064879247360L, 149495);
      return i;
    }
    GMTrace.o(20064879247360L, 149495);
    return 0;
  }
  
  public final int bmm()
  {
    GMTrace.i(8298950557696L, 61832);
    if (uX(32))
    {
      Object localObject = blz();
      if (((b)localObject).bkd())
      {
        GMTrace.o(8298950557696L, 61832);
        return 3;
      }
      if (((b)localObject).bke())
      {
        localObject = blD();
        if ((localObject != null) && (((biz)localObject).uUc.ueV == 15) && (((biz)localObject).uUj != 1))
        {
          GMTrace.o(8298950557696L, 61832);
          return 5;
        }
        GMTrace.o(8298950557696L, 61832);
        return 4;
      }
      if (this.field_type == 1)
      {
        GMTrace.o(8298950557696L, 61832);
        return 1;
      }
      GMTrace.o(8298950557696L, 61832);
      return 2;
    }
    GMTrace.o(8298950557696L, 61832);
    return -1;
  }
  
  public final void c(biz parambiz)
  {
    GMTrace.i(8295997767680L, 61810);
    try
    {
      this.field_content = parambiz.toByteArray();
      this.pMd = (g.n(this.field_content) + g.n(this.field_attrBuf));
      GMTrace.o(8295997767680L, 61810);
      return;
    }
    catch (Exception parambiz)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.SnsInfo", parambiz, "", new Object[0]);
      }
    }
  }
  
  public final void dQ(long paramLong)
  {
    GMTrace.i(8293581848576L, 61792);
    this.field_snsId = paramLong;
    if (paramLong != 0L) {
      dS(paramLong);
    }
    GMTrace.o(8293581848576L, 61792);
  }
  
  public final void dS(long paramLong)
  {
    GMTrace.i(8295460896768L, 61806);
    this.field_stringSeq = i.dt(paramLong);
    this.field_stringSeq = i.GW(this.field_stringSeq);
    w.d("MicroMsg.SnsInfo", paramLong + " stringSeq " + this.field_stringSeq);
    GMTrace.o(8295460896768L, 61806);
  }
  
  public final String getUserName()
  {
    GMTrace.i(8293850284032L, 61794);
    String str = this.field_userName;
    GMTrace.o(8293850284032L, 61794);
    return str;
  }
  
  public final void gl(int paramInt)
  {
    GMTrace.i(8294118719488L, 61796);
    if ((paramInt - this.field_createTime < 180) && (paramInt - this.field_createTime >= 0))
    {
      if (this.field_head == 0) {
        this.field_head = dR(this.field_createTime);
      }
      GMTrace.o(8294118719488L, 61796);
      return;
    }
    this.field_createTime = paramInt;
    this.field_head = dR(paramInt);
    GMTrace.o(8294118719488L, 61796);
  }
  
  public final boolean isValid()
  {
    GMTrace.i(8298682122240L, 61830);
    if (this.field_snsId != 0L)
    {
      GMTrace.o(8298682122240L, 61830);
      return true;
    }
    GMTrace.o(8298682122240L, 61830);
    return false;
  }
  
  public final void uV(int paramInt)
  {
    GMTrace.i(8297071509504L, 61818);
    this.field_sourceType |= paramInt;
    GMTrace.o(8297071509504L, 61818);
  }
  
  public final boolean uX(int paramInt)
  {
    GMTrace.i(8296937291776L, 61817);
    if ((this.field_sourceType & paramInt) > 0)
    {
      GMTrace.o(8296937291776L, 61817);
      return true;
    }
    GMTrace.o(8296937291776L, 61817);
    return false;
  }
  
  public final void uY(int paramInt)
  {
    GMTrace.i(8297205727232L, 61819);
    this.field_sourceType &= (paramInt ^ 0xFFFFFFFF);
    GMTrace.o(8297205727232L, 61819);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(8292910759936L, 61787);
    c.a locala = fTp;
    GMTrace.o(8292910759936L, 61787);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */