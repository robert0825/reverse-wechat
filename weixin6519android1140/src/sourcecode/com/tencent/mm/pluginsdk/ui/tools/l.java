package com.tencent.mm.pluginsdk.ui.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class l
{
  public Context context;
  public String filePath;
  public int fileType;
  public Uri uri;
  
  public l(Context paramContext, Uri paramUri)
  {
    GMTrace.i(1141655994368L, 8506);
    this.fileType = 0;
    this.context = paramContext;
    this.uri = paramUri;
    if (paramUri == null)
    {
      w.e("MicroMsg.UriFileHelper", "initFileTypeAndPath uri == null");
      GMTrace.o(1141655994368L, 8506);
      return;
    }
    if (this.context == null)
    {
      w.e("MicroMsg.UriFileHelper", "initFileTypeAndPath context == null");
      GMTrace.o(1141655994368L, 8506);
      return;
    }
    Object localObject2 = MimeTypeMap.getSingleton();
    paramContext = this.context.getContentResolver().getType(paramUri);
    int i;
    if ((paramContext == null) || (paramContext.length() <= 0))
    {
      if (paramUri.getPath() != null)
      {
        localObject1 = new File(paramUri.getPath());
        if (!((File)localObject1).exists())
        {
          w.e("MicroMsg.UriFileHelper", "File is null");
          this.fileType = 0;
          GMTrace.o(1141655994368L, 8506);
          return;
        }
        this.filePath = ((File)localObject1).getAbsolutePath();
        i = this.filePath.lastIndexOf(".");
        if ((i == -1) || (i >= this.filePath.length() - 1)) {
          this.fileType = 1;
        }
        while ((paramContext == null) || (this.filePath == null))
        {
          this.fileType = 0;
          GMTrace.o(1141655994368L, 8506);
          return;
          paramContext = ((MimeTypeMap)localObject2).getMimeTypeFromExtension(this.filePath.substring(i + 1));
        }
      }
    }
    else
    {
      if (this.context != null) {
        break label264;
      }
      w.e("MicroMsg.UriFileHelper", "getFilePath context == null");
    }
    for (;;)
    {
      this.filePath = ((String)localObject1);
      break;
      label264:
      localObject2 = this.context.getContentResolver().query(paramUri, null, null, null, null);
      if (localObject2 == null)
      {
        w.e("MicroMsg.UriFileHelper", "getFilePath : fail, cursor is null");
      }
      else if ((((Cursor)localObject2).getCount() <= 0) || (!((Cursor)localObject2).moveToFirst()))
      {
        ((Cursor)localObject2).close();
        w.e("MicroMsg.UriFileHelper", "getFilePath : fail, cursor getCount is 0 or moveToFirst fail");
      }
      else
      {
        i = ((Cursor)localObject2).getColumnIndex("_data");
        if (i == -1)
        {
          ((Cursor)localObject2).close();
          w.e("MicroMsg.UriFileHelper", "getFilePath : columnIdx is -1, column with columnName = _data does not exist");
        }
        else
        {
          localObject1 = ((Cursor)localObject2).getString(i);
          ((Cursor)localObject2).close();
        }
      }
    }
    if (paramContext.contains("image")) {
      this.fileType = 3;
    }
    for (;;)
    {
      w.d("MicroMsg.UriFileHelper", "MimeType[%s], filePath = [%s], fileType = [%s], type = [%s], Uri[%s]", new Object[] { paramContext, this.filePath, Integer.valueOf(this.fileType), paramContext, paramUri.toString() });
      GMTrace.o(1141655994368L, 8506);
      return;
      if (paramContext.contains("video")) {
        this.fileType = 4;
      } else if (paramContext.contains("audio")) {
        this.fileType = 5;
      } else if (paramContext.contains("mm_item")) {
        this.fileType = 2;
      } else {
        this.fileType = 1;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */