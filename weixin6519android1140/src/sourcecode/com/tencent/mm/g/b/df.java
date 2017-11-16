package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class df
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fCH;
  private static final int fCI;
  private static final int fCJ;
  private static final int flD;
  private boolean fCE;
  private boolean fCF;
  private boolean fCG;
  public int field_count;
  public String field_memberList;
  public long field_tagId;
  public String field_tagName;
  private boolean fld;
  
  static
  {
    GMTrace.i(4116323500032L, 30669);
    eZt = new String[0];
    fCH = "tagId".hashCode();
    fCI = "tagName".hashCode();
    flD = "count".hashCode();
    fCJ = "memberList".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4116323500032L, 30669);
  }
  
  public df()
  {
    GMTrace.i(4115920846848L, 30666);
    this.fCE = true;
    this.fCF = true;
    this.fld = true;
    this.fCG = true;
    GMTrace.o(4115920846848L, 30666);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4116055064576L, 30667);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4116055064576L, 30667);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fCH == k) {
        this.field_tagId = paramCursor.getLong(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fCI == k) {
          this.field_tagName = paramCursor.getString(i);
        } else if (flD == k) {
          this.field_count = paramCursor.getInt(i);
        } else if (fCJ == k) {
          this.field_memberList = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4116055064576L, 30667);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4116189282304L, 30668);
    ContentValues localContentValues = new ContentValues();
    if (this.fCE) {
      localContentValues.put("tagId", Long.valueOf(this.field_tagId));
    }
    if (this.field_tagName == null) {
      this.field_tagName = "";
    }
    if (this.fCF) {
      localContentValues.put("tagName", this.field_tagName);
    }
    if (this.fld) {
      localContentValues.put("count", Integer.valueOf(this.field_count));
    }
    if (this.field_memberList == null) {
      this.field_memberList = "";
    }
    if (this.fCG) {
      localContentValues.put("memberList", this.field_memberList);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4116189282304L, 30668);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */