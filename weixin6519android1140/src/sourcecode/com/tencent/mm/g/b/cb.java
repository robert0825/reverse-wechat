package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.alc;
import com.tencent.mm.protocal.c.av;
import com.tencent.mm.protocal.c.bul;
import com.tencent.mm.protocal.c.md;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public abstract class cb
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fbu;
  private static final int fvC;
  private static final int fvD;
  private static final int fvE;
  private static final int fvF;
  private static final int fvG;
  private boolean fbd;
  public av field_actionsheetInfo;
  public String field_appId;
  public int field_appIdHash;
  public bul field_hostInfo;
  public md field_jsapiInfo;
  public alc field_launchAction;
  private boolean fvA;
  private boolean fvB;
  private boolean fvx;
  private boolean fvy;
  private boolean fvz;
  
  static
  {
    GMTrace.i(15354508083200L, 114400);
    eZt = new String[0];
    fvC = "appIdHash".hashCode();
    fbu = "appId".hashCode();
    fvD = "launchAction".hashCode();
    fvE = "jsapiInfo".hashCode();
    fvF = "hostInfo".hashCode();
    fvG = "actionsheetInfo".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(15354508083200L, 114400);
  }
  
  public cb()
  {
    GMTrace.i(15354105430016L, 114397);
    this.fvx = true;
    this.fbd = true;
    this.fvy = true;
    this.fvz = true;
    this.fvA = true;
    this.fvB = true;
    GMTrace.o(15354105430016L, 114397);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(15354239647744L, 114398);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(15354239647744L, 114398);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fvC == k)
      {
        this.field_appIdHash = paramCursor.getInt(i);
        this.fvx = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fbu == k) {
          this.field_appId = paramCursor.getString(i);
        } else if (fvD == k) {
          try
          {
            byte[] arrayOfByte1 = paramCursor.getBlob(i);
            if ((arrayOfByte1 == null) || (arrayOfByte1.length <= 0)) {
              continue;
            }
            this.field_launchAction = ((alc)new alc().aD(arrayOfByte1));
          }
          catch (IOException localIOException1)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException1.getMessage());
          }
        } else if (fvE == k) {
          try
          {
            byte[] arrayOfByte2 = paramCursor.getBlob(i);
            if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0)) {
              continue;
            }
            this.field_jsapiInfo = ((md)new md().aD(arrayOfByte2));
          }
          catch (IOException localIOException2)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException2.getMessage());
          }
        } else if (fvF == k) {
          try
          {
            byte[] arrayOfByte3 = paramCursor.getBlob(i);
            if ((arrayOfByte3 == null) || (arrayOfByte3.length <= 0)) {
              continue;
            }
            this.field_hostInfo = ((bul)new bul().aD(arrayOfByte3));
          }
          catch (IOException localIOException3)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException3.getMessage());
          }
        } else if (fvG == k) {
          try
          {
            byte[] arrayOfByte4 = paramCursor.getBlob(i);
            if ((arrayOfByte4 == null) || (arrayOfByte4.length <= 0)) {
              continue;
            }
            this.field_actionsheetInfo = ((av)new av().aD(arrayOfByte4));
          }
          catch (IOException localIOException4)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException4.getMessage());
          }
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(15354239647744L, 114398);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(15354373865472L, 114399);
    ContentValues localContentValues = new ContentValues();
    if (this.fvx) {
      localContentValues.put("appIdHash", Integer.valueOf(this.field_appIdHash));
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if ((this.fvy) && (this.field_launchAction != null)) {}
    try
    {
      localContentValues.put("launchAction", this.field_launchAction.toByteArray());
      if ((!this.fvz) || (this.field_jsapiInfo == null)) {}
    }
    catch (IOException localIOException3)
    {
      try
      {
        localContentValues.put("jsapiInfo", this.field_jsapiInfo.toByteArray());
        if ((!this.fvA) || (this.field_hostInfo == null)) {}
      }
      catch (IOException localIOException3)
      {
        try
        {
          localContentValues.put("hostInfo", this.field_hostInfo.toByteArray());
          if ((!this.fvB) || (this.field_actionsheetInfo == null)) {}
        }
        catch (IOException localIOException3)
        {
          try
          {
            for (;;)
            {
              localContentValues.put("actionsheetInfo", this.field_actionsheetInfo.toByteArray());
              if (this.vmr > 0L) {
                localContentValues.put("rowid", Long.valueOf(this.vmr));
              }
              GMTrace.o(15354373865472L, 114399);
              return localContentValues;
              localIOException1 = localIOException1;
              w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException1.getMessage());
              continue;
              localIOException2 = localIOException2;
              w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException2.getMessage());
            }
            localIOException3 = localIOException3;
            w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException3.getMessage());
          }
          catch (IOException localIOException4)
          {
            for (;;)
            {
              w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException4.getMessage());
            }
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */