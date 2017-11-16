package com.tencent.mm.plugin.extqlauncher.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.ext.provider.ExtContentProviderBase;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class ExtControlProviderQLauncher
  extends ExtContentProviderBase
{
  private static final UriMatcher kMX;
  private static final String[] kMv;
  private static final String[] kOV;
  private Context context;
  private String[] kMI;
  private int kOW;
  
  static
  {
    GMTrace.i(9029094998016L, 67272);
    UriMatcher localUriMatcher = new UriMatcher(-1);
    kMX = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.extqlauncher", "openQRCodeScan", 18);
    kMX.addURI("com.tencent.mm.plugin.extqlauncher", "batchAddShortcut", 19);
    kMX.addURI("com.tencent.mm.plugin.extqlauncher", "getUnreadCount", 20);
    kMv = new String[] { "retCode" };
    kOV = new String[] { "id", "count" };
    GMTrace.o(9029094998016L, 67272);
  }
  
  public ExtControlProviderQLauncher()
  {
    GMTrace.i(9028021256192L, 67264);
    this.kOW = -1;
    GMTrace.o(9028021256192L, 67264);
  }
  
  public ExtControlProviderQLauncher(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    GMTrace.i(9027887038464L, 67263);
    this.kOW = -1;
    this.kMI = paramArrayOfString;
    this.kOW = paramInt;
    this.context = paramContext;
    GMTrace.o(9027887038464L, 67263);
  }
  
  private Cursor s(String[] paramArrayOfString)
  {
    GMTrace.i(9028960780288L, 67271);
    w.d("MicroMsg.ExtControlProviderQLauncher", "getUnreadCount");
    if (this.context == null)
    {
      nl(4);
      GMTrace.o(9028960780288L, 67271);
      return null;
    }
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      w.e("MicroMsg.ExtControlProviderQLauncher", "wrong args");
      nl(3);
      GMTrace.o(9028960780288L, 67271);
      return null;
    }
    MatrixCursor localMatrixCursor = new MatrixCursor(kOV);
    int i = 0;
    for (;;)
    {
      try
      {
        if ((i >= paramArrayOfString.length) || (i >= 10)) {
          break label274;
        }
        if (bg.nm(paramArrayOfString[i])) {
          break label289;
        }
        Object localObject;
        if (paramArrayOfString[i].equals("0"))
        {
          localObject = paramArrayOfString[i];
          com.tencent.mm.plugin.extqlauncher.b.avK();
          localMatrixCursor.addRow(new Object[] { localObject, Integer.valueOf(com.tencent.mm.plugin.extqlauncher.b.avL()) });
        }
        else
        {
          localObject = com.tencent.mm.plugin.base.model.b.ts(paramArrayOfString[i]);
          if (!bg.nm((String)localObject))
          {
            at.AR();
            localObject = c.yP().TO((String)localObject);
            if (localObject != null) {
              localMatrixCursor.addRow(new Object[] { paramArrayOfString[i], Integer.valueOf(((aj)localObject).field_unReadCount) });
            }
          }
        }
      }
      catch (Exception paramArrayOfString)
      {
        w.e("MicroMsg.ExtControlProviderQLauncher", "exception in updateShortcut, %s", new Object[] { paramArrayOfString.getMessage() });
        nl(4);
        localMatrixCursor.close();
        GMTrace.o(9028960780288L, 67271);
        return null;
      }
      localMatrixCursor.addRow(new Object[] { paramArrayOfString[i], Integer.valueOf(0) });
      break label289;
      label274:
      nl(0);
      GMTrace.o(9028960780288L, 67271);
      return localMatrixCursor;
      label289:
      i += 1;
    }
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(9028692344832L, 67269);
    GMTrace.o(9028692344832L, 67269);
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    GMTrace.i(9028155473920L, 67265);
    GMTrace.o(9028155473920L, 67265);
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    GMTrace.i(9028558127104L, 67268);
    GMTrace.o(9028558127104L, 67268);
    return null;
  }
  
  public boolean onCreate()
  {
    GMTrace.i(9028289691648L, 67266);
    GMTrace.o(9028289691648L, 67266);
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    GMTrace.i(9028423909376L, 67267);
    w.d("MicroMsg.ExtControlProviderQLauncher", "query()");
    a(paramUri, this.context, this.kOW, this.kMI);
    if (paramUri == null)
    {
      nl(3);
      GMTrace.o(9028423909376L, 67267);
      return null;
    }
    if ((bg.nm(this.kMR)) || (bg.nm(avt())))
    {
      nl(3);
      GMTrace.o(9028423909376L, 67267);
      return null;
    }
    if (!agO())
    {
      nl(1);
      paramUri = this.jjo;
      GMTrace.o(9028423909376L, 67267);
      return paramUri;
    }
    if (!cn(this.context))
    {
      w.w("MicroMsg.ExtControlProviderQLauncher", "invalid appid ! return null");
      nl(2);
      GMTrace.o(9028423909376L, 67267);
      return null;
    }
    switch (this.kOW)
    {
    default: 
      nl(3);
      GMTrace.o(9028423909376L, 67267);
      return null;
    case 18: 
      w.d("MicroMsg.ExtControlProviderQLauncher", "toScanQRCode");
      if (this.context == null)
      {
        nl(4);
        GMTrace.o(9028423909376L, 67267);
        return null;
      }
      paramUri = new Intent();
      paramUri.putExtra("BaseScanUI_select_scan_mode", 1);
      paramUri.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
      d.b(this.context, "scanner", ".ui.BaseScanUI", paramUri);
      paramUri = new MatrixCursor(kMv);
      paramUri.addRow(new Object[] { Integer.valueOf(1) });
      nl(0);
      GMTrace.o(9028423909376L, 67267);
      return paramUri;
    case 19: 
      w.d("MicroMsg.ExtControlProviderQLauncher", "toCreateShortcut");
      if (this.context == null)
      {
        nl(4);
        GMTrace.o(9028423909376L, 67267);
        return null;
      }
      paramUri = new Intent();
      d.b(this.context, "extqlauncher", ".ui.QLauncherCreateShortcutUI", paramUri);
      paramUri = new MatrixCursor(kMv);
      paramUri.addRow(new Object[] { Integer.valueOf(1) });
      nl(0);
      GMTrace.o(9028423909376L, 67267);
      return paramUri;
    }
    paramUri = s(paramArrayOfString2);
    GMTrace.o(9028423909376L, 67267);
    return paramUri;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(9028826562560L, 67270);
    GMTrace.o(9028826562560L, 67270);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\extqlauncher\provider\ExtControlProviderQLauncher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */