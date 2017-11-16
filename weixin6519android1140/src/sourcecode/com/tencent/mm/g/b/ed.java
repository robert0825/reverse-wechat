package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ed
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fIh;
  private static final int fIi;
  private static final int fIj;
  private static final int fIk;
  private static final int fIl;
  private static final int fIm;
  private static final int fIn;
  private static final int fIo;
  private static final int fIp;
  private static final int fIq;
  private static final int fIr;
  private static final int fbI;
  private static final int fbu;
  private static final int fcc;
  private static final int fcu;
  private static final int fcv;
  private static final int fgD;
  private static final int fgp;
  private static final int fwn;
  private boolean fHW;
  private boolean fHX;
  private boolean fHY;
  private boolean fHZ;
  private boolean fIa;
  private boolean fIb;
  private boolean fIc;
  private boolean fId;
  private boolean fIe;
  private boolean fIf;
  private boolean fIg;
  private boolean fbd;
  private boolean fbr;
  private boolean fcb;
  private boolean fch;
  private boolean fci;
  private boolean fgc;
  private boolean fgz;
  public String field_appId;
  public String field_appInfo;
  public int field_appOpt;
  public String field_bigHeadURL;
  public String field_bindWxaInfo;
  public String field_bizMenu;
  public String field_brandIconURL;
  public String field_dynamicInfo;
  public String field_nickname;
  public String field_registerSource;
  public String field_reserved;
  public String field_roundedSquareIconURL;
  public String field_signature;
  public String field_smallHeadURL;
  public long field_syncTimeSecond;
  public String field_syncVersion;
  public String field_username;
  public int field_usernameHash;
  public String field_versionInfo;
  private boolean fwe;
  
  static
  {
    GMTrace.i(15353971212288L, 114396);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS WxaAttributesTableAppIdIndex ON WxaAttributesTable(appId)" };
    fIh = "usernameHash".hashCode();
    fcc = "username".hashCode();
    fbu = "appId".hashCode();
    fgD = "nickname".hashCode();
    fgp = "brandIconURL".hashCode();
    fIi = "roundedSquareIconURL".hashCode();
    fIj = "bigHeadURL".hashCode();
    fIk = "smallHeadURL".hashCode();
    fbI = "signature".hashCode();
    fIl = "appOpt".hashCode();
    fIm = "registerSource".hashCode();
    fcu = "appInfo".hashCode();
    fcv = "versionInfo".hashCode();
    fIn = "bindWxaInfo".hashCode();
    fIo = "dynamicInfo".hashCode();
    fwn = "reserved".hashCode();
    fIp = "syncTimeSecond".hashCode();
    fIq = "syncVersion".hashCode();
    fIr = "bizMenu".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(15353971212288L, 114396);
  }
  
  public ed()
  {
    GMTrace.i(15353568559104L, 114393);
    this.fHW = true;
    this.fcb = true;
    this.fbd = true;
    this.fgz = true;
    this.fgc = true;
    this.fHX = true;
    this.fHY = true;
    this.fHZ = true;
    this.fbr = true;
    this.fIa = true;
    this.fIb = true;
    this.fch = true;
    this.fci = true;
    this.fIc = true;
    this.fId = true;
    this.fwe = true;
    this.fIe = true;
    this.fIf = true;
    this.fIg = true;
    GMTrace.o(15353568559104L, 114393);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(15353702776832L, 114394);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(15353702776832L, 114394);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fIh == k)
      {
        this.field_usernameHash = paramCursor.getInt(i);
        this.fHW = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fcc == k) {
          this.field_username = paramCursor.getString(i);
        } else if (fbu == k) {
          this.field_appId = paramCursor.getString(i);
        } else if (fgD == k) {
          this.field_nickname = paramCursor.getString(i);
        } else if (fgp == k) {
          this.field_brandIconURL = paramCursor.getString(i);
        } else if (fIi == k) {
          this.field_roundedSquareIconURL = paramCursor.getString(i);
        } else if (fIj == k) {
          this.field_bigHeadURL = paramCursor.getString(i);
        } else if (fIk == k) {
          this.field_smallHeadURL = paramCursor.getString(i);
        } else if (fbI == k) {
          this.field_signature = paramCursor.getString(i);
        } else if (fIl == k) {
          this.field_appOpt = paramCursor.getInt(i);
        } else if (fIm == k) {
          this.field_registerSource = paramCursor.getString(i);
        } else if (fcu == k) {
          this.field_appInfo = paramCursor.getString(i);
        } else if (fcv == k) {
          this.field_versionInfo = paramCursor.getString(i);
        } else if (fIn == k) {
          this.field_bindWxaInfo = paramCursor.getString(i);
        } else if (fIo == k) {
          this.field_dynamicInfo = paramCursor.getString(i);
        } else if (fwn == k) {
          this.field_reserved = paramCursor.getString(i);
        } else if (fIp == k) {
          this.field_syncTimeSecond = paramCursor.getLong(i);
        } else if (fIq == k) {
          this.field_syncVersion = paramCursor.getString(i);
        } else if (fIr == k) {
          this.field_bizMenu = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(15353702776832L, 114394);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(15353836994560L, 114395);
    ContentValues localContentValues = new ContentValues();
    if (this.fHW) {
      localContentValues.put("usernameHash", Integer.valueOf(this.field_usernameHash));
    }
    if (this.fcb) {
      localContentValues.put("username", this.field_username);
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fgz) {
      localContentValues.put("nickname", this.field_nickname);
    }
    if (this.fgc) {
      localContentValues.put("brandIconURL", this.field_brandIconURL);
    }
    if (this.fHX) {
      localContentValues.put("roundedSquareIconURL", this.field_roundedSquareIconURL);
    }
    if (this.fHY) {
      localContentValues.put("bigHeadURL", this.field_bigHeadURL);
    }
    if (this.fHZ) {
      localContentValues.put("smallHeadURL", this.field_smallHeadURL);
    }
    if (this.fbr) {
      localContentValues.put("signature", this.field_signature);
    }
    if (this.fIa) {
      localContentValues.put("appOpt", Integer.valueOf(this.field_appOpt));
    }
    if (this.fIb) {
      localContentValues.put("registerSource", this.field_registerSource);
    }
    if (this.fch) {
      localContentValues.put("appInfo", this.field_appInfo);
    }
    if (this.fci) {
      localContentValues.put("versionInfo", this.field_versionInfo);
    }
    if (this.fIc) {
      localContentValues.put("bindWxaInfo", this.field_bindWxaInfo);
    }
    if (this.fId) {
      localContentValues.put("dynamicInfo", this.field_dynamicInfo);
    }
    if (this.fwe) {
      localContentValues.put("reserved", this.field_reserved);
    }
    if (this.fIe) {
      localContentValues.put("syncTimeSecond", Long.valueOf(this.field_syncTimeSecond));
    }
    if (this.fIf) {
      localContentValues.put("syncVersion", this.field_syncVersion);
    }
    if (this.fIg) {
      localContentValues.put("bizMenu", this.field_bizMenu);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(15353836994560L, 114395);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */