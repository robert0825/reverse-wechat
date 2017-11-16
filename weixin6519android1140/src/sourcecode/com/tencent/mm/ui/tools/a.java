package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.format.DateFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.v.a.k;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class a
{
  public static void a(Activity paramActivity, Intent paramIntent1, Intent paramIntent2, String paramString, int paramInt)
  {
    GMTrace.i(2064402874368L, 15381);
    b(paramActivity, paramIntent1, paramIntent2, paramString, paramInt, null);
    GMTrace.o(2064402874368L, 15381);
  }
  
  public static void b(final Activity paramActivity, Intent paramIntent1, final Intent paramIntent2, final String paramString, final int paramInt, final a parama)
  {
    GMTrace.i(2064537092096L, 15382);
    if ((paramIntent1 == null) || (paramIntent1.getData() == null))
    {
      if (paramIntent1 == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.e("MicroMsg.AsyncObtainImage", "param error, %b", new Object[] { Boolean.valueOf(bool) });
        GMTrace.o(2064537092096L, 15382);
        return;
      }
    }
    if (!paramIntent1.getData().toString().startsWith("content://com.google.android.gallery3d"))
    {
      paramIntent1 = c(paramActivity, paramIntent1, paramString);
      w.i("MicroMsg.AsyncObtainImage", "resolvePhotoFromIntent, filePath:%s", new Object[] { paramIntent1 });
      if (!bg.nm(paramIntent1))
      {
        if (parama != null) {
          paramIntent2.putExtra("CropImage_OutputPath", parama.Jb(paramIntent1));
        }
        paramIntent2.putExtra("CropImage_ImgPath", paramIntent1);
        paramActivity.startActivityForResult(paramIntent2, paramInt);
      }
      GMTrace.o(2064537092096L, 15382);
      return;
    }
    new AsyncTask()
    {
      private String filePath;
      private Uri uri;
      private ProgressDialog xfy;
      private boolean xfz;
      
      private Integer cib()
      {
        GMTrace.i(1913676365824L, 14258);
        try
        {
          Object localObject = this.uri;
          if (localObject == null)
          {
            GMTrace.o(1913676365824L, 14258);
            return null;
          }
          localObject = d.k(this.uri);
          this.filePath = a.u(paramString, (Bitmap)localObject);
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.AsyncObtainImage", localException, "doInBackground", new Object[0]);
          }
        }
        GMTrace.o(1913676365824L, 14258);
        return null;
      }
      
      protected final void onPreExecute()
      {
        GMTrace.i(1913542148096L, 14257);
        try
        {
          this.uri = this.jjE.getData();
          this.xfz = false;
          Activity localActivity = paramActivity;
          paramActivity.getString(a.k.cUG);
          this.xfy = h.a(localActivity, paramActivity.getString(a.k.ggh), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(2026553475072L, 15099);
              a.2.a(a.2.this);
              GMTrace.o(2026553475072L, 15099);
            }
          });
          GMTrace.o(1913542148096L, 14257);
          return;
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.AsyncObtainImage", localException, "onPreExecute", new Object[0]);
          GMTrace.o(1913542148096L, 14257);
        }
      }
    }.execute(new Integer[] { Integer.valueOf(0) });
    GMTrace.o(2064537092096L, 15382);
  }
  
  public static String c(Context paramContext, Intent paramIntent, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    GMTrace.i(2064671309824L, 15383);
    if ((paramContext == null) || (paramIntent == null) || (paramString == null))
    {
      w.e("MicroMsg.AsyncObtainImage", "resolvePhotoFromIntent fail, invalid argument");
      GMTrace.o(2064671309824L, 15383);
      return null;
    }
    Uri localUri = Uri.parse(paramIntent.toURI());
    Cursor localCursor = paramContext.getContentResolver().query(localUri, null, null, null, null);
    if ((localCursor != null) && (localCursor.getCount() > 0))
    {
      w.i("MicroMsg.AsyncObtainImage", "resolve photo from cursor");
      paramContext = (Context)localObject2;
    }
    label411:
    label414:
    for (;;)
    {
      try
      {
        if (!localUri.toString().startsWith("content://com.google.android.gallery3d")) {
          continue;
        }
        paramContext = (Context)localObject2;
        paramIntent = u(paramString, d.k(paramIntent.getData()));
        paramContext = paramIntent;
      }
      catch (Exception paramIntent)
      {
        w.printErrStackTrace("MicroMsg.AsyncObtainImage", paramIntent, "resolve photo error.", new Object[0]);
        continue;
      }
      if (localCursor != null) {
        localCursor.close();
      }
      GMTrace.o(2064671309824L, 15383);
      return paramContext;
      paramContext = (Context)localObject2;
      localCursor.moveToFirst();
      paramContext = (Context)localObject2;
      paramIntent = localCursor.getString(localCursor.getColumnIndex("_data"));
      paramContext = paramIntent;
      w.i("MicroMsg.AsyncObtainImage", "photo from resolver, path:" + paramIntent);
      paramContext = paramIntent;
      continue;
      if (paramIntent.getData() != null)
      {
        paramString = paramIntent.getData().getPath();
        paramContext = paramString;
        if (!new File(paramString).exists()) {
          paramContext = null;
        }
        w.i("MicroMsg.AsyncObtainImage", "photo file from data, path:" + paramContext);
        if (paramContext != null) {
          break label414;
        }
        paramContext = paramIntent.getData().getHost();
        if (new File(paramContext).exists()) {
          break label411;
        }
        paramContext = (Context)localObject1;
      }
      for (;;)
      {
        w.i("MicroMsg.AsyncObtainImage", "photo file from data, host:" + paramContext);
        break;
        if ((paramIntent.getAction() != null) && (paramIntent.getAction().equals("inline-data")))
        {
          paramContext = u(paramString, (Bitmap)paramIntent.getExtras().get("data"));
          w.i("MicroMsg.AsyncObtainImage", "resolve photo from action-inline-data:%s", new Object[] { paramContext });
          break;
        }
        if (localCursor != null) {
          localCursor.close();
        }
        w.e("MicroMsg.AsyncObtainImage", "resolve photo from intent failed");
        GMTrace.o(2064671309824L, 15383);
        return null;
      }
    }
  }
  
  public static String u(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(2064805527552L, 15384);
    try
    {
      Object localObject = g.n(DateFormat.format("yyyy-MM-dd-HH-mm-ss", System.currentTimeMillis()).toString().getBytes()) + ".jpg";
      paramString = paramString + (String)localObject;
      localObject = new File(paramString);
      if (!((File)localObject).exists()) {
        ((File)localObject).createNewFile();
      }
      localObject = new BufferedOutputStream(new FileOutputStream((File)localObject));
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject);
      ((BufferedOutputStream)localObject).close();
      w.i("MicroMsg.AsyncObtainImage", "photo image from data, path:" + paramString);
      GMTrace.o(2064805527552L, 15384);
      return paramString;
    }
    catch (IOException paramString)
    {
      w.printErrStackTrace("MicroMsg.AsyncObtainImage", paramString, "saveBmp Error.", new Object[0]);
      GMTrace.o(2064805527552L, 15384);
    }
    return null;
  }
  
  public static abstract interface a
  {
    public abstract String Jb(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */