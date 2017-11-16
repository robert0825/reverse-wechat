package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public abstract class cp
  extends c
{
  private static final int eZB;
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int faJ;
  private static final int fem;
  private static final int fmH;
  private static final int foa;
  private static final int fow;
  private static final int fyL;
  private static final int fyM;
  private static final int fyN;
  private boolean eZF;
  private boolean eZx;
  private boolean fan;
  private boolean fei;
  public tt field_dataProto;
  public String field_desc;
  public String field_favFrom;
  public int field_localId;
  public long field_msgId;
  public long field_oriMsgId;
  public int field_status;
  public String field_title;
  public String field_toUser;
  public int field_type;
  private boolean fmD;
  private boolean fnY;
  private boolean foi;
  private boolean fyI;
  private boolean fyJ;
  private boolean fyK;
  
  static
  {
    GMTrace.i(4134040240128L, 30801);
    eZt = new String[0];
    foa = "localId".hashCode();
    eZB = "msgId".hashCode();
    fyL = "oriMsgId".hashCode();
    fow = "toUser".hashCode();
    fem = "title".hashCode();
    fmH = "desc".hashCode();
    fyM = "dataProto".hashCode();
    faJ = "type".hashCode();
    eZI = "status".hashCode();
    fyN = "favFrom".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4134040240128L, 30801);
  }
  
  public cp()
  {
    GMTrace.i(4133637586944L, 30798);
    this.fnY = true;
    this.eZx = true;
    this.fyI = true;
    this.foi = true;
    this.fei = true;
    this.fmD = true;
    this.fyJ = true;
    this.fan = true;
    this.eZF = true;
    this.fyK = true;
    GMTrace.o(4133637586944L, 30798);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4133771804672L, 30799);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4133771804672L, 30799);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (foa == k)
      {
        this.field_localId = paramCursor.getInt(i);
        this.fnY = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (eZB == k) {
          this.field_msgId = paramCursor.getLong(i);
        } else if (fyL == k) {
          this.field_oriMsgId = paramCursor.getLong(i);
        } else if (fow == k) {
          this.field_toUser = paramCursor.getString(i);
        } else if (fem == k) {
          this.field_title = paramCursor.getString(i);
        } else if (fmH == k) {
          this.field_desc = paramCursor.getString(i);
        } else if (fyM == k) {
          try
          {
            byte[] arrayOfByte = paramCursor.getBlob(i);
            if ((arrayOfByte == null) || (arrayOfByte.length <= 0)) {
              continue;
            }
            this.field_dataProto = ((tt)new tt().aD(arrayOfByte));
          }
          catch (IOException localIOException)
          {
            w.e("MicroMsg.SDK.BaseRecordMessageInfo", localIOException.getMessage());
          }
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (fyN == k) {
          this.field_favFrom = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4133771804672L, 30799);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4133906022400L, 30800);
    ContentValues localContentValues = new ContentValues();
    if (this.fnY) {
      localContentValues.put("localId", Integer.valueOf(this.field_localId));
    }
    if (this.eZx) {
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    }
    if (this.fyI) {
      localContentValues.put("oriMsgId", Long.valueOf(this.field_oriMsgId));
    }
    if (this.field_toUser == null) {
      this.field_toUser = "";
    }
    if (this.foi) {
      localContentValues.put("toUser", this.field_toUser);
    }
    if (this.fei) {
      localContentValues.put("title", this.field_title);
    }
    if (this.fmD) {
      localContentValues.put("desc", this.field_desc);
    }
    if ((this.fyJ) && (this.field_dataProto != null)) {}
    try
    {
      localContentValues.put("dataProto", this.field_dataProto.toByteArray());
      if (this.fan) {
        localContentValues.put("type", Integer.valueOf(this.field_type));
      }
      if (this.eZF) {
        localContentValues.put("status", Integer.valueOf(this.field_status));
      }
      if (this.fyK) {
        localContentValues.put("favFrom", this.field_favFrom);
      }
      if (this.vmr > 0L) {
        localContentValues.put("rowid", Long.valueOf(this.vmr));
      }
      GMTrace.o(4133906022400L, 30800);
      return localContentValues;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.e("MicroMsg.SDK.BaseRecordMessageInfo", localIOException.getMessage());
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */