package com.tencent.mm.plugin.gallery.model;

import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class i
  extends k
{
  private String[] lBL;
  
  public i()
  {
    GMTrace.i(11895448797184L, 88628);
    this.lBL = new String[] { "camera", "screenshot", "download" };
    GMTrace.o(11895448797184L, 88628);
  }
  
  public final ArrayList<GalleryItem.AlbumItem> aDf()
  {
    GMTrace.i(11895717232640L, 88630);
    ArrayList localArrayList = super.aDf();
    GMTrace.o(11895717232640L, 88630);
    return localArrayList;
  }
  
  public final Uri aDh()
  {
    GMTrace.i(11895851450368L, 88631);
    Uri localUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    GMTrace.o(11895851450368L, 88631);
    return localUri;
  }
  
  protected final String[] aDi()
  {
    GMTrace.i(11896522539008L, 88636);
    String str1 = "COALESCE(" + k.lBP;
    String str2 = k.lBO + ",0) AS " + lBQ;
    String str3 = k.lBP;
    String str4 = k.lBO;
    GMTrace.o(11896522539008L, 88636);
    return new String[] { "_id", "_data", str1, str2, str3, str4, "mime_type" };
  }
  
  public final String aDj()
  {
    GMTrace.i(11896254103552L, 88634);
    String str = k.lBQ + " desc,_id desc";
    GMTrace.o(11896254103552L, 88634);
    return str;
  }
  
  protected final String aDk()
  {
    GMTrace.i(11896388321280L, 88635);
    GMTrace.o(11896388321280L, 88635);
    return "bucket_display_name";
  }
  
  public final String[] getProjection()
  {
    GMTrace.i(11895985668096L, 88632);
    String str1 = "COALESCE(" + k.lBP;
    String str2 = k.lBO + ",0) AS " + lBQ;
    String str3 = k.lBP;
    String str4 = k.lBO;
    GMTrace.o(11895985668096L, 88632);
    return new String[] { "_id", "_data", "bucket_display_name", "count(*)", str1, str2, str3, str4, "mime_type" };
  }
  
  public final String getSelection()
  {
    GMTrace.i(11896119885824L, 88633);
    GMTrace.o(11896119885824L, 88633);
    return "0==0) GROUP BY (bucket_display_name";
  }
  
  protected final int getType()
  {
    GMTrace.i(11895583014912L, 88629);
    GMTrace.o(11895583014912L, 88629);
    return 1;
  }
  
  protected final String zf(String paramString)
  {
    GMTrace.i(11896656756736L, 88637);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.ImageQuery", "get media item selection, but album name is null, do select all");
      paramString = "_size>10240";
      String[] arrayOfString = this.lBL;
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        String str = arrayOfString[i];
        paramString = paramString + " or lower(_data) like '%" + str + "%'";
        i += 1;
      }
      w.d("MicroMsg.ImageQuery", "where %s", new Object[] { paramString });
      GMTrace.o(11896656756736L, 88637);
      return paramString;
    }
    paramString = "bucket_display_name=\"" + paramString + "\"";
    GMTrace.o(11896656756736L, 88637);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */