package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.as.b;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.y.at;

final class a
  extends o<ae>
  implements m.b
{
  private final MMActivity ezR;
  protected MMSlideDelView.f jpQ;
  protected MMSlideDelView.c jpR;
  protected MMSlideDelView.e jpS;
  protected MMSlideDelView.d jpT;
  
  public a(Context paramContext, o.a parama)
  {
    super(paramContext, new ae());
    GMTrace.i(7631217360896L, 56857);
    this.jpT = MMSlideDelView.cah();
    this.vKu = parama;
    this.ezR = ((MMActivity)paramContext);
    GMTrace.o(7631217360896L, 56857);
  }
  
  private static int tE(String paramString)
  {
    int j = 1;
    GMTrace.i(7632559538176L, 56867);
    int i = j;
    if (paramString != null)
    {
      i = j;
      if (paramString.length() <= 0) {}
    }
    try
    {
      i = Integer.valueOf(paramString).intValue();
      GMTrace.o(7632559538176L, 56867);
      return i;
    }
    catch (NumberFormatException paramString)
    {
      for (;;)
      {
        i = j;
      }
    }
  }
  
  final String A(x paramx)
  {
    GMTrace.i(7632425320448L, 56866);
    paramx = com.tencent.mm.plugin.bottle.a.c.a(this.ezR, paramx);
    GMTrace.o(7632425320448L, 56866);
    return paramx;
  }
  
  public final void QF()
  {
    GMTrace.i(7631351578624L, 56858);
    at.AR();
    setCursor(com.tencent.mm.y.c.yP().bTe());
    if (this.vKu != null) {
      this.vKu.QC();
    }
    super.notifyDataSetChanged();
    GMTrace.o(7631351578624L, 56858);
  }
  
  protected final void QG()
  {
    GMTrace.i(7632693755904L, 56868);
    QF();
    GMTrace.o(7632693755904L, 56868);
  }
  
  public final void a(MMSlideDelView.c paramc)
  {
    GMTrace.i(7631888449536L, 56862);
    this.jpR = paramc;
    GMTrace.o(7631888449536L, 56862);
  }
  
  public final void a(MMSlideDelView.e parame)
  {
    GMTrace.i(7631754231808L, 56861);
    this.jpS = parame;
    GMTrace.o(7631754231808L, 56861);
  }
  
  public final void a(MMSlideDelView.f paramf)
  {
    GMTrace.i(7631620014080L, 56860);
    this.jpQ = paramf;
    GMTrace.o(7631620014080L, 56860);
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(7632022667264L, 56863);
    GMTrace.o(7632022667264L, 56863);
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(7632291102720L, 56865);
    ae localae = (ae)getItem(paramInt);
    Object localObject;
    label272:
    label494:
    label515:
    int i;
    int j;
    int k;
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = (MMSlideDelView)View.inflate(this.ezR, R.i.cpV, null);
      localObject = View.inflate(this.ezR, R.i.cGZ, null);
      paramViewGroup.hqG = ((ImageView)((View)localObject).findViewById(R.h.bfq));
      paramViewGroup.jpV = ((TextView)((View)localObject).findViewById(R.h.bQX));
      paramViewGroup.jpW = ((TextView)((View)localObject).findViewById(R.h.cjq));
      paramViewGroup.jpX = ((TextView)((View)localObject).findViewById(R.h.bJH));
      paramViewGroup.jpY = ((ImageView)((View)localObject).findViewById(R.h.cfH));
      paramViewGroup.jpZ = ((TextView)((View)localObject).findViewById(R.h.chA));
      paramViewGroup.jqa = paramView.findViewById(R.h.cfd);
      paramViewGroup.jqb = ((TextView)paramView.findViewById(R.h.cfe));
      paramView.setView((View)localObject);
      paramView.jpQ = this.jpQ;
      paramView.jpR = this.jpR;
      paramView.jpT = this.jpT;
      paramView.lmH = false;
      paramView.setTag(paramViewGroup);
      at.AR();
      localObject = com.tencent.mm.y.c.yK().TE(localae.field_username);
      paramViewGroup.jpV.setText(A((x)localObject));
      TextView localTextView = paramViewGroup.jpW;
      if (localae.field_status != 1) {
        break label641;
      }
      localObject = this.ezR.getString(R.l.dIe);
      localTextView.setText((CharSequence)localObject);
      a.b.a(paramViewGroup.hqG, x.Tt(localae.field_username));
      at.AR();
      localObject = com.tencent.mm.y.c.yP().pC().a(localae.field_isSend, localae.field_username, localae.field_content, tE(localae.field_msgType), this.ezR);
      paramViewGroup.jpX.setText(h.b(this.ezR, (CharSequence)localObject, paramViewGroup.jpX.getTextSize()));
      paramViewGroup.jpX.setTextColor(com.tencent.mm.br.a.U(this.ezR, R.e.aOt));
      if ((tE(localae.field_msgType) == 34) && (localae.field_isSend == 0) && (!bg.nm(localae.field_content)) && (!new com.tencent.mm.modelvoice.n(localae.field_content).hco)) {
        paramViewGroup.jpX.setTextColor(com.tencent.mm.br.a.U(this.ezR, R.e.aOu));
      }
      switch (localae.field_status)
      {
      case 3: 
      case 4: 
      default: 
        paramInt = -1;
        if (paramInt != -1)
        {
          paramViewGroup.jpY.setBackgroundResource(paramInt);
          paramViewGroup.jpY.setVisibility(0);
          paramViewGroup.jqa.setTag(localae.field_username);
          paramViewGroup.jqa.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(7633633280000L, 56875);
              w.v("MicroMsg.BottleConversationAdapter", "on delView clicked");
              a.this.jpT.aJq();
              if (a.this.jpS != null) {
                a.this.jpS.aV(paramAnonymousView.getTag());
              }
              GMTrace.o(7633633280000L, 56875);
            }
          });
          paramInt = paramView.getPaddingBottom();
          i = paramView.getPaddingTop();
          j = paramView.getPaddingRight();
          k = paramView.getPaddingLeft();
          if (localae.field_unReadCount <= 100) {
            break label695;
          }
          paramViewGroup.jpZ.setText("...");
          paramViewGroup.jpZ.setVisibility(0);
          w.v("MicroMsg.BottleConversationAdapter", "has unread 100");
        }
        break;
      }
    }
    for (;;)
    {
      paramView.setBackgroundResource(R.g.aXU);
      paramView.setPadding(k, i, j, paramInt);
      GMTrace.o(7632291102720L, 56865);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label641:
      localObject = com.tencent.mm.pluginsdk.i.n.c(this.ezR, localae.field_conversationTime, true);
      break label272;
      paramInt = -1;
      break label494;
      paramInt = R.k.cNc;
      break label494;
      paramInt = -1;
      break label494;
      paramInt = R.k.cNb;
      break label494;
      paramViewGroup.jpY.setVisibility(8);
      break label515;
      label695:
      if (localae.field_unReadCount > 0)
      {
        paramViewGroup.jpZ.setText(localae.field_unReadCount);
        paramViewGroup.jpZ.setVisibility(0);
        w.v("MicroMsg.BottleConversationAdapter", "has unread");
      }
      else
      {
        paramViewGroup.jpZ.setVisibility(4);
        w.v("MicroMsg.BottleConversationAdapter", "no unread");
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(7631485796352L, 56859);
    GMTrace.o(7631485796352L, 56859);
    return 1;
  }
  
  public final void onPause()
  {
    GMTrace.i(7632156884992L, 56864);
    if (this.jpT != null) {
      this.jpT.aJp();
    }
    GMTrace.o(7632156884992L, 56864);
  }
  
  public static final class a
  {
    public ImageView hqG;
    public TextView jpV;
    public TextView jpW;
    public TextView jpX;
    public ImageView jpY;
    public TextView jpZ;
    public View jqa;
    public TextView jqb;
    
    public a()
    {
      GMTrace.i(7628398788608L, 56836);
      GMTrace.o(7628398788608L, 56836);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */