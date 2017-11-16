package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cu
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fAA;
  private static final int fAB;
  private static final int fAr;
  private static final int fAs;
  private static final int fAt;
  private static final int fAu;
  private static final int fAv;
  private static final int fAw;
  private static final int fAx;
  private static final int fAy;
  private static final int fAz;
  private static final int faJ;
  private static final int fbI;
  private static final int fcc;
  private static final int fgD;
  private static final int fmj;
  private static final int fmk;
  private static final int fml;
  private static final int fmm;
  private static final int fsA;
  private boolean fAg;
  private boolean fAh;
  private boolean fAi;
  private boolean fAj;
  private boolean fAk;
  private boolean fAl;
  private boolean fAm;
  private boolean fAn;
  private boolean fAo;
  private boolean fAp;
  private boolean fAq;
  private boolean fan;
  private boolean fbr;
  private boolean fcb;
  private boolean fgz;
  public String field_city;
  public String field_distance;
  public int field_hasHDImg;
  public int field_imgstatus;
  public int field_insertBatch;
  public byte[] field_lvbuffer;
  public String field_nickname;
  public String field_province;
  public String field_regionCode;
  public int field_reserved1;
  public int field_reserved2;
  public String field_reserved3;
  public String field_reserved4;
  public int field_sex;
  public int field_shakeItemID;
  public String field_signature;
  public int field_snsFlag;
  public String field_sns_bgurl;
  public int field_type;
  public String field_username;
  private boolean flK;
  private boolean flL;
  private boolean flM;
  private boolean flN;
  private boolean fso;
  
  static
  {
    GMTrace.i(4150146367488L, 30921);
    eZt = new String[0];
    fAr = "shakeItemID".hashCode();
    fcc = "username".hashCode();
    fgD = "nickname".hashCode();
    fAs = "province".hashCode();
    fAt = "city".hashCode();
    fbI = "signature".hashCode();
    fAu = "distance".hashCode();
    fAv = "sex".hashCode();
    fAw = "imgstatus".hashCode();
    fAx = "hasHDImg".hashCode();
    fAy = "insertBatch".hashCode();
    fmj = "reserved1".hashCode();
    fmk = "reserved2".hashCode();
    fml = "reserved3".hashCode();
    fmm = "reserved4".hashCode();
    faJ = "type".hashCode();
    fsA = "lvbuffer".hashCode();
    fAz = "regionCode".hashCode();
    fAA = "snsFlag".hashCode();
    fAB = "sns_bgurl".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4150146367488L, 30921);
  }
  
  public cu()
  {
    GMTrace.i(4149743714304L, 30918);
    this.fAg = true;
    this.fcb = true;
    this.fgz = true;
    this.fAh = true;
    this.fAi = true;
    this.fbr = true;
    this.fAj = true;
    this.fAk = true;
    this.fAl = true;
    this.fAm = true;
    this.fAn = true;
    this.flK = true;
    this.flL = true;
    this.flM = true;
    this.flN = true;
    this.fan = true;
    this.fso = true;
    this.fAo = true;
    this.fAp = true;
    this.fAq = true;
    GMTrace.o(4149743714304L, 30918);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4149877932032L, 30919);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4149877932032L, 30919);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fAr == k)
      {
        this.field_shakeItemID = paramCursor.getInt(i);
        this.fAg = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fcc == k) {
          this.field_username = paramCursor.getString(i);
        } else if (fgD == k) {
          this.field_nickname = paramCursor.getString(i);
        } else if (fAs == k) {
          this.field_province = paramCursor.getString(i);
        } else if (fAt == k) {
          this.field_city = paramCursor.getString(i);
        } else if (fbI == k) {
          this.field_signature = paramCursor.getString(i);
        } else if (fAu == k) {
          this.field_distance = paramCursor.getString(i);
        } else if (fAv == k) {
          this.field_sex = paramCursor.getInt(i);
        } else if (fAw == k) {
          this.field_imgstatus = paramCursor.getInt(i);
        } else if (fAx == k) {
          this.field_hasHDImg = paramCursor.getInt(i);
        } else if (fAy == k) {
          this.field_insertBatch = paramCursor.getInt(i);
        } else if (fmj == k) {
          this.field_reserved1 = paramCursor.getInt(i);
        } else if (fmk == k) {
          this.field_reserved2 = paramCursor.getInt(i);
        } else if (fml == k) {
          this.field_reserved3 = paramCursor.getString(i);
        } else if (fmm == k) {
          this.field_reserved4 = paramCursor.getString(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (fsA == k) {
          this.field_lvbuffer = paramCursor.getBlob(i);
        } else if (fAz == k) {
          this.field_regionCode = paramCursor.getString(i);
        } else if (fAA == k) {
          this.field_snsFlag = paramCursor.getInt(i);
        } else if (fAB == k) {
          this.field_sns_bgurl = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4149877932032L, 30919);
  }
  
  public ContentValues qL()
  {
    GMTrace.i(4150012149760L, 30920);
    ContentValues localContentValues = new ContentValues();
    if (this.fAg) {
      localContentValues.put("shakeItemID", Integer.valueOf(this.field_shakeItemID));
    }
    if (this.fcb) {
      localContentValues.put("username", this.field_username);
    }
    if (this.fgz) {
      localContentValues.put("nickname", this.field_nickname);
    }
    if (this.fAh) {
      localContentValues.put("province", this.field_province);
    }
    if (this.fAi) {
      localContentValues.put("city", this.field_city);
    }
    if (this.fbr) {
      localContentValues.put("signature", this.field_signature);
    }
    if (this.fAj) {
      localContentValues.put("distance", this.field_distance);
    }
    if (this.fAk) {
      localContentValues.put("sex", Integer.valueOf(this.field_sex));
    }
    if (this.fAl) {
      localContentValues.put("imgstatus", Integer.valueOf(this.field_imgstatus));
    }
    if (this.fAm) {
      localContentValues.put("hasHDImg", Integer.valueOf(this.field_hasHDImg));
    }
    if (this.fAn) {
      localContentValues.put("insertBatch", Integer.valueOf(this.field_insertBatch));
    }
    if (this.flK) {
      localContentValues.put("reserved1", Integer.valueOf(this.field_reserved1));
    }
    if (this.flL) {
      localContentValues.put("reserved2", Integer.valueOf(this.field_reserved2));
    }
    if (this.flM) {
      localContentValues.put("reserved3", this.field_reserved3);
    }
    if (this.flN) {
      localContentValues.put("reserved4", this.field_reserved4);
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.fso) {
      localContentValues.put("lvbuffer", this.field_lvbuffer);
    }
    if (this.fAo) {
      localContentValues.put("regionCode", this.field_regionCode);
    }
    if (this.fAp) {
      localContentValues.put("snsFlag", Integer.valueOf(this.field_snsFlag));
    }
    if (this.fAq) {
      localContentValues.put("sns_bgurl", this.field_sns_bgurl);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4150012149760L, 30920);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */