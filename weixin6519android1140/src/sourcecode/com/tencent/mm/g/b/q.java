package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ef;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public abstract class q
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int few;
  private static final int fex;
  private static final int fey;
  private boolean fet;
  private boolean feu;
  private boolean fev;
  public String field_deviceId;
  public ef field_moveTime;
  public String field_sessionName;
  
  static
  {
    GMTrace.i(17944507580416L, 133697);
    eZt = new String[0];
    few = "deviceId".hashCode();
    fex = "sessionName".hashCode();
    fey = "moveTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(17944507580416L, 133697);
  }
  
  public q()
  {
    GMTrace.i(17944104927232L, 133694);
    this.fet = true;
    this.feu = true;
    this.fev = true;
    GMTrace.o(17944104927232L, 133694);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(17944239144960L, 133695);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(17944239144960L, 133695);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (few == k) {
        this.field_deviceId = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fex == k) {
          this.field_sessionName = paramCursor.getString(i);
        } else if (fey == k) {
          try
          {
            byte[] arrayOfByte = paramCursor.getBlob(i);
            if ((arrayOfByte == null) || (arrayOfByte.length <= 0)) {
              continue;
            }
            this.field_moveTime = ((ef)new ef().aD(arrayOfByte));
          }
          catch (IOException localIOException)
          {
            w.e("MicroMsg.SDK.BaseBackupMoveTime", localIOException.getMessage());
          }
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(17944239144960L, 133695);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(17944373362688L, 133696);
    ContentValues localContentValues = new ContentValues();
    if (this.field_deviceId == null) {
      this.field_deviceId = "";
    }
    if (this.fet) {
      localContentValues.put("deviceId", this.field_deviceId);
    }
    if (this.field_sessionName == null) {
      this.field_sessionName = "";
    }
    if (this.feu) {
      localContentValues.put("sessionName", this.field_sessionName);
    }
    if ((this.fev) && (this.field_moveTime != null)) {}
    try
    {
      localContentValues.put("moveTime", this.field_moveTime.toByteArray());
      if (this.vmr > 0L) {
        localContentValues.put("rowid", Long.valueOf(this.vmr));
      }
      GMTrace.o(17944373362688L, 133696);
      return localContentValues;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.e("MicroMsg.SDK.BaseBackupMoveTime", localIOException.getMessage());
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */