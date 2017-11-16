package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ec
  extends c
{
  private static final int eZB;
  private static final int eZC;
  public static final String[] eZt;
  private static final int fHU;
  private static final int fHV;
  private static final int fbS;
  private static final int fcc;
  private static final int ffb;
  private static final int fnU;
  private boolean eZx;
  private boolean fHS;
  private boolean fHT;
  private boolean fbP;
  private boolean fcb;
  private boolean feN;
  public long field_msgId;
  public int field_msgSubType;
  public int field_msgType;
  public long field_msgtime;
  public String field_path;
  public long field_size;
  public String field_username;
  private boolean fnP;
  
  static
  {
    GMTrace.i(20404047446016L, 152022);
    eZt = new String[0];
    eZB = "msgId".hashCode();
    fcc = "username".hashCode();
    ffb = "msgType".hashCode();
    fHU = "msgSubType".hashCode();
    fnU = "path".hashCode();
    fbS = "size".hashCode();
    fHV = "msgtime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(20404047446016L, 152022);
  }
  
  public ec()
  {
    GMTrace.i(20403644792832L, 152019);
    this.eZx = true;
    this.fcb = true;
    this.feN = true;
    this.fHS = true;
    this.fnP = true;
    this.fbP = true;
    this.fHT = true;
    GMTrace.o(20403644792832L, 152019);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(20403779010560L, 152020);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(20403779010560L, 152020);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (eZB == k) {
        this.field_msgId = paramCursor.getLong(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fcc == k) {
          this.field_username = paramCursor.getString(i);
        } else if (ffb == k) {
          this.field_msgType = paramCursor.getInt(i);
        } else if (fHU == k) {
          this.field_msgSubType = paramCursor.getInt(i);
        } else if (fnU == k) {
          this.field_path = paramCursor.getString(i);
        } else if (fbS == k) {
          this.field_size = paramCursor.getLong(i);
        } else if (fHV == k) {
          this.field_msgtime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(20403779010560L, 152020);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(20403913228288L, 152021);
    ContentValues localContentValues = new ContentValues();
    if (this.eZx) {
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    }
    if (this.fcb) {
      localContentValues.put("username", this.field_username);
    }
    if (this.feN) {
      localContentValues.put("msgType", Integer.valueOf(this.field_msgType));
    }
    if (this.fHS) {
      localContentValues.put("msgSubType", Integer.valueOf(this.field_msgSubType));
    }
    if (this.fnP) {
      localContentValues.put("path", this.field_path);
    }
    if (this.fbP) {
      localContentValues.put("size", Long.valueOf(this.field_size));
    }
    if (this.fHT) {
      localContentValues.put("msgtime", Long.valueOf(this.field_msgtime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(20403913228288L, 152021);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */