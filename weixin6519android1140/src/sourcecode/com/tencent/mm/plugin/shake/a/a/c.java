package com.tencent.mm.plugin.shake.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;

public abstract class c
  extends com.tencent.mm.sdk.e.c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fcc;
  private static final int fem;
  private static final int ftO;
  private static final int oMf;
  private static final int oMg;
  private boolean fcb;
  private boolean fei;
  public long field_createtime;
  public String field_deeplink;
  public String field_iconurl;
  public String field_title;
  public String field_username;
  private boolean ftJ;
  private boolean oMd;
  private boolean oMe;
  
  static
  {
    GMTrace.i(6617068208128L, 49301);
    eZt = new String[0];
    fcc = "username".hashCode();
    oMf = "deeplink".hashCode();
    fem = "title".hashCode();
    oMg = "iconurl".hashCode();
    ftO = "createtime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(6617068208128L, 49301);
  }
  
  public c()
  {
    GMTrace.i(6616665554944L, 49298);
    this.fcb = true;
    this.oMd = true;
    this.fei = true;
    this.oMe = true;
    this.ftJ = true;
    GMTrace.o(6616665554944L, 49298);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(6616799772672L, 49299);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(6616799772672L, 49299);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fcc == k)
      {
        this.field_username = paramCursor.getString(i);
        this.fcb = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (oMf == k) {
          this.field_deeplink = paramCursor.getString(i);
        } else if (fem == k) {
          this.field_title = paramCursor.getString(i);
        } else if (oMg == k) {
          this.field_iconurl = paramCursor.getString(i);
        } else if (ftO == k) {
          this.field_createtime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(6616799772672L, 49299);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(6616933990400L, 49300);
    ContentValues localContentValues = new ContentValues();
    if (this.field_username == null) {
      this.field_username = "";
    }
    if (this.fcb) {
      localContentValues.put("username", this.field_username);
    }
    if (this.field_deeplink == null) {
      this.field_deeplink = "";
    }
    if (this.oMd) {
      localContentValues.put("deeplink", this.field_deeplink);
    }
    if (this.field_title == null) {
      this.field_title = "";
    }
    if (this.fei) {
      localContentValues.put("title", this.field_title);
    }
    if (this.field_iconurl == null) {
      this.field_iconurl = "";
    }
    if (this.oMe) {
      localContentValues.put("iconurl", this.field_iconurl);
    }
    if (this.ftJ) {
      localContentValues.put("createtime", Long.valueOf(this.field_createtime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(6616933990400L, 49300);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */