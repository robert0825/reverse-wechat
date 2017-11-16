package com.tencent.mm.ui.voicesearch;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.d;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.af.m;
import com.tencent.mm.br.a;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bai;
import com.tencent.mm.protocal.c.bak;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.MaskLayout.a;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.t.a;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bl;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SuppressLint({"DefaultLocale"})
public final class b
  extends o<x>
  implements e
{
  private Context context;
  public com.tencent.mm.ui.applet.b gCY;
  private b.b gCZ;
  private LinkedList<bai> glr;
  private ProgressDialog htG;
  private List<String> iVA;
  private int showType;
  public String wPl;
  public String[] woC;
  public String xmV;
  private boolean xmW;
  private x xmX;
  private boolean xmY;
  public boolean xmZ;
  private boolean xna;
  
  public b(Context paramContext, int paramInt)
  {
    super(paramContext, new x());
    GMTrace.i(2833738891264L, 21113);
    this.xmW = false;
    this.xmX = null;
    this.glr = new LinkedList();
    this.iVA = null;
    this.xmY = true;
    this.htG = null;
    this.xmZ = false;
    this.showType = 1;
    this.gCY = new com.tencent.mm.ui.applet.b(new com.tencent.mm.ui.applet.b.a()
    {
      public final Bitmap jP(String paramAnonymousString)
      {
        GMTrace.i(2846086922240L, 21205);
        paramAnonymousString = com.tencent.mm.ac.b.a(paramAnonymousString, false, -1);
        GMTrace.o(2846086922240L, 21205);
        return paramAnonymousString;
      }
    });
    this.gCZ = null;
    this.xna = false;
    this.context = paramContext;
    this.showType = paramInt;
    this.xmX = new x();
    this.xmX.setUsername("_find_more_public_contact_");
    this.xmX.uJ();
    this.wPl = "@micromsg.with.all.biz.qq.com";
    GMTrace.o(2833738891264L, 21113);
  }
  
  public static String Xf(String paramString)
  {
    GMTrace.i(14473771352064L, 107838);
    String str = paramString.trim();
    paramString = str;
    if (str.startsWith("@")) {
      paramString = str.substring(1) + "%@micromsg.with.all.biz.qq.com";
    }
    w.d("MicroMsg.SearchResultAdapter", "translateQueryText [" + paramString + "]");
    GMTrace.o(14473771352064L, 107838);
    return paramString;
  }
  
  public final bai Ec(int paramInt)
  {
    GMTrace.i(2834678415360L, 21120);
    try
    {
      w.d("MicroMsg.SearchResultAdapter", "position " + paramInt + " size " + this.glr.size() + "  " + (paramInt - asx()));
      bai localbai = (bai)this.glr.get(paramInt - asx() - 1);
      GMTrace.o(2834678415360L, 21120);
      return localbai;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.SearchResultAdapter", localException, "", new Object[0]);
      GMTrace.o(2834678415360L, 21120);
    }
    return null;
  }
  
  public final boolean Ed(int paramInt)
  {
    GMTrace.i(2835215286272L, 21124);
    if (this.xmW)
    {
      int i = asx();
      if ((paramInt == i) && (paramInt < i + aGD()))
      {
        GMTrace.o(2835215286272L, 21124);
        return true;
      }
    }
    GMTrace.o(2835215286272L, 21124);
    return false;
  }
  
  public final void QF()
  {
    GMTrace.i(2835617939456L, 21127);
    Y(new Runnable()
    {
      public final void run()
      {
        int i = 0;
        GMTrace.i(2847563317248L, 21216);
        Object localObject2;
        Object localObject3;
        if ((b.g(b.this) != null) && (b.g(b.this).length != 0))
        {
          localObject1 = new ArrayList();
          localObject2 = b.g(b.this);
          int j = localObject2.length;
          while (i < j)
          {
            localObject3 = localObject2[i];
            if (b.this.Xg((String)localObject3)) {
              ((List)localObject1).add(localObject3);
            }
            i += 1;
          }
          if (((List)localObject1).size() > 0)
          {
            localObject2 = b.this;
            at.AR();
            b.a((b)localObject2, c.yK().a((String[])((List)localObject1).toArray(new String[((List)localObject1).size()]), b.h(b.this), b.a(b.this)));
            GMTrace.o(2847563317248L, 21216);
            return;
          }
          localObject1 = b.this;
          at.AR();
          b.b((b)localObject1, c.yK().aOp());
          GMTrace.o(2847563317248L, 21216);
          return;
        }
        if (b.i(b.this) != null)
        {
          if (!b.h(b.this).equals("@all.chatroom.contact"))
          {
            localObject1 = at.AR().glQ.a(b.i(b.this), b.h(b.this), b.a(b.this), true);
            b.c(b.this, (Cursor)localObject1);
            GMTrace.o(2847563317248L, 21216);
            return;
          }
          localObject1 = at.AR().glQ.a(b.i(b.this), "@micromsg.with.all.biz.qq.com", b.a(b.this), false);
          localObject2 = new ArrayList();
          localObject3 = new ArrayList();
          while (((Cursor)localObject1).moveToNext())
          {
            String str = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex("username"));
            if (!str.endsWith("@chatroom")) {
              ((ArrayList)localObject2).add(str);
            } else {
              ((ArrayList)localObject3).add(str);
            }
          }
          if (!((Cursor)localObject1).isClosed()) {
            ((Cursor)localObject1).close();
          }
          if ((((ArrayList)localObject2).size() != 0) || (((ArrayList)localObject3).size() != 0)) {}
          for (localObject1 = at.AR().glQ.a(b.i(b.this), (ArrayList)localObject2, null, (ArrayList)localObject3, b.a(b.this));; localObject1 = c.yK().aOp())
          {
            b.d(b.this, (Cursor)localObject1);
            GMTrace.o(2847563317248L, 21216);
            return;
            at.AR();
          }
        }
        Object localObject1 = b.this;
        at.AR();
        b.e((b)localObject1, c.yK().aOp());
        GMTrace.o(2847563317248L, 21216);
      }
    });
    GMTrace.o(2835617939456L, 21127);
  }
  
  protected final void QG()
  {
    GMTrace.i(2835752157184L, 21128);
    aJe();
    QF();
    GMTrace.o(2835752157184L, 21128);
  }
  
  public final void Xe(final String paramString)
  {
    GMTrace.i(2835081068544L, 21123);
    Y(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2842463043584L, 21178);
        if (b.b(b.this).isHidden())
        {
          b.b(b.this).uK();
          if (b.c(b.this))
          {
            ab localab = new ab(paramString, 3);
            at.wS().a(localab, 0);
            b.d(b.this);
            GMTrace.o(2842463043584L, 21178);
          }
        }
        else
        {
          b.b(b.this).uJ();
        }
        GMTrace.o(2842463043584L, 21178);
      }
    });
    GMTrace.o(2835081068544L, 21123);
  }
  
  public final boolean Xg(String paramString)
  {
    GMTrace.i(2836691681280L, 21135);
    if ((this.iVA != null) && (paramString != null))
    {
      Iterator localIterator = this.iVA.iterator();
      while (localIterator.hasNext()) {
        if (((String)localIterator.next()).equals(paramString))
        {
          GMTrace.o(2836691681280L, 21135);
          return false;
        }
      }
    }
    GMTrace.o(2836691681280L, 21135);
    return true;
  }
  
  public final void Y(final Runnable paramRunnable)
  {
    GMTrace.i(2836557463552L, 21134);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramRunnable.run();
      notifyDataSetChanged();
      GMTrace.o(2836557463552L, 21134);
      return;
    }
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2841926172672L, 21174);
        paramRunnable.run();
        b.this.notifyDataSetChanged();
        GMTrace.o(2841926172672L, 21174);
      }
    });
    GMTrace.o(2836557463552L, 21134);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, final k paramk)
  {
    GMTrace.i(2836423245824L, 21133);
    w.d("MicroMsg.SearchResultAdapter", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramk.getType() != 106)
    {
      w.e("MicroMsg.SearchResultAdapter", "error type");
      GMTrace.o(2836423245824L, 21133);
      return;
    }
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    this.xna = false;
    if (t.a.a(this.context, paramInt1, paramInt2, paramString, 7))
    {
      this.xmY = false;
      GMTrace.o(2836423245824L, 21133);
      return;
    }
    if ((paramInt1 == 4) && (paramInt2 == -4))
    {
      Y(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2849173929984L, 21228);
          b.b(b.this, false);
          GMTrace.o(2849173929984L, 21228);
        }
      });
      GMTrace.o(2836423245824L, 21133);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      Y(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2847294881792L, 21214);
          b.b(b.this, false);
          GMTrace.o(2847294881792L, 21214);
        }
      });
      GMTrace.o(2836423245824L, 21133);
      return;
    }
    Y(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2842194608128L, 21176);
        Object localObject1 = ((ab)paramk).LK();
        w.d("MicroMsg.SearchResultAdapter", "count " + ((bak)localObject1).uqk);
        if (((bak)localObject1).uqk > 0)
        {
          localObject1 = ((bak)localObject1).uql.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (bai)((Iterator)localObject1).next();
            if (s.fp(((bai)localObject2).uAv))
            {
              if (b.f(b.this) == null) {
                b.a(b.this, new LinkedList());
              }
              b.f(b.this).add(localObject2);
            }
          }
        }
        Object localObject2 = com.tencent.mm.platformtools.n.a(((bak)localObject1).ufy);
        w.d("MicroMsg.SearchResultAdapter", "user " + (String)localObject2);
        if (bg.nl((String)localObject2).length() > 0)
        {
          bai localbai = new bai();
          localbai.ufy = ((bak)localObject1).ufy;
          localbai.uAv = ((bak)localObject1).uAv;
          localbai.gCA = ((bak)localObject1).gCA;
          localbai.uxT = ((bak)localObject1).uxT;
          localbai.gCC = ((bak)localObject1).gCC;
          localbai.gCG = ((bak)localObject1).gCG;
          localbai.gCz = ((bak)localObject1).gCz;
          localbai.gCy = ((bak)localObject1).gCy;
          localbai.gCx = ((bak)localObject1).gCx;
          localbai.uAw = ((bak)localObject1).uAw;
          localbai.uAz = ((bak)localObject1).uAz;
          localbai.uAx = ((bak)localObject1).uAx;
          localbai.uAy = ((bak)localObject1).uAy;
          localbai.uAB = ((bak)localObject1).uAB;
          com.tencent.mm.ac.n.Dh().f((String)localObject2, com.tencent.mm.platformtools.n.a(((bak)localObject1).tQa));
          if (b.f(b.this) == null) {
            b.a(b.this, new LinkedList());
          }
          b.f(b.this).clear();
          if (s.fp(localbai.uAv)) {
            b.f(b.this).add(localbai);
          }
          w.d("MicroMsg.SearchResultAdapter", "count " + b.f(b.this).size());
        }
        b.b(b.this, false);
        GMTrace.o(2842194608128L, 21176);
      }
    });
    GMTrace.o(2836423245824L, 21133);
  }
  
  protected final int aGD()
  {
    int i = 0;
    GMTrace.i(2834544197632L, 21119);
    if (this.xmW)
    {
      if (this.xmX.isHidden()) {}
      for (;;)
      {
        GMTrace.o(2834544197632L, 21119);
        return i + 1;
        i = this.glr.size();
      }
    }
    GMTrace.o(2834544197632L, 21119);
    return 0;
  }
  
  public final void cS(final List<String> paramList)
  {
    GMTrace.i(2833873108992L, 21114);
    Y(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2846758010880L, 21210);
        if (b.a(b.this) == null) {
          b.a(b.this, new ArrayList());
        }
        b.a(b.this).clear();
        b.a(b.this).addAll(paramList);
        b.a(b.this).add("officialaccounts");
        b.a(b.this).add("helper_entry");
        GMTrace.o(2846758010880L, 21210);
      }
    });
    GMTrace.o(2833873108992L, 21114);
  }
  
  public final void de(List<String> paramList)
  {
    GMTrace.i(2836154810368L, 21131);
    this.woC = ((String[])paramList.toArray(new String[paramList.size()]));
    this.xmV = null;
    aJe();
    QF();
    GMTrace.o(2836154810368L, 21131);
  }
  
  public final void detach()
  {
    GMTrace.i(2834141544448L, 21116);
    if (this.gCY != null)
    {
      this.gCY.detach();
      this.gCY = null;
    }
    GMTrace.o(2834141544448L, 21116);
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(2834409979904L, 21118);
    if (this.showType == 2)
    {
      GMTrace.o(2834409979904L, 21118);
      return 2;
    }
    if (Ed(paramInt))
    {
      GMTrace.o(2834409979904L, 21118);
      return 1;
    }
    GMTrace.o(2834409979904L, 21118);
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(2835483721728L, 21126);
    boolean bool1 = oR(paramInt);
    boolean bool2 = Ed(paramInt);
    Object localObject3;
    if ((this.xmW) && (bool1))
    {
      paramViewGroup = paramView;
      Object localObject1;
      if (paramView != null)
      {
        localObject1 = (a)paramView.getTag();
        paramViewGroup = paramView;
        if (bool2)
        {
          paramViewGroup = paramView;
          if (((a)localObject1).xnd == null) {
            paramViewGroup = null;
          }
        }
      }
      if (paramViewGroup == null) {
        if (bool2)
        {
          paramViewGroup = View.inflate(this.context, R.i.ctH, null);
          paramView = new a();
          paramView.jtr = ((TextView)paramViewGroup.findViewById(R.h.brH));
          paramView.xnd = ((ProgressBar)paramViewGroup.findViewById(R.h.caG));
          paramViewGroup.setTag(paramView);
        }
      }
      for (;;)
      {
        if (!bool2)
        {
          if (this.gCZ == null) {
            this.gCZ = new b.b()
            {
              public final int Hk()
              {
                GMTrace.i(2846489575424L, 21208);
                if (b.f(b.this) == null)
                {
                  GMTrace.o(2846489575424L, 21208);
                  return 0;
                }
                int i = b.f(b.this).size();
                GMTrace.o(2846489575424L, 21208);
                return i;
              }
              
              public final String gc(int paramAnonymousInt)
              {
                GMTrace.i(2846355357696L, 21207);
                if (paramAnonymousInt < 0)
                {
                  w.e("MicroMsg.SearchResultAdapter", "pos is invalid");
                  GMTrace.o(2846355357696L, 21207);
                  return null;
                }
                Object localObject = b.this.Ec(b.e(b.this) + paramAnonymousInt + 1);
                if (localObject == null)
                {
                  GMTrace.o(2846355357696L, 21207);
                  return null;
                }
                localObject = ((bai)localObject).ufy.uNR;
                GMTrace.o(2846355357696L, 21207);
                return (String)localObject;
              }
            };
          }
          if (this.gCY != null) {
            this.gCY.a(paramInt - asx() - 1, this.gCZ);
          }
          localObject1 = Ec(paramInt);
          paramView.mpk.setVisibility(8);
          if (localObject1 == null)
          {
            GMTrace.o(2835483721728L, 21126);
            return paramViewGroup;
            paramViewGroup = View.inflate(this.context, R.i.ctM, null);
            paramView = new a();
            paramView.mpk = ((TextView)paramViewGroup.findViewById(R.h.brF));
            paramView.jRj = ((MaskLayout)paramViewGroup.findViewById(R.h.brD));
            paramView.jtr = ((TextView)paramViewGroup.findViewById(R.h.brH));
            paramView.hqJ = ((CheckBox)paramViewGroup.findViewById(R.h.brI));
            paramView.wUx = ((TextView)paramViewGroup.findViewById(R.h.brB));
            paramViewGroup.setTag(paramView);
            continue;
            paramView = (a)paramViewGroup.getTag();
          }
          else
          {
            paramView.wUx.setVisibility(8);
            a.b.a((ImageView)paramView.jRj.view, ((bai)localObject1).ufy.uNR);
            if (((bai)localObject1).uAv != 0) {
              if (ak.a.gmZ != null)
              {
                localObject3 = ak.a.gmZ.fs(((bai)localObject1).uAv);
                if (localObject3 != null)
                {
                  localObject3 = m.iX((String)localObject3);
                  paramView.jRj.d((Bitmap)localObject3, MaskLayout.a.wgw);
                  localObject1 = bg.nl(((bai)localObject1).uxT.uNR);
                }
              }
            }
          }
        }
      }
      for (;;)
      {
        try
        {
          paramView.jtr.setText(h.b(this.context, (CharSequence)localObject1, paramView.jtr.getTextSize()));
          GMTrace.o(2835483721728L, 21126);
          return paramViewGroup;
          paramView.jRj.caA();
          break;
          paramView.jRj.caA();
          break;
          paramView.jRj.caA();
        }
        catch (Exception localException1)
        {
          w.printErrStackTrace("MicroMsg.SearchResultAdapter", localException1, "", new Object[0]);
          paramView.jtr.setText("");
          continue;
        }
        if (this.xna) {
          paramView.xnd.setVisibility(0);
        }
        for (;;)
        {
          w.d("MicroMsg.SearchResultAdapter", "refresh  " + this.xmY);
          if (((this.glr != null) && (this.glr.size() != 0)) || (this.xmY)) {
            break label627;
          }
          paramView.jtr.setText(this.context.getString(R.l.cRb));
          paramView.jtr.setTextColor(this.context.getResources().getColor(R.e.aOl));
          break;
          paramView.xnd.setVisibility(8);
        }
        label627:
        paramView.jtr.setText(this.context.getString(R.l.cRc));
        paramView.jtr.setTextColor(a.U(this.context, R.e.aOq));
      }
    }
    if (this.showType == 2)
    {
      if (paramView == null)
      {
        paramView = View.inflate(this.context, R.i.cHr, null);
        paramViewGroup = new a();
        paramViewGroup.jtr = ((TextView)paramView.findViewById(R.h.brH));
        paramView.setTag(paramViewGroup);
      }
      for (;;)
      {
        Object localObject2 = me(paramInt);
        paramViewGroup.jtr.setTextColor(a.U(this.context, R.e.aOq));
        try
        {
          localObject2 = this.context.getString(R.l.ehe, new Object[] { r.a((x)localObject2, ((com.tencent.mm.g.b.af)localObject2).field_username) });
          paramViewGroup.jtr.setText(h.b(this.context, (CharSequence)localObject2, paramViewGroup.jtr.getTextSize()));
          paramViewGroup.jtr.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
          GMTrace.o(2835483721728L, 21126);
          return paramView;
          paramViewGroup = (a)paramView.getTag();
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            paramViewGroup.jtr.setText("");
          }
        }
      }
    }
    if (paramView != null)
    {
      paramViewGroup = (a)paramView.getTag();
      if (paramViewGroup == null) {
        paramView = null;
      }
    }
    for (;;)
    {
      if (paramView == null)
      {
        paramViewGroup = v.fb(this.context).inflate(R.i.ctM, null);
        paramView = new a();
        paramView.mpk = ((TextView)paramViewGroup.findViewById(R.h.brF));
        paramView.jRj = ((MaskLayout)paramViewGroup.findViewById(R.h.brD));
        paramView.jtr = ((TextView)paramViewGroup.findViewById(R.h.brH));
        paramView.hqJ = ((CheckBox)paramViewGroup.findViewById(R.h.brI));
        paramView.wUx = ((TextView)paramViewGroup.findViewById(R.h.brB));
        paramViewGroup.setTag(paramView);
      }
      for (;;)
      {
        x localx = me(paramInt);
        if (paramView.mpk != null) {
          paramView.mpk.setVisibility(8);
        }
        localObject3 = paramView.jtr;
        Context localContext = this.context;
        if (!s.gm(localx.field_username)) {
          paramInt = R.e.aOq;
        }
        for (;;)
        {
          ((TextView)localObject3).setTextColor(a.U(localContext, paramInt));
          a.b.a((ImageView)paramView.jRj.view, localx.field_username);
          paramView.wUx.setVisibility(8);
          if (localx.field_verifyFlag != 0) {
            if (ak.a.gmZ != null)
            {
              localObject3 = ak.a.gmZ.fs(localx.field_verifyFlag);
              if (localObject3 != null)
              {
                localObject3 = m.iX((String)localObject3);
                paramView.jRj.d((Bitmap)localObject3, MaskLayout.a.wgw);
              }
            }
          }
          try
          {
            for (;;)
            {
              paramView.jtr.setText(h.b(this.context, r.a(localx, localx.field_username), paramView.jtr.getTextSize()));
              GMTrace.o(2835483721728L, 21126);
              return paramViewGroup;
              paramInt = R.e.aOr;
              break;
              paramView.jRj.caA();
              continue;
              paramView.jRj.caA();
              continue;
              paramView.jRj.caA();
            }
          }
          catch (Exception localException3)
          {
            for (;;)
            {
              paramView.jtr.setText("");
            }
          }
        }
        View localView = paramView;
        paramView = paramViewGroup;
        paramViewGroup = localView;
      }
      continue;
      paramViewGroup = null;
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(2834275762176L, 21117);
    GMTrace.o(2834275762176L, 21117);
    return 3;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    GMTrace.i(2835349504000L, 21125);
    if ((Ed(paramInt)) && ((this.glr == null) || (this.glr.size() == 0)) && (!this.xmY))
    {
      GMTrace.o(2835349504000L, 21125);
      return false;
    }
    GMTrace.o(2835349504000L, 21125);
    return true;
  }
  
  public final void mH(boolean paramBoolean)
  {
    GMTrace.i(2834007326720L, 21115);
    this.xmZ = paramBoolean;
    if (paramBoolean) {
      this.xmX.uJ();
    }
    GMTrace.o(2834007326720L, 21115);
  }
  
  public final void mI(final boolean paramBoolean)
  {
    GMTrace.i(2834946850816L, 21122);
    Y(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2842731479040L, 21180);
        b.a(b.this, paramBoolean);
        GMTrace.o(2842731479040L, 21180);
      }
    });
    GMTrace.o(2834946850816L, 21122);
  }
  
  public final x me(int paramInt)
  {
    GMTrace.i(2834812633088L, 21121);
    if (oR(paramInt))
    {
      localx = (x)aGE();
      GMTrace.o(2834812633088L, 21121);
      return localx;
    }
    x localx = (x)super.getItem(paramInt);
    GMTrace.o(2834812633088L, 21121);
    return localx;
  }
  
  public final void onPause()
  {
    GMTrace.i(2836020592640L, 21130);
    at.wS().b(106, this);
    GMTrace.o(2836020592640L, 21130);
  }
  
  public final void onResume()
  {
    GMTrace.i(2835886374912L, 21129);
    at.wS().a(106, this);
    GMTrace.o(2835886374912L, 21129);
  }
  
  protected static final class a
  {
    public CheckBox hqJ;
    public MaskLayout jRj;
    public TextView jtr;
    public TextView mpk;
    public TextView wUx;
    public ProgressBar xnd;
    
    public a()
    {
      GMTrace.i(2841657737216L, 21172);
      GMTrace.o(2841657737216L, 21172);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\voicesearch\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */