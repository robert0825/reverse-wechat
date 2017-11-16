package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dn
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fEX;
  private static final int fEY;
  private static final int fEZ;
  private boolean fEU;
  private boolean fEV;
  private boolean fEW;
  public String field_bulletin_content;
  public String field_bulletin_scene;
  public String field_bulletin_url;
  
  static
  {
    GMTrace.i(4153367592960L, 30945);
    eZt = new String[0];
    fEX = "bulletin_scene".hashCode();
    fEY = "bulletin_content".hashCode();
    fEZ = "bulletin_url".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4153367592960L, 30945);
  }
  
  public dn()
  {
    GMTrace.i(4152964939776L, 30942);
    this.fEU = true;
    this.fEV = true;
    this.fEW = true;
    GMTrace.o(4152964939776L, 30942);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4153099157504L, 30943);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4153099157504L, 30943);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fEX == k)
      {
        this.field_bulletin_scene = paramCursor.getString(i);
        this.fEU = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fEY == k) {
          this.field_bulletin_content = paramCursor.getString(i);
        } else if (fEZ == k) {
          this.field_bulletin_url = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4153099157504L, 30943);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4153233375232L, 30944);
    ContentValues localContentValues = new ContentValues();
    if (this.fEU) {
      localContentValues.put("bulletin_scene", this.field_bulletin_scene);
    }
    if (this.fEV) {
      localContentValues.put("bulletin_content", this.field_bulletin_content);
    }
    if (this.fEW) {
      localContentValues.put("bulletin_url", this.field_bulletin_url);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4153233375232L, 30944);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */