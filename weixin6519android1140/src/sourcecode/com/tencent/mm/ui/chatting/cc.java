package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.fts.d.b.a.b;
import com.tencent.mm.plugin.fts.d.d.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.pluginsdk.ui.d.l;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.chatting.b.m;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMCellTextView;
import com.tencent.mm.ui.widget.MMTextView.a;
import com.tencent.mm.ui.widget.celltextview.CellTextView;
import com.tencent.mm.ui.widget.celltextview.CellTextView.b;
import com.tencent.mm.ui.widget.celltextview.CellTextView.c;
import com.tencent.mm.ui.widget.e;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.u.b;
import java.util.ArrayList;

class cc
  extends ah.b
  implements CellTextView.c
{
  public static final int wxZ;
  public static final int wya;
  private En_5b8fbb1e.a wvE;
  
  static
  {
    GMTrace.i(17907329269760L, 133420);
    wxZ = R.h.bnM;
    wya = R.h.bnL;
    GMTrace.o(17907329269760L, 133420);
  }
  
  public cc(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2284922601472L, 17024);
    GMTrace.o(2284922601472L, 17024);
  }
  
  private void a(CellTextView paramCellTextView, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3)
  {
    GMTrace.i(18999593140224L, 141558);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    if ((this.wvE.wCy.wIN >= 0L) && (this.wvE.wCy.wIO != null) && (this.wvE.wCy.wIO.size() > 0)) {
      localSpannableStringBuilder.append(com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.a(paramCharSequence1, this.wvE.wCy.wIO, a.b.lAG, d.a.lzr)).lAJ);
    }
    for (;;)
    {
      localSpannableStringBuilder.append("\n");
      localSpannableStringBuilder.append(paramCharSequence3);
      localSpannableStringBuilder.append("\n");
      localSpannableStringBuilder.append(paramCharSequence2);
      int i = paramCharSequence1.length() + 1;
      int j = paramCharSequence3.length();
      if (TextUtils.isEmpty(paramCellTextView.cjx()))
      {
        paramCellTextView.U(localSpannableStringBuilder);
        paramCellTextView.measure(0, 0);
      }
      paramCharSequence1 = this.wvE.getResources().getDrawable(R.g.bbh);
      paramCharSequence1.setBounds(0, 0, paramCellTextView.getMeasuredWidth() - paramCellTextView.getPaddingLeft() - paramCellTextView.getPaddingRight(), 2);
      localSpannableStringBuilder.setSpan(new e(paramCharSequence1), i, i + j, 33);
      localSpannableStringBuilder.setSpan(new AbsoluteSizeSpan(4, true), i, j + i + 1, 33);
      paramCellTextView.U(localSpannableStringBuilder);
      GMTrace.o(18999593140224L, 141558);
      return;
      localSpannableStringBuilder.append(paramCharSequence1);
    }
  }
  
  private String aw(au paramau)
  {
    GMTrace.i(2285593690112L, 17029);
    if (paramau != null)
    {
      String str = com.tencent.mm.y.u.gy(paramau.field_msgSvrId);
      u.b localb = com.tencent.mm.y.u.Av().p(str, true);
      localb.o("prePublishId", "msg_" + paramau.field_msgSvrId);
      localb.o("preUsername", a(this.wvE, paramau));
      localb.o("preChatName", b(this.wvE, paramau));
      GMTrace.o(2285593690112L, 17029);
      return str;
    }
    GMTrace.o(2285593690112L, 17029);
    return null;
  }
  
  public View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2285056819200L, 17025);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csf);
      ((View)localObject).setTag(new ek(this.jHw).r((View)localObject, true));
    }
    GMTrace.o(2285056819200L, 17025);
    return (View)localObject;
  }
  
  public void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2285325254656L, 17027);
    this.wvE = parama1;
    final ek localek = (ek)parama;
    Object localObject2 = paramau.field_content;
    paramString = paramau.field_transContent;
    Object localObject1 = parama1.wvd.eDs;
    localek.wHg.setTag(wxZ, Long.valueOf(paramau.field_msgId));
    localek.wHg.setTag(wya, Boolean.valueOf(true));
    int i = 0;
    int j;
    if (com.tencent.mm.app.plugin.b.pH())
    {
      localek.wtE.ma(false);
      if (paramau.bTN()) {
        if (paramau.bTS())
        {
          localek.wtE.Wf(paramau.field_transBrandWording);
          i = 1;
          if ((!parama1.wqK) || (parama1.txk)) {
            break label1127;
          }
          j = bc.gO((String)localObject2);
          if (j == -1) {
            break label1127;
          }
          parama = ((String)localObject2).substring(0, j).trim();
          if ((parama == null) || (parama.length() <= 0)) {
            break label1121;
          }
          label177:
          localObject1 = ((String)localObject2).substring(j + 1).trim();
          if (i == 0) {
            break label1104;
          }
          localObject2 = paramString.substring(j + 1).trim();
          paramString = parama;
          parama = (ah.a)localObject2;
          localObject2 = localObject1;
          localObject1 = paramString;
          paramString = (String)localObject2;
        }
      }
    }
    for (;;)
    {
      a(localek, parama1, paramau, (String)localObject1);
      a(localek, parama1, (String)localObject1, paramau);
      if ((paramau.fwv != null) && (paramau.bTX()))
      {
        j = 1;
        label268:
        if ((i == 0) || (j != 0)) {
          break label641;
        }
        if ((!x.eU(parama1.wvd.gtf)) && (!x.eU(parama1.wvd.eDs))) {
          break label564;
        }
        parama = localek.wHg.getContext();
        localek.wHg.getTextSize();
        parama = h.d(parama, paramString, 1);
        paramString = localek.wHg.getContext();
        localObject1 = paramau.field_transContent;
        localek.wHg.getTextSize();
        paramString = h.d(paramString, (CharSequence)localObject1, 1);
        localObject1 = localek.wHg;
        aw(paramau);
        a((CellTextView)localObject1, parama, paramString, " ");
      }
      for (;;)
      {
        parama = dr.a(paramau, parama1.wqK, paramInt);
        localek.wHg.setTag(parama);
        localek.wHg.setOnClickListener(parama1.wvd.wyW);
        localek.wHg.setOnLongClickListener(parama1.wvd.wyY);
        localek.wHg.xtk = this;
        localek.wHg.setTag(wxZ, Long.valueOf(paramau.field_msgId));
        localek.wHg.xtj = new CellTextView.b()
        {
          public final void S(CharSequence paramAnonymousCharSequence)
          {
            GMTrace.i(17907866140672L, 133424);
            if (((Boolean)localek.wHg.getTag(cc.wya)).booleanValue())
            {
              com.tencent.mm.ui.chatting.e.a.a.cgb();
              com.tencent.mm.ui.chatting.e.a.a.cgc().a(paramAnonymousCharSequence, ((Long)localek.wHg.getTag(cc.wxZ)).longValue());
            }
            GMTrace.o(17907866140672L, 133424);
          }
        };
        GMTrace.o(2285325254656L, 17027);
        return;
        localek.wtE.ccR();
        break;
        if (parama1.wCi.aV(paramau) == ChattingTranslateView.a.wBL)
        {
          localek.wtE.ccS();
          break;
        }
        localek.wtE.ccR();
        break;
        localek.wtE.ma(true);
        break;
        j = 0;
        break label268;
        label564:
        paramString = h.a(localek.wHg.getContext(), paramString, (int)localek.wHg.getTextSize(), 1);
        parama = h.a(localek.wHg.getContext(), parama, (int)localek.wHg.getTextSize(), 1);
        localObject1 = localek.wHg;
        aw(paramau);
        a((CellTextView)localObject1, paramString, parama, " ");
        continue;
        label641:
        if (j == 0)
        {
          localek.a(localek.wHg);
          parama = h.a(localek.wHg.getContext(), paramString, (int)localek.wHg.getTextSize(), null, aw(paramau));
          if ((parama1.wCy.wIN >= 0L) && (parama1.wCy.wIO != null) && (parama1.wCy.wIO.size() > 0))
          {
            paramString = com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.a(parama, parama1.wCy.wIO, a.b.lAG, d.a.lzr));
            localek.wHg.U(paramString.lAJ);
            label756:
            parama = (l[])parama.getSpans(0, parama.length(), l.class);
            j = parama.length;
            i = 0;
          }
          for (;;)
          {
            if (i >= j) {
              break label847;
            }
            if (parama[i].getType() == 44)
            {
              com.tencent.mm.plugin.report.service.g.ork.i(12809, new Object[] { Integer.valueOf(7), "" });
              break;
              localek.wHg.U(parama);
              break label756;
            }
            i += 1;
          }
        }
        else
        {
          label847:
          if (j != 0)
          {
            if (paramau.fwv.contains("notify@all")) {}
            for (localObject1 = "";; localObject1 = localek.wHg.getContext().getString(R.l.dTt, new Object[] { "@" }) + "\n")
            {
              if (i == 0) {
                break label1040;
              }
              paramString = h.a(localek.wHg.getContext(), localObject1 + paramString, (int)localek.wHg.getTextSize(), aw(paramau), Integer.valueOf(31));
              parama = h.a(localek.wHg.getContext(), parama, (int)localek.wHg.getTextSize(), aw(paramau), Integer.valueOf(31));
              localObject1 = localek.wHg;
              aw(paramau);
              a((CellTextView)localObject1, paramString, parama, " ");
              break;
            }
            label1040:
            parama = h.a(localek.wHg.getContext(), localObject1 + paramString, (int)localek.wHg.getTextSize(), Integer.valueOf(31), aw(paramau));
            localek.wHg.U(parama);
          }
        }
      }
      label1104:
      localObject2 = parama;
      parama = paramString;
      paramString = (String)localObject1;
      localObject1 = localObject2;
      continue;
      label1121:
      parama = (ah.a)localObject1;
      break label177;
      label1127:
      parama = paramString;
      paramString = (String)localObject2;
    }
  }
  
  public boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2285862125568L, 17031);
    int i;
    if ((paramau.bTF()) || (paramau.bTx()))
    {
      i = ((dr)paramView.getTag()).position;
      if (paramau.bTF()) {
        paramContextMenu.add(i, 102, 0, paramView.getContext().getString(R.l.dga));
      }
      paramContextMenu.add(i, 108, 0, paramView.getContext().getString(R.l.dSi));
      if (d.LL("favorite")) {
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(R.l.dNH));
      }
      if (com.tencent.mm.pluginsdk.model.app.g.N(this.wvE.vKB.vKW, paramau.field_type)) {
        paramContextMenu.add(i, 128, 0, paramView.getContext().getString(R.l.dgi));
      }
      if ((paramau.bTF()) && (com.tencent.mm.af.f.Fm())) {
        this.wvE.ceh();
      }
      if (!this.wvE.ceh()) {
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dgd));
      }
      if (com.tencent.mm.app.plugin.b.pH())
      {
        if ((!paramau.bTN()) || (!paramau.bTS())) {
          break label266;
        }
        paramContextMenu.add(i, 124, 0, paramView.getContext().getString(R.l.dgq));
      }
    }
    for (;;)
    {
      GMTrace.o(2285862125568L, 17031);
      return true;
      label266:
      paramContextMenu.add(i, 124, 0, paramView.getContext().getString(R.l.dgs));
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2285996343296L, 17032);
    GMTrace.o(2285996343296L, 17032);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2286130561024L, 17033);
    GMTrace.o(2286130561024L, 17033);
    return false;
  }
  
  protected final boolean a(En_5b8fbb1e.a parama)
  {
    GMTrace.i(2285191036928L, 17026);
    boolean bool = parama.wqK;
    GMTrace.o(2285191036928L, 17026);
    return bool;
  }
  
  protected boolean ccr()
  {
    GMTrace.i(2285727907840L, 17030);
    GMTrace.o(2285727907840L, 17030);
    return false;
  }
  
  public final boolean dv(View paramView)
  {
    GMTrace.i(18999727357952L, 141559);
    boolean bool = this.wvE.wvd.wzc.dv(paramView);
    GMTrace.o(18999727357952L, 141559);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */