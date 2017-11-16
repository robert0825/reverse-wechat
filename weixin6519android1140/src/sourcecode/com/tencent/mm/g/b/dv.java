package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dv
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fGD;
  private static final int fGE;
  private static final int fGF;
  private static final int fGG;
  private static final int fGH;
  private static final int fnX;
  private boolean fGA;
  private boolean fGB;
  private boolean fGC;
  private boolean fGy;
  private boolean fGz;
  public long field_configCrc32;
  public String field_configId;
  public String field_configResources;
  public String field_configUrl;
  public boolean field_disable;
  public boolean field_isFromXml;
  private boolean fnW;
  
  static
  {
    GMTrace.i(4155649294336L, 30962);
    eZt = new String[0];
    fGD = "disable".hashCode();
    fnX = "configId".hashCode();
    fGE = "configUrl".hashCode();
    fGF = "configResources".hashCode();
    fGG = "configCrc32".hashCode();
    fGH = "isFromXml".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4155649294336L, 30962);
  }
  
  public dv()
  {
    GMTrace.i(4155246641152L, 30959);
    this.fGy = true;
    this.fnW = true;
    this.fGz = true;
    this.fGA = true;
    this.fGB = true;
    this.fGC = true;
    GMTrace.o(4155246641152L, 30959);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4155380858880L, 30960);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4155380858880L, 30960);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      boolean bool;
      if (fGD == k) {
        if (paramCursor.getInt(i) != 0)
        {
          bool = true;
          label73:
          this.field_disable = bool;
        }
      }
      for (;;)
      {
        i += 1;
        break;
        bool = false;
        break label73;
        if (fnX == k)
        {
          this.field_configId = paramCursor.getString(i);
          this.fnW = true;
        }
        else if (fGE == k)
        {
          this.field_configUrl = paramCursor.getString(i);
        }
        else if (fGF == k)
        {
          this.field_configResources = paramCursor.getString(i);
        }
        else if (fGG == k)
        {
          this.field_configCrc32 = paramCursor.getLong(i);
        }
        else
        {
          if (fGH == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_isFromXml = bool;
              break;
            }
          }
          if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4155380858880L, 30960);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4155515076608L, 30961);
    ContentValues localContentValues = new ContentValues();
    if (this.fGy) {
      localContentValues.put("disable", Boolean.valueOf(this.field_disable));
    }
    if (this.fnW) {
      localContentValues.put("configId", this.field_configId);
    }
    if (this.fGz) {
      localContentValues.put("configUrl", this.field_configUrl);
    }
    if (this.fGA) {
      localContentValues.put("configResources", this.field_configResources);
    }
    if (this.fGB) {
      localContentValues.put("configCrc32", Long.valueOf(this.field_configCrc32));
    }
    if (this.fGC) {
      localContentValues.put("isFromXml", Boolean.valueOf(this.field_isFromXml));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4155515076608L, 30961);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */