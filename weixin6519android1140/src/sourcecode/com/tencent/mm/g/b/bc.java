package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bc
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fem;
  private static final int fhk;
  private static final int foS;
  private static final int foT;
  private static final int foU;
  private static final int foV;
  private static final int foW;
  private static final int foX;
  private static final int foY;
  private static final int foZ;
  private static final int fpa;
  private static final int fpb;
  private boolean fei;
  private boolean fgR;
  public int field_actionType;
  public String field_androidUrl;
  public int field_featureId;
  public String field_helpUrl;
  public String field_iconPath;
  public String field_tag;
  public long field_timestamp;
  public String field_title;
  public String field_titlePY;
  public String field_titleShortPY;
  public String field_updateUrl;
  public String field_url;
  private boolean foI;
  private boolean foJ;
  private boolean foK;
  private boolean foL;
  private boolean foM;
  private boolean foN;
  private boolean foO;
  private boolean foP;
  private boolean foQ;
  private boolean foR;
  
  static
  {
    GMTrace.i(4161286438912L, 31004);
    eZt = new String[0];
    foS = "featureId".hashCode();
    fem = "title".hashCode();
    foT = "titlePY".hashCode();
    foU = "titleShortPY".hashCode();
    foV = "tag".hashCode();
    foW = "actionType".hashCode();
    fhk = "url".hashCode();
    foX = "helpUrl".hashCode();
    foY = "updateUrl".hashCode();
    foZ = "androidUrl".hashCode();
    fpa = "iconPath".hashCode();
    fpb = "timestamp".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4161286438912L, 31004);
  }
  
  public bc()
  {
    GMTrace.i(4160883785728L, 31001);
    this.foI = true;
    this.fei = true;
    this.foJ = true;
    this.foK = true;
    this.foL = true;
    this.foM = true;
    this.fgR = true;
    this.foN = true;
    this.foO = true;
    this.foP = true;
    this.foQ = true;
    this.foR = true;
    GMTrace.o(4160883785728L, 31001);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4161018003456L, 31002);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4161018003456L, 31002);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (foS == k)
      {
        this.field_featureId = paramCursor.getInt(i);
        this.foI = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fem == k) {
          this.field_title = paramCursor.getString(i);
        } else if (foT == k) {
          this.field_titlePY = paramCursor.getString(i);
        } else if (foU == k) {
          this.field_titleShortPY = paramCursor.getString(i);
        } else if (foV == k) {
          this.field_tag = paramCursor.getString(i);
        } else if (foW == k) {
          this.field_actionType = paramCursor.getInt(i);
        } else if (fhk == k) {
          this.field_url = paramCursor.getString(i);
        } else if (foX == k) {
          this.field_helpUrl = paramCursor.getString(i);
        } else if (foY == k) {
          this.field_updateUrl = paramCursor.getString(i);
        } else if (foZ == k) {
          this.field_androidUrl = paramCursor.getString(i);
        } else if (fpa == k) {
          this.field_iconPath = paramCursor.getString(i);
        } else if (fpb == k) {
          this.field_timestamp = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4161018003456L, 31002);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4161152221184L, 31003);
    ContentValues localContentValues = new ContentValues();
    if (this.foI) {
      localContentValues.put("featureId", Integer.valueOf(this.field_featureId));
    }
    if (this.fei) {
      localContentValues.put("title", this.field_title);
    }
    if (this.foJ) {
      localContentValues.put("titlePY", this.field_titlePY);
    }
    if (this.foK) {
      localContentValues.put("titleShortPY", this.field_titleShortPY);
    }
    if (this.foL) {
      localContentValues.put("tag", this.field_tag);
    }
    if (this.foM) {
      localContentValues.put("actionType", Integer.valueOf(this.field_actionType));
    }
    if (this.fgR) {
      localContentValues.put("url", this.field_url);
    }
    if (this.foN) {
      localContentValues.put("helpUrl", this.field_helpUrl);
    }
    if (this.foO) {
      localContentValues.put("updateUrl", this.field_updateUrl);
    }
    if (this.foP) {
      localContentValues.put("androidUrl", this.field_androidUrl);
    }
    if (this.foQ) {
      localContentValues.put("iconPath", this.field_iconPath);
    }
    if (this.foR) {
      localContentValues.put("timestamp", Long.valueOf(this.field_timestamp));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4161152221184L, 31003);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */