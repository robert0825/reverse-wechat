package com.tencent.mm.plugin.game.gamewebview.model;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.be.a;
import com.tencent.mm.bj.d;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.ScrollAlwaysTextView;
import java.lang.ref.WeakReference;

public final class c
  extends b
{
  private ImageView iDp;
  private ScrollAlwaysTextView lIo;
  
  public c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17073971396608L, 127211);
    if (this.view != null)
    {
      this.lIo = ((ScrollAlwaysTextView)this.view.findViewById(R.h.bFc));
      this.iDp = ((ImageView)this.view.findViewById(R.h.bFb));
      this.view.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17073300307968L, 127206);
          paramAnonymousView = a.hfY;
          paramAnonymousView = a.Ol();
          if (bg.nm(paramAnonymousView))
          {
            GMTrace.o(17073300307968L, 127206);
            return;
          }
          Intent localIntent = new Intent();
          localIntent.putExtra("rawUrl", paramAnonymousView);
          localIntent.putExtra("is_from_keep_top", true);
          localIntent.addFlags(268435456);
          d.b((Context)c.this.tyb.get(), "game", ".gamewebview.ui.GameWebViewUI", localIntent);
          GMTrace.o(17073300307968L, 127206);
        }
      });
    }
    GMTrace.o(17073971396608L, 127211);
  }
  
  public final boolean abd()
  {
    GMTrace.i(17074508267520L, 127215);
    w.i("MicroMsg.GameWebViewBanner", "refreshAndReturnIsVisible");
    Object localObject = a.hfY;
    if (a.Ok())
    {
      w.i("MicroMsg.GameWebViewBanner", "refreshAndReturnIsVisible, VISIBLE");
      localObject = a.hfY;
      localObject = a.Om();
      if (this.lIo != null) {
        this.lIo.setText((CharSequence)localObject);
      }
      setVisibility(0);
      GMTrace.o(17074508267520L, 127215);
      return true;
    }
    setVisibility(8);
    GMTrace.o(17074508267520L, 127215);
    return false;
  }
  
  public final void destroy()
  {
    GMTrace.i(17074239832064L, 127213);
    GMTrace.o(17074239832064L, 127213);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(17074105614336L, 127212);
    int i = R.i.bFd;
    GMTrace.o(17074105614336L, 127212);
    return i;
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(17074374049792L, 127214);
    if (this.view != null) {
      this.view.findViewById(R.h.bFd).setVisibility(paramInt);
    }
    GMTrace.o(17074374049792L, 127214);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */