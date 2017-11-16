package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class a
  extends c
{
  private static final int eZA;
  private static final int eZB;
  private static final int eZC;
  public static final String[] eZt;
  private static final int eZy;
  private static final int eZz;
  private boolean eZu;
  private boolean eZv;
  private boolean eZw;
  private boolean eZx;
  public String field_chatroom;
  public boolean field_insertmsg;
  public long field_msgId;
  public String field_payMsgId;
  
  static
  {
    GMTrace.i(4135650852864L, 30813);
    eZt = new String[0];
    eZy = "payMsgId".hashCode();
    eZz = "insertmsg".hashCode();
    eZA = "chatroom".hashCode();
    eZB = "msgId".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4135650852864L, 30813);
  }
  
  public a()
  {
    GMTrace.i(4135248199680L, 30810);
    this.eZu = true;
    this.eZv = true;
    this.eZw = true;
    this.eZx = true;
    GMTrace.o(4135248199680L, 30810);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4135382417408L, 30811);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4135382417408L, 30811);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (eZy == k)
      {
        this.field_payMsgId = paramCursor.getString(i);
        this.eZu = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (eZz == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_insertmsg = bool;
            break;
          }
        }
        if (eZA == k) {
          this.field_chatroom = paramCursor.getString(i);
        } else if (eZB == k) {
          this.field_msgId = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4135382417408L, 30811);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4135516635136L, 30812);
    ContentValues localContentValues = new ContentValues();
    if (this.eZu) {
      localContentValues.put("payMsgId", this.field_payMsgId);
    }
    if (this.eZv) {
      localContentValues.put("insertmsg", Boolean.valueOf(this.field_insertmsg));
    }
    if (this.eZw) {
      localContentValues.put("chatroom", this.field_chatroom);
    }
    if (this.eZx) {
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4135516635136L, 30812);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */