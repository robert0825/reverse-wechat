package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ah
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faG;
  private static final int fjJ;
  private static final int fjK;
  private static final int fjL;
  private static final int fjM;
  private static final int fjN;
  private boolean fak;
  public long field_createTime;
  public boolean field_isTemporary;
  public int field_labelID;
  public String field_labelName;
  public String field_labelPYFull;
  public String field_labelPYShort;
  private boolean fjE;
  private boolean fjF;
  private boolean fjG;
  private boolean fjH;
  private boolean fjI;
  
  static
  {
    GMTrace.i(4134577111040L, 30805);
    eZt = new String[0];
    fjJ = "labelID".hashCode();
    fjK = "labelName".hashCode();
    fjL = "labelPYFull".hashCode();
    fjM = "labelPYShort".hashCode();
    faG = "createTime".hashCode();
    fjN = "isTemporary".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4134577111040L, 30805);
  }
  
  public ah()
  {
    GMTrace.i(4134174457856L, 30802);
    this.fjE = true;
    this.fjF = true;
    this.fjG = true;
    this.fjH = true;
    this.fak = true;
    this.fjI = true;
    GMTrace.o(4134174457856L, 30802);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4134308675584L, 30803);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4134308675584L, 30803);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fjJ == k)
      {
        this.field_labelID = paramCursor.getInt(i);
        this.fjE = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fjK == k)
        {
          this.field_labelName = paramCursor.getString(i);
        }
        else if (fjL == k)
        {
          this.field_labelPYFull = paramCursor.getString(i);
        }
        else if (fjM == k)
        {
          this.field_labelPYShort = paramCursor.getString(i);
        }
        else if (faG == k)
        {
          this.field_createTime = paramCursor.getLong(i);
        }
        else
        {
          if (fjN == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_isTemporary = bool;
              break;
            }
          }
          if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4134308675584L, 30803);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4134442893312L, 30804);
    ContentValues localContentValues = new ContentValues();
    if (this.fjE) {
      localContentValues.put("labelID", Integer.valueOf(this.field_labelID));
    }
    if (this.fjF) {
      localContentValues.put("labelName", this.field_labelName);
    }
    if (this.fjG) {
      localContentValues.put("labelPYFull", this.field_labelPYFull);
    }
    if (this.fjH) {
      localContentValues.put("labelPYShort", this.field_labelPYShort);
    }
    if (this.fak) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.fjI) {
      localContentValues.put("isTemporary", Boolean.valueOf(this.field_isTemporary));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4134442893312L, 30804);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */