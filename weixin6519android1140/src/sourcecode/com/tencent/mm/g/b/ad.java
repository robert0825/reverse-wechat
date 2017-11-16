package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ad
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int fhJ;
  private static final int fhK;
  private static final int fhf;
  private boolean eZF;
  private boolean fgM;
  private boolean fhH;
  private boolean fhI;
  public String field_card_id;
  public String field_code;
  public String field_code_id;
  public int field_status;
  
  static
  {
    GMTrace.i(18825378529280L, 140260);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS CardQrCodeDataInfo_card_id_index ON CardQrCodeDataInfo(card_id)" };
    fhJ = "code_id".hashCode();
    fhf = "card_id".hashCode();
    fhK = "code".hashCode();
    eZI = "status".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(18825378529280L, 140260);
  }
  
  public ad()
  {
    GMTrace.i(18824975876096L, 140257);
    this.fhH = true;
    this.fgM = true;
    this.fhI = true;
    this.eZF = true;
    GMTrace.o(18824975876096L, 140257);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(18825110093824L, 140258);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(18825110093824L, 140258);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fhJ == k) {
        this.field_code_id = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fhf == k) {
          this.field_card_id = paramCursor.getString(i);
        } else if (fhK == k) {
          this.field_code = paramCursor.getString(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(18825110093824L, 140258);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(18825244311552L, 140259);
    ContentValues localContentValues = new ContentValues();
    if (this.fhH) {
      localContentValues.put("code_id", this.field_code_id);
    }
    if (this.fgM) {
      localContentValues.put("card_id", this.field_card_id);
    }
    if (this.fhI) {
      localContentValues.put("code", this.field_code);
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(18825244311552L, 140259);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */