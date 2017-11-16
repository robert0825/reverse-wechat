package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dl
  extends c
{
  private static final int eZB;
  private static final int eZC;
  public static final String[] eZt;
  private static final int fDD;
  private static final int faO;
  private boolean eZx;
  private boolean fDC;
  private boolean fas;
  public String field_cmsgId;
  public String field_content;
  public long field_msgId;
  
  static
  {
    GMTrace.i(4160212697088L, 30996);
    eZt = new String[0];
    eZB = "msgId".hashCode();
    fDD = "cmsgId".hashCode();
    faO = "content".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4160212697088L, 30996);
  }
  
  public dl()
  {
    GMTrace.i(4159810043904L, 30993);
    this.eZx = true;
    this.fDC = true;
    this.fas = true;
    GMTrace.o(4159810043904L, 30993);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4159944261632L, 30994);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4159944261632L, 30994);
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
        if (fDD == k) {
          this.field_cmsgId = paramCursor.getString(i);
        } else if (faO == k) {
          this.field_content = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4159944261632L, 30994);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4160078479360L, 30995);
    ContentValues localContentValues = new ContentValues();
    if (this.eZx) {
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    }
    if (this.fDC) {
      localContentValues.put("cmsgId", this.field_cmsgId);
    }
    if (this.field_content == null) {
      this.field_content = "";
    }
    if (this.fas) {
      localContentValues.put("content", this.field_content);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4160078479360L, 30995);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */