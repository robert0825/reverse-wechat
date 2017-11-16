package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ds
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fFN;
  private static final int fFf;
  private boolean fFM;
  private boolean fFa;
  public byte[] field_wallet_grey_item_buf;
  public int field_wallet_region;
  
  static
  {
    GMTrace.i(4152293851136L, 30937);
    eZt = new String[0];
    fFf = "wallet_region".hashCode();
    fFN = "wallet_grey_item_buf".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4152293851136L, 30937);
  }
  
  public ds()
  {
    GMTrace.i(4151891197952L, 30934);
    this.fFa = true;
    this.fFM = true;
    GMTrace.o(4151891197952L, 30934);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4152025415680L, 30935);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4152025415680L, 30935);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fFf == k)
      {
        this.field_wallet_region = paramCursor.getInt(i);
        this.fFa = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fFN == k) {
          this.field_wallet_grey_item_buf = paramCursor.getBlob(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4152025415680L, 30935);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4152159633408L, 30936);
    ContentValues localContentValues = new ContentValues();
    if (this.fFa) {
      localContentValues.put("wallet_region", Integer.valueOf(this.field_wallet_region));
    }
    if (this.fFM) {
      localContentValues.put("wallet_grey_item_buf", this.field_wallet_grey_item_buf);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4152159633408L, 30936);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */