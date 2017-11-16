package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.ao.a.a;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.pu;
import java.util.LinkedList;

public final class k
  extends i
{
  private View jKm;
  
  public k()
  {
    GMTrace.i(4995583836160L, 37220);
    GMTrace.o(4995583836160L, 37220);
  }
  
  public final void MP()
  {
    GMTrace.i(4995718053888L, 37221);
    GMTrace.o(4995718053888L, 37221);
  }
  
  public final void amM()
  {
    GMTrace.i(4995986489344L, 37223);
    if (this.jKm != null) {
      this.jKm.setVisibility(8);
    }
    GMTrace.o(4995986489344L, 37223);
  }
  
  public final void update()
  {
    GMTrace.i(4995852271616L, 37222);
    if (this.jKm == null) {
      this.jKm = ((ViewStub)findViewById(R.h.bjR)).inflate();
    }
    this.jKm.setOnClickListener(this.jKl.alz());
    Object localObject1 = this.jKl.alv().ajv().uaa;
    if (!TextUtils.isEmpty(((pu)localObject1).nIw))
    {
      ((TextView)findViewById(R.h.bjM)).setText(((pu)localObject1).nIw);
      findViewById(R.h.bjN).setVisibility(0);
    }
    ImageView localImageView;
    for (;;)
    {
      localImageView = (ImageView)findViewById(R.h.bjQ);
      if ((((pu)localObject1).ufP == null) || (((pu)localObject1).ufP.size() <= 0) || (TextUtils.isEmpty((CharSequence)((pu)localObject1).ufP.get(0)))) {
        break;
      }
      localObject1 = (String)((pu)localObject1).ufP.get(0);
      localImageView.setVisibility(0);
      Object localObject2 = new c.a();
      ((c.a)localObject2).gKF = e.ghz;
      com.tencent.mm.ao.n.Je();
      ((c.a)localObject2).gKX = null;
      ((c.a)localObject2).gKE = m.tZ((String)localObject1);
      ((c.a)localObject2).gKC = true;
      ((c.a)localObject2).gKZ = false;
      ((c.a)localObject2).gKA = true;
      localObject2 = ((c.a)localObject2).Jn();
      com.tencent.mm.ao.n.Jd().a((String)localObject1, localImageView, (c)localObject2);
      GMTrace.o(4995852271616L, 37222);
      return;
      findViewById(R.h.bjN).setVisibility(8);
    }
    localImageView.setVisibility(8);
    GMTrace.o(4995852271616L, 37222);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */