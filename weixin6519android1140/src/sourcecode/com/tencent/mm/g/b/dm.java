package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dm
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fEA;
  private static final int fEB;
  private static final int fEC;
  private static final int fED;
  private static final int fEE;
  private static final int fEF;
  private static final int fEG;
  private static final int fEH;
  private static final int fEI;
  private static final int fEJ;
  private static final int fEK;
  private static final int fEL;
  private static final int fEM;
  private static final int fEN;
  private static final int fEO;
  private static final int fEP;
  private static final int fEQ;
  private static final int fER;
  private static final int fES;
  private static final int fET;
  private static final int fEm;
  private static final int fEn;
  private static final int fEo;
  private static final int fEp;
  private static final int fEq;
  private static final int fEr;
  private static final int fEs;
  private static final int fEt;
  private static final int fEu;
  private static final int fEv;
  private static final int fEw;
  private static final int fEx;
  private static final int fEy;
  private static final int fEz;
  private static final int fmH;
  private static final int fvY;
  private boolean fDE;
  private boolean fDF;
  private boolean fDG;
  private boolean fDH;
  private boolean fDI;
  private boolean fDJ;
  private boolean fDK;
  private boolean fDL;
  private boolean fDM;
  private boolean fDN;
  private boolean fDO;
  private boolean fDP;
  private boolean fDQ;
  private boolean fDR;
  private boolean fDS;
  private boolean fDT;
  private boolean fDU;
  private boolean fDV;
  private boolean fDW;
  private boolean fDX;
  private boolean fDY;
  private boolean fDZ;
  private boolean fEa;
  private boolean fEb;
  private boolean fEc;
  private boolean fEd;
  private boolean fEe;
  private boolean fEf;
  private boolean fEg;
  private boolean fEh;
  private boolean fEi;
  private boolean fEj;
  private boolean fEk;
  private boolean fEl;
  public String field_arrive_type;
  public String field_avail_save_wording;
  public String field_bankName;
  public String field_bankPhone;
  public int field_bankcardClientType;
  public int field_bankcardState;
  public int field_bankcardTag;
  public String field_bankcardTail;
  public String field_bankcardType;
  public String field_bankcardTypeName;
  public String field_bindSerial;
  public String field_bizUsername;
  public int field_cardType;
  public String field_card_bottom_wording;
  public double field_dayQuotaKind;
  public double field_dayQuotaVirtual;
  public String field_desc;
  public String field_ext_msg;
  public long field_fetchArriveTime;
  public String field_fetchArriveTimeWording;
  public String field_fetch_charge_info;
  public double field_fetch_charge_rate;
  public String field_forbidWord;
  public String field_forbid_title;
  public String field_forbid_url;
  public double field_full_fetch_charge_fee;
  public String field_mobile;
  public String field_no_micro_word;
  public double field_onceQuotaKind;
  public double field_onceQuotaVirtual;
  public String field_repay_url;
  public int field_supportTag;
  public boolean field_support_micropay;
  public String field_tips;
  public String field_trueName;
  public int field_wxcreditState;
  private boolean fmD;
  private boolean fvS;
  
  static
  {
    GMTrace.i(4124779216896L, 30732);
    eZt = new String[0];
    fEm = "bindSerial".hashCode();
    fEn = "cardType".hashCode();
    fEo = "bankcardState".hashCode();
    fEp = "forbidWord".hashCode();
    fEq = "bankName".hashCode();
    fEr = "bankcardType".hashCode();
    fEs = "bankcardTypeName".hashCode();
    fEt = "bankcardTag".hashCode();
    fEu = "bankcardTail".hashCode();
    fEv = "supportTag".hashCode();
    fEw = "mobile".hashCode();
    fEx = "trueName".hashCode();
    fmH = "desc".hashCode();
    fEy = "bankPhone".hashCode();
    fEz = "bizUsername".hashCode();
    fEA = "onceQuotaKind".hashCode();
    fEB = "onceQuotaVirtual".hashCode();
    fEC = "dayQuotaKind".hashCode();
    fED = "dayQuotaVirtual".hashCode();
    fEE = "fetchArriveTime".hashCode();
    fEF = "fetchArriveTimeWording".hashCode();
    fEG = "repay_url".hashCode();
    fEH = "wxcreditState".hashCode();
    fEI = "bankcardClientType".hashCode();
    fEJ = "ext_msg".hashCode();
    fEK = "support_micropay".hashCode();
    fEL = "arrive_type".hashCode();
    fEM = "avail_save_wording".hashCode();
    fEN = "fetch_charge_rate".hashCode();
    fEO = "full_fetch_charge_fee".hashCode();
    fEP = "fetch_charge_info".hashCode();
    fvY = "tips".hashCode();
    fEQ = "forbid_title".hashCode();
    fER = "forbid_url".hashCode();
    fES = "no_micro_word".hashCode();
    fET = "card_bottom_wording".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4124779216896L, 30732);
  }
  
  public dm()
  {
    GMTrace.i(4124376563712L, 30729);
    this.fDE = true;
    this.fDF = true;
    this.fDG = true;
    this.fDH = true;
    this.fDI = true;
    this.fDJ = true;
    this.fDK = true;
    this.fDL = true;
    this.fDM = true;
    this.fDN = true;
    this.fDO = true;
    this.fDP = true;
    this.fmD = true;
    this.fDQ = true;
    this.fDR = true;
    this.fDS = true;
    this.fDT = true;
    this.fDU = true;
    this.fDV = true;
    this.fDW = true;
    this.fDX = true;
    this.fDY = true;
    this.fDZ = true;
    this.fEa = true;
    this.fEb = true;
    this.fEc = true;
    this.fEd = true;
    this.fEe = true;
    this.fEf = true;
    this.fEg = true;
    this.fEh = true;
    this.fvS = true;
    this.fEi = true;
    this.fEj = true;
    this.fEk = true;
    this.fEl = true;
    GMTrace.o(4124376563712L, 30729);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4124510781440L, 30730);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4124510781440L, 30730);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fEm == k)
      {
        this.field_bindSerial = paramCursor.getString(i);
        this.fDE = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fEn == k)
        {
          this.field_cardType = paramCursor.getInt(i);
        }
        else if (fEo == k)
        {
          this.field_bankcardState = paramCursor.getInt(i);
        }
        else if (fEp == k)
        {
          this.field_forbidWord = paramCursor.getString(i);
        }
        else if (fEq == k)
        {
          this.field_bankName = paramCursor.getString(i);
        }
        else if (fEr == k)
        {
          this.field_bankcardType = paramCursor.getString(i);
        }
        else if (fEs == k)
        {
          this.field_bankcardTypeName = paramCursor.getString(i);
        }
        else if (fEt == k)
        {
          this.field_bankcardTag = paramCursor.getInt(i);
        }
        else if (fEu == k)
        {
          this.field_bankcardTail = paramCursor.getString(i);
        }
        else if (fEv == k)
        {
          this.field_supportTag = paramCursor.getInt(i);
        }
        else if (fEw == k)
        {
          this.field_mobile = paramCursor.getString(i);
        }
        else if (fEx == k)
        {
          this.field_trueName = paramCursor.getString(i);
        }
        else if (fmH == k)
        {
          this.field_desc = paramCursor.getString(i);
        }
        else if (fEy == k)
        {
          this.field_bankPhone = paramCursor.getString(i);
        }
        else if (fEz == k)
        {
          this.field_bizUsername = paramCursor.getString(i);
        }
        else if (fEA == k)
        {
          this.field_onceQuotaKind = paramCursor.getDouble(i);
        }
        else if (fEB == k)
        {
          this.field_onceQuotaVirtual = paramCursor.getDouble(i);
        }
        else if (fEC == k)
        {
          this.field_dayQuotaKind = paramCursor.getDouble(i);
        }
        else if (fED == k)
        {
          this.field_dayQuotaVirtual = paramCursor.getDouble(i);
        }
        else if (fEE == k)
        {
          this.field_fetchArriveTime = paramCursor.getLong(i);
        }
        else if (fEF == k)
        {
          this.field_fetchArriveTimeWording = paramCursor.getString(i);
        }
        else if (fEG == k)
        {
          this.field_repay_url = paramCursor.getString(i);
        }
        else if (fEH == k)
        {
          this.field_wxcreditState = paramCursor.getInt(i);
        }
        else if (fEI == k)
        {
          this.field_bankcardClientType = paramCursor.getInt(i);
        }
        else if (fEJ == k)
        {
          this.field_ext_msg = paramCursor.getString(i);
        }
        else
        {
          if (fEK == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_support_micropay = bool;
              break;
            }
          }
          if (fEL == k) {
            this.field_arrive_type = paramCursor.getString(i);
          } else if (fEM == k) {
            this.field_avail_save_wording = paramCursor.getString(i);
          } else if (fEN == k) {
            this.field_fetch_charge_rate = paramCursor.getDouble(i);
          } else if (fEO == k) {
            this.field_full_fetch_charge_fee = paramCursor.getDouble(i);
          } else if (fEP == k) {
            this.field_fetch_charge_info = paramCursor.getString(i);
          } else if (fvY == k) {
            this.field_tips = paramCursor.getString(i);
          } else if (fEQ == k) {
            this.field_forbid_title = paramCursor.getString(i);
          } else if (fER == k) {
            this.field_forbid_url = paramCursor.getString(i);
          } else if (fES == k) {
            this.field_no_micro_word = paramCursor.getString(i);
          } else if (fET == k) {
            this.field_card_bottom_wording = paramCursor.getString(i);
          } else if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4124510781440L, 30730);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4124644999168L, 30731);
    ContentValues localContentValues = new ContentValues();
    if (this.fDE) {
      localContentValues.put("bindSerial", this.field_bindSerial);
    }
    if (this.fDF) {
      localContentValues.put("cardType", Integer.valueOf(this.field_cardType));
    }
    if (this.fDG) {
      localContentValues.put("bankcardState", Integer.valueOf(this.field_bankcardState));
    }
    if (this.fDH) {
      localContentValues.put("forbidWord", this.field_forbidWord);
    }
    if (this.fDI) {
      localContentValues.put("bankName", this.field_bankName);
    }
    if (this.fDJ) {
      localContentValues.put("bankcardType", this.field_bankcardType);
    }
    if (this.fDK) {
      localContentValues.put("bankcardTypeName", this.field_bankcardTypeName);
    }
    if (this.fDL) {
      localContentValues.put("bankcardTag", Integer.valueOf(this.field_bankcardTag));
    }
    if (this.fDM) {
      localContentValues.put("bankcardTail", this.field_bankcardTail);
    }
    if (this.fDN) {
      localContentValues.put("supportTag", Integer.valueOf(this.field_supportTag));
    }
    if (this.fDO) {
      localContentValues.put("mobile", this.field_mobile);
    }
    if (this.fDP) {
      localContentValues.put("trueName", this.field_trueName);
    }
    if (this.fmD) {
      localContentValues.put("desc", this.field_desc);
    }
    if (this.fDQ) {
      localContentValues.put("bankPhone", this.field_bankPhone);
    }
    if (this.fDR) {
      localContentValues.put("bizUsername", this.field_bizUsername);
    }
    if (this.fDS) {
      localContentValues.put("onceQuotaKind", Double.valueOf(this.field_onceQuotaKind));
    }
    if (this.fDT) {
      localContentValues.put("onceQuotaVirtual", Double.valueOf(this.field_onceQuotaVirtual));
    }
    if (this.fDU) {
      localContentValues.put("dayQuotaKind", Double.valueOf(this.field_dayQuotaKind));
    }
    if (this.fDV) {
      localContentValues.put("dayQuotaVirtual", Double.valueOf(this.field_dayQuotaVirtual));
    }
    if (this.fDW) {
      localContentValues.put("fetchArriveTime", Long.valueOf(this.field_fetchArriveTime));
    }
    if (this.fDX) {
      localContentValues.put("fetchArriveTimeWording", this.field_fetchArriveTimeWording);
    }
    if (this.fDY) {
      localContentValues.put("repay_url", this.field_repay_url);
    }
    if (this.fDZ) {
      localContentValues.put("wxcreditState", Integer.valueOf(this.field_wxcreditState));
    }
    if (this.fEa) {
      localContentValues.put("bankcardClientType", Integer.valueOf(this.field_bankcardClientType));
    }
    if (this.fEb) {
      localContentValues.put("ext_msg", this.field_ext_msg);
    }
    if (this.fEc) {
      localContentValues.put("support_micropay", Boolean.valueOf(this.field_support_micropay));
    }
    if (this.fEd) {
      localContentValues.put("arrive_type", this.field_arrive_type);
    }
    if (this.fEe) {
      localContentValues.put("avail_save_wording", this.field_avail_save_wording);
    }
    if (this.fEf) {
      localContentValues.put("fetch_charge_rate", Double.valueOf(this.field_fetch_charge_rate));
    }
    if (this.fEg) {
      localContentValues.put("full_fetch_charge_fee", Double.valueOf(this.field_full_fetch_charge_fee));
    }
    if (this.fEh) {
      localContentValues.put("fetch_charge_info", this.field_fetch_charge_info);
    }
    if (this.fvS) {
      localContentValues.put("tips", this.field_tips);
    }
    if (this.fEi) {
      localContentValues.put("forbid_title", this.field_forbid_title);
    }
    if (this.fEj) {
      localContentValues.put("forbid_url", this.field_forbid_url);
    }
    if (this.fEk) {
      localContentValues.put("no_micro_word", this.field_no_micro_word);
    }
    if (this.fEl) {
      localContentValues.put("card_bottom_wording", this.field_card_bottom_wording);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4124644999168L, 30731);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\dm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */