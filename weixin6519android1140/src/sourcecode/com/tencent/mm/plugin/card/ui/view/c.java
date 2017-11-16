package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.pu;

public final class c
  extends i
{
  private View jJY;
  private TextView jJZ;
  
  public c()
  {
    GMTrace.i(4995046965248L, 37216);
    GMTrace.o(4995046965248L, 37216);
  }
  
  public final void MP()
  {
    GMTrace.i(4995181182976L, 37217);
    GMTrace.o(4995181182976L, 37217);
  }
  
  public final void amM()
  {
    GMTrace.i(4995449618432L, 37219);
    if (this.jJY != null) {
      this.jJY.setVisibility(8);
    }
    GMTrace.o(4995449618432L, 37219);
  }
  
  public final void update()
  {
    GMTrace.i(4995315400704L, 37218);
    if (this.jJY == null)
    {
      this.jJY = ((ViewStub)findViewById(R.h.bja)).inflate();
      this.jJZ = ((TextView)this.jJY.findViewById(R.h.bjb));
    }
    this.jJY.setVisibility(0);
    this.jJY.setOnClickListener(this.jKl.alz());
    b localb = this.jKl.alv();
    if (!TextUtils.isEmpty(localb.ajv().uaa.ufQ))
    {
      this.jJZ.setText(localb.ajv().uaa.ufQ);
      GMTrace.o(4995315400704L, 37218);
      return;
    }
    this.jJZ.setText(getString(R.l.ddf));
    GMTrace.o(4995315400704L, 37218);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */