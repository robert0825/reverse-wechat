package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.q;
import java.util.ArrayList;

public final class i
{
  Bitmap bitmap;
  Context context;
  ImageView eKZ;
  SharedPreferences ghC;
  private View hqF;
  View mBA;
  View pKI;
  private h tAQ;
  public g tAR;
  public q tAS;
  boolean tAT;
  h.a tAU;
  public a tAV;
  
  public i(Context paramContext, View paramView1, View paramView2, a parama)
  {
    GMTrace.i(1019249426432L, 7594);
    this.hqF = null;
    this.eKZ = null;
    this.bitmap = null;
    this.tAT = true;
    this.context = paramContext;
    this.pKI = paramView1;
    this.mBA = paramView2;
    this.tAQ = new h(this.context);
    this.ghC = paramContext.getSharedPreferences(ab.bPU(), 0);
    this.tAV = parama;
    this.hqF = View.inflate(this.context, R.i.crW, null);
    this.eKZ = ((ImageView)this.hqF.findViewById(R.h.bXh));
    this.tAS = new q(this.hqF, -2, -2, true);
    this.tAS.setBackgroundDrawable(new ColorDrawable(0));
    this.tAS.setOutsideTouchable(true);
    this.hqF.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(993882275840L, 7405);
        if ((i.this.tAV != null) && (i.this.tAR != null)) {
          i.this.tAV.Pu(i.this.tAR.tAP);
        }
        i.this.tAS.dismiss();
        GMTrace.o(993882275840L, 7405);
      }
    });
    GMTrace.o(1019249426432L, 7594);
  }
  
  public final String bMM()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(1019383644160L, 7595);
        if (this.tAQ == null)
        {
          w.d("MicroMsg.RecentImageBubble", "because of imageQuery == null");
          localObject1 = null;
          this.tAR = ((g)localObject1);
          if (this.tAR == null)
          {
            GMTrace.o(1019383644160L, 7595);
            localObject1 = null;
            return (String)localObject1;
          }
        }
        else
        {
          localObject1 = this.tAQ.bML();
          if ((localObject1 == null) || (((ArrayList)localObject1).size() == 0))
          {
            w.d("MicroMsg.RecentImageBubble", "because of items == null || items.size() == 0");
            localObject1 = null;
            continue;
          }
          g localg = (g)((ArrayList)localObject1).get(0);
          if (localg != null)
          {
            if (bg.aG(localg.lBF) >= 0L) {
              break label313;
            }
            i = 1;
            if (i != 0)
            {
              w.e("MicroMsg.RecentImageBubble", "we found u have a future pic that lead to forbid this featur. file : %s", new Object[] { localg.tAP });
              localObject1 = null;
              continue;
            }
          }
          if ((localg != null) && (localg.tAP != null) && (localg.tAP.contains(e.ghy)))
          {
            localObject1 = null;
            continue;
          }
          if (localg != null)
          {
            if (bg.aG(localg.lBF) > 30L) {
              break label318;
            }
            i = 1;
            if (i != 0)
            {
              localObject1 = localg;
              if (!this.ghC.getString("chattingui_recent_shown_image_path", "").equals(localg.tAP)) {
                continue;
              }
              w.d("MicroMsg.RecentImageBubble", "because of recentImage.equals(imageItem.orginalPath)");
              localObject1 = null;
              continue;
            }
          }
          if (localg != null) {
            break label323;
          }
          bool = true;
          w.d("MicroMsg.RecentImageBubble", "because of checkAddDate(addDate) == false, or imageItem == null : %s", new Object[] { Boolean.valueOf(bool) });
          localObject1 = null;
          continue;
        }
        Object localObject1 = this.tAR.eIy;
        if (this.tAR.eIy == null) {
          localObject1 = this.tAR.tAP;
        }
        GMTrace.o(1019383644160L, 7595);
        continue;
        i = 0;
      }
      finally {}
      label313:
      continue;
      label318:
      int i = 0;
      continue;
      label323:
      boolean bool = false;
    }
  }
  
  final float zy(int paramInt)
  {
    GMTrace.i(1019517861888L, 7596);
    float f = TypedValue.applyDimension(1, paramInt, this.context.getResources().getDisplayMetrics());
    GMTrace.o(1019517861888L, 7596);
    return f;
  }
  
  public static abstract interface a
  {
    public abstract void Pu(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\chat\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */