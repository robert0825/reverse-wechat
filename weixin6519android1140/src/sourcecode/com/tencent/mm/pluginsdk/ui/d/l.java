package com.tencent.mm.pluginsdk.ui.d;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.comm.a.b;
import com.tencent.mm.pluginsdk.ui.applet.k;
import com.tencent.mm.pluginsdk.ui.chat.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.bc;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

public class l
  extends ClickableSpan
{
  private WeakReference<View> ew;
  String hNz;
  private int iCQ;
  boolean mEnable;
  public boolean nfC;
  private k tEA;
  private Context tEt;
  private int tEy;
  f tEz;
  
  public l()
  {
    GMTrace.i(1206751592448L, 8991);
    this.nfC = false;
    this.tEz = null;
    this.tEA = null;
    this.mEnable = true;
    this.ew = null;
    this.tEt = null;
    GMTrace.o(1206751592448L, 8991);
  }
  
  public l(int paramInt, k paramk)
  {
    GMTrace.i(1206885810176L, 8992);
    this.nfC = false;
    this.tEz = null;
    this.tEA = null;
    this.mEnable = true;
    this.ew = null;
    this.tEt = null;
    int j;
    if (paramk != null)
    {
      j = paramk.linkColor;
      i = paramk.backgroundColor;
    }
    for (;;)
    {
      if ((j == 0) && (i == 0)) {
        wY(paramInt);
      }
      for (;;)
      {
        this.tEz = new f();
        this.tEA = paramk;
        GMTrace.o(1206885810176L, 8992);
        return;
        dW(j, i);
      }
      j = 0;
    }
  }
  
  public final void dW(int paramInt1, int paramInt2)
  {
    GMTrace.i(1207154245632L, 8994);
    this.tEy = paramInt1;
    this.iCQ = paramInt2;
    GMTrace.o(1207154245632L, 8994);
  }
  
  public final int getType()
  {
    GMTrace.i(20354252668928L, 151651);
    if (this.tEA == null)
    {
      GMTrace.o(20354252668928L, 151651);
      return Integer.MAX_VALUE;
    }
    int i = this.tEA.type;
    GMTrace.o(20354252668928L, 151651);
    return i;
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(1207288463360L, 8995);
    Object localObject2;
    Object localObject1;
    f localf;
    k localk;
    if ((this.tEz != null) && (this.tEA != null) && (this.mEnable))
    {
      localObject2 = this.tEz;
      if (this.tEt == null) {
        break label96;
      }
      localObject1 = this.tEt;
      ((f)localObject2).mContext = ((Context)localObject1);
      localf = this.tEz;
      localk = this.tEA;
      if (localk != null) {
        break label104;
      }
      w.e("MicroMsg.MMSpanClickListener", "onClick error, hrefInfo is null!");
    }
    for (;;)
    {
      this.tEz.mContext = null;
      GMTrace.o(1207288463360L, 8995);
      return;
      label96:
      localObject1 = paramView.getContext();
      break;
      label104:
      w.d("MicroMsg.MMSpanClickListener", "MMSpanClickListener.onClick, hrefInfo type = %d", new Object[] { Integer.valueOf(localk.type) });
      if (localf.mContext != null) {
        break label144;
      }
      w.e("MicroMsg.MMSpanClickListener", "onClick error, context is null!");
    }
    label144:
    if ((h.tEa != null) && (h.tEa.size() > 0))
    {
      int i = h.tEa.size();
      localObject1 = (e)h.tEa.getLast();
      w.d("MicroMsg.MMSpanClickListener", "spanCallbackList.size:%d, get the last callback", new Object[] { Integer.valueOf(i) });
    }
    for (;;)
    {
      au localau;
      if ((paramView != null) && ((paramView.getTag() instanceof c)))
      {
        localau = ((c)paramView.getTag()).eRz;
        if (localau != null)
        {
          localObject2 = localau.field_talker;
          paramView = (View)localObject2;
          if (!((String)localObject2).endsWith("@chatroom")) {}
        }
      }
      for (paramView = bc.gP(localau.field_content);; paramView = null)
      {
        localk.username = paramView;
        if (!TextUtils.isEmpty(localf.hNz)) {
          localk.hNz = localf.hNz;
        }
        b.a.tDK.a(localf.mContext, localk, (e)localObject1);
        localk.hNz = null;
        break;
      }
      localObject1 = null;
    }
  }
  
  public final void setContext(Context paramContext)
  {
    GMTrace.i(1207556898816L, 8997);
    this.tEt = paramContext;
    this.tEz.mContext = paramContext;
    GMTrace.o(1207556898816L, 8997);
  }
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    GMTrace.i(1207422681088L, 8996);
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setColor(this.tEy);
    paramTextPaint.setUnderlineText(false);
    if (this.nfC)
    {
      paramTextPaint.bgColor = this.iCQ;
      GMTrace.o(1207422681088L, 8996);
      return;
    }
    paramTextPaint.bgColor = 0;
    GMTrace.o(1207422681088L, 8996);
  }
  
  public void wY(int paramInt)
  {
    GMTrace.i(1207020027904L, 8993);
    Context localContext = ab.getContext();
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(1207020027904L, 8993);
      return;
      dW(localContext.getResources().getColor(a.b.kbj), -5908174);
      GMTrace.o(1207020027904L, 8993);
      return;
      dW(localContext.getResources().getColor(a.b.aOm), localContext.getResources().getColor(a.b.kbk));
      GMTrace.o(1207020027904L, 8993);
      return;
      dW(localContext.getResources().getColor(a.b.kbl), localContext.getResources().getColor(a.b.kbk));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\d\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */