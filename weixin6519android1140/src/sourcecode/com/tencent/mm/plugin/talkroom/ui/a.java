package com.tencent.mm.plugin.talkroom.ui;

import android.content.Context;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.ui.base.q;

public final class a
{
  private static final int[] jsp;
  private static final int[] jsq;
  private Context context;
  private final ae jsP;
  private ImageView jsy;
  private View lkA;
  private View lkB;
  private View lkD;
  public q qym;
  private TextView qyn;
  private ImageView qyo;
  private View qyp;
  private int qyq;
  
  static
  {
    GMTrace.i(5178656817152L, 38584);
    jsp = new int[] { 0, 15, 30, 45, 60, 75, 90, 100 };
    jsq = new int[] { R.g.aTs, R.g.aTt, R.g.aTu, R.g.aTv, R.g.aTw, R.g.aTx, R.g.aTy };
    GMTrace.o(5178656817152L, 38584);
  }
  
  public a(Context paramContext)
  {
    GMTrace.i(5178388381696L, 38582);
    this.jsP = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(5175301373952L, 38559);
        super.handleMessage(paramAnonymousMessage);
        a.this.qym.dismiss();
        GMTrace.o(5175301373952L, 38559);
      }
    };
    this.context = paramContext;
    this.qyq = BackwardSupportUtil.b.a(paramContext, 180.0F);
    this.qym = new q(((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(R.i.cHA, null), -1, -2);
    this.jsy = ((ImageView)this.qym.getContentView().findViewById(R.h.clH));
    this.lkD = this.qym.getContentView().findViewById(R.h.clK);
    this.qyn = ((TextView)this.qym.getContentView().findViewById(R.h.clM));
    this.qyo = ((ImageView)this.qym.getContentView().findViewById(R.h.clL));
    this.qyp = this.qym.getContentView().findViewById(R.h.clN);
    this.lkA = this.qym.getContentView().findViewById(R.h.clO);
    this.lkB = this.qym.getContentView().findViewById(R.h.clP);
    GMTrace.o(5178388381696L, 38582);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */