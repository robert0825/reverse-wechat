package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cj
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int fbu;
  private static final int fds;
  private static final int fyn;
  private static final int fyo;
  private static final int fyp;
  private boolean eZF;
  private boolean fbd;
  private boolean fcW;
  public String field_appId;
  public int field_msgState;
  public int field_msgTypeFlag;
  public String field_packageName;
  public int field_sceneFlag;
  public int field_status;
  private boolean fyk;
  private boolean fyl;
  private boolean fym;
  
  static
  {
    GMTrace.i(4118470983680L, 30685);
    eZt = new String[0];
    fbu = "appId".hashCode();
    fds = "packageName".hashCode();
    eZI = "status".hashCode();
    fyn = "sceneFlag".hashCode();
    fyo = "msgTypeFlag".hashCode();
    fyp = "msgState".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4118470983680L, 30685);
  }
  
  public cj()
  {
    GMTrace.i(4118068330496L, 30682);
    this.fbd = true;
    this.fcW = true;
    this.eZF = true;
    this.fyk = true;
    this.fyl = true;
    this.fym = true;
    GMTrace.o(4118068330496L, 30682);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4118202548224L, 30683);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4118202548224L, 30683);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fbu == k)
      {
        this.field_appId = paramCursor.getString(i);
        this.fbd = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fds == k) {
          this.field_packageName = paramCursor.getString(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (fyn == k) {
          this.field_sceneFlag = paramCursor.getInt(i);
        } else if (fyo == k) {
          this.field_msgTypeFlag = paramCursor.getInt(i);
        } else if (fyp == k) {
          this.field_msgState = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4118202548224L, 30683);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4118336765952L, 30684);
    ContentValues localContentValues = new ContentValues();
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fcW) {
      localContentValues.put("packageName", this.field_packageName);
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fyk) {
      localContentValues.put("sceneFlag", Integer.valueOf(this.field_sceneFlag));
    }
    if (this.fyl) {
      localContentValues.put("msgTypeFlag", Integer.valueOf(this.field_msgTypeFlag));
    }
    if (this.fym) {
      localContentValues.put("msgState", Integer.valueOf(this.field_msgState));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4118336765952L, 30684);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */