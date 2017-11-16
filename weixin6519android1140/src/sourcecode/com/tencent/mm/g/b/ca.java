package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ca
  extends c
{
  private static final int eZC;
  private static final int eZI;
  private static final int eZT;
  private static final int eZU;
  private static final int eZV;
  public static final String[] eZt;
  private static final int fuI;
  private static final int fuJ;
  private static final int fuK;
  private static final int fuL;
  private static final int fuM;
  private static final int fuN;
  private static final int fuO;
  private static final int fuP;
  private static final int fuQ;
  private static final int fuR;
  private static final int fuS;
  private static final int fuT;
  private static final int fuU;
  private static final int fuV;
  private static final int fuW;
  private static final int fuX;
  private static final int fuY;
  private static final int fuZ;
  private static final int fva;
  private static final int fvb;
  private static final int fvc;
  private static final int fvd;
  private static final int fve;
  private static final int fvf;
  private static final int fvg;
  private static final int fvh;
  private static final int fvi;
  private static final int fvj;
  private static final int fvk;
  private static final int fvl;
  private static final int fvm;
  private static final int fvn;
  private static final int fvo;
  private static final int fvp;
  private static final int fvq;
  private static final int fvr;
  private static final int fvs;
  private static final int fvt;
  private static final int fvu;
  private static final int fvv;
  private static final int fvw;
  private boolean eZF;
  private boolean eZL;
  private boolean eZM;
  private boolean eZN;
  public int field_AllVer;
  public int field_BizType;
  public String field_Desc_cn;
  public String field_Desc_en;
  public String field_Desc_hk;
  public String field_Desc_tw;
  public String field_DetailURL;
  public String field_Icon;
  public String field_ImgUrl_android_cn;
  public String field_ImgUrl_android_en;
  public String field_ImgUrl_android_hk;
  public String field_ImgUrl_android_tw;
  public String field_ImgUrl_cn;
  public String field_ImgUrl_en;
  public String field_ImgUrl_hk;
  public String field_ImgUrl_tw;
  public String field_Introduce_cn;
  public String field_Introduce_en;
  public String field_Introduce_hk;
  public String field_Introduce_tw;
  public String field_LabsAppId;
  public int field_Pos;
  public int field_RedPoint;
  public int field_Switch;
  public String field_ThumbUrl_cn;
  public String field_ThumbUrl_en;
  public String field_ThumbUrl_hk;
  public String field_ThumbUrl_tw;
  public String field_TitleKey_android;
  public String field_Title_cn;
  public String field_Title_en;
  public String field_Title_hk;
  public String field_Title_tw;
  public int field_Type;
  public int field_WeAppDebugMode;
  public String field_WeAppPath;
  public String field_WeAppUser;
  public long field_endtime;
  public String field_expId;
  public int field_idkey;
  public int field_idkeyValue;
  public int field_prioritylevel;
  public long field_sequence;
  public long field_starttime;
  public int field_status;
  private boolean ftT;
  private boolean ftU;
  private boolean ftV;
  private boolean ftW;
  private boolean ftX;
  private boolean ftY;
  private boolean ftZ;
  private boolean fuA;
  private boolean fuB;
  private boolean fuC;
  private boolean fuD;
  private boolean fuE;
  private boolean fuF;
  private boolean fuG;
  private boolean fuH;
  private boolean fua;
  private boolean fub;
  private boolean fuc;
  private boolean fud;
  private boolean fue;
  private boolean fuf;
  private boolean fug;
  private boolean fuh;
  private boolean fui;
  private boolean fuj;
  private boolean fuk;
  private boolean ful;
  private boolean fum;
  private boolean fun;
  private boolean fuo;
  private boolean fup;
  private boolean fuq;
  private boolean fur;
  private boolean fus;
  private boolean fut;
  private boolean fuu;
  private boolean fuv;
  private boolean fuw;
  private boolean fux;
  private boolean fuy;
  private boolean fuz;
  
  static
  {
    GMTrace.i(15692334104576L, 116917);
    eZt = new String[0];
    fuI = "LabsAppId".hashCode();
    eZT = "expId".hashCode();
    fuJ = "Type".hashCode();
    fuK = "BizType".hashCode();
    fuL = "Switch".hashCode();
    fuM = "AllVer".hashCode();
    fuN = "DetailURL".hashCode();
    fuO = "WeAppUser".hashCode();
    fuP = "WeAppPath".hashCode();
    fuQ = "Pos".hashCode();
    fuR = "TitleKey_android".hashCode();
    fuS = "Title_cn".hashCode();
    fuT = "Title_hk".hashCode();
    fuU = "Title_tw".hashCode();
    fuV = "Title_en".hashCode();
    fuW = "Desc_cn".hashCode();
    fuX = "Desc_hk".hashCode();
    fuY = "Desc_tw".hashCode();
    fuZ = "Desc_en".hashCode();
    fva = "Introduce_cn".hashCode();
    fvb = "Introduce_hk".hashCode();
    fvc = "Introduce_tw".hashCode();
    fvd = "Introduce_en".hashCode();
    fve = "starttime".hashCode();
    fvf = "endtime".hashCode();
    eZU = "sequence".hashCode();
    eZV = "prioritylevel".hashCode();
    eZI = "status".hashCode();
    fvg = "ThumbUrl_cn".hashCode();
    fvh = "ThumbUrl_hk".hashCode();
    fvi = "ThumbUrl_tw".hashCode();
    fvj = "ThumbUrl_en".hashCode();
    fvk = "ImgUrl_android_cn".hashCode();
    fvl = "ImgUrl_android_hk".hashCode();
    fvm = "ImgUrl_android_tw".hashCode();
    fvn = "ImgUrl_android_en".hashCode();
    fvo = "RedPoint".hashCode();
    fvp = "WeAppDebugMode".hashCode();
    fvq = "idkey".hashCode();
    fvr = "idkeyValue".hashCode();
    fvs = "Icon".hashCode();
    fvt = "ImgUrl_cn".hashCode();
    fvu = "ImgUrl_hk".hashCode();
    fvv = "ImgUrl_tw".hashCode();
    fvw = "ImgUrl_en".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(15692334104576L, 116917);
  }
  
  public ca()
  {
    GMTrace.i(15691931451392L, 116914);
    this.ftT = true;
    this.eZL = true;
    this.ftU = true;
    this.ftV = true;
    this.ftW = true;
    this.ftX = true;
    this.ftY = true;
    this.ftZ = true;
    this.fua = true;
    this.fub = true;
    this.fuc = true;
    this.fud = true;
    this.fue = true;
    this.fuf = true;
    this.fug = true;
    this.fuh = true;
    this.fui = true;
    this.fuj = true;
    this.fuk = true;
    this.ful = true;
    this.fum = true;
    this.fun = true;
    this.fuo = true;
    this.fup = true;
    this.fuq = true;
    this.eZM = true;
    this.eZN = true;
    this.eZF = true;
    this.fur = true;
    this.fus = true;
    this.fut = true;
    this.fuu = true;
    this.fuv = true;
    this.fuw = true;
    this.fux = true;
    this.fuy = true;
    this.fuz = true;
    this.fuA = true;
    this.fuB = true;
    this.fuC = true;
    this.fuD = true;
    this.fuE = true;
    this.fuF = true;
    this.fuG = true;
    this.fuH = true;
    GMTrace.o(15691931451392L, 116914);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(15692065669120L, 116915);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(15692065669120L, 116915);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fuI == k)
      {
        this.field_LabsAppId = paramCursor.getString(i);
        this.ftT = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (eZT == k) {
          this.field_expId = paramCursor.getString(i);
        } else if (fuJ == k) {
          this.field_Type = paramCursor.getInt(i);
        } else if (fuK == k) {
          this.field_BizType = paramCursor.getInt(i);
        } else if (fuL == k) {
          this.field_Switch = paramCursor.getInt(i);
        } else if (fuM == k) {
          this.field_AllVer = paramCursor.getInt(i);
        } else if (fuN == k) {
          this.field_DetailURL = paramCursor.getString(i);
        } else if (fuO == k) {
          this.field_WeAppUser = paramCursor.getString(i);
        } else if (fuP == k) {
          this.field_WeAppPath = paramCursor.getString(i);
        } else if (fuQ == k) {
          this.field_Pos = paramCursor.getInt(i);
        } else if (fuR == k) {
          this.field_TitleKey_android = paramCursor.getString(i);
        } else if (fuS == k) {
          this.field_Title_cn = paramCursor.getString(i);
        } else if (fuT == k) {
          this.field_Title_hk = paramCursor.getString(i);
        } else if (fuU == k) {
          this.field_Title_tw = paramCursor.getString(i);
        } else if (fuV == k) {
          this.field_Title_en = paramCursor.getString(i);
        } else if (fuW == k) {
          this.field_Desc_cn = paramCursor.getString(i);
        } else if (fuX == k) {
          this.field_Desc_hk = paramCursor.getString(i);
        } else if (fuY == k) {
          this.field_Desc_tw = paramCursor.getString(i);
        } else if (fuZ == k) {
          this.field_Desc_en = paramCursor.getString(i);
        } else if (fva == k) {
          this.field_Introduce_cn = paramCursor.getString(i);
        } else if (fvb == k) {
          this.field_Introduce_hk = paramCursor.getString(i);
        } else if (fvc == k) {
          this.field_Introduce_tw = paramCursor.getString(i);
        } else if (fvd == k) {
          this.field_Introduce_en = paramCursor.getString(i);
        } else if (fve == k) {
          this.field_starttime = paramCursor.getLong(i);
        } else if (fvf == k) {
          this.field_endtime = paramCursor.getLong(i);
        } else if (eZU == k) {
          this.field_sequence = paramCursor.getLong(i);
        } else if (eZV == k) {
          this.field_prioritylevel = paramCursor.getInt(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (fvg == k) {
          this.field_ThumbUrl_cn = paramCursor.getString(i);
        } else if (fvh == k) {
          this.field_ThumbUrl_hk = paramCursor.getString(i);
        } else if (fvi == k) {
          this.field_ThumbUrl_tw = paramCursor.getString(i);
        } else if (fvj == k) {
          this.field_ThumbUrl_en = paramCursor.getString(i);
        } else if (fvk == k) {
          this.field_ImgUrl_android_cn = paramCursor.getString(i);
        } else if (fvl == k) {
          this.field_ImgUrl_android_hk = paramCursor.getString(i);
        } else if (fvm == k) {
          this.field_ImgUrl_android_tw = paramCursor.getString(i);
        } else if (fvn == k) {
          this.field_ImgUrl_android_en = paramCursor.getString(i);
        } else if (fvo == k) {
          this.field_RedPoint = paramCursor.getInt(i);
        } else if (fvp == k) {
          this.field_WeAppDebugMode = paramCursor.getInt(i);
        } else if (fvq == k) {
          this.field_idkey = paramCursor.getInt(i);
        } else if (fvr == k) {
          this.field_idkeyValue = paramCursor.getInt(i);
        } else if (fvs == k) {
          this.field_Icon = paramCursor.getString(i);
        } else if (fvt == k) {
          this.field_ImgUrl_cn = paramCursor.getString(i);
        } else if (fvu == k) {
          this.field_ImgUrl_hk = paramCursor.getString(i);
        } else if (fvv == k) {
          this.field_ImgUrl_tw = paramCursor.getString(i);
        } else if (fvw == k) {
          this.field_ImgUrl_en = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(15692065669120L, 116915);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(15692199886848L, 116916);
    ContentValues localContentValues = new ContentValues();
    if (this.ftT) {
      localContentValues.put("LabsAppId", this.field_LabsAppId);
    }
    if (this.field_expId == null) {
      this.field_expId = "";
    }
    if (this.eZL) {
      localContentValues.put("expId", this.field_expId);
    }
    if (this.ftU) {
      localContentValues.put("Type", Integer.valueOf(this.field_Type));
    }
    if (this.ftV) {
      localContentValues.put("BizType", Integer.valueOf(this.field_BizType));
    }
    if (this.ftW) {
      localContentValues.put("Switch", Integer.valueOf(this.field_Switch));
    }
    if (this.ftX) {
      localContentValues.put("AllVer", Integer.valueOf(this.field_AllVer));
    }
    if (this.ftY) {
      localContentValues.put("DetailURL", this.field_DetailURL);
    }
    if (this.ftZ) {
      localContentValues.put("WeAppUser", this.field_WeAppUser);
    }
    if (this.fua) {
      localContentValues.put("WeAppPath", this.field_WeAppPath);
    }
    if (this.fub) {
      localContentValues.put("Pos", Integer.valueOf(this.field_Pos));
    }
    if (this.fuc) {
      localContentValues.put("TitleKey_android", this.field_TitleKey_android);
    }
    if (this.fud) {
      localContentValues.put("Title_cn", this.field_Title_cn);
    }
    if (this.fue) {
      localContentValues.put("Title_hk", this.field_Title_hk);
    }
    if (this.fuf) {
      localContentValues.put("Title_tw", this.field_Title_tw);
    }
    if (this.fug) {
      localContentValues.put("Title_en", this.field_Title_en);
    }
    if (this.fuh) {
      localContentValues.put("Desc_cn", this.field_Desc_cn);
    }
    if (this.fui) {
      localContentValues.put("Desc_hk", this.field_Desc_hk);
    }
    if (this.fuj) {
      localContentValues.put("Desc_tw", this.field_Desc_tw);
    }
    if (this.fuk) {
      localContentValues.put("Desc_en", this.field_Desc_en);
    }
    if (this.ful) {
      localContentValues.put("Introduce_cn", this.field_Introduce_cn);
    }
    if (this.fum) {
      localContentValues.put("Introduce_hk", this.field_Introduce_hk);
    }
    if (this.fun) {
      localContentValues.put("Introduce_tw", this.field_Introduce_tw);
    }
    if (this.fuo) {
      localContentValues.put("Introduce_en", this.field_Introduce_en);
    }
    if (this.fup) {
      localContentValues.put("starttime", Long.valueOf(this.field_starttime));
    }
    if (this.fuq) {
      localContentValues.put("endtime", Long.valueOf(this.field_endtime));
    }
    if (this.eZM) {
      localContentValues.put("sequence", Long.valueOf(this.field_sequence));
    }
    if (this.eZN) {
      localContentValues.put("prioritylevel", Integer.valueOf(this.field_prioritylevel));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fur) {
      localContentValues.put("ThumbUrl_cn", this.field_ThumbUrl_cn);
    }
    if (this.fus) {
      localContentValues.put("ThumbUrl_hk", this.field_ThumbUrl_hk);
    }
    if (this.fut) {
      localContentValues.put("ThumbUrl_tw", this.field_ThumbUrl_tw);
    }
    if (this.fuu) {
      localContentValues.put("ThumbUrl_en", this.field_ThumbUrl_en);
    }
    if (this.fuv) {
      localContentValues.put("ImgUrl_android_cn", this.field_ImgUrl_android_cn);
    }
    if (this.fuw) {
      localContentValues.put("ImgUrl_android_hk", this.field_ImgUrl_android_hk);
    }
    if (this.fux) {
      localContentValues.put("ImgUrl_android_tw", this.field_ImgUrl_android_tw);
    }
    if (this.fuy) {
      localContentValues.put("ImgUrl_android_en", this.field_ImgUrl_android_en);
    }
    if (this.fuz) {
      localContentValues.put("RedPoint", Integer.valueOf(this.field_RedPoint));
    }
    if (this.fuA) {
      localContentValues.put("WeAppDebugMode", Integer.valueOf(this.field_WeAppDebugMode));
    }
    if (this.fuB) {
      localContentValues.put("idkey", Integer.valueOf(this.field_idkey));
    }
    if (this.fuC) {
      localContentValues.put("idkeyValue", Integer.valueOf(this.field_idkeyValue));
    }
    if (this.fuD) {
      localContentValues.put("Icon", this.field_Icon);
    }
    if (this.fuE) {
      localContentValues.put("ImgUrl_cn", this.field_ImgUrl_cn);
    }
    if (this.fuF) {
      localContentValues.put("ImgUrl_hk", this.field_ImgUrl_hk);
    }
    if (this.fuG) {
      localContentValues.put("ImgUrl_tw", this.field_ImgUrl_tw);
    }
    if (this.fuH) {
      localContentValues.put("ImgUrl_en", this.field_ImgUrl_en);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(15692199886848L, 116916);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */