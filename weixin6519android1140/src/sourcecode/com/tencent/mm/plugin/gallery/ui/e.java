package com.tencent.mm.plugin.gallery.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.a;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;

final class e
{
  int lEi;
  private c lEj;
  
  public e(c paramc)
  {
    GMTrace.i(11962289225728L, 89126);
    this.lEi = -1;
    this.lEj = paramc;
    GMTrace.o(11962289225728L, 89126);
  }
  
  final void ov(int paramInt)
  {
    GMTrace.i(11962423443456L, 89127);
    c localc = this.lEj;
    if ((localc.lCi == null) || (localc.lCi.size() <= paramInt) || (paramInt < 0))
    {
      GMTrace.o(11962423443456L, 89127);
      return;
    }
    long l = ((GalleryItem.MediaItem)localc.lCi.get(paramInt)).lBE;
    String str3 = ((GalleryItem.MediaItem)localc.lCi.get(paramInt)).kXD;
    String str2 = ((GalleryItem.MediaItem)localc.lCi.get(paramInt)).gVn;
    String str1 = str3;
    if (bg.nm(str3)) {
      str1 = str2;
    }
    com.tencent.mm.plugin.gallery.model.c.aCK().b(str1, ((GalleryItem.MediaItem)localc.lCi.get(paramInt)).getType(), str2, l);
    GMTrace.o(11962423443456L, 89127);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */