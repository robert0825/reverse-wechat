package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.bx.a.b;
import com.tencent.mm.bx.a.c;
import com.tencent.mm.bx.a.d;
import com.tencent.mm.bx.a.e;
import com.tencent.mm.bx.a.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMListPopupWindow;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.aa.a;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.q;
import java.util.Iterator;
import java.util.List;

public class h
  implements View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  public static int juH;
  public static int juI;
  public static boolean xqH;
  public LayoutInflater CJ;
  private DisplayMetrics aKy;
  private Context mContext;
  public View mHn;
  public p.d qil;
  public n qim;
  public View wrx;
  public MMListPopupWindow wtY;
  private a xqB;
  public q xqC;
  private int xqD;
  private boolean xqE;
  public View xqF;
  public View.OnCreateContextMenuListener xqG;
  public boolean xqI;
  
  static
  {
    GMTrace.i(14903268081664L, 111038);
    xqH = false;
    GMTrace.o(14903268081664L, 111038);
  }
  
  public h(Context paramContext)
  {
    GMTrace.i(14900449509376L, 111017);
    this.mContext = null;
    this.wrx = null;
    this.xqB = null;
    this.xqE = false;
    this.xqI = false;
    this.mContext = paramContext;
    this.CJ = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    MP();
    GMTrace.o(14900449509376L, 111017);
  }
  
  public h(Context paramContext, View paramView)
  {
    GMTrace.i(14900315291648L, 111016);
    this.mContext = null;
    this.wrx = null;
    this.xqB = null;
    this.xqE = false;
    this.xqI = false;
    this.mContext = paramContext;
    this.wrx = paramView;
    this.CJ = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    MP();
    cjh();
    GMTrace.o(14900315291648L, 111016);
  }
  
  private void MP()
  {
    GMTrace.i(14901389033472L, 111024);
    cca();
    this.qim = new n();
    this.xqB = new a((byte)0);
    this.aKy = this.mContext.getResources().getDisplayMetrics();
    GMTrace.o(14901389033472L, 111024);
  }
  
  private boolean cjg()
  {
    GMTrace.i(18950335234048L, 141191);
    if ((this.xqC != null) && (this.xqC.isShowing()))
    {
      GMTrace.o(18950335234048L, 141191);
      return true;
    }
    GMTrace.o(18950335234048L, 141191);
    return false;
  }
  
  private void cjh()
  {
    GMTrace.i(14901523251200L, 111025);
    this.wrx.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(18950603669504L, 141193);
        switch (paramAnonymousMotionEvent.getAction() & 0xFF)
        {
        }
        for (;;)
        {
          GMTrace.o(18950603669504L, 141193);
          return false;
          h.juH = (int)paramAnonymousMotionEvent.getRawX();
          h.juI = (int)paramAnonymousMotionEvent.getRawY();
          h.this.mHn = h.this.wrx;
          h.xqH = true;
          w.i("MicroMsg.MMPopupMenu", "popmenu view set , x_down=" + h.juH + "y_down=" + h.juI);
        }
      }
    });
    GMTrace.o(14901523251200L, 111025);
  }
  
  private boolean eI(int paramInt1, int paramInt2)
  {
    GMTrace.i(14900852162560L, 111020);
    if ((isShowing()) || (cjg()))
    {
      GMTrace.o(14900852162560L, 111020);
      return false;
    }
    if (this.xqG != null) {
      this.xqG.onCreateContextMenu(this.qim, this.wrx, null);
    }
    ((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(a.f.cDv, null);
    int n = this.xqB.getCount();
    int i1 = this.mContext.getResources().getDimensionPixelSize(a.c.aQM);
    int i2 = this.mContext.getResources().getDimensionPixelSize(a.c.xvb);
    a locala = this.xqB;
    int i = 0;
    Object localObject = null;
    int j = 0;
    int i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i5 = locala.getCount();
    int k = 0;
    if (k < i5)
    {
      int m = locala.getItemViewType(k);
      if (m == j) {
        break label660;
      }
      localObject = null;
      j = m;
    }
    label300:
    label326:
    label337:
    label660:
    for (;;)
    {
      localObject = locala.getView(k, (View)localObject, new FrameLayout(this.mContext));
      ((View)localObject).measure(i3, i4);
      i = Math.max(i, ((View)localObject).getMeasuredWidth());
      k += 1;
      break;
      j = a.W(this.mContext, a.c.xvc);
      boolean bool;
      if (i < j)
      {
        i = j;
        bool = true;
        if (this.qim.size() >= 3) {
          bool = false;
        }
        if (!this.xqE)
        {
          if (this.xqF == null) {
            break label326;
          }
          this.xqF.setSelected(true);
        }
        if (!this.xqI) {
          break label337;
        }
        eJ(paramInt1, paramInt2);
      }
      for (;;)
      {
        GMTrace.o(14900852162560L, 111020);
        return true;
        break;
        this.wrx.setSelected(true);
        break label300;
        localObject = aa.a(this.mContext, i, paramInt1, paramInt2, n * i1, i2, bool);
        this.xqD = (paramInt2 - this.mContext.getResources().getDimensionPixelSize(a.c.xvb));
        w.d("MicroMsg.MMPopupMenu", "showPointY=" + paramInt2 + "verticalOffset=" + this.xqD);
        this.wtY = new MMListPopupWindow(this.mContext, null, 0);
        this.wtY.setOnDismissListener(this);
        this.wtY.RZ = new AdapterView.OnItemClickListener()
        {
          public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            GMTrace.i(14905012912128L, 111051);
            if (h.this.qil != null) {
              h.this.qil.c(h.this.qim.getItem(paramAnonymousInt), paramAnonymousInt);
            }
            if ((h.this.wtY != null) && (h.this.wtY.hwd.isShowing())) {
              h.this.wtY.dismiss();
            }
            GMTrace.o(14905012912128L, 111051);
          }
        };
        this.wtY.setAdapter(this.xqB);
        this.wtY.bZX();
        this.wtY.setBackgroundDrawable(this.mContext.getResources().getDrawable(a.d.baG));
        this.wtY.setAnimationStyle(((aa.a)localObject).wiK);
        this.wtY.RO = ((aa.a)localObject).iPS;
        this.wtY.setVerticalOffset(((aa.a)localObject).qki);
        this.wtY.RX = this.wrx;
        this.wtY.setContentWidth(i);
        this.wtY.fd();
        this.wtY.show();
        this.wtY.wdp.setOnKeyListener(this);
        this.wtY.wdp.setDivider(new ColorDrawable(this.mContext.getResources().getColor(a.b.aOZ)));
        this.wtY.wdp.setSelector(this.mContext.getResources().getDrawable(a.d.aYX));
        this.wtY.wdp.setDividerHeight(0);
        this.wtY.wdp.setVerticalScrollBarEnabled(false);
        this.wtY.wdp.setHorizontalScrollBarEnabled(false);
      }
    }
  }
  
  private void eJ(int paramInt1, int paramInt2)
  {
    GMTrace.i(18950201016320L, 141190);
    int j = this.mContext.getResources().getDimensionPixelOffset(a.c.aQE);
    int k = this.mContext.getResources().getDimensionPixelOffset(a.c.aQq);
    this.xqC = new q(this.mContext);
    this.xqC.setWidth(-2);
    this.xqC.setHeight(-2);
    this.xqC.setBackgroundDrawable(this.mContext.getResources().getDrawable(a.d.baG));
    LinearLayout localLinearLayout = new LinearLayout(this.mContext);
    localLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    localLinearLayout.setOrientation(0);
    localLinearLayout.setBackgroundColor(this.mContext.getResources().getColor(a.b.white));
    final int i = 0;
    if (i < this.qim.size())
    {
      TextView localTextView = (TextView)this.CJ.inflate(a.f.xvo, null, false);
      localTextView.setBackground(this.mContext.getResources().getDrawable(a.d.aYX));
      if (i == 0) {
        localTextView.setPadding(k, 0, j, 0);
      }
      for (;;)
      {
        localTextView.setText(((MenuItem)this.qim.wdA.get(i)).getTitle());
        localTextView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(18950066798592L, 141189);
            if (h.this.qil != null) {
              h.this.qil.c(h.this.qim.getItem(i), i);
            }
            h.this.xqC.dismiss();
            GMTrace.o(18950066798592L, 141189);
          }
        });
        localLinearLayout.addView(localTextView);
        i += 1;
        break;
        if (i == this.qim.size() - 1) {
          localTextView.setPadding(j, 0, k, 0);
        }
      }
    }
    localLinearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    i = localLinearLayout.getMeasuredHeight();
    this.xqC.setContentView(localLinearLayout);
    this.xqC.showAtLocation(this.wrx, 0, paramInt1, paramInt2 - i);
    GMTrace.o(18950201016320L, 141190);
  }
  
  private boolean isShowing()
  {
    GMTrace.i(14900986380288L, 111021);
    if ((this.wtY != null) && (this.wtY.hwd.isShowing()))
    {
      GMTrace.o(14900986380288L, 111021);
      return true;
    }
    GMTrace.o(14900986380288L, 111021);
    return false;
  }
  
  public final void a(View paramView, int paramInt1, long paramLong, View.OnCreateContextMenuListener paramOnCreateContextMenuListener, p.d paramd, int paramInt2, int paramInt3)
  {
    GMTrace.i(14900717944832L, 111019);
    this.qil = paramd;
    this.wrx = paramView;
    cjh();
    this.qim.clear();
    paramd = new AdapterView.AdapterContextMenuInfo(paramView, paramInt1, paramLong);
    paramOnCreateContextMenuListener.onCreateContextMenu(this.qim, paramView, paramd);
    paramView = this.qim.wdA.iterator();
    while (paramView.hasNext()) {
      ((o)paramView.next()).wdD = paramd;
    }
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      bz(0, 0);
      GMTrace.o(14900717944832L, 111019);
      return;
    }
    bz(paramInt2, paramInt3);
    GMTrace.o(14900717944832L, 111019);
  }
  
  public final void a(View paramView, View.OnCreateContextMenuListener paramOnCreateContextMenuListener, p.d paramd, int paramInt1, int paramInt2)
  {
    GMTrace.i(16174041530368L, 120506);
    this.qil = paramd;
    this.wrx = paramView;
    if ((!(paramView instanceof TextView)) && ((paramInt1 == 0) || (paramInt2 == 0))) {
      cjh();
    }
    this.qim.clear();
    paramOnCreateContextMenuListener.onCreateContextMenu(this.qim, paramView, null);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      bz(0, 0);
      GMTrace.o(16174041530368L, 120506);
      return;
    }
    bz(paramInt1, paramInt2);
    GMTrace.o(16174041530368L, 120506);
  }
  
  public boolean bz(int paramInt1, int paramInt2)
  {
    GMTrace.i(14901254815744L, 111023);
    if (((!this.wrx.equals(this.mHn)) || (!xqH)) && ((paramInt1 != 0) || (paramInt2 != 0)))
    {
      juH = paramInt1;
      juI = paramInt2;
    }
    this.mHn = null;
    int k = juH;
    int n = juI;
    xqH = false;
    if (this.aKy == null) {
      this.aKy = this.mContext.getResources().getDisplayMetrics();
    }
    int j = k;
    int i;
    if (this.wrx != null)
    {
      int[] arrayOfInt = new int[2];
      this.wrx.getLocationOnScreen(arrayOfInt);
      i = k;
      if (k == 0) {
        i = arrayOfInt[0] + this.wrx.getWidth() / 2;
      }
      int m = arrayOfInt[1];
      j = arrayOfInt[1] + this.wrx.getHeight();
      k = m;
      if (m < 0) {
        k = 0;
      }
      m = j;
      if (j > this.aKy.heightPixels) {
        m = this.aKy.heightPixels;
      }
      j = i;
      if (n == 0)
      {
        j = (k + m) / 2;
        k = i;
        i = j;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.MMPopupMenu", "show popMenu , xDown:%s, yDown:%s, showPointX:%s, showPointY:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(k), Integer.valueOf(i) });
      if ((!isShowing()) || (!cjg()))
      {
        bool1 = eI(k, i);
        GMTrace.o(14901254815744L, 111023);
        return bool1;
      }
      boolean bool1 = cca();
      boolean bool2 = eI(k, i);
      GMTrace.o(14901254815744L, 111023);
      return bool2 & bool1;
      i = n;
      k = j;
    }
  }
  
  public final void c(View paramView, final View.OnCreateContextMenuListener paramOnCreateContextMenuListener, p.d paramd)
  {
    GMTrace.i(14900583727104L, 111018);
    this.wrx = paramView;
    cjh();
    this.qil = paramd;
    if ((paramView instanceof AbsListView))
    {
      w.v("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView");
      ((AbsListView)paramView).setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(14904610258944L, 111048);
          h.this.qim.clear();
          w.v("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView long click");
          paramAnonymousAdapterView = new AdapterView.AdapterContextMenuInfo(paramAnonymousView, paramAnonymousInt, paramAnonymousLong);
          paramOnCreateContextMenuListener.onCreateContextMenu(h.this.qim, paramAnonymousView, paramAnonymousAdapterView);
          paramAnonymousView = h.this.qim.wdA.iterator();
          while (paramAnonymousView.hasNext()) {
            ((o)paramAnonymousView.next()).wdD = paramAnonymousAdapterView;
          }
          h.this.bz(0, 0);
          GMTrace.o(14904610258944L, 111048);
          return true;
        }
      });
      GMTrace.o(14900583727104L, 111018);
      return;
    }
    w.v("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view");
    paramView.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(14900181073920L, 111015);
        w.v("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view long click");
        h.this.qim.clear();
        h.this.wrx = paramAnonymousView;
        paramOnCreateContextMenuListener.onCreateContextMenu(h.this.qim, paramAnonymousView, null);
        if ((paramAnonymousView.getTag(a.e.cie) instanceof int[]))
        {
          paramAnonymousView = (int[])paramAnonymousView.getTag(a.e.cie);
          h.this.bz(paramAnonymousView[0], paramAnonymousView[1]);
        }
        for (;;)
        {
          GMTrace.o(14900181073920L, 111015);
          return true;
          h.this.bz(0, 0);
        }
      }
    });
    GMTrace.o(14900583727104L, 111018);
  }
  
  public final boolean cca()
  {
    GMTrace.i(14901120598016L, 111022);
    if (isShowing())
    {
      if (this.wtY != null) {
        this.wtY.dismiss();
      }
      GMTrace.o(14901120598016L, 111022);
      return true;
    }
    if (cjg())
    {
      if (this.xqC != null) {
        this.xqC.dismiss();
      }
      GMTrace.o(14901120598016L, 111022);
      return true;
    }
    GMTrace.o(14901120598016L, 111022);
    return false;
  }
  
  public void onDismiss()
  {
    GMTrace.i(14901925904384L, 111028);
    if (!this.xqE)
    {
      if (this.xqF != null)
      {
        this.xqF.setSelected(false);
        GMTrace.o(14901925904384L, 111028);
        return;
      }
      this.wrx.setSelected(false);
    }
    GMTrace.o(14901925904384L, 111028);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(14901791686656L, 111027);
    GMTrace.o(14901791686656L, 111027);
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(14901657468928L, 111026);
    GMTrace.o(14901657468928L, 111026);
    return false;
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(14903536517120L, 111040);
      GMTrace.o(14903536517120L, 111040);
    }
    
    private String iH(int paramInt)
    {
      GMTrace.i(14903804952576L, 111042);
      String str = (String)((MenuItem)h.this.qim.wdA.get(paramInt)).getTitle();
      GMTrace.o(14903804952576L, 111042);
      return str;
    }
    
    public final int getCount()
    {
      GMTrace.i(14903670734848L, 111041);
      int i = h.this.qim.size();
      GMTrace.o(14903670734848L, 111041);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(14903939170304L, 111043);
      long l = paramInt;
      GMTrace.o(14903939170304L, 111043);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(14904073388032L, 111044);
      if (paramView == null) {}
      for (paramView = (TextView)h.this.CJ.inflate(a.f.cDv, paramViewGroup, false);; paramView = (TextView)paramView)
      {
        paramViewGroup = iH(paramInt);
        paramView.setTag(paramViewGroup);
        paramView.setText(paramViewGroup);
        GMTrace.o(14904073388032L, 111044);
        return paramView;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */