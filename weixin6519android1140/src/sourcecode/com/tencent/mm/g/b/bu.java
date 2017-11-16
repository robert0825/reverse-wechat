package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bu
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int ftj;
  private static final int ftk;
  private static final int ftl;
  private static final int ftm;
  public String field_contactId;
  public String field_sortKey;
  public String field_systemAddressBookUsername;
  public String field_wechatUsername;
  private boolean ftf;
  private boolean ftg;
  private boolean fth;
  private boolean fti;
  
  static
  {
    GMTrace.i(4162360180736L, 31012);
    eZt = new String[0];
    ftj = "wechatUsername".hashCode();
    ftk = "systemAddressBookUsername".hashCode();
    ftl = "contactId".hashCode();
    ftm = "sortKey".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4162360180736L, 31012);
  }
  
  public bu()
  {
    GMTrace.i(4161957527552L, 31009);
    this.ftf = true;
    this.ftg = true;
    this.fth = true;
    this.fti = true;
    GMTrace.o(4161957527552L, 31009);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4162091745280L, 31010);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4162091745280L, 31010);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (ftj == k) {
        this.field_wechatUsername = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (ftk == k) {
          this.field_systemAddressBookUsername = paramCursor.getString(i);
        } else if (ftl == k) {
          this.field_contactId = paramCursor.getString(i);
        } else if (ftm == k) {
          this.field_sortKey = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4162091745280L, 31010);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4162225963008L, 31011);
    ContentValues localContentValues = new ContentValues();
    if (this.ftf) {
      localContentValues.put("wechatUsername", this.field_wechatUsername);
    }
    if (this.ftg) {
      localContentValues.put("systemAddressBookUsername", this.field_systemAddressBookUsername);
    }
    if (this.fth) {
      localContentValues.put("contactId", this.field_contactId);
    }
    if (this.fti) {
      localContentValues.put("sortKey", this.field_sortKey);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4162225963008L, 31011);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */