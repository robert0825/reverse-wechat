package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bq
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fcc;
  private static final int fpb;
  private static final int fsS;
  private static final int fsT;
  private static final int fsU;
  private boolean fcb;
  public String field_appusername;
  public String field_liketips;
  public String field_rankID;
  public int field_timestamp;
  public String field_username;
  private boolean foR;
  private boolean fsP;
  private boolean fsQ;
  private boolean fsR;
  
  static
  {
    GMTrace.i(4129611055104L, 30768);
    eZt = new String[0];
    fsS = "rankID".hashCode();
    fsT = "appusername".hashCode();
    fcc = "username".hashCode();
    fpb = "timestamp".hashCode();
    fsU = "liketips".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4129611055104L, 30768);
  }
  
  public bq()
  {
    GMTrace.i(4129208401920L, 30765);
    this.fsP = true;
    this.fsQ = true;
    this.fcb = true;
    this.foR = true;
    this.fsR = true;
    GMTrace.o(4129208401920L, 30765);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4129342619648L, 30766);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4129342619648L, 30766);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fsS == k) {
        this.field_rankID = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fsT == k) {
          this.field_appusername = paramCursor.getString(i);
        } else if (fcc == k) {
          this.field_username = paramCursor.getString(i);
        } else if (fpb == k) {
          this.field_timestamp = paramCursor.getInt(i);
        } else if (fsU == k) {
          this.field_liketips = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4129342619648L, 30766);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4129476837376L, 30767);
    ContentValues localContentValues = new ContentValues();
    if (this.fsP) {
      localContentValues.put("rankID", this.field_rankID);
    }
    if (this.fsQ) {
      localContentValues.put("appusername", this.field_appusername);
    }
    if (this.fcb) {
      localContentValues.put("username", this.field_username);
    }
    if (this.foR) {
      localContentValues.put("timestamp", Integer.valueOf(this.field_timestamp));
    }
    if (this.field_liketips == null) {
      this.field_liketips = "";
    }
    if (this.fsR) {
      localContentValues.put("liketips", this.field_liketips);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4129476837376L, 30767);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */