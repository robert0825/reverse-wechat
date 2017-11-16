package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dc
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fCk;
  private static final int fCl;
  private static final int fCm;
  private static final int fCn;
  private static final int fCo;
  private static final int fCp;
  private static final int fCq;
  private static final int fCr;
  private static final int fCs;
  private static final int fCt;
  private static final int fCu;
  private static final int fCv;
  private static final int fCw;
  private static final int fCx;
  private static final int faE;
  private static final int fmd;
  private boolean fBW;
  private boolean fBX;
  private boolean fBY;
  private boolean fBZ;
  private boolean fCa;
  private boolean fCb;
  private boolean fCc;
  private boolean fCd;
  private boolean fCe;
  private boolean fCf;
  private boolean fCg;
  private boolean fCh;
  private boolean fCi;
  private boolean fCj;
  private boolean fai;
  public byte[] field_adsession;
  public String field_bgId;
  public String field_bgUrl;
  public byte[] field_faultS;
  public int field_iFlag;
  public int field_icount;
  public int field_istyle;
  public int field_lastFirstPageRequestErrCode;
  public int field_lastFirstPageRequestErrType;
  public int field_local_flag;
  public String field_md5;
  public String field_newerIds;
  public String field_older_bgId;
  public long field_snsBgId;
  public byte[] field_snsuser;
  public String field_userName;
  private boolean flE;
  
  static
  {
    GMTrace.i(4126926700544L, 30748);
    eZt = new String[0];
    faE = "userName".hashCode();
    fmd = "md5".hashCode();
    fCk = "newerIds".hashCode();
    fCl = "bgId".hashCode();
    fCm = "bgUrl".hashCode();
    fCn = "older_bgId".hashCode();
    fCo = "local_flag".hashCode();
    fCp = "istyle".hashCode();
    fCq = "iFlag".hashCode();
    fCr = "icount".hashCode();
    fCs = "faultS".hashCode();
    fCt = "snsBgId".hashCode();
    fCu = "snsuser".hashCode();
    fCv = "adsession".hashCode();
    fCw = "lastFirstPageRequestErrCode".hashCode();
    fCx = "lastFirstPageRequestErrType".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4126926700544L, 30748);
  }
  
  public dc()
  {
    GMTrace.i(4126524047360L, 30745);
    this.fai = true;
    this.flE = true;
    this.fBW = true;
    this.fBX = true;
    this.fBY = true;
    this.fBZ = true;
    this.fCa = true;
    this.fCb = true;
    this.fCc = true;
    this.fCd = true;
    this.fCe = true;
    this.fCf = true;
    this.fCg = true;
    this.fCh = true;
    this.fCi = true;
    this.fCj = true;
    GMTrace.o(4126524047360L, 30745);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4126658265088L, 30746);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4126658265088L, 30746);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (faE == k)
      {
        this.field_userName = paramCursor.getString(i);
        this.fai = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fmd == k) {
          this.field_md5 = paramCursor.getString(i);
        } else if (fCk == k) {
          this.field_newerIds = paramCursor.getString(i);
        } else if (fCl == k) {
          this.field_bgId = paramCursor.getString(i);
        } else if (fCm == k) {
          this.field_bgUrl = paramCursor.getString(i);
        } else if (fCn == k) {
          this.field_older_bgId = paramCursor.getString(i);
        } else if (fCo == k) {
          this.field_local_flag = paramCursor.getInt(i);
        } else if (fCp == k) {
          this.field_istyle = paramCursor.getInt(i);
        } else if (fCq == k) {
          this.field_iFlag = paramCursor.getInt(i);
        } else if (fCr == k) {
          this.field_icount = paramCursor.getInt(i);
        } else if (fCs == k) {
          this.field_faultS = paramCursor.getBlob(i);
        } else if (fCt == k) {
          this.field_snsBgId = paramCursor.getLong(i);
        } else if (fCu == k) {
          this.field_snsuser = paramCursor.getBlob(i);
        } else if (fCv == k) {
          this.field_adsession = paramCursor.getBlob(i);
        } else if (fCw == k) {
          this.field_lastFirstPageRequestErrCode = paramCursor.getInt(i);
        } else if (fCx == k) {
          this.field_lastFirstPageRequestErrType = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4126658265088L, 30746);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4126792482816L, 30747);
    ContentValues localContentValues = new ContentValues();
    if (this.field_userName == null) {
      this.field_userName = "";
    }
    if (this.fai) {
      localContentValues.put("userName", this.field_userName);
    }
    if (this.flE) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.fBW) {
      localContentValues.put("newerIds", this.field_newerIds);
    }
    if (this.fBX) {
      localContentValues.put("bgId", this.field_bgId);
    }
    if (this.fBY) {
      localContentValues.put("bgUrl", this.field_bgUrl);
    }
    if (this.fBZ) {
      localContentValues.put("older_bgId", this.field_older_bgId);
    }
    if (this.fCa) {
      localContentValues.put("local_flag", Integer.valueOf(this.field_local_flag));
    }
    if (this.fCb) {
      localContentValues.put("istyle", Integer.valueOf(this.field_istyle));
    }
    if (this.fCc) {
      localContentValues.put("iFlag", Integer.valueOf(this.field_iFlag));
    }
    if (this.fCd) {
      localContentValues.put("icount", Integer.valueOf(this.field_icount));
    }
    if (this.fCe) {
      localContentValues.put("faultS", this.field_faultS);
    }
    if (this.fCf) {
      localContentValues.put("snsBgId", Long.valueOf(this.field_snsBgId));
    }
    if (this.fCg) {
      localContentValues.put("snsuser", this.field_snsuser);
    }
    if (this.fCh) {
      localContentValues.put("adsession", this.field_adsession);
    }
    if (this.fCi) {
      localContentValues.put("lastFirstPageRequestErrCode", Integer.valueOf(this.field_lastFirstPageRequestErrCode));
    }
    if (this.fCj) {
      localContentValues.put("lastFirstPageRequestErrType", Integer.valueOf(this.field_lastFirstPageRequestErrType));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4126792482816L, 30747);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */