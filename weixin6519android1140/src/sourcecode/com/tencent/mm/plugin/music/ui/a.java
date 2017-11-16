package com.tencent.mm.plugin.music.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.jm;
import com.tencent.mm.g.a.jm.b;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ScrollAlwaysTextView;
import java.lang.ref.WeakReference;

public final class a
  extends com.tencent.mm.pluginsdk.ui.b.b
{
  private c ian;
  private ScrollAlwaysTextView nsB;
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14523163475968L, 108206);
    if (this.view != null)
    {
      this.nsB = ((ScrollAlwaysTextView)this.view.findViewById(R.h.bPb));
      this.view.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14524103000064L, 108213);
          paramAnonymousView = new Intent();
          g.ork.i(11992, new Object[] { Integer.valueOf(1) });
          paramAnonymousView.putExtra("key_scene", 1);
          d.b((Context)a.this.tyb.get(), "music", ".ui.MusicMainUI", paramAnonymousView);
          GMTrace.o(14524103000064L, 108213);
        }
      });
    }
    this.ian = new c() {};
    com.tencent.mm.sdk.b.a.vgX.b(this.ian);
    GMTrace.o(14523163475968L, 108206);
  }
  
  public final boolean aTr()
  {
    int i = 8;
    GMTrace.i(14523834564608L, 108211);
    if (com.tencent.mm.at.b.JQ())
    {
      localObject = com.tencent.mm.at.b.JS();
      String str = ab.getContext().getString(R.l.dKr) + ab.getContext().getString(R.l.dKs) + ((apv)localObject).uFs;
      if (this.nsB != null) {
        this.nsB.setText(str);
      }
      if (((apv)localObject).uFJ) {}
      for (;;)
      {
        setVisibility(i);
        if (((apv)localObject).uFJ) {
          break;
        }
        GMTrace.o(14523834564608L, 108211);
        return true;
        i = 0;
      }
      GMTrace.o(14523834564608L, 108211);
      return false;
    }
    Object localObject = new jm();
    ((jm)localObject).eNj.action = 10;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    if (((jm)localObject).eNk.eAO)
    {
      setVisibility(0);
      GMTrace.o(14523834564608L, 108211);
      return true;
    }
    setVisibility(8);
    GMTrace.o(14523834564608L, 108211);
    return false;
  }
  
  public final boolean abd()
  {
    GMTrace.i(14523566129152L, 108209);
    boolean bool = aTr();
    GMTrace.o(14523566129152L, 108209);
    return bool;
  }
  
  public final void destroy()
  {
    GMTrace.i(14523700346880L, 108210);
    com.tencent.mm.sdk.b.a.vgX.c(this.ian);
    GMTrace.o(14523700346880L, 108210);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14523297693696L, 108207);
    int i = R.i.bPc;
    GMTrace.o(14523297693696L, 108207);
    return i;
  }
  
  public final int getOrder()
  {
    GMTrace.i(17438775181312L, 129929);
    GMTrace.o(17438775181312L, 129929);
    return 1;
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(14523431911424L, 108208);
    if (this.view != null) {
      this.view.findViewById(R.h.bPc).setVisibility(paramInt);
    }
    GMTrace.o(14523431911424L, 108208);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */