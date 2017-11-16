package com.tencent.mm.plugin.sns.model.a;

import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.h.c;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends e
{
  public d(b.a parama, a parama1)
  {
    super(parama, parama1);
    GMTrace.i(8066082799616L, 60097);
    GMTrace.o(8066082799616L, 60097);
  }
  
  public final boolean bjQ()
  {
    GMTrace.i(8066217017344L, 60098);
    long l1 = -1L;
    String str1 = i.l(this.eUs);
    String str2 = this.pwX.getPath() + this.pwX.bjO();
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    MMBitmapFactory.decodeFile(str2, localOptions, null, 0, new int[0]);
    Object localObject;
    long l3;
    int i;
    if (localOptions.outMimeType != null)
    {
      localObject = localOptions.outMimeType.toLowerCase();
      l3 = FileOp.kX(str2);
      if ((!this.pxu) && (!((String)localObject).contains("webp"))) {
        break label599;
      }
      i = 0;
    }
    for (;;)
    {
      label126:
      label152:
      boolean bool;
      label170:
      long l2;
      switch (i)
      {
      default: 
        localObject = new StringBuilder("donwload big pic isWebp ");
        if (i == 0)
        {
          bool = true;
          w.i("MicroMsg.SnsDownloadImage", bool);
          l2 = FileOp.kX(this.pwX.getPath() + str1);
          g.ork.i(11696, new Object[] { Integer.valueOf(3), Long.valueOf(l1), Long.valueOf(l2), Thread.currentThread().getName(), ae.bjs(), com.tencent.mm.compatible.util.e.ghx });
          if (this.pwX.pwT == 3) {
            break label1409;
          }
        }
        break;
      }
      label599:
      label1409:
      for (i = 1;; i = 0)
      {
        int j = i;
        if (this.pwX.ppb != null)
        {
          j = i;
          if (this.pwX.ppb.pph != 4)
          {
            j = i;
            if (this.pwX.ppb.pph != 5) {
              j = 0;
            }
          }
        }
        if (j != 0)
        {
          localObject = i.e(this.eUs);
          if (FileOp.aZ(this.pwX.getPath() + (String)localObject)) {
            FileOp.deleteFile(this.pwX.getPath() + (String)localObject);
          }
          l1 = bg.Pw();
          r.a(this.pwX.getPath(), str1, (String)localObject, ae.bjm());
          l1 = bg.aI(l1);
          FileOp.kX(this.pwX.getPath() + (String)localObject);
          g.ork.i(11696, new Object[] { Integer.valueOf(3), Long.valueOf(l1), Long.valueOf(l2), Thread.currentThread().getName(), ae.bjs(), com.tencent.mm.compatible.util.e.ghx });
          localObject = i.f(this.eUs);
          if (!FileOp.aZ(this.pwX.getPath() + (String)localObject)) {
            r.b(this.pwX.getPath(), str1, (String)localObject, ae.bjl());
          }
        }
        GMTrace.o(8066217017344L, 60098);
        return true;
        localObject = "";
        break;
        if ((!this.pxv) && (!((String)localObject).contains("vcodec"))) {
          break label1414;
        }
        i = 1;
        break label126;
        g.ork.a(22L, 64L, 1L, true);
        FileOp.deleteFile(this.pwX.getPath() + str1);
        l1 = bg.Pw();
        r.d(this.pwX.getPath(), this.pwX.getPath() + this.pwX.bjO(), str1, false);
        l2 = bg.aI(l1);
        FileOp.deleteFile(this.pwX.getPath() + this.pwX.bjO());
        l1 = bg.aI(l1);
        c.a(this.pwX.getPath() + str1, this.pwX.url, 0, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, -1, l3, l2);
        break label152;
        w.i("MicroMsg.SnsDownloadImage", "found vcodec:%s, reencoded.", new Object[] { this.pwX.getPath() + this.pwX.bjO() });
        FileOp.deleteFile(this.pwX.getPath() + str1);
        l1 = bg.Pw();
        r.d(this.pwX.getPath(), this.pwX.getPath() + this.pwX.bjO(), str1, false);
        l2 = bg.aI(l1);
        FileOp.deleteFile(this.pwX.getPath() + this.pwX.bjO());
        l1 = bg.aI(l1);
        c.a(this.pwX.getPath() + str1, this.pwX.url, 0, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, -1, l3, l2);
        break label152;
        l2 = -1L;
        if (i.Ha(this.pwX.getPath() + this.pwX.bjO()))
        {
          w.w("MicroMsg.SnsDownloadImage", "the " + this.pwX.mediaId + " is too max ! " + this.pwX.url);
          FileOp.deleteFile(this.pwX.getPath() + str1);
          l1 = bg.Pw();
          r.X(this.pwX.getPath(), this.pwX.getPath() + this.pwX.bjO(), str1);
          l2 = bg.aI(l1);
          FileOp.deleteFile(this.pwX.getPath() + this.pwX.bjO());
        }
        for (l1 = bg.aI(l1);; l1 = 0L)
        {
          j = -1;
          if ((((String)localObject).contains("jpg")) || (((String)localObject).contains("jpeg")))
          {
            int k = MMNativeJpeg.queryQuality(this.pwX.getPath() + str1);
            j = k;
            if (k == 0) {
              j = -1;
            }
          }
          c.a(this.pwX.getPath() + str1, this.pwX.url, 0, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, j, l3, l2);
          break;
          FileOp.g(this.pwX.getPath(), this.pwX.bjO(), str1);
        }
        bool = false;
        break label170;
      }
      label1414:
      i = 2;
    }
  }
  
  protected final int bjR()
  {
    GMTrace.i(8066351235072L, 60099);
    GMTrace.o(8066351235072L, 60099);
    return 1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */