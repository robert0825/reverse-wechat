package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.af.a.d;
import com.tencent.mm.af.x;
import com.tencent.mm.ao.a.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;

public final class c
  extends o<com.tencent.mm.af.a.c>
  implements m.b
{
  private final MMActivity ezR;
  private com.tencent.mm.ao.a.a.c jQF;
  protected MMSlideDelView.f jpQ;
  protected MMSlideDelView.c jpR;
  protected MMSlideDelView.e jpS;
  protected MMSlideDelView.d jpT;
  private final String juZ;
  
  public c(Context paramContext, o.a parama, String paramString)
  {
    super(paramContext, new com.tencent.mm.af.a.c());
    GMTrace.i(2968225054720L, 22115);
    this.jpT = MMSlideDelView.cah();
    this.jQF = null;
    this.vKu = parama;
    this.ezR = ((MMActivity)paramContext);
    this.juZ = paramString;
    paramContext = new com.tencent.mm.ao.a.a.c.a();
    paramContext.gKF = com.tencent.mm.af.a.e.bk(this.juZ);
    paramContext.gKC = true;
    paramContext.gKY = true;
    paramContext.gKR = R.k.aVS;
    this.jQF = paramContext.Jn();
    GMTrace.o(2968225054720L, 22115);
  }
  
  public final void QF()
  {
    GMTrace.i(2968359272448L, 22116);
    aJe();
    d locald = x.FI();
    Object localObject = this.juZ;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select * from BizChatInfo");
    localStringBuilder.append(" where brandUserName = '").append((String)localObject).append("'");
    localStringBuilder.append(" and (bitFlag & 8").append(") != 0 ");
    localObject = localStringBuilder.append(" order by ");
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(" case when length(BizChatInfo.chatNamePY) > 0 then upper(").append("BizChatInfo.chatNamePY) ");
    localStringBuffer.append(" else upper(BizChatInfo.chatName) end asc, ");
    localStringBuffer.append(" upper(BizChatInfo.chatNamePY) asc, ");
    localStringBuffer.append(" upper(BizChatInfo.chatName) asc ");
    ((StringBuilder)localObject).append(localStringBuffer.toString());
    w.d("MicroMsg.BizChatInfoStorage", "getBizChatFavCursor: sql:%s", new Object[] { localStringBuilder.toString() });
    setCursor(locald.fTZ.rawQuery(localStringBuilder.toString(), null));
    if (this.vKu != null) {
      this.vKu.QC();
    }
    super.notifyDataSetChanged();
    GMTrace.o(2968359272448L, 22116);
  }
  
  protected final void QG()
  {
    GMTrace.i(2969433014272L, 22124);
    QF();
    GMTrace.o(2969433014272L, 22124);
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(2969567232000L, 22125);
    super.a(paramInt, paramm, paramObject);
    GMTrace.o(2969567232000L, 22125);
  }
  
  public final void a(MMSlideDelView.c paramc)
  {
    GMTrace.i(2968896143360L, 22120);
    this.jpR = paramc;
    GMTrace.o(2968896143360L, 22120);
  }
  
  public final void a(MMSlideDelView.e parame)
  {
    GMTrace.i(2968761925632L, 22119);
    this.jpS = parame;
    GMTrace.o(2968761925632L, 22119);
  }
  
  public final void a(MMSlideDelView.f paramf)
  {
    GMTrace.i(2968627707904L, 22118);
    this.jpQ = paramf;
    GMTrace.o(2968627707904L, 22118);
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(2969030361088L, 22121);
    GMTrace.o(2969030361088L, 22121);
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(2969298796544L, 22123);
    com.tencent.mm.af.a.c localc = (com.tencent.mm.af.a.c)getItem(paramInt);
    View localView;
    if (paramView == null)
    {
      paramView = new a();
      localView = View.inflate(this.ezR, R.i.cvq, null);
      paramView.hqG = ((ImageView)localView.findViewById(R.h.bfq));
      paramView.jpV = ((TextView)localView.findViewById(R.h.bPp));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      n.Jd().a(localc.field_headImageUrl, paramViewGroup.hqG, this.jQF);
      paramViewGroup.jpV.setText(h.c(this.ezR, localc.field_chatName, (int)paramViewGroup.jpV.getTextSize()));
      GMTrace.o(2969298796544L, 22123);
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(2968493490176L, 22117);
    GMTrace.o(2968493490176L, 22117);
    return 1;
  }
  
  public final void onPause()
  {
    GMTrace.i(2969164578816L, 22122);
    if (this.jpT != null) {
      this.jpT.aJp();
    }
    GMTrace.o(2969164578816L, 22122);
  }
  
  public static final class a
  {
    public ImageView hqG;
    public TextView jpV;
    
    public a()
    {
      GMTrace.i(2991310503936L, 22287);
      GMTrace.o(2991310503936L, 22287);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bizchat\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */