package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.buo;
import com.tencent.mm.protocal.c.buu;
import com.tencent.mm.protocal.c.gr;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public abstract class l
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fbI;
  private static final int fbY;
  private static final int fbu;
  private static final int fcA;
  private static final int fcB;
  private static final int fcC;
  private static final int fcq;
  private static final int fcr;
  private static final int fcs;
  private static final int fct;
  private static final int fcu;
  private static final int fcv;
  private static final int fcw;
  private static final int fcx;
  private static final int fcy;
  private static final int fcz;
  private boolean fbU;
  private boolean fbd;
  private boolean fbr;
  private boolean fcd;
  private boolean fce;
  private boolean fcf;
  private boolean fcg;
  private boolean fch;
  private boolean fci;
  private boolean fcj;
  private boolean fck;
  private boolean fcl;
  private boolean fcm;
  private boolean fcn;
  private boolean fco;
  private boolean fcp;
  public int field_AppOpt;
  public String field_BigHeadImgUrl;
  public String field_appIcon;
  public String field_appId;
  public int field_appIdHashCode;
  public buo field_appInfo;
  public String field_appName;
  public gr field_bindInfo;
  public int field_brandFlag;
  public String field_brandId;
  public boolean field_debugEnabled;
  public long field_lastSyncAttrTimeInSecond;
  public String field_roundedSquareIcon;
  public String field_signature;
  public String field_syncAttrVersion;
  public buu field_versionInfo;
  
  static
  {
    GMTrace.i(4136724594688L, 30821);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS AppBrandWxaAppInfoBrandIdIndex ON AppBrandWxaAppInfo(brandId)" };
    fcq = "appIdHashCode".hashCode();
    fbu = "appId".hashCode();
    fcr = "appIcon".hashCode();
    fcs = "appName".hashCode();
    fct = "BigHeadImgUrl".hashCode();
    fcu = "appInfo".hashCode();
    fcv = "versionInfo".hashCode();
    fcw = "bindInfo".hashCode();
    fbY = "brandId".hashCode();
    fcx = "brandFlag".hashCode();
    fbI = "signature".hashCode();
    fcy = "AppOpt".hashCode();
    fcz = "syncAttrVersion".hashCode();
    fcA = "lastSyncAttrTimeInSecond".hashCode();
    fcB = "debugEnabled".hashCode();
    fcC = "roundedSquareIcon".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4136724594688L, 30821);
  }
  
  public l()
  {
    GMTrace.i(4136321941504L, 30818);
    this.fcd = true;
    this.fbd = true;
    this.fce = true;
    this.fcf = true;
    this.fcg = true;
    this.fch = true;
    this.fci = true;
    this.fcj = true;
    this.fbU = true;
    this.fck = true;
    this.fbr = true;
    this.fcl = true;
    this.fcm = true;
    this.fcn = true;
    this.fco = true;
    this.fcp = true;
    GMTrace.o(4136321941504L, 30818);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4136456159232L, 30819);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4136456159232L, 30819);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fcq == k)
      {
        this.field_appIdHashCode = paramCursor.getInt(i);
        this.fcd = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fbu == k)
        {
          this.field_appId = paramCursor.getString(i);
        }
        else if (fcr == k)
        {
          this.field_appIcon = paramCursor.getString(i);
        }
        else if (fcs == k)
        {
          this.field_appName = paramCursor.getString(i);
        }
        else if (fct == k)
        {
          this.field_BigHeadImgUrl = paramCursor.getString(i);
        }
        else if (fcu == k)
        {
          try
          {
            byte[] arrayOfByte1 = paramCursor.getBlob(i);
            if ((arrayOfByte1 == null) || (arrayOfByte1.length <= 0)) {
              continue;
            }
            this.field_appInfo = ((buo)new buo().aD(arrayOfByte1));
          }
          catch (IOException localIOException1)
          {
            w.e("MicroMsg.SDK.BaseAppBrandWxaAppInfo", localIOException1.getMessage());
          }
        }
        else if (fcv == k)
        {
          try
          {
            byte[] arrayOfByte2 = paramCursor.getBlob(i);
            if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0)) {
              continue;
            }
            this.field_versionInfo = ((buu)new buu().aD(arrayOfByte2));
          }
          catch (IOException localIOException2)
          {
            w.e("MicroMsg.SDK.BaseAppBrandWxaAppInfo", localIOException2.getMessage());
          }
        }
        else if (fcw == k)
        {
          try
          {
            byte[] arrayOfByte3 = paramCursor.getBlob(i);
            if ((arrayOfByte3 == null) || (arrayOfByte3.length <= 0)) {
              continue;
            }
            this.field_bindInfo = ((gr)new gr().aD(arrayOfByte3));
          }
          catch (IOException localIOException3)
          {
            w.e("MicroMsg.SDK.BaseAppBrandWxaAppInfo", localIOException3.getMessage());
          }
        }
        else if (fbY == k)
        {
          this.field_brandId = paramCursor.getString(i);
        }
        else if (fcx == k)
        {
          this.field_brandFlag = paramCursor.getInt(i);
        }
        else if (fbI == k)
        {
          this.field_signature = paramCursor.getString(i);
        }
        else if (fcy == k)
        {
          this.field_AppOpt = paramCursor.getInt(i);
        }
        else if (fcz == k)
        {
          this.field_syncAttrVersion = paramCursor.getString(i);
        }
        else if (fcA == k)
        {
          this.field_lastSyncAttrTimeInSecond = paramCursor.getLong(i);
        }
        else
        {
          if (fcB == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_debugEnabled = bool;
              break;
            }
          }
          if (fcC == k) {
            this.field_roundedSquareIcon = paramCursor.getString(i);
          } else if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4136456159232L, 30819);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4136590376960L, 30820);
    ContentValues localContentValues = new ContentValues();
    if (this.fcd) {
      localContentValues.put("appIdHashCode", Integer.valueOf(this.field_appIdHashCode));
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fce) {
      localContentValues.put("appIcon", this.field_appIcon);
    }
    if (this.fcf) {
      localContentValues.put("appName", this.field_appName);
    }
    if (this.fcg) {
      localContentValues.put("BigHeadImgUrl", this.field_BigHeadImgUrl);
    }
    if ((this.fch) && (this.field_appInfo != null)) {}
    try
    {
      localContentValues.put("appInfo", this.field_appInfo.toByteArray());
      if ((!this.fci) || (this.field_versionInfo == null)) {}
    }
    catch (IOException localIOException2)
    {
      try
      {
        localContentValues.put("versionInfo", this.field_versionInfo.toByteArray());
        if ((!this.fcj) || (this.field_bindInfo == null)) {}
      }
      catch (IOException localIOException2)
      {
        try
        {
          for (;;)
          {
            localContentValues.put("bindInfo", this.field_bindInfo.toByteArray());
            if (this.fbU) {
              localContentValues.put("brandId", this.field_brandId);
            }
            if (this.fck) {
              localContentValues.put("brandFlag", Integer.valueOf(this.field_brandFlag));
            }
            if (this.fbr) {
              localContentValues.put("signature", this.field_signature);
            }
            if (this.fcl) {
              localContentValues.put("AppOpt", Integer.valueOf(this.field_AppOpt));
            }
            if (this.fcm) {
              localContentValues.put("syncAttrVersion", this.field_syncAttrVersion);
            }
            if (this.fcn) {
              localContentValues.put("lastSyncAttrTimeInSecond", Long.valueOf(this.field_lastSyncAttrTimeInSecond));
            }
            if (this.fco) {
              localContentValues.put("debugEnabled", Boolean.valueOf(this.field_debugEnabled));
            }
            if (this.fcp) {
              localContentValues.put("roundedSquareIcon", this.field_roundedSquareIcon);
            }
            if (this.vmr > 0L) {
              localContentValues.put("rowid", Long.valueOf(this.vmr));
            }
            GMTrace.o(4136590376960L, 30820);
            return localContentValues;
            localIOException1 = localIOException1;
            w.e("MicroMsg.SDK.BaseAppBrandWxaAppInfo", localIOException1.getMessage());
          }
          localIOException2 = localIOException2;
          w.e("MicroMsg.SDK.BaseAppBrandWxaAppInfo", localIOException2.getMessage());
        }
        catch (IOException localIOException3)
        {
          for (;;)
          {
            w.e("MicroMsg.SDK.BaseAppBrandWxaAppInfo", localIOException3.getMessage());
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */