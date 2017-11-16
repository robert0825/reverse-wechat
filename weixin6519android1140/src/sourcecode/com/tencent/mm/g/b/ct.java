package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ct
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fAb;
  private static final int fAc;
  private static final int fAd;
  private static final int fAe;
  private static final int fAf;
  private static final int fbb;
  private boolean fAa;
  private boolean faZ;
  public long field_ScanTime;
  public int field_funcType;
  public String field_productId;
  public String field_qrcodeUrl;
  public int field_scene;
  public String field_xmlContent;
  private boolean fzW;
  private boolean fzX;
  private boolean fzY;
  private boolean fzZ;
  
  static
  {
    GMTrace.i(4160749568000L, 31000);
    eZt = new String[0];
    fAb = "productId".hashCode();
    fAc = "xmlContent".hashCode();
    fAd = "ScanTime".hashCode();
    fAe = "funcType".hashCode();
    fAf = "qrcodeUrl".hashCode();
    fbb = "scene".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4160749568000L, 31000);
  }
  
  public ct()
  {
    GMTrace.i(4160346914816L, 30997);
    this.fzW = true;
    this.fzX = true;
    this.fzY = true;
    this.fzZ = true;
    this.fAa = true;
    this.faZ = true;
    GMTrace.o(4160346914816L, 30997);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4160481132544L, 30998);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4160481132544L, 30998);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fAb == k)
      {
        this.field_productId = paramCursor.getString(i);
        this.fzW = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fAc == k) {
          this.field_xmlContent = paramCursor.getString(i);
        } else if (fAd == k) {
          this.field_ScanTime = paramCursor.getLong(i);
        } else if (fAe == k) {
          this.field_funcType = paramCursor.getInt(i);
        } else if (fAf == k) {
          this.field_qrcodeUrl = paramCursor.getString(i);
        } else if (fbb == k) {
          this.field_scene = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4160481132544L, 30998);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4160615350272L, 30999);
    ContentValues localContentValues = new ContentValues();
    if (this.fzW) {
      localContentValues.put("productId", this.field_productId);
    }
    if (this.fzX) {
      localContentValues.put("xmlContent", this.field_xmlContent);
    }
    if (this.fzY) {
      localContentValues.put("ScanTime", Long.valueOf(this.field_ScanTime));
    }
    if (this.fzZ) {
      localContentValues.put("funcType", Integer.valueOf(this.field_funcType));
    }
    if (this.fAa) {
      localContentValues.put("qrcodeUrl", this.field_qrcodeUrl);
    }
    if (this.faZ) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4160615350272L, 30999);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */