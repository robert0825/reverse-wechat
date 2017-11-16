package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bt
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fcc;
  private static final int fsS;
  private static final int fsT;
  private static final int fsW;
  private static final int ftc;
  private static final int ftd;
  private static final int fte;
  private boolean fcb;
  public String field_appusername;
  public int field_likecount;
  public String field_rankID;
  public int field_ranknum;
  public int field_score;
  public int field_selfLikeState;
  public String field_username;
  private boolean fsP;
  private boolean fsQ;
  private boolean fsV;
  private boolean fsZ;
  private boolean fta;
  private boolean ftb;
  
  static
  {
    GMTrace.i(4149072625664L, 30913);
    eZt = new String[0];
    fsS = "rankID".hashCode();
    fsT = "appusername".hashCode();
    fcc = "username".hashCode();
    ftc = "ranknum".hashCode();
    fsW = "score".hashCode();
    ftd = "likecount".hashCode();
    fte = "selfLikeState".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4149072625664L, 30913);
  }
  
  public bt()
  {
    GMTrace.i(4148669972480L, 30910);
    this.fsP = true;
    this.fsQ = true;
    this.fcb = true;
    this.fsZ = true;
    this.fsV = true;
    this.fta = true;
    this.ftb = true;
    GMTrace.o(4148669972480L, 30910);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4148804190208L, 30911);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4148804190208L, 30911);
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
        } else if (ftc == k) {
          this.field_ranknum = paramCursor.getInt(i);
        } else if (fsW == k) {
          this.field_score = paramCursor.getInt(i);
        } else if (ftd == k) {
          this.field_likecount = paramCursor.getInt(i);
        } else if (fte == k) {
          this.field_selfLikeState = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4148804190208L, 30911);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4148938407936L, 30912);
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
    if (this.fsZ) {
      localContentValues.put("ranknum", Integer.valueOf(this.field_ranknum));
    }
    if (this.fsV) {
      localContentValues.put("score", Integer.valueOf(this.field_score));
    }
    if (this.fta) {
      localContentValues.put("likecount", Integer.valueOf(this.field_likecount));
    }
    if (this.ftb) {
      localContentValues.put("selfLikeState", Integer.valueOf(this.field_selfLikeState));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4148938407936L, 30912);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */