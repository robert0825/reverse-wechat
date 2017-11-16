package com.tencent.mm.plugin.facedetect.service;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.e.a.a;
import com.tencent.mm.plugin.facedetect.e.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends a
{
  public String hyD;
  public long kSI;
  
  public b()
  {
    GMTrace.i(5968125493248L, 44466);
    this.kSI = -1L;
    this.hyD = "";
    GMTrace.o(5968125493248L, 44466);
  }
  
  public final void A(Intent paramIntent)
  {
    GMTrace.i(5968259710976L, 44467);
    this.kSI = paramIntent.getLongExtra("k_bio_id", -1L);
    this.hyD = paramIntent.getStringExtra("key_app_id");
    w.i("MicroMsg.FaceDetectServiceControllerMp", "hy: got bioid: %d, appid: %s", new Object[] { Long.valueOf(this.kSI), this.hyD });
    w.i("MicroMsg.FaceDetectServiceControllerMp", "hy: requesting release and send video");
    if ((com.tencent.mm.plugin.facedetect.e.a.axb().kXz) && ((com.tencent.mm.plugin.facedetect.e.a.axb().axf() == a.a.kYb) || (com.tencent.mm.plugin.facedetect.e.a.axb().axf() == a.a.kYc) || (com.tencent.mm.plugin.facedetect.e.a.axb().axf() == a.a.kYd)))
    {
      final long l = bg.Pw();
      com.tencent.mm.plugin.facedetect.e.a.axb().a(new a.b()
      {
        public final void xB(String paramAnonymousString)
        {
          GMTrace.i(5970541412352L, 44484);
          w.i("MicroMsg.FaceDetectServiceControllerMp", "hy: video release done. using: %d ms. file path: %s", new Object[] { Long.valueOf(bg.aI(l)), paramAnonymousString });
          if (bg.nm(paramAnonymousString))
          {
            GMTrace.o(5970541412352L, 44484);
            return;
          }
          Intent localIntent = new Intent(ab.getContext(), FaceUploadVideoService.class);
          localIntent.putExtra("key_video_file_name", paramAnonymousString);
          localIntent.putExtra("k_bio_id", b.this.kSI);
          localIntent.putExtra("key_app_id", b.this.hyD);
          ab.getContext().startService(localIntent);
          GMTrace.o(5970541412352L, 44484);
        }
      });
      GMTrace.o(5968259710976L, 44467);
      return;
    }
    w.i("MicroMsg.FaceDetectServiceControllerMp", "hy: not recording video");
    GMTrace.o(5968259710976L, 44467);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\service\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */