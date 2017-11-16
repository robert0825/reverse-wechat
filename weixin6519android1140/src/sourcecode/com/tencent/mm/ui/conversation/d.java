package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MergeCursor;
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
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rb.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.m;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.ay;
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
import com.tencent.mm.y.bl;
import com.tencent.mm.y.bm;
import com.tencent.mm.y.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class d
  extends o<ae>
  implements m.b
{
  private static long wWJ;
  private String htH;
  protected List<String> iVA;
  protected MMSlideDelView.f jpQ;
  protected MMSlideDelView.c jpR;
  protected MMSlideDelView.e jpS;
  protected MMSlideDelView.d jpT;
  private boolean mDI;
  private boolean mIsFront;
  boolean pSx;
  private boolean wWA;
  private c wWB;
  private com.tencent.mm.sdk.b.c wWC;
  private b wWD;
  public String wWE;
  final e wWF;
  private final int wWG;
  private final int wWH;
  private a wWI;
  private boolean wWK;
  private com.tencent.mm.sdk.platformtools.aj wWL;
  private boolean wWv;
  private f wWw;
  private com.tencent.mm.pluginsdk.ui.d wWx;
  private boolean wWy;
  private boolean wWz;
  private float woL;
  protected float woM;
  private float woN;
  private ColorStateList[] woO;
  HashMap<String, d> woP;
  
  static
  {
    GMTrace.i(3414364782592L, 25439);
    wWJ = 2000L;
    GMTrace.o(3414364782592L, 25439);
  }
  
  public d(Context paramContext, o.a parama)
  {
    super(paramContext, new ae());
    GMTrace.i(3410204033024L, 25408);
    this.iVA = null;
    this.woO = new ColorStateList[5];
    this.wWv = true;
    this.mDI = false;
    this.jpT = MMSlideDelView.cah();
    this.woL = -1.0F;
    this.woM = -1.0F;
    this.woN = -1.0F;
    this.mIsFront = false;
    this.wWy = false;
    this.wWz = false;
    this.wWA = false;
    this.wWC = null;
    this.wWD = null;
    this.wWE = "";
    this.wWF = new e();
    this.pSx = false;
    this.wWK = false;
    this.wWL = new com.tencent.mm.sdk.platformtools.aj(at.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(3421880975360L, 25495);
        if (d.d(d.this)) {
          d.e(d.this);
        }
        GMTrace.o(3421880975360L, 25495);
        return false;
      }
    }, false);
    this.vKu = parama;
    this.woO[0] = com.tencent.mm.br.a.U(paramContext, R.e.aOa);
    this.woO[1] = com.tencent.mm.br.a.U(paramContext, R.e.aOu);
    this.woO[3] = com.tencent.mm.br.a.U(paramContext, R.e.aOE);
    this.woO[2] = com.tencent.mm.br.a.U(paramContext, R.e.aOs);
    this.woO[2] = com.tencent.mm.br.a.U(paramContext, R.e.aOs);
    this.woO[4] = com.tencent.mm.br.a.U(paramContext, R.e.aOk);
    this.woP = new HashMap();
    if (com.tencent.mm.br.a.ed(paramContext)) {
      this.wWH = paramContext.getResources().getDimensionPixelSize(R.f.aPJ);
    }
    for (this.wWG = paramContext.getResources().getDimensionPixelSize(R.f.aPK);; this.wWG = paramContext.getResources().getDimensionPixelSize(R.f.aPL))
    {
      this.woL = com.tencent.mm.br.a.V(paramContext, R.f.aQF);
      this.woM = com.tencent.mm.br.a.V(paramContext, R.f.aQo);
      this.woN = com.tencent.mm.br.a.V(paramContext, R.f.aQR);
      GMTrace.o(3410204033024L, 25408);
      return;
      this.wWH = paramContext.getResources().getDimensionPixelSize(R.f.aPI);
    }
  }
  
  private static String VP(String paramString)
  {
    GMTrace.i(3412351516672L, 25424);
    if ((paramString != null) && (paramString.length() == 32))
    {
      paramString = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vM(paramString);
      GMTrace.o(3412351516672L, 25424);
      return paramString;
    }
    GMTrace.o(3412351516672L, 25424);
    return null;
  }
  
  private CharSequence a(ae paramae, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(3412217298944L, 25423);
    if ((!com.tencent.mm.platformtools.t.nm(paramae.field_editingMsg)) && ((paramae.field_atCount <= 0) || (paramae.field_unReadCount <= 0)))
    {
      localObject1 = new SpannableStringBuilder(this.context.getString(R.l.dHL));
      ((SpannableStringBuilder)localObject1).setSpan(new ForegroundColorSpan(-5569532), 0, ((SpannableStringBuilder)localObject1).length(), 33);
      ((SpannableStringBuilder)localObject1).append(" ").append(com.tencent.mm.pluginsdk.ui.d.h.c(this.context, paramae.field_editingMsg, paramInt));
      GMTrace.o(3412217298944L, 25423);
      return (CharSequence)localObject1;
    }
    Object localObject1 = paramae.field_digest;
    if ((localObject1 != null) && (((String)localObject1).startsWith("<img src=\"original_label.png\"/>  ")))
    {
      paramae = new SpannableString(com.tencent.mm.pluginsdk.ui.d.h.d(this.context, (CharSequence)localObject1, paramInt));
      GMTrace.o(3412217298944L, 25423);
      return paramae;
    }
    localObject1 = paramae.field_username;
    int i;
    if (((String)localObject1).equals("qqmail"))
    {
      at.AR();
      if (com.tencent.mm.platformtools.t.e((Integer)com.tencent.mm.y.c.xh().get(17, null)) == 1) {}
      for (i = 1; i == 0; i = 0)
      {
        paramae = this.context.getString(R.l.dZT);
        GMTrace.o(3412217298944L, 25423);
        return paramae;
      }
    }
    if (((String)localObject1).equals("tmessage"))
    {
      at.AR();
      localObject1 = com.tencent.mm.y.c.yS().CB("@t.qq.com");
      if ((localObject1 != null) && (((ay)localObject1).isEnable())) {}
      for (i = 1; i == 0; i = 0)
      {
        paramae = this.context.getString(R.l.dZT);
        GMTrace.o(3412217298944L, 25423);
        return paramae;
      }
    }
    String str1;
    if ((paramae.field_msgType != null) && ((paramae.field_msgType.equals("47")) || (paramae.field_msgType.equals("1048625"))))
    {
      localObject1 = VP(paramae.field_digest);
      str1 = "";
      if (localObject1 != null)
      {
        paramae = "[" + (String)localObject1 + "]";
        GMTrace.o(3412217298944L, 25423);
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
            if (com.tencent.mm.platformtools.t.nm(str1))
            {
              GMTrace.o(3412217298944L, 25423);
              return paramae;
            }
            paramae = str1 + ": " + paramae;
            GMTrace.o(3412217298944L, 25423);
            return paramae;
          }
        }
      }
      str1 = this.context.getString(R.l.cSD);
      if (com.tencent.mm.platformtools.t.nm((String)localObject1))
      {
        localObject1 = str1;
        paramae.cO((String)localObject1);
      }
    }
    else
    {
      if (com.tencent.mm.platformtools.t.nm(paramae.field_digest)) {
        break label821;
      }
      if (com.tencent.mm.platformtools.t.nm(paramae.field_digestUser)) {
        break label810;
      }
      if ((paramae.field_isSend != 0) || (!com.tencent.mm.y.s.eb(paramae.field_username))) {
        break label798;
      }
      localObject1 = r.F(paramae.field_digestUser, paramae.field_username);
    }
    label798:
    label810:
    label821:
    Object localObject2;
    for (;;)
    {
      try
      {
        localObject1 = String.format(paramae.field_digest, new Object[] { localObject1 });
        str1 = ((String)localObject1).replace('\n', ' ');
        if ((paramae.field_atCount <= 0) || (paramae.field_unReadCount <= 0)) {
          break label852;
        }
        paramae = new SpannableStringBuilder(this.context.getString(R.l.dHH));
        paramae.setSpan(new ForegroundColorSpan(-5569532), 0, paramae.length(), 33);
        paramae.append(" ").append(com.tencent.mm.pluginsdk.ui.d.h.c(this.context, str1, paramInt));
        GMTrace.o(3412217298944L, 25423);
        return paramae;
      }
      catch (Exception localException) {}
      localObject1 = (String)localObject1 + ": " + str1;
      break;
      localObject1 = r.fs(paramae.field_digestUser);
      continue;
      localObject1 = paramae.field_digest;
      continue;
      localObject2 = com.tencent.mm.booter.notification.a.h.a(paramae.field_isSend, paramae.field_username, paramae.field_content, tE(paramae.field_msgType), this.context);
    }
    label852:
    if ((paramBoolean) && (paramae.field_unReadCount > 1)) {
      localObject2 = this.context.getString(R.l.dHK, new Object[] { Integer.valueOf(paramae.field_unReadCount), str1 });
    }
    for (;;)
    {
      paramae = com.tencent.mm.pluginsdk.ui.d.h.c(this.context, (CharSequence)localObject2, paramInt);
      GMTrace.o(3412217298944L, 25423);
      return paramae;
      localObject2 = str1;
      if (paramae.field_unReadCount > 1)
      {
        localObject2 = str1;
        if (com.tencent.mm.y.s.gc(paramae.field_parentRef)) {
          localObject2 = this.context.getString(R.l.dHK, new Object[] { Integer.valueOf(paramae.field_unReadCount), str1 });
        }
      }
    }
  }
  
  private void cgU()
  {
    GMTrace.i(3411277774848L, 25416);
    if (this.woP == null)
    {
      GMTrace.o(3411277774848L, 25416);
      return;
    }
    Iterator localIterator = this.woP.entrySet().iterator();
    while (localIterator.hasNext()) {
      ((d)((Map.Entry)localIterator.next()).getValue()).wWP = null;
    }
    GMTrace.o(3411277774848L, 25416);
  }
  
  private void cgV()
  {
    GMTrace.i(3412754169856L, 25427);
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3421075668992L, 25489);
        if (!at.AU())
        {
          d.f(d.this).stopTimer();
          w.e("MicroMsg.ConversationAdapter", "dkpno handleDataChange acc has not ready");
          GMTrace.o(3421075668992L, 25489);
          return;
        }
        long l = com.tencent.mm.platformtools.t.Pv();
        d.g(d.this);
        l = com.tencent.mm.platformtools.t.aH(l) * 3L;
        w.d("MicroMsg.ConversationAdapter", "dkpno handleDataChange guest:%d old:%d needNotify:%b", new Object[] { Long.valueOf(l), Long.valueOf(d.cgW()), Boolean.valueOf(d.d(d.this)) });
        d.fl((l + d.cgW()) / 2L);
        d.h(d.this);
        com.tencent.mm.sdk.platformtools.aj localaj = d.f(d.this);
        l = d.cgW();
        localaj.z(l, l);
        GMTrace.o(3421075668992L, 25489);
      }
    });
    GMTrace.o(3412754169856L, 25427);
  }
  
  private CharSequence i(ae paramae)
  {
    GMTrace.i(3410875121664L, 25413);
    if (paramae.field_status == 1)
    {
      paramae = this.context.getString(R.l.dIe);
      GMTrace.o(3410875121664L, 25413);
      return paramae;
    }
    if (paramae.field_conversationTime == Long.MAX_VALUE)
    {
      GMTrace.o(3410875121664L, 25413);
      return "";
    }
    paramae = com.tencent.mm.pluginsdk.i.n.c(this.context, paramae.field_conversationTime, true);
    GMTrace.o(3410875121664L, 25413);
    return paramae;
  }
  
  private static int tE(String paramString)
  {
    int j = 1;
    GMTrace.i(3412083081216L, 25422);
    int i = j;
    if (paramString != null)
    {
      i = j;
      if (paramString.length() <= 0) {}
    }
    try
    {
      i = Integer.valueOf(paramString).intValue();
      GMTrace.o(3412083081216L, 25422);
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
  
  public void QF()
  {
    GMTrace.i(3411680428032L, 25419);
    w.i("MicroMsg.ConversationAdapter", "dkpno resetCursor search:%b", new Object[] { Boolean.valueOf(this.mDI) });
    if (this.mDI)
    {
      Cursor[] arrayOfCursor = new Cursor[2];
      arrayOfCursor[0] = at.AR().glP.a(com.tencent.mm.y.s.gmw, this.iVA, this.htH);
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      if ((this.iVA != null) && (this.iVA.size() > 0)) {
        localArrayList1.addAll(this.iVA);
      }
      try
      {
        while (arrayOfCursor[0].moveToNext())
        {
          String str = arrayOfCursor[0].getString(arrayOfCursor[0].getColumnIndex("username"));
          localArrayList1.add(str);
          if (!str.endsWith("@chatroom")) {
            localArrayList2.add(str);
          }
          w.d("MicroMsg.ConversationAdapter", "block user " + str);
        }
        if (this.wWw == null) {}
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.ConversationAdapter", localException, "", new Object[0]);
        localArrayList1.add("officialaccounts");
        localArrayList1.add("helper_entry");
        arrayOfCursor[1] = at.AR().glQ.b(this.htH, "@micromsg.with.all.biz.qq.com", localArrayList1, localArrayList2);
        setCursor(new MergeCursor(arrayOfCursor));
      }
    }
    for (;;)
    {
      if (this.htH != null) {
        getCursor().getCount();
      }
      super.notifyDataSetChanged();
      GMTrace.o(3411680428032L, 25419);
      return;
      at.AR();
      setCursor(com.tencent.mm.y.c.yP().a(com.tencent.mm.y.s.gmw, this.iVA, com.tencent.mm.m.a.fTs, false));
    }
  }
  
  protected final void QG()
  {
    GMTrace.i(3411009339392L, 25414);
    QF();
    GMTrace.o(3411009339392L, 25414);
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(3412485734400L, 25425);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      w.e("MicroMsg.ConversationAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      GMTrace.o(3412485734400L, 25425);
      return;
    }
    a((String)paramObject, null);
    GMTrace.o(3412485734400L, 25425);
  }
  
  public final void a(MMSlideDelView.c paramc)
  {
    GMTrace.i(3410606686208L, 25411);
    this.jpR = paramc;
    GMTrace.o(3410606686208L, 25411);
  }
  
  public final void a(MMSlideDelView.e parame)
  {
    GMTrace.i(3410472468480L, 25410);
    this.jpS = parame;
    GMTrace.o(3410472468480L, 25410);
  }
  
  public final void a(MMSlideDelView.f paramf)
  {
    GMTrace.i(3410338250752L, 25409);
    this.jpQ = paramf;
    GMTrace.o(3410338250752L, 25409);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(3412619952128L, 25426);
    w.i("MicroMsg.ConversationAdapter", "dkpno onNotifyChange mIsFront:%b mChangedBackground:%b event:%s", new Object[] { Boolean.valueOf(this.mIsFront), Boolean.valueOf(this.wWy), paramString });
    if ((!com.tencent.mm.platformtools.t.nm(paramString)) && (this.woP != null)) {
      this.woP.remove(paramString);
    }
    if (this.mIsFront)
    {
      w.d("MicroMsg.ConversationAdapter", "dkpno postTryNotify needNotify:%b timerStopped:%b", new Object[] { Boolean.valueOf(this.wWK), Boolean.valueOf(this.wWL.bQn()) });
      this.wWK = true;
      if (this.wWL.bQn()) {
        cgV();
      }
      GMTrace.o(3412619952128L, 25426);
      return;
    }
    this.wWy = true;
    GMTrace.o(3412619952128L, 25426);
  }
  
  protected void a(String paramString, g paramg)
  {
    GMTrace.i(3411948863488L, 25421);
    GMTrace.o(3411948863488L, 25421);
  }
  
  public void detach()
  {
    GMTrace.i(3410740903936L, 25412);
    GMTrace.o(3410740903936L, 25412);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(3411814645760L, 25420);
    ae localae = (ae)getItem(paramInt);
    String str = localae.field_username;
    paramViewGroup = this.wWF;
    paramViewGroup.eDs = str;
    paramViewGroup.iBi = null;
    paramViewGroup.wXb = null;
    paramViewGroup.fUo = false;
    if (!com.tencent.mm.platformtools.t.nm(str)) {
      paramViewGroup.fUo = true;
    }
    this.wWI = new a();
    Object localObject1;
    label439:
    Object localObject2;
    x localx;
    label549:
    boolean bool;
    label557:
    label580:
    label603:
    label647:
    Object localObject3;
    if (paramView == null)
    {
      paramViewGroup = new g();
      if (com.tencent.mm.br.a.ed(this.context))
      {
        paramView = View.inflate(this.context, R.i.cua, null);
        paramViewGroup.hqG = ((ImageView)paramView.findViewById(R.h.bfq));
        a.b.a(paramViewGroup.hqG, str);
        localObject1 = (com.tencent.mm.pluginsdk.ui.a)paramViewGroup.hqG.getDrawable();
        if (this.wWx != null) {
          this.wWx.a((com.tencent.mm.pluginsdk.ui.d.a)localObject1);
        }
        paramViewGroup.woT = ((NoMeasuredTextView)paramView.findViewById(R.h.bQX));
        paramViewGroup.wXc = ((NoMeasuredTextView)paramView.findViewById(R.h.cfB));
        paramViewGroup.woU = ((NoMeasuredTextView)paramView.findViewById(R.h.cjq));
        paramViewGroup.woV = ((NoMeasuredTextView)paramView.findViewById(R.h.bJH));
        paramViewGroup.jpZ = ((TextView)paramView.findViewById(R.h.chA));
        paramViewGroup.jpZ.setBackgroundResource(com.tencent.mm.ui.tools.s.fH(this.context));
        paramViewGroup.woW = ((ImageView)paramView.findViewById(R.h.bGV));
        paramViewGroup.woY = paramView.findViewById(R.h.bfr);
        paramViewGroup.woX = ((ImageView)paramView.findViewById(R.h.cgK));
        paramViewGroup.wXd = ((ImageView)paramView.findViewById(R.h.bLi));
        paramView.setTag(paramViewGroup);
        paramViewGroup.woV.J(this.woM);
        paramViewGroup.woU.J(this.woN);
        paramViewGroup.woT.J(this.woL);
        paramViewGroup.wXc.J(this.woM);
        paramViewGroup.woV.setTextColor(this.woO[0]);
        paramViewGroup.woU.setTextColor(this.woO[4]);
        paramViewGroup.woT.setTextColor(this.woO[3]);
        paramViewGroup.wXc.setTextColor(this.woO[0]);
        paramViewGroup.woV.whw = true;
        paramViewGroup.woU.whw = false;
        paramViewGroup.woT.whw = true;
        paramViewGroup.wXc.whw = true;
        paramViewGroup.woU.xS();
        localObject2 = (d)this.woP.get(str);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject2 = new d();
          localObject1 = this.wWF;
          if ((((e)localObject1).fUo) && (((e)localObject1).iBi == null))
          {
            at.AR();
            ((e)localObject1).iBi = com.tencent.mm.y.c.yK().TE(((e)localObject1).eDs);
          }
          localx = ((e)localObject1).iBi;
          if (localx == null) {
            break label1723;
          }
          ((d)localObject2).wWT = localx.fjs;
          ((d)localObject2).wWS = ((int)localx.fTq);
          if (localx == null) {
            break label1738;
          }
          bool = true;
          ((d)localObject2).wWX = bool;
          if ((localx == null) || (!localx.vd())) {
            break label1744;
          }
          bool = true;
          ((d)localObject2).wWZ = bool;
          if ((localx == null) || (localx.fji != 0)) {
            break label1750;
          }
          bool = true;
          ((d)localObject2).wWY = bool;
          ((d)localObject2).sdk = com.tencent.mm.y.s.eb(str);
          if ((!((d)localObject2).sdk) || (!((d)localObject2).wWY) || (localae.field_unReadCount <= 0)) {
            break label1756;
          }
          bool = true;
          ((d)localObject2).wWW = bool;
          ((d)localObject2).jHw = 0;
          if ((tE(localae.field_msgType) == 34) && (localae.field_isSend == 0) && (!com.tencent.mm.platformtools.t.nm(localae.field_content)))
          {
            localObject3 = localae.field_content;
            if (!str.equals("qmessage"))
            {
              localObject1 = localObject3;
              if (!str.equals("floatbottle")) {}
            }
            else
            {
              String[] arrayOfString = ((String)localObject3).split(":");
              localObject1 = localObject3;
              if (arrayOfString != null)
              {
                localObject1 = localObject3;
                if (arrayOfString.length > 3) {
                  localObject1 = arrayOfString[1] + ":" + arrayOfString[2] + ":" + arrayOfString[3];
                }
              }
            }
            if (!new com.tencent.mm.modelvoice.n((String)localObject1).hco) {
              ((d)localObject2).jHw = 1;
            }
          }
          localObject1 = r.a(localx, str, ((d)localObject2).sdk);
          if ((!((d)localObject2).sdk) || (localObject1 != null)) {
            break label1762;
          }
          ((d)localObject2).nickName = this.context.getString(R.l.dhh);
          label863:
          ((d)localObject2).wWP = i(localae);
          ((d)localObject2).wWQ = a(localae, (int)paramViewGroup.woV.fB.getTextSize(), ((d)localObject2).wWW);
          ((d)localObject2).wXa = localae.field_attrflag;
        }
        switch (localae.field_status)
        {
        case 3: 
        case 4: 
        default: 
          paramInt = -1;
          label958:
          ((d)localObject2).wWR = paramInt;
          ((d)localObject2).wWU = com.tencent.mm.y.s.a(localae);
          at.AR();
          ((d)localObject2).woQ = com.tencent.mm.y.c.yP().g(localae);
          if ((localx != null) && (localx.vc()))
          {
            bool = true;
            label1009:
            ((d)localObject2).wWV = bool;
            ((d)localObject2).tpw = v.bPG();
            this.woP.put(str, localObject2);
            localObject1 = localObject2;
            if (((d)localObject1).wWP == null) {
              ((d)localObject1).wWP = i(localae);
            }
            if ((!((d)localObject1).wWW) && (!com.tencent.mm.y.s.gc(localae.field_parentRef))) {
              break label1829;
            }
            paramViewGroup.woV.setTextColor(this.woO[0]);
            label1091:
            com.tencent.mm.booter.notification.a.h.ed(paramViewGroup.woV.getWidth());
            com.tencent.mm.booter.notification.a.h.ee((int)paramViewGroup.woV.fB.getTextSize());
            com.tencent.mm.booter.notification.a.h.a(paramViewGroup.woV.fB);
            if (!str.toLowerCase().endsWith("@t.qq.com")) {
              break label1849;
            }
            paramViewGroup.woT.Cg(R.g.aXn);
            paramViewGroup.woT.lL(true);
            label1157:
            paramInt = ((d)localObject1).wWR;
            if (paramInt == -1) {
              break label1860;
            }
            paramViewGroup.woV.Cf(paramInt);
            paramViewGroup.woV.lK(true);
            label1184:
            paramViewGroup.woT.setText(((d)localObject1).nickName);
            paramViewGroup.wXc.setVisibility(8);
            localObject2 = paramViewGroup.woU.getLayoutParams();
            if (((d)localObject1).wWP.length() <= 9) {
              break label1871;
            }
            if (((ViewGroup.LayoutParams)localObject2).width != this.wWH)
            {
              ((ViewGroup.LayoutParams)localObject2).width = this.wWH;
              paramViewGroup.woU.setLayoutParams((ViewGroup.LayoutParams)localObject2);
            }
            label1259:
            w.v("MicroMsg.ConversationAdapter", "layout update time width %d", new Object[] { Integer.valueOf(((ViewGroup.LayoutParams)localObject2).width) });
            paramViewGroup.woU.setText(((d)localObject1).wWP);
            paramViewGroup.woV.setText(((d)localObject1).wWQ);
            if ((!((d)localObject1).sdk) || (!((d)localObject1).wWY)) {
              break label1904;
            }
            paramViewGroup.woW.setVisibility(0);
            label1331:
            a.b.a(paramViewGroup.hqG, str);
            if (this.wWv)
            {
              if ((localae != null) && (paramViewGroup != null) && (localObject1 != null)) {
                break label1935;
              }
              w.w("MicroMsg.ConversationAdapter", "handle show tip cnt, but conversation or viewholder is null");
            }
            if ((!((d)localObject1).wWU) && (((d)localObject1).woQ) && (at.AU()))
            {
              at.AR();
              com.tencent.mm.y.c.yP().f(localae);
            }
            if ((!((d)localObject1).woQ) || (localae.field_conversationTime == -1L)) {
              break label2296;
            }
            paramView.findViewById(R.h.bsb).setBackgroundResource(R.g.aVN);
            label1440:
            com.tencent.mm.bj.d.bNA();
            localObject2 = new rb();
            ((rb)localObject2).eVS.eVU = true;
            com.tencent.mm.sdk.b.a.vgX.m((b)localObject2);
            if ((0L != com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localae, 7, 0L)) && (!localae.field_username.equals(((rb)localObject2).eVT.eVW)))
            {
              localae.y(com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localae, 6, localae.field_conversationTime));
              at.AR();
              com.tencent.mm.y.c.yP().a(localae, localae.field_username);
            }
            if ((p.a.tlV != null) && (p.a.tlV.JD(localae.field_username))) {
              break label2312;
            }
            paramViewGroup.woX.setVisibility(8);
            label1571:
            if ((p.a.tmc == null) || (!p.a.tmc.Bj(localae.field_username))) {
              break label2365;
            }
            paramViewGroup.wXd.setVisibility(0);
          }
          break;
        }
      }
    }
    for (;;)
    {
      this.wWI.content = String.valueOf(((d)localObject1).wWQ);
      this.wWI.aDn = String.valueOf(((d)localObject1).nickName);
      this.wWI.wWO = String.valueOf(((d)localObject1).wWP);
      localObject1 = this.wWI;
      a.a.vOX.a(paramView, ((a)localObject1).aDn, ((a)localObject1).wWN, ((a)localObject1).wWO, ((a)localObject1).content);
      a(str, paramViewGroup);
      GMTrace.o(3411814645760L, 25420);
      return paramView;
      paramView = View.inflate(this.context, R.i.ctZ, null);
      break;
      paramViewGroup = (g)paramView.getTag();
      break label439;
      label1723:
      ((d)localObject2).wWT = -1;
      ((d)localObject2).wWS = -1;
      break label549;
      label1738:
      bool = false;
      break label557;
      label1744:
      bool = false;
      break label580;
      label1750:
      bool = false;
      break label603;
      label1756:
      bool = false;
      break label647;
      label1762:
      ((d)localObject2).nickName = com.tencent.mm.pluginsdk.ui.d.h.b(this.context, r.a(localx, str, ((d)localObject2).sdk), paramViewGroup.woT.fB.getTextSize());
      break label863;
      paramInt = -1;
      break label958;
      paramInt = R.k.cNc;
      break label958;
      paramInt = -1;
      break label958;
      paramInt = R.k.cNb;
      break label958;
      bool = false;
      break label1009;
      label1829:
      paramViewGroup.woV.setTextColor(this.woO[localObject1.jHw]);
      break label1091;
      label1849:
      paramViewGroup.woT.lL(false);
      break label1157;
      label1860:
      paramViewGroup.woV.lK(false);
      break label1184;
      label1871:
      if (((ViewGroup.LayoutParams)localObject2).width == this.wWG) {
        break label1259;
      }
      ((ViewGroup.LayoutParams)localObject2).width = this.wWG;
      paramViewGroup.woU.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      break label1259;
      label1904:
      if (((d)localObject1).wWV)
      {
        paramViewGroup.woW.setVisibility(0);
        break label1331;
      }
      paramViewGroup.woW.setVisibility(8);
      break label1331;
      label1935:
      paramViewGroup.jpZ.setVisibility(4);
      paramViewGroup.woY.setVisibility(4);
      if (com.tencent.mm.y.s.gc(localae.field_username))
      {
        localObject2 = paramViewGroup.woY;
        if (localae.field_unReadCount > 0) {}
        for (paramInt = 0;; paramInt = 4)
        {
          ((View)localObject2).setVisibility(paramInt);
          paramViewGroup.woT.setTextColor(this.woO[3]);
          break;
        }
      }
      localObject3 = paramViewGroup.woT;
      if ((((d)localObject1).wWX) && (((d)localObject1).wWT == 1)) {}
      for (localObject2 = this.woO[2];; localObject2 = this.woO[3])
      {
        ((NoMeasuredTextView)localObject3).setTextColor((ColorStateList)localObject2);
        if ((((d)localObject1).wWX) && (((d)localObject1).wWS != 0)) {
          break label2082;
        }
        w.w("MicroMsg.ConversationAdapter", "handle show tip count, but talker is null");
        break;
      }
      label2082:
      if (com.tencent.mm.y.s.gc(localae.field_parentRef))
      {
        localObject2 = paramViewGroup.woY;
        if (localae.field_unReadCount > 0) {}
        for (paramInt = 0;; paramInt = 4)
        {
          ((View)localObject2).setVisibility(paramInt);
          break;
        }
      }
      if ((((d)localObject1).wWV) && (((d)localObject1).wWZ))
      {
        localObject2 = paramViewGroup.woY;
        if (localae.field_unReadCount > 0) {}
        for (paramInt = 0;; paramInt = 4)
        {
          ((View)localObject2).setVisibility(paramInt);
          break;
        }
      }
      if ((((d)localObject1).sdk) && (((d)localObject1).wWY))
      {
        localObject2 = paramViewGroup.woY;
        if (localae.field_unReadCount > 0) {}
        for (paramInt = 0;; paramInt = 4)
        {
          ((View)localObject2).setVisibility(paramInt);
          break;
        }
      }
      paramInt = localae.field_unReadCount;
      if (paramInt > 99)
      {
        paramViewGroup.jpZ.setText(R.l.efe);
        paramViewGroup.jpZ.setVisibility(0);
      }
      for (;;)
      {
        this.wWI.wWN = paramInt;
        break;
        if (paramInt > 0)
        {
          paramViewGroup.jpZ.setText(localae.field_unReadCount);
          paramViewGroup.jpZ.setVisibility(0);
        }
      }
      label2296:
      paramView.findViewById(R.h.bsb).setBackgroundResource(R.g.aVO);
      break label1440;
      label2312:
      paramViewGroup.woX.setVisibility(0);
      if (localae.field_username.equals(((rb)localObject2).eVT.eVW))
      {
        paramViewGroup.woX.setImageResource(R.k.cOZ);
        break label1571;
      }
      paramViewGroup.woX.setImageResource(R.k.cOY);
      break label1571;
      label2365:
      paramViewGroup.wXd.setVisibility(8);
    }
  }
  
  public final void onDestroy()
  {
    GMTrace.i(3411546210304L, 25418);
    this.wWL.stopTimer();
    this.wWD = null;
    this.wWB = null;
    if (this.woP != null)
    {
      this.woP.clear();
      this.woP = null;
    }
    aJe();
    this.vKu = null;
    detach();
    GMTrace.o(3411546210304L, 25418);
  }
  
  public final void onPause()
  {
    GMTrace.i(3411143557120L, 25415);
    if (this.jpT != null) {
      this.jpT.aJp();
    }
    this.mIsFront = false;
    GMTrace.o(3411143557120L, 25415);
  }
  
  public final void onResume()
  {
    int i = 1;
    GMTrace.i(3411411992576L, 25417);
    w.i("MicroMsg.ConversationAdapter", "dkpno onResume mIsFront:%b  mNeedReCreate:%b mChangedBackground:%b mContactBackground:%b", new Object[] { Boolean.valueOf(this.mIsFront), Boolean.valueOf(this.wWz), Boolean.valueOf(this.wWy), Boolean.valueOf(this.wWA) });
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
      if ((this.wWz) && (this.wWD != null)) {
        this.wWz = false;
      }
      if ((this.wWy) || (this.wWA))
      {
        super.a(null, null);
        this.wWy = false;
        this.wWA = false;
      }
      GMTrace.o(3411411992576L, 25417);
      return;
      i = 0;
    }
  }
  
  private final class a
  {
    public String aDn;
    public String content;
    public int wWN;
    public String wWO;
    
    public a()
    {
      GMTrace.i(3422015193088L, 25496);
      GMTrace.o(3422015193088L, 25496);
    }
  }
  
  public static abstract interface b {}
  
  private final class c
    implements m.b
  {
    public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
    {
      GMTrace.i(3430202474496L, 25557);
      if ((paramObject == null) || (!(paramObject instanceof String)))
      {
        w.d("MicroMsg.ConversationAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
        GMTrace.o(3430202474496L, 25557);
        return;
      }
      paramm = (String)paramObject;
      if (d.a(this.wWM))
      {
        GMTrace.o(3430202474496L, 25557);
        return;
      }
      if ((paramm != null) && (!paramm.equals("")) && (d.b(this.wWM) != null) && (d.b(this.wWM).containsKey(Integer.valueOf(paramInt))))
      {
        d.b(this.wWM).remove(Integer.valueOf(paramInt));
        d.c(this.wWM);
      }
      GMTrace.o(3430202474496L, 25557);
    }
  }
  
  private final class d
  {
    public int jHw;
    public CharSequence nickName;
    public boolean sdk;
    public boolean tpw;
    public CharSequence wWP;
    public CharSequence wWQ;
    public int wWR;
    public int wWS;
    public int wWT;
    public boolean wWU;
    public boolean wWV;
    public boolean wWW;
    public boolean wWX;
    public boolean wWY;
    public boolean wWZ;
    public int wXa;
    public boolean woQ;
    
    public d()
    {
      GMTrace.i(3415841177600L, 25450);
      GMTrace.o(3415841177600L, 25450);
    }
  }
  
  private final class e
  {
    String eDs;
    boolean fUo;
    x iBi;
    Integer wXb;
    
    public e()
    {
      GMTrace.i(3372891504640L, 25130);
      this.fUo = false;
      this.eDs = null;
      this.fUo = false;
      this.iBi = null;
      this.wXb = null;
      GMTrace.o(3372891504640L, 25130);
    }
  }
  
  public static abstract interface f {}
  
  public static final class g
  {
    public ImageView hqG;
    public TextView jpZ;
    public NoMeasuredTextView wXc;
    public ImageView wXd;
    public NoMeasuredTextView woT;
    public NoMeasuredTextView woU;
    public NoMeasuredTextView woV;
    public ImageView woW;
    public ImageView woX;
    public View woY;
    
    public g()
    {
      GMTrace.i(3428860297216L, 25547);
      GMTrace.o(3428860297216L, 25547);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */