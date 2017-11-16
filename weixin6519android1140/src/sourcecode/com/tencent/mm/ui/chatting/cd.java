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
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
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
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
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
import com.tencent.mm.y.u.b;
import java.util.ArrayList;

class cd
  extends ah.c
  implements CellTextView.c
{
  public static final int wxZ;
  public static final int wya;
  private En_5b8fbb1e.a wvE;
  
  static
  {
    GMTrace.i(17899276206080L, 133360);
    wxZ = R.h.bnM;
    wya = R.h.bnL;
    GMTrace.o(17899276206080L, 133360);
  }
  
  public cd(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2503429062656L, 18652);
    GMTrace.o(2503429062656L, 18652);
  }
  
  private void a(CellTextView paramCellTextView, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3)
  {
    GMTrace.i(18999324704768L, 141556);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    if ((this.wvE.wCy.wIN >= 0L) && (this.wvE.wCy.wIO != null) && (this.wvE.wCy.wIO.size() > 0)) {
      localSpannableStringBuilder.append(com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.a(paramCharSequence1, this.wvE.wCy.wIO, a.b.lAG, d.a.lzs)).lAJ);
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
      paramCharSequence1 = this.wvE.getResources().getDrawable(R.g.bbi);
      paramCharSequence1.setBounds(0, 0, paramCellTextView.getMeasuredWidth() - paramCellTextView.getPaddingLeft() - paramCellTextView.getPaddingRight(), 2);
      paramCharSequence1 = new e(paramCharSequence1);
      localSpannableStringBuilder.setSpan(new AbsoluteSizeSpan(4, true), i, i + j + 1, 33);
      localSpannableStringBuilder.setSpan(paramCharSequence1, i, j + i, 33);
      paramCellTextView.U(localSpannableStringBuilder);
      GMTrace.o(18999324704768L, 141556);
      return;
      localSpannableStringBuilder.append(paramCharSequence1);
    }
  }
  
  private String aw(au paramau)
  {
    GMTrace.i(2503965933568L, 18656);
    if (paramau != null)
    {
      String str = com.tencent.mm.y.u.gy(paramau.field_msgSvrId);
      u.b localb = com.tencent.mm.y.u.Av().p(str, true);
      localb.o("prePublishId", "msg_" + paramau.field_msgSvrId);
      localb.o("preUsername", a(this.wvE, paramau));
      localb.o("preChatName", b(this.wvE, paramau));
      GMTrace.o(2503965933568L, 18656);
      return str;
    }
    GMTrace.o(2503965933568L, 18656);
    return null;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2503563280384L, 18653);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csK);
      ((View)localObject).setTag(new ek(this.jHw).r((View)localObject, false));
    }
    GMTrace.o(2503563280384L, 18653);
    return (View)localObject;
  }
  
  public void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, final String paramString)
  {
    GMTrace.i(2503697498112L, 18654);
    this.wvE = parama1;
    paramString = (ek)parama;
    paramString.wHg.setTag(wxZ, Long.valueOf(paramau.field_msgId));
    paramString.wHg.setTag(wya, Boolean.valueOf(true));
    Object localObject1;
    int i;
    label231:
    int j;
    label250:
    Object localObject2;
    if (ccs())
    {
      if (paramString.nWt != null) {
        paramString.nWt.setVisibility(8);
      }
      if ((paramau.field_status == 1) || (paramau.field_status == 5))
      {
        if (paramString.wrV != null) {
          paramString.wrV.setVisibility(8);
        }
        paramString.wHg.setBackgroundResource(R.g.aVL);
        paramau.vBn = true;
        localObject1 = paramau.field_content;
        if (bg.nm((String)localObject1)) {
          w.e("MicroMsg.ChattingItemTextTo", "[carl] text to, content is null! why?? localid : %s, svrid : %s", new Object[] { Long.valueOf(paramau.field_msgId), Long.valueOf(paramau.field_msgSvrId) });
        }
        i = 0;
        if (!com.tencent.mm.app.plugin.b.pH()) {
          break label678;
        }
        paramString.wtE.ma(false);
        if (!paramau.bTN()) {
          break label641;
        }
        if (!paramau.bTS()) {
          break label630;
        }
        paramString.wtE.Wf(paramau.field_transBrandWording);
        i = 1;
        if ((paramau.fwv == null) || (!paramau.bTX())) {
          break label690;
        }
        j = 1;
        if ((i == 0) || (j != 0)) {
          break label777;
        }
        if ((!x.eU(parama1.wvd.gtf)) && (!x.eU(parama1.wvd.eDs))) {
          break label696;
        }
        parama = paramString.wHg.getContext();
        paramString.wHg.getTextSize();
        parama = h.d(parama, (CharSequence)localObject1, 1);
        localObject1 = paramString.wHg.getContext();
        localObject2 = paramau.field_transContent;
        paramString.wHg.getTextSize();
        localObject1 = h.d((Context)localObject1, (CharSequence)localObject2, 1);
        localObject2 = paramString.wHg;
        aw(paramau);
        a((CellTextView)localObject2, parama, (CharSequence)localObject1, " ");
      }
    }
    for (;;)
    {
      parama = dr.a(paramau, parama1.wqK, paramInt);
      paramString.wHg.setTag(parama);
      paramString.wHg.setOnClickListener(parama1.wvd.wyW);
      paramString.wHg.setOnLongClickListener(parama1.wvd.wyY);
      paramString.wHg.xtk = this;
      paramString.wHg.xtj = new CellTextView.b()
      {
        public final void S(CharSequence paramAnonymousCharSequence)
        {
          GMTrace.i(17917261381632L, 133494);
          if (((Boolean)paramString.wHg.getTag(cd.wya)).booleanValue())
          {
            com.tencent.mm.ui.chatting.e.a.a.cgb();
            com.tencent.mm.ui.chatting.e.a.a.cgc().a(paramAnonymousCharSequence, ((Long)paramString.wHg.getTag(cd.wxZ)).longValue());
          }
          GMTrace.o(17917261381632L, 133494);
        }
      };
      a(paramInt, paramString, paramau, parama1.wvd.gtf, parama1.wqK, parama1.wvd.wyW);
      GMTrace.o(2503697498112L, 18654);
      return;
      paramString.wHg.setBackgroundResource(R.g.aVK);
      if (paramString.wrV == null) {
        break;
      }
      if (a(parama1.wvd, paramau.field_msgId))
      {
        if (paramau.vBn)
        {
          parama = new AlphaAnimation(0.5F, 1.0F);
          parama.setDuration(300L);
          paramString.wHg.startAnimation(parama);
          paramau.vBn = false;
        }
        paramString.wrV.setVisibility(0);
        break;
      }
      paramString.wrV.setVisibility(8);
      break;
      if (paramString.nWt == null) {
        break;
      }
      parama = paramString.nWt;
      if (paramau.field_status >= 2) {}
      for (i = 8;; i = 0)
      {
        parama.setVisibility(i);
        break;
      }
      label630:
      paramString.wtE.ccR();
      break label231;
      label641:
      if (parama1.wCi.aV(paramau) == ChattingTranslateView.a.wBL)
      {
        paramString.wtE.ccS();
        break label231;
      }
      paramString.wtE.ccR();
      break label231;
      label678:
      paramString.wtE.ma(true);
      break label231;
      label690:
      j = 0;
      break label250;
      label696:
      parama = h.a(paramString.wHg.getContext(), (CharSequence)localObject1, (int)paramString.wHg.getTextSize(), 1);
      localObject1 = h.a(paramString.wHg.getContext(), paramau.field_transContent, (int)paramString.wHg.getTextSize(), 1);
      localObject2 = paramString.wHg;
      aw(paramau);
      a((CellTextView)localObject2, parama, (CharSequence)localObject1, " ");
      continue;
      label777:
      if (j == 0)
      {
        paramString.a(paramString.wHg);
        parama = h.a(paramString.wHg.getContext(), (CharSequence)localObject1, (int)paramString.wHg.getTextSize(), null, aw(paramau));
        localObject1 = parama1.wCy;
        long l = paramau.field_msgId;
        if ((((m)localObject1).wIN == l) && (((m)localObject1).wIM) && (((m)localObject1).wIO != null) && (((m)localObject1).wIO.size() > 0))
        {
          i = 1;
          label876:
          if (i == 0) {
            break label994;
          }
          localObject1 = com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.a(parama, parama1.wCy.wIO, a.b.lAG, d.a.lzs));
          paramString.wHg.U(((com.tencent.mm.plugin.fts.d.b.b)localObject1).lAJ);
          label916:
          parama = (l[])parama.getSpans(0, parama.length(), l.class);
          j = parama.length;
          i = 0;
        }
        for (;;)
        {
          if (i >= j) {
            break label1013;
          }
          if (parama[i].getType() == 44)
          {
            com.tencent.mm.plugin.report.service.g.ork.i(12809, new Object[] { Integer.valueOf(6), "" });
            break;
            i = 0;
            break label876;
            label994:
            paramString.wHg.U(parama);
            break label916;
          }
          i += 1;
        }
      }
      else
      {
        label1013:
        if (paramau.fwv.contains("notify@all")) {}
        for (parama = "";; parama = paramString.wHg.getContext().getString(R.l.dTt, new Object[] { "@" }) + "\n")
        {
          if (i == 0) {
            break label1202;
          }
          parama = h.a(paramString.wHg.getContext(), parama + localObject1, (int)paramString.wHg.getTextSize(), aw(paramau), Integer.valueOf(31));
          localObject1 = h.a(paramString.wHg.getContext(), paramau.field_transContent, (int)paramString.wHg.getTextSize(), aw(paramau), Integer.valueOf(31));
          localObject2 = paramString.wHg;
          aw(paramau);
          a((CellTextView)localObject2, parama, (CharSequence)localObject1, " ");
          break;
        }
        label1202:
        parama = h.a(paramString.wHg.getContext(), parama + localObject1, (int)paramString.wHg.getTextSize(), Integer.valueOf(31), aw(paramau));
        paramString.wHg.U(parama);
      }
    }
  }
  
  public boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2504100151296L, 18657);
    int i;
    int j;
    if ((paramau.fwv != null) && (paramau.fwv.contains("announcement@all")))
    {
      i = 1;
      if ((paramau.bTF()) || (paramau.bTx()))
      {
        j = ((dr)paramView.getTag()).position;
        if (paramau.bTF()) {
          paramContextMenu.add(j, 102, 0, paramView.getContext().getString(R.l.dga));
        }
        paramContextMenu.add(j, 108, 0, paramView.getContext().getString(R.l.dSi));
        if (paramau.field_status == 5) {
          paramContextMenu.add(j, 103, 0, paramView.getContext().getString(R.l.dhc));
        }
        if (d.LL("favorite")) {
          paramContextMenu.add(j, 116, 0, paramView.getContext().getString(R.l.dNH));
        }
        if (com.tencent.mm.pluginsdk.model.app.g.N(this.wvE.vKB.vKW, paramau.field_type)) {
          paramContextMenu.add(j, 128, 0, paramView.getContext().getString(R.l.dgi));
        }
        if ((i == 0) && (!paramau.bTs()) && (paramau.bTF()) && ((paramau.field_status == 2) || (paramau.fwz == 1)) && (av(paramau)) && (VU(paramau.field_talker))) {
          paramContextMenu.add(j, 123, 0, paramView.getContext().getString(R.l.dgl));
        }
        if (com.tencent.mm.app.plugin.b.pH())
        {
          if ((!paramau.bTN()) || (!paramau.bTS())) {
            break label399;
          }
          paramContextMenu.add(j, 124, 0, paramView.getContext().getString(R.l.dgq));
        }
      }
    }
    for (;;)
    {
      if ((paramau.bTF()) && (com.tencent.mm.af.f.Fm())) {
        this.wvE.ceh();
      }
      if (!this.wvE.ceh()) {
        paramContextMenu.add(j, 100, 0, paramView.getContext().getString(R.l.dgd));
      }
      GMTrace.o(2504100151296L, 18657);
      return true;
      i = 0;
      break;
      label399:
      paramContextMenu.add(j, 124, 0, paramView.getContext().getString(R.l.dgs));
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2504234369024L, 18658);
    GMTrace.o(2504234369024L, 18658);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2504368586752L, 18659);
    GMTrace.o(2504368586752L, 18659);
    return false;
  }
  
  public final boolean dv(View paramView)
  {
    GMTrace.i(18999458922496L, 141557);
    boolean bool = this.wvE.wvd.wzc.dv(paramView);
    GMTrace.o(18999458922496L, 141557);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */