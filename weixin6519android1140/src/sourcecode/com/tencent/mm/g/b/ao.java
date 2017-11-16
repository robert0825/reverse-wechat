package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ao
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faJ;
  private static final int faO;
  private static final int fbS;
  private static final int feo;
  private static final int fls;
  private static final int flw;
  private static final int fmA;
  private static final int fmB;
  private static final int fmd;
  private static final int fme;
  private static final int fmf;
  private static final int fmg;
  private static final int fmh;
  private static final int fmi;
  private static final int fmj;
  private static final int fmk;
  private static final int fml;
  private static final int fmm;
  private static final int fmn;
  private static final int fmo;
  private static final int fmp;
  private static final int fmq;
  private static final int fmr;
  private static final int fms;
  private static final int fmt;
  private static final int fmu;
  private static final int fmv;
  private static final int fmw;
  private static final int fmx;
  private static final int fmy;
  private static final int fmz;
  private boolean fan;
  private boolean fas;
  private boolean fbP;
  private boolean fek;
  public String field_activityid;
  public String field_aeskey;
  public String field_app_id;
  public int field_catalog;
  public String field_cdnUrl;
  public String field_content;
  public String field_designerID;
  public String field_encrypturl;
  public String field_externMd5;
  public String field_externUrl;
  public String field_framesInfo;
  public String field_groupId;
  public int field_height;
  public int field_idx;
  public long field_lastUseTime;
  public String field_md5;
  public String field_name;
  public int field_needupload;
  public String field_reserved1;
  public String field_reserved2;
  public int field_reserved3;
  public int field_reserved4;
  public int field_size;
  public int field_source;
  public int field_start;
  public int field_state;
  public String field_svrid;
  public int field_temp;
  public String field_thumbUrl;
  public int field_type;
  public int field_width;
  private boolean fkS;
  private boolean fkW;
  private boolean flE;
  private boolean flF;
  private boolean flG;
  private boolean flH;
  private boolean flI;
  private boolean flJ;
  private boolean flK;
  private boolean flL;
  private boolean flM;
  private boolean flN;
  private boolean flO;
  private boolean flP;
  private boolean flQ;
  private boolean flR;
  private boolean flS;
  private boolean flT;
  private boolean flU;
  private boolean flV;
  private boolean flW;
  private boolean flX;
  private boolean flY;
  private boolean flZ;
  private boolean fma;
  private boolean fmb;
  private boolean fmc;
  
  static
  {
    GMTrace.i(4140348473344L, 30848);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS emojiGroupIndex ON EmojiInfo(catalog)" };
    fmd = "md5".hashCode();
    fme = "svrid".hashCode();
    fmf = "catalog".hashCode();
    faJ = "type".hashCode();
    fbS = "size".hashCode();
    fmg = "start".hashCode();
    fmh = "state".hashCode();
    fmi = "name".hashCode();
    faO = "content".hashCode();
    fmj = "reserved1".hashCode();
    fmk = "reserved2".hashCode();
    fml = "reserved3".hashCode();
    fmm = "reserved4".hashCode();
    fmn = "app_id".hashCode();
    fmo = "groupId".hashCode();
    fls = "lastUseTime".hashCode();
    fmp = "framesInfo".hashCode();
    flw = "idx".hashCode();
    fmq = "temp".hashCode();
    feo = "source".hashCode();
    fmr = "needupload".hashCode();
    fms = "designerID".hashCode();
    fmt = "thumbUrl".hashCode();
    fmu = "cdnUrl".hashCode();
    fmv = "encrypturl".hashCode();
    fmw = "aeskey".hashCode();
    fmx = "width".hashCode();
    fmy = "height".hashCode();
    fmz = "externUrl".hashCode();
    fmA = "externMd5".hashCode();
    fmB = "activityid".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4140348473344L, 30848);
  }
  
  public ao()
  {
    GMTrace.i(4139811602432L, 30844);
    this.flE = true;
    this.flF = true;
    this.flG = true;
    this.fan = true;
    this.fbP = true;
    this.flH = true;
    this.flI = true;
    this.flJ = true;
    this.fas = true;
    this.flK = true;
    this.flL = true;
    this.flM = true;
    this.flN = true;
    this.flO = true;
    this.flP = true;
    this.fkS = true;
    this.flQ = true;
    this.fkW = true;
    this.flR = true;
    this.fek = true;
    this.flS = true;
    this.flT = true;
    this.flU = true;
    this.flV = true;
    this.flW = true;
    this.flX = true;
    this.flY = true;
    this.flZ = true;
    this.fma = true;
    this.fmb = true;
    this.fmc = true;
    GMTrace.o(4139811602432L, 30844);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4139945820160L, 30845);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4139945820160L, 30845);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fmd == k)
      {
        this.field_md5 = paramCursor.getString(i);
        this.flE = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fme == k) {
          this.field_svrid = paramCursor.getString(i);
        } else if (fmf == k) {
          this.field_catalog = paramCursor.getInt(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (fbS == k) {
          this.field_size = paramCursor.getInt(i);
        } else if (fmg == k) {
          this.field_start = paramCursor.getInt(i);
        } else if (fmh == k) {
          this.field_state = paramCursor.getInt(i);
        } else if (fmi == k) {
          this.field_name = paramCursor.getString(i);
        } else if (faO == k) {
          this.field_content = paramCursor.getString(i);
        } else if (fmj == k) {
          this.field_reserved1 = paramCursor.getString(i);
        } else if (fmk == k) {
          this.field_reserved2 = paramCursor.getString(i);
        } else if (fml == k) {
          this.field_reserved3 = paramCursor.getInt(i);
        } else if (fmm == k) {
          this.field_reserved4 = paramCursor.getInt(i);
        } else if (fmn == k) {
          this.field_app_id = paramCursor.getString(i);
        } else if (fmo == k) {
          this.field_groupId = paramCursor.getString(i);
        } else if (fls == k) {
          this.field_lastUseTime = paramCursor.getLong(i);
        } else if (fmp == k) {
          this.field_framesInfo = paramCursor.getString(i);
        } else if (flw == k) {
          this.field_idx = paramCursor.getInt(i);
        } else if (fmq == k) {
          this.field_temp = paramCursor.getInt(i);
        } else if (feo == k) {
          this.field_source = paramCursor.getInt(i);
        } else if (fmr == k) {
          this.field_needupload = paramCursor.getInt(i);
        } else if (fms == k) {
          this.field_designerID = paramCursor.getString(i);
        } else if (fmt == k) {
          this.field_thumbUrl = paramCursor.getString(i);
        } else if (fmu == k) {
          this.field_cdnUrl = paramCursor.getString(i);
        } else if (fmv == k) {
          this.field_encrypturl = paramCursor.getString(i);
        } else if (fmw == k) {
          this.field_aeskey = paramCursor.getString(i);
        } else if (fmx == k) {
          this.field_width = paramCursor.getInt(i);
        } else if (fmy == k) {
          this.field_height = paramCursor.getInt(i);
        } else if (fmz == k) {
          this.field_externUrl = paramCursor.getString(i);
        } else if (fmA == k) {
          this.field_externMd5 = paramCursor.getString(i);
        } else if (fmB == k) {
          this.field_activityid = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4139945820160L, 30845);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4140080037888L, 30846);
    ContentValues localContentValues = new ContentValues();
    if (this.flE) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.flF) {
      localContentValues.put("svrid", this.field_svrid);
    }
    if (this.flG) {
      localContentValues.put("catalog", Integer.valueOf(this.field_catalog));
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.fbP) {
      localContentValues.put("size", Integer.valueOf(this.field_size));
    }
    if (this.flH) {
      localContentValues.put("start", Integer.valueOf(this.field_start));
    }
    if (this.flI) {
      localContentValues.put("state", Integer.valueOf(this.field_state));
    }
    if (this.flJ) {
      localContentValues.put("name", this.field_name);
    }
    if (this.fas) {
      localContentValues.put("content", this.field_content);
    }
    if (this.flK) {
      localContentValues.put("reserved1", this.field_reserved1);
    }
    if (this.flL) {
      localContentValues.put("reserved2", this.field_reserved2);
    }
    if (this.flM) {
      localContentValues.put("reserved3", Integer.valueOf(this.field_reserved3));
    }
    if (this.flN) {
      localContentValues.put("reserved4", Integer.valueOf(this.field_reserved4));
    }
    if (this.flO) {
      localContentValues.put("app_id", this.field_app_id);
    }
    if (this.field_groupId == null) {
      this.field_groupId = "";
    }
    if (this.flP) {
      localContentValues.put("groupId", this.field_groupId);
    }
    if (this.fkS) {
      localContentValues.put("lastUseTime", Long.valueOf(this.field_lastUseTime));
    }
    if (this.field_framesInfo == null) {
      this.field_framesInfo = "";
    }
    if (this.flQ) {
      localContentValues.put("framesInfo", this.field_framesInfo);
    }
    if (this.fkW) {
      localContentValues.put("idx", Integer.valueOf(this.field_idx));
    }
    if (this.flR) {
      localContentValues.put("temp", Integer.valueOf(this.field_temp));
    }
    if (this.fek) {
      localContentValues.put("source", Integer.valueOf(this.field_source));
    }
    if (this.flS) {
      localContentValues.put("needupload", Integer.valueOf(this.field_needupload));
    }
    if (this.flT) {
      localContentValues.put("designerID", this.field_designerID);
    }
    if (this.flU) {
      localContentValues.put("thumbUrl", this.field_thumbUrl);
    }
    if (this.flV) {
      localContentValues.put("cdnUrl", this.field_cdnUrl);
    }
    if (this.flW) {
      localContentValues.put("encrypturl", this.field_encrypturl);
    }
    if (this.flX) {
      localContentValues.put("aeskey", this.field_aeskey);
    }
    if (this.flY) {
      localContentValues.put("width", Integer.valueOf(this.field_width));
    }
    if (this.flZ) {
      localContentValues.put("height", Integer.valueOf(this.field_height));
    }
    if (this.fma) {
      localContentValues.put("externUrl", this.field_externUrl);
    }
    if (this.fmb) {
      localContentValues.put("externMd5", this.field_externMd5);
    }
    if (this.fmc) {
      localContentValues.put("activityid", this.field_activityid);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4140080037888L, 30846);
    return localContentValues;
  }
  
  public void reset()
  {
    GMTrace.i(4140214255616L, 30847);
    GMTrace.o(4140214255616L, 30847);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */