package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class r
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int feA;
  private static final int fex;
  private boolean feu;
  private boolean fez;
  public String field_msgListDataId;
  public String field_sessionName;
  
  static
  {
    GMTrace.i(17946118193152L, 133709);
    eZt = new String[0];
    feA = "msgListDataId".hashCode();
    fex = "sessionName".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(17946118193152L, 133709);
  }
  
  public r()
  {
    GMTrace.i(17945715539968L, 133706);
    this.fez = true;
    this.feu = true;
    GMTrace.o(17945715539968L, 133706);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(17945849757696L, 133707);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(17945849757696L, 133707);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (feA == k)
      {
        this.field_msgListDataId = paramCursor.getString(i);
        this.fez = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fex == k) {
          this.field_sessionName = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(17945849757696L, 133707);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(17945983975424L, 133708);
    ContentValues localContentValues = new ContentValues();
    if (this.fez) {
      localContentValues.put("msgListDataId", this.field_msgListDataId);
    }
    if (this.field_sessionName == null) {
      this.field_sessionName = "";
    }
    if (this.feu) {
      localContentValues.put("sessionName", this.field_sessionName);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(17945983975424L, 133708);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */