package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class aw
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faG;
  private static final int faJ;
  private static final int ffa;
  private static final int fnJ;
  private static final int fnK;
  private static final int fnL;
  private static final int fnq;
  private static final int fnr;
  private boolean fak;
  private boolean fan;
  private boolean feM;
  public String field_chatroomName;
  public long field_createTime;
  public String field_encryptTalker;
  public int field_isSend;
  public String field_msgContent;
  public long field_svrId;
  public String field_talker;
  public int field_type;
  private boolean fnG;
  private boolean fnH;
  private boolean fnI;
  private boolean fna;
  private boolean fnb;
  
  static
  {
    GMTrace.i(4141422215168L, 30856);
    eZt = new String[0];
    fnJ = "msgContent".hashCode();
    ffa = "isSend".hashCode();
    fnq = "talker".hashCode();
    fnr = "encryptTalker".hashCode();
    fnK = "svrId".hashCode();
    faJ = "type".hashCode();
    faG = "createTime".hashCode();
    fnL = "chatroomName".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4141422215168L, 30856);
  }
  
  public aw()
  {
    GMTrace.i(4141019561984L, 30853);
    this.fnG = true;
    this.feM = true;
    this.fna = true;
    this.fnb = true;
    this.fnH = true;
    this.fan = true;
    this.fak = true;
    this.fnI = true;
    GMTrace.o(4141019561984L, 30853);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4141153779712L, 30854);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4141153779712L, 30854);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fnJ == k) {
        this.field_msgContent = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (ffa == k) {
          this.field_isSend = paramCursor.getInt(i);
        } else if (fnq == k) {
          this.field_talker = paramCursor.getString(i);
        } else if (fnr == k) {
          this.field_encryptTalker = paramCursor.getString(i);
        } else if (fnK == k) {
          this.field_svrId = paramCursor.getLong(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (faG == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (fnL == k) {
          this.field_chatroomName = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4141153779712L, 30854);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4141287997440L, 30855);
    ContentValues localContentValues = new ContentValues();
    if (this.field_msgContent == null) {
      this.field_msgContent = "";
    }
    if (this.fnG) {
      localContentValues.put("msgContent", this.field_msgContent);
    }
    if (this.feM) {
      localContentValues.put("isSend", Integer.valueOf(this.field_isSend));
    }
    if (this.field_talker == null) {
      this.field_talker = "";
    }
    if (this.fna) {
      localContentValues.put("talker", this.field_talker);
    }
    if (this.field_encryptTalker == null) {
      this.field_encryptTalker = "";
    }
    if (this.fnb) {
      localContentValues.put("encryptTalker", this.field_encryptTalker);
    }
    if (this.fnH) {
      localContentValues.put("svrId", Long.valueOf(this.field_svrId));
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.fak) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.field_chatroomName == null) {
      this.field_chatroomName = "";
    }
    if (this.fnI) {
      localContentValues.put("chatroomName", this.field_chatroomName);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4141287997440L, 30855);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */