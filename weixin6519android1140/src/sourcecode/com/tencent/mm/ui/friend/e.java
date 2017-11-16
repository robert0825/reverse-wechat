package com.tencent.mm.ui.friend;

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.ac.b;
import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.modelfriend.ae;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bq;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.LinkedList;

public final class e
  extends d
{
  private final int IJ;
  private final MMActivity ezR;
  private String htQ;
  private final a xbW;
  private final c xbX;
  private d.a xbY;
  boolean xbZ;
  private a xca;
  
  public e(MMActivity paramMMActivity, int paramInt)
  {
    super(paramMMActivity, new ad());
    GMTrace.i(2811190312960L, 20945);
    this.xbZ = false;
    this.xca = new a()
    {
      public final void f(int paramAnonymousInt1, String paramAnonymousString, int paramAnonymousInt2)
      {
        GMTrace.i(2806626910208L, 20911);
        w.d("MicroMsg.QQFriendAdapter", "[cpan] postion:%d qq:%s status:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), paramAnonymousString, Integer.valueOf(paramAnonymousInt2) });
        ad localad = (ad)e.this.getItem(paramAnonymousInt1);
        if (localad == null)
        {
          w.e("MicroMsg.QQFriendAdapter", "[cpan] qq friend is null. qq:%s", new Object[] { paramAnonymousString });
          GMTrace.o(2806626910208L, 20911);
          return;
        }
        if (bg.nm(localad.getUsername()))
        {
          w.e("MicroMsg.QQFriendAdapter", "[cpan] qq friend username is null. qq:%s", new Object[] { paramAnonymousString });
          GMTrace.o(2806626910208L, 20911);
          return;
        }
        w.d("MicroMsg.QQFriendAdapter", "qq friend:%s", new Object[] { localad.toString() });
        if (localad.gDW == 0)
        {
          paramAnonymousInt1 = o.bj(localad.gDV);
          paramAnonymousString = new g(e.a(e.this), new g.a()
          {
            public final void n(boolean paramAnonymous2Boolean, String paramAnonymous2String)
            {
              GMTrace.i(2816156368896L, 20982);
              paramAnonymous2String = com.tencent.mm.modelfriend.af.Ik().am(o.bj(paramAnonymous2String));
              if (paramAnonymous2String != null)
              {
                paramAnonymous2String.gsR = 2;
                w.d("MicroMsg.QQFriendAdapter", "qq friend onSendInviteEmail:%s", new Object[] { paramAnonymous2String.toString() });
                com.tencent.mm.modelfriend.af.Ik().a(paramAnonymous2String.gDV, paramAnonymous2String);
                e.this.QF();
                GMTrace.o(2816156368896L, 20982);
                return;
              }
              w.w("MicroMsg.QQFriendAdapter", "cpan qq friedn is null. qq:%s", new Object[] { paramAnonymous2String });
              GMTrace.o(2816156368896L, 20982);
            }
          }, (byte)0);
          paramAnonymousString.r(new int[] { paramAnonymousInt1 });
          paramAnonymousString.twv = localad.gDV;
          localad.gsR = 1;
          com.tencent.mm.modelfriend.af.Ik().a(localad.gDV, localad);
          e.this.QF();
          GMTrace.o(2806626910208L, 20911);
          return;
        }
        if (localad.gDW == 1)
        {
          paramAnonymousString = new com.tencent.mm.pluginsdk.ui.applet.a(e.a(e.this), new com.tencent.mm.pluginsdk.ui.applet.a.a()
          {
            public final void a(boolean paramAnonymous2Boolean1, boolean paramAnonymous2Boolean2, String paramAnonymous2String1, String paramAnonymous2String2)
            {
              GMTrace.i(2802868813824L, 20883);
              w.i("MicroMsg.QQFriendAdapter", "cpan ok:%b hasSendVerify:%b  username:%s gitemId:%s", new Object[] { Boolean.valueOf(paramAnonymous2Boolean1), Boolean.valueOf(paramAnonymous2Boolean2), paramAnonymous2String1, paramAnonymous2String2 });
              long l = new o(o.bj(paramAnonymous2String2)).longValue();
              ad localad = com.tencent.mm.modelfriend.af.Ik().am(l);
              if ((localad != null) && (paramAnonymous2Boolean1)) {
                localad.username = paramAnonymous2String1;
              }
              if (localad != null)
              {
                localad.gsR = 2;
                w.d("MicroMsg.QQFriendAdapter", "f :%s", new Object[] { localad.toString() });
                com.tencent.mm.modelfriend.af.Ik().a(l, localad);
                e.this.QF();
              }
              for (;;)
              {
                if ((paramAnonymous2Boolean1) && (localad != null)) {
                  e.WM(paramAnonymous2String1);
                }
                GMTrace.o(2802868813824L, 20883);
                return;
                w.w("MicroMsg.QQFriendAdapter", "cpan qq friend is null. qq:%s", new Object[] { paramAnonymous2String2 });
              }
            }
          });
          paramAnonymousString.twv = localad.gDV;
          paramAnonymousString.twu = false;
          LinkedList localLinkedList = new LinkedList();
          localLinkedList.add(Integer.valueOf(12));
          paramAnonymousString.b(localad.getUsername(), localLinkedList, true);
          localad.gsR = 1;
          com.tencent.mm.modelfriend.af.Ik().a(localad.gDV, localad);
          e.this.QF();
        }
        GMTrace.o(2806626910208L, 20911);
      }
    };
    this.ezR = paramMMActivity;
    this.IJ = paramInt;
    this.xbZ = paramMMActivity.getIntent().getBooleanExtra("qqgroup_sendmessage", false);
    this.xbW = new a(paramMMActivity, new a.a()
    {
      public final void WL(String paramAnonymousString)
      {
        GMTrace.i(2798171193344L, 20848);
        Object localObject = com.tencent.mm.modelfriend.af.Ik();
        ad localad = ((ae)localObject).jV(paramAnonymousString);
        if (localad == null)
        {
          w.w("MicroMsg.QQFriendAdapter", "[cpan] dealSucc failed. qqlist is null. username is :%s", new Object[] { paramAnonymousString });
          GMTrace.o(2798171193344L, 20848);
          return;
        }
        localad.gDW = 2;
        ((ae)localObject).a(localad.gDV, localad);
        e.this.notifyDataSetChanged();
        at.AR();
        localObject = com.tencent.mm.y.c.yK().TE(paramAnonymousString);
        if (localObject != null) {
          if (((((com.tencent.mm.g.b.af)localObject).field_conRemark == null) || (((com.tencent.mm.g.b.af)localObject).field_conRemark.equals(""))) && (localad != null) && (localad.Ia() != null) && (!localad.Ia().equals(""))) {
            s.b((x)localObject, localad.Ia());
          }
        }
        for (;;)
        {
          bq.BG().c(26, new Object[0]);
          GMTrace.o(2798171193344L, 20848);
          return;
          localad = com.tencent.mm.modelfriend.af.Ik().jV(paramAnonymousString);
          if (localad != null)
          {
            localad.Id();
            w.d("MicroMsg.QQFriendAdapter", "user " + paramAnonymousString + " qq " + localad.gDV);
            com.tencent.mm.modelfriend.af.Ik().a(localad.gDV, localad);
          }
        }
      }
      
      public final void bh(String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(2798305411072L, 20849);
        if (paramAnonymousBoolean)
        {
          ad localad = com.tencent.mm.modelfriend.af.Ik().jV(paramAnonymousString);
          if (localad == null) {
            break label91;
          }
          localad.Id();
          w.d("MicroMsg.QQFriendAdapter", "user " + paramAnonymousString + " qq " + localad.gDV);
          com.tencent.mm.modelfriend.af.Ik().a(localad.gDV, localad);
        }
        for (;;)
        {
          e.this.notifyDataSetChanged();
          GMTrace.o(2798305411072L, 20849);
          return;
          label91:
          w.w("MicroMsg.QQFriendAdapter", "[cpan] dealFail failed. qqlist is null. username is :%s", new Object[] { paramAnonymousString });
        }
      }
    });
    this.xbX = new c(paramMMActivity, new c.a()
    {
      public final void mu(boolean paramAnonymousBoolean)
      {
        GMTrace.i(2825148956672L, 21049);
        if (paramAnonymousBoolean) {
          e.this.notifyDataSetChanged();
        }
        GMTrace.o(2825148956672L, 21049);
      }
    });
    GMTrace.o(2811190312960L, 20945);
  }
  
  public final void Au(String paramString)
  {
    GMTrace.i(2811458748416L, 20947);
    this.htQ = bg.nk(paramString.trim());
    aJe();
    QF();
    GMTrace.o(2811458748416L, 20947);
  }
  
  public final void QF()
  {
    GMTrace.i(2811727183872L, 20949);
    aJe();
    if (bg.nm(this.htQ)) {
      setCursor(com.tencent.mm.modelfriend.af.Ik().n(this.IJ, this.xbZ));
    }
    for (;;)
    {
      if ((this.xbY != null) && (this.htQ != null)) {
        this.xbY.Bs(getCursor().getCount());
      }
      notifyDataSetChanged();
      GMTrace.o(2811727183872L, 20949);
      return;
      setCursor(com.tencent.mm.modelfriend.af.Ik().b(this.IJ, this.htQ, this.xbZ));
    }
  }
  
  protected final void QG()
  {
    GMTrace.i(2811592966144L, 20948);
    QF();
    GMTrace.o(2811592966144L, 20948);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(2811324530688L, 20946);
    this.xbY = parama;
    GMTrace.o(2811324530688L, 20946);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(2811861401600L, 20950);
    ad localad = (ad)getItem(paramInt);
    if (paramView == null)
    {
      paramView = View.inflate(this.ezR, R.i.cDU, null);
      paramViewGroup = new b(paramView);
      paramView.setTag(paramViewGroup);
      paramViewGroup.vaM = paramInt;
      paramViewGroup.xcd = localad.gDV;
      paramViewGroup.status = localad.gDW;
      paramViewGroup.gDd.setText(h.b(this.ezR, localad.getDisplayName(), paramViewGroup.gDd.getTextSize()));
      if (o.bj(localad.gDV) == 0) {
        break label622;
      }
    }
    label168:
    label218:
    label622:
    for (Bitmap localBitmap = b.X(localad.gDV);; localBitmap = null)
    {
      if (localBitmap == null)
      {
        paramViewGroup.hqg.setImageDrawable(com.tencent.mm.br.a.b(this.ezR, R.k.aVS));
        if (!this.xbZ) {
          break label218;
        }
        paramViewGroup.wnR.setVisibility(8);
      }
      for (;;)
      {
        GMTrace.o(2811861401600L, 20950);
        return paramView;
        paramViewGroup = (b)paramView.getTag();
        break;
        paramViewGroup.hqg.setImageBitmap(localBitmap);
        break label168;
        switch (localad.gDW)
        {
        }
        for (;;)
        {
          switch (localad.gsR)
          {
          default: 
            break;
          case 0: 
          case 2: 
            paramViewGroup.hql.setVisibility(0);
            paramViewGroup.wnS.setVisibility(4);
            break;
            if (localad.gsR == 2)
            {
              paramViewGroup.wnR.setClickable(false);
              paramViewGroup.wnR.setBackgroundDrawable(null);
              paramViewGroup.hql.setText(R.l.dyg);
              paramViewGroup.hql.setTextColor(this.ezR.getResources().getColor(R.e.aOl));
            }
            else
            {
              paramViewGroup.wnR.setClickable(true);
              paramViewGroup.wnR.setBackgroundResource(R.g.aUF);
              paramViewGroup.hql.setText(R.l.dyf);
              paramViewGroup.hql.setTextColor(this.ezR.getResources().getColor(R.e.white));
              continue;
              at.AR();
              if ((com.tencent.mm.y.c.yK().TA(localad.getUsername())) || (q.zE().equals(localad.getUsername())))
              {
                paramViewGroup.wnR.setClickable(false);
                paramViewGroup.wnR.setBackgroundDrawable(null);
                paramViewGroup.hql.setText(R.l.dye);
                paramViewGroup.hql.setTextColor(this.ezR.getResources().getColor(R.e.aOl));
              }
              else if (localad.gsR == 2)
              {
                paramViewGroup.wnR.setClickable(false);
                paramViewGroup.wnR.setBackgroundDrawable(null);
                paramViewGroup.hql.setText(R.l.dyi);
                paramViewGroup.hql.setTextColor(this.ezR.getResources().getColor(R.e.aOl));
              }
              else
              {
                paramViewGroup.wnR.setClickable(true);
                paramViewGroup.wnR.setBackgroundResource(R.g.aUF);
                paramViewGroup.hql.setText(R.l.dyd);
                paramViewGroup.hql.setTextColor(this.ezR.getResources().getColor(R.e.white));
              }
            }
            break;
          }
        }
        paramViewGroup.hql.setVisibility(4);
        paramViewGroup.wnS.setVisibility(0);
      }
    }
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(2811995619328L, 20951);
    notifyDataSetChanged();
    GMTrace.o(2811995619328L, 20951);
  }
  
  static abstract interface a
  {
    public abstract void f(int paramInt1, String paramString, int paramInt2);
  }
  
  final class b
  {
    TextView gDd;
    ImageView hqg;
    TextView hql;
    int status;
    int vaM;
    View wnR;
    ProgressBar wnS;
    String xcd;
    
    public b(View paramView)
    {
      GMTrace.i(2815887933440L, 20980);
      this.hqg = ((ImageView)paramView.findViewById(R.h.brE));
      this.gDd = ((TextView)paramView.findViewById(R.h.bUO));
      this.wnR = paramView.findViewById(R.h.bUI);
      this.hql = ((TextView)paramView.findViewById(R.h.bUQ));
      this.wnS = ((ProgressBar)paramView.findViewById(R.h.bUP));
      this.wnR.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2809177047040L, 20930);
          if (e.b(e.this) != null) {
            e.b(e.this).f(e.b.this.vaM, e.b.this.xcd, e.b.this.status);
          }
          GMTrace.o(2809177047040L, 20930);
        }
      });
      GMTrace.o(2815887933440L, 20980);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\friend\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */