package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cs
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fmi;
  private static final int ftO;
  private static final int fzU;
  private static final int fzV;
  public long field_createtime;
  public String field_devicetype;
  public String field_name;
  public String field_uid;
  private boolean flJ;
  private boolean ftJ;
  private boolean fzS;
  private boolean fzT;
  
  static
  {
    GMTrace.i(4159675826176L, 30992);
    eZt = new String[0];
    fzU = "uid".hashCode();
    fmi = "name".hashCode();
    fzV = "devicetype".hashCode();
    ftO = "createtime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4159675826176L, 30992);
  }
  
  public cs()
  {
    GMTrace.i(4159273172992L, 30989);
    this.fzS = true;
    this.flJ = true;
    this.fzT = true;
    this.ftJ = true;
    GMTrace.o(4159273172992L, 30989);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4159407390720L, 30990);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4159407390720L, 30990);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fzU == k)
      {
        this.field_uid = paramCursor.getString(i);
        this.fzS = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fmi == k) {
          this.field_name = paramCursor.getString(i);
        } else if (fzV == k) {
          this.field_devicetype = paramCursor.getString(i);
        } else if (ftO == k) {
          this.field_createtime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4159407390720L, 30990);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4159541608448L, 30991);
    ContentValues localContentValues = new ContentValues();
    if (this.field_uid == null) {
      this.field_uid = "";
    }
    if (this.fzS) {
      localContentValues.put("uid", this.field_uid);
    }
    if (this.field_name == null) {
      this.field_name = "";
    }
    if (this.flJ) {
      localContentValues.put("name", this.field_name);
    }
    if (this.field_devicetype == null) {
      this.field_devicetype = "";
    }
    if (this.fzT) {
      localContentValues.put("devicetype", this.field_devicetype);
    }
    if (this.ftJ) {
      localContentValues.put("createtime", Long.valueOf(this.field_createtime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4159541608448L, 30991);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */