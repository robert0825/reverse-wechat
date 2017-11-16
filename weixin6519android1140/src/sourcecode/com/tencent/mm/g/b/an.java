package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class an
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int faJ;
  private static final int fer;
  private static final int flA;
  private static final int flB;
  private static final int flC;
  private static final int flD;
  private static final int fle;
  private static final int flf;
  private static final int flg;
  private static final int flh;
  private static final int fli;
  private static final int flj;
  private static final int flk;
  private static final int fll;
  private static final int flm;
  private static final int fln;
  private static final int flo;
  private static final int flp;
  private static final int flq;
  private static final int flr;
  private static final int fls;
  private static final int flt;
  private static final int flu;
  private static final int flv;
  private static final int flw;
  private static final int flx;
  private static final int fly;
  private static final int flz;
  private boolean eZF;
  private boolean fan;
  private boolean fep;
  public String field_BigIconUrl;
  public String field_MutiLanName;
  public int field_buttonType;
  public int field_count;
  public int field_flag;
  public int field_idx;
  public String field_lang;
  public long field_lastUseTime;
  public String field_packAuthInfo;
  public String field_packCopyright;
  public String field_packCoverUrl;
  public String field_packDesc;
  public long field_packExpire;
  public int field_packFlag;
  public String field_packGrayIconUrl;
  public String field_packIconUrl;
  public String field_packName;
  public String field_packPrice;
  public int field_packStatus;
  public long field_packTimeStamp;
  public int field_packType;
  public String field_productID;
  public int field_recommand;
  public int field_recommandType;
  public String field_recommandWord;
  public int field_sort;
  public int field_status;
  public int field_sync;
  public int field_type;
  private boolean fkE;
  private boolean fkF;
  private boolean fkG;
  private boolean fkH;
  private boolean fkI;
  private boolean fkJ;
  private boolean fkK;
  private boolean fkL;
  private boolean fkM;
  private boolean fkN;
  private boolean fkO;
  private boolean fkP;
  private boolean fkQ;
  private boolean fkR;
  private boolean fkS;
  private boolean fkT;
  private boolean fkU;
  private boolean fkV;
  private boolean fkW;
  private boolean fkX;
  private boolean fkY;
  private boolean fkZ;
  private boolean fla;
  private boolean flb;
  private boolean flc;
  private boolean fld;
  
  static
  {
    GMTrace.i(4174976647168L, 31106);
    eZt = new String[0];
    fle = "productID".hashCode();
    flf = "packIconUrl".hashCode();
    flg = "packGrayIconUrl".hashCode();
    flh = "packCoverUrl".hashCode();
    fli = "packName".hashCode();
    flj = "packDesc".hashCode();
    flk = "packAuthInfo".hashCode();
    fll = "packPrice".hashCode();
    flm = "packType".hashCode();
    fln = "packFlag".hashCode();
    flo = "packExpire".hashCode();
    flp = "packTimeStamp".hashCode();
    flq = "packCopyright".hashCode();
    faJ = "type".hashCode();
    eZI = "status".hashCode();
    flr = "sort".hashCode();
    fls = "lastUseTime".hashCode();
    flt = "packStatus".hashCode();
    fer = "flag".hashCode();
    flu = "recommand".hashCode();
    flv = "sync".hashCode();
    flw = "idx".hashCode();
    flx = "BigIconUrl".hashCode();
    fly = "MutiLanName".hashCode();
    flz = "recommandType".hashCode();
    flA = "lang".hashCode();
    flB = "recommandWord".hashCode();
    flC = "buttonType".hashCode();
    flD = "count".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4174976647168L, 31106);
  }
  
  public an()
  {
    GMTrace.i(4174573993984L, 31103);
    this.fkE = true;
    this.fkF = true;
    this.fkG = true;
    this.fkH = true;
    this.fkI = true;
    this.fkJ = true;
    this.fkK = true;
    this.fkL = true;
    this.fkM = true;
    this.fkN = true;
    this.fkO = true;
    this.fkP = true;
    this.fkQ = true;
    this.fan = true;
    this.eZF = true;
    this.fkR = true;
    this.fkS = true;
    this.fkT = true;
    this.fep = true;
    this.fkU = true;
    this.fkV = true;
    this.fkW = true;
    this.fkX = true;
    this.fkY = true;
    this.fkZ = true;
    this.fla = true;
    this.flb = true;
    this.flc = true;
    this.fld = true;
    GMTrace.o(4174573993984L, 31103);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4174708211712L, 31104);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4174708211712L, 31104);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fle == k)
      {
        this.field_productID = paramCursor.getString(i);
        this.fkE = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (flf == k) {
          this.field_packIconUrl = paramCursor.getString(i);
        } else if (flg == k) {
          this.field_packGrayIconUrl = paramCursor.getString(i);
        } else if (flh == k) {
          this.field_packCoverUrl = paramCursor.getString(i);
        } else if (fli == k) {
          this.field_packName = paramCursor.getString(i);
        } else if (flj == k) {
          this.field_packDesc = paramCursor.getString(i);
        } else if (flk == k) {
          this.field_packAuthInfo = paramCursor.getString(i);
        } else if (fll == k) {
          this.field_packPrice = paramCursor.getString(i);
        } else if (flm == k) {
          this.field_packType = paramCursor.getInt(i);
        } else if (fln == k) {
          this.field_packFlag = paramCursor.getInt(i);
        } else if (flo == k) {
          this.field_packExpire = paramCursor.getLong(i);
        } else if (flp == k) {
          this.field_packTimeStamp = paramCursor.getLong(i);
        } else if (flq == k) {
          this.field_packCopyright = paramCursor.getString(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (flr == k) {
          this.field_sort = paramCursor.getInt(i);
        } else if (fls == k) {
          this.field_lastUseTime = paramCursor.getLong(i);
        } else if (flt == k) {
          this.field_packStatus = paramCursor.getInt(i);
        } else if (fer == k) {
          this.field_flag = paramCursor.getInt(i);
        } else if (flu == k) {
          this.field_recommand = paramCursor.getInt(i);
        } else if (flv == k) {
          this.field_sync = paramCursor.getInt(i);
        } else if (flw == k) {
          this.field_idx = paramCursor.getInt(i);
        } else if (flx == k) {
          this.field_BigIconUrl = paramCursor.getString(i);
        } else if (fly == k) {
          this.field_MutiLanName = paramCursor.getString(i);
        } else if (flz == k) {
          this.field_recommandType = paramCursor.getInt(i);
        } else if (flA == k) {
          this.field_lang = paramCursor.getString(i);
        } else if (flB == k) {
          this.field_recommandWord = paramCursor.getString(i);
        } else if (flC == k) {
          this.field_buttonType = paramCursor.getInt(i);
        } else if (flD == k) {
          this.field_count = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4174708211712L, 31104);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4174842429440L, 31105);
    ContentValues localContentValues = new ContentValues();
    if (this.fkE) {
      localContentValues.put("productID", this.field_productID);
    }
    if (this.fkF) {
      localContentValues.put("packIconUrl", this.field_packIconUrl);
    }
    if (this.fkG) {
      localContentValues.put("packGrayIconUrl", this.field_packGrayIconUrl);
    }
    if (this.fkH) {
      localContentValues.put("packCoverUrl", this.field_packCoverUrl);
    }
    if (this.fkI) {
      localContentValues.put("packName", this.field_packName);
    }
    if (this.fkJ) {
      localContentValues.put("packDesc", this.field_packDesc);
    }
    if (this.fkK) {
      localContentValues.put("packAuthInfo", this.field_packAuthInfo);
    }
    if (this.fkL) {
      localContentValues.put("packPrice", this.field_packPrice);
    }
    if (this.fkM) {
      localContentValues.put("packType", Integer.valueOf(this.field_packType));
    }
    if (this.fkN) {
      localContentValues.put("packFlag", Integer.valueOf(this.field_packFlag));
    }
    if (this.fkO) {
      localContentValues.put("packExpire", Long.valueOf(this.field_packExpire));
    }
    if (this.fkP) {
      localContentValues.put("packTimeStamp", Long.valueOf(this.field_packTimeStamp));
    }
    if (this.fkQ) {
      localContentValues.put("packCopyright", this.field_packCopyright);
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fkR) {
      localContentValues.put("sort", Integer.valueOf(this.field_sort));
    }
    if (this.fkS) {
      localContentValues.put("lastUseTime", Long.valueOf(this.field_lastUseTime));
    }
    if (this.fkT) {
      localContentValues.put("packStatus", Integer.valueOf(this.field_packStatus));
    }
    if (this.fep) {
      localContentValues.put("flag", Integer.valueOf(this.field_flag));
    }
    if (this.fkU) {
      localContentValues.put("recommand", Integer.valueOf(this.field_recommand));
    }
    if (this.fkV) {
      localContentValues.put("sync", Integer.valueOf(this.field_sync));
    }
    if (this.fkW) {
      localContentValues.put("idx", Integer.valueOf(this.field_idx));
    }
    if (this.fkX) {
      localContentValues.put("BigIconUrl", this.field_BigIconUrl);
    }
    if (this.fkY) {
      localContentValues.put("MutiLanName", this.field_MutiLanName);
    }
    if (this.fkZ) {
      localContentValues.put("recommandType", Integer.valueOf(this.field_recommandType));
    }
    if (this.fla) {
      localContentValues.put("lang", this.field_lang);
    }
    if (this.flb) {
      localContentValues.put("recommandWord", this.field_recommandWord);
    }
    if (this.flc) {
      localContentValues.put("buttonType", Integer.valueOf(this.field_buttonType));
    }
    if (this.fld) {
      localContentValues.put("count", Integer.valueOf(this.field_count));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4174842429440L, 31105);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */