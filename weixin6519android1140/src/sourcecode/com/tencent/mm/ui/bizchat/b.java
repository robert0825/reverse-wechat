package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
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
import com.tencent.mm.af.a.e;
import com.tencent.mm.af.a.j;
import com.tencent.mm.af.a.k;
import com.tencent.mm.af.x;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.tools.s;
import java.util.HashMap;

public final class b
  extends o<com.tencent.mm.af.a.a>
  implements m.b
{
  private com.tencent.mm.ao.a.a.c jQF;
  protected MMSlideDelView.f jpQ;
  protected MMSlideDelView.c jpR;
  protected MMSlideDelView.e jpS;
  protected MMSlideDelView.d jpT;
  private final String juZ;
  private final MMFragmentActivity woK;
  private float woL;
  private float woM;
  private float woN;
  private ColorStateList[] woO;
  HashMap<String, a> woP;
  
  public b(Context paramContext, o.a parama, String paramString)
  {
    super(paramContext, new com.tencent.mm.af.a.a());
    GMTrace.i(2974801723392L, 22164);
    this.jpT = MMSlideDelView.cah();
    this.woL = -1.0F;
    this.woM = -1.0F;
    this.woN = -1.0F;
    this.woO = new ColorStateList[5];
    this.jQF = null;
    this.vKu = parama;
    this.woK = ((MMFragmentActivity)paramContext);
    this.juZ = paramString;
    this.woP = new HashMap();
    this.woO[0] = com.tencent.mm.br.a.U(paramContext, R.e.aOa);
    this.woO[1] = com.tencent.mm.br.a.U(paramContext, R.e.aOu);
    this.woO[3] = com.tencent.mm.br.a.U(paramContext, R.e.aOE);
    this.woO[2] = com.tencent.mm.br.a.U(paramContext, R.e.aOs);
    this.woO[2] = com.tencent.mm.br.a.U(paramContext, R.e.aOs);
    this.woO[4] = com.tencent.mm.br.a.U(paramContext, R.e.aOk);
    this.woL = com.tencent.mm.br.a.V(paramContext, R.f.aQF);
    this.woM = com.tencent.mm.br.a.V(paramContext, R.f.aQo);
    this.woN = com.tencent.mm.br.a.V(paramContext, R.f.aQR);
    paramContext = new c.a();
    paramContext.gKF = e.bk(this.juZ);
    paramContext.gKC = true;
    paramContext.gKY = true;
    paramContext.gKR = R.k.aVS;
    this.jQF = paramContext.Jn();
    GMTrace.o(2974801723392L, 22164);
  }
  
  private static String VP(String paramString)
  {
    GMTrace.i(2976009682944L, 22173);
    if ((paramString != null) && (paramString.length() == 32))
    {
      paramString = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vM(paramString);
      GMTrace.o(2976009682944L, 22173);
      return paramString;
    }
    GMTrace.o(2976009682944L, 22173);
    return null;
  }
  
  private CharSequence a(com.tencent.mm.af.a.a parama, int paramInt, String paramString)
  {
    GMTrace.i(2976143900672L, 22174);
    if ((!bg.nm(parama.field_editingMsg)) && ((parama.field_atCount <= 0) || (parama.field_unReadCount <= 0)))
    {
      paramString = new SpannableStringBuilder(this.woK.getString(R.l.dHL));
      paramString.setSpan(new ForegroundColorSpan(-5569532), 0, paramString.length(), 33);
      paramString.append(" ").append(com.tencent.mm.pluginsdk.ui.d.h.c(this.woK, parama.field_editingMsg, paramInt));
      GMTrace.o(2976143900672L, 22174);
      return paramString;
    }
    Object localObject = parama.field_digest;
    String str1;
    if ((parama.field_msgType != null) && ((parama.field_msgType.equals("47")) || (parama.field_msgType.equals("1048625"))))
    {
      localObject = VP(parama.field_digest);
      str1 = "";
      if (localObject != null)
      {
        parama = "[" + (String)localObject + "]";
        GMTrace.o(2976143900672L, 22174);
        return parama;
      }
      localObject = str1;
      if (parama.field_digest != null)
      {
        localObject = str1;
        if (parama.field_digest.contains(":"))
        {
          str1 = parama.field_digest.substring(0, parama.field_digest.indexOf(":"));
          String str2 = VP(parama.field_digest.substring(parama.field_digest.indexOf(":") + 1).replace(" ", ""));
          localObject = str1;
          if (str2 != null)
          {
            parama = "[" + str2 + "]";
            if (bg.nm(str1))
            {
              GMTrace.o(2976143900672L, 22174);
              return parama;
            }
            parama = str1 + ": " + parama;
            GMTrace.o(2976143900672L, 22174);
            return parama;
          }
        }
      }
      str1 = this.woK.getString(R.l.cSD);
      if (bg.nm((String)localObject))
      {
        localObject = str1;
        parama.field_digest = ((String)localObject);
      }
    }
    else
    {
      if (bg.nm(parama.field_digest)) {
        break label572;
      }
      if (bg.nm(parama.field_digestUser)) {
        break label564;
      }
    }
    for (;;)
    {
      try
      {
        paramString = String.format(parama.field_digest, new Object[] { paramString });
        paramString = paramString.replace('\n', ' ');
        if ((parama.field_atCount <= 0) || (parama.field_unReadCount <= 0)) {
          break label579;
        }
        parama = new SpannableStringBuilder(this.woK.getString(R.l.dHH));
        parama.setSpan(new ForegroundColorSpan(-5569532), 0, parama.length(), 33);
        parama.append(" ").append(com.tencent.mm.pluginsdk.ui.d.h.c(this.woK, paramString, paramInt));
        GMTrace.o(2976143900672L, 22174);
        return parama;
        localObject = (String)localObject + ": " + str1;
      }
      catch (Exception paramString)
      {
        paramString = parama.field_digest;
        continue;
      }
      label564:
      paramString = parama.field_digest;
      continue;
      label572:
      paramString = "";
    }
    label579:
    parama = com.tencent.mm.pluginsdk.ui.d.h.c(this.woK, paramString, paramInt);
    GMTrace.o(2976143900672L, 22174);
    return parama;
  }
  
  private static int tE(String paramString)
  {
    int j = 1;
    GMTrace.i(2976278118400L, 22175);
    int i = j;
    if (paramString != null)
    {
      i = j;
      if (paramString.length() <= 0) {}
    }
    try
    {
      i = Integer.valueOf(paramString).intValue();
      GMTrace.o(2976278118400L, 22175);
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
  
  public final void QF()
  {
    GMTrace.i(2974935941120L, 22165);
    aJe();
    setCursor(x.FJ().jb(this.juZ));
    if (this.vKu != null) {
      this.vKu.QC();
    }
    super.notifyDataSetChanged();
    GMTrace.o(2974935941120L, 22165);
  }
  
  protected final void QG()
  {
    GMTrace.i(2976412336128L, 22176);
    QF();
    GMTrace.o(2976412336128L, 22176);
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(2976546553856L, 22177);
    super.a(paramInt, paramm, paramObject);
    GMTrace.o(2976546553856L, 22177);
  }
  
  public final void a(MMSlideDelView.c paramc)
  {
    GMTrace.i(2975472812032L, 22169);
    this.jpR = paramc;
    GMTrace.o(2975472812032L, 22169);
  }
  
  public final void a(MMSlideDelView.e parame)
  {
    GMTrace.i(2975338594304L, 22168);
    this.jpS = parame;
    GMTrace.o(2975338594304L, 22168);
  }
  
  public final void a(MMSlideDelView.f paramf)
  {
    GMTrace.i(2975204376576L, 22167);
    this.jpQ = paramf;
    GMTrace.o(2975204376576L, 22167);
  }
  
  public final void eV(long paramLong)
  {
    GMTrace.i(2976680771584L, 22178);
    if (this.woP != null) {
      this.woP.remove(String.valueOf(paramLong));
    }
    GMTrace.o(2976680771584L, 22178);
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(2975607029760L, 22170);
    GMTrace.o(2975607029760L, 22170);
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(2975875465216L, 22172);
    Object localObject3 = (com.tencent.mm.af.a.a)getItem(paramInt);
    if (paramView != null) {}
    for (paramViewGroup = (b)paramView.getTag();; paramViewGroup = null)
    {
      if ((paramView == null) || (paramViewGroup == null))
      {
        paramViewGroup = new b();
        if (com.tencent.mm.br.a.ed(this.woK))
        {
          paramView = View.inflate(this.woK, R.i.cua, null);
          paramViewGroup.hqG = ((ImageView)paramView.findViewById(R.h.bfq));
          paramViewGroup.woT = ((NoMeasuredTextView)paramView.findViewById(R.h.bQX));
          paramViewGroup.woU = ((NoMeasuredTextView)paramView.findViewById(R.h.cjq));
          paramViewGroup.woV = ((NoMeasuredTextView)paramView.findViewById(R.h.bJH));
          paramViewGroup.jpZ = ((TextView)paramView.findViewById(R.h.chA));
          paramViewGroup.jpZ.setBackgroundResource(s.fH(this.woK));
          paramViewGroup.woW = ((ImageView)paramView.findViewById(R.h.bGV));
          paramViewGroup.woY = paramView.findViewById(R.h.bfr);
          paramViewGroup.woX = ((ImageView)paramView.findViewById(R.h.cgK));
          paramView.setTag(paramViewGroup);
          paramViewGroup.woV.J(this.woM);
          paramViewGroup.woU.J(this.woN);
          paramViewGroup.woT.J(this.woL);
          paramViewGroup.woV.setTextColor(this.woO[0]);
          paramViewGroup.woU.setTextColor(this.woO[4]);
          paramViewGroup.woT.setTextColor(this.woO[3]);
          paramViewGroup.woV.whw = true;
          paramViewGroup.woU.whw = false;
          paramViewGroup.woT.whw = true;
          paramViewGroup.woU.xS();
        }
      }
      for (;;)
      {
        long l = ((com.tencent.mm.af.a.a)localObject3).field_bizChatId;
        Object localObject2 = (a)this.woP.get(String.valueOf(l));
        Object localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = new a();
          x.FJ();
          ((a)localObject1).woQ = com.tencent.mm.af.a.b.c((com.tencent.mm.af.a.a)localObject3);
          localObject2 = x.FI().t(l);
          if (((com.tencent.mm.af.a.c)localObject2).FU())
          {
            ((a)localObject1).gAT = ((com.tencent.mm.af.a.c)localObject2).field_chatName;
            ((a)localObject1).jGN = ((com.tencent.mm.af.a.c)localObject2).fN(1);
            ((a)localObject1).ltq = ((com.tencent.mm.af.a.c)localObject2).field_headImageUrl;
            label406:
            if (bg.nm(((a)localObject1).gAT)) {
              ((a)localObject1).gAT = this.woK.getString(R.l.dTd);
            }
            ((a)localObject1).woR = ((com.tencent.mm.af.a.a)localObject3);
            this.woP.put(String.valueOf(l), localObject1);
          }
        }
        else
        {
          paramViewGroup.woX.setVisibility(8);
          localObject3 = paramViewGroup.woU;
          if (((a)localObject1).woR.field_status != 1) {
            break label910;
          }
          localObject2 = this.woK.getString(R.l.dIe);
          label493:
          ((NoMeasuredTextView)localObject3).setText((CharSequence)localObject2);
          com.tencent.mm.ao.n.Jd().a(((a)localObject1).ltq, paramViewGroup.hqG, this.jQF);
          if (!((a)localObject1).jGN) {
            break label931;
          }
          paramViewGroup.woW.setVisibility(0);
          label535:
          paramViewGroup.woT.setText(com.tencent.mm.pluginsdk.ui.d.h.c(this.woK, ((a)localObject1).gAT, (int)paramViewGroup.woT.fB.getTextSize()));
          localObject2 = a(((a)localObject1).woR, (int)paramViewGroup.woV.fB.getTextSize(), ((a)localObject1).gAT);
          switch (((a)localObject1).woR.field_status)
          {
          case 3: 
          case 4: 
          default: 
            paramInt = -1;
            label642:
            paramViewGroup.woT.lL(false);
            if (paramInt != -1)
            {
              paramViewGroup.woV.Cf(paramInt);
              paramViewGroup.woV.lK(true);
              label671:
              paramViewGroup.woV.setText((CharSequence)localObject2);
              paramViewGroup.woV.setTextColor(com.tencent.mm.br.a.U(this.woK, R.e.aOt));
              if ((tE(((a)localObject1).woR.field_msgType) == 34) && (((a)localObject1).woR.field_isSend == 0) && (!bg.nm(((a)localObject1).woR.field_content)) && (!new com.tencent.mm.modelvoice.n(((a)localObject1).woR.field_content).hco)) {
                paramViewGroup.woV.setTextColor(com.tencent.mm.br.a.U(this.woK, R.e.aOu));
              }
              if (!((a)localObject1).jGN) {
                break label989;
              }
              if (((a)localObject1).woR.field_unReadCount <= 0) {
                break label978;
              }
              paramViewGroup.woY.setVisibility(0);
              label803:
              paramViewGroup.jpZ.setVisibility(4);
              label811:
              if (!((a)localObject1).woQ) {
                break label1119;
              }
              paramView.findViewById(R.h.bsb).setBackgroundResource(R.g.aVN);
            }
            break;
          }
        }
        for (;;)
        {
          GMTrace.o(2975875465216L, 22172);
          return paramView;
          paramView = View.inflate(this.woK, R.i.ctZ, null);
          break;
          localObject2 = x.FK().bl(((com.tencent.mm.af.a.c)localObject2).field_bizChatServId);
          if (localObject2 == null) {
            break label406;
          }
          ((a)localObject1).gAT = ((j)localObject2).field_userName;
          ((a)localObject1).jGN = ((j)localObject2).fN(1);
          ((a)localObject1).ltq = ((j)localObject2).field_headImageUrl;
          break label406;
          label910:
          localObject2 = com.tencent.mm.pluginsdk.i.n.c(this.woK, ((a)localObject1).woR.field_lastMsgTime, true);
          break label493;
          label931:
          paramViewGroup.woW.setVisibility(8);
          break label535;
          paramInt = -1;
          break label642;
          paramInt = R.k.cNc;
          break label642;
          paramInt = -1;
          break label642;
          paramInt = R.k.cNb;
          break label642;
          paramViewGroup.woV.lK(false);
          break label671;
          label978:
          paramViewGroup.woY.setVisibility(4);
          break label803;
          label989:
          paramViewGroup.woY.setVisibility(4);
          if (((a)localObject1).woR.field_unReadCount > 99)
          {
            paramViewGroup.jpZ.setText(R.l.efe);
            paramViewGroup.jpZ.setVisibility(0);
            w.v("MicroMsg.BizChatConversationAdapter", "has unread 100");
            break label811;
          }
          if (((a)localObject1).woR.field_unReadCount > 0)
          {
            paramViewGroup.jpZ.setText(((a)localObject1).woR.field_unReadCount);
            paramViewGroup.jpZ.setVisibility(0);
            w.v("MicroMsg.BizChatConversationAdapter", "has unread");
            break label811;
          }
          paramViewGroup.jpZ.setVisibility(4);
          w.v("MicroMsg.BizChatConversationAdapter", "no unread");
          break label811;
          label1119:
          paramView.findViewById(R.h.bsb).setBackgroundResource(R.g.aVO);
        }
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(2975070158848L, 22166);
    GMTrace.o(2975070158848L, 22166);
    return 1;
  }
  
  public final void onPause()
  {
    GMTrace.i(2975741247488L, 22171);
    if (this.jpT != null) {
      this.jpT.aJp();
    }
    GMTrace.o(2975741247488L, 22171);
  }
  
  private final class a
  {
    String gAT;
    public boolean jGN;
    String ltq;
    public boolean woQ;
    public com.tencent.mm.af.a.a woR;
    
    public a()
    {
      GMTrace.i(3011040509952L, 22434);
      this.gAT = null;
      this.ltq = null;
      GMTrace.o(3011040509952L, 22434);
    }
  }
  
  public static final class b
  {
    public ImageView hqG;
    public TextView jpZ;
    public NoMeasuredTextView woT;
    public NoMeasuredTextView woU;
    public NoMeasuredTextView woV;
    public ImageView woW;
    public ImageView woX;
    public View woY;
    
    public b()
    {
      GMTrace.i(2991444721664L, 22288);
      GMTrace.o(2991444721664L, 22288);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bizchat\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */