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
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.a.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.util.LinkedList;

public final class f
  extends d
{
  private final int IJ;
  private final MMActivity ezR;
  private String htQ;
  private d.a xbY;
  boolean xcg;
  private a xch;
  
  public f(MMActivity paramMMActivity, int paramInt)
  {
    super(paramMMActivity, new ad());
    GMTrace.i(2819780247552L, 21009);
    this.xcg = false;
    this.xch = new a()
    {
      public final void f(int paramAnonymousInt1, String paramAnonymousString, int paramAnonymousInt2)
      {
        GMTrace.i(2819109158912L, 21004);
        w.d("MicroMsg.QQFriendAdapterCaseB", "[cpan] postion:%d qq:%s status:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), paramAnonymousString, Integer.valueOf(paramAnonymousInt2) });
        ad localad = (ad)f.this.getItem(paramAnonymousInt1);
        if (localad == null)
        {
          w.e("MicroMsg.QQFriendAdapterCaseB", "[cpan] qq friend is null. qq:%s", new Object[] { paramAnonymousString });
          GMTrace.o(2819109158912L, 21004);
          return;
        }
        w.d("MicroMsg.QQFriendAdapterCaseB", "qq friend:%s", new Object[] { localad.toString() });
        if (localad.gDW == 1)
        {
          paramAnonymousString = new com.tencent.mm.pluginsdk.ui.applet.a(f.a(f.this), new a.a()
          {
            public final void a(boolean paramAnonymous2Boolean1, boolean paramAnonymous2Boolean2, String paramAnonymous2String1, String paramAnonymous2String2)
            {
              GMTrace.i(2786494251008L, 20761);
              w.i("MicroMsg.QQFriendAdapterCaseB", "cpan ok:%b hasSendVerify:%b  username:%s gitemId:%s", new Object[] { Boolean.valueOf(paramAnonymous2Boolean1), Boolean.valueOf(paramAnonymous2Boolean2), paramAnonymous2String1, paramAnonymous2String2 });
              long l = new o(o.bj(paramAnonymous2String2)).longValue();
              ad localad = af.Ik().am(l);
              if ((paramAnonymous2Boolean1) && (localad != null)) {
                localad.username = paramAnonymous2String1;
              }
              if (localad != null)
              {
                localad.gsR = 2;
                w.d("MicroMsg.QQFriendAdapterCaseB", "f :%s", new Object[] { localad.toString() });
                af.Ik().a(l, localad);
                f.this.QF();
              }
              for (;;)
              {
                if ((paramAnonymous2Boolean1) && (localad != null)) {
                  f.WM(paramAnonymous2String1);
                }
                GMTrace.o(2786494251008L, 20761);
                return;
                w.w("MicroMsg.QQFriendAdapterCaseB", "cpan qq friend is null. qq:%s", new Object[] { paramAnonymous2String2 });
              }
            }
          });
          paramAnonymousString.twv = localad.gDV;
          paramAnonymousString.twu = false;
          LinkedList localLinkedList = new LinkedList();
          localLinkedList.add(Integer.valueOf(12));
          if (bg.nm(localad.getUsername()))
          {
            w.w("MicroMsg.QQFriendAdapterCaseB", "[cpan] qq friend username is null.");
            GMTrace.o(2819109158912L, 21004);
            return;
          }
          paramAnonymousString.b(localad.getUsername(), localLinkedList, true);
          localad.gsR = 1;
          af.Ik().a(localad.gDV, localad);
          f.this.QF();
        }
        GMTrace.o(2819109158912L, 21004);
      }
    };
    this.ezR = paramMMActivity;
    this.IJ = paramInt;
    this.xcg = paramMMActivity.getIntent().getBooleanExtra("qqgroup_sendmessage", false);
    lb(true);
    GMTrace.o(2819780247552L, 21009);
  }
  
  private static String b(ad paramad)
  {
    GMTrace.i(2820585553920L, 21015);
    if (paramad.gsQ == 123)
    {
      GMTrace.o(2820585553920L, 21015);
      return "#";
    }
    char c = (char)paramad.gsQ;
    GMTrace.o(2820585553920L, 21015);
    return String.valueOf(c);
  }
  
  public final void Au(String paramString)
  {
    GMTrace.i(2820048683008L, 21011);
    this.htQ = bg.nk(paramString.trim());
    aJe();
    QF();
    GMTrace.o(2820048683008L, 21011);
  }
  
  public final void QF()
  {
    GMTrace.i(2820317118464L, 21013);
    aJe();
    if (bg.nm(this.htQ)) {
      setCursor(af.Ik().n(this.IJ, this.xcg));
    }
    for (;;)
    {
      if ((this.xbY != null) && (this.htQ != null)) {
        this.xbY.Bs(getCursor().getCount());
      }
      notifyDataSetChanged();
      GMTrace.o(2820317118464L, 21013);
      return;
      setCursor(af.Ik().b(this.IJ, this.htQ, this.xcg));
    }
  }
  
  protected final void QG()
  {
    GMTrace.i(2820182900736L, 21012);
    QF();
    GMTrace.o(2820182900736L, 21012);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(2819914465280L, 21010);
    this.xbY = parama;
    GMTrace.o(2819914465280L, 21010);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(2820451336192L, 21014);
    ad localad = (ad)getItem(paramInt);
    if (paramView == null)
    {
      paramView = View.inflate(this.ezR, R.i.cxD, null);
      paramViewGroup = new b(paramView);
      paramView.setTag(paramViewGroup);
      paramViewGroup.vaM = paramInt;
      paramViewGroup.gUy = localad.gDV;
      paramViewGroup.status = localad.gDW;
      paramViewGroup.iBg.setText(h.b(this.ezR, localad.getDisplayName(), paramViewGroup.iBg.getTextSize()));
      paramViewGroup.wnX.setText(h.b(this.ezR, localad.HW(), paramViewGroup.wnX.getTextSize()));
      if (!this.xcg) {
        break label373;
      }
      if (o.bj(paramViewGroup.gUy) == 0) {
        break label848;
      }
    }
    label187:
    label203:
    label223:
    label235:
    label265:
    label373:
    label388:
    label681:
    label691:
    label699:
    label707:
    label738:
    label817:
    label848:
    for (Object localObject = b.X(localad.gDV);; localObject = null)
    {
      int i;
      if (localObject == null)
      {
        paramViewGroup.hqg.setImageDrawable(com.tencent.mm.br.a.b(this.ezR, R.k.aVS));
        if (!this.xcg) {
          break label388;
        }
        paramViewGroup.wnR.setVisibility(8);
        localObject = (ad)getItem(paramInt - 1);
        if (localObject != null) {
          break label681;
        }
        i = -1;
        if (localObject == null) {
          break label691;
        }
        localObject = ((ad)localObject).toString();
        w.d("MicroMsg.QQFriendAdapterCaseB", "qq friend pre:%s", new Object[] { localObject });
        if (localad == null) {
          break label699;
        }
        localObject = localad.toString();
        w.d("MicroMsg.QQFriendAdapterCaseB", "qq friend:%s", new Object[] { localObject });
        if (paramInt != 0) {
          break label738;
        }
        localObject = b(localad);
        if (!bg.nm((String)localObject)) {
          break label707;
        }
        w.w("MicroMsg.QQFriendAdapterCaseB", "get display show head return null, user[%s] pos[%d]", new Object[] { localad.getUsername(), Integer.valueOf(paramInt) });
        paramViewGroup.qgv.setVisibility(8);
      }
      for (;;)
      {
        GMTrace.o(2820451336192L, 21014);
        return paramView;
        paramViewGroup = (b)paramView.getTag();
        break;
        paramViewGroup.hqg.setImageBitmap((Bitmap)localObject);
        break label187;
        a.b.a(paramViewGroup.hqg, localad.getUsername());
        break label187;
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
            paramViewGroup.nXP.setVisibility(4);
            break;
            at.AR();
            if ((c.yK().TA(localad.getUsername())) || (q.zE().equals(localad.getUsername())))
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
            break;
          }
        }
        paramViewGroup.hql.setVisibility(4);
        paramViewGroup.nXP.setVisibility(0);
        break label203;
        i = ((ad)localObject).gsQ;
        break label223;
        localObject = "";
        break label235;
        localObject = "";
        break label265;
        paramViewGroup.qgv.setVisibility(0);
        paramViewGroup.qgv.setText((CharSequence)localObject);
        paramViewGroup.qgv.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        continue;
        if (localad.gsQ != i) {}
        for (i = 1;; i = 0)
        {
          localObject = b(localad);
          if ((!bg.nm((String)localObject)) && (i != 0)) {
            break label817;
          }
          w.w("MicroMsg.QQFriendAdapterCaseB", "get display show head return null, user[%s] pos[%d]", new Object[] { localad.getUsername(), Integer.valueOf(paramInt) });
          paramViewGroup.qgv.setVisibility(8);
          break;
        }
        paramViewGroup.qgv.setVisibility(0);
        paramViewGroup.qgv.setText((CharSequence)localObject);
        paramViewGroup.qgv.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      }
    }
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(2820719771648L, 21016);
    GMTrace.o(2820719771648L, 21016);
  }
  
  static abstract interface a
  {
    public abstract void f(int paramInt1, String paramString, int paramInt2);
  }
  
  final class b
  {
    String gUy;
    ImageView hqg;
    TextView hql;
    TextView iBg;
    ProgressBar nXP;
    TextView qgv;
    int status;
    int vaM;
    View wnR;
    TextView wnX;
    
    public b(View paramView)
    {
      GMTrace.i(2829578141696L, 21082);
      this.qgv = ((TextView)paramView.findViewById(R.h.bBX));
      this.hqg = ((ImageView)paramView.findViewById(R.h.bBW));
      this.iBg = ((TextView)paramView.findViewById(R.h.bBY));
      this.wnX = ((TextView)paramView.findViewById(R.h.bCb));
      this.wnR = paramView.findViewById(R.h.bBV);
      this.hql = ((TextView)paramView.findViewById(R.h.bCa));
      this.nXP = ((ProgressBar)paramView.findViewById(R.h.bBZ));
      this.wnR.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2801929289728L, 20876);
          if (f.b(f.this) != null) {
            f.b(f.this).f(f.b.this.vaM, f.b.this.gUy, f.b.this.status);
          }
          GMTrace.o(2801929289728L, 20876);
        }
      });
      GMTrace.o(2829578141696L, 21082);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\friend\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */