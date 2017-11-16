package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.btx;
import com.tencent.mm.protocal.c.bty;
import com.tencent.mm.protocal.c.bvl;
import com.tencent.mm.protocal.c.md;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public abstract class cc
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fbu;
  private static final int fcv;
  private static final int fvC;
  private static final int fvD;
  private static final int fvL;
  private static final int fvM;
  private static final int fvN;
  private static final int fvO;
  private boolean fbd;
  private boolean fci;
  public String field_appId;
  public int field_appIdHash;
  public md field_jsApiInfo;
  public btx field_launchAction;
  public int field_pkgType;
  public bty field_versionInfo;
  public bvl field_widgetSetting;
  public int field_widgetType;
  private boolean fvH;
  private boolean fvI;
  private boolean fvJ;
  private boolean fvK;
  private boolean fvx;
  private boolean fvy;
  
  static
  {
    GMTrace.i(17943970709504L, 133693);
    eZt = new String[0];
    fvC = "appIdHash".hashCode();
    fbu = "appId".hashCode();
    fvL = "pkgType".hashCode();
    fvM = "widgetType".hashCode();
    fvD = "launchAction".hashCode();
    fvN = "jsApiInfo".hashCode();
    fcv = "versionInfo".hashCode();
    fvO = "widgetSetting".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(17943970709504L, 133693);
  }
  
  public cc()
  {
    GMTrace.i(17943568056320L, 133690);
    this.fvx = true;
    this.fbd = true;
    this.fvH = true;
    this.fvI = true;
    this.fvy = true;
    this.fvJ = true;
    this.fci = true;
    this.fvK = true;
    GMTrace.o(17943568056320L, 133690);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(17943702274048L, 133691);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(17943702274048L, 133691);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fvC == k) {
        this.field_appIdHash = paramCursor.getInt(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fbu == k) {
          this.field_appId = paramCursor.getString(i);
        } else if (fvL == k) {
          this.field_pkgType = paramCursor.getInt(i);
        } else if (fvM == k) {
          this.field_widgetType = paramCursor.getInt(i);
        } else if (fvD == k) {
          try
          {
            byte[] arrayOfByte1 = paramCursor.getBlob(i);
            if ((arrayOfByte1 == null) || (arrayOfByte1.length <= 0)) {
              continue;
            }
            this.field_launchAction = ((btx)new btx().aD(arrayOfByte1));
          }
          catch (IOException localIOException1)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException1.getMessage());
          }
        } else if (fvN == k) {
          try
          {
            byte[] arrayOfByte2 = paramCursor.getBlob(i);
            if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0)) {
              continue;
            }
            this.field_jsApiInfo = ((md)new md().aD(arrayOfByte2));
          }
          catch (IOException localIOException2)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException2.getMessage());
          }
        } else if (fcv == k) {
          try
          {
            byte[] arrayOfByte3 = paramCursor.getBlob(i);
            if ((arrayOfByte3 == null) || (arrayOfByte3.length <= 0)) {
              continue;
            }
            this.field_versionInfo = ((bty)new bty().aD(arrayOfByte3));
          }
          catch (IOException localIOException3)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException3.getMessage());
          }
        } else if (fvO == k) {
          try
          {
            byte[] arrayOfByte4 = paramCursor.getBlob(i);
            if ((arrayOfByte4 == null) || (arrayOfByte4.length <= 0)) {
              continue;
            }
            this.field_widgetSetting = ((bvl)new bvl().aD(arrayOfByte4));
          }
          catch (IOException localIOException4)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException4.getMessage());
          }
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(17943702274048L, 133691);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(17943836491776L, 133692);
    ContentValues localContentValues = new ContentValues();
    if (this.fvx) {
      localContentValues.put("appIdHash", Integer.valueOf(this.field_appIdHash));
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fvH) {
      localContentValues.put("pkgType", Integer.valueOf(this.field_pkgType));
    }
    if (this.fvI) {
      localContentValues.put("widgetType", Integer.valueOf(this.field_widgetType));
    }
    if ((this.fvy) && (this.field_launchAction != null)) {}
    try
    {
      localContentValues.put("launchAction", this.field_launchAction.toByteArray());
      if ((!this.fvJ) || (this.field_jsApiInfo == null)) {}
    }
    catch (IOException localIOException3)
    {
      try
      {
        localContentValues.put("jsApiInfo", this.field_jsApiInfo.toByteArray());
        if ((!this.fci) || (this.field_versionInfo == null)) {}
      }
      catch (IOException localIOException3)
      {
        try
        {
          localContentValues.put("versionInfo", this.field_versionInfo.toByteArray());
          if ((!this.fvK) || (this.field_widgetSetting == null)) {}
        }
        catch (IOException localIOException3)
        {
          try
          {
            for (;;)
            {
              localContentValues.put("widgetSetting", this.field_widgetSetting.toByteArray());
              if (this.vmr > 0L) {
                localContentValues.put("rowid", Long.valueOf(this.vmr));
              }
              GMTrace.o(17943836491776L, 133692);
              return localContentValues;
              localIOException1 = localIOException1;
              w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException1.getMessage());
              continue;
              localIOException2 = localIOException2;
              w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException2.getMessage());
            }
            localIOException3 = localIOException3;
            w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException3.getMessage());
          }
          catch (IOException localIOException4)
          {
            for (;;)
            {
              w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException4.getMessage());
            }
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */