package com.tencent.mm.plugin.shake.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class b
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fcc;
  private static final int oMb;
  private static final int oMc;
  private boolean fcb;
  public boolean field_isshowed;
  public int field_lastshaketime;
  public String field_username;
  private boolean oLZ;
  private boolean oMa;
  
  static
  {
    GMTrace.i(6618007732224L, 49308);
    eZt = new String[0];
    fcc = "username".hashCode();
    oMb = "lastshaketime".hashCode();
    oMc = "isshowed".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(6618007732224L, 49308);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(6617739296768L, 49306);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(6617739296768L, 49306);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
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
        if (oMb == k)
        {
          this.field_lastshaketime = paramCursor.getInt(i);
        }
        else
        {
          if (oMc == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_isshowed = bool;
              break;
            }
          }
          if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(6617739296768L, 49306);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(6617873514496L, 49307);
    ContentValues localContentValues = new ContentValues();
    if (this.field_username == null) {
      this.field_username = "";
    }
    if (this.fcb) {
      localContentValues.put("username", this.field_username);
    }
    if (this.oLZ) {
      localContentValues.put("lastshaketime", Integer.valueOf(this.field_lastshaketime));
    }
    if (this.oMa) {
      localContentValues.put("isshowed", Boolean.valueOf(this.field_isshowed));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(6617873514496L, 49307);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */