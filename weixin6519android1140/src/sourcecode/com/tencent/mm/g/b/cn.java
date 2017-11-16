package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cn
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fbM;
  private static final int fbb;
  private static final int fcK;
  private static final int fca;
  private boolean faZ;
  private boolean fbL;
  private boolean fbW;
  private boolean fcD;
  public String field_key;
  public int field_scene;
  public long field_updateTime;
  public int field_version;
  
  static
  {
    GMTrace.i(19674574094336L, 146587);
    eZt = new String[0];
    fbM = "key".hashCode();
    fcK = "version".hashCode();
    fbb = "scene".hashCode();
    fca = "updateTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(19674574094336L, 146587);
  }
  
  public cn()
  {
    GMTrace.i(19674171441152L, 146584);
    this.fbL = true;
    this.fcD = true;
    this.faZ = true;
    this.fbW = true;
    GMTrace.o(19674171441152L, 146584);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(19674305658880L, 146585);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(19674305658880L, 146585);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fbM == k) {
        this.field_key = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fcK == k) {
          this.field_version = paramCursor.getInt(i);
        } else if (fbb == k) {
          this.field_scene = paramCursor.getInt(i);
        } else if (fca == k) {
          this.field_updateTime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(19674305658880L, 146585);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(19674439876608L, 146586);
    ContentValues localContentValues = new ContentValues();
    if (this.fbL) {
      localContentValues.put("key", this.field_key);
    }
    if (this.fcD) {
      localContentValues.put("version", Integer.valueOf(this.field_version));
    }
    if (this.faZ) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.fbW) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(19674439876608L, 146586);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */