package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.jo;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends i
{
  private View jKd;
  
  public e()
  {
    GMTrace.i(4989409820672L, 37174);
    GMTrace.o(4989409820672L, 37174);
  }
  
  public final void MP()
  {
    GMTrace.i(4989544038400L, 37175);
    GMTrace.o(4989544038400L, 37175);
  }
  
  public final void amM()
  {
    GMTrace.i(4989812473856L, 37177);
    if (this.jKd != null) {
      this.jKd.setVisibility(8);
    }
    GMTrace.o(4989812473856L, 37177);
  }
  
  public final void update()
  {
    GMTrace.i(4989678256128L, 37176);
    b localb = this.jKl.alv();
    jo localjo = localb.ajv().tZW;
    if (localjo != null)
    {
      w.i("MicroMsg.CardAnnoucementView", "card tp annoucement  endtime: " + localjo.oNd);
      w.i("MicroMsg.CardAnnoucementView", "card tp annoucement  text: " + localjo.text);
      w.i("MicroMsg.CardAnnoucementView", "card tp annoucement  thumb_url: " + localjo.tZv);
    }
    if ((localjo != null) && (!TextUtils.isEmpty(localjo.text)) && (localb.ajt()))
    {
      if (this.jKd == null) {
        this.jKd = ((ViewStub)findViewById(R.h.bjd)).inflate();
      }
      ((TextView)this.jKd.findViewById(R.h.bUB)).setText(localjo.text);
      this.jKd.setOnClickListener(this.jKl.alz());
      GMTrace.o(4989678256128L, 37176);
      return;
    }
    if (this.jKd != null) {
      this.jKd.setVisibility(8);
    }
    GMTrace.o(4989678256128L, 37176);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */