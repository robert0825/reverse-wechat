package com.tencent.mm.plugin.gallery.model;

import android.net.Uri;
import android.provider.MediaStore.Video.Media;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class n
  extends k
{
  public n()
  {
    GMTrace.i(11901085941760L, 88670);
    GMTrace.o(11901085941760L, 88670);
  }
  
  public final ArrayList<GalleryItem.AlbumItem> aDf()
  {
    GMTrace.i(11901354377216L, 88672);
    ArrayList localArrayList = super.aDf();
    GMTrace.o(11901354377216L, 88672);
    return localArrayList;
  }
  
  protected final Uri aDh()
  {
    GMTrace.i(11901488594944L, 88673);
    Uri localUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
    GMTrace.o(11901488594944L, 88673);
    return localUri;
  }
  
  protected final String[] aDi()
  {
    GMTrace.i(11902159683584L, 88678);
    String str1 = "COALESCE(" + k.lBP;
    String str2 = k.lBO + ",0) AS " + lBQ;
    String str3 = k.lBP;
    String str4 = k.lBO;
    GMTrace.o(11902159683584L, 88678);
    return new String[] { "_id", "_data", str1, str2, str3, str4, "mime_type" };
  }
  
  protected final String aDj()
  {
    GMTrace.i(11901891248128L, 88676);
    String str = k.lBP + " desc,_id desc";
    GMTrace.o(11901891248128L, 88676);
    return str;
  }
  
  protected final String aDk()
  {
    GMTrace.i(11902025465856L, 88677);
    GMTrace.o(11902025465856L, 88677);
    return "bucket_display_name";
  }
  
  protected final String[] getProjection()
  {
    GMTrace.i(11901622812672L, 88674);
    String str1 = "COALESCE(" + k.lBP;
    String str2 = k.lBO + ",0) AS " + lBQ;
    String str3 = k.lBP;
    String str4 = k.lBO;
    GMTrace.o(11901622812672L, 88674);
    return new String[] { "_id", "_data", "bucket_display_name", "count(*)", str1, str2, str3, str4, "mime_type" };
  }
  
  protected final String getSelection()
  {
    GMTrace.i(11901757030400L, 88675);
    GMTrace.o(11901757030400L, 88675);
    return "0==0) GROUP BY (bucket_display_name";
  }
  
  protected final int getType()
  {
    GMTrace.i(11901220159488L, 88671);
    GMTrace.o(11901220159488L, 88671);
    return 2;
  }
  
  protected final String zf(String paramString)
  {
    GMTrace.i(11902293901312L, 88679);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.VideoQuery", "get media item selection, but album name is null, do select all");
      GMTrace.o(11902293901312L, 88679);
      return null;
    }
    paramString = "bucket_display_name=\"" + paramString + "\"";
    GMTrace.o(11902293901312L, 88679);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\model\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */