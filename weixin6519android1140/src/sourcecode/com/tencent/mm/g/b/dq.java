package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dq
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fFA;
  private static final int fFB;
  private static final int fFC;
  private static final int fFD;
  private static final int fri;
  private static final int fyR;
  private boolean fFw;
  private boolean fFx;
  private boolean fFy;
  private boolean fFz;
  public int field_hbStatus;
  public int field_hbType;
  public String field_mNativeUrl;
  public long field_receiveAmount;
  public int field_receiveStatus;
  public long field_receiveTime;
  private boolean fqZ;
  private boolean fyP;
  
  static
  {
    GMTrace.i(4148535754752L, 30909);
    eZt = new String[0];
    fFA = "mNativeUrl".hashCode();
    fFB = "hbType".hashCode();
    fFC = "receiveAmount".hashCode();
    fri = "receiveTime".hashCode();
    fyR = "receiveStatus".hashCode();
    fFD = "hbStatus".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4148535754752L, 30909);
  }
  
  public dq()
  {
    GMTrace.i(4148133101568L, 30906);
    this.fFw = true;
    this.fFx = true;
    this.fFy = true;
    this.fqZ = true;
    this.fyP = true;
    this.fFz = true;
    GMTrace.o(4148133101568L, 30906);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4148267319296L, 30907);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4148267319296L, 30907);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fFA == k)
      {
        this.field_mNativeUrl = paramCursor.getString(i);
        this.fFw = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fFB == k) {
          this.field_hbType = paramCursor.getInt(i);
        } else if (fFC == k) {
          this.field_receiveAmount = paramCursor.getLong(i);
        } else if (fri == k) {
          this.field_receiveTime = paramCursor.getLong(i);
        } else if (fyR == k) {
          this.field_receiveStatus = paramCursor.getInt(i);
        } else if (fFD == k) {
          this.field_hbStatus = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4148267319296L, 30907);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4148401537024L, 30908);
    ContentValues localContentValues = new ContentValues();
    if (this.fFw) {
      localContentValues.put("mNativeUrl", this.field_mNativeUrl);
    }
    if (this.fFx) {
      localContentValues.put("hbType", Integer.valueOf(this.field_hbType));
    }
    if (this.fFy) {
      localContentValues.put("receiveAmount", Long.valueOf(this.field_receiveAmount));
    }
    if (this.fqZ) {
      localContentValues.put("receiveTime", Long.valueOf(this.field_receiveTime));
    }
    if (this.fyP) {
      localContentValues.put("receiveStatus", Integer.valueOf(this.field_receiveStatus));
    }
    if (this.fFz) {
      localContentValues.put("hbStatus", Integer.valueOf(this.field_hbStatus));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4148401537024L, 30908);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */