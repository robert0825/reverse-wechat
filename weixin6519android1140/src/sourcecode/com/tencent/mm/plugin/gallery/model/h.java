package com.tencent.mm.plugin.gallery.model;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;

public final class h
  extends k
{
  private static int lBG;
  private i lBH;
  private n lBI;
  private MediaMetadataRetriever lBJ;
  int lBK;
  
  static
  {
    GMTrace.i(11912762884096L, 88757);
    lBG = 100;
    GMTrace.o(11912762884096L, 88757);
  }
  
  public h()
  {
    GMTrace.i(11911018053632L, 88744);
    this.lBJ = new MediaMetadataRetriever();
    this.lBK = 0;
    this.lBH = new i();
    this.lBI = new n();
    GMTrace.o(11911018053632L, 88744);
  }
  
  private static GalleryItem.AlbumItem b(Cursor paramCursor, int paramInt, String paramString)
  {
    GMTrace.i(11911420706816L, 88747);
    Long localLong = Long.valueOf(0L);
    try
    {
      l = bg.getLong(paramCursor.getString(paramCursor.getColumnIndexOrThrow("_id")), 0L);
      localLong = Long.valueOf(l);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      long l;
      String str1;
      String str2;
      String str3;
      String str4;
      int i;
      for (;;) {}
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        continue;
        paramString = localNumberFormatException;
      }
    }
    str1 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("_data"));
    str2 = paramCursor.getString(paramCursor.getColumnIndexOrThrow(paramString));
    str3 = paramCursor.getString(paramCursor.getColumnIndexOrThrow(k.lBQ));
    l = paramCursor.getLong(paramCursor.getColumnIndexOrThrow(k.lBQ));
    str4 = paramCursor.getString(paramCursor.getColumnIndexOrThrow(k.lBO));
    paramString = paramCursor.getString(paramCursor.getColumnIndexOrThrow(k.lBP));
    if ((str3 == null) || (str3.equals("")) || (str3.equals(Integer.valueOf(0))))
    {
      g.ork.a(363L, 1L, 1L, true);
      if (0L != l) {
        g.ork.a(363L, 4L, 1L, true);
      }
      if (((str4 == null) || (str4.equals("")) || (str4.equals(Integer.valueOf(0)))) && (paramString != null) && (!paramString.equals("")) && (!paramString.equals(Integer.valueOf(0)))) {
        g.ork.a(363L, 3L, 1L, true);
      }
      if (((paramString == null) || (paramString.equals("")) || (paramString.equals(Integer.valueOf(0)))) && (str4 != null) && (!str4.equals("")) && (!str4.equals(Integer.valueOf(0)))) {
        g.ork.a(363L, 2L, 1L, true);
      }
    }
    while (bg.nm(str2))
    {
      w.e("MicroMsg.ImageAndVideoQuery", "null or nill album name, ignore this folder");
      GMTrace.o(11911420706816L, 88747);
      return null;
      if ((paramString == null) || (paramString.equals("")) || (paramString.equals(Integer.valueOf(0)))) {
        g.ork.a(363L, 6L, 1L, true);
      } else if ((str4 == null) || (str4.equals("")) || (str4.equals(Integer.valueOf(0)))) {
        g.ork.a(363L, 5L, 1L, true);
      }
    }
    i = paramCursor.getInt(3);
    w.i("MicroMsg.ImageAndVideoQuery", str1 + "====" + str2 + "=====" + localLong + ", " + i);
    if ((i == 0) || ((bg.nm(str1)) && (bg.nm(null))))
    {
      w.e("MicroMsg.ImageAndVideoQuery", "query album failed, " + i + ", " + str1 + "," + null);
      GMTrace.o(11911420706816L, 88747);
      return null;
    }
    if ((bg.nm(str1)) || (!e.aZ(str1)))
    {
      paramString = null;
      if (!bg.nm(null)) {
        e.aZ(null);
      }
      if (paramString == null)
      {
        w.e("MicroMsg.ImageAndVideoQuery", "this item has no thumb path and original path");
        GMTrace.o(11911420706816L, 88747);
        return null;
      }
      paramCursor = paramCursor.getString(paramCursor.getColumnIndexOrThrow("mime_type"));
      paramCursor = GalleryItem.MediaItem.a(paramInt, localLong.longValue(), paramString, null, paramCursor);
      paramCursor.lBF = cn(str3, str4);
      paramString = new GalleryItem.AlbumItem(str2, i);
      paramString.lBB = paramCursor;
      GMTrace.o(11911420706816L, 88747);
      return paramString;
    }
  }
  
  private static GalleryItem.MediaItem b(Cursor paramCursor, int paramInt)
  {
    GMTrace.i(11911554924544L, 88748);
    Object localObject1 = Long.valueOf(0L);
    try
    {
      l = bg.getLong(paramCursor.getString(paramCursor.getColumnIndexOrThrow("_id")), 0L);
      localObject1 = Long.valueOf(l);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      long l;
      String str1;
      String str2;
      String str3;
      Object localObject2;
      for (;;) {}
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
    str1 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("_data"));
    str2 = paramCursor.getString(paramCursor.getColumnIndexOrThrow(k.lBQ));
    l = paramCursor.getLong(paramCursor.getColumnIndexOrThrow(k.lBQ));
    str3 = paramCursor.getString(paramCursor.getColumnIndexOrThrow(k.lBO));
    localObject2 = paramCursor.getString(paramCursor.getColumnIndexOrThrow(k.lBP));
    if ((str2 == null) || (str2.equals("")) || (str2.equals(Integer.valueOf(0))))
    {
      g.ork.a(363L, 1L, 1L, true);
      if (0L != l) {
        g.ork.a(363L, 4L, 1L, true);
      }
      if (((str3 == null) || (str3.equals("")) || (str3.equals(Integer.valueOf(0)))) && (localObject2 != null) && (!((String)localObject2).equals("")) && (!((String)localObject2).equals(Integer.valueOf(0)))) {
        g.ork.a(363L, 3L, 1L, true);
      }
      if (((localObject2 == null) || (((String)localObject2).equals("")) || (((String)localObject2).equals(Integer.valueOf(0)))) && (str3 != null) && (!str3.equals("")) && (!str3.equals(Integer.valueOf(0)))) {
        g.ork.a(363L, 2L, 1L, true);
      }
    }
    for (;;)
    {
      localObject2 = GalleryItem.MediaItem.v(paramInt, ((Long)localObject1).longValue());
      if ((!bg.nm(str1)) && (new File(str1).exists())) {
        ((GalleryItem.MediaItem)localObject2).gVn = str1;
      }
      ((GalleryItem.MediaItem)localObject2).lBF = cn(str2, str3);
      if ((!bg.nm(((GalleryItem.MediaItem)localObject2).gVn)) || (!bg.nm(((GalleryItem.MediaItem)localObject2).kXD))) {
        break;
      }
      w.w("MicroMsg.ImageAndVideoQuery", "thumb file and orignal file both not exist");
      GMTrace.o(11911554924544L, 88748);
      return null;
      if ((localObject2 == null) || (((String)localObject2).equals("")) || (((String)localObject2).equals(Integer.valueOf(0)))) {
        g.ork.a(363L, 6L, 1L, true);
      } else if ((str3 == null) || (str3.equals("")) || (str3.equals(Integer.valueOf(0)))) {
        g.ork.a(363L, 5L, 1L, true);
      }
    }
    localObject1 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("mime_type"));
    paramCursor = (Cursor)localObject1;
    if (bg.nm((String)localObject1)) {
      paramCursor = "";
    }
    ((GalleryItem.MediaItem)localObject2).mMimeType = paramCursor;
    GMTrace.o(11911554924544L, 88748);
    return (GalleryItem.MediaItem)localObject2;
  }
  
  public final ArrayList<GalleryItem.AlbumItem> aDf()
  {
    Object localObject4 = null;
    GMTrace.i(11911152271360L, 88745);
    ArrayList localArrayList = new ArrayList();
    try
    {
      localCursor1 = this.gTC.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.lBI.getProjection(), "0==0) GROUP BY (bucket_display_name", null, this.lBI.aDj());
      if (localCursor1 == null) {
        w.d("MicroMsg.ImageAndVideoQuery", "no video folder now");
      }
    }
    catch (Exception localException1)
    {
      try
      {
        for (;;)
        {
          Cursor localCursor1 = this.gTC.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.lBH.getProjection(), "0==0) GROUP BY (bucket_display_name", null, this.lBH.aDj());
          if (localCursor1 != null) {
            break;
          }
          w.d("MicroMsg.ImageAndVideoQuery", "no image folder now");
          GMTrace.o(11911152271360L, 88745);
          return localArrayList;
          localException1 = localException1;
          w.e("MicroMsg.ImageAndVideoQuery", "query video album list failed : [%s]", new Object[] { localException1.getMessage() });
          Cursor localCursor2 = null;
          continue;
          if (localCursor2.moveToFirst())
          {
            Object localObject3 = null;
            int j = 0;
            int i;
            do
            {
              GalleryItem.AlbumItem localAlbumItem = b(localCursor2, 2, "bucket_display_name");
              localObject2 = localObject3;
              i = j;
              if (localAlbumItem != null)
              {
                j += localAlbumItem.eGL;
                localObject2 = localObject3;
                i = j;
                if (localObject3 == null)
                {
                  localObject2 = localAlbumItem.lBB;
                  i = j;
                }
              }
              localObject3 = localObject2;
              j = i;
            } while (localCursor2.moveToNext());
            localObject3 = new GalleryItem.AlbumItem(ab.getContext().getString(R.l.dyI), i);
            ((GalleryItem.AlbumItem)localObject3).lBB = ((GalleryItem.MediaItem)localObject2);
            localArrayList.add(localObject3);
          }
          localCursor2.close();
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          Object localObject2;
          w.e("MicroMsg.ImageAndVideoQuery", "query image album list failed : [%s]", new Object[] { localException2.getMessage() });
          Object localObject1 = localObject4;
          continue;
          if (((Cursor)localObject1).moveToFirst()) {
            do
            {
              localObject2 = b((Cursor)localObject1, 1, "bucket_display_name");
              if (localObject2 != null) {
                localArrayList.add(localObject2);
              }
            } while (((Cursor)localObject1).moveToNext());
          }
          ((Cursor)localObject1).close();
        }
      }
    }
  }
  
  protected final Uri aDh()
  {
    GMTrace.i(11911823360000L, 88750);
    Uri localUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    GMTrace.o(11911823360000L, 88750);
    return localUri;
  }
  
  protected final String[] aDi()
  {
    GMTrace.i(11912091795456L, 88752);
    GMTrace.o(11912091795456L, 88752);
    return null;
  }
  
  protected final String aDj()
  {
    GMTrace.i(11912360230912L, 88754);
    GMTrace.o(11912360230912L, 88754);
    return null;
  }
  
  protected final String aDk()
  {
    GMTrace.i(11912494448640L, 88755);
    GMTrace.o(11912494448640L, 88755);
    return null;
  }
  
  public final ArrayList<GalleryItem.MediaItem> b(String paramString, int paramInt, g.c paramc, long paramLong)
  {
    GMTrace.i(11911286489088L, 88746);
    w.i("MicroMsg.ImageAndVideoQuery", "queryMediaItemsInAlbum: %s", new Object[] { paramString });
    ArrayList localArrayList = new ArrayList();
    if ((paramInt == 1) || (paramInt == 3)) {}
    for (;;)
    {
      try
      {
        localCursor1 = this.gTC.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.lBH.aDi(), this.lBH.zf(paramString), null, this.lBH.aDj());
        localCursor2 = localCursor1;
      }
      catch (Exception localException1)
      {
        Cursor localCursor1;
        Cursor localCursor3;
        w.e("MicroMsg.ImageAndVideoQuery", "query image items in album failed : [%s]", new Object[] { localException1.getMessage() });
        Cursor localCursor2 = null;
        continue;
        if ((!bool1) && (!bool2) && (localMediaItem == null) && (paramString == null)) {
          continue;
        }
        if (!aDm()) {
          continue;
        }
        try
        {
          this.lBS = false;
          if (this.lBK > 1)
          {
            g.ork.a(363L, 0L, this.lBK, true);
            g.ork.a(363L, 7L, 1L, true);
            this.lBK = 0;
          }
          if (localCursor2 != null) {
            localCursor2.close();
          }
          if (localCursor3 != null) {
            localCursor3.close();
          }
          if ((paramInt == 0) && (paramc != null)) {
            paramc.a(localArrayList, paramLong);
          }
          GMTrace.o(11911286489088L, 88746);
          return localArrayList;
        }
        finally {}
        if ((localMediaItem != null) || (!bool1)) {
          continue;
        }
        localMediaItem = b(localCursor2, 1);
        boolean bool1 = localCursor2.moveToNext();
        if ((paramString != null) || (!bool2)) {
          continue;
        }
        paramString = b(localCursor3, 2);
        boolean bool2 = localCursor3.moveToNext();
        if (localMediaItem == null) {
          continue;
        }
        if ((paramString != null) && (localMediaItem.a(paramString) <= 0)) {
          continue;
        }
        w.d("MicroMsg.ImageAndVideoQuery", "image_id:%s mix_date:%s", new Object[] { Long.valueOf(bg.c(Long.valueOf(localMediaItem.lBE))), Long.valueOf(bg.c(Long.valueOf(localMediaItem.lBF))) });
        localArrayList.add(localMediaItem);
        localMediaItem = null;
        if ((localArrayList.size() % lBG != 0) || (paramc == null)) {
          continue;
        }
        paramc.a(localArrayList, paramLong);
        localArrayList.clear();
        paramInt = 1;
        continue;
        localArrayList.add(paramString);
        paramString = null;
        continue;
        if (paramString == null) {
          continue;
        }
        localArrayList.add(paramString);
        paramString = null;
        continue;
        w.w("MicroMsg.ImageAndVideoQuery", "Image item and video item are all null");
        continue;
        paramInt = 0;
        continue;
        continue;
        continue;
        localMediaItem = null;
        continue;
      }
      if ((paramInt == 2) || (paramInt == 3))
      {
        try
        {
          localCursor1 = this.gTC.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.lBI.aDi(), this.lBI.zf(paramString), null, this.lBI.aDj());
          localCursor3 = localCursor1;
        }
        catch (Exception localException2)
        {
          w.e("MicroMsg.ImageAndVideoQuery", "query video items in album failed : [%s]", new Object[] { localException2.getMessage() });
          localCursor3 = null;
          continue;
          bool1 = false;
          continue;
          bool2 = false;
          continue;
          localMediaItem = null;
          paramInt = 0;
          paramString = null;
        }
        if ((localCursor2 != null) && (localCursor2.moveToFirst()))
        {
          bool1 = true;
          if ((localCursor3 == null) || (!localCursor3.moveToFirst())) {
            continue;
          }
          bool2 = true;
          if ((bool1) || (bool2)) {
            continue;
          }
          w.d("MicroMsg.ImageAndVideoQuery", "query album failed: " + paramString);
          if (paramc != null) {
            paramc.a(localArrayList, paramLong);
          }
          GMTrace.o(11911286489088L, 88746);
          return localArrayList;
        }
      }
      GalleryItem.MediaItem localMediaItem = null;
    }
  }
  
  protected final String[] getProjection()
  {
    GMTrace.i(11911957577728L, 88751);
    GMTrace.o(11911957577728L, 88751);
    return null;
  }
  
  protected final String getSelection()
  {
    GMTrace.i(11912226013184L, 88753);
    GMTrace.o(11912226013184L, 88753);
    return null;
  }
  
  protected final int getType()
  {
    GMTrace.i(11911689142272L, 88749);
    GMTrace.o(11911689142272L, 88749);
    return 3;
  }
  
  protected final String zf(String paramString)
  {
    GMTrace.i(11912628666368L, 88756);
    GMTrace.o(11912628666368L, 88756);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */