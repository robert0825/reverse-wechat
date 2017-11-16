package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c;
import com.tencent.mm.sdk.platformtools.v;

public final class a
{
  public Button jUq;
  public TextView jUx;
  public long lgt;
  public boolean lgw;
  public View lgx;
  public a lgy;
  
  public a()
  {
    GMTrace.i(6463791562752L, 48159);
    this.lgw = false;
    this.lgt = x.aye();
    GMTrace.o(6463791562752L, 48159);
  }
  
  public final void ayV()
  {
    GMTrace.i(6464194215936L, 48162);
    this.jUx.setText(this.jUx.getContext().getString(R.l.dsK, new Object[] { c.cb(this.lgt) }));
    this.jUq.setEnabled(false);
    GMTrace.o(6464194215936L, 48162);
  }
  
  public final void hide()
  {
    GMTrace.i(6464059998208L, 48161);
    if (!this.lgw)
    {
      GMTrace.o(6464059998208L, 48161);
      return;
    }
    if (this.lgx.getVisibility() != 8)
    {
      this.lgx.setVisibility(8);
      this.lgx.startAnimation(AnimationUtils.loadAnimation(this.lgx.getContext(), R.a.aLt));
    }
    GMTrace.o(6464059998208L, 48161);
  }
  
  public final void show()
  {
    GMTrace.i(6463925780480L, 48160);
    if (!this.lgw)
    {
      if (this.lgx == null)
      {
        GMTrace.o(6463925780480L, 48160);
        return;
      }
      if ((this.lgx instanceof ViewStub)) {
        this.lgx = ((ViewStub)this.lgx).inflate();
      }
      this.jUx = ((TextView)this.lgx.findViewById(R.h.byE));
      if (!v.bPG()) {
        this.jUx.setTextSize(1, 14.0F);
      }
      this.jUq = ((Button)this.lgx.findViewById(R.h.byD));
      ayV();
      this.jUq.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6454127886336L, 48087);
          if (a.this.lgy == null)
          {
            GMTrace.o(6454127886336L, 48087);
            return;
          }
          a.this.lgy.ayD();
          GMTrace.o(6454127886336L, 48087);
        }
      });
      this.lgw = true;
    }
    if (this.lgx.getVisibility() != 0)
    {
      this.lgx.setVisibility(0);
      this.lgx.startAnimation(AnimationUtils.loadAnimation(this.lgx.getContext(), R.a.aLs));
    }
    GMTrace.o(6463925780480L, 48160);
  }
  
  public static abstract interface a
  {
    public abstract void ayD();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\base\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */