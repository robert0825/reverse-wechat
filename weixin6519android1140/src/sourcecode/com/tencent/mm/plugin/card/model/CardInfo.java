package com.tencent.mm.plugin.card.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dh;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.bdu;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.jo;
import com.tencent.mm.protocal.c.jp;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;

public class CardInfo
  extends dh
  implements Parcelable, b
{
  public static final Parcelable.Creator<CardInfo> CREATOR;
  protected static c.a fTp;
  public String jxK;
  public ju jyL;
  public jm jyM;
  public bdu jyN;
  public jp jyO;
  public boolean jyP;
  
  static
  {
    GMTrace.i(4900155031552L, 36509);
    c.a locala = new c.a();
    locala.gZM = new Field[22];
    locala.columns = new String[23];
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
    locala.columns[3] = "status";
    locala.vmt.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "delete_state_flag";
    locala.vmt.put("delete_state_flag", "INTEGER");
    localStringBuilder.append(" delete_state_flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "local_updateTime";
    locala.vmt.put("local_updateTime", "LONG");
    localStringBuilder.append(" local_updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "updateTime";
    locala.vmt.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "updateSeq";
    locala.vmt.put("updateSeq", "LONG");
    localStringBuilder.append(" updateSeq LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "create_time";
    locala.vmt.put("create_time", "LONG");
    localStringBuilder.append(" create_time LONG");
    localStringBuilder.append(", ");
    locala.columns[9] = "begin_time";
    locala.vmt.put("begin_time", "LONG");
    localStringBuilder.append(" begin_time LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "end_time";
    locala.vmt.put("end_time", "LONG");
    localStringBuilder.append(" end_time LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "block_mask";
    locala.vmt.put("block_mask", "TEXT");
    localStringBuilder.append(" block_mask TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "dataInfoData";
    locala.vmt.put("dataInfoData", "BLOB");
    localStringBuilder.append(" dataInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "cardTpInfoData";
    locala.vmt.put("cardTpInfoData", "BLOB");
    localStringBuilder.append(" cardTpInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "shareInfoData";
    locala.vmt.put("shareInfoData", "BLOB");
    localStringBuilder.append(" shareInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[15] = "shopInfoData";
    locala.vmt.put("shopInfoData", "BLOB");
    localStringBuilder.append(" shopInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[16] = "stickyIndex";
    locala.vmt.put("stickyIndex", "INTEGER");
    localStringBuilder.append(" stickyIndex INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "stickyEndTime";
    locala.vmt.put("stickyEndTime", "INTEGER");
    localStringBuilder.append(" stickyEndTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[18] = "stickyAnnouncement";
    locala.vmt.put("stickyAnnouncement", "TEXT");
    localStringBuilder.append(" stickyAnnouncement TEXT");
    localStringBuilder.append(", ");
    locala.columns[19] = "card_type";
    locala.vmt.put("card_type", "INTEGER default '-1' ");
    localStringBuilder.append(" card_type INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[20] = "label_wording";
    locala.vmt.put("label_wording", "TEXT");
    localStringBuilder.append(" label_wording TEXT");
    localStringBuilder.append(", ");
    locala.columns[21] = "is_dynamic";
    locala.vmt.put("is_dynamic", "INTEGER");
    localStringBuilder.append(" is_dynamic INTEGER");
    locala.columns[22] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(4900155031552L, 36509);
  }
  
  public CardInfo()
  {
    GMTrace.i(4894383669248L, 36466);
    this.jyP = true;
    this.jxK = "";
    this.field_card_type = -1;
    GMTrace.o(4894383669248L, 36466);
  }
  
  public CardInfo(Parcel paramParcel)
  {
    GMTrace.i(4898007547904L, 36493);
    this.jyP = true;
    this.jxK = "";
    this.field_card_id = paramParcel.readString();
    this.field_card_tp_id = paramParcel.readString();
    this.field_from_username = paramParcel.readString();
    this.field_status = paramParcel.readInt();
    this.field_delete_state_flag = paramParcel.readInt();
    this.field_local_updateTime = paramParcel.readLong();
    this.field_updateTime = paramParcel.readLong();
    this.field_updateSeq = paramParcel.readLong();
    this.field_create_time = paramParcel.readLong();
    this.field_begin_time = paramParcel.readLong();
    this.field_end_time = paramParcel.readLong();
    this.field_block_mask = paramParcel.readString();
    this.field_stickyIndex = paramParcel.readInt();
    this.field_stickyEndTime = paramParcel.readInt();
    this.field_stickyAnnouncement = paramParcel.readString();
    this.field_card_type = paramParcel.readInt();
    this.field_label_wording = paramParcel.readString();
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
    GMTrace.o(4898007547904L, 36493);
  }
  
  public final void a(jm paramjm)
  {
    GMTrace.i(4897470676992L, 36489);
    this.jyM = paramjm;
    if (this.jyM != null)
    {
      this.field_status = this.jyM.status;
      try
      {
        this.field_dataInfoData = paramjm.toByteArray();
        GMTrace.o(4897470676992L, 36489);
        return;
      }
      catch (Exception paramjm)
      {
        w.e("MicroMsg.CardInfo", "setDataInfo fail, ex = %s", new Object[] { paramjm.getMessage() });
        w.printErrStackTrace("MicroMsg.CardInfo", paramjm, "", new Object[0]);
      }
    }
    GMTrace.o(4897470676992L, 36489);
  }
  
  public final void a(jp paramjp)
  {
    GMTrace.i(4897873330176L, 36492);
    this.jyO = paramjp;
    try
    {
      this.field_shopInfoData = paramjp.toByteArray();
      GMTrace.o(4897873330176L, 36492);
      return;
    }
    catch (Exception paramjp)
    {
      w.e("MicroMsg.CardInfo", "setShopInfo fail, ex = %s", new Object[] { paramjp.getMessage() });
      w.printErrStackTrace("MicroMsg.CardInfo", paramjp, "", new Object[0]);
      GMTrace.o(4897873330176L, 36492);
    }
  }
  
  public final String ajA()
  {
    GMTrace.i(4898678636544L, 36498);
    String str = this.field_card_tp_id;
    GMTrace.o(4898678636544L, 36498);
    return str;
  }
  
  public final String ajB()
  {
    GMTrace.i(4898812854272L, 36499);
    String str = this.field_from_username;
    GMTrace.o(4898812854272L, 36499);
    return str;
  }
  
  public final long ajC()
  {
    GMTrace.i(4899081289728L, 36501);
    long l = this.field_local_updateTime;
    GMTrace.o(4899081289728L, 36501);
    return l;
  }
  
  public final String ajD()
  {
    GMTrace.i(4899618160640L, 36505);
    GMTrace.o(4899618160640L, 36505);
    return null;
  }
  
  public final int ajE()
  {
    GMTrace.i(4899752378368L, 36506);
    GMTrace.o(4899752378368L, 36506);
    return 0;
  }
  
  public final String ajF()
  {
    GMTrace.i(4899886596096L, 36507);
    w.d("MicroMsg.CardInfo", "encrypt_code:" + this.jxK);
    String str = this.jxK;
    GMTrace.o(4899886596096L, 36507);
    return str;
  }
  
  public final boolean aja()
  {
    GMTrace.i(4899215507456L, 36502);
    if ((ajv() != null) && (ajv().tZZ == 0))
    {
      GMTrace.o(4899215507456L, 36502);
      return true;
    }
    GMTrace.o(4899215507456L, 36502);
    return false;
  }
  
  public final boolean ajb()
  {
    GMTrace.i(4899349725184L, 36503);
    if ((ajv() != null) && (ajv().tZZ == 1))
    {
      GMTrace.o(4899349725184L, 36503);
      return true;
    }
    GMTrace.o(4899349725184L, 36503);
    return false;
  }
  
  public final boolean ajc()
  {
    GMTrace.i(4894652104704L, 36468);
    if ((ajv() != null) && (ajv().jxG == 10))
    {
      GMTrace.o(4894652104704L, 36468);
      return true;
    }
    GMTrace.o(4894652104704L, 36468);
    return false;
  }
  
  public final boolean ajd()
  {
    GMTrace.i(4894786322432L, 36469);
    if ((ajv() != null) && (ajv().jxG == 0))
    {
      GMTrace.o(4894786322432L, 36469);
      return true;
    }
    GMTrace.o(4894786322432L, 36469);
    return false;
  }
  
  public final boolean aje()
  {
    GMTrace.i(4894920540160L, 36470);
    if ((ajv() != null) && (ajv().jxG == 20))
    {
      GMTrace.o(4894920540160L, 36470);
      return true;
    }
    GMTrace.o(4894920540160L, 36470);
    return false;
  }
  
  public final boolean ajf()
  {
    GMTrace.i(4895054757888L, 36471);
    if ((ajv() != null) && (ajv().jxG == 11))
    {
      GMTrace.o(4895054757888L, 36471);
      return true;
    }
    GMTrace.o(4895054757888L, 36471);
    return false;
  }
  
  public final boolean ajg()
  {
    GMTrace.i(4895188975616L, 36472);
    if ((ajv() != null) && (ajv().jxG == 30))
    {
      GMTrace.o(4895188975616L, 36472);
      return true;
    }
    GMTrace.o(4895188975616L, 36472);
    return false;
  }
  
  public final boolean ajh()
  {
    GMTrace.i(4895323193344L, 36473);
    boolean bool = l.lE(ajv().jxG);
    GMTrace.o(4895323193344L, 36473);
    return bool;
  }
  
  public final boolean aji()
  {
    GMTrace.i(4895457411072L, 36474);
    if ((ajv().tZP & 0x2) == 0)
    {
      GMTrace.o(4895457411072L, 36474);
      return true;
    }
    GMTrace.o(4895457411072L, 36474);
    return false;
  }
  
  public final boolean ajj()
  {
    GMTrace.i(4895591628800L, 36475);
    if ((ajv().tZP & 0x1) == 0)
    {
      GMTrace.o(4895591628800L, 36475);
      return true;
    }
    GMTrace.o(4895591628800L, 36475);
    return false;
  }
  
  public final boolean ajk()
  {
    GMTrace.i(4895725846528L, 36476);
    if ((ajv().tZS & 1L) == 0L)
    {
      GMTrace.o(4895725846528L, 36476);
      return true;
    }
    GMTrace.o(4895725846528L, 36476);
    return false;
  }
  
  public final boolean ajl()
  {
    GMTrace.i(4895860064256L, 36477);
    if ((ajv().tZS & 0x10) == 0L)
    {
      GMTrace.o(4895860064256L, 36477);
      return true;
    }
    GMTrace.o(4895860064256L, 36477);
    return false;
  }
  
  public final boolean ajm()
  {
    GMTrace.i(4895994281984L, 36478);
    if ((ajv().tZS & 0x2) > 0L)
    {
      GMTrace.o(4895994281984L, 36478);
      return true;
    }
    GMTrace.o(4895994281984L, 36478);
    return false;
  }
  
  public final boolean ajn()
  {
    GMTrace.i(4896128499712L, 36479);
    if ((ajv().tZS & 0x20) > 0L)
    {
      GMTrace.o(4896128499712L, 36479);
      return true;
    }
    GMTrace.o(4896128499712L, 36479);
    return false;
  }
  
  public final boolean ajo()
  {
    GMTrace.i(4896262717440L, 36480);
    if ((ajv().tZS & 0x4) > 0L)
    {
      GMTrace.o(4896262717440L, 36480);
      return true;
    }
    GMTrace.o(4896262717440L, 36480);
    return false;
  }
  
  public final boolean ajp()
  {
    GMTrace.i(4896396935168L, 36481);
    if ((ajv().tZS & 0x8) > 0L)
    {
      GMTrace.o(4896396935168L, 36481);
      return true;
    }
    GMTrace.o(4896396935168L, 36481);
    return false;
  }
  
  public final boolean ajq()
  {
    GMTrace.i(4900020813824L, 36508);
    if ((ajv() != null) && (ajv().uae == 1))
    {
      GMTrace.o(4900020813824L, 36508);
      return true;
    }
    GMTrace.o(4900020813824L, 36508);
    return false;
  }
  
  public final boolean ajr()
  {
    GMTrace.i(4896531152896L, 36482);
    if ((this.jyM != null) && (this.jyM.status == 0))
    {
      GMTrace.o(4896531152896L, 36482);
      return true;
    }
    GMTrace.o(4896531152896L, 36482);
    return false;
  }
  
  public final boolean ajs()
  {
    GMTrace.i(4896799588352L, 36484);
    if (!ajr())
    {
      GMTrace.o(4896799588352L, 36484);
      return false;
    }
    if (this.jyL != null) {
      w.i("MicroMsg.CardInfo", "is_acceptable:" + this.jyL.uaf);
    }
    w.i("MicroMsg.CardInfo", "avail_num:" + this.jyM.tZe);
    if ((this.jyL != null) && (this.jyL.uaf == 1))
    {
      GMTrace.o(4896799588352L, 36484);
      return true;
    }
    if (this.jyM.tZe > 0)
    {
      GMTrace.o(4896799588352L, 36484);
      return true;
    }
    if ((this.jyL != null) && (this.jyL.uaf == 0))
    {
      GMTrace.o(4896799588352L, 36484);
      return false;
    }
    if (this.jyM.tZe == 0)
    {
      GMTrace.o(4896799588352L, 36484);
      return false;
    }
    GMTrace.o(4896799588352L, 36484);
    return false;
  }
  
  public final boolean ajt()
  {
    GMTrace.i(4896933806080L, 36485);
    if ((this.jyL == null) || (this.jyL.tZW == null) || (TextUtils.isEmpty(this.jyL.tZW.text)))
    {
      GMTrace.o(4896933806080L, 36485);
      return false;
    }
    jo localjo = this.jyL.tZW;
    int i = (int)(System.currentTimeMillis() / 1000L);
    int j = localjo.oNd;
    if ((localjo.oNd > 0) && (j - i > 0))
    {
      GMTrace.o(4896933806080L, 36485);
      return true;
    }
    GMTrace.o(4896933806080L, 36485);
    return false;
  }
  
  public final boolean aju()
  {
    GMTrace.i(4897068023808L, 36486);
    if ((this.jyL != null) && (this.jyL.uaj == 1))
    {
      GMTrace.o(4897068023808L, 36486);
      return true;
    }
    GMTrace.o(4897068023808L, 36486);
    return false;
  }
  
  public final ju ajv()
  {
    GMTrace.i(4897202241536L, 36487);
    ju localju1;
    if (this.jyL != null)
    {
      localju1 = this.jyL;
      GMTrace.o(4897202241536L, 36487);
      return localju1;
    }
    try
    {
      this.jyL = ((ju)new ju().aD(this.field_cardTpInfoData));
      localju1 = this.jyL;
      GMTrace.o(4897202241536L, 36487);
      return localju1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.CardInfo", "getCardTpInfo fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.CardInfo", localException, "", new Object[0]);
      ju localju2 = new ju();
      GMTrace.o(4897202241536L, 36487);
      return localju2;
    }
  }
  
  public final jm ajw()
  {
    GMTrace.i(4897336459264L, 36488);
    jm localjm1;
    if (this.jyM != null)
    {
      localjm1 = this.jyM;
      GMTrace.o(4897336459264L, 36488);
      return localjm1;
    }
    try
    {
      this.jyM = ((jm)new jm().aD(this.field_dataInfoData));
      localjm1 = this.jyM;
      GMTrace.o(4897336459264L, 36488);
      return localjm1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.CardInfo", "getDataInfo fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.CardInfo", localException, "", new Object[0]);
      jm localjm2 = new jm();
      GMTrace.o(4897336459264L, 36488);
      return localjm2;
    }
  }
  
  public final bdu ajx()
  {
    GMTrace.i(4897604894720L, 36490);
    bdu localbdu1;
    if (this.jyN != null)
    {
      localbdu1 = this.jyN;
      GMTrace.o(4897604894720L, 36490);
      return localbdu1;
    }
    try
    {
      this.jyN = ((bdu)new bdu().aD(this.field_shareInfoData));
      localbdu1 = this.jyN;
      GMTrace.o(4897604894720L, 36490);
      return localbdu1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.CardInfo", "getShareInfo fail, ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.CardInfo", localException, "", new Object[0]);
      bdu localbdu2 = new bdu();
      GMTrace.o(4897604894720L, 36490);
      return localbdu2;
    }
  }
  
  public final jp ajy()
  {
    GMTrace.i(4897739112448L, 36491);
    jp localjp;
    if (this.jyO != null)
    {
      localjp = this.jyO;
      GMTrace.o(4897739112448L, 36491);
      return localjp;
    }
    try
    {
      this.jyO = ((jp)new jp().aD(this.field_shopInfoData));
      localjp = this.jyO;
      GMTrace.o(4897739112448L, 36491);
      return localjp;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.CardInfo", "getShopInfo fail ex = %s", new Object[] { localException.getMessage() });
      w.printErrStackTrace("MicroMsg.CardInfo", localException, "", new Object[0]);
      GMTrace.o(4897739112448L, 36491);
    }
    return null;
  }
  
  public final String ajz()
  {
    GMTrace.i(4898544418816L, 36497);
    String str = this.field_card_id;
    GMTrace.o(4898544418816L, 36497);
    return str;
  }
  
  public int describeContents()
  {
    GMTrace.i(4898141765632L, 36494);
    GMTrace.o(4898141765632L, 36494);
    return 0;
  }
  
  public final long getEndTime()
  {
    GMTrace.i(4898410201088L, 36496);
    long l = this.field_end_time;
    GMTrace.o(4898410201088L, 36496);
    return l;
  }
  
  public final boolean isAcceptable()
  {
    GMTrace.i(4896665370624L, 36483);
    if (!ajr())
    {
      GMTrace.o(4896665370624L, 36483);
      return false;
    }
    if (this.jyL != null) {
      w.i("MicroMsg.CardInfo", "is_acceptable:" + this.jyL.uaf);
    }
    w.i("MicroMsg.CardInfo", "stock_num:" + this.jyM.tZh + " limit_num:" + this.jyM.tZi);
    if ((this.jyL != null) && (this.jyL.uaf == 1))
    {
      GMTrace.o(4896665370624L, 36483);
      return true;
    }
    if ((this.jyL != null) && (this.jyL.uaf == 0))
    {
      GMTrace.o(4896665370624L, 36483);
      return false;
    }
    if ((this.jyM.tZh == 0L) || (this.jyM.tZi == 0))
    {
      GMTrace.o(4896665370624L, 36483);
      return false;
    }
    GMTrace.o(4896665370624L, 36483);
    return false;
  }
  
  public final String lC(int paramInt)
  {
    GMTrace.i(4899483942912L, 36504);
    GMTrace.o(4899483942912L, 36504);
    return null;
  }
  
  public final void tI(String paramString)
  {
    GMTrace.i(4898947072000L, 36500);
    this.field_from_username = paramString;
    GMTrace.o(4898947072000L, 36500);
  }
  
  protected final c.a uw()
  {
    GMTrace.i(4894517886976L, 36467);
    c.a locala = fTp;
    GMTrace.o(4894517886976L, 36467);
    return locala;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    GMTrace.i(4898275983360L, 36495);
    paramParcel.writeString(this.field_card_id);
    paramParcel.writeString(this.field_card_tp_id);
    paramParcel.writeString(this.field_from_username);
    paramParcel.writeInt(this.field_status);
    paramParcel.writeInt(this.field_delete_state_flag);
    paramParcel.writeLong(this.field_local_updateTime);
    paramParcel.writeLong(this.field_updateTime);
    paramParcel.writeLong(this.field_updateSeq);
    paramParcel.writeLong(this.field_create_time);
    paramParcel.writeLong(this.field_begin_time);
    paramParcel.writeLong(this.field_end_time);
    paramParcel.writeString(this.field_block_mask);
    paramParcel.writeInt(this.field_stickyIndex);
    paramParcel.writeInt(this.field_stickyEndTime);
    paramParcel.writeString(this.field_stickyAnnouncement);
    paramParcel.writeInt(this.field_card_type);
    paramParcel.writeString(this.field_label_wording);
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
    paramParcel.writeInt(0);
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
    paramParcel.writeInt(0);
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
    paramParcel.writeInt(0);
    if (this.field_shopInfoData != null)
    {
      paramParcel.writeInt(this.field_shopInfoData.length);
      paramInt = i;
      while (paramInt < this.field_shopInfoData.length)
      {
        paramParcel.writeByte(this.field_shopInfoData[paramInt]);
        paramInt += 1;
      }
      GMTrace.o(4898275983360L, 36495);
      return;
    }
    paramParcel.writeInt(0);
    GMTrace.o(4898275983360L, 36495);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\CardInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */