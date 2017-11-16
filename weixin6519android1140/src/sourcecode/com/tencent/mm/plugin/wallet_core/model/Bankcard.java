package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dm;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

public class Bankcard
  extends dm
  implements Parcelable
{
  public static final Parcelable.Creator<Bankcard> CREATOR;
  public static c.a fTp;
  public static int reA;
  public static int reB;
  public static int reC;
  public static int reD;
  public static int reE;
  public static int rey;
  public static int rez;
  public String reF;
  public String reG;
  public String reH;
  public String reI;
  public String reJ;
  public double reK;
  public String reL;
  public double reM;
  public String reN;
  public String reO;
  public String reP;
  public String reQ;
  public boolean reR;
  public e reS;
  public int reg;
  public String rei;
  
  static
  {
    GMTrace.i(6899462307840L, 51405);
    rey = 1;
    rez = 2;
    reA = 4;
    reB = 8;
    reC = 16;
    reD = 32;
    reE = 64;
    c.a locala = new c.a();
    locala.gZM = new Field[36];
    locala.columns = new String[37];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "bindSerial";
    locala.vmt.put("bindSerial", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" bindSerial TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "bindSerial";
    locala.columns[1] = "cardType";
    locala.vmt.put("cardType", "INTEGER");
    localStringBuilder.append(" cardType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "bankcardState";
    locala.vmt.put("bankcardState", "INTEGER");
    localStringBuilder.append(" bankcardState INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "forbidWord";
    locala.vmt.put("forbidWord", "TEXT");
    localStringBuilder.append(" forbidWord TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "bankName";
    locala.vmt.put("bankName", "TEXT");
    localStringBuilder.append(" bankName TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "bankcardType";
    locala.vmt.put("bankcardType", "TEXT");
    localStringBuilder.append(" bankcardType TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "bankcardTypeName";
    locala.vmt.put("bankcardTypeName", "TEXT");
    localStringBuilder.append(" bankcardTypeName TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "bankcardTag";
    locala.vmt.put("bankcardTag", "INTEGER");
    localStringBuilder.append(" bankcardTag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "bankcardTail";
    locala.vmt.put("bankcardTail", "TEXT");
    localStringBuilder.append(" bankcardTail TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "supportTag";
    locala.vmt.put("supportTag", "INTEGER");
    localStringBuilder.append(" supportTag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "mobile";
    locala.vmt.put("mobile", "TEXT");
    localStringBuilder.append(" mobile TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "trueName";
    locala.vmt.put("trueName", "TEXT");
    localStringBuilder.append(" trueName TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "desc";
    locala.vmt.put("desc", "TEXT");
    localStringBuilder.append(" desc TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "bankPhone";
    locala.vmt.put("bankPhone", "TEXT");
    localStringBuilder.append(" bankPhone TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "bizUsername";
    locala.vmt.put("bizUsername", "TEXT");
    localStringBuilder.append(" bizUsername TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "onceQuotaKind";
    locala.vmt.put("onceQuotaKind", "DOUBLE");
    localStringBuilder.append(" onceQuotaKind DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[16] = "onceQuotaVirtual";
    locala.vmt.put("onceQuotaVirtual", "DOUBLE");
    localStringBuilder.append(" onceQuotaVirtual DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[17] = "dayQuotaKind";
    locala.vmt.put("dayQuotaKind", "DOUBLE");
    localStringBuilder.append(" dayQuotaKind DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[18] = "dayQuotaVirtual";
    locala.vmt.put("dayQuotaVirtual", "DOUBLE");
    localStringBuilder.append(" dayQuotaVirtual DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[19] = "fetchArriveTime";
    locala.vmt.put("fetchArriveTime", "LONG");
    localStringBuilder.append(" fetchArriveTime LONG");
    localStringBuilder.append(", ");
    locala.columns[20] = "fetchArriveTimeWording";
    locala.vmt.put("fetchArriveTimeWording", "TEXT");
    localStringBuilder.append(" fetchArriveTimeWording TEXT");
    localStringBuilder.append(", ");
    locala.columns[21] = "repay_url";
    locala.vmt.put("repay_url", "TEXT");
    localStringBuilder.append(" repay_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[22] = "wxcreditState";
    locala.vmt.put("wxcreditState", "INTEGER");
    localStringBuilder.append(" wxcreditState INTEGER");
    localStringBuilder.append(", ");
    locala.columns[23] = "bankcardClientType";
    locala.vmt.put("bankcardClientType", "INTEGER");
    localStringBuilder.append(" bankcardClientType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[24] = "ext_msg";
    locala.vmt.put("ext_msg", "TEXT");
    localStringBuilder.append(" ext_msg TEXT");
    localStringBuilder.append(", ");
    locala.columns[25] = "support_micropay";
    locala.vmt.put("support_micropay", "INTEGER");
    localStringBuilder.append(" support_micropay INTEGER");
    localStringBuilder.append(", ");
    locala.columns[26] = "arrive_type";
    locala.vmt.put("arrive_type", "TEXT");
    localStringBuilder.append(" arrive_type TEXT");
    localStringBuilder.append(", ");
    locala.columns[27] = "avail_save_wording";
    locala.vmt.put("avail_save_wording", "TEXT");
    localStringBuilder.append(" avail_save_wording TEXT");
    localStringBuilder.append(", ");
    locala.columns[28] = "fetch_charge_rate";
    locala.vmt.put("fetch_charge_rate", "DOUBLE");
    localStringBuilder.append(" fetch_charge_rate DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[29] = "full_fetch_charge_fee";
    locala.vmt.put("full_fetch_charge_fee", "DOUBLE");
    localStringBuilder.append(" full_fetch_charge_fee DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[30] = "fetch_charge_info";
    locala.vmt.put("fetch_charge_info", "TEXT");
    localStringBuilder.append(" fetch_charge_info TEXT");
    localStringBuilder.append(", ");
    locala.columns[31] = "tips";
    locala.vmt.put("tips", "TEXT");
    localStringBuilder.append(" tips TEXT");
    localStringBuilder.append(", ");
    locala.columns[32] = "forbid_title";
    locala.vmt.put("forbid_title", "TEXT");
    localStringBuilder.append(" forbid_title TEXT");
    localStringBuilder.append(", ");
    locala.columns[33] = "forbid_url";
    locala.vmt.put("forbid_url", "TEXT");
    localStringBuilder.append(" forbid_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[34] = "no_micro_word";
    locala.vmt.put("no_micro_word", "TEXT");
    localStringBuilder.append(" no_micro_word TEXT");
    localStringBuilder.append(", ");
    locala.columns[35] = "card_bottom_wording";
    locala.vmt.put("card_bottom_wording", "TEXT");
    localStringBuilder.append(" card_bottom_wording TEXT");
    locala.columns[36] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(6899462307840L, 51405);
  }
  
  public Bankcard()
  {
    GMTrace.i(6897449041920L, 51390);
    this.reJ = null;
    this.reQ = null;
    this.reR = false;
    GMTrace.o(6897449041920L, 51390);
  }
  
  public Bankcard(byte paramByte)
  {
    GMTrace.i(6897583259648L, 51391);
    this.reJ = null;
    this.reQ = null;
    this.reR = false;
    this.field_bankcardTag = 1;
    GMTrace.o(6897583259648L, 51391);
  }
  
  public Bankcard(Parcel paramParcel)
  {
    GMTrace.i(6899059654656L, 51402);
    this.reJ = null;
    this.reQ = null;
    this.reR = false;
    this.field_bankName = paramParcel.readString();
    this.field_desc = paramParcel.readString();
    this.field_bankcardType = paramParcel.readString();
    this.field_bindSerial = paramParcel.readString();
    this.field_cardType = paramParcel.readInt();
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.reR = bool1;
      this.field_mobile = paramParcel.readString();
      this.field_onceQuotaKind = paramParcel.readDouble();
      this.field_onceQuotaVirtual = paramParcel.readDouble();
      this.field_dayQuotaKind = paramParcel.readDouble();
      this.field_dayQuotaVirtual = paramParcel.readDouble();
      this.field_bankcardTail = paramParcel.readString();
      this.field_bankPhone = paramParcel.readString();
      this.field_bankcardTag = paramParcel.readInt();
      this.field_bankcardState = paramParcel.readInt();
      this.reJ = paramParcel.readString();
      this.reg = paramParcel.readInt();
      this.reQ = paramParcel.readString();
      this.field_bankcardClientType = paramParcel.readInt();
      this.field_ext_msg = paramParcel.readString();
      if (paramParcel.readInt() != 1) {
        break label267;
      }
    }
    label267:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.field_support_micropay = bool1;
      this.field_arrive_type = paramParcel.readString();
      this.field_fetch_charge_rate = paramParcel.readDouble();
      this.field_full_fetch_charge_fee = paramParcel.readDouble();
      this.field_no_micro_word = paramParcel.readString();
      this.field_card_bottom_wording = paramParcel.readString();
      GMTrace.o(6899059654656L, 51402);
      return;
      bool1 = false;
      break;
    }
  }
  
  public static String I(Context paramContext, int paramInt)
  {
    GMTrace.i(6898120130560L, 51395);
    switch (paramInt)
    {
    default: 
      paramContext = paramContext.getString(a.i.tep);
      GMTrace.o(6898120130560L, 51395);
      return paramContext;
    case 1: 
      paramContext = paramContext.getString(a.i.tei);
      GMTrace.o(6898120130560L, 51395);
      return paramContext;
    case 4: 
      paramContext = paramContext.getString(a.i.tek);
      GMTrace.o(6898120130560L, 51395);
      return paramContext;
    case 2: 
      paramContext = paramContext.getString(a.i.teo);
      GMTrace.o(6898120130560L, 51395);
      return paramContext;
    case 5: 
      paramContext = paramContext.getString(a.i.teg);
      GMTrace.o(6898120130560L, 51395);
      return paramContext;
    case 6: 
      paramContext = paramContext.getString(a.i.tem);
      GMTrace.o(6898120130560L, 51395);
      return paramContext;
    case 3: 
      paramContext = paramContext.getString(a.i.tet);
      GMTrace.o(6898120130560L, 51395);
      return paramContext;
    }
    paramContext = paramContext.getString(a.i.ter);
    GMTrace.o(6898120130560L, 51395);
    return paramContext;
  }
  
  public static boolean dw(int paramInt1, int paramInt2)
  {
    GMTrace.i(6897717477376L, 51392);
    w.d("MicroMsg.Bankcard", "supportBankcardTag : " + paramInt1 + ", bankcardTag : " + paramInt2);
    if ((paramInt1 & paramInt2) > 0)
    {
      GMTrace.o(6897717477376L, 51392);
      return true;
    }
    GMTrace.o(6897717477376L, 51392);
    return false;
  }
  
  public static boolean wP(int paramInt)
  {
    GMTrace.i(6897851695104L, 51393);
    if ((paramInt & 0x2) > 0)
    {
      GMTrace.o(6897851695104L, 51393);
      return true;
    }
    GMTrace.o(6897851695104L, 51393);
    return false;
  }
  
  public final int a(int paramInt, Orders paramOrders)
  {
    GMTrace.i(6897985912832L, 51394);
    if (this.field_bankcardState != 0)
    {
      w.d("MicroMsg.Bankcard", " bankcardState : " + this.field_bankcardState);
      paramInt = this.field_bankcardState;
      GMTrace.o(6897985912832L, 51394);
      return paramInt;
    }
    if ((paramOrders != null) && (paramOrders.eHG.equals(this.reJ)))
    {
      GMTrace.o(6897985912832L, 51394);
      return 4;
    }
    if ((this.field_bankcardTag & paramInt) > 0) {
      paramInt = 1;
    }
    while (paramInt == 0) {
      if (byg())
      {
        GMTrace.o(6897985912832L, 51394);
        return 5;
        paramInt = 0;
      }
      else
      {
        GMTrace.o(6897985912832L, 51394);
        return 6;
      }
    }
    if ((paramOrders != null) && (!paramOrders.rhs.isEmpty()) && (!paramOrders.rhs.contains(this.field_bankcardType)))
    {
      GMTrace.o(6897985912832L, 51394);
      return 7;
    }
    GMTrace.o(6897985912832L, 51394);
    return 0;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(6899328090112L, 51404);
    super.b(paramCursor);
    GMTrace.o(6899328090112L, 51404);
  }
  
  public final boolean byc()
  {
    GMTrace.i(6898254348288L, 51396);
    if ((this.field_cardType & reA) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.Bankcard", "isWXCredit, ret = " + bool);
      GMTrace.o(6898254348288L, 51396);
      return bool;
    }
  }
  
  public final boolean byd()
  {
    GMTrace.i(6898388566016L, 51397);
    if ((this.field_cardType & reB) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.Bankcard", "isWXCredit, ret = " + bool);
      GMTrace.o(6898388566016L, 51397);
      return bool;
    }
  }
  
  public final boolean bye()
  {
    GMTrace.i(18041278562304L, 134418);
    if ((this.field_cardType & reE) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.Bankcard", "isLqtCard, ret = " + bool);
      GMTrace.o(18041278562304L, 134418);
      return bool;
    }
  }
  
  public final boolean byf()
  {
    GMTrace.i(6898522783744L, 51398);
    if ((this.field_cardType & rez) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.Bankcard", "isCredit, ret = " + bool);
      GMTrace.o(6898522783744L, 51398);
      return bool;
    }
  }
  
  public final boolean byg()
  {
    GMTrace.i(6898657001472L, 51399);
    if ((this.field_cardType & rey) <= 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.Bankcard", "isDomestic, ret = " + bool);
      GMTrace.o(6898657001472L, 51399);
      return bool;
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(6898925436928L, 51401);
    GMTrace.o(6898925436928L, 51401);
    return 0;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(6898791219200L, 51400);
    c.a locala = fTp;
    GMTrace.o(6898791219200L, 51400);
    return locala;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(6899193872384L, 51403);
    paramParcel.writeString(this.field_bankName);
    paramParcel.writeString(this.field_desc);
    paramParcel.writeString(this.field_bankcardType);
    paramParcel.writeString(this.field_bindSerial);
    paramParcel.writeInt(this.field_cardType);
    if (this.reR)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.field_mobile);
      paramParcel.writeDouble(this.field_onceQuotaKind);
      paramParcel.writeDouble(this.field_onceQuotaVirtual);
      paramParcel.writeDouble(this.field_dayQuotaKind);
      paramParcel.writeDouble(this.field_dayQuotaVirtual);
      paramParcel.writeString(this.field_bankcardTail);
      paramParcel.writeString(this.field_bankPhone);
      paramParcel.writeInt(this.field_bankcardTag);
      paramParcel.writeInt(this.field_bankcardState);
      paramParcel.writeString(this.reJ);
      paramParcel.writeInt(this.reg);
      paramParcel.writeString(this.reQ);
      paramParcel.writeInt(this.field_bankcardClientType);
      paramParcel.writeString(this.field_ext_msg);
      if (!this.field_support_micropay) {
        break label246;
      }
    }
    label246:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.field_arrive_type);
      paramParcel.writeDouble(this.field_fetch_charge_rate);
      paramParcel.writeDouble(this.field_full_fetch_charge_fee);
      paramParcel.writeString(this.field_no_micro_word);
      paramParcel.writeString(this.field_card_bottom_wording);
      GMTrace.o(6899193872384L, 51403);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\Bankcard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */