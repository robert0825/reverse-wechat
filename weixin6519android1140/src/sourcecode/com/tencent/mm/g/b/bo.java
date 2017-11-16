package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bo
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fcc;
  private static final int fsb;
  private static final int fsc;
  private boolean fcb;
  public String field_championMotto;
  public String field_championUrl;
  public String field_username;
  private boolean frZ;
  private boolean fsa;
  
  static
  {
    GMTrace.i(4123034386432L, 30719);
    eZt = new String[0];
    fcc = "username".hashCode();
    fsb = "championUrl".hashCode();
    fsc = "championMotto".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4123034386432L, 30719);
  }
  
  public bo()
  {
    GMTrace.i(4122631733248L, 30716);
    this.fcb = true;
    this.frZ = true;
    this.fsa = true;
    GMTrace.o(4122631733248L, 30716);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4122765950976L, 30717);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4122765950976L, 30717);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fcc == k) {
        this.field_username = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fsb == k) {
          this.field_championUrl = paramCursor.getString(i);
        } else if (fsc == k) {
          this.field_championMotto = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4122765950976L, 30717);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4122900168704L, 30718);
    ContentValues localContentValues = new ContentValues();
    if (this.fcb) {
      localContentValues.put("username", this.field_username);
    }
    if (this.frZ) {
      localContentValues.put("championUrl", this.field_championUrl);
    }
    if (this.fsa) {
      localContentValues.put("championMotto", this.field_championMotto);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4122900168704L, 30718);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */