package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dp
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fFq;
  private static final int fFr;
  private static final int fFs;
  private static final int fFt;
  private static final int fFu;
  private static final int fFv;
  private boolean fFk;
  private boolean fFl;
  private boolean fFm;
  private boolean fFn;
  private boolean fFo;
  private boolean fFp;
  public int field_wallet_balance;
  public String field_wallet_name;
  public int field_wallet_selected;
  public String field_wallet_tpa_country;
  public int field_wallet_tpa_country_mask;
  public int field_wallet_type;
  
  static
  {
    GMTrace.i(4145851400192L, 30889);
    eZt = new String[0];
    fFq = "wallet_tpa_country".hashCode();
    fFr = "wallet_type".hashCode();
    fFs = "wallet_name".hashCode();
    fFt = "wallet_selected".hashCode();
    fFu = "wallet_balance".hashCode();
    fFv = "wallet_tpa_country_mask".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4145851400192L, 30889);
  }
  
  public dp()
  {
    GMTrace.i(4145448747008L, 30886);
    this.fFk = true;
    this.fFl = true;
    this.fFm = true;
    this.fFn = true;
    this.fFo = true;
    this.fFp = true;
    GMTrace.o(4145448747008L, 30886);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4145582964736L, 30887);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4145582964736L, 30887);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fFq == k)
      {
        this.field_wallet_tpa_country = paramCursor.getString(i);
        this.fFk = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fFr == k) {
          this.field_wallet_type = paramCursor.getInt(i);
        } else if (fFs == k) {
          this.field_wallet_name = paramCursor.getString(i);
        } else if (fFt == k) {
          this.field_wallet_selected = paramCursor.getInt(i);
        } else if (fFu == k) {
          this.field_wallet_balance = paramCursor.getInt(i);
        } else if (fFv == k) {
          this.field_wallet_tpa_country_mask = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4145582964736L, 30887);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4145717182464L, 30888);
    ContentValues localContentValues = new ContentValues();
    if (this.fFk) {
      localContentValues.put("wallet_tpa_country", this.field_wallet_tpa_country);
    }
    if (this.fFl) {
      localContentValues.put("wallet_type", Integer.valueOf(this.field_wallet_type));
    }
    if (this.fFm) {
      localContentValues.put("wallet_name", this.field_wallet_name);
    }
    if (this.fFn) {
      localContentValues.put("wallet_selected", Integer.valueOf(this.field_wallet_selected));
    }
    if (this.fFo) {
      localContentValues.put("wallet_balance", Integer.valueOf(this.field_wallet_balance));
    }
    if (this.fFp) {
      localContentValues.put("wallet_tpa_country_mask", Integer.valueOf(this.field_wallet_tpa_country_mask));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4145717182464L, 30888);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */