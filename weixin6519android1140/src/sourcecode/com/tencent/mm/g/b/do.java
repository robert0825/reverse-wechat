package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class do
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fFf;
  private static final int fFg;
  private static final int fFh;
  private static final int fFi;
  private static final int fFj;
  private boolean fFa;
  private boolean fFb;
  private boolean fFc;
  private boolean fFd;
  private boolean fFe;
  public String field_banner_list;
  public String field_function_list;
  public String field_new_list;
  public String field_type_name_list;
  public int field_wallet_region;
  
  static
  {
    GMTrace.i(4125852958720L, 30740);
    eZt = new String[0];
    fFf = "wallet_region".hashCode();
    fFg = "function_list".hashCode();
    fFh = "new_list".hashCode();
    fFi = "banner_list".hashCode();
    fFj = "type_name_list".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4125852958720L, 30740);
  }
  
  public do()
  {
    GMTrace.i(4125450305536L, 30737);
    this.fFa = true;
    this.fFb = true;
    this.fFc = true;
    this.fFd = true;
    this.fFe = true;
    GMTrace.o(4125450305536L, 30737);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4125584523264L, 30738);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4125584523264L, 30738);
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
        if (fFg == k) {
          this.field_function_list = paramCursor.getString(i);
        } else if (fFh == k) {
          this.field_new_list = paramCursor.getString(i);
        } else if (fFi == k) {
          this.field_banner_list = paramCursor.getString(i);
        } else if (fFj == k) {
          this.field_type_name_list = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4125584523264L, 30738);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4125718740992L, 30739);
    ContentValues localContentValues = new ContentValues();
    if (this.fFa) {
      localContentValues.put("wallet_region", Integer.valueOf(this.field_wallet_region));
    }
    if (this.fFb) {
      localContentValues.put("function_list", this.field_function_list);
    }
    if (this.fFc) {
      localContentValues.put("new_list", this.field_new_list);
    }
    if (this.fFd) {
      localContentValues.put("banner_list", this.field_banner_list);
    }
    if (this.fFe) {
      localContentValues.put("type_name_list", this.field_type_name_list);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4125718740992L, 30739);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */