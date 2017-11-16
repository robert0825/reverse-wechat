package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class x
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faE;
  private static final int ffQ;
  private static final int ffR;
  private static final int ffS;
  private static final int ffT;
  private static final int ffU;
  private static final int ffV;
  private static final int ffW;
  private boolean fai;
  private boolean ffJ;
  private boolean ffK;
  private boolean ffL;
  private boolean ffM;
  private boolean ffN;
  private boolean ffO;
  private boolean ffP;
  public int field_qyUin;
  public int field_userFlag;
  public String field_userName;
  public int field_userUin;
  public long field_wwCorpId;
  public int field_wwExposeTimes;
  public int field_wwMaxExposeTimes;
  public long field_wwUserVid;
  
  static
  {
    GMTrace.i(4162897051648L, 31016);
    eZt = new String[0];
    faE = "userName".hashCode();
    ffQ = "qyUin".hashCode();
    ffR = "userUin".hashCode();
    ffS = "userFlag".hashCode();
    ffT = "wwExposeTimes".hashCode();
    ffU = "wwMaxExposeTimes".hashCode();
    ffV = "wwCorpId".hashCode();
    ffW = "wwUserVid".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4162897051648L, 31016);
  }
  
  public x()
  {
    GMTrace.i(4162494398464L, 31013);
    this.fai = true;
    this.ffJ = true;
    this.ffK = true;
    this.ffL = true;
    this.ffM = true;
    this.ffN = true;
    this.ffO = true;
    this.ffP = true;
    GMTrace.o(4162494398464L, 31013);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4162628616192L, 31014);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4162628616192L, 31014);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (faE == k)
      {
        this.field_userName = paramCursor.getString(i);
        this.fai = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (ffQ == k) {
          this.field_qyUin = paramCursor.getInt(i);
        } else if (ffR == k) {
          this.field_userUin = paramCursor.getInt(i);
        } else if (ffS == k) {
          this.field_userFlag = paramCursor.getInt(i);
        } else if (ffT == k) {
          this.field_wwExposeTimes = paramCursor.getInt(i);
        } else if (ffU == k) {
          this.field_wwMaxExposeTimes = paramCursor.getInt(i);
        } else if (ffV == k) {
          this.field_wwCorpId = paramCursor.getLong(i);
        } else if (ffW == k) {
          this.field_wwUserVid = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4162628616192L, 31014);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4162762833920L, 31015);
    ContentValues localContentValues = new ContentValues();
    if (this.fai) {
      localContentValues.put("userName", this.field_userName);
    }
    if (this.ffJ) {
      localContentValues.put("qyUin", Integer.valueOf(this.field_qyUin));
    }
    if (this.ffK) {
      localContentValues.put("userUin", Integer.valueOf(this.field_userUin));
    }
    if (this.ffL) {
      localContentValues.put("userFlag", Integer.valueOf(this.field_userFlag));
    }
    if (this.ffM) {
      localContentValues.put("wwExposeTimes", Integer.valueOf(this.field_wwExposeTimes));
    }
    if (this.ffN) {
      localContentValues.put("wwMaxExposeTimes", Integer.valueOf(this.field_wwMaxExposeTimes));
    }
    if (this.ffO) {
      localContentValues.put("wwCorpId", Long.valueOf(this.field_wwCorpId));
    }
    if (this.ffP) {
      localContentValues.put("wwUserVid", Long.valueOf(this.field_wwUserVid));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4162762833920L, 31015);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */