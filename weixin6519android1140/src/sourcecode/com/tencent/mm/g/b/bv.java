package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bv
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faO;
  private static final int fem;
  private static final int ffb;
  private static final int fnK;
  private static final int fre;
  private static final int ftp;
  private static final int ftq;
  private boolean fas;
  private boolean feN;
  private boolean fei;
  public String field_content;
  public String field_descUrl;
  public short field_isRead;
  public int field_msgType;
  public long field_pushTime;
  public long field_svrId;
  public String field_title;
  private boolean fnH;
  private boolean fqV;
  private boolean ftn;
  private boolean fto;
  
  static
  {
    GMTrace.i(4163970793472L, 31024);
    eZt = new String[0];
    fnK = "svrId".hashCode();
    fre = "isRead".hashCode();
    fem = "title".hashCode();
    faO = "content".hashCode();
    ftp = "pushTime".hashCode();
    ffb = "msgType".hashCode();
    ftq = "descUrl".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4163970793472L, 31024);
  }
  
  public bv()
  {
    GMTrace.i(4163568140288L, 31021);
    this.fnH = true;
    this.fqV = true;
    this.fei = true;
    this.fas = true;
    this.ftn = true;
    this.feN = true;
    this.fto = true;
    GMTrace.o(4163568140288L, 31021);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4163702358016L, 31022);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4163702358016L, 31022);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fnK == k)
      {
        this.field_svrId = paramCursor.getLong(i);
        this.fnH = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fre == k) {
          this.field_isRead = paramCursor.getShort(i);
        } else if (fem == k) {
          this.field_title = paramCursor.getString(i);
        } else if (faO == k) {
          this.field_content = paramCursor.getString(i);
        } else if (ftp == k) {
          this.field_pushTime = paramCursor.getLong(i);
        } else if (ffb == k) {
          this.field_msgType = paramCursor.getInt(i);
        } else if (ftq == k) {
          this.field_descUrl = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4163702358016L, 31022);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4163836575744L, 31023);
    ContentValues localContentValues = new ContentValues();
    if (this.fnH) {
      localContentValues.put("svrId", Long.valueOf(this.field_svrId));
    }
    if (this.fqV) {
      localContentValues.put("isRead", Short.valueOf(this.field_isRead));
    }
    if (this.fei) {
      localContentValues.put("title", this.field_title);
    }
    if (this.fas) {
      localContentValues.put("content", this.field_content);
    }
    if (this.ftn) {
      localContentValues.put("pushTime", Long.valueOf(this.field_pushTime));
    }
    if (this.feN) {
      localContentValues.put("msgType", Integer.valueOf(this.field_msgType));
    }
    if (this.fto) {
      localContentValues.put("descUrl", this.field_descUrl);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4163836575744L, 31023);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */