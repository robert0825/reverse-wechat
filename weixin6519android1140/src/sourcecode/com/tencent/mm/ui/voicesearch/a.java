package com.tencent.mm.ui.voicesearch;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.database.MergeCursor;
import android.graphics.Bitmap;
import android.view.View;
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
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rb.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.m;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.applet.b.a;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bl;
import com.tencent.mm.y.bm;
import com.tencent.mm.y.c;
import com.tencent.mm.y.m;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SuppressLint({"DefaultLocale"})
public final class a
  extends o<ae>
{
  private com.tencent.mm.ui.applet.b gCY;
  private b.b gCZ;
  private String htH;
  protected List<String> iVA;
  private boolean wWv;
  private ColorStateList[] woO;
  private HashMap<String, a> woP;
  private b xmP;
  
  public a(Context paramContext, o.a parama)
  {
    super(paramContext, new ae());
    GMTrace.i(2842865696768L, 21181);
    this.iVA = null;
    this.woO = new ColorStateList[2];
    this.wWv = true;
    this.gCZ = null;
    this.gCY = new com.tencent.mm.ui.applet.b(new b.a()
    {
      public final Bitmap jP(String paramAnonymousString)
      {
        GMTrace.i(2848637059072L, 21224);
        paramAnonymousString = com.tencent.mm.ac.b.a(paramAnonymousString, false, -1);
        GMTrace.o(2848637059072L, 21224);
        return paramAnonymousString;
      }
    });
    this.vKu = parama;
    this.woO[0] = com.tencent.mm.br.a.U(paramContext, R.e.aOt);
    this.woO[1] = com.tencent.mm.br.a.U(paramContext, R.e.aOu);
    this.woP = new HashMap();
    GMTrace.o(2842865696768L, 21181);
  }
  
  private static int tE(String paramString)
  {
    int j = 1;
    GMTrace.i(2843536785408L, 21186);
    int i = j;
    if (paramString != null)
    {
      i = j;
      if (paramString.length() <= 0) {}
    }
    try
    {
      i = Integer.valueOf(paramString).intValue();
      GMTrace.o(2843536785408L, 21186);
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
  
  public final void Au(String paramString)
  {
    GMTrace.i(2843805220864L, 21188);
    this.htH = paramString;
    aJe();
    QF();
    GMTrace.o(2843805220864L, 21188);
  }
  
  public final void QF()
  {
    GMTrace.i(2843268349952L, 21184);
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
        w.d("MicroMsg.SearchConversationAdapter", "block user " + str);
      }
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.SearchConversationAdapter", localException, "", new Object[0]);
      arrayOfCursor[1] = at.AR().glQ.a(this.htH, "@micromsg.with.all.biz.qq.com", localArrayList1, localArrayList2);
      setCursor(new MergeCursor(arrayOfCursor));
      if ((this.xmP != null) && (this.htH != null)) {
        getCursor().getCount();
      }
      super.notifyDataSetChanged();
      GMTrace.o(2843268349952L, 21184);
    }
  }
  
  protected final void QG()
  {
    GMTrace.i(2843134132224L, 21183);
    QF();
    GMTrace.o(2843134132224L, 21183);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(2843671003136L, 21187);
    if ((paramString != null) && (!paramString.equals("")) && (this.woP != null)) {
      this.woP.remove(paramString);
    }
    for (;;)
    {
      super.a(paramString, paraml);
      GMTrace.o(2843671003136L, 21187);
      return;
      if (this.woP != null) {
        this.woP.clear();
      }
    }
  }
  
  public final void cS(List<String> paramList)
  {
    GMTrace.i(2842999914496L, 21182);
    this.iVA = paramList;
    a(null, null);
    GMTrace.o(2842999914496L, 21182);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(2843402567680L, 21185);
    if (this.gCZ == null) {
      this.gCZ = new b.b()
      {
        public final int Hk()
        {
          GMTrace.i(2833604673536L, 21112);
          int i = a.this.getCount();
          GMTrace.o(2833604673536L, 21112);
          return i;
        }
        
        public final String gc(int paramAnonymousInt)
        {
          GMTrace.i(2833470455808L, 21111);
          if ((paramAnonymousInt < 0) || (paramAnonymousInt >= a.this.getCount()))
          {
            w.e("MicroMsg.SearchConversationAdapter", "pos is invalid");
            GMTrace.o(2833470455808L, 21111);
            return null;
          }
          Object localObject = (ae)a.this.getItem(paramAnonymousInt);
          if (localObject == null)
          {
            GMTrace.o(2833470455808L, 21111);
            return null;
          }
          localObject = ((aj)localObject).field_username;
          GMTrace.o(2833470455808L, 21111);
          return (String)localObject;
        }
      };
    }
    if (this.gCY != null) {
      this.gCY.a(paramInt, this.gCZ);
    }
    ae localae = (ae)getItem(paramInt);
    Object localObject1;
    Object localObject2;
    if ((tE(localae.field_msgType) == 34) && (localae.field_isSend == 0) && (!com.tencent.mm.platformtools.t.nm(localae.field_content)))
    {
      localObject1 = localae.field_content;
      if (!localae.field_username.equals("qmessage"))
      {
        paramViewGroup = (ViewGroup)localObject1;
        if (!localae.field_username.equals("floatbottle")) {}
      }
      else
      {
        localObject2 = ((String)localObject1).split(":");
        paramViewGroup = (ViewGroup)localObject1;
        if (localObject2 != null)
        {
          paramViewGroup = (ViewGroup)localObject1;
          if (localObject2.length > 3) {
            paramViewGroup = localObject2[1] + ":" + localObject2[2] + ":" + localObject2[3];
          }
        }
      }
      if (new com.tencent.mm.modelvoice.n(paramViewGroup).hco) {}
    }
    for (int i = 1;; i = 0)
    {
      label469:
      int j;
      int k;
      if (paramView == null)
      {
        paramViewGroup = new c();
        localObject1 = View.inflate(this.context, R.i.cFu, null);
        paramViewGroup.hqG = ((ImageView)((View)localObject1).findViewById(R.h.bfq));
        paramViewGroup.jpV = ((TextView)((View)localObject1).findViewById(R.h.bQX));
        paramViewGroup.jpW = ((TextView)((View)localObject1).findViewById(R.h.cjq));
        paramViewGroup.jpX = ((TextView)((View)localObject1).findViewById(R.h.bJH));
        paramViewGroup.jpZ = ((TextView)((View)localObject1).findViewById(R.h.chA));
        paramViewGroup.jpZ.setBackgroundResource(com.tencent.mm.ui.tools.s.fH(this.context));
        paramViewGroup.woW = ((ImageView)((View)localObject1).findViewById(R.h.bGV));
        paramViewGroup.woX = ((ImageView)((View)localObject1).findViewById(R.h.cgK));
        ((View)localObject1).setTag(paramViewGroup);
        localObject2 = (a)this.woP.get(localae.field_username + localae.field_content);
        paramView = (View)localObject2;
        if (localObject2 == null)
        {
          localObject2 = new a();
          ((a)localObject2).nickName = com.tencent.mm.pluginsdk.ui.d.h.b(this.context, r.fs(localae.field_username), paramViewGroup.jpV.getTextSize());
          if (localae.field_status != 1) {
            break label1094;
          }
          paramView = this.context.getString(R.l.dIe);
          ((a)localObject2).wWP = paramView;
          j = (int)paramViewGroup.jpX.getTextSize();
          k = q.zI();
          paramView = localae.field_username;
          at.AR();
          if (com.tencent.mm.platformtools.t.e((Integer)c.xh().get(17, null)) != 1) {
            break label1129;
          }
          paramInt = 1;
          label521:
          if ((!paramView.equals("qqmail")) || (paramInt != 0)) {
            break label1134;
          }
          paramView = this.context.getString(R.l.dZT);
          label546:
          ((a)localObject2).wWQ = paramView;
          if ((com.tencent.mm.y.s.eb(localae.field_username)) && (m.fk(localae.field_username) == 0)) {
            ((a)localObject2).nickName = this.context.getString(R.l.dhh);
          }
        }
        switch (localae.field_status)
        {
        case 3: 
        case 4: 
        default: 
          paramInt = -1;
          label634:
          ((a)localObject2).wWR = paramInt;
          this.woP.put(localae.field_username + localae.field_content, localObject2);
          paramView = (View)localObject2;
          paramViewGroup.jpX.setTextColor(this.woO[i]);
          paramViewGroup.jpV.setText(paramView.nickName);
          paramViewGroup.jpW.setText(paramView.wWP);
          paramViewGroup.jpX.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, paramView.wWQ.toString(), paramViewGroup.jpX.getTextSize()));
          if (localae.field_conversationTime == 0L)
          {
            paramViewGroup.jpW.setVisibility(8);
            label764:
            paramViewGroup.woW.setVisibility(8);
            if (com.tencent.mm.y.s.eb(localae.field_username))
            {
              at.AR();
              paramView = c.yK().TE(localae.field_username);
              if ((paramView != null) && (paramView.fji == 0)) {
                paramViewGroup.woW.setVisibility(0);
              }
            }
            com.tencent.mm.pluginsdk.ui.a.b.a(paramViewGroup.hqG, localae.field_username);
            if (this.wWv)
            {
              if (localae.field_unReadCount <= 100) {
                break label1320;
              }
              paramViewGroup.jpZ.setText("...");
              paramViewGroup.jpZ.setVisibility(0);
            }
            label868:
            if (at.AU())
            {
              if (!com.tencent.mm.y.s.a(localae))
              {
                at.AR();
                if (c.yP().g(localae))
                {
                  at.AR();
                  c.yP().f(localae);
                }
              }
              at.AR();
              if (c.yP().g(localae)) {
                break label1375;
              }
              ((View)localObject1).findViewById(R.h.bsb).setBackgroundResource(R.g.aVO);
            }
            label945:
            paramView = new rb();
            paramView.eVS.eVU = true;
            com.tencent.mm.sdk.b.a.vgX.m(paramView);
            if ((0L != com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localae, 7, 0L)) && (!localae.field_username.equals(paramView.eVT.eVW)))
            {
              localae.y(com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localae, 6, localae.field_conversationTime));
              at.AR();
              c.yP().a(localae, localae.field_username);
            }
            if ((p.a.tlV != null) && (p.a.tlV.JD(localae.field_username))) {
              break label1392;
            }
            paramViewGroup.woX.setVisibility(8);
          }
          break;
        }
      }
      for (;;)
      {
        GMTrace.o(2843402567680L, 21185);
        return (View)localObject1;
        paramViewGroup = (c)paramView.getTag();
        localObject1 = paramView;
        break;
        label1094:
        if (localae.field_conversationTime == Long.MAX_VALUE)
        {
          paramView = "";
          break label469;
        }
        paramView = com.tencent.mm.pluginsdk.i.n.c(this.context, localae.field_conversationTime, true);
        break label469;
        label1129:
        paramInt = 0;
        break label521;
        label1134:
        at.AR();
        ay localay = c.yS().CB("@t.qq.com");
        if ((localay != null) && (localay.isEnable())) {}
        for (paramInt = 1;; paramInt = 0)
        {
          if ((!paramView.equals("tmessage")) || (paramInt != 0)) {
            break label1199;
          }
          paramView = this.context.getString(R.l.dZT);
          break;
        }
        label1199:
        if ((k & 0x40) != 0) {}
        for (paramInt = 1;; paramInt = 0)
        {
          if ((!paramView.equals("qmessage")) || (paramInt != 0)) {
            break label1242;
          }
          paramView = this.context.getString(R.l.dZT);
          break;
        }
        label1242:
        paramView = com.tencent.mm.pluginsdk.ui.d.h.c(this.context, com.tencent.mm.booter.notification.a.h.a(localae.field_isSend, localae.field_username, localae.field_content, tE(localae.field_msgType), this.context), j);
        break label546;
        paramInt = -1;
        break label634;
        paramInt = R.k.cNc;
        break label634;
        paramInt = -1;
        break label634;
        paramInt = R.k.cNb;
        break label634;
        paramViewGroup.jpW.setVisibility(0);
        break label764;
        label1320:
        if (localae.field_unReadCount > 0)
        {
          paramViewGroup.jpZ.setText(localae.field_unReadCount);
          paramViewGroup.jpZ.setVisibility(0);
          break label868;
        }
        paramViewGroup.jpZ.setVisibility(4);
        break label868;
        label1375:
        ((View)localObject1).findViewById(R.h.bsb).setBackgroundResource(R.g.aVN);
        break label945;
        label1392:
        paramViewGroup.woX.setVisibility(0);
        if (localae.field_username.equals(paramView.eVT.eVW)) {
          paramViewGroup.woX.setImageResource(R.k.cOZ);
        } else {
          paramViewGroup.woX.setImageResource(R.k.cOY);
        }
      }
    }
  }
  
  private final class a
  {
    public CharSequence nickName;
    public CharSequence wWP;
    public CharSequence wWQ;
    public int wWR;
    
    public a()
    {
      GMTrace.i(2846892228608L, 21211);
      GMTrace.o(2846892228608L, 21211);
    }
  }
  
  public static abstract interface b {}
  
  public static final class c
  {
    public ImageView hqG;
    public TextView jpV;
    public TextView jpW;
    public TextView jpX;
    public TextView jpZ;
    public ImageView woW;
    public ImageView woX;
    
    public c()
    {
      GMTrace.i(2848368623616L, 21222);
      GMTrace.o(2848368623616L, 21222);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\voicesearch\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */