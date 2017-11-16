package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bf
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fhk;
  private static final int fqc;
  private static final int fqd;
  private static final int fqe;
  private static final int fqf;
  private static final int fqg;
  private static final int fqh;
  private static final int fqi;
  private static final int fqj;
  private static final int fqk;
  private static final int fql;
  private static final int fqm;
  private static final int fqn;
  private static final int fqo;
  private boolean fgR;
  public int field_action;
  public int field_connectState;
  public long field_expiredTime;
  public String field_mac;
  public String field_mid;
  public String field_showUrl;
  public String field_showWordCn;
  public String field_showWordEn;
  public String field_showWordTw;
  public String field_ssid;
  public String field_ssidmd5;
  public String field_url;
  public int field_verifyResult;
  public int field_wifiType;
  private boolean fpP;
  private boolean fpQ;
  private boolean fpR;
  private boolean fpS;
  private boolean fpT;
  private boolean fpU;
  private boolean fpV;
  private boolean fpW;
  private boolean fpX;
  private boolean fpY;
  private boolean fpZ;
  private boolean fqa;
  private boolean fqb;
  
  static
  {
    GMTrace.i(4166252494848L, 31041);
    eZt = new String[0];
    fqc = "ssidmd5".hashCode();
    fqd = "ssid".hashCode();
    fqe = "mid".hashCode();
    fhk = "url".hashCode();
    fqf = "connectState".hashCode();
    fqg = "expiredTime".hashCode();
    fqh = "wifiType".hashCode();
    fqi = "action".hashCode();
    fqj = "showUrl".hashCode();
    fqk = "showWordEn".hashCode();
    fql = "showWordCn".hashCode();
    fqm = "showWordTw".hashCode();
    fqn = "mac".hashCode();
    fqo = "verifyResult".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4166252494848L, 31041);
  }
  
  public bf()
  {
    GMTrace.i(4165849841664L, 31038);
    this.fpP = true;
    this.fpQ = true;
    this.fpR = true;
    this.fgR = true;
    this.fpS = true;
    this.fpT = true;
    this.fpU = true;
    this.fpV = true;
    this.fpW = true;
    this.fpX = true;
    this.fpY = true;
    this.fpZ = true;
    this.fqa = true;
    this.fqb = true;
    GMTrace.o(4165849841664L, 31038);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4165984059392L, 31039);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4165984059392L, 31039);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fqc == k)
      {
        this.field_ssidmd5 = paramCursor.getString(i);
        this.fpP = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fqd == k) {
          this.field_ssid = paramCursor.getString(i);
        } else if (fqe == k) {
          this.field_mid = paramCursor.getString(i);
        } else if (fhk == k) {
          this.field_url = paramCursor.getString(i);
        } else if (fqf == k) {
          this.field_connectState = paramCursor.getInt(i);
        } else if (fqg == k) {
          this.field_expiredTime = paramCursor.getLong(i);
        } else if (fqh == k) {
          this.field_wifiType = paramCursor.getInt(i);
        } else if (fqi == k) {
          this.field_action = paramCursor.getInt(i);
        } else if (fqj == k) {
          this.field_showUrl = paramCursor.getString(i);
        } else if (fqk == k) {
          this.field_showWordEn = paramCursor.getString(i);
        } else if (fql == k) {
          this.field_showWordCn = paramCursor.getString(i);
        } else if (fqm == k) {
          this.field_showWordTw = paramCursor.getString(i);
        } else if (fqn == k) {
          this.field_mac = paramCursor.getString(i);
        } else if (fqo == k) {
          this.field_verifyResult = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4165984059392L, 31039);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4166118277120L, 31040);
    ContentValues localContentValues = new ContentValues();
    if (this.fpP) {
      localContentValues.put("ssidmd5", this.field_ssidmd5);
    }
    if (this.fpQ) {
      localContentValues.put("ssid", this.field_ssid);
    }
    if (this.fpR) {
      localContentValues.put("mid", this.field_mid);
    }
    if (this.fgR) {
      localContentValues.put("url", this.field_url);
    }
    if (this.fpS) {
      localContentValues.put("connectState", Integer.valueOf(this.field_connectState));
    }
    if (this.fpT) {
      localContentValues.put("expiredTime", Long.valueOf(this.field_expiredTime));
    }
    if (this.fpU) {
      localContentValues.put("wifiType", Integer.valueOf(this.field_wifiType));
    }
    if (this.fpV) {
      localContentValues.put("action", Integer.valueOf(this.field_action));
    }
    if (this.fpW) {
      localContentValues.put("showUrl", this.field_showUrl);
    }
    if (this.fpX) {
      localContentValues.put("showWordEn", this.field_showWordEn);
    }
    if (this.fpY) {
      localContentValues.put("showWordCn", this.field_showWordCn);
    }
    if (this.fpZ) {
      localContentValues.put("showWordTw", this.field_showWordTw);
    }
    if (this.fqa) {
      localContentValues.put("mac", this.field_mac);
    }
    if (this.fqb) {
      localContentValues.put("verifyResult", Integer.valueOf(this.field_verifyResult));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4166118277120L, 31040);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */