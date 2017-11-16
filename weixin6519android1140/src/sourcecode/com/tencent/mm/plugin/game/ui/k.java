package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public final class k
  extends l
{
  public k(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(12724377485312L, 94804);
    this.lZA = R.i.cyU;
    GMTrace.o(12724377485312L, 94804);
  }
  
  protected final void a(c paramc, l.b paramb)
  {
    GMTrace.i(12724645920768L, 94806);
    paramb.lZT.removeAllViews();
    if (!bg.nm(paramc.lLz))
    {
      View localView = View.inflate(this.mContext, R.i.cyJ, null);
      ImageView localImageView = (ImageView)localView.findViewById(R.h.bEc);
      com.tencent.mm.ao.a.a locala = n.Jd();
      paramc = paramc.lLz;
      c.a locala1 = new c.a();
      locala1.gKB = true;
      locala.a(paramc, localImageView, locala1.Jn());
      paramb.lZT.addView(localView, new ViewGroup.LayoutParams(-1, com.tencent.mm.br.a.fromDPToPix(this.mContext, 100)));
    }
    GMTrace.o(12724645920768L, 94806);
  }
  
  protected final void a(c paramc, l.b paramb, int paramInt)
  {
    GMTrace.i(12724511703040L, 94805);
    paramb.lZK.setText(paramc.position);
    Object localObject = paramb.lZK;
    int i;
    if (this.lZC)
    {
      i = 0;
      ((TextView)localObject).setVisibility(i);
      localObject = zP(paramc.field_appId);
      if ((localObject == null) || (((Bitmap)localObject).isRecycled())) {
        break label329;
      }
      paramb.lTp.setImageBitmap((Bitmap)localObject);
      label87:
      paramb.lTq.setText(paramc.field_appName);
      if (!bg.nm(paramc.lLv)) {
        break label342;
      }
      paramb.lZN.setVisibility(8);
      label117:
      if (!bg.nm(paramc.lLw)) {
        break label364;
      }
      paramb.lZO.setVisibility(8);
      label136:
      if (bg.cc(paramc.lLG)) {
        break label386;
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
      paramb.lZS.removeAllViews();
      paramc = (View)this.lZF.get(paramInt);
      if (paramc != null)
      {
        if ((paramc.getParent() instanceof ViewGroup)) {
          ((ViewGroup)paramc.getParent()).removeAllViews();
        }
        paramb.lZS.addView(paramc);
      }
      GMTrace.o(12724511703040L, 94805);
      return;
      i = 8;
      break;
      label329:
      paramb.lTp.setImageResource(R.g.aWS);
      break label87;
      label342:
      paramb.lZN.setVisibility(0);
      paramb.lZN.setText(paramc.lLv);
      break label117;
      label364:
      paramb.lZO.setVisibility(0);
      paramb.lZO.setText(paramc.lLw);
      break label136;
      label386:
      if (!bg.nm(paramc.lLJ))
      {
        paramb.lZM.setVisibility(0);
        paramb.lZM.setText(paramc.lLJ);
      }
      try
      {
        paramb.lZM.setBackgroundDrawable(com.tencent.mm.plugin.game.model.e.bN(Color.parseColor(paramc.lLK), com.tencent.mm.br.a.fromDPToPix(this.mContext, 10)));
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        w.e("MicroMsg.GameLibraryListAdapter", localIllegalArgumentException.getMessage());
        paramb.lZM.setVisibility(8);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.GameLibraryListAdapter", localException.getMessage());
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */