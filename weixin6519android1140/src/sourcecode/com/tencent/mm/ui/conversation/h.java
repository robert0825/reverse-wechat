package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.HandlerThread;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.format.Time;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class h
  extends o<ae>
  implements m.b
{
  private static long wWJ;
  private String ePK;
  protected MMSlideDelView.f jpQ;
  protected MMSlideDelView.c jpR;
  protected MMSlideDelView.e jpS;
  protected MMSlideDelView.d jpT;
  private boolean mIsFront;
  public String wWE;
  private final int wWG;
  private final int wWH;
  private boolean wWK;
  com.tencent.mm.sdk.platformtools.aj wWL;
  private boolean wWy;
  private ColorStateList[] wXX;
  private float woL;
  private float woM;
  private float woN;
  HashMap<String, a> woP;
  
  static
  {
    GMTrace.i(3386850148352L, 25234);
    wWJ = 2000L;
    GMTrace.o(3386850148352L, 25234);
  }
  
  public h(Context paramContext, String paramString, o.a parama)
  {
    super(paramContext, new ae());
    GMTrace.i(3383494705152L, 25209);
    this.wXX = new ColorStateList[5];
    this.jpT = MMSlideDelView.cah();
    this.woL = -1.0F;
    this.woM = -1.0F;
    this.woN = -1.0F;
    this.mIsFront = false;
    this.wWy = false;
    this.wWE = "";
    this.wWK = false;
    this.wWL = new com.tencent.mm.sdk.platformtools.aj(at.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(3408459202560L, 25395);
        if (h.a(h.this)) {
          h.b(h.this);
        }
        GMTrace.o(3408459202560L, 25395);
        return false;
      }
    }, false);
    this.vKu = parama;
    this.ePK = paramString;
    this.woP = new HashMap();
    this.wXX[0] = com.tencent.mm.br.a.U(paramContext, R.e.aOa);
    this.wXX[1] = com.tencent.mm.br.a.U(paramContext, R.e.aOu);
    this.wXX[3] = com.tencent.mm.br.a.U(paramContext, R.e.aOE);
    this.wXX[2] = com.tencent.mm.br.a.U(paramContext, R.e.aOs);
    this.wXX[2] = com.tencent.mm.br.a.U(paramContext, R.e.aOs);
    this.wXX[4] = com.tencent.mm.br.a.U(paramContext, R.e.aOk);
    if (com.tencent.mm.br.a.ed(paramContext)) {
      this.wWH = paramContext.getResources().getDimensionPixelSize(R.f.aPJ);
    }
    for (this.wWG = paramContext.getResources().getDimensionPixelSize(R.f.aPK);; this.wWG = paramContext.getResources().getDimensionPixelSize(R.f.aPL))
    {
      this.woL = com.tencent.mm.br.a.V(paramContext, R.f.aQF);
      this.woM = com.tencent.mm.br.a.V(paramContext, R.f.aQo);
      this.woN = com.tencent.mm.br.a.V(paramContext, R.f.aQR);
      at.AR();
      com.tencent.mm.y.c.yP().a(this);
      GMTrace.o(3383494705152L, 25209);
      return;
      this.wWH = paramContext.getResources().getDimensionPixelSize(R.f.aPI);
    }
  }
  
  private static String VP(String paramString)
  {
    GMTrace.i(3384971100160L, 25220);
    if ((paramString != null) && (paramString.length() == 32))
    {
      paramString = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vM(paramString);
      GMTrace.o(3384971100160L, 25220);
      return paramString;
    }
    GMTrace.o(3384971100160L, 25220);
    return null;
  }
  
  private CharSequence c(ae paramae, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(3384836882432L, 25219);
    if ((!t.nm(paramae.field_editingMsg)) && ((paramae.field_atCount <= 0) || (paramae.field_unReadCount <= 0)))
    {
      localObject1 = new SpannableStringBuilder(this.context.getString(R.l.dHL));
      ((SpannableStringBuilder)localObject1).setSpan(new ForegroundColorSpan(-5569532), 0, ((SpannableStringBuilder)localObject1).length(), 33);
      ((SpannableStringBuilder)localObject1).append(" ").append(com.tencent.mm.pluginsdk.ui.d.h.c(this.context, paramae.field_editingMsg, paramInt));
      GMTrace.o(3384836882432L, 25219);
      return (CharSequence)localObject1;
    }
    Object localObject1 = paramae.field_digest;
    if ((localObject1 != null) && (((String)localObject1).startsWith("<img src=\"original_label.png\"/>  ")))
    {
      paramae = new SpannableString(com.tencent.mm.pluginsdk.ui.d.h.d(this.context, (CharSequence)localObject1, paramInt));
      GMTrace.o(3384836882432L, 25219);
      return paramae;
    }
    String str1;
    if ((k(paramae) == 47) || (k(paramae) == 1048625))
    {
      localObject1 = VP(paramae.field_digest);
      str1 = "";
      if (localObject1 != null)
      {
        paramae = "[" + (String)localObject1 + "]";
        GMTrace.o(3384836882432L, 25219);
        return paramae;
      }
      localObject1 = str1;
      if (paramae.field_digest != null)
      {
        localObject1 = str1;
        if (paramae.field_digest.contains(":"))
        {
          str1 = paramae.field_digest.substring(0, paramae.field_digest.indexOf(":"));
          String str2 = VP(paramae.field_digest.substring(paramae.field_digest.indexOf(":") + 1).replace(" ", ""));
          localObject1 = str1;
          if (str2 != null)
          {
            paramae = "[" + str2 + "]";
            if (t.nm(str1))
            {
              GMTrace.o(3384836882432L, 25219);
              return paramae;
            }
            paramae = str1 + ": " + paramae;
            GMTrace.o(3384836882432L, 25219);
            return paramae;
          }
        }
      }
      str1 = this.context.getString(R.l.cSD);
      if (t.nm((String)localObject1))
      {
        localObject1 = str1;
        paramae.cO((String)localObject1);
      }
    }
    else
    {
      if (t.nm(paramae.field_digest)) {
        break label654;
      }
      if (t.nm(paramae.field_digestUser)) {
        break label643;
      }
      if ((paramae.field_isSend != 0) || (!com.tencent.mm.y.s.eb(paramae.field_username))) {
        break label631;
      }
      localObject1 = r.F(paramae.field_digestUser, paramae.field_username);
    }
    for (;;)
    {
      label631:
      label643:
      try
      {
        localObject1 = String.format(paramae.field_digest, new Object[] { localObject1 });
        str1 = ((String)localObject1).replace('\n', ' ');
        if ((paramae.field_atCount <= 0) || (paramae.field_unReadCount <= 0)) {
          break label682;
        }
        paramae = new SpannableStringBuilder(this.context.getString(R.l.dHH));
        paramae.setSpan(new ForegroundColorSpan(-5569532), 0, paramae.length(), 33);
        paramae.append(" ").append(com.tencent.mm.pluginsdk.ui.d.h.c(this.context, str1, paramInt));
        GMTrace.o(3384836882432L, 25219);
        return paramae;
      }
      catch (Exception localException) {}
      localObject1 = (String)localObject1 + ": " + str1;
      break;
      localObject1 = r.fs(paramae.field_digestUser);
      continue;
      localObject1 = paramae.field_digest;
      continue;
      label654:
      localObject2 = com.tencent.mm.booter.notification.a.h.a(paramae.field_isSend, paramae.field_username, paramae.field_content, k(paramae), this.context);
    }
    label682:
    Object localObject2 = str1;
    if (paramBoolean)
    {
      localObject2 = str1;
      if (paramae.field_unReadCount > 1) {
        localObject2 = this.context.getString(R.l.dHK, new Object[] { Integer.valueOf(paramae.field_unReadCount), str1 });
      }
    }
    paramae = com.tencent.mm.pluginsdk.ui.d.h.c(this.context, (CharSequence)localObject2, paramInt);
    GMTrace.o(3384836882432L, 25219);
    return paramae;
  }
  
  private void cgU()
  {
    GMTrace.i(3385239535616L, 25222);
    if (this.woP == null)
    {
      GMTrace.o(3385239535616L, 25222);
      return;
    }
    Iterator localIterator = this.woP.entrySet().iterator();
    while (localIterator.hasNext()) {
      ((a)((Map.Entry)localIterator.next()).getValue()).wWP = null;
    }
    GMTrace.o(3385239535616L, 25222);
  }
  
  private void cgV()
  {
    GMTrace.i(3385642188800L, 25225);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3397184913408L, 25311);
        if (!at.AU())
        {
          h.c(h.this).stopTimer();
          w.e("MicroMsg.EnterpriseConversationAdapter", "dkpno handleDataChange acc has not ready");
          GMTrace.o(3397184913408L, 25311);
          return;
        }
        long l = t.Pv();
        h.d(h.this);
        l = t.aH(l) * 3L;
        w.d("MicroMsg.EnterpriseConversationAdapter", "dkpno handleDataChange guest:%d old:%d needNotify:%b", new Object[] { Long.valueOf(l), Long.valueOf(h.chc()), Boolean.valueOf(h.a(h.this)) });
        h.fm((l + h.chc()) / 2L);
        h.e(h.this);
        com.tencent.mm.sdk.platformtools.aj localaj = h.c(h.this);
        l = h.chc();
        localaj.z(l, l);
        GMTrace.o(3397184913408L, 25311);
      }
    });
    GMTrace.o(3385642188800L, 25225);
  }
  
  private CharSequence i(ae paramae)
  {
    GMTrace.i(3385105317888L, 25221);
    if (paramae.field_status == 1)
    {
      paramae = this.context.getString(R.l.dIe);
      GMTrace.o(3385105317888L, 25221);
      return paramae;
    }
    if (paramae.field_conversationTime == Long.MAX_VALUE)
    {
      GMTrace.o(3385105317888L, 25221);
      return "";
    }
    paramae = com.tencent.mm.pluginsdk.i.n.c(this.context, paramae.field_conversationTime, true);
    GMTrace.o(3385105317888L, 25221);
    return paramae;
  }
  
  private static int k(ae paramae)
  {
    int j = 1;
    GMTrace.i(3384702664704L, 25218);
    paramae = paramae.field_msgType;
    int i = j;
    if (paramae != null)
    {
      i = j;
      if (paramae.length() <= 0) {}
    }
    try
    {
      i = Integer.valueOf(paramae).intValue();
      GMTrace.o(3384702664704L, 25218);
      return i;
    }
    catch (NumberFormatException paramae)
    {
      for (;;)
      {
        i = j;
      }
    }
  }
  
  public final void QF()
  {
    GMTrace.i(3384434229248L, 25216);
    aJe();
    at.AR();
    setCursor(com.tencent.mm.y.c.yP().c(com.tencent.mm.y.s.gmw, null, this.ePK));
    if (this.vKu != null) {
      this.vKu.QC();
    }
    super.notifyDataSetChanged();
    GMTrace.o(3384434229248L, 25216);
  }
  
  protected final void QG()
  {
    GMTrace.i(3384300011520L, 25215);
    QF();
    GMTrace.o(3384300011520L, 25215);
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(3385373753344L, 25223);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      w.e("MicroMsg.EnterpriseConversationAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      GMTrace.o(3385373753344L, 25223);
      return;
    }
    a((String)paramObject, null);
    GMTrace.o(3385373753344L, 25223);
  }
  
  public final void a(MMSlideDelView.c paramc)
  {
    GMTrace.i(3383897358336L, 25212);
    this.jpR = paramc;
    GMTrace.o(3383897358336L, 25212);
  }
  
  public final void a(MMSlideDelView.e parame)
  {
    GMTrace.i(3383763140608L, 25211);
    this.jpS = parame;
    GMTrace.o(3383763140608L, 25211);
  }
  
  public final void a(MMSlideDelView.f paramf)
  {
    GMTrace.i(3383628922880L, 25210);
    this.jpQ = paramf;
    GMTrace.o(3383628922880L, 25210);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(3385507971072L, 25224);
    w.i("MicroMsg.EnterpriseConversationAdapter", "dkpno onNotifyChange mIsFront:%b mChangedBackground:%b event:%s", new Object[] { Boolean.valueOf(this.mIsFront), Boolean.valueOf(this.wWy), paramString });
    if ((!t.nm(paramString)) && (this.woP != null)) {
      this.woP.remove(paramString);
    }
    if (this.mIsFront)
    {
      w.d("MicroMsg.EnterpriseConversationAdapter", "dkpno postTryNotify needNotify:%b timerStopped:%b", new Object[] { Boolean.valueOf(this.wWK), Boolean.valueOf(this.wWL.bQn()) });
      this.wWK = true;
      if (this.wWL.bQn()) {
        cgV();
      }
      GMTrace.o(3385507971072L, 25224);
      return;
    }
    this.wWy = true;
    GMTrace.o(3385507971072L, 25224);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(3384568446976L, 25217);
    ae localae = (ae)getItem(paramInt);
    String str = localae.field_username;
    paramViewGroup = null;
    if (paramView != null) {
      paramViewGroup = (b)paramView.getTag();
    }
    if ((paramView == null) || (paramViewGroup == null))
    {
      paramViewGroup = new b();
      if (com.tencent.mm.br.a.ed(this.context))
      {
        paramView = View.inflate(this.context, R.i.cua, null);
        paramViewGroup.hqG = ((ImageView)paramView.findViewById(R.h.bfq));
        paramViewGroup.wYa = ((NoMeasuredTextView)paramView.findViewById(R.h.bQX));
        paramViewGroup.wYa.J(this.woL);
        paramViewGroup.wYa.setTextColor(this.wXX[3]);
        paramViewGroup.wYa.whw = true;
        paramViewGroup.wYb = ((NoMeasuredTextView)paramView.findViewById(R.h.cjq));
        paramViewGroup.wYb.J(this.woN);
        paramViewGroup.wYb.setTextColor(this.wXX[4]);
        paramViewGroup.wYb.whw = false;
        paramViewGroup.wYb.xS();
        paramViewGroup.wYc = ((NoMeasuredTextView)paramView.findViewById(R.h.bJH));
        paramViewGroup.wYc.J(this.woM);
        paramViewGroup.wYc.setTextColor(this.wXX[0]);
        paramViewGroup.wYc.whw = true;
        paramViewGroup.wYd = ((TextView)paramView.findViewById(R.h.chA));
        paramViewGroup.wYd.setBackgroundResource(com.tencent.mm.ui.tools.s.fH(this.context));
        paramViewGroup.woW = ((ImageView)paramView.findViewById(R.h.bGV));
        paramViewGroup.woY = paramView.findViewById(R.h.bfr);
        paramView.findViewById(R.h.cgK).setVisibility(8);
        paramView.findViewById(R.h.bLi).setVisibility(8);
        paramView.setTag(paramViewGroup);
      }
    }
    for (;;)
    {
      a locala = (a)this.woP.get(str);
      at.AR();
      Object localObject = com.tencent.mm.y.c.yK().TE(str);
      label380:
      boolean bool;
      if (locala == null)
      {
        locala = new a();
        if (localObject != null)
        {
          locala.wWS = ((int)((com.tencent.mm.l.a)localObject).fTq);
          if (localObject == null) {
            break label1103;
          }
          bool = true;
          label388:
          locala.wWX = bool;
          if ((localObject == null) || (!((x)localObject).vd())) {
            break label1109;
          }
          bool = true;
          label411:
          locala.wWZ = bool;
          if ((localObject == null) || (!((x)localObject).vc())) {
            break label1115;
          }
          bool = true;
          label434:
          locala.wWV = bool;
          if (localae.field_unReadCount <= 0) {
            break label1121;
          }
          bool = true;
          label452:
          locala.wXZ = bool;
          locala.jHw = 0;
          if ((k(localae) == 34) && (localae.field_isSend == 0) && (!t.nm(localae.field_content)) && (!new com.tencent.mm.modelvoice.n(localae.field_content).hco)) {
            locala.jHw = 1;
          }
          locala.nickName = com.tencent.mm.pluginsdk.ui.d.h.b(this.context, r.a((x)localObject, str, false), paramViewGroup.wYa.fB.getTextSize());
          locala.wWP = i(localae);
          paramInt = (int)paramViewGroup.wYc.fB.getTextSize();
          if ((!locala.wWV) || (!locala.wXZ)) {
            break label1127;
          }
          bool = true;
          label590:
          locala.wWQ = c(localae, paramInt, bool);
          locala.wXa = localae.field_attrflag;
          switch (localae.field_status)
          {
          case 3: 
          case 4: 
          default: 
            paramInt = -1;
            label658:
            locala.wWR = paramInt;
            at.AR();
            locala.woQ = com.tencent.mm.y.c.yP().g(localae);
            locala.tpw = v.bPG();
            this.woP.put(str, locala);
          }
        }
      }
      for (;;)
      {
        if (locala.wWP == null) {
          locala.wWP = i(localae);
        }
        if ((locala.wWV) && (locala.wXZ))
        {
          paramViewGroup.wYc.setTextColor(this.wXX[0]);
          label751:
          com.tencent.mm.booter.notification.a.h.ed(paramViewGroup.wYc.getWidth());
          com.tencent.mm.booter.notification.a.h.ee((int)paramViewGroup.wYc.fB.getTextSize());
          com.tencent.mm.booter.notification.a.h.a(paramViewGroup.wYc.fB);
          if (locala.wWR == -1) {
            break label1177;
          }
          paramViewGroup.wYc.Cf(locala.wWR);
          paramViewGroup.wYc.lK(true);
          label814:
          paramViewGroup.wYc.setText(locala.wWQ);
          paramViewGroup.wYa.lL(false);
          paramViewGroup.wYa.setText(locala.nickName);
          localObject = paramViewGroup.wYb.getLayoutParams();
          if (locala.wWP.length() <= 9) {
            break label1188;
          }
          if (((ViewGroup.LayoutParams)localObject).width != this.wWH)
          {
            ((ViewGroup.LayoutParams)localObject).width = this.wWH;
            paramViewGroup.wYb.setLayoutParams((ViewGroup.LayoutParams)localObject);
          }
          label900:
          paramViewGroup.wYb.setText(locala.wWP);
          if (!locala.wWV) {
            break label1221;
          }
          paramViewGroup.woW.setVisibility(0);
          label928:
          a.b.a(paramViewGroup.hqG, str);
          paramViewGroup.wYd.setVisibility(4);
          paramViewGroup.woY.setVisibility(4);
          if ((locala.wWX) && (locala.wWS != 0))
          {
            paramInt = localae.field_unReadCount;
            if (!locala.wWV) {
              break label1238;
            }
            paramViewGroup = paramViewGroup.woY;
            if (paramInt <= 0) {
              break label1233;
            }
            paramInt = 0;
            label994:
            paramViewGroup.setVisibility(paramInt);
          }
          label999:
          if ((!locala.woQ) || (localae.field_conversationTime == -1L)) {
            break label1291;
          }
          paramView.findViewById(R.h.bsb).setBackgroundResource(R.g.aVN);
        }
        for (;;)
        {
          a.a.vOX.a(paramView, String.valueOf(locala.nickName), localae.field_unReadCount, String.valueOf(locala.wWP), String.valueOf(locala.wWQ));
          GMTrace.o(3384568446976L, 25217);
          return paramView;
          paramView = View.inflate(this.context, R.i.ctZ, null);
          break;
          locala.wWS = -1;
          break label380;
          label1103:
          bool = false;
          break label388;
          label1109:
          bool = false;
          break label411;
          label1115:
          bool = false;
          break label434;
          label1121:
          bool = false;
          break label452;
          label1127:
          bool = false;
          break label590;
          paramInt = -1;
          break label658;
          paramInt = R.k.cNc;
          break label658;
          paramInt = -1;
          break label658;
          paramInt = R.k.cNb;
          break label658;
          paramViewGroup.wYc.setTextColor(this.wXX[locala.jHw]);
          break label751;
          label1177:
          paramViewGroup.wYc.lK(false);
          break label814;
          label1188:
          if (((ViewGroup.LayoutParams)localObject).width == this.wWG) {
            break label900;
          }
          ((ViewGroup.LayoutParams)localObject).width = this.wWG;
          paramViewGroup.wYb.setLayoutParams((ViewGroup.LayoutParams)localObject);
          break label900;
          label1221:
          paramViewGroup.woW.setVisibility(8);
          break label928;
          label1233:
          paramInt = 4;
          break label994;
          label1238:
          if (paramInt > 99)
          {
            paramViewGroup.wYd.setText(R.l.efe);
            paramViewGroup.wYd.setVisibility(0);
            break label999;
          }
          if (paramInt <= 0) {
            break label999;
          }
          paramViewGroup.wYd.setText(String.valueOf(paramInt));
          paramViewGroup.wYd.setVisibility(0);
          break label999;
          label1291:
          paramView.findViewById(R.h.bsb).setBackgroundResource(R.g.aVO);
        }
      }
    }
  }
  
  public final void onPause()
  {
    GMTrace.i(3384031576064L, 25213);
    if (this.jpT != null) {
      this.jpT.aJp();
    }
    this.mIsFront = false;
    GMTrace.o(3384031576064L, 25213);
  }
  
  public final void onResume()
  {
    int i = 1;
    GMTrace.i(3384165793792L, 25214);
    this.mIsFront = true;
    Object localObject = new Time();
    ((Time)localObject).setToNow();
    localObject = com.tencent.mm.pluginsdk.i.m.a("MM/dd", (Time)localObject).toString();
    if (!this.wWE.equals(localObject)) {}
    for (;;)
    {
      this.wWE = ((String)localObject);
      if (i != 0) {
        cgU();
      }
      if (this.wWy)
      {
        super.a(null, null);
        this.wWy = false;
      }
      GMTrace.o(3384165793792L, 25214);
      return;
      i = 0;
    }
  }
  
  private final class a
  {
    public int jHw;
    public CharSequence nickName;
    public boolean tpw;
    public CharSequence wWP;
    public CharSequence wWQ;
    public int wWR;
    public int wWS;
    public boolean wWV;
    public boolean wWX;
    public boolean wWZ;
    public boolean wXZ;
    public int wXa;
    public boolean woQ;
    
    public a()
    {
      GMTrace.i(3376783818752L, 25159);
      GMTrace.o(3376783818752L, 25159);
    }
  }
  
  public static final class b
  {
    public ImageView hqG;
    public NoMeasuredTextView wYa;
    public NoMeasuredTextView wYb;
    public NoMeasuredTextView wYc;
    public TextView wYd;
    public ImageView woW;
    public View woY;
    
    public b()
    {
      GMTrace.i(3376649601024L, 25158);
      GMTrace.o(3376649601024L, 25158);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */