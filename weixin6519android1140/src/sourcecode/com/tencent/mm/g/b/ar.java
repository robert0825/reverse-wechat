package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ar
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faO;
  private static final int fmN;
  private boolean fas;
  public byte[] field_content;
  public String field_designerIDAndType;
  private boolean fmM;
  
  static
  {
    GMTrace.i(4166789365760L, 31045);
    eZt = new String[0];
    fmN = "designerIDAndType".hashCode();
    faO = "content".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4166789365760L, 31045);
  }
  
  public ar()
  {
    GMTrace.i(4166386712576L, 31042);
    this.fmM = true;
    this.fas = true;
    GMTrace.o(4166386712576L, 31042);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4166520930304L, 31043);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4166520930304L, 31043);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fmN == k)
      {
        this.field_designerIDAndType = paramCursor.getString(i);
        this.fmM = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (faO == k) {
          this.field_content = paramCursor.getBlob(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4166520930304L, 31043);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4166655148032L, 31044);
    ContentValues localContentValues = new ContentValues();
    if (this.fmM) {
      localContentValues.put("designerIDAndType", this.field_designerIDAndType);
    }
    if (this.fas) {
      localContentValues.put("content", this.field_content);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4166655148032L, 31044);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */