package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public final class f
  extends l
{
  private int lUN;
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(12691494141952L, 94559);
    this.lUN = 1;
    this.lZA = R.i.cyp;
    GMTrace.o(12691494141952L, 94559);
  }
  
  protected final void a(c paramc, l.b paramb)
  {
    GMTrace.i(12691762577408L, 94561);
    GMTrace.o(12691762577408L, 94561);
  }
  
  protected final void a(c paramc, l.b paramb, int paramInt)
  {
    GMTrace.i(12691628359680L, 94560);
    paramb.lZK.setText(paramc.position);
    Bitmap localBitmap = zP(paramc.field_appId);
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      paramb.lTp.setImageBitmap(localBitmap);
      paramb.lTq.setText(paramc.field_appName);
      if (!bg.nm(paramc.lLw)) {
        break label242;
      }
      paramb.lZO.setVisibility(8);
      label94:
      if (bg.cc(paramc.lLG)) {
        break label264;
      }
      paramb.lZM.setVisibility(0);
      paramb.lZM.setText((CharSequence)paramc.lLG.get(0));
    }
    for (;;)
    {
      paramb.lZQ.oX(this.lWI);
      paramb.lZP.setOnClickListener(this.lXy);
      paramb.lZQ.setOnClickListener(this.lXy);
      paramb.lZP.setTag(paramc);
      paramb.lZQ.setTag(paramc);
      this.lWN.a(paramb.lZQ, paramb.lZP, paramc, (m)this.lZE.get(paramc.field_appId));
      paramb.lZR.I(paramc.lLE);
      GMTrace.o(12691628359680L, 94560);
      return;
      paramb.lTp.setImageResource(R.g.aWS);
      break;
      label242:
      paramb.lZO.setVisibility(0);
      paramb.lZO.setText(paramc.lLw);
      break label94;
      label264:
      if (!bg.nm(paramc.lLJ))
      {
        paramb.lZM.setVisibility(0);
        paramb.lZM.setText(paramc.lLJ);
      }
      try
      {
        paramb.lZM.setBackgroundDrawable(com.tencent.mm.plugin.game.model.e.bN(Color.parseColor(paramc.lLK), a.fromDPToPix(this.mContext, 10)));
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        w.e("MicroMsg.GameCenterListAdapter", localIllegalArgumentException.getMessage());
        paramb.lZM.setVisibility(8);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.GameCenterListAdapter", localException.getMessage());
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */