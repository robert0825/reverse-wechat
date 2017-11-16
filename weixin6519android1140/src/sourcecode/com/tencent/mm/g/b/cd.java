package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cd
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fem;
  private static final int fvV;
  private static final int fvW;
  private static final int fvX;
  private static final int fvY;
  private static final int fvZ;
  private static final int fwa;
  private boolean fei;
  public String field_available_otb;
  public int field_is_overdue;
  public int field_is_show_entry;
  public String field_loan_jump_url;
  public int field_red_dot_index;
  public String field_tips;
  public String field_title;
  private boolean fvP;
  private boolean fvQ;
  private boolean fvR;
  private boolean fvS;
  private boolean fvT;
  private boolean fvU;
  
  static
  {
    GMTrace.i(4147462012928L, 30901);
    eZt = new String[0];
    fem = "title".hashCode();
    fvV = "loan_jump_url".hashCode();
    fvW = "red_dot_index".hashCode();
    fvX = "is_show_entry".hashCode();
    fvY = "tips".hashCode();
    fvZ = "is_overdue".hashCode();
    fwa = "available_otb".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4147462012928L, 30901);
  }
  
  public cd()
  {
    GMTrace.i(4147059359744L, 30898);
    this.fei = true;
    this.fvP = true;
    this.fvQ = true;
    this.fvR = true;
    this.fvS = true;
    this.fvT = true;
    this.fvU = true;
    GMTrace.o(4147059359744L, 30898);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4147193577472L, 30899);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4147193577472L, 30899);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fem == k)
      {
        this.field_title = paramCursor.getString(i);
        this.fei = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fvV == k) {
          this.field_loan_jump_url = paramCursor.getString(i);
        } else if (fvW == k) {
          this.field_red_dot_index = paramCursor.getInt(i);
        } else if (fvX == k) {
          this.field_is_show_entry = paramCursor.getInt(i);
        } else if (fvY == k) {
          this.field_tips = paramCursor.getString(i);
        } else if (fvZ == k) {
          this.field_is_overdue = paramCursor.getInt(i);
        } else if (fwa == k) {
          this.field_available_otb = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4147193577472L, 30899);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4147327795200L, 30900);
    ContentValues localContentValues = new ContentValues();
    if (this.fei) {
      localContentValues.put("title", this.field_title);
    }
    if (this.fvP) {
      localContentValues.put("loan_jump_url", this.field_loan_jump_url);
    }
    if (this.fvQ) {
      localContentValues.put("red_dot_index", Integer.valueOf(this.field_red_dot_index));
    }
    if (this.fvR) {
      localContentValues.put("is_show_entry", Integer.valueOf(this.field_is_show_entry));
    }
    if (this.fvS) {
      localContentValues.put("tips", this.field_tips);
    }
    if (this.fvT) {
      localContentValues.put("is_overdue", Integer.valueOf(this.field_is_overdue));
    }
    if (this.fvU) {
      localContentValues.put("available_otb", this.field_available_otb);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4147327795200L, 30900);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */