package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.e.m;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.emoji.StoreBannerEmojiView;
import com.tencent.mm.protocal.c.qw;
import com.tencent.mm.protocal.c.qx;
import com.tencent.mm.protocal.c.qy;
import com.tencent.mm.protocal.c.rh;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.base.y;
import java.util.ArrayList;
import java.util.LinkedList;

public final class i
  extends y
  implements View.OnClickListener
{
  public static int khe;
  public LinkedList<com.tencent.mm.plugin.emoji.model.a> khd;
  private int khf;
  public boolean khg;
  public ArrayList<String> khh;
  private com.tencent.mm.ao.a.c.i khi;
  private Context mContext;
  public ae mHandler;
  
  static
  {
    GMTrace.i(11341800669184L, 84503);
    khe = 60;
    GMTrace.o(11341800669184L, 84503);
  }
  
  public i(Context paramContext, LinkedList<com.tencent.mm.plugin.emoji.model.a> paramLinkedList)
  {
    GMTrace.i(11340726927360L, 84495);
    this.khf = 0;
    this.khg = false;
    this.khh = new ArrayList();
    this.mHandler = new ae();
    this.khi = new com.tencent.mm.ao.a.c.i()
    {
      public final void a(String paramAnonymousString, Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(11335626653696L, 84457);
        w.i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "onImageLoadComplete url:%s", new Object[] { paramAnonymousString });
        i.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11342069104640L, 84505);
            i.this.notifyDataSetChanged();
            GMTrace.o(11342069104640L, 84505);
          }
        });
        GMTrace.o(11335626653696L, 84457);
      }
    };
    if (paramLinkedList == null) {
      throw new IllegalAccessError("must has emoji banner list");
    }
    this.mContext = paramContext;
    this.khd = new LinkedList();
    this.khd.addAll(paramLinkedList);
    GMTrace.o(11340726927360L, 84495);
  }
  
  public final void I(LinkedList<com.tencent.mm.plugin.emoji.model.a> paramLinkedList)
  {
    GMTrace.i(11340861145088L, 84496);
    this.khd.clear();
    this.khd.addAll(paramLinkedList);
    notifyDataSetChanged();
    GMTrace.o(11340861145088L, 84496);
  }
  
  public final View c(int paramInt, View paramView)
  {
    GMTrace.i(11341398016000L, 84500);
    if (this.khd == null)
    {
      GMTrace.o(11341398016000L, 84500);
      return null;
    }
    int i = paramInt % this.khd.size();
    View localView;
    a locala;
    if (paramView == null)
    {
      w.i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "getView inflate");
      localView = View.inflate(this.mContext, R.i.cvf, null);
      locala = new a(localView);
      localView.setTag(locala);
    }
    Object localObject;
    for (;;)
    {
      localView.setTag(R.h.bvR, Integer.valueOf(i));
      localView.setOnClickListener(this);
      localObject = (com.tencent.mm.plugin.emoji.model.a)this.khd.get(i);
      if (localObject != null) {
        break;
      }
      w.e("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "BaseEmotionBanner is null.");
      GMTrace.o(11341398016000L, 84500);
      return null;
      locala = (a)paramView.getTag();
      int j = com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader.aO(this.mContext)[0];
      int k = j * 3 / 8;
      locala.khl.setLayoutParams(new RelativeLayout.LayoutParams(j, k + 1));
      localView = paramView;
    }
    String str;
    if (((com.tencent.mm.plugin.emoji.model.a)localObject).kka)
    {
      str = ((com.tencent.mm.plugin.emoji.model.a)localObject).kjY.ugT.ugU;
      if (bg.nm(((com.tencent.mm.plugin.emoji.model.a)localObject).kjY.ugV))
      {
        paramView = "H5";
        if ((localObject != null) && (!bg.nm(str)))
        {
          com.tencent.mm.br.a.getDensity(this.mContext);
          localObject = EmojiLogic.a(paramView, 8, str, true);
          if (localObject != null) {
            break label414;
          }
          if (!this.khh.contains(str)) {
            break label368;
          }
          w.i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "url has add to list. no need to try load image.");
          locala.khl.cz("-", null);
        }
      }
    }
    for (;;)
    {
      w.d("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "position:%d allPostion:%d banner url:%s ", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), str });
      GMTrace.o(11341398016000L, 84500);
      return localView;
      paramView = "Toptic";
      break;
      str = ((com.tencent.mm.plugin.emoji.model.a)localObject).kjZ.ugT.ugU;
      paramView = ((com.tencent.mm.plugin.emoji.model.a)localObject).kjZ.ugS.tRS;
      break;
      label368:
      n.Jd().a(str, null, f.c(paramView, str, new Object[] { paramView, "BANNER" }), this.khi);
      this.khh.add(str);
      continue;
      label414:
      locala.khl.cz(((EmojiInfo)localObject).bUU(), null);
    }
  }
  
  public final int getCount()
  {
    GMTrace.i(11340995362816L, 84497);
    if (this.khd == null)
    {
      GMTrace.o(11340995362816L, 84497);
      return 0;
    }
    if (this.khd.size() == 1)
    {
      GMTrace.o(11340995362816L, 84497);
      return 1;
    }
    int i = this.khd.size();
    int j = khe;
    GMTrace.o(11340995362816L, 84497);
    return i * j;
  }
  
  public final int j(Object paramObject)
  {
    GMTrace.i(11341263798272L, 84499);
    if (this.khf > 0)
    {
      this.khf -= 1;
      GMTrace.o(11341263798272L, 84499);
      return -2;
    }
    int i = super.j(paramObject);
    GMTrace.o(11341263798272L, 84499);
    return i;
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(11341129580544L, 84498);
    if (!this.khg)
    {
      this.khf = getCount();
      super.notifyDataSetChanged();
      GMTrace.o(11341129580544L, 84498);
      return;
    }
    w.i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "has destroy need to notify");
    GMTrace.o(11341129580544L, 84498);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(11341532233728L, 84501);
    int i = ((Integer)paramView.getTag(R.h.bvR)).intValue();
    paramView = (com.tencent.mm.plugin.emoji.model.a)this.khd.get(i);
    rh localrh;
    if (paramView != null)
    {
      if (paramView.kka)
      {
        m.a(this.mContext, paramView.kjY, true);
        GMTrace.o(11341532233728L, 84501);
        return;
      }
      localrh = paramView.kjZ.ugS;
      if (localrh != null) {
        if (localrh != null) {
          break label151;
        }
      }
    }
    label151:
    for (paramView = "";; paramView = localrh.tRS)
    {
      w.d("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "productId %s", new Object[] { paramView });
      g.ork.i(11929, new Object[] { Integer.valueOf(0) });
      m.a(this.mContext, localrh, 15, -1, -1, "", 8);
      GMTrace.o(11341532233728L, 84501);
      return;
    }
  }
  
  final class a
  {
    StoreBannerEmojiView khl;
    ImageView khm;
    
    public a(View paramView)
    {
      GMTrace.i(11339116314624L, 84483);
      this.khl = ((StoreBannerEmojiView)paramView.findViewById(R.h.bvG));
      this.khm = ((ImageView)paramView.findViewById(R.h.bQN));
      this.khl.mfg = 0;
      GMTrace.o(11339116314624L, 84483);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */