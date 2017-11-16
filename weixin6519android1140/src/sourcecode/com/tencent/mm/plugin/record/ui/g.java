package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.record.a.j;
import com.tencent.mm.plugin.record.a.m;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tz;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends j
  implements h.a
{
  public g()
  {
    GMTrace.i(7554847473664L, 56288);
    GMTrace.o(7554847473664L, 56288);
  }
  
  public final Bitmap a(h.a.b paramb)
  {
    GMTrace.i(7555250126848L, 56291);
    th localth = paramb.eIc;
    long l = paramb.ohY;
    boolean bool = paramb.eIf;
    int j = paramb.maxWidth;
    if (!com.tencent.mm.compatible.util.f.ty()) {
      paramb = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.aYv);
    }
    String str;
    for (;;)
    {
      if ((paramb == null) && (!bool))
      {
        bool = super.a(localth, l);
        w.d("MicroMsg.RecordMsgImgService", "get image fail, try download, can retry:%B", new Object[] { Boolean.valueOf(bool) });
        m.a(localth, l, bool);
      }
      GMTrace.o(7555250126848L, 56291);
      return paramb;
      str = m.c(localth, l);
      if ((bg.nm(str)) || (!e.aZ(str)))
      {
        w.d("MicroMsg.RecordMsgImgService", "getBitmap file not exist, thumb[%B] path[%s]", new Object[] { Boolean.valueOf(false), str });
        paramb = null;
      }
      else
      {
        paramb = (Bitmap)this.ldh.get(str);
        if (paramb != null)
        {
          w.d("MicroMsg.RecordMsgImgService", "get bm from cache %s", new Object[] { str });
        }
        else
        {
          if (!bool) {
            break;
          }
          paramb = null;
        }
      }
    }
    w.d("MicroMsg.RecordMsgImgService", "get from cache fail, try to decode from file, path %s", new Object[] { str });
    paramb = new BitmapFactory.Options();
    paramb.inJustDecodeBounds = true;
    Bitmap localBitmap = BitmapFactory.decodeFile(str, paramb);
    if (localBitmap != null)
    {
      w.i("MicroMsg.RecordMsgImgService", "bitmap recycle %s", new Object[] { localBitmap });
      localBitmap.recycle();
    }
    int i = paramb.outHeight;
    int m = paramb.outWidth;
    w.d("MicroMsg.RecordMsgImgService", "width: %s, height: %s", new Object[] { Integer.valueOf(m), Integer.valueOf(i) });
    int k = m;
    if (m > j)
    {
      i = paramb.outHeight * j / paramb.outWidth;
      k = j;
    }
    k = Math.max(1, k);
    i = Math.max(1, i);
    if (k > j) {
      i = paramb.outHeight * j / paramb.outWidth;
    }
    for (;;)
    {
      int n = BackwardSupportUtil.ExifHelper.Rz(str);
      if (n != 90)
      {
        m = i;
        k = j;
        if (n != 270) {}
      }
      else
      {
        k = i;
        m = j;
      }
      paramb = d.e(str, m, k, false);
      if (paramb == null)
      {
        w.e("MicroMsg.RecordMsgImgService", "extractThumbNail fail, temBmp is null, filePath = " + str);
        paramb = null;
        break;
      }
      paramb = d.b(paramb, n);
      this.ldh.put(str, paramb);
      break;
      j = k;
    }
  }
  
  public final Bitmap a(h.a.c paramc)
  {
    GMTrace.i(7555115909120L, 56290);
    paramc = super.b(paramc.eIc, paramc.ohY);
    GMTrace.o(7555115909120L, 56290);
    return paramc;
  }
  
  public final void a(h.a.a parama)
  {
    GMTrace.i(7554981691392L, 56289);
    ImageView localImageView = parama.eId;
    th localth = parama.eIc;
    long l = parama.ohY;
    int i = parama.eIe;
    int j = parama.width;
    int k = parama.height;
    if (localImageView == null)
    {
      GMTrace.o(7554981691392L, 56289);
      return;
    }
    if (!com.tencent.mm.compatible.util.f.ty())
    {
      localImageView.setImageResource(R.g.aYv);
      GMTrace.o(7554981691392L, 56289);
      return;
    }
    if (localth == null)
    {
      localImageView.setImageResource(i);
      GMTrace.o(7554981691392L, 56289);
      return;
    }
    switch (localth.aGU)
    {
    case 6: 
    case 8: 
    case 9: 
    case 12: 
    case 13: 
    default: 
      w.w("MicroMsg.RecordMsgImgService", "attach thumb, pass data type is %d", new Object[] { Integer.valueOf(localth.aGU) });
      GMTrace.o(7554981691392L, 56289);
      return;
    case 7: 
      super.a(localImageView, localth, l, localth.eDk, i, j, k);
      GMTrace.o(7554981691392L, 56289);
      return;
    case 4: 
    case 15: 
      super.a(localImageView, localth, l, localth.eDk, i, j, k);
      GMTrace.o(7554981691392L, 56289);
      return;
    case 5: 
      parama = null;
      if (localth.ukn != null)
      {
        parama = localth.ukn.ukJ;
        label274:
        if (parama != null) {
          break label340;
        }
        parama = null;
        label280:
        if (!bg.nm(parama)) {
          break label579;
        }
        parama = localth.eDk;
      }
      break;
    }
    label340:
    label579:
    for (;;)
    {
      super.a(localImageView, localth, l, parama, i, j, k);
      GMTrace.o(7554981691392L, 56289);
      return;
      w.w("MicroMsg.RecordMsgImgService", "webpage: get data proto item null, dataid[%s]", new Object[] { localth.lhq });
      break label274;
      parama = parama.thumbUrl;
      break label280;
      if (localth.ukn == null)
      {
        w.w("MicroMsg.RecordMsgImgService", "good: get data proto item null, dataid[%s]", new Object[] { localth.lhq });
        GMTrace.o(7554981691392L, 56289);
        return;
      }
      parama = localth.ukn.ukL;
      if (parama == null) {
        break;
      }
      this.ohl.a(localImageView, null, parama.thumbUrl, i, j, k);
      GMTrace.o(7554981691392L, 56289);
      return;
      if (localth.ukn == null)
      {
        w.w("MicroMsg.RecordMsgImgService", "tv: get data proto item null, dataid[%s]", new Object[] { localth.lhq });
        GMTrace.o(7554981691392L, 56289);
        return;
      }
      parama = localth.ukn.ukN;
      if (parama == null) {
        break;
      }
      this.ohl.a(localImageView, null, parama.thumbUrl, i, j, k);
      GMTrace.o(7554981691392L, 56289);
      return;
      if (localth.ukn == null)
      {
        w.w("MicroMsg.RecordMsgImgService", "product: get data proto item null, dataid[%s]", new Object[] { localth.lhq });
        GMTrace.o(7554981691392L, 56289);
        return;
      }
      parama = localth.ukn.ukL;
      if (parama == null) {
        break;
      }
      this.ohl.a(localImageView, null, parama.thumbUrl, i, j, k);
      GMTrace.o(7554981691392L, 56289);
      return;
    }
  }
  
  public final void baO()
  {
    GMTrace.i(7555384344576L, 56292);
    super.destory();
    GMTrace.o(7555384344576L, 56292);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */