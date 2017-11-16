package com.tencent.mm.plugin.card.sharecard.model;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.cw;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.protocal.c.bdu;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.jo;
import com.tencent.mm.protocal.c.jp;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;

public class ShareCardInfo
  extends cw
  implements Parcelable, com.tencent.mm.plugin.card.base.b
{
  public static final Parcelable.Creator<ShareCardInfo> CREATOR;
  protected static c.a fTp;
  public String jxK;
  public ju jyL;
  public jm jyM;
  public bdu jyN;
  public jp jyO;
  public boolean jyP;
  
  static
  {
    GMTrace.i(5067256102912L, 37754);
    c.a locala = new c.a();
    locala.gZM = new Field[19];
    locala.columns = new String[20];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "card_id";
    locala.vmt.put("card_id", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" card_id TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "card_id";
    locala.columns[1] = "card_tp_id";
    locala.vmt.put("card_tp_id", "TEXT");
    localStringBuilder.append(" card_tp_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "from_username";
    locala.vmt.put("from_username", "TEXT");
    localStringBuilder.append(" from_username TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "consumer";
    locala.vmt.put("consumer", "TEXT");
    localStringBuilder.append(" consumer TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "app_id";
    locala.vmt.put("app_id", "TEXT");
    localStringBuilder.append(" app_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "status";
    locala.vmt.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "share_time";
    locala.vmt.put("share_time", "LONG");
    localStringBuilder.append(" share_time LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "local_updateTime";
    locala.vmt.put("local_updateTime", "LONG");
    localStringBuilder.append(" local_updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "updateTime";
    locala.vmt.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[9] = "begin_time";
    locala.vmt.put("begin_time", "LONG");
    localStringBuilder.append(" begin_time LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "end_time";
    locala.vmt.put("end_time", "LONG");
    localStringBuilder.append(" end_time LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "updateSeq";
    locala.vmt.put("updateSeq", "LONG");
    localStringBuilder.append(" updateSeq LONG");
    localStringBuilder.append(", ");
    locala.columns[12] = "block_mask";
    locala.vmt.put("block_mask", "LONG");
    localStringBuilder.append(" block_mask LONG");
    localStringBuilder.append(", ");
    locala.columns[13] = "dataInfoData";
    locala.vmt.put("dataInfoData", "BLOB");
    localStringBuilder.append(" dataInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "cardTpInfoData";
    locala.vmt.put("cardTpInfoData", "BLOB");
    localStringBuilder.append(" cardTpInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[15] = "shareInfoData";
    locala.vmt.put("shareInfoData", "BLOB");
    localStringBuilder.append(" shareInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[16] = "shopInfoData";
    locala.vmt.put("shopInfoData", "BLOB");
    localStringBuilder.append(" shopInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[17] = "categoryType";
    locala.vmt.put("categoryType", "INTEGER default '0' ");
    localStringBuilder.append(" categoryType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "itemIndex";
    locala.vmt.put("itemIndex", "INTEGER default '0' ");
    localStringBuilder.append(" itemIndex INTEGER default '0' ");
    locala.columns[19] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(5067256102912L, 37754);
  }
  
  public ShareCardInfo()
  {
    GMTrace.i(5061484740608L, 37711);
    this.jyP = true;
    this.jxK = "";
    GMTrace.o(5061484740608L, 37711);
  }
  
  public ShareCardInfo(Parcel paramParcel)
  {
    GMTrace.i(5065108619264L, 37738);
    this.jyP = true;
    this.jxK = "";
    this.field_card_id = paramParcel.readString();
    this.field_card_tp_id = paramParcel.readString();
    this.field_from_username = paramParcel.readString();
    this.field_status = paramParcel.readInt();
    this.field_share_time = paramParcel.readLong();
    this.field_local_updateTime = paramParcel.readLong();
    this.field_updateTime = paramParcel.readLong();
    this.field_updateSeq = paramParcel.readLong();
    this.field_block_mask = paramParcel.readLong();
    this.field_end_time = paramParcel.readLong();
    this.field_categoryType = paramParcel.readInt();
    this.field_itemIndex = paramParcel.readInt();
    int k = paramParcel.readInt();
    int i;
    if (k > 0)
    {
      this.field_dataInfoData = new byte[k];
      i = 0;
      while (i < k)
      {
        this.field_dataInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
    k = paramParcel.readInt();
    if (k > 0)
    {
      this.field_cardTpInfoData = new byte[k];
      i = 0;
      while (i < k)
      {
        this.field_cardTpInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
    k = paramParcel.readInt();
    if (k > 0)
    {
      this.field_shareInfoData = new byte[k];
      i = 0;
      while (i < k)
      {
        this.field_shareInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
    k = paramParcel.readInt();
    if (k > 0)
    {
      this.field_shopInfoData = new byte[k];
      i = j;
      while (i < k)
      {
        this.field_shopInfoData[i] = paramParcel.readByte();
        i += 1;
      }
    }
    GMTrace.o(5065108619264L, 37738);
  }
  
  public final void a(jm paramjm)
  {
    GMTrace.i(5064571748352L, 37734);
    this.jyM = paramjm;
    if (this.jyM != null) {
      try
      {
        this.field_dataInfoData = paramjm.toByteArray();
        GMTrace.o(5064571748352L, 37734);
        return;
      }
      catch (Exception paramjm)
      {
        w.e("MicroMsg.ShareCardInfo", "setDataInfo fail, ex = %s", new Object[] { paramjm.getMessage() });
        w.printErrStackTrace("MicroMsg.ShareCardInfo", paramjm, "", new Object[0]);
      }
    }
    GMTrace.o(5064571748352L, 37734);
  }
  
  public final void a(jp paramjp)
  {
    GMTrace.i(5064974401536L, 37737);
    this.jyO = paramjp;
    try
    {
      this.field_shopInfoData = paramjp.toByteArray();
      GMTrace.o(5064974401536L, 37737);
      return;
    }
    catch (Exception paramjp)
    {
      w.e("MicroMsg.ShareCardInfo", "setShopInfo fail, ex = %s", new Object[] { paramjp.getMessage() });
      w.printErrStackTrace("MicroMsg.ShareCardInfo", paramjp, "", new Object[0]);
      GMTrace.o(5064974401536L, 37737);
    }
  }
  
  public final String ajA()
  {
    GMTrace.i(5065779707904L, 37743);
    String str = this.field_card_tp_id;
    GMTrace.o(5065779707904L, 37743);
    return str;
  }
  
  public final String ajB()
  {
    GMTrace.i(5065913925632L, 37744);
    String str = this.field_from_username;
    GMTrace.o(5065913925632L, 37744);
    return str;
  }
  
  public final long ajC()
  {
    GMTrace.i(5066182361088L, 37746);
    long l = this.field_local_updateTime;
    GMTrace.o(5066182361088L, 37746);
    return l;
  }
  
  public final String ajD()
  {
    GMTrace.i(5066719232000L, 37750);
    GMTrace.o(5066719232000L, 37750);
    return "";
  }
  
  public final int ajE()
  {
    GMTrace.i(5066853449728L, 37751);
    int i = this.field_categoryType;
    GMTrace.o(5066853449728L, 37751);
    return i;
  }
  
  public final String ajF()
  {
    GMTrace.i(5066987667456L, 37752);
    w.d("MicroMsg.ShareCardInfo", "encrypt_code:" + this.jxK);
    String str = this.jxK;
    GMTrace.o(5066987667456L, 37752);
    return str;
  }
  
  public final boolean aja()
  {
    GMTrace.i(5066316578816L, 37747);
    if ((ajv() != null) && (ajv().tZZ == 0))
    {
      GMTrace.o(5066316578816L, 37747);
      return true;
    }
    GMTrace.o(5066316578816L, 37747);
    return false;
  }
  
  public final boolean ajb()
  {
    GMTrace.i(5066450796544L, 37748);
    if ((ajv() != null) && (ajv().tZZ == 1))
    {
      GMTrace.o(5066450796544L, 37748);
      return true;
    }
    GMTrace.o(5066450796544L, 37748);
    return false;
  }
  
  public final boolean ajc()
  {
    GMTrace.i(5061753176064L, 37713);
    if ((ajv() != null) && (ajv().jxG == 10))
    {
      GMTrace.o(5061753176064L, 37713);
      return true;
    }
    GMTrace.o(5061753176064L, 37713);
    return false;
  }
  
  public final boolean ajd()
  {
    GMTrace.i(5061887393792L, 37714);
    if ((ajv() != null) && (ajv().jxG == 0))
    {
      GMTrace.o(5061887393792L, 37714);
      return true;
    }
    GMTrace.o(5061887393792L, 37714);
    return false;
  }
  
  public final boolean aje()
  {
    GMTrace.i(5062021611520L, 37715);
    if ((ajv() != null) && (ajv().jxG == 20))
    {
      GMTrace.o(5062021611520L, 37715);
      return true;
    }
    GMTrace.o(5062021611520L, 37715);
    return false;
  }
  
  public final boolean ajf()
  {
    GMTrace.i(5062155829248L, 37716);
    if ((ajv() != null) && (ajv().jxG == 11))
    {
      GMTrace.o(5062155829248L, 37716);
      return true;
    }
    GMTrace.o(5062155829248L, 37716);
    return false;
  }
  
  public final boolean ajg()
  {
    GMTrace.i(5062290046976L, 37717);
    if ((ajv() != null) && (ajv().jxG == 30))
    {
      GMTrace.o(5062290046976L, 37717);
      return true;
    }
    GMTrace.o(5062290046976L, 37717);
    return false;
  }
  
  public final boolean ajh()
  {
    GMTrace.i(5062424264704L, 37718);
    boolean bool = l.lE(ajv().jxG);
    GMTrace.o(5062424264704L, 37718);
    return bool;
  }
  
  public final boolean aji()
  {
    GMTrace.i(5062558482432L, 37719);
    if ((ajv().tZP & 0x2) == 0)
    {
      GMTrace.o(5062558482432L, 37719);
      return true;
    }
    GMTrace.o(5062558482432L, 37719);
    return false;
  }
  
  public final boolean ajj()
  {
    GMTrace.i(5062692700160L, 37720);
    if ((ajv().tZP & 0x1) == 0)
    {
      GMTrace.o(5062692700160L, 37720);
      return true;
    }
    GMTrace.o(5062692700160L, 37720);
    return false;
  }
  
  public final boolean ajk()
  {
    GMTrace.i(5062826917888L, 37721);
    if ((ajv().tZS & 1L) == 0L)
    {
      GMTrace.o(5062826917888L, 37721);
      return true;
    }
    GMTrace.o(5062826917888L, 37721);
    return false;
  }
  
  public final boolean ajl()
  {
    GMTrace.i(5062961135616L, 37722);
    if ((ajv().tZS & 0x10) == 0L)
    {
      GMTrace.o(5062961135616L, 37722);
      return true;
    }
    GMTrace.o(5062961135616L, 37722);
    return false;
  }
  
  public final boolean ajm()
  {
    GMTrace.i(5063095353344L, 37723);
    if ((ajv().tZS & 0x2) > 0L)
    {
      GMTrace.o(5063095353344L, 37723);
      return true;
    }
    GMTrace.o(5063095353344L, 37723);
    return false;
  }
  
  public final boolean ajn()
  {
    GMTrace.i(5063229571072L, 37724);
    GMTrace.o(5063229571072L, 37724);
    return false;
  }
  
  public final boolean ajo()
  {
    GMTrace.i(5063363788800L, 37725);
    if ((ajv().tZS & 0x4) > 0L)
    {
      GMTrace.o(5063363788800L, 37725);
      return true;
    }
    GMTrace.o(5063363788800L, 37725);
    return false;
  }
  
  public final boolean ajp()
  {
    GMTrace.i(5063498006528L, 37726);
    if ((ajv().tZS & 0x8) > 0L)
    {
      GMTrace.o(5063498006528L, 37726);
      return true;
    }
    GMTrace.o(5063498006528L, 37726);
    return false;
  }
  
  public final boolean ajq()
  {
    GMTrace.i(5067121885184L, 37753);
    if ((ajv() != null) && (ajv().uae == 1))
    {
      GMTrace.o(5067121885184L, 37753);
      return true;
    }
    GMTrace.o(5067121885184L, 37753);
    return false;
  }
  
  public final boolean ajr()
  {
    GMTrace.i(5063632224256L, 37727);
    if ((this.jyM != null) && (this.jyM.status == 0))
    {
      GMTrace.o(5063632224256L, 37727);
      return true;
    }
    GMTrace.o(5063632224256L, 37727);
    return false;
  }
  
  public final boolean ajs()
  {
    GMTrace.i(5063900659712L, 37729);
    if (!ajr())
    {
      GMTrace.o(5063900659712L, 37729);
      return false;
    }
    if (this.jyL != null) {
      w.i("MicroMsg.ShareCardInfo", "is_acceptable:" + this.jyL.uaf);
    }
    w.i("MicroMsg.ShareCardInfo", "avail_num:" + this.jyM.tZe);
    if ((this.jyL != null) && (this.jyL.uaf == 1))
    {
      GMTrace.o(5063900659712L, 37729);
      return true;
    }
    if (this.jyM.tZe > 0)
    {
      GMTrace.o(5063900659712L, 37729);
      return true;
    }
    if ((this.jyL != null) && (this.jyL.uaf == 0))
    {
      GMTrace.o(5063900659712L, 37729);
      return false;
    }
    if (this.jyM.tZe == 0)
    {
      GMTrace.o(5063900659712L, 37729);
      return false;
    }
    GMTrace.o(5063900659712L, 37729);
    return false;
  }
  
  public final boolean ajt()
  {
    GMTrace.i(5064034877440L, 37730);
    if ((this.jyL == null) || (this.jyL.tZW == null) || (TextUtils.isEmpty(this.jyL.tZW.text)))
    {
      GMTrace.o(5064034877440L, 37730);
      return false;
    }
    jo localjo = this.jyL.tZW;
    int i = (int)(System.currentTimeMillis() / 1000L);
    int j = localjo.oNd;
    if ((localjo.oNd > 0) && (j - i > 0))
    {
      GMTrace.o(5064034877440L, 37730);
      return true;
    }
    GMTrace.o(5064034877440L, 37730);
    return false;
  }
  
  public final boolean aju()
  {
    GMTrace.i(5064169095168L, 37731);
    if ((this.jyL != null) && (this.jyL.uaj == 1))
    {
      GMTrace.o(5064169095168L, 37731);
      return true;
    }
    GMTrace.o(5064169095168L, 37731);
    return false;
  }
  
  public final ju ajv()
  {
    GMTrace.i(5064303312896L, 37732);
    ju localju1;
    if (this.jyL != null)
    {
      localju1 = this.jyL;
      GMTrace.o(5064303312896L, 37732);
      return localju1;
    }
    try
    {
      this.jyL = ((ju)new ju().aD(this.field_cardTpInfoData));
      localju1 = this.jyL;
      GMTrace.o(5064303312896L, 37732);
      return localju1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ShareCardInfo", "getCardTpInfo fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
      ju localju2 = new ju();
      GMTrace.o(5064303312896L, 37732);
      return localju2;
    }
  }
  
  public final jm ajw()
  {
    GMTrace.i(5064437530624L, 37733);
    jm localjm1;
    if (this.jyM != null)
    {
      localjm1 = this.jyM;
      GMTrace.o(5064437530624L, 37733);
      return localjm1;
    }
    try
    {
      this.jyM = ((jm)new jm().aD(this.field_dataInfoData));
      localjm1 = this.jyM;
      GMTrace.o(5064437530624L, 37733);
      return localjm1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ShareCardInfo", "getDataInfo fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
      jm localjm2 = new jm();
      GMTrace.o(5064437530624L, 37733);
      return localjm2;
    }
  }
  
  public final bdu ajx()
  {
    GMTrace.i(5064705966080L, 37735);
    bdu localbdu1;
    if (this.jyN != null)
    {
      localbdu1 = this.jyN;
      GMTrace.o(5064705966080L, 37735);
      return localbdu1;
    }
    try
    {
      this.jyN = ((bdu)new bdu().aD(this.field_shareInfoData));
      localbdu1 = this.jyN;
      GMTrace.o(5064705966080L, 37735);
      return localbdu1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ShareCardInfo", "getShareInfo fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
      bdu localbdu2 = new bdu();
      GMTrace.o(5064705966080L, 37735);
      return localbdu2;
    }
  }
  
  public final jp ajy()
  {
    GMTrace.i(5064840183808L, 37736);
    jp localjp;
    if (this.jyO != null)
    {
      localjp = this.jyO;
      GMTrace.o(5064840183808L, 37736);
      return localjp;
    }
    try
    {
      this.jyO = ((jp)new jp().aD(this.field_shopInfoData));
      localjp = this.jyO;
      GMTrace.o(5064840183808L, 37736);
      return localjp;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ShareCardInfo", "getShopInfo fail ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
      GMTrace.o(5064840183808L, 37736);
    }
    return null;
  }
  
  public final String ajz()
  {
    GMTrace.i(5065645490176L, 37742);
    String str = this.field_card_id;
    GMTrace.o(5065645490176L, 37742);
    return str;
  }
  
  public int describeContents()
  {
    GMTrace.i(5065242836992L, 37739);
    GMTrace.o(5065242836992L, 37739);
    return 0;
  }
  
  public final long getEndTime()
  {
    GMTrace.i(5065511272448L, 37741);
    long l = this.field_end_time;
    GMTrace.o(5065511272448L, 37741);
    return l;
  }
  
  public final boolean isAcceptable()
  {
    GMTrace.i(5063766441984L, 37728);
    if (!ajr())
    {
      GMTrace.o(5063766441984L, 37728);
      return false;
    }
    if (this.jyL != null) {
      w.i("MicroMsg.ShareCardInfo", "is_acceptable:" + this.jyL.uaf);
    }
    w.i("MicroMsg.ShareCardInfo", "stock_num:" + this.jyM.tZh + " limit_num:" + this.jyM.tZi);
    if ((this.jyL != null) && (this.jyL.uaf == 1))
    {
      GMTrace.o(5063766441984L, 37728);
      return true;
    }
    if ((this.jyL != null) && (this.jyL.uaf == 0))
    {
      GMTrace.o(5063766441984L, 37728);
      return false;
    }
    if ((this.jyM.tZh == 0L) || (this.jyM.tZi == 0))
    {
      GMTrace.o(5063766441984L, 37728);
      return false;
    }
    GMTrace.o(5063766441984L, 37728);
    return false;
  }
  
  public final String lC(int paramInt)
  {
    GMTrace.i(5066585014272L, 37749);
    String str;
    if (paramInt == 10)
    {
      str = (String)al.aks().getValue("key_share_card_local_city");
      GMTrace.o(5066585014272L, 37749);
      return str;
    }
    if (paramInt == 0)
    {
      if (com.tencent.mm.plugin.card.sharecard.a.b.akI())
      {
        str = ab.getResources().getString(R.l.ddv);
        GMTrace.o(5066585014272L, 37749);
        return str;
      }
      GMTrace.o(5066585014272L, 37749);
      return "";
    }
    GMTrace.o(5066585014272L, 37749);
    return "";
  }
  
  public final void tI(String paramString)
  {
    GMTrace.i(5066048143360L, 37745);
    this.field_from_username = paramString;
    GMTrace.o(5066048143360L, 37745);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(5061618958336L, 37712);
    c.a locala = fTp;
    GMTrace.o(5061618958336L, 37712);
    return locala;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    GMTrace.i(5065377054720L, 37740);
    paramParcel.writeString(this.field_card_id);
    paramParcel.writeString(this.field_card_tp_id);
    paramParcel.writeString(this.field_from_username);
    paramParcel.writeInt(this.field_status);
    paramParcel.writeLong(this.field_share_time);
    paramParcel.writeLong(this.field_local_updateTime);
    paramParcel.writeLong(this.field_updateTime);
    paramParcel.writeLong(this.field_updateSeq);
    paramParcel.writeLong(this.field_block_mask);
    paramParcel.writeLong(this.field_end_time);
    paramParcel.writeInt(this.field_categoryType);
    paramParcel.writeInt(this.field_itemIndex);
    if (this.field_dataInfoData != null)
    {
      paramParcel.writeInt(this.field_dataInfoData.length);
      paramInt = 0;
      while (paramInt < this.field_dataInfoData.length)
      {
        paramParcel.writeByte(this.field_dataInfoData[paramInt]);
        paramInt += 1;
      }
    }
    if (this.field_cardTpInfoData != null)
    {
      paramParcel.writeInt(this.field_cardTpInfoData.length);
      paramInt = 0;
      while (paramInt < this.field_cardTpInfoData.length)
      {
        paramParcel.writeByte(this.field_cardTpInfoData[paramInt]);
        paramInt += 1;
      }
    }
    if (this.field_shareInfoData != null)
    {
      paramParcel.writeInt(this.field_shareInfoData.length);
      paramInt = 0;
      while (paramInt < this.field_shareInfoData.length)
      {
        paramParcel.writeByte(this.field_shareInfoData[paramInt]);
        paramInt += 1;
      }
    }
    if (this.field_shopInfoData != null)
    {
      paramParcel.writeInt(this.field_shopInfoData.length);
      paramInt = i;
      while (paramInt < this.field_shopInfoData.length)
      {
        paramParcel.writeByte(this.field_shopInfoData[paramInt]);
        paramInt += 1;
      }
    }
    GMTrace.o(5065377054720L, 37740);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\model\ShareCardInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */