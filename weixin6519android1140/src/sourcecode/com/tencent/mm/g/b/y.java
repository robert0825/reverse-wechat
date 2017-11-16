package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class y
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int faJ;
  private static final int fbu;
  private static final int fca;
  private static final int fcc;
  private static final int fcx;
  private static final int ffw;
  private static final int fgk;
  private static final int fgl;
  private static final int fgm;
  private static final int fgn;
  private static final int fgo;
  private static final int fgp;
  private static final int fgq;
  private static final int fgr;
  private static final int fgs;
  private static final int fgt;
  private static final int fgu;
  private static final int fgv;
  private static final int fgw;
  private boolean eZF;
  private boolean fan;
  private boolean fbW;
  private boolean fbd;
  private boolean fcb;
  private boolean fck;
  private boolean ffX;
  private boolean ffY;
  private boolean ffZ;
  private boolean ffk;
  private boolean fga;
  private boolean fgb;
  private boolean fgc;
  private boolean fgd;
  private boolean fge;
  private boolean fgf;
  private boolean fgg;
  private boolean fgh;
  private boolean fgi;
  private boolean fgj;
  public int field_acceptType;
  public String field_appId;
  public String field_attrSyncVersion;
  public int field_bitFlag;
  public int field_brandFlag;
  public String field_brandIconURL;
  public String field_brandInfo;
  public String field_brandList;
  public String field_brandListContent;
  public String field_brandListVersion;
  public String field_enterpriseFather;
  public String field_extInfo;
  public int field_hadAlert;
  public long field_incrementUpdateTime;
  public String field_kfWorkerId;
  public int field_specialType;
  public int field_status;
  public int field_type;
  public long field_updateTime;
  public String field_username;
  
  static
  {
    GMTrace.i(4117397241856L, 30677);
    eZt = new String[0];
    fcc = "username".hashCode();
    fbu = "appId".hashCode();
    fgk = "brandList".hashCode();
    fgl = "brandListVersion".hashCode();
    fgm = "brandListContent".hashCode();
    fcx = "brandFlag".hashCode();
    fgn = "extInfo".hashCode();
    fgo = "brandInfo".hashCode();
    fgp = "brandIconURL".hashCode();
    fca = "updateTime".hashCode();
    fgq = "hadAlert".hashCode();
    fgr = "acceptType".hashCode();
    faJ = "type".hashCode();
    eZI = "status".hashCode();
    fgs = "enterpriseFather".hashCode();
    fgt = "kfWorkerId".hashCode();
    fgu = "specialType".hashCode();
    fgv = "attrSyncVersion".hashCode();
    fgw = "incrementUpdateTime".hashCode();
    ffw = "bitFlag".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4117397241856L, 30677);
  }
  
  public y()
  {
    GMTrace.i(4116994588672L, 30674);
    this.fcb = true;
    this.fbd = true;
    this.ffX = true;
    this.ffY = true;
    this.ffZ = true;
    this.fck = true;
    this.fga = true;
    this.fgb = true;
    this.fgc = true;
    this.fbW = true;
    this.fgd = true;
    this.fge = true;
    this.fan = true;
    this.eZF = true;
    this.fgf = true;
    this.fgg = true;
    this.fgh = true;
    this.fgi = true;
    this.fgj = true;
    this.ffk = true;
    GMTrace.o(4116994588672L, 30674);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4117128806400L, 30675);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4117128806400L, 30675);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fcc == k)
      {
        this.field_username = paramCursor.getString(i);
        this.fcb = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fbu == k) {
          this.field_appId = paramCursor.getString(i);
        } else if (fgk == k) {
          this.field_brandList = paramCursor.getString(i);
        } else if (fgl == k) {
          this.field_brandListVersion = paramCursor.getString(i);
        } else if (fgm == k) {
          this.field_brandListContent = paramCursor.getString(i);
        } else if (fcx == k) {
          this.field_brandFlag = paramCursor.getInt(i);
        } else if (fgn == k) {
          this.field_extInfo = paramCursor.getString(i);
        } else if (fgo == k) {
          this.field_brandInfo = paramCursor.getString(i);
        } else if (fgp == k) {
          this.field_brandIconURL = paramCursor.getString(i);
        } else if (fca == k) {
          this.field_updateTime = paramCursor.getLong(i);
        } else if (fgq == k) {
          this.field_hadAlert = paramCursor.getInt(i);
        } else if (fgr == k) {
          this.field_acceptType = paramCursor.getInt(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (fgs == k) {
          this.field_enterpriseFather = paramCursor.getString(i);
        } else if (fgt == k) {
          this.field_kfWorkerId = paramCursor.getString(i);
        } else if (fgu == k) {
          this.field_specialType = paramCursor.getInt(i);
        } else if (fgv == k) {
          this.field_attrSyncVersion = paramCursor.getString(i);
        } else if (fgw == k) {
          this.field_incrementUpdateTime = paramCursor.getLong(i);
        } else if (ffw == k) {
          this.field_bitFlag = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4117128806400L, 30675);
  }
  
  public ContentValues qL()
  {
    GMTrace.i(4117263024128L, 30676);
    ContentValues localContentValues = new ContentValues();
    if (this.fcb) {
      localContentValues.put("username", this.field_username);
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.field_brandList == null) {
      this.field_brandList = "";
    }
    if (this.ffX) {
      localContentValues.put("brandList", this.field_brandList);
    }
    if (this.ffY) {
      localContentValues.put("brandListVersion", this.field_brandListVersion);
    }
    if (this.ffZ) {
      localContentValues.put("brandListContent", this.field_brandListContent);
    }
    if (this.fck) {
      localContentValues.put("brandFlag", Integer.valueOf(this.field_brandFlag));
    }
    if (this.fga) {
      localContentValues.put("extInfo", this.field_extInfo);
    }
    if (this.fgb) {
      localContentValues.put("brandInfo", this.field_brandInfo);
    }
    if (this.fgc) {
      localContentValues.put("brandIconURL", this.field_brandIconURL);
    }
    if (this.fbW) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.fgd) {
      localContentValues.put("hadAlert", Integer.valueOf(this.field_hadAlert));
    }
    if (this.fge) {
      localContentValues.put("acceptType", Integer.valueOf(this.field_acceptType));
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fgf) {
      localContentValues.put("enterpriseFather", this.field_enterpriseFather);
    }
    if (this.fgg) {
      localContentValues.put("kfWorkerId", this.field_kfWorkerId);
    }
    if (this.fgh) {
      localContentValues.put("specialType", Integer.valueOf(this.field_specialType));
    }
    if (this.fgi) {
      localContentValues.put("attrSyncVersion", this.field_attrSyncVersion);
    }
    if (this.fgj) {
      localContentValues.put("incrementUpdateTime", Long.valueOf(this.field_incrementUpdateTime));
    }
    if (this.ffk) {
      localContentValues.put("bitFlag", Integer.valueOf(this.field_bitFlag));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4117263024128L, 30676);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */