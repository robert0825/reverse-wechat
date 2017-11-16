package com.tencent.mm.pluginsdk.ui.chat;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Images.Thumbnails;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

final class h
{
  private ContentResolver gTC;
  protected Context mContext;
  
  protected h(Context paramContext)
  {
    GMTrace.i(968917778432L, 7219);
    this.mContext = paramContext;
    this.gTC = this.mContext.getContentResolver();
    GMTrace.o(968917778432L, 7219);
  }
  
  private String Pv(String paramString)
  {
    GMTrace.i(969051996160L, 7220);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.RecentPhotoTips.ImageQuery", "null or nill imageId");
      GMTrace.o(969051996160L, 7220);
      return null;
    }
    Object localObject = "image_id=\"" + paramString + "\"";
    try
    {
      localObject = this.gTC.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, null, (String)localObject, null, null);
      if (localObject == null)
      {
        w.e("MicroMsg.RecentPhotoTips.ImageQuery", "get cursor null:" + paramString);
        GMTrace.o(969051996160L, 7220);
        return null;
      }
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.RecentPhotoTips.ImageQuery", "query thumb exception e : %s", new Object[] { paramString.toString() });
      GMTrace.o(969051996160L, 7220);
      return null;
    }
    if (((Cursor)localObject).moveToFirst()) {
      do
      {
        paramString = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndexOrThrow("_data"));
      } while (((Cursor)localObject).moveToNext());
    }
    for (;;)
    {
      ((Cursor)localObject).close();
      GMTrace.o(969051996160L, 7220);
      return paramString;
      paramString = null;
    }
  }
  
  public final ArrayList<g> bML()
  {
    GMTrace.i(969186213888L, 7221);
    ArrayList localArrayList = new ArrayList();
    Object localObject = "date_added desc limit 1";
    bg.Pv();
    try
    {
      localObject = this.gTC.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[] { "_id", "_data", "date_added" }, null, null, (String)localObject);
      if (localObject == null)
      {
        GMTrace.o(969186213888L, 7221);
        return localArrayList;
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RecentPhotoTips.ImageQuery", "query photo exception e : %s", new Object[] { localException.toString() });
      GMTrace.o(969186213888L, 7221);
      return null;
    }
    if (((Cursor)localObject).moveToFirst()) {}
    for (;;)
    {
      String str1 = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndexOrThrow("_id"));
      String str2 = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndexOrThrow("_data"));
      String str3 = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndexOrThrow("date_added"));
      String str4 = Pv(str1);
      if ((bg.nm(str2)) || (!com.tencent.mm.a.e.aZ(str2))) {
        w.e("MicroMsg.RecentPhotoTips.ImageQuery", "file not exist");
      }
      while (!((Cursor)localObject).moveToNext())
      {
        ((Cursor)localObject).close();
        GMTrace.o(969186213888L, 7221);
        return localException;
        if (str2.startsWith(com.tencent.mm.compatible.util.e.fRZ))
        {
          w.i("MicroMsg.RecentPhotoTips.ImageQuery", "exclude weixin path image");
        }
        else
        {
          g localg = new g();
          localg.tAO = bg.getLong(str1, 0L);
          localg.lBF = bg.getLong(str3, 0L);
          if ((!bg.nm(str4)) && (com.tencent.mm.a.e.aZ(str4))) {
            localg.eIy = str4;
          }
          if ((!bg.nm(str2)) && (com.tencent.mm.a.e.aZ(str2))) {
            localg.tAP = str2;
          }
          if ((bg.nm(localg.tAP)) && (bg.nm(localg.tAP))) {
            w.e("MicroMsg.RecentPhotoTips.ImageQuery", "thumb file and orignal file both not exist");
          } else {
            localException.add(localg);
          }
        }
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract int bMI();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\chat\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */