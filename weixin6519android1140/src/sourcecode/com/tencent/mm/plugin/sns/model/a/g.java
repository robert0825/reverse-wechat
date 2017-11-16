package com.tencent.mm.plugin.sns.model.a;

import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.h.c;
import com.tencent.mm.plugin.sns.lucky.a.b;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends e
{
  private boolean gmS;
  
  public g(b.a parama, a parama1)
  {
    super(parama, parama1);
    GMTrace.i(8067424976896L, 60107);
    this.gmS = false;
    com.tencent.mm.plugin.report.service.g.ork.a(150L, 10L, 1L, true);
    GMTrace.o(8067424976896L, 60107);
  }
  
  public final boolean bjQ()
  {
    GMTrace.i(8067559194624L, 60108);
    String str2;
    String str3;
    BitmapFactory.Options localOptions;
    String str1;
    if (this.pwX.ppb != null)
    {
      str2 = i.e(this.eUs);
      this.gmS = r.II(this.pwX.getPath() + this.pwX.bjO());
      if (this.pxu) {
        this.gmS = true;
      }
      if (this.gmS) {
        com.tencent.mm.plugin.report.service.g.ork.a(22L, 64L, 1L, true);
      }
      str3 = this.pwX.getPath() + this.pwX.bjO();
      localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      MMBitmapFactory.decodeFile(str3, localOptions, null, 0, new int[0]);
      if (localOptions.outMimeType == null) {
        break label920;
      }
      str1 = localOptions.outMimeType.toLowerCase();
      if ((localOptions.outMimeType == null) || (bg.nm(localOptions.outMimeType))) {
        com.tencent.mm.plugin.report.service.g.ork.a(150L, 35L, 1L, true);
      }
      if ((!str1.contains("jpg")) && (!str1.contains("jpeg"))) {
        break label952;
      }
      int j = MMNativeJpeg.queryQuality(str3);
      i = j;
      if (j != 0) {}
    }
    label920:
    label928:
    label952:
    for (int i = -1;; i = -1)
    {
      long l1 = FileOp.kX(str3);
      if (l1 <= 0L) {
        com.tencent.mm.plugin.report.service.g.ork.a(150L, 23L, 1L, true);
      }
      long l2 = bg.Pw();
      str1 = i.i(this.eUs);
      FileOp.o(this.pwX.getPath() + this.pwX.bjO(), this.pwX.getPath() + str1);
      w.v("MicroMsg.SnsDownloadThumb", "file src" + FileOp.aZ(new StringBuilder().append(this.pwX.getPath()).append(str1).toString()));
      long l3 = bg.Pw();
      if (!r.a(this.pwX.getPath(), this.pwX.bjO(), str2, ae.bjm())) {
        com.tencent.mm.plugin.report.service.g.ork.a(150L, 27L, 1L, true);
      }
      l3 = bg.aI(l3);
      FileOp.deleteFile(this.pwX.getPath() + this.pwX.bjO());
      l2 = bg.aI(l2);
      if (!FileOp.aZ(this.pwX.getPath() + str2)) {
        com.tencent.mm.plugin.report.service.g.ork.a(150L, 31L, 1L, true);
      }
      com.tencent.mm.plugin.report.service.g.ork.i(11696, new Object[] { Integer.valueOf(3), Long.valueOf(l2), Integer.valueOf(this.pxr), Thread.currentThread().getName(), ae.bjs(), com.tencent.mm.compatible.util.e.ghx });
      if ((this.pwX.ppb.pph == 0) || (this.pwX.ppb.pph == 5))
      {
        str1 = i.f(this.eUs);
        r.b(this.pwX.getPath(), str2, str1, ae.bjl());
      }
      for (;;)
      {
        c.a(this.pwX.getPath() + str1, this.pwX.url, 1, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, i, l1, l3);
        this.pwW = i.GV(this.pwX.getPath() + str1);
        boolean bool = i.a(this.pwW);
        w.i("MicroMsg.SnsDownloadThumb", "download decode bitmap done : succ: " + bool + " isWebp: " + this.gmS + " srcImgFileSize: " + l1);
        if (!bool)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(150L, 65L, 1L, true);
          if (!this.pxw) {
            break label928;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(150L, 50L, 1L, true);
        }
        for (;;)
        {
          if (this.pxv) {
            com.tencent.mm.plugin.report.service.g.ork.a(150L, 54L, 1L, true);
          }
          if (this.pxu) {
            com.tencent.mm.plugin.report.service.g.ork.a(150L, 57L, 1L, true);
          }
          if ((this.gmS) && (!bool)) {
            com.tencent.mm.plugin.report.service.g.ork.a(22L, 65L, 1L, true);
          }
          if ((this.pxw) && (bool)) {
            b.nU(139);
          }
          GMTrace.o(8067559194624L, 60108);
          return true;
          str1 = "";
          break;
          com.tencent.mm.plugin.report.service.g.ork.a(150L, 51L, 1L, true);
        }
        str1 = str2;
      }
    }
  }
  
  protected final int bjR()
  {
    GMTrace.i(8067693412352L, 60109);
    GMTrace.o(8067693412352L, 60109);
    return 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */