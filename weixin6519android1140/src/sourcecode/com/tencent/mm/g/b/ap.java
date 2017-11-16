package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ap
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int flA;
  private static final int fmG;
  private static final int fmH;
  private static final int fmI;
  private static final int fmJ;
  private static final int fmd;
  private static final int fmo;
  public int field_click_flag;
  public String field_desc;
  public int field_download_flag;
  public String field_groupId;
  public String field_lang;
  public String field_md5;
  public String field_md5_lang;
  private boolean flE;
  private boolean flP;
  private boolean fla;
  private boolean fmC;
  private boolean fmD;
  private boolean fmE;
  private boolean fmF;
  
  static
  {
    GMTrace.i(4130684796928L, 30776);
    eZt = new String[0];
    fmG = "md5_lang".hashCode();
    fmd = "md5".hashCode();
    flA = "lang".hashCode();
    fmH = "desc".hashCode();
    fmo = "groupId".hashCode();
    fmI = "click_flag".hashCode();
    fmJ = "download_flag".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4130684796928L, 30776);
  }
  
  public ap()
  {
    GMTrace.i(4130282143744L, 30773);
    this.fmC = true;
    this.flE = true;
    this.fla = true;
    this.fmD = true;
    this.flP = true;
    this.fmE = true;
    this.fmF = true;
    GMTrace.o(4130282143744L, 30773);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4130416361472L, 30774);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4130416361472L, 30774);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fmG == k)
      {
        this.field_md5_lang = paramCursor.getString(i);
        this.fmC = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fmd == k) {
          this.field_md5 = paramCursor.getString(i);
        } else if (flA == k) {
          this.field_lang = paramCursor.getString(i);
        } else if (fmH == k) {
          this.field_desc = paramCursor.getString(i);
        } else if (fmo == k) {
          this.field_groupId = paramCursor.getString(i);
        } else if (fmI == k) {
          this.field_click_flag = paramCursor.getInt(i);
        } else if (fmJ == k) {
          this.field_download_flag = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4130416361472L, 30774);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4130550579200L, 30775);
    ContentValues localContentValues = new ContentValues();
    if (this.fmC) {
      localContentValues.put("md5_lang", this.field_md5_lang);
    }
    if (this.flE) {
      localContentValues.put("md5", this.field_md5);
    }
    if (this.fla) {
      localContentValues.put("lang", this.field_lang);
    }
    if (this.fmD) {
      localContentValues.put("desc", this.field_desc);
    }
    if (this.field_groupId == null) {
      this.field_groupId = "";
    }
    if (this.flP) {
      localContentValues.put("groupId", this.field_groupId);
    }
    if (this.fmE) {
      localContentValues.put("click_flag", Integer.valueOf(this.field_click_flag));
    }
    if (this.fmF) {
      localContentValues.put("download_flag", Integer.valueOf(this.field_download_flag));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4130550579200L, 30775);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */