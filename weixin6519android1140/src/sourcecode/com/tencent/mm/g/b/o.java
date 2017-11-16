package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class o
  extends c
{
  private static final int eZB;
  private static final int eZC;
  public static final String[] eZt;
  private static final int faJ;
  private static final int fbu;
  private static final int fel;
  private static final int fem;
  private static final int fen;
  private static final int feo;
  private boolean eZx;
  private boolean fan;
  private boolean fbd;
  private boolean feh;
  private boolean fei;
  private boolean fej;
  private boolean fek;
  public String field_appId;
  public String field_description;
  public long field_msgId;
  public String field_source;
  public String field_title;
  public int field_type;
  public String field_xml;
  
  static
  {
    GMTrace.i(4137261465600L, 30825);
    eZt = new String[0];
    eZB = "msgId".hashCode();
    fel = "xml".hashCode();
    fbu = "appId".hashCode();
    fem = "title".hashCode();
    fen = "description".hashCode();
    feo = "source".hashCode();
    faJ = "type".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4137261465600L, 30825);
  }
  
  public o()
  {
    GMTrace.i(4136858812416L, 30822);
    this.eZx = true;
    this.feh = true;
    this.fbd = true;
    this.fei = true;
    this.fej = true;
    this.fek = true;
    this.fan = true;
    GMTrace.o(4136858812416L, 30822);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4136993030144L, 30823);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4136993030144L, 30823);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (eZB == k)
      {
        this.field_msgId = paramCursor.getLong(i);
        this.eZx = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fel == k) {
          this.field_xml = paramCursor.getString(i);
        } else if (fbu == k) {
          this.field_appId = paramCursor.getString(i);
        } else if (fem == k) {
          this.field_title = paramCursor.getString(i);
        } else if (fen == k) {
          this.field_description = paramCursor.getString(i);
        } else if (feo == k) {
          this.field_source = paramCursor.getString(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4136993030144L, 30823);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4137127247872L, 30824);
    ContentValues localContentValues = new ContentValues();
    if (this.eZx) {
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    }
    if (this.feh) {
      localContentValues.put("xml", this.field_xml);
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fei) {
      localContentValues.put("title", this.field_title);
    }
    if (this.fej) {
      localContentValues.put("description", this.field_description);
    }
    if (this.fek) {
      localContentValues.put("source", this.field_source);
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4137127247872L, 30824);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */