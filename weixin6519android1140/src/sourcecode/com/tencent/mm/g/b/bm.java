package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bm
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faG;
  private static final int faO;
  private static final int fer;
  private static final int fmj;
  private static final int fmk;
  private static final int fml;
  private static final int fmm;
  private static final int frt;
  private static final int fru;
  private static final int frv;
  private static final int frw;
  private static final int frx;
  private static final int fry;
  private boolean fak;
  private boolean fas;
  private boolean fep;
  public String field_content;
  public long field_createTime;
  public int field_flag;
  public String field_fromUserName;
  public int field_msgSeq;
  public String field_msgSource;
  public long field_newMsgId;
  public long field_originSvrId;
  public int field_reserved1;
  public long field_reserved2;
  public String field_reserved3;
  public String field_reserved4;
  public String field_toUserName;
  private boolean flK;
  private boolean flL;
  private boolean flM;
  private boolean flN;
  private boolean frn;
  private boolean fro;
  private boolean frp;
  private boolean frq;
  private boolean frr;
  private boolean frs;
  
  static
  {
    GMTrace.i(4153904463872L, 30949);
    eZt = new String[0];
    frt = "originSvrId".hashCode();
    fru = "newMsgId".hashCode();
    frv = "fromUserName".hashCode();
    frw = "toUserName".hashCode();
    faG = "createTime".hashCode();
    faO = "content".hashCode();
    frx = "msgSource".hashCode();
    fry = "msgSeq".hashCode();
    fer = "flag".hashCode();
    fmj = "reserved1".hashCode();
    fmk = "reserved2".hashCode();
    fml = "reserved3".hashCode();
    fmm = "reserved4".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4153904463872L, 30949);
  }
  
  public bm()
  {
    GMTrace.i(4153501810688L, 30946);
    this.frn = true;
    this.fro = true;
    this.frp = true;
    this.frq = true;
    this.fak = true;
    this.fas = true;
    this.frr = true;
    this.frs = true;
    this.fep = true;
    this.flK = true;
    this.flL = true;
    this.flM = true;
    this.flN = true;
    GMTrace.o(4153501810688L, 30946);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4153636028416L, 30947);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4153636028416L, 30947);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (frt == k)
      {
        this.field_originSvrId = paramCursor.getLong(i);
        this.frn = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fru == k) {
          this.field_newMsgId = paramCursor.getLong(i);
        } else if (frv == k) {
          this.field_fromUserName = paramCursor.getString(i);
        } else if (frw == k) {
          this.field_toUserName = paramCursor.getString(i);
        } else if (faG == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (faO == k) {
          this.field_content = paramCursor.getString(i);
        } else if (frx == k) {
          this.field_msgSource = paramCursor.getString(i);
        } else if (fry == k) {
          this.field_msgSeq = paramCursor.getInt(i);
        } else if (fer == k) {
          this.field_flag = paramCursor.getInt(i);
        } else if (fmj == k) {
          this.field_reserved1 = paramCursor.getInt(i);
        } else if (fmk == k) {
          this.field_reserved2 = paramCursor.getLong(i);
        } else if (fml == k) {
          this.field_reserved3 = paramCursor.getString(i);
        } else if (fmm == k) {
          this.field_reserved4 = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4153636028416L, 30947);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4153770246144L, 30948);
    ContentValues localContentValues = new ContentValues();
    if (this.frn) {
      localContentValues.put("originSvrId", Long.valueOf(this.field_originSvrId));
    }
    if (this.fro) {
      localContentValues.put("newMsgId", Long.valueOf(this.field_newMsgId));
    }
    if (this.field_fromUserName == null) {
      this.field_fromUserName = "";
    }
    if (this.frp) {
      localContentValues.put("fromUserName", this.field_fromUserName);
    }
    if (this.field_toUserName == null) {
      this.field_toUserName = "";
    }
    if (this.frq) {
      localContentValues.put("toUserName", this.field_toUserName);
    }
    if (this.fak) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.field_content == null) {
      this.field_content = "";
    }
    if (this.fas) {
      localContentValues.put("content", this.field_content);
    }
    if (this.field_msgSource == null) {
      this.field_msgSource = "";
    }
    if (this.frr) {
      localContentValues.put("msgSource", this.field_msgSource);
    }
    if (this.frs) {
      localContentValues.put("msgSeq", Integer.valueOf(this.field_msgSeq));
    }
    if (this.fep) {
      localContentValues.put("flag", Integer.valueOf(this.field_flag));
    }
    if (this.flK) {
      localContentValues.put("reserved1", Integer.valueOf(this.field_reserved1));
    }
    if (this.flL) {
      localContentValues.put("reserved2", Long.valueOf(this.field_reserved2));
    }
    if (this.field_reserved3 == null) {
      this.field_reserved3 = "";
    }
    if (this.flM) {
      localContentValues.put("reserved3", this.field_reserved3);
    }
    if (this.field_reserved4 == null) {
      this.field_reserved4 = "";
    }
    if (this.flN) {
      localContentValues.put("reserved4", this.field_reserved4);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4153770246144L, 30948);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */